package com.brandon;

public class DomeArrayfanzhuan {
   /* public static void main(String[] args) {
        int data[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int temp[] = new int []{11,22,33,44,55,66,77,88,99};
        arrayCopy(data,5,temp,6,3);
        for(int a:temp){
            System.out.print(a+"\t");
        }
**/
/*        for (int a : data) {
            System.out.print(a + "\t");
        }
        System.out.println();
        int center = data.length / 2;
        int head = 0;
        int tail = data.length - 1;
        for (int x = 0; x < center; x++) {
            int temp = data[head];
            data[head] = data[tail];
            data[tail] = temp;
            head++;
            tail--;
       }**/
    //for (int a : data) {
    //   System.out.print(a + "\t");
    //}
    //}

    /*public static void arrayCopy(int src [] ,int insrc, int drc[],int indrc,int length) {
        for(int x = 0;x < length;x ++){
            drc [indrc ++] = src[insrc ++];
        }
    }**/

    public static int sum(int ... data){
        int sum = 0;
        for(int x :data){
            sum += x;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(1,2,3,4,5,6,7,8));
    }
}
