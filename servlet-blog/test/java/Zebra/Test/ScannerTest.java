package Zebra.Test;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: 13498
 * Date: 2022/3/28
 * Time: 9:58
 * Description: No Description
 */
public class ScannerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            for (int i = 0; i < n; i++) {
                int next = scanner.nextInt();
                System.out.println(next);
            }
        }
    }
}
