import java.text.DecimalFormat;


public class ShowStudent {

	public static void main(String[] args) {
		Student studentX = new Student ("234",47,15);
		
		studentX.showId();
		studentX.showCredit();;
		studentX.showPoints();
		
		DecimalFormat gpa = new DecimalFormat("0.##");
		System.out.println("The grade point average is: " + gpa.format(studentX.calcGpa()));
	
	}

}
