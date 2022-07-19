package bai_2;

import java.util.Scanner;

public class Bai_2 {

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        float a,b,c;
        System.out.print("Nhap vao 3 canh cua tam giac: ");
        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();
        if (a+b<=c||b+c<=a||c+a<=b) 
        {
            System.out.println("Khong tao thanh tam giac");
        }
        else
        {
            System.out.print("Cac canh tren tao thanh tam giac ");
            if (a*a+b*b==c*c||a*a==b*b+c*c||a*a+c*c==b*b) System.out.print("vuong");
            else if(a!=b&&b!=c) System.out.print("thuong");
            if (a==b&&b==c) System.out.print("deu");
            else if (a==b||b==c||c==a) System.out.print("can");
        }
    }
    
}
