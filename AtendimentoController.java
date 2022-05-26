import java.util.concurrent.Semaphore;

public class AtendimentoController {

	private Semaphore semAtendimentos;
	
	public AtendimentoController() {
		this.semAtendimentos = new Semaphore(5);
	}

	public void solicitarAtendimento(Cliente c) throws InterruptedException {
		Thread.sleep((long)(Math.random()*500));
		try {	
			System.out.println("Cliente "+c.getId()+" solicitando atendimento...");
			semAtendimentos.acquire();
		}	catch (InterruptedException e) {
			System.out.println("InterruptedException caught");
		}
		
		System.out.println("Cliente "+c.getId()+" em atendimento...");
		
		Thread.sleep((long)(Math.random()*5000));
		
		semAtendimentos.release();
		System.out.println("Cliente "+c.getId()+" atendido...");
	}

}
