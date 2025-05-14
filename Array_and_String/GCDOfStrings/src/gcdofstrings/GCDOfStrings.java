/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gcdofstrings;

/**
 *
 * @author Minh Triet
 */
public class GCDOfStrings {
    //Hàm tính GCD giữa hai số nguyên
    private static int gcd(int a, int b){
        return b == 0 ? a : gcd(b, a%b);
    }
    
    private static String gcdOfStrings(String str1, String str2){
        //Nếu chuỗi cộng chuỗi 2 hay chuỗi 2 cộng chuỗi 1 khác nhau thì không tồn tại x
        if(!(str1 + str2).equals(str2 + str1)){
            return "";
        }
        
        //Tính độ dài GCD
        int gcd_Length = gcd(str1.length(), str2.length());
        //sau đó trả về tiền tố của str1 có độ dài gcdLength.
        return str1.substring(0, gcd_Length);
    }
    public static void main(String[] args) {
        System.out.println(gcdOfStrings("ABCABC", "ABC"));  // Output "ABC"
        System.out.println(gcdOfStrings("ABEF", "ABEF"));  // Output "ABC"
        System.out.println(gcdOfStrings("ABCABC", "ABCA")); // Output ""
    }
    
}
