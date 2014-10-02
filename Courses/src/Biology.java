// English class inherits constructor from DepOfScience Class
public class Biology extends DepOfScience {
	//new parameters for the constructor of this class
	public String title;
	public int number;
	public String description;
	public Biology (String name, String BuildingName, int NumOfCourses,String title, int number, String description) {
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
