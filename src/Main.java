import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

      while(true) {

          System.out.println("Kādu matemātisko darbību vēlies izpildīt (+, -, /, *, e - exit): ");
          String math_op = scan.next();

          if(math_op.equals("e")) {
            break;
          }

          System.out.println("Ievadi skaitli x: ");
          int num_x = scan.nextInt();

          System.out.println("Ievadi skaitli y: ");
          int num_y = scan.nextInt();

          switch (math_op) {

              case "+":
                  System.out.println(sum(num_x, num_y));
                  break;
              case "-":
                  System.out.println(sub(num_x, num_y));
                  break;
              case "/":
                  System.out.println(div(num_x, num_y));
                  break;
              case "*":
                  System.out.println(mult(num_x, num_y));
                  break;
              default:
                  System.out.println("Nepareiza izvēle");

          }
          // sw
      }
      // whil
    }
    // main

    public static int sum(int x, int y) {
        return x + y;
    }

    public static int sub(int x, int y) {
        return x - y;
    }

    public static int div(int x, int y) {
        return x / y;
    }

    public static int mult(int x, int y) {
        return x * y;
    }
}