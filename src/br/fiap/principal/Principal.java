package br.fiap.principal;
import java.util.Scanner;
import br.fiap.aluno.Aluno;

public class Principal {

	public static void main(String[] args) {
		Aluno aluno = new Aluno(1000,"Selmini", "selmini", "selmini");
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("RM: "+aluno.getRm());
		System.out.println("Nome: "+aluno.getNome());
		System.out.println("Insira o nome: ");
		aluno.setNome(teclado.next());
		System.out.println("Nome: "+aluno.getNome());
		
		//get = apenas consultar o que está armazenado na variavel
		//set = alterar o que está armazenado na variável
		
		teclado.close();
	}

}
