public class Main {
    public static void main(String[] args) {
        CharOperations charOperations = new CharOperations("abcdefghi");
        System.out.println(charOperations.length());
        System.out.println(charOperations.charAt(0));
        System.out.println(charOperations.subSequence(0,5));
        System.out.println(charOperations.toString());
    }
}
