// Driver class to test the all classes
public class CoursesDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create objects and add parameters
		
												//String, String, int
		DepOfLiterature Literature = new DepOfLiterature("Literature", "CA", 2);
		DepOfScience Science = new DepOfScience("Science", "CA", 2);
														//String, String, int, String, int, String)
		DepOfLiterature English = new English("English", null, 0, "English", 111, 
					"This course is about learning to write - analyzing your purpose and audience,\n"
					+ "researching a topic and citing your sources, stating a thesis and supporting it,\n"
					+ "and following a process that leads to polished work. ");
		
		DepOfLiterature History = new History("History",null,0,"History of Western Civilization",101,
				"Examines the development of western civilization from ancient times to the present. Part I of II.\n"
				+ "Lecture 3hours per week.");
		
		DepOfScience Math = new Math("Mathematics",null,0,"Calculus with analytical geometry",2,
				"Continues the study of analytic geometry and the calculus of algebraic and \n "
				+ "transcendental functions includingrectangular,polar, and parametric graphing, \n"
				+ "indefinite and definite integrals, methods of integration, andpower series along \n "
				+ "with applications. Lecture 5 hours per week");
		
		DepOfScience Biology = new Biology ("Biology",null,0,"General Microbiology",205,"Examines morphology,\n"
				+ "genetics, physiology, ecology, and control of microorganisms. Emphasizes application of\n"
				+ "microbiological techniques to selected fields. Lecture 3 hours. Recitation and laboratory 3 hours.\n "
				+ "Total 6hours per week.");
		
		// use print() method to display output
		Literature.print();
		English.print();
		History.print();
		System.out.println("-------------------------------");
		Science.print();
		Math.print();
		Biology.print();
		
	}

}
