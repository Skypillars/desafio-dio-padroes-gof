package one.digitalinnovation.gof;

import one.digitalinnovation.gof.facade.Facade;
import one.digitalinnovation.gof.singleton.SingletonEager;
import one.digitalinnovation.gof.singleton.SingletonLazy;
import one.digitalinnovation.gof.singleton.SingletonLazyHolder;
import one.digitalinnovation.gof.strategy.Comportamento;
import one.digitalinnovation.gof.strategy.ComportamentoDefensivo;
import one.digitalinnovation.gof.strategy.ComportamentoNormal;
import one.digitalinnovation.gof.strategy.ComportamentoOfensivo;
import one.digitalinnovation.gof.strategy.Robo;

public class Teste {

	public static void main(String[] args) {
		
		//testes Singleton
		
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		
		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		eager = SingletonEager.getInstancia();
		System.out.println(eager);
		
		SingletonLazyHolder lHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lHolder);
		lHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lHolder);
		
		//testes Strategy
		
		Comportamento normal = new ComportamentoNormal();
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento ofensivo = new ComportamentoOfensivo();
		
		Robo robo = new Robo();
		robo.setcomportamento(normal);
		
		robo.mover();
		robo.mover();
		robo.setcomportamento(ofensivo);
		robo.mover();
		robo.setcomportamento(defensivo);
		robo.mover();
		
		Facade facade = new Facade();
		facade.migrarCliente("Paulo", "01036-100");
	}

}
