package br.com.treinaweb.javaoo.classes;

import br.com.treinaweb.javaoo.excecoes.AcelerarVeiculoLigadoException;

public final class Carro extends Veiculo{
	
	private int quantidadePortas;
	
	public Carro(String nome, String marca, int quantidadePortas) {
		this.quantidadeRodas = 4;
		this.setNome(nome);
		this.setMarca(marca);
		this.setQuantidadePortas(quantidadePortas);
	}

	public int getQuantidadePortas() {
		return quantidadePortas;
	}

	public void setQuantidadePortas(int quantidadePortas) {
		this.quantidadePortas = quantidadePortas;
	}
	
	//Sobrescrita
	//@um dos pilares da orientação a objetos
	
	@Override //@override é uma anotação: http://www.caelum.com.br/apostila-java-testes-xml-design-patterns/reflection-e-annotations/#9-7-exercicios-argentumtablemodel 
	public void acelerar() throws AcelerarVeiculoLigadoException{
		if(this.ligado) {
			this.velocidade += 10;
		}else {
			throw new AcelerarVeiculoLigadoException();
		}
	}

	@Override
	public void preparar() {
		System.out.println("Coloque o cinto de segurança.");
		
		
	}
	
}
