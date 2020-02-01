package inicio_logica_games;

import java.util.ArrayList;

public class Game implements Runnable{
	
	private boolean isRunning;
	private Thread thread;
	
	private ArrayList<Entidade> entidades = new ArrayList<Entidade>();
	
	public Game() {
		entidades.add(new Entidade());
		
		
	}
	
	public static void main(String[] args ) {
		Game game = new Game();
		game.start();
	}
	
	public synchronized void start() {
		isRunning = true;
		thread = new Thread(this);
		thread.start();
	}
	
	public void tick() {
		//atualizar o jogo
		System.out.println("Tick");
		
	}
	
	public void render() {
		//renderizar o jogo
		System.out.println("Render");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(isRunning) {
			tick();
			render();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	} 
}
