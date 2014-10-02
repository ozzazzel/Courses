 // DepOfLiterature class inherits method from Categories classs
public class DepOfLiterature extends Categories{
	// new parameter(s) for the constructor of this class
	public int NumOfCourses;
	public DepOfLiterature(String name, String BuildingName, int NumOfCourses ) {
		super(name, BuildingName);
		this.NumOfCourses = NumOfCourses;
	}
		//print() method only for this class
		public void print(){
		
		System.out.println("Department of "+ name);
		System.out.println("Building name: "+ BuildingName);
		System.out.println("Number of courses in department of "+name+":"+ NumOfCourses);
		System.out.println("-------------------------------");
		}
}


