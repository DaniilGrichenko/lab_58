public class pr_3 {
    public static void main(String[] args) {
                int v = 879;
                int max = 0;
                int tri;
                System.out.println(v);

                do {
                    tri = v % 10;
                    if (tri > max) max = tri;

                    v = (v - tri) / 10;

                } while (v > 0);
                System.out.println(max);
    }
}

