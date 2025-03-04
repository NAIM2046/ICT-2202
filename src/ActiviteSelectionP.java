import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class ActiviteSelectionP {
    public static void ActiviteSelectionProblem(String[] Activite, int[] s, int[] e, int n) {
        int i = 0;
        System.out.print(Activite[0] + " ");
        for (int j = 1; j < n; j++) {
            if (s[j] >= e[i]) {
                System.out.print(Activite[j] + " ");
                i++;
            }
        }
        System.out.println();
    }

    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        // int a = 10;
        // System.out.println(a);
        // int b[] = { 1, 2, 3, 4, 5, };
        // for (int i = 0; i < b.length; i++) {
        // System.out.println(b[i]);
        // }
        // int[] nums = new int[5];
        Scanner s = new Scanner(System.in);
        // for (int i = 0; i < nums.length; i++) {
        // nums[i] = s.nextInt();nai
        // }
        // for (int i = 0; i < nums.length; i++) {
        // System.out.println(nums[i]);
        // }
        // String[] ss = new String[4];
        // for (int i = 0; i < ss.length; i++) {
        // ss[i] = s.next();
        // }
        // for (String name : ss) {
        // System.out.println(name);
        // }
        // int[][] arr = new int[2][2];
        // for (int i = 0; i < 2; i++) {
        // for (int j = 0; j < 2; j++) {
        // arr[i][j] = s.nextInt();
        // }
        // }
        // for (int i = 0; i < 2; i++) {
        // for (int j = 0; j < 2; j++) {
        // System.out.print(arr[i][j] + " ");
        // }
        // System.out.println();
        // }

        // int[] star = { 1, 3, 0, 5, 8, 5 };
        // int[] end = { 2, 4, 6, 7, 9, 9 };
        // String[] workName = { "A3", "A2", "A1", "A5", "A6", "A4" };
        // int n = end.length;
        // ActiviteSelectionProblem(workName, star, end, n);
        LinkedList<String> c = new LinkedList<String>();
        c.add("omar");
        c.add("kobir");
        c.add("naim");
        System.out.println(c);
        // System.out.println(c);

        s.close();

    }
}
