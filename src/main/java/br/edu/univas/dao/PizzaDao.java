package br.edu.univas.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

import br.edu.univas.modal.Pizza;
import br.edu.univas.utils.HibernateUtil;

public class PizzaDao {

	public void insertPizza(Pizza pz) {
		EntityManager em = HibernateUtil.getEntityManager();
		em.getTransaction().begin();
		em.persist(pz);
		em.getTransaction().commit();
		System.out.println("Id gerado para a Pizza : " + pz.getPizza_id());
	}

	public void deletePizza(Integer id) {
		EntityManager em = HibernateUtil.getEntityManager();
		Pizza pz = em.find(Pizza.class, id);
		if (pz != null) {
			em.getTransaction().begin();
			em.remove(pz);
			em.getTransaction().commit();
		} else {
			System.out.println("Pizza " + id + " não encontrada.");
		}
	}

	public void updatePizza(Pizza pz) {
		EntityManager em = HibernateUtil.getEntityManager();

		Pizza pizza = em.find(Pizza.class, pz.getPizza_id());
		if (pizza != null) {
			em.getTransaction().begin();
			em.merge(pz);
			em.getTransaction().commit();
		} else {
			System.out.println("Pizza " + pz.getPizza_id() + " não encontrado.");
		}
	}

	public void selectAllPizza() {
		EntityManager em = HibernateUtil.getEntityManager();
		String ql = "select p from Pizza p";
		TypedQuery<Pizza> query = em.createQuery(ql, Pizza.class);
		List<Pizza> pz = query.getResultList();
		for (int i = 0; i < pz.size(); i++) {
			System.out.println("Pizza: " + pz.get(i));
		}
	}
}
