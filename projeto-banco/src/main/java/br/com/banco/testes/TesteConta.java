package br.com.banco.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.banco.models.Conta;

public class TesteConta {

	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("banco_mysql");
	private static EntityManager em = emf.createEntityManager();
	
	public static void main(String[] args) {
		
		Conta conta = new Conta();
		conta.setAgencia(1234);
		conta.setNumero(4321);
		conta.setSaldo(550.50);
		
		em.getTransaction().begin();
		
		em.persist(conta);
		
		em.getTransaction().commit();
		em.close();

	}

}
