package br.com.banco.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.banco.models.Cliente;

public class TesteCliente {
	
	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("banco_mysql");
	private static EntityManager em = emf.createEntityManager();

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		cliente.setNome("Fernando Luis");
		cliente.setCpf("45845845822");
		
		em.getTransaction().begin();
		
		em.persist(cliente);
		
		em.getTransaction().commit();
		em.close();

	}

}
