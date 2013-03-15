// In order to use packages you need to import them as such... 

// Packages allow you to distrubute your work as packages to other devs with little conflict
// Worldwide unique pacakge names, reverse the name of your website eg com.caveofprograming.oceangame
// this is why you will see complex page names containing orgs and coms and other domain prefixes
import ocean.Fish;
import ocean.plant.Seaweed;

// packages map to folders, but instead of using '/' as you would with folders
// Java uses '.' syntax

public class App {

	public static void main(String[] args) {
		
		Fish fish = new Fish();
		// using IDE ctr space will auto complete and add the import statement
		Seaweed weed = new Seaweed();
		
		
	}
	
}
