package br.fiap.email;

public class Email {
	private String login;
	private String senha; 
	
	public Email(String login, String senha) {
		this.login = login;
		this.senha = senha;
	}
	
	//get = apenas consultar o que está armazenado na variavel
	//set = alterar o que está armazenado na variável

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
}
