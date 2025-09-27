/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.lab1;

import java.util.Scanner;

/**
 *
 * @author ICT
 */
public class bai2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double dai, rong, tinhchuvi;

        System.out.println("nhap dai = ");
        dai = sc.nextDouble();
        System.out.println("nhap rong = ");
        rong = sc.nextDouble();
        tinhchuvi = (dai + rong) * 2;
        System.out.println("tinhchuvi : " + tinhchuvi);

    }

}
