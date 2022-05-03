package br.fiapfit.main;

import java.util.Scanner;

import br.fiapfit.atleta.Atleta;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Atleta[] lista = new Atleta[3];
		String nome;
		double altura, peso, quadril;
		
		//entrada de dados
		for (int i = 0; i < lista.length; i++) {
			System.out.println("-----------------------");
			System.out.print("Nome --> ");
			nome = teclado.nextLine();
			System.out.println("Altura (em centimetros) --> ");
			altura = teclado.nextDouble();
			System.out.println("Peso (em quilos) --> ");
			peso = teclado.nextDouble();
			System.out.println("Quadril em centimetros --> ");
			quadril = teclado.nextDouble();
			lista[i] = new Atleta(nome, altura, peso, quadril);
			teclado.nextLine();
		}
		
		//impressão de dados
		for (Atleta i : lista) {
			System.out.println(i.getNome());
			System.out.println(i.calcularIMC());
			System.out.println(i.calcularBAI());
			System.out.println();
		}
		
		//receber os Atletas, comparar altura e retornar atleta mais alto
		Atleta[] listaAltura = maior(lista);
		
		System.out.println(listaAltura);
		teclado.close();
	}

	private static Atleta[] maior(Atleta[] lista) {
		Atleta[] aux = new Atleta[lista.length];
		double altura = 0;
		
		//percorre o vetor para descobrir o valor da maior altura
		for (Atleta atleta : lista) {
			if(atleta.getAltura() > altura) {
				altura = atleta.getAltura();
			}
		}
		
		//percorre o vetor, lista e armazena os maiores atletas no aux
		int i = 0;
		for (Atleta atleta : lista) {
			if(atleta.getAltura() == altura) {
				aux[i++] = atleta;
			}
		}
		return null;
	}
	
}
