package br.edu.univas.modal;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="pizza")
public class Pizza implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "pizza_id")
	private Integer pizza_id;
	
	@Column(name="nomeCliente")
	private String nomeCliente;
	
	@Column(name="endereco")
	private String endereco;
	
	@Column(name="quantidade")
	private int quantidade;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataPedido;	
	
	public Pizza() {	
		
	}
	

	public Integer getPizza_id() {
		return pizza_id;
	}


	public void setPizza_id(Integer pizza_id) {
		this.pizza_id = pizza_id;
	}


	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Date getDataPedido() {
		return dataPedido;
	}

	public void setDataPedido(Date horárioPedido) {
		this.dataPedido = horárioPedido;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	@Override
	public String toString() {
		return "// Pizza [Id_Pizza=(" + pizza_id + "), Nome=(" + nomeCliente + "), Endereço=(" + endereco + "), Data= (" + dataPedido + "), Quantidade= (" + quantidade + ")]";
	}
}
