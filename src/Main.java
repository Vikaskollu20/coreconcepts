public class Main {
    public static void main(String[] args) {
        Integer input=12345;

        while(input > 0) {
            System.out.println(input % 10);
            input= input/10;
        }

        System.out.println("------------------------------------------");

        int num = 12345;
        int reverse = 0;

        // Reverse the number
        while (num > 0) {
            reverse = reverse * 10 + num % 10; // Add the last digit to the reversed number
            num /= 10; // Remove the last digit
        }

        // Print the digits of the reversed number
        while (reverse > 0) {
            System.out.println(reverse % 10); // Print the last digit
            reverse /= 10; // Remove the last digit
        }

        System.out.println("------------------------------------------");

        int count = 1;

        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= i && count <= 6; j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }
}