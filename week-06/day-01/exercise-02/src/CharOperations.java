public class CharOperations implements CharSequence {
    private String inputString;

    public CharOperations(String inputString) {
        StringBuilder sb = new StringBuilder(inputString);
        this.inputString = sb.reverse().toString();
    }

    @Override
    public int length() {
        return this.inputString.length();
    }

    @Override
    public char charAt(int index) {
        return this.inputString.charAt(index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return this.inputString.subSequence(start, end);
    }

    @Override
    public String toString() {
        return this.inputString;
    }
}
