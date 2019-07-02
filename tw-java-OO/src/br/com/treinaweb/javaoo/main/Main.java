package br.com.treinaweb.javaoo.main;

import br.com.treinaweb.javaoo.classes.Carro;
import br.com.treinaweb.javaoo.excecoes.AbastVeiculoLigadoException;
import br.com.treinaweb.javaoo.excecoes.AcelerarVeiculoLigadoException;
import br.com.treinaweb.javaoo.excecoes.ChassiInvalidoException;
import br.com.treinaweb.javaoo.excecoes.FrearVeiculoLigadoException;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args){


		try {
			//Carro corsa = new Carro();
			//corsa.setNome("corsa");
			//corsa.setMarca("GM");
			
			Carro corsa = new Carro("corsa", "GM",4);
			System.out.println("Nome: "+corsa.getNome());
			System.out.println("Marca: "+corsa.getMarca());
			corsa.setChass("ABCDe");
			System.out.println("Chassi do "+corsa.getNome()+": "+corsa.getChass());

			corsa.abastecer(10);
			corsa.ligar();
			corsa.acelerar();
			System.out.println("Velocidade: "+ corsa.getVelocidade());
			corsa.frear();
			System.out.println("Velocidade: "+ corsa.getVelocidade());
			System.out.println(corsa.isLigado());
			System.out.println("Combustivel: "+ corsa.getQuantidadeCombustivel()+"L");
			System.out.println("N� de rodas: "+corsa.getQuantidadeRodas());
			System.out.println("Quantidade de portas: "+ corsa.getQuantidadePortas());




		}catch(AbastVeiculoLigadoException e) {
			System.out.println("Erro: N�o pode abastecer com o veiculo ligado!");
		}catch(ChassiInvalidoException e) {
			System.out.println("Erro: Esse chassi n�o � valido! "+ e.getMessage());
		}catch(FrearVeiculoLigadoException e){
			System.out.println("Erro: S� � possivel frear com veiculo ligado! ");
		}catch(AcelerarVeiculoLigadoException e) {
			System.out.println("Erro: S� � possivel acelerar com o veiculo ligado!");
		}
		catch (Exception e) {
			System.out.println("Erro: "+ e.getMessage());
		}

	}

}
