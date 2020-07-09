package br.edu.univas.test;

import java.util.Date;

import br.edu.univas.dao.PizzaDao;
import br.edu.univas.modal.Pizza;


public class testPizza {

    public static void main(String[] agrs) {
    	//Insert();
    	//Delete(4);//inserir id da pizza que quero excluir
    	Update(2);//inserir id da pizza que quero atualizar
    	//SelectAll();
    }
     	
	public static void Insert() {
		Pizza pz = new Pizza();
		PizzaDao pzDao = new PizzaDao();

		pz.setNomeCliente("Gildeir Mateus");
		pz.setEndereco("Heliodora-MG");
		pz.setQuantidade(1);
		pz.setDataPedido(new Date());
		pzDao.insertPizza(pz); 	
	}  
	
	public static void Delete(int x) {
		PizzaDao pzDao = new PizzaDao();
		
		pzDao.deletePizza(x);
	}
	
	public static void Update(int x) {
		Pizza pz = new Pizza();
		PizzaDao pzDao = new PizzaDao();
		
		pz.setPizza_id(x);
		pz.setNomeCliente("Gil");
		pz.setEndereco("P.A");
		pz.setQuantidade(5);
		pz.setDataPedido(new Date());
		pzDao.updatePizza(pz);
		
	}
	
	public static void SelectAll() {
		PizzaDao pzDao = new PizzaDao();
		
		pzDao.selectAllPizza();	
	}
	
}