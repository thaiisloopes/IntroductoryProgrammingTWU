package isoscelesTriangle;

public class Main {
    public static void main(String[] args) {
        int number = 10;

        for(int i = 0; i < number ; i++) {

            for (int j = number; j > i+1; j--) {
                System.out.print(" ");
            }

            int base = 2*i+1;
            for (int j = 0; j < base; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
