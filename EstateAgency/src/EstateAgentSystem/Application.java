package EstateAgentSystem;

public class Application {
	
	public static void main(String[] args) {
		
		Agent test = new Agent();
		test.createAgent();
		
		Commission c = new Commission();
		//c.setRate(7.6f);
		
		System.out.println(c.getRate());
		
			
	}

}
