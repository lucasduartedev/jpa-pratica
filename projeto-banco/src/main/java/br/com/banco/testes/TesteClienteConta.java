package br.com.banco.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.banco.models.Cliente;
import br.com.banco.models.Conta;

public class TesteClienteConta {
	
	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("banco_mysql");
	private static EntityManager em = emf.createEntityManager();

	public static void main(String[] args) {

		Conta conta = new Conta();
		conta.setId(1);
		//conta.setAgencia(5487);
		//conta.setNumero(6545);
		//conta.setSaldo(480.0);
		
		Cliente cliente = new Cliente();
		cliente.setNome("Fernando Luis");
		cliente.setCpf("12312312345");
		cliente.setConta(conta);

		em.getTransaction().begin();

		//em.persist(conta);
		em.persist(cliente);

		em.getTransaction().commit();
		em.close();

	}

}
