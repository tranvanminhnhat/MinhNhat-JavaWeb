package b03_mang_va_phuong_thuc_trong_java.bai_tap.phan_tu_nho_nhat_trong_mang;

public class MaxInArray {
    public static void main(String[] args) {
        int[] arr = {1,4,2,9,11,0,-100,1000};
        int min = arr[0];
        for (int i = 1; i < arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println("The smallest element in array is " + min);
    }
}
