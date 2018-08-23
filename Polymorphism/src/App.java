
public class App {

	public static void main(String[] args) {
		Plant plant1 = new Plant();
		
		Tree tree = new Tree();
		
		//polymorphism in action
		Plant plant2 = tree;
		
		plant2.grow();
		
		tree.shedLeaves();
		
		Plant plant3 = new Plant();
		
		plant3.grow();
		
		//wont work. its the type that decides available methods.
		//plant2.shedLeaves();
		
		doGrow(tree);

	}
	
	public static void doGrow(Plant plant) {
		plant.grow();
	}

}
