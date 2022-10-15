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
// khi ta viết class để cung cấp các tiện ích cho người dùng thì người ta nên sài hàm STATIC
public class MathUtils {

    // 21! là số liệu lớn vượt quá kiêu long nên hàm lấy gia thừ chỉ sài cho từ 0! đến 20!
    public static long getFactoria(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid Arument . n must be 1-> 20");
        }
        if (n == 0 || n == 1) {
            return 1;
        }

        // chơi for hoặc đệ quy thì được gọi là recursion
        long product = 1;
        
        for (int i = 2; i <= n; i++) {
            product *= i;
        }
        return product;
    }
}
