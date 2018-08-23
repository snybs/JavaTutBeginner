import world.Plant;

public class Grass extends Plant{
	public Grass() {
		//This wont work. Grass not in same package as plant even though its a subclass to Plant.
		//System.out.println(this.height);
	}

}
