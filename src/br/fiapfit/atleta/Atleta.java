package br.fiapfit.atleta;

public class Atleta {
	//atributos do atleta
	private String nome;
	private double peso;
	private double altura;
	private double quadril;
	
	
	//inicializar os atributos do atleta
	public Atleta(String nome, double peso, double altura, double quadril) {
		this.nome = nome;
		this.peso = peso;
		this.altura = altura;
		this.quadril = quadril;
	}
	
	
	//método para calcular e retornar o IMC do atleta
	public double calcularIMC() {
		double imc = this.peso/Math.pow(this.altura, 2);
		return imc;
	}		
	//método para calcular e retornar o BAI do atleta
	public double calcularBAI() {
		double bai;
		bai = this.quadril/(this.altura*Math.sqrt(this.altura))-18;
		return bai;
	}
		
		
	//consultar nome
	public String getNome() {
		return nome;
	}
	//alterar nome
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	//consultar peso
	public double getPeso() {
		return peso;
	}
	//alterar peso
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	
	//consultar altura
	public double getAltura() {
		return altura;
	}
	//alterar altura
	public void setAltura(double altura) {
		this.altura = altura;
	}
	

	//consultar tamanho do quadril
	public double getQuadril() {
		return quadril;
	}
	//alterar tamanho do quadril
	public void setQuadril(double quadril) {
		this.quadril = quadril;
	}
	
}
