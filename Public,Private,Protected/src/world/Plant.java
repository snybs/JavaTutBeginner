package world;

public class Plant {
	//bad practice below. instead incapsulate them to control whats accessable from outside.
	public String name;
	
	//Acceptable practice. finals are OK.
	public final static int ID = 5;
	
	private String type;
	
	protected String size;
	
	//
	int height;
	
	public Plant(){
		this.name = "Tom";
		this.type = "Plant";
		this.size = "medium";
		this.height = 3;
	}

}
