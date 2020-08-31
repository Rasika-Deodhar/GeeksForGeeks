/*package whatever //do not write package name here */

import java.util.Scanner;

class GFG {

    public boolean armstrongNumber(int n) {
        String n1 = Integer.toString(n);
        int res = 0;
        for (int i = 0; i < n1.length(); i++) {
            res += (int) Math.pow(Integer.parseInt(n1.substring(i, i + 1)), 3);
        }
        if (res == n) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        GFG gfg = new GFG();
        Scanner sc = new Scanner(System.in);
        int test_cases = sc.nextInt();
        while (test_cases > 0) {
            int n = sc.nextInt();
            if (gfg.armstrongNumber(n)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
            test_cases--;
        }
        sc.close();
    }
}