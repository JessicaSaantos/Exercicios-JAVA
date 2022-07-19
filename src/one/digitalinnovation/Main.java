package one.digitalinnovation;

public class Main {

	public static void main(String[] args) {
		// Calculadora
		System.out.println("Exercício calculadora");
		Calculadora.soma(25, 24);
		Calculadora.subtracao(14, 2.8);
		Calculadora.multiplicacao(7, 4);
		Calculadora.divisao(12, 2.5);
		
		// Mensagem
		System.out.println("Exercício mensagem");
		Mensagem.obterMensagem(9);
		Mensagem.obterMensagem(15);
		Mensagem.obterMensagem(23);

		// Empréstimo
		System.out.println("Exercício empréstimo");
		Emprestimo.calcular(1000 , Emprestimo.getDuasParcelas());
		Emprestimo.calcular(1000 , Emprestimo.getTresParcelas());
		Emprestimo.calcular(1000 , 4);

		// Quadrilátero
		System.out.println("Exercício Quadrilátero");
		Quadrilatero.area(3);
		Quadrilatero.area(4, 4);
		Quadrilatero.area(7, 8, 12);
	}

}
