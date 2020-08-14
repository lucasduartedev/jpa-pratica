package br.com.banco.testes;

import br.com.banco.DAOS.ClienteDAO;
import br.com.banco.models.Cliente;

public class TesteClienteDAO {

	public static void main(String[] args) {
		
		ClienteDAO clienteDAO = new ClienteDAO();
		
		Cliente cliente = clienteDAO.obterPorId(4);
		
		System.out.println(cliente.getNome());
		
	}

}
