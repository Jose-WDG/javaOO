package br.com.treinaweb.javaoo.classes;

public class Moto extends Veiculo{
	
	//@construtor
	public Moto(String nome, String marca) {
		this.quantidadeRodas = 2;
		this.setNome(nome);
		this.setMarca(marca);
		
	}

	@Override
	public void preparar() {
		// TODO Auto-generated method stub
		System.out.println("Coloque o capacete.");
	}
}
