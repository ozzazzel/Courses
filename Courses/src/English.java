// English class inherits constructor from DepOfLiterature Class
public class English extends DepOfLiterature{
	// new parameter(s) for the constructor of this class
	public String title;
	public int number;
	public String description;
	//new constructor fo this class
	public English(String name, String BuildingName, int NumOfCourses,String title, int number, String description) {
		super(name, BuildingName, NumOfCourses);
		// TODO Auto-generated constructor stub
		this.title = title;
		this.number = number;
		this.description = description;
	}
	//print() method only for this class
	public void print(){
		
		System.out.println("Course: "+ title);
		System.out.println("Course number: "+ number);
		System.out.println("Description of the course: \n"+ description);
		System.out.println("-------------------------------");
		}
}


