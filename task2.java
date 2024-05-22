import java.util.Scanner;
public class task2{

    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter Your Hindi Marks:-"); 
    int n=sc.nextInt();   
    System.out.println("Enter Your English Marks:-"); 
    int n1=sc.nextInt();   
    System.out.println("Enter Your Science Marks:-"); 
    int n2=sc.nextInt();   
    System.out.println("Enter Your SST Marks:-"); 
    int n3=sc.nextInt();   
    System.out.println("Enter Your Information Technology Marks:-"); 
    int n4=sc.nextInt(); 
    int result=n+n1+n2+n3+n4;
    System.out.println("Students has achieved Total Marks");
    System.out.println(result); 
    System.out.println("Avereage percentage of the Student");
    double percentage=(n+n1+n2+n3+n4)/500.0*100;
    System.out.println(percentage + "%");
    if (percentage >= 90) {
        System.out.println("Grade:- A");
    } else if (percentage >= 80) {
        System.out.println("Grade:- B");
    } else if (percentage >= 70) {
        System.out.println("Grade:- C");
    } else if (percentage >= 60) {
        System.out.println("Grade:- D");
    } else if (percentage >= 50) {
        System.out.println("Grade:- E");
    } else {
        System.out.println("Grade:- F");
    }
   
    }
}