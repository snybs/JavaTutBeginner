class Plant {
	
	public static final int ID = 7;
	private String name;
	
	public String getData() {
		String data = "foo" + calculateGrowthForecast();
		
		return data;
	}
	
	private int calculateGrowthForecast() {
		return 9;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}


public class App {

	public static void main(String[] args) {
		
		Plant planta = new Plant();
		planta.setName("Kalle");
		System.out.println(planta.getName());
		
		Grass weibulls = new Grass();
		weibulls.setName("Tom");
		System.out.println(weibulls.getName());
	}

}
