package br.com.generation.POO;

public class clienteMain {
	
	public static void main (String[] args) {
		
	cliente servidor = new cliente();
	
	servidor.nome = "Dayana";
	servidor.cpf = "111.222.333.44";
	servidor.nascimento = "08/10/1997";
	
	servidor.cliente();     

	}
	
}
