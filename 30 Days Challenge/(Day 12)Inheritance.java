import java.util.*;

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}
	 
}

class Student extends Person{
	private int[] testScores;


    public Student(String firstName, String lastName, int id,int[] testScores){
        super(firstName,lastName,id);
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = id;
        this.testScores = testScores;
    }

    public char calculate(){
       
        int total=0;
        int average;
       
        for (int i=0 ; i < testScores.length ; i++) total = total + testScores[i];
        average = total / testScores.length;
        return(average> 89 ?'O': average>79 ? 'E' : average > 69 ? 'A' : average > 54 ? 'P' :average > 39 ? 'D' : 'T' );
        
        
       
    }
}

class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();
		
		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate() );
	}
}