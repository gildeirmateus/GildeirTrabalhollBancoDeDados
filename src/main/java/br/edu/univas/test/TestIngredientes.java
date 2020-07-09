package br.edu.univas.test;

import br.edu.univas.dao.IngredientesDao;
import br.edu.univas.modal.Ingredientes;
import br.edu.univas.modal.Pizza;

public class TestIngredientes {
	public static void main(String[] agrs) {
		 //Insert(3);//inserir id de uma pizza existente
		 //Delete(1); //inserir id dos ingredientes a serem deletados
		 //Update(2, 2);//inserir id dos ingredientes e da pizza ao qual quero atualizar
		 //Select();
	}
	 
	 public static void Insert(int x) {
		Ingredientes ing = new Ingredientes();
	    IngredientesDao ingDao = new IngredientesDao();
	    Pizza pz = new Pizza();
	    			
	    ing.setSabor("Calabresa");
	    ing.setBorda("Cheddar");
	    ing.setAdicional("Bacon");
	    pz.setPizza_id(x);
	    ing.setPizza(pz);
	    			
	    ingDao.insetIngredientes(ing);
	
	 }
	 public static void Delete(int x) {
	    IngredientesDao ingDao = new IngredientesDao();
		 
	    ingDao.deleteIngredientes(x);	 
	 }
	 
	 public static void Update(int x, int y) {
		Ingredientes ing = new Ingredientes();
	    IngredientesDao ingDao = new IngredientesDao();
	    Pizza pz = new Pizza();
	    	
		ing.setIngredientes_id(x);
	    ing.setSabor("Frango Catupiry");
	    ing.setBorda("Catupiry");
	    ing.setAdicional("Bacon");
	    pz.setPizza_id(y);
	    ing.setPizza(pz);
		ingDao.updateIngredientes(ing);
	 }
 
	 public static void Select() {
	    IngredientesDao ingDao = new IngredientesDao();
	  	
		ingDao.SelectAllIngredientes();			
	 }	 
}
