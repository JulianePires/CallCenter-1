public class Cliente extends Thread {
	private AtendimentoController atendimento;

	public Cliente(AtendimentoController atendimento) {
		this.atendimento = atendimento;
	}
	
	
	@Override
	public void run() {
		while(true) {
			try {
				this.atendimento.solicitarAtendimento(this);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}
