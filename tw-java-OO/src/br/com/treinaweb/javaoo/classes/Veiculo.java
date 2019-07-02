package br.com.treinaweb.javaoo.classes;

import br.com.treinaweb.javaoo.excecoes.AbastVeiculoLigadoException;
import br.com.treinaweb.javaoo.excecoes.AcelerarVeiculoLigadoException;
import br.com.treinaweb.javaoo.excecoes.ChassiInvalidoException;
import br.com.treinaweb.javaoo.excecoes.FrearVeiculoLigadoException;
//classes abstract não podem ser istanciadas,pode ser herdada!...
abstract class Veiculo {

	private String nome;
	private String marca;
	private String chass;
	protected int quantidadeRodas;
	private float quantidadeCombustivel;

	//share in subclass
	protected Boolean ligado;
	protected float velocidade;

	public Veiculo() {
		this.ligado = false;
		this.velocidade = 0;
	}
	//@geters and seters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getChass() {
		return chass;
	}

	public void setChass(String chass) throws ChassiInvalidoException {
		if(chass.length() == 5) {
			this.chass = chass;
		}else {
			throw new ChassiInvalidoException(chass);
		}

	}

	public int getQuantidadeRodas() {
		return quantidadeRodas;
	}

	public float getQuantidadeCombustivel() {
		return quantidadeCombustivel;
	}

	public Boolean isLigado() {
		return ligado;

	}

	public float getVelocidade() {
		return velocidade;
	}

	//fim geters and seters


	public void ligar() {
		this.velocidade = 0;
		this.ligado = true;
		System.out.println("Veiculo ligado!");
	}

	public void desligar() {
		this.velocidade = 0;
		this.ligado = false; 
		System.out.println("Veiculo desligado!");
	}
	//final, uma palavra chave, significa que esse metodo não pode ser subrescrito!
	public final void abastecer(float litros) throws AbastVeiculoLigadoException{
		if(!this.ligado) {
			quantidadeCombustivel += litros;
		}else {
			throw new AbastVeiculoLigadoException();
		}

	}

	public void acelerar() throws AcelerarVeiculoLigadoException{
		if(this.ligado) {
			this.velocidade += 10;
		}else {
			throw new AcelerarVeiculoLigadoException();
		}
	}

	public void frear() throws FrearVeiculoLigadoException{
		if(this.ligado) {
			this.velocidade -= 10;
		}else {
			throw new FrearVeiculoLigadoException();
		}
	}
	//o metodo abstrato nos informa que toda subclass deve utilizar esse metodo.
	public abstract void preparar();
}
