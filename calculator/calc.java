import java.util.Scanner;
    class Calculator {
    public static void main (String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Введите два числа: ");
        double firstNumber = reader.nextDouble();
        double secondNumber = reader.nextDouble();
        System.out.println("Введите оператор: " + "/+" + "/-" + "/*" + "//");
        char operator = reader.next().charAt(0);
        double result;
        switch(operator) {
            case '+':
                result = firstNumber + secondNumber;
                break;
            case  '-':
                result = firstNumber - secondNumber;
                break;
            case '*':
                result = firstNumber * secondNumber;
                break;
            case '/':
                result = firstNumber / secondNumber;
                break;

            default:
                System.out.println("Ашибка, оператор не подходит");
                return;
        }
        System.out.printf("%.1f %c %.1f = %.1f", firstNumber, operator, secondNumber, result);
    }
}
