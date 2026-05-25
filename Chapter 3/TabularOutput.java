public class TabularOutput {
    public static void main(String[] args) {

        System.out.println("N\t10*N\t100*N\t1000*N");

        for (int n = 1; n <= 5; n++) {
       System.out.println(n + "\t" + (n * 10) + "\t" + (n * 100) + "\t" + (n * 1000));
        }
    }
}
