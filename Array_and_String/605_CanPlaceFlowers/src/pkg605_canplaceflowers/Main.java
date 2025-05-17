package pkg605_canplaceflowers;

/**
 *
 * @author Minh Triet
 */
public class Main {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        //số lượng hoa đã trồng
        int count = 0;

        for (int i = 0; i < flowerbed.length; i++) {
            // Kiểm tra vị trí HIỆN TẠI( i = 0 ) có trống và các vị trí xung quanh đều trống
            if (flowerbed[i] == 0) {
                //Nếu ở đầu mảng hoặc phía bên trái trống
                boolean emptyLeft = (i == 0) || (flowerbed[i - 1] == 0);
                //Nếu ở cuối mảng hoặc phía bên phải trống
                boolean emptyRight = (i == flowerbed.length - 1) || (flowerbed[i + 1] == 0);

                if (emptyLeft && emptyRight) {
                    flowerbed[i] = 1; // Trồng hoa tại vị trí i
                    count++;        // Tăng số lượng hoa đã trồng

                    // Nếu đã trồng đủ số lượng cần thiết, trả về true
                    if (count >= n) {
                        return true;
                    }
                }
            }

        }
        // Nếu sau khi duyệt hết mảng mà chưa trồng đủ số lượng thì trả về false
        return count >= n;
    }
    public static void main(String[] args) {
        int [] a = {1, 2, 3, 4, 5};
        System.out.println(a.length - 1); // Tìm vị trí cuối của mảng
        
          
        // Ví dụ 1
        int[] flowerbed1 = {1, 0, 0, 0, 1};
        int n1 = 1;
        System.out.println(canPlaceFlowers(flowerbed1, n1)); // Output: true
        
        // Ví dụ 2
        int[] flowerbed2 = {1, 0, 0, 0, 1};
        int n2 = 2;
        System.out.println(canPlaceFlowers(flowerbed2, n2)); // Output: false
    }
    
}
