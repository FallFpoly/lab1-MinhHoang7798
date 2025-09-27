/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab1;

import java.util.Scanner;

/**
 *
 * @author ICT
 */
public class bai5 {

    public static void main(String[] args) {
        // Tính trung bình của 3 số nguyên (ép kiểu)

        Scanner sc = new Scanner(System.in);

        int a, b, c;
        double average;

        System.out.print("Nhap a = ");
        a = sc.nextInt();
        System.out.print("Nhap b = ");
        b = sc.nextInt();
        System.out.print("Nhap c = ");
        c = sc.nextInt();

        // Ép kiểu sang double để kết quả trung bình có phần thập phân
        average = (double)(a + b + c) / 3;

        System.out.println("TB 3 so nguyen la: " + average);

    }
}
