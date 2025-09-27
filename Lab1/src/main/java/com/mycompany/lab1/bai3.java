/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab1;

import java.util.Scanner;

/**
 *
 * @author ICT
 */
public class bai3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double canh, thetichkhoilapphuong;

        System.out.println("nhap canh = ");
        canh = sc.nextDouble();
        thetichkhoilapphuong = canh*canh*canh;
        System.out.println("The tich khoi : " + thetichkhoilapphuong);

    }

}
