public class testIndexOf {
    public static void main(String[] args) {
        final String NEW = "\n";
        String sentence = "a ss\n";
        int index = sentence.indexOf(NEW);
        String word = sentence.substring(0, index);
        sentence = sentence.substring(index+1);
        System.out.println(index);

    }
}
