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
 Ý tưởng giải bài toán
1. Khái niệm "x divides s": Một chuỗi x "chia hết" chuỗi s nếu s có thể được hình thành bằng cách nối chuỗi x với chính nó nhiều lần (ít nhất một lần). Ví dụ, với x = "ABC", thì "ABCABC" ="ABC" +"ABC" và "ABC" ="ABC".
2. Điều kiện kiểm tra tồn tại x chung: Giả sử có một chuỗi x chia hết cho cả str1 và str2. Khi đó, nếu nối str1 và str2 theo hai thứ tự khác nhau, ta sẽ có:
str1 + str2 = str2 + str1
Nếu không bằng nhau, tức là không tồn tại chuỗi x nào mà chia hết cho cả hai chuỗi.
3. Tìm độ dài của chuỗi x: Nếu điều kiện trên thoả mãn, chuỗi x duy nhất chính là tiền tố
của str1 với độ dài bằng ước số chung lớn nhất (GCD) của độ dài str1 và str2.Ví dụ: Với str1="ABCABC" (độ dài 6) và str2 = "ABC" (độ dài 3), GCD(6,3) = 3. Ta trả về str1.substring(0,3) = "ABC".
    =================
Cách hoạt động của thuật toán Euclid:
Giả sử bạn cần tìm GCD của hai số a và b, thuật toán hoạt động như sau:
1. Nếu b bằng 0, thì a chính là GCD. 
2. Ngược lại, ta thay a bằng b và b bằng a % b, rồi lặp lại quá trình đến khi b bằng 0.
     */
    //Hàm tính GCD giữa hai số nguyên
    private static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    private static String gcdOfStrings(String str1, String str2) {
        //Nếu chuỗi cộng chuỗi 2 hay chuỗi 2 cộng chuỗi 1 khác nhau thì không tồn tại x
        if (!(str1 + str2).equals(str2 + str1)) {
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
