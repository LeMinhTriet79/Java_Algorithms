/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg151_reverse.words.in.a.string;

/**
 *
 * @author Administrator
 */
public class WordsInAString {
    
    public static String reverseWords(String s) {
        // Bước 1: Loại bỏ khoảng trắng đầu/cuối, và giảm nhiều khoảng trắng giữa về 1 khoảng trắng
        s = s.trim();

        // Bước 2: Cắt chuỗi thành mảng các từ (chia tách bởi 1 hoặc nhiều khoảng trắng)
        String[] words = s.split("\\s+");

        // Bước 3: Đảo ngược mảng từ
        int left = 0, right = words.length - 1;
        while (left < right) {
            // Hoán đổi từ đầu với từ cuối
            String temp = words[left];
            words[left] = words[right];
            words[right] = temp;

            left++;
            right--;
        }

        // Bước 4: Nối lại thành chuỗi, cách nhau 1 khoảng trắng
        return String.join(" ", words);
    }
    public static void main(String[] args) {
        System.out.println(reverseWords("The Sky is Allah"));  
    }
    
}
