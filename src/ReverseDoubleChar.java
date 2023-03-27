public class ReverseDoubleChar {
    public static String reverseDoubleChar(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            result.append(s.charAt(i)).append(s.charAt(i));
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String s1 = "The";
        String s2 = "AABB";
        String s3 = "String";

        System.out.println(reverseDoubleChar(s1));
        System.out.println(reverseDoubleChar(s2));
        System.out.println(reverseDoubleChar(s3));
    }
}
