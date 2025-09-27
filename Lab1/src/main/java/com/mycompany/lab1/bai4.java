/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab1;

import java.util.Scanner;

/**
 *
 * @author ICT
 */
public class bai4 {

   public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap a = ");
        double a = sc.nextDouble();
        System.out.print("Nhap b = ");
        double b = sc.nextDouble();
        System.out.print("Nhap c = ");
        double c = sc.nextDouble();

        // Tính delta theo công thức: delta = b^2 - 4ac
        double delta = Math.pow(b, 2) - 4 * a * c;
        System.out.println("Delta: " + delta);

        // Tính căn delta
        double sqrtDelta = Math.sqrt(delta);
        System.out.println("Can bac 2 cua delta: " + sqrtDelta);

    }
}
