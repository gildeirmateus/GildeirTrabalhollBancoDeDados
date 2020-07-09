package br.edu.univas.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import br.edu.univas.modal.Ingredientes;
import br.edu.univas.utils.HibernateUtil;

public class IngredientesDao {
	
	public void insetIngredientes(Ingredientes ing) {
		EntityManager em = HibernateUtil.getEntityManager();
		em.getTransaction().begin();
		em.persist(ing);
		em.getTransaction().commit();
		System.out.println("Id gerado para os Ingredientes " + ing.getIngredientes_id());
	}
	
	public void deleteIngredientes(Integer id) {
		EntityManager em = HibernateUtil.getEntityManager();
		Ingredientes ing = em.find(Ingredientes.class, id);
		if (ing != null) {
			em.getTransaction().begin();
			em.remove(ing);
			em.getTransaction().commit();
		} else {
			System.out.println("Id_Ingredientes '"+ id +"' não encontrado");
		}
	}

	public void updateIngredientes(Ingredientes ing) {
		EntityManager em = HibernateUtil.getEntityManager();

		Ingredientes ingrediente = em.find(Ingredientes.class, ing.getIngredientes_id());
		if (ingrediente != null) {
			em.getTransaction().begin();
			em.merge(ing);
			em.getTransaction().commit();
		} else {
			System.out.println("Ingredientes " + ing.getIngredientes_id() + " não encontrados.");
		}
	}
	
	public void SelectAllIngredientes() {
		
		EntityManager em = HibernateUtil.getEntityManager();
		String ql = "select i from Ingredientes i";
		TypedQuery<Ingredientes> query = em.createQuery(ql, Ingredientes.class);
		List<Ingredientes> ing = query.getResultList();
		for (int i = 0; i < ing.size(); i++) {
			System.out.println("Ingredientes: " + ing.get(i));		

		}
	}
}
