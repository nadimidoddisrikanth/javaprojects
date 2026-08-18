import java.util.Scanner;
public class CALCULATOR {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int result = 0;
            char choice;
            do {

                System.out.println("------CALCULATOR-------");
                System.out.println("enter num1");
                int a = sc.nextInt();
                System.out.println("enter num2");
                int b = sc.nextInt();
                if (b == 0) {

                    System.out.println("enter the number >0");
                } else {
                    System.out.println("choose the operation you want to perform ");

                    System.out.println("+, -,*,/,%");

                    char operation = sc.next().charAt(0);

                    switch (operation) {
                        case '+':
                            result = a + b;
                            break;
                        case '-':
                            result = a - b;
                            break;
                        case '*':
                            result = a * b;
                            break;
                        case '/':
                            result = a / b;
                            break;
                        case '%':
                            result = a % b;
                            break;
                        default:
                            System.out.println("Invalid input");

                    }

                    System.out.println("your answer is " + result);

                }
                System.out.println("if you want continue press Y else N ");
                choice = sc.next().charAt(0);

                System.out.println();

            }

            while (choice == 'Y' || choice == 'y') ;

            System.out.println("program ended thanks for playing ");

            sc.close();


        }
    }


