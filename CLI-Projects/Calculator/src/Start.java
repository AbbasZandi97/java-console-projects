import java.util.Scanner;

public class Start {

    public static void on(Scanner sc) {
        Calculator calculator = new Calculator();
        while (true) {
            printMenu();
            try {
                int inputNumber = Integer.parseInt(sc.nextLine());
                switch (inputNumber) {
                    case 1 -> {
                        System.out.println("Enter numbers to sum with this format : num1+num2+num3+...");
                        System.out.println("Sum: " + calculator.sum(getInput(sc)));
                    }

                    case 2 -> {
                        System.out.println("Enter numbers to sub with this format : num1-num2-num3-...");
                        System.out.println("Sub: " + calculator.sub(getInput(sc)));
                    }

                    case 3 -> {
                        System.out.println("Enter numbers to multiply with this format : num1*num2*num3*...");
                        System.out.println("Multiply: " + calculator.multiply(getInput(sc)));
                    }

                    case 4 -> {
                        System.out.println("Enter numbers to divide with this format : num1/num2/num3/...");
                        System.out.println("Division: " + calculator.divide(getInput(sc)));
                    }

                    case 5 -> {
                        System.out.println("Enter a non negative input to calculate the root: ");
                        try {
                            System.out.println("root: " + calculator.root(getSingleInput(sc)));
                        } catch (NegativeInputException e) {
                            System.out.println("Error: " + e.getMessage());
                        }

                    }

                    case 6 -> {
                        System.out.println("Result of power: " + calculator.power(getTwoInputs(sc)));
                    }

                    case 7 -> {
                        System.out.println("Enter only positive input: ");
                        try {
                            System.out.println("Logarithm in base 10: " + calculator.log(getSinglePositiveInput(sc)));
                        } catch (IllegalArgumentException e) {
                            System.out.println(e.getMessage());
                        }
                    }

                    case 8 -> {
                        System.out.println("Enter desired angle(in degree): ");
                        System.out.println("Sin of the angle: " + calculator.sin(getTrigonometricFuncInput(sc)));
                    }

                    case 9 -> {
                        System.out.println("Enter desired angle(in degree): ");
                        System.out.println("Cos of the angle: " + calculator.cos(getTrigonometricFuncInput(sc)));
                    }

                    case 10 -> {
                        System.out.println("Enter desired angle(in degree): ");
                        System.out.println("Tan of the angle: " + calculator.tan(getTrigonometricFuncInput(sc)));
                    }

                    case 11 -> {
                        System.out.println("Exiting the program...");
                        return;
                    }

                    default -> System.out.println("Invalid choice. Please enter a number between 1 and 5.");

                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please try again.");
            }
        }
    }

    public static double[] getInput(Scanner sc) {
        String[] numbersInStringFormat = sc.nextLine().split("[+\\-*/]");
        double[] numbers = new double[numbersInStringFormat.length];
        for (int i = 0; i < numbersInStringFormat.length; i++) {
            numbers[i] = Double.parseDouble(numbersInStringFormat[i]);
        }

        return  numbers;
    }

    public static void printMenu() {
        System.out.println("*** Calculator Program ***");
        System.out.println("1. Sum");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Root");
        System.out.println("6. Power");
        System.out.println("7. Logarithm in base 10");
        System.out.println("8. Sin");
        System.out.println("9. Cos");
        System.out.println("10. Tan");
        System.out.println("11. Exit");
        System.out.println("==================================================");
        System.out.println("Enter choice: ");
    }

    public static double  getSingleInput(Scanner sc) {
        return Double.parseDouble(sc.nextLine());
    }
    public static double getSinglePositiveInput(Scanner sc){
        double input = Double.parseDouble(sc.nextLine());
        if (input > 0) {
            return  input;
        } else {
            throw new IllegalArgumentException("Error: Non positive inputs are not valid.");
        }
    }
    public static double[] getTwoInputs(Scanner sc) {
        System.out.println("Enter base: ");
        double baseNumber = Double.parseDouble(sc.nextLine());
        System.out.println("Enter power: ");
        double power = Double.parseDouble(sc.nextLine());
        return new double[]{baseNumber, power};
    }
    public static double getTrigonometricFuncInput(Scanner sc) {
        double degreeAngle = Double.parseDouble(sc.nextLine());
        return Math.toRadians(degreeAngle);
    }

}