// Where ever a parent class is expected, a child class will work just as well

public class App {

	public static void main(String[] args) {
		Plant plant1 = new Plant();
		Tree tree1 = new Tree();
		
		// Reference to var containing object
		Plant plant2 = tree1;
		// Its not the type of the var, but the type of object
		plant2.grow();
		
		tree1.shedLeaves();
		// This wont work, as plant var doesnt have shedLeaves method
		// plant2.shedLeaves();
		
		doGrow(tree1);
	}
	
	
	// Takes arguement of the plant type
	public static void doGrow(Plant plant) {
		plant.grow();
	}
}
