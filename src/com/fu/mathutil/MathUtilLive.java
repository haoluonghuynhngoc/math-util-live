/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fu.mathutil;

/**
 *
 * @author NgocHao
 */
public class MathUtilLive {

    public static void main(String[] args) {

        long result = MathUtils.getFactoria(5);
        System.out.println("5!= 120 ; actual = " + result);

        System.out.println("5!= 120 ; actual = " + MathUtils.getFactoria(6));

        System.out.println("0!= 1 ; actual = " + MathUtils.getFactoria(0));
    }
}
