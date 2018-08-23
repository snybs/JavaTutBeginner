package world;

public class Oak extends Plant{
	public Oak() {
		//Wont work, type is private.
		//type = "tree"
		
		//this works --size is protected because Oak is subclass to Plant. Works also if its in same package.
		this.size = "large";
		
		//No access specifier, since Oak and Plant is in same package.
		this.height = 10;
	}

}
