public class Break {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if ((i + j) % 2 == 0) {
                    break;
                }
                System.out.println(i + " , " + j);
            }
        }
        System.out.println(1%2);

    }
}