/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kids_with_the_greatest_number_of_candies;

import java.util.Arrays;

/**
 *
 * @author Minh Triet
 */
public class Version_01 {
    private static boolean[] kidWithCandies(int[] candies, int extraCandies){
        //Tìm số kẹo lớn nhất trong mảng
        //khai báo một biến để lưu giá trị kẹo lớn nhứt mảng
        int maxCandies = 0;
        for (int candy : candies) {
            //hàm so sánh - tìm max, so sánh số kẹo maxCandies với số kẹo tại các vị trí trong mảng
            maxCandies = Math.max(maxCandies, candy);
        }
        
        //Tiếp theo là kiểm tra từng đứa trẻ có thể đạt đủ số kẹo max hay không
        //Nghĩa là cho kẹo thêm từng đứa trẻ, nếu tổng số kẹo của nó sau khi mình cho mà lớn hơn cái thằng có số kẹo lớn nhất TRƯỚC KHI CHO thì TRUE
        //Có nghĩa là đem số kẹo tại tròn mảng tại vị trí i đó CỘNG VỚI số kẹo mình cho thêm(extraCandies)
        
        //Khởi tạo mảng kết quả boolean ứng với số kẹo trong mảng của từng đứa trẻ
        //để thêm kết quả so sánh trên.
        boolean[] result = new boolean[candies.length];
        for (int i = 0; i < candies.length; i++) {
            //thêm kết quả vào từng vị trí
            result[i] = (candies[i] + extraCandies  >= maxCandies);
        }
        return result;
    }
    public static void main(String[] args) {
        int[] candies1 ={2, 3, 5, 1, 3};
        int extraCandies1 = 3;
        boolean[] result1 = kidWithCandies(candies1, extraCandies1);
        System.out.println("Ví dụ 1: " + Arrays.toString(result1));
        //Ví dụ 1: [true, true, true, false, true]
        
        
    }
    
}
