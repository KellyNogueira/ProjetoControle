package com.projetoControle.encapsulamento;

public class ControleRemoto implements Controlador{
	
	private int volume;
	private boolean ligado;
	private boolean tocando;
	
	public ControleRemoto() {
		
		this.volume = 50;
		this.ligado = true;
		this.tocando = false;
		
	}
	
	private void setVolume(int v) {
		this.volume = v;
	}
	
	private int getVolume() {
		return volume;
	}
	
	private void setLigado(boolean l) {
		this.ligado = l;
	}
	
	private boolean getLigado() {
		return ligado;
	}
	
	private void setTocando(boolean t) {
		this.tocando = t;
	}
	
	private boolean getTocando() {
		return tocando;
	}

	@Override
	public void ligar() {
		this.setLigado(true);
		
	}

	@Override
	public void desligar() {
		this.setLigado(false);
		
	}

	@Override
	public void abrirMenu() {
		System.out.println("----------MENU----------");
		System.out.println("Está ligado? " +this.getLigado());
		System.out.println("Está tocando? " +this.getTocando());
		System.out.print("Volume: " +this.getVolume());
		
		for(int i = 0; i <= this.getVolume(); i+=10) {
			System.out.println(" |");
		}
		
		
	}

	@Override
	public void fecharMenu() {
		System.out.println("Fechando menu...");
		
		
	}

	@Override
	public void maisVolume() {
		if(this.getLigado()) {
			this.setVolume(this.getVolume() + 1);
		}
		
	}

	@Override
	public void menosVolume() {
		if(this.getLigado()) {
			this.setVolume(this.getVolume() - 5);
		}
		
	}

	@Override
	public void ligarMudo() {
		if(this.getLigado() && this.getVolume() > 0) {
			this.setVolume(0);
		}
		
	}

	@Override
	public void desligarMudo() {
		if(this.getLigado() && this.getVolume() == 0) {
			this.setVolume(50);
		}
	}

	@Override
	public void play() {
		if(this.getLigado() && !(this.getTocando())) {
			this.setTocando(true);
		}
		
		
	}

	@Override
	public void pause() {
		if(this.getLigado() && this.getTocando()) {
			this.setTocando(false);
		}
		
		
	}
	
	
	

}
