package twosum;

import java.util.Scanner;

/**
 *
 * @author Minh Triet
 */
public class TwoSum {

    public static void main(String[] args) {

        while (true) {
            int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 0};
            int target = 0;
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhập chữ số mày muốn để tao tìm: ");
            try {
                target = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Nhập tào lao, nhập lại đi!");   //"này nè"
                continue; //Lỡ nhập tầm bậy thì nó nhảy lên đầu kêu mày nhập lại chỗ "này nè"
            }

            duyetMang(a, target);
        }

    }

    public static void duyetMang(int[] a, int target) {
        boolean b = false; // cho cái biến này làm cờ, đừng điếm xỉa tới nó, lát mới thấy
        int n = a.length; // cho n = độ dài của mảng a
        //khởi tạo vòng for lồng nhau vơi i, j
        for (int i = 0; i < n; i++) { // lưu ý, n là độ dài mảng, phải cho i = 0 và i < n
            for (int j = i + 1; j < n; j++) { // cho j luôn lúc nào cũng lớn hơn i một đơn vị, bởi tránh trùng lập
                //bởi bài toán Two Sum không cho 2 số trùng nhau cộng lại - trùng vị trí, nghĩa là tự nó cộng chính nó
                //ví dụ a[0] + a[0] ---> trùng , tự mình cộng mình (khi i = j )
                //if(a[j] == 0) continue;
                if (a[i] + a[j] == target) {
                    b = true; //Lúc nó thỏa mãn thì b "đảo mặt" thành true
                    System.out.println(a[i] + " + " + a[j] + " = " + target
                            + " tại vị trí a[" + i + "]" + " và a[" + j + "]");
                }

            }

        }
        if (!b) { //cái b mặt định tự động nó là TRUE, sau khi 2 cái vòng lập nó chạy banh xác mà không thấy mục tiêu thì nó sẽ chạy xuống
            System.out.println("Không tìm thấy số nào cộng để tạo ra " + target);
        }
    }

}
