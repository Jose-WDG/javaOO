package br.com.treinaweb.javaoo.excecoes;

public class AcelerarVeiculoLigadoException extends Exception{


	private static final long serialVersionUID = -1881370171993111448L;
	
	public AcelerarVeiculoLigadoException() {
		System.out.println("O veiculo est� desligado, n�o � possivel acelerar!");
	}
}
