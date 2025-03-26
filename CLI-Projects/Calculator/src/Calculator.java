public class Calculator {

    
    public double sum(double... args) {
        double sum = 0;
        for (double number: args) {
            sum += number;
        }
        return sum;
    }

    public double sub(double... args) {
        double sub = args[0];
        for (int i = 1; i < args.length; i++) {
            sub -= args[i];
        }
        return sub;
    }

    public double multiply(double... args) {
        double result = 1;
        for (double number : args) {
            result *= number;
        }
        return result;
    }

    public double divide(double... args) {
        double result = args[0];
        for (int i = 1; i < args.length; i++) {
            result /= args[i];
        }
        return result;
    }

    public double root(double x) throws NegativeInputException {
        if (x >= 0) {
            return Math.sqrt(x);
        } else {
            throw new NegativeInputException("Invalid Input. You are not allowed to enter negative input for root.");
        }
    }

    public double power(double[] arr) {
        double x = arr[0];
        double n = arr[1];
        return Math.pow(x, n);
    }

    public double log(double x) {
        return Math.log10(x);
    }

    public double sin(double x) {
        return Math.sin(x);
    }

    public double cos(double x) {
        return Math.cos(x);
    }

    public double tan(double x) {
        return Math.tan(x);
    }
}