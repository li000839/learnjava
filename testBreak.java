public class testBreak {
    public static void main(String[] args) {
        int i = 0;
        while (true) {
            if (i == 2) {
                break;
            }
            i++;
            System.out.println(i);
        }
    }
}