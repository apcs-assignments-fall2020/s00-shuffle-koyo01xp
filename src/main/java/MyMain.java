
public class MyMain {

    // Shuffles an array, using the perfect shuffle algorithm
    public static int[] perfectShuffle(int[] arr) { 
        int[] list1 = new int[arr.length/2]; 
        int[] list2 = new int[arr.length/2];
        int[] list3 = new int[arr.length];

        for(int i = 0;i<arr.length/2;i++) {
            list1[i] = arr[i];
            //first half of total list
        }
        for(int j = 0;j<arr.length/2;j++) {
            list2[j] = arr[j+5]; //second half of total list
        }  
        for(int a = 0;a<arr.length/2;a++){ //even number
            list3[a*2] = list1[a];
        }
        for(int b = 0;b<arr.length/2;b++){ //odd number
            list3[b*2+1] = list2[b];
        }
        return list3;
    }

    public static int rng(int a,int b){
        return (int)((b-a+1)*Math.random())+a;
    }
    // Shuffles an array, using the selection shuffle algorithm
    public static int[] selectionShuffle(int[] arr) { 
        for(int i =0;i<arr.length;i++){
            int a = rng(0,arr.length-1);
            int b = arr[a];
            int c = arr[i];
            arr[i] = b;
            arr[a] = c;
        }
        return arr;
    }


    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9,10};
        int [] arr2 = perfectShuffle(arr);
        for(int i = 0;i<arr2.length;i++){
            System.out.println(arr2[i]);
        }
        int [] arr3 = selectionShuffle(arr);
        for(int i = 0;i<arr3.length;i++){
            System.out.println(arr3[i]);
        }
    }
}
