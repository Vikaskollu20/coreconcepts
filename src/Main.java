public class Main {
    public static void main(String[] args) {
        Integer input=12345;
        String value=input.toString();
        int div=0;
        for(int i=1;i<=value.length();i++) {
            System.out.println(input % 10);
            input= input/10;
        }
        System.out.println("------------------------------------------");
        for(int i=0;i<=value.length()-1;i++) {
            System.out.println(value.charAt(i));
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