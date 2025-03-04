import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner s = new Scanner(System.in);
        // for (int i = 0; i < nums.length; i++) {
        // nums[i] = s.nextInt();nai
        // }
        // for (int i = 0; i < nums.length; i++) {
        // System.out.println(nums[i]);
        // }
        String[] ss = new String[4];
        for (int i = 0; i < ss.length; i++) {
            ss[i] = s.next();
        }
        for (String name : ss) {
            System.out.println(name);
        }
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
        s.close();
    }
}
