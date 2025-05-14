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
    
    /*
  Giả sử chuỗi x là chuỗi con lớn nhất chia hết cả str1 và str2, ta sẽ có:

str1 = x + x + ... (n lần)

str2 = x + x + ... (m lần)

Vậy thì chắc chắn:
 x sẽ là ước số chung theo chuỗi của cả str1 và str2.

 1. Quy tắc cần nhớ
Nếu str1 + str2 khác str2 + str1, thì không thể tồn tại chuỗi x chia hết cả hai. → Trả về "".

Nếu giống nhau, thì chuỗi x có thể được tính là:
x = str1.substring(0, gcd(len1, len2))

2. Tại sao dùng gcd?
Vì độ dài của x phải chia hết cả độ dài của str1 và str2. Vậy độ dài tối đa của x là gcd(str1.length(), str2.length()).
    */
    
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
        System.out.println(gcdOfStrings("ABEF", "ABEF"));  // Output "ABEF"
        System.out.println(gcdOfStrings("ABCABC", "ABCA")); // Output ""
        System.out.println(gcdOfStrings("ABCABC", "")); // Output "ABCABC"
    }
    
}
