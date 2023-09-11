//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class project3 {
    public project3() {
    }

    public static void main(String[] args) {
        GetPrimeNumber(20000);
    }

    public static void GetPrimeNumber(int n) {
        int count = 0;

        for(int i = 2; i <= n; ++i) {
            int j;
            for(j = 2; j < i && i % j != 0; ++j) {
            }

            if (j >= i) {
                System.out.print(" " + i + "\t");
                ++count;
                if (count == 5) {
                    System.out.println();
                    count = 0;
                }
            }
        }

    }
}
