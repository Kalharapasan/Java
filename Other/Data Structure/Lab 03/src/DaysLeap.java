import java.util.Scanner;
public class DaysLeap {
    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);
        System.out.println("Enter the Year:");
        int y = userIn.nextInt();

        System.out.println("Enter The Month:");
        int num = userIn.nextInt();

        checkMonth(num, y);
    }

    static boolean LeapYear(int y) {
        if (y % 4 == 0) {
            if (y % 100 == 0) {
                if (y % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    static void checkMonth(int num, int year) {
        switch (num) {
            case 1: {
                System.out.println(year +",January has 31Days..");
                break;
            }
            case 2: {
                if (LeapYear(year) == true) {
                    System.out.println(year +",February has 29Days..");
                    break;
                } else {
                    System.out.println(year +",February has 28Days..");
                    break;
                }
            }
            case 3: {
                System.out.println(year +",March has 31Days..");
                break;
            }
            case 4: {
                System.out.println(year +",April has 30Days");
                break;
            }
            case 5: {
                System.out.println(year +",May has 31Days..");
                break;
            }
            case 6: {
                System.out.println(year +",June has 30Days");
                break;
            }
            case 7: {
                System.out.println(year +",July has 31Days..");
                break;
            }
            case 8: {
                System.out.println(year +",August has 31Days..");
                break;
            }
            case 9: {
                System.out.println(year +",September has 30Days");
                break;
            }
            case 10: {
                System.out.println(year +",October has 31Days..");
                break;
            }
            case 11: {
                System.out.println(year +",November has 30Days");
                break;
            }
            case 12: {
                System.out.println(year +",December has 31Days..");
                break;
            }
            default: {
                System.out.println("This is Invalid Month");
            }
        }
    }
}

