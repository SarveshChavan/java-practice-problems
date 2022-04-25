import java.util.*;
public class pattern2 {
    public static void main(String[] args) {
        int row, space, temp, num = 1, flag = 0;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        row = sc.nextInt();
        System.out.println();
        for (int i = 1; i <= row; i++) {
            for (space = 1; space <= 2*row - i; space++) {
                System.out.print("  ");
            }
            num = i;
            temp = i * 2 - 1;
            for (int j = 1; j <= temp; j++) {
                if (j <= i) {
                    System.out.print(num+" ");
                    if (j <= i - 1)
                        num++;
                }
                if (num == i * 2 - 1 && flag == 0) {
                    flag = 1;
                    j++;
                }
                if (flag == 1 && i != 1) {
                    System.out.print(num+" ");
                    num--;
                }
            }
            flag = 0;
            System.out.println();
        }
    }
}
