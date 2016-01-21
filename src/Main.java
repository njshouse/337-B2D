import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Binary to Decimal Converter\n");
                System.out.println("Enter binary number value: ");
        Scanner scanner = new Scanner(System.in);
        String buffer = scanner.nextLine();
        int result = Binary2Decimal(buffer);
        System.out.println("Binary: " + buffer + " represents decimal value of: " + result);

    }
    public static int Binary2Decimal(String binary){
        int result = 0;
        for(int i = 0; i < binary.length(); i++) {
            int digit = Character.getNumericValue(binary.charAt(i));
            int position = binary.length() - i -1;
            result += digit * Math.pow(2, position);
        }
        return result;
    }
}
