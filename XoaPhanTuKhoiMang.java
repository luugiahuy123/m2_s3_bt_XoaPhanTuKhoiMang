package ss3.BaiTap_XoaPhanTuKhoiMang;

import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap do dai cua mang");
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập phần tử thứ " + (i + 1) + ":");
            array[i] = scanner.nextInt();
        }
        System.out.println("Mảng đã nhập:");
        for (int i = 0; i < n ; i++) {
            System.out.println(array[i]);
        }
//        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("nhap phat tu can xoa");
        int x = scanner.nextInt();
        int index_del = -1 ;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x){
                index_del = i;
                break;
            }
        }
        if (index_del != -1) {
            for (int i = index_del; i < array.length-1 ; i++) {
                array[i] = array[i + 1];
            }
            array[array.length-1] = 0;
        }
        System.out.print("Mảng sau khi xoá: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }
}


