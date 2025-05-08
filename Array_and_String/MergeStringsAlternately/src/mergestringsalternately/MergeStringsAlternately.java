/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mergestringsalternately;

/**
 *
 * @author Minh Triet
 */
public class MergeStringsAlternately {
    public static String mergeAlternately (String word1, String word2){
        //Khởi tạo StringBuilder
        StringBuilder result = new StringBuilder();
        //xem độ dài chuỗi nào dài hơn
        int n = Math.max(word1.length(), word2.length());
        //Duyệt từ 0 đến độ dài của chuỗi dài hơn
        for(int i = 0; i < n; i++){
            //Thêm kí tự tại vị trí "i" vào result
            if(i < word1.length()){
                result.append(word1.charAt(i));
            }
            if(i < word2.length()){
                result.append(word2.charAt(i));
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String a = "a b c"; //tạo ra các khoảng trắng để mô tả sự hợp nhất, sau đó bỏ khoảng trắng
        String b = " d e f";
        System.out.println("Output: " + mergeAlternately(a, b).replaceAll("\\s+", ""));
    }
    
}
