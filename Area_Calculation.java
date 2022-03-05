package Task;

/**
 * @author Mazin
 */
import java.util.Scanner;

public class Area_Calculation {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Choose your Shape");
        System.out.println("=====================");
        System.out.println("For Square press 1");
        System.out.println("For Rectangle press 2");
        System.out.println("For Triangle press 3");
        System.out.println("For Circle press 4");
        System.out.println("=====================");
        int num = scan.nextInt();

        double result, area;
        switch (num) {
            case 1:{
                System.out.println("----Square----");
                System.out.println("Area (1) or Perimeter (2)");
                int num2 = scan.nextInt();
                switch (num2) {
                    case 1:
                        System.out.println("Pleas Enter the Length");
                        double a = scan.nextDouble();
                        result = a * a;
                        System.out.println("Square Area =" + result);
                        break;
                    case 2:
                        System.out.println("Pleas Enter the Length");
                        double x = scan.nextDouble();
                        result = x * 4;
                        System.out.println("Square Perimeter =" + result);
                        break;
                }
                break;
        }

            case 2:{
                System.out.println("----Rectangle----");
                System.out.println("Area (1) or Perimeter (2)");
                int num3 = scan.nextInt();
                switch (num3) {
                    case 1:
                        System.out.println("Pleas Enter the Length");
                        double Length = scan.nextDouble();
                        System.out.println("Pleas Enter the width");
                        double width = scan.nextDouble();
                        result = Length * width;
                        System.out.println("Rectangle Area =" + result);

                    case 2:
                        System.out.println("Pleas Enter the Length");
                        double x = scan.nextDouble();
                        System.out.println("Pleas Enter the width");
                        double y = scan.nextDouble();
                        result = 2 * (x + y);
                        System.out.println("Rectangle Perimeter =" + result);
                        break;
                }
                break;
            }

            case 3:{
                System.out.println("----Triangle----");
                System.out.println("Area (1) or Perimeter (2)");
                int num4 = scan.nextInt();

                switch (num4) {
                    case 1:

                        System.out.println("Pleas Enter the Length");

                        double Length1 = scan.nextDouble();
                        System.out.println("Pleas Enter the width");
                        double width1 = scan.nextDouble();
                        result = 0.5 * Length1 * width1;
                        System.out.println("Triangle Area =" + result);
                        break;
                    case 2:
                        System.out.println("Pleas Enter the Length");
                        double x = scan.nextDouble();
                        System.out.println("Pleas Enter the width");
                        double y = scan.nextDouble();
                        System.out.println("Pleas Enter the Height");
                        double z = scan.nextDouble();
                        result = x + y + z;
                        System.out.println("Triangle Perimeter =" + result);
                        break;
                }
                break;
            }

            case 4: {
                System.out.println("----Circle----");
                System.out.println("Area (1) or Perimeter (2)");
                int num6 = scan.nextInt();

                switch (num6) {
                    case 1:
                        System.out.println("Pleas Enter the radius");
                        double r = scan.nextDouble();
                        result = 3.14159 * r * r;
                        System.out.println("Triangle Area =" + result);
                        break;

                    case 2:
                        System.out.println("Pleas Enter the radius");
                        double ru = scan.nextDouble();
                        result = 2 * 3.14159 * ru;
                        System.out.println("Triangle Perimeter =" + result);
                        break;
                }
            }
        }
    }
}
