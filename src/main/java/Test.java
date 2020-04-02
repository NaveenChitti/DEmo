public class Test {

    public static void main(String[] args) {

        int value = 10;
        int t1 = 0;
        int t2 = 1;

        System.out.print("First " + value + " terms: ");

        for (int i = 1; i <= value; ++i)
        {
            System.out.print(t1 + " ");

            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
    }
}
