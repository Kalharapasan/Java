import java.util.Scanner;
public class Days {
    public static void main(String[] args) {
        Scanner year = new Scanner(System.in);
        Scanner month = new Scanner(System.in);

        System.out.println("Enter Your Year:");
        int y = year.nextInt();
        if (y % 4==0) {
            if (y % 100==0) {
                if (y % 400==0) {
                    System.out.println("Enter The Month:");
                    int num = month.nextInt();
                    switch (num) {
                        case 1:
			    System.out.println(" January has 31Days..");
                            break;
 			case 2:
                            System.out.println("February has 29Days");
                            break;
                        case 3:
			    System.out.println("March has 31Days..");
                            break;
			case 4:
                            System.out.println("April has 30Days");
                            break;
                        case 5:
			    System.out.println("May has 31Days..");
                            break;
 			case 6:
  			    System.out.println("June has 30Days");
                            break;
                        case 7:
			    System.out.println("July has 31Days..");
                            break;
                        case 8:
			    System.out.println("August has 31Days..");
                            break;
                        case 9:
  			    System.out.println("September has 30Days");
                            break;
                        case 10:
			    System.out.println("October has 31Days..");
                            break;
			case 11:
                            System.out.println("November has 30Days");
                            break;
                        case 12:
                            System.out.println("December has 31Days..");
                            break;
                        default:
                            System.out.println("This is Invalid Month");
                    }
                } else {
                    System.out.println("February has 29Days");
		  }
               } else
		    System.out.println("February has 29Days"); 
	     }
        } else {
            System.out.println("Enter The Month:");
            int num = month.nextInt();
            switch (num) {
                        case 1:
			    System.out.println(" January has 31Days..");
                            break;
 			case 2:
                            System.out.println("February has 28Days");
                            break;
                        case 3:
			    System.out.println("March has 31Days..");
                            break;
			case 4:
                            System.out.println("April has 30Days");
                            break;
                        case 5:
			    System.out.println("May has 31Days..");
                            break;
 			case 6:
  			    System.out.println("June has 30Days");
                            break;
                        case 7:
			    System.out.println("July has 31Days..");
                            break;
                        case 8:
			    System.out.println("August has 31Days..");
                            break;
                        case 9:
  			    System.out.println("September has 30Days");
                            break;
                        case 10:
			    System.out.println("October has 31Days..");
                            break;
			case 11:
                            System.out.println("November has 30Days");
                            break;
                        case 12:
                            System.out.println("December has 31Days..");
                            break;
                        default:
                            System.out.println("This is Invalid Month");
            }
        }
    }
}
