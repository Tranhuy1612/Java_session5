
import java.util.Arrays;
import java.util.Scanner;

/**
 * cho sẵn 3 danh danh sách số nguyên;
 * hiển thị 1 menu với các lựa chọn sau:
 * 1 hiển thị 3 mảng số nguyên
 * 2.hiển thị mảng đc gộp từ 2 mảng số nguyên, lựa chọn được mảng để gộp
 * 3. hiển thị mảng được gộp 3 mảng số ngyên
 * 4. chọn 1 mảng số nguyên để in ra
 * 4.1 thêm 1 phần tử vào cuối
 * 4.2 thêm 1 phần tử vào đầu
 * 4.3 xóa 1 phần tử ở vị trí đc chọn
 * 5. dừng chương trình
 * <p>
 * chương trình được lặp lại cho đến khi chọn 5.
 */
public class BtTongHop {

    static Scanner scanner = new Scanner(System.in);
    static int[] arr1 = {1, 2, 3, 4, 5, 6};
    static int[] arr2 = {3, 35, 2, 3, 53};
    static int[] arr3 = {2, 34, 21, 46, 2};

    public static void main(String[] args) {

        int choice = 0;
        while (choice != 5) {
            System.out.println("1. hiển thị các mảng số nguyên");
            System.out.println("2. gộp 2 mảng số nguyên");
            System.out.println("3. gộp 3 mảng số nguyên");
            System.out.println("4. hiển 1 mảng");
            System.out.println("5. dừng chương trình");
            System.out.println("nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    showArr(arr1, "mảng 1:");
                    showArr(arr2, "mảng 2: ");
                    showArr(arr3, "mảng 3: ");
                    break;
                case 2:
                    int[] arr = gopMang();
                    System.out.println("mảng sau khi gộp là: " + Arrays.toString(arr));
                    break;
                case 3:
                    int[] mergedArr = gop3Mang();
                    System.out.println("Mảng sau khi gộp là: " + Arrays.toString(mergedArr));
                    break;
                case 4:
                    System.out.println("Chọn mảng số nguyên để in ra (1, 2, 3): ");
                    int selectedArray = scanner.nextInt();
                    int[] selectedArr = laymang(selectedArray);
                    showArr(selectedArr, "Mảng đã chọn:");
                    //thêm vào cuối mảng
//                    System.out.println("Chọn phần tử để thêm vào cuối mảng:");
//                    int elementToAdd = scanner.nextInt();
//                    selectedArr = themPhanTuCuoi(selectedArr, elementToAdd);
//                    showArr(selectedArr, "Mảng sau khi thêm phần tử:");
                    // thêm vào đầu mảng
//                    System.out.println("Chọn phần tử để thêm vào đầu mảng:");
//                    int elementToAdd = scanner.nextInt();
//                    selectedArr = themPhanTuDau(selectedArr, elementToAdd);
//                    showArr(selectedArr, "Mảng sau khi thêm phần tử:");
                    // xóa phần tử ở vị trí chọn
                    System.out.println("Chọn vị trí phần tử để xóa (từ 0 đến " + (selectedArr.length - 1) + "):");
                    int positionToRemove = scanner.nextInt();
                    selectedArr = xoaPhanTu(selectedArr, positionToRemove);
                    showArr(selectedArr, "Mảng sau khi xóa phần tử:");
                    break;
                case 5:
                    System.exit(0);
            }

        }


    }

    private static int[] gop3Mang() {
        int[] newArr = new int[arr1.length + arr2.length + arr3.length];
        int index = 0;

        for (int i = 0; i < arr1.length; i++) {
            newArr[index] = arr1[i];
            index++;
        }

        for (int i = 0; i < arr2.length; i++) {
            newArr[index] = arr2[i];
            index++;
        }

        for (int i = 0; i < arr3.length; i++) {
            newArr[index] = arr3[i];
            index++;
        }

        return newArr;
    }

//    private static int[] themPhanTuCuoi(int[] arr, int element) {
//        int[] newArr = Arrays.copyOf(arr, arr.length + 1);
//        newArr[newArr.length - 1] = element;
//        return newArr;
//    }

//    private static int[] themPhanTuDau(int[] arr, int element) {
//        int[] newArr = new int[arr.length + 1];
//        newArr[0] = element;
//        System.arraycopy(arr, 0, newArr, 1, arr.length);
//        return newArr;
//    }

    private static int[] xoaPhanTu(int[] arr, int position) {
        int[] newArr = new int[arr.length - 1];
        System.arraycopy(arr, 0, newArr, 0, position);
        System.arraycopy(arr, position + 1, newArr, position, arr.length - position - 1);
        return newArr;
    }


    private static int[] gopMang() {
        System.out.println("nhập 2 mảng bạn muốn gộp: ");
        int choice = scanner.nextInt();
        int[] mang1 = laymang(choice);
        System.out.println("mảng 2: ");
        choice = scanner.nextInt();
        int[] mang2 = laymang(choice);

        int[] newArr = new int[mang1.length + mang2.length];
        for (int i = 0; i < newArr.length; i++) {
            if (i < mang1.length) {
                newArr[i] = mang1[i];
            } else {
                newArr[i] = mang2[i - mang1.length];
            }
        }
        return newArr;
    }

    private static void showArr(int[] arr, String tenmang) {
        System.out.println(tenmang + Arrays.toString(arr));
    }

    private static int[] laymang(int somang) {
        switch (somang) {
            case 1:
                return arr1;
            case 2:
                return arr2;
            case 3:
                return arr3;
        }
        return null;
    }
}