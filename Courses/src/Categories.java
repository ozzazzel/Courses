/** 
 * * @author Oscar
 *  Create Categories class as superclass
 *  
 *  Inherit method of Categories class to DepOfLiterature and DepOfScience
 *  Categories class only has name and building name in its contructor
 *  In DepOFLiterature, add another parameter to the constructor: numberofCourses
 	create new classes (English, History) that extend DepOfLiterature: 
 	English and History classes inherit constructor and add new parameters (title, number and description)
 *  in DepOFScience, add another parameter to the constructor: numberofCourses
 	create new classes (Math, Biology) that extend DepOfScience: 
 	Math and Biology classes inherit constructor and add new parameters (title, number and description)

 *  Create own print() method for each class
 *  Create DepofLiterature and DepOfScience objects or class objects since they are subclasses\
    and add corresponding parameters.
 *  Use print() methods.

 * Pseudo code 
class Categories { String name ,string buildingName{} }
class  DepOfLiterature extends Categories{ super() public int numOfCourses{} }
class  English/History extends Categories{super() public String title, public int number, public String description}
class  DepOfScience extends Categories{ super() public int numOfCourses{} }
class  Math/Biology extends Categories{super() public String title, public int number, public String description}
}
public class MainDriver {
 public static void main(String[] a) {
 	DepOfLiterature Literature = new DepOfLiterature("Literature", "CA", 2);
	DepOfScience Science = new DepOfScience("Science", "CA", 2);
	
  	DepOfLiterature English = new English()
  	DepOfLiterature History = new History(
  	DepOfScience Math = new Math()
  	DepOfScience Biology = new Biology()
  }
}
 */
//base class
public class Categories {
	// create parameters for the constructor
public String name;
public String BuildingName;
// constructor
public Categories(String name, String BuildingName) {
	super();
	//setting parameters for the constructor
	this.name = name;
	this.BuildingName = BuildingName;
}


}
