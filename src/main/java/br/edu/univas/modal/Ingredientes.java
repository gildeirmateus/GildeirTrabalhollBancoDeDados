package br.edu.univas.modal;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="ingredientes")
public class Ingredientes implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ingredientes_id")
	private Integer ingredientes_id;
	
	@Column(name="sabor")
	private String sabor;
	
	@Column(name="borda")
	private String borda;
	
	@Column(name="adicional")
	private String adicional;
	
	@ManyToOne
	@JoinColumn(name = "pizza_id")
	private Pizza pizza;
	
	public Ingredientes() {	
		
	}

	
	
	public Integer getIngredientes_id() {
		return ingredientes_id;
	}

	public void setIngredientes_id(Integer ingredientes_id) {
		this.ingredientes_id = ingredientes_id;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public String getBorda() {
		return borda;
	}

	public void setBorda(String borda) {
		this.borda = borda;
	}


	public String getAdicional() {
		return adicional;
	}


	public void setAdicional(String adicional) {
		this.adicional = adicional;
	}


	public Pizza getPizza() {
		return pizza;
	}


	public void setPizza(Pizza pizza) {
		this.pizza = pizza;
	}
	
	@Override
	public String toString() {
		return "Ingredientes [Id_ingredientes=(" + ingredientes_id + "), Sabor=(" + sabor + "), Borda=(" + borda + "), Adicional=(" + adicional + "), Id_pizza=(" + pizza +")]";
	}
}