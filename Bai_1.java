package bai_1;

import java.util.Scanner;

public class Bai_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int d = 0, m = 0, y = 0;
        while (d<=0||d>31)
        {
            System.out.print("Nhap vao ngay sinh: ");
            d = sc.nextInt();
        }
        while (m<=0||m>12)
        {
            System.out.print("Nhap vao thang sinh: ");
            m = sc.nextInt();
        }
        if (d==30)
        {
            while (m==2)
            {
                System.out.print("Nhap lai thang sinh: ");
                m = sc.nextInt();
            }
        }
        if (d==31)
        {
            while (m==2||m==4||m==6||m==9||m==11)
            {
                System.out.print("Nhap lai thang sinh: ");
                m = sc.nextInt();
            }
        }
        while (y<1900||y>2021)
        {
            System.out.print("Nhap vao nam sinh: ");
            y = sc.nextInt();
        }
        if (d==29&&m==2&&(y%4==0&&y%100!=0||y%400==0))
        {
            System.out.print("Nhap vao nam sinh la nam nhuan: ");
            y = sc.nextInt();
        }
        switch (m) {
            case 1: {
                if(d>=20){
                    System.out.println("Cung Bao Binh");
                } else {
                    System.out.println("Cung Ma ket");
                }
                break;
            }
            case 2: {
                if(d>=19){
                    System.out.println("Cung Song Ngu");
                } else {
                    System.out.println("Cung Bao Binh");
                }
                break;
            }
            case 3: {
                if(d>=21){
                    System.out.println("Cung Bach Duong");
                } else {
                    System.out.println("Cung Song Ngu");
                }
                break;
            }
            case 4: {
                if(d>=21){
                    System.out.println("Cung Kim Nguu");
                } else {
                    System.out.println("Cung Bach Duong");
                }
                break;
            }
            case 5: {
                if(d>=21){
                    System.out.println("Cung Song Tu");
                } else {
                    System.out.println("Cung Kim Nguu");
                }
                break;
            }
            case 6: {
                if(d>=22){
                    System.out.println("Cung Cu Giai");
                } else {
                    System.out.println("Cung Song Tu");
                }
                break;
            }
            case 7: {
                if(d>=23){
                    System.out.println("Cung Su Tu");
                } else {
                    System.out.println("Cung Cu Giai");
                }
                break;
            }
            case 8: {
                if(d>=23){
                    System.out.println("Cung Xu Nu");
                } else {
                    System.out.println("Cung Su Tu");
                }
                break;
            }
            case 9: {
                if(d>=23){
                    System.out.println("Cung Thien Binh");
                } else {
                    System.out.println("Cung Xu Nu ");
                }
                break;
            }
            case 10: {
                if(d>=24){
                    System.out.println("Cung Bo Cap");
                } else {
                    System.out.println("Cung Thien Binh");                }
                break;
            }
            case 11: {
                if(d>=23){
                    System.out.println("Cung Nhan Ma");
                } else {
                    System.out.println("Cung Bo Cap ");
                }
                break;
            }
            case 12: {
                if(d>=22){
                    System.out.println("Cung Ma Ket");
                } else {
                    System.out.println("Cung Nhan Ma ");
                }
                break;
            }
        }
    } 
}
