public class DomeArray {
    public static void main(String[] args) {
        int date[] = new int[]{1, 3, 5, 7, 9, 2, 4, 6, 8, 10};
        ArratUtil.sort(date);
        ArratUtil.printArray(date);
    }

}


class ArratUtil {
    public static void sort(int data[]) {
        for (int x = 0; x < data.length; x++) {
            for (int y = 0; y < data.length - 1 - x; y++) {
                if (data[y] > data[y + 1]) {
                    int temp = data[y];
                    data[y] = data[y + 1];
                    data[y + 1] = temp;
                }
            }
        }
    }

    public static void printArray(int temp[]) {
        for (int x : temp) {
            System.out.print(x + "\t");
        }
        System.out.println();
    }
}