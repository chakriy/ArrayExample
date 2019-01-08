package loveProgramming;

public class example {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int i;
        for (i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        char[] c = {'C', 'h', 'a', 'k', 'r', 'i'};
        for (int i1 = 0; i1 < c.length; i1++) {
            System.out.print(c[i1]);
        }
        System.out.println();
        String[] Statement = {"How", "can", "you", "solve", "this?"};
        for (int i2 = 0; i2 < Statement.length; i2++) {
            System.out.print(Statement[i2] + " ");
        }
    }
}