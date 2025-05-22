public class StringOps {
    public static void main(String s[]) {
        String s1 = "Hello World";
        System.out.println(s1);
        String s2 = new String("Hello World");
        System.out.println(s2);
        String s3 = "Hello World";

        // one is a string object
        System.out.println("s1 and s2 comparison " + (s1 == s2));

        System.out.println("s2 and s3 comparison " + (s2 == s3));

        // both are string literals
        System.out.println("s1 and s3 comparison " + (s1 == s3));

        String s4 = "The quick brown fox jumped over the lazy dog";
        System.out.println(s4.length());
        char[] strAsArr = s4.toCharArray();
        System.out.println(strAsArr.length);
        System.out.println(strAsArr);
        System.out.println("The first char of the string is " + strAsArr[0]);
        System.out.println("The last char of the string is " + strAsArr[strAsArr.length - 1]);
        System.out.println("The index of T is " + s4.indexOf('T'));
        System.out.println("The index of g is " + s4.indexOf('g'));

        String s5 = "Washington";
        String s6 = " DC";
        s5 = s5.concat(s6);
        System.out.println("s5 " + s5);
        s5 = s5.substring(0, 10);
        System.out.println("s5 " + s5);
        System.out.println("s5.substring(7,10) " + s5.substring(7, 10));
        System.out.println("s5.substring(7) " + s5.substring(7));
    }
}