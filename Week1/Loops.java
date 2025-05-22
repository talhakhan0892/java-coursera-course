public class Loops {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println(numbers[4]);
        System.out.println(numbers[5]);
        System.out.println(numbers[6]);
        System.out.println(numbers[7]);
        System.out.println(numbers[8]);
        System.out.println(numbers[9]);
        System.out.println();

        int len = numbers.length;
        for (int i = 0; i < len; i++) {
            System.out.println(numbers[i]);
        }

        String msg = "Hello World";
        char[] msgInChars = msg.toCharArray();
        System.out.println(msgInChars);
        for (char letter : msgInChars) {
            System.out.println(letter);
        }
    }
}