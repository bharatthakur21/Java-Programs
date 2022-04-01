import com.sun.tools.javac.Main;

import java.util.Scanner;

public class miniCalculator {

    // returntype= int , folat, char, long , boolean, double ,byte;
    // Input- Operation(Block of Code) - Output
    //    (returntype-like int,float,char )(funnctionname-like sumofnumber, calculation,)(type argument1 ,2  Like- int a , int b ,);
    public static int sumofTwonumbers(int a, int b) {
        return a + b;
    }

    public static int sumofThreenumbers(int a, int b, int c) {
        return a + b + c;
    }

    public static int sumofFournumbers(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    public static int susbstractionoftwonumber(int a, int b) {
        return a - b;
    }

    public static int susbstractionofthreenumber(int a, int b, int c) {
        return a - b - c;
    }

    public static int susbstractionoffournumber(int a, int b, int c, int d) {
        return a - b - c - d;
    }

    public static int devisionofTwonumbers(int a, int b) {
        return a / b;
    }

    public static int multiplicationofTwonumbers(int a, int b) {
        return a * b;
    }

    public static int multiplicationofthreenumbers(int a, int b, int c) {
        return a * b * c;
    }

    public static int multiplicationoffournumbers(int a, int b, int c, int d) {
        return a * b * c * d;
    }
    public static void Addition() {
        System.out.println(" 1. Addition ");



    }
    public static void Substraction(){
        System.out.println(" 2. Substraction ");
    }
    public static void Devision(){
        System.out.println(" 3. Devision ");
    }
    public static void Multiplication(){
        System.out.println(" 4. Multiplication ");
    }

    public static void main(String[] args) {

        System.out.println("Please Choose an Option to Continue : ");


        Addition();
        Substraction();
        Devision();
        Multiplication();
        int optionPicked;
        int firstNumber, secondNumber;

        Scanner inputScanner = new Scanner(System.in);
        optionPicked = inputScanner.nextInt();

        if (optionPicked == 1) {
            //Addition code-
            System.out.println("Addition Picked");
            System.out.println("Please Choose an Option to Continue : ");
            System.out.println(" 1. add two num ");
            System.out.println(" 2. add three num ");
            System.out.println(" 3. add four  num ");
            int optionPickedsum;
            int firstvalue, secondvalue, thirdvalue, forthvalue;

            Scanner inputscanners = new Scanner(System.in);
            optionPickedsum = inputscanners.nextInt();
            if (optionPickedsum == 1) {
                System.out.println("Add two number Piicked");
                System.out.print("Plese enter First Number: ");
                firstvalue = inputscanners.nextInt();


                System.out.print("Plese enter second Number: ");
                secondvalue = inputscanners.nextInt();

                int sumofTwo = sumofTwonumbers(firstvalue, secondvalue);
                System.out.print("The Sum of Number is:  " + sumofTwo);


            }
            else if (optionPickedsum == 2) {
                System.out.println("Add three number Picked");
                System.out.print("Plese enter First Number: ");
                firstvalue = inputscanners.nextInt();


                System.out.print("Plese enter second Number: ");
                secondvalue = inputscanners.nextInt();


                System.out.print("Plese enter third Number: ");
                thirdvalue = inputscanners.nextInt();

                int sumoofthree = sumofThreenumbers(firstvalue, secondvalue, thirdvalue);
                System.out.print("The Sum of Number is :" + sumoofthree);
            } else if (optionPickedsum == 3) {
                System.out.println("Add Four number Picked");
                System.out.print("Plese enter First Number: ");
                firstvalue = inputscanners.nextInt();


                System.out.print("Plese enter second Number: ");
                secondvalue = inputscanners.nextInt();


                System.out.print("Plese enter third Number: ");
                thirdvalue = inputscanners.nextInt();

                System.out.print("Plese enter Forth Number: ");
                forthvalue = inputscanners.nextInt();

                int sumooffour = sumofFournumbers(firstvalue, secondvalue, thirdvalue, forthvalue);
                System.out.print("The Sum of Number is :" + sumooffour);
            } else {
                System.out.println("Invalid");
            }


        } else if (optionPicked == 2) {

            System.out.println("substraction Picked");
            System.out.println("Please Choose an Option to Continue : ");
            System.out.println(" 1. Subtract two num ");
            System.out.println(" 2. Subtract three num ");
            System.out.println(" 3. Subtract four  num ");
            int optionPickedsum;
            int firstvalue, secondvalue, thirdvalue, forthvalue;

            Scanner inputscanners = new Scanner(System.in);
            optionPickedsum = inputscanners.nextInt();
            if (optionPickedsum == 1) {
                System.out.println("Add two number Piicked");
                System.out.print("Plese enter First Number: ");
                firstvalue = inputscanners.nextInt();


                System.out.print("Plese enter second Number: ");
                secondvalue = inputscanners.nextInt();

                int substractionooftwo = susbstractionoftwonumber(firstvalue, secondvalue);
                System.out.print("The  substraction of Number is:  " + substractionooftwo);

            } else if (optionPickedsum == 2) {
                System.out.println("Add three number Picked");
                System.out.print("Plese enter First Number: ");
                firstvalue = inputscanners.nextInt();


                System.out.print("Plese enter second Number: ");
                secondvalue = inputscanners.nextInt();


                System.out.print("Plese enter third Number: ");
                thirdvalue = inputscanners.nextInt();

                int substractionoofthree = susbstractionofthreenumber(firstvalue, secondvalue, thirdvalue);
                System.out.print("The  substraction of Number is :" + substractionoofthree);
            } else if (optionPickedsum == 3) {
                System.out.println("Add Four number Picked");
                System.out.print("Plese enter First Number: ");
                firstvalue = inputscanners.nextInt();


                System.out.print("Plese enter second Number: ");
                secondvalue = inputscanners.nextInt();


                System.out.print("Plese enter third Number: ");
                thirdvalue = inputscanners.nextInt();

                System.out.print("Plese enter Forth Number: ");
                forthvalue = inputscanners.nextInt();

                int substractionooffour = susbstractionoffournumber(firstvalue, secondvalue, thirdvalue, forthvalue);
                System.out.print("The  substraction of Number is :" + substractionooffour);
            } else {
                System.out.println("Invalid");
            }


        } else if (optionPicked == 3) {
            System.out.println("Devision Picked.");
            System.out.print("Plese enter First Number: ");
            firstNumber = inputScanner.nextInt();

            System.out.print("Plese enter Second Number: ");
            secondNumber = inputScanner.nextInt();


            int devision = devisionofTwonumbers(firstNumber, secondNumber);
            System.out.println("The Devision of numbers is : " + devision);

        } else if (optionPicked == 4) {
            System.out.println("Multiplication Picked");
            System.out.println("Please Choose an Option to Continue : ");
            System.out.println(" 1. Multiply two num ");
            System.out.println(" 2. Multiply three num ");
            System.out.println(" 3. Multiply four  num ");
            int optionPickedsum;
            int firstvalue, secondvalue, thirdvalue, forthvalue;

            Scanner inputscanners = new Scanner(System.in);
            optionPickedsum = inputscanners.nextInt();
            if (optionPickedsum == 1) {
                System.out.println("Multiply two number Piicked");
                System.out.print("Plese enter First Number: ");
                firstvalue = inputscanners.nextInt();


                System.out.print("Plese enter second Number: ");
                secondvalue = inputscanners.nextInt();

                int multiplicationoftwo = multiplicationofTwonumbers(firstvalue, secondvalue);
                System.out.print("The Sum of Number is:  " + multiplicationoftwo);

            } else if (optionPickedsum == 2) {
                System.out.println("Multiply three number Picked");
                System.out.print("Plese enter First Number: ");
                firstvalue = inputscanners.nextInt();


                System.out.print("Plese enter second Number: ");
                secondvalue = inputscanners.nextInt();


                System.out.print("Plese enter third Number: ");
                thirdvalue = inputscanners.nextInt();

                int multiplicationofthree = multiplicationofthreenumbers(firstvalue, secondvalue, thirdvalue);
                System.out.print("The Sum of Number is :" + multiplicationofthree);
            } else if (optionPickedsum == 3) {
                System.out.println("Multiply Four number Picked");
                System.out.print("Plese enter First Number: ");
                firstvalue = inputscanners.nextInt();


                System.out.print("Plese enter second Number: ");
                secondvalue = inputscanners.nextInt();


                System.out.print("Plese enter third Number: ");
                thirdvalue = inputscanners.nextInt();

                System.out.print("Plese enter Forth Number: ");
                forthvalue = inputscanners.nextInt();

                int multiplicationoffour = multiplicationoffournumbers(firstvalue, secondvalue, thirdvalue, forthvalue);
                System.out.print("The multiplication of Number is :" + multiplicationoffour);
            } else {
                System.out.println("Invalid");
            }
        }
    }
}
