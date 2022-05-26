public class Main {
	public static void main(String[] args) throws InterruptedException {
		AtendimentoController controller = new AtendimentoController();
		Cliente cliente1 = new Cliente(controller);
		Cliente cliente2 = new Cliente(controller);
		Cliente cliente3 = new Cliente(controller);
		Cliente cliente4 = new Cliente(controller);
		Cliente cliente5 = new Cliente(controller);
		Cliente cliente6 = new Cliente(controller);
		Cliente cliente7 = new Cliente(controller);
		Cliente cliente8 = new Cliente(controller);
		Cliente cliente9 = new Cliente(controller);
		Cliente cliente10 = new Cliente(controller);
		Cliente cliente11 = new Cliente(controller);
		Cliente cliente12 = new Cliente(controller);
		Cliente cliente13 = new Cliente(controller);
		Cliente cliente14 = new Cliente(controller);
		Cliente cliente15 = new Cliente(controller);
		
		
		cliente1.start();
		cliente2.start();
		cliente3.start();
		cliente4.start();
		cliente5.start();
		cliente6.start();
		cliente7.start();
		cliente8.start();
		cliente9.start();
		cliente10.start();
		cliente11.start();
		cliente12.start();
		cliente13.start();
		cliente14.start();
		cliente15.start();
		cliente1.join();
		cliente2.join();
		cliente3.join();
		cliente4.join();
		cliente5.join();
		cliente6.join();
		cliente7.join();
		cliente8.join();
		cliente9.join();
		cliente10.join();
		cliente11.join();
		cliente12.join();
		cliente13.join();
		cliente14.join();
		cliente15.join();
	}
}
