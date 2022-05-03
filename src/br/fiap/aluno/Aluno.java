package br.fiap.aluno;
import br.fiap.email.Email;

public class Aluno {
	private long rm;
	private String nome;
	private Email email;
	
	public Aluno(long rm, String nome, String login, String senha) {
		this.rm = rm;
		this.nome = nome;
		email = new Email(login, senha);
	}
	
	//get = apenas consultar o que está armazenado na variavel
	//set = alterar o que está armazenado na variável
	
	public long getRm() {
		return rm;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public Email getEmail() {
		return email;
	}
}
