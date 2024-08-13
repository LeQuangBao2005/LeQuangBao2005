/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Baitap19 {

    public static void main(String[] args) {
       int[] a;
       int n;
       Scanner input = new Scanner (System.in);
       System.out.print("Cho biet so phan tu:");
        n = input.nextInt();
        a = new int[n];
        
        
        
        
        phatSinhMang(a);
        System.out.print ("\nMang a:");
        XuatMang(a);
        
        
        sapXepMang(a);
          System.out.print ("\nMang sau khi sap xep:");
        XuatMang(a);
        
        
        System.out.print("\nCho biet so nguyen x:");
        int x = input.nextInt();
        System.out.print("\nCac phan tu la uoc so cua  x:");
        LietKeUocSo(a, x);
    }
    public static void phatSinhMang(int[] a) {
        Random rd = new Random();
        for (int i =0; i <a.length; i++){
            a[i] = rd.nextInt(100);
        }
    }
    public static void XuatMang(int[] a) {
        for (int x : a){
            System.out.print(x+ " ");
        }
    }
    public static void sapXepMang(int[] a) {
        
    }
    public static void LietKeUocSo(int[] a, int x) {
        
    }
}
