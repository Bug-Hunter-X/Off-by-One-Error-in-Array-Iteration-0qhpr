public class MyClass {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i = 0; i <= arr.length; i++) { // Bug: Should be i < arr.length
            arr[i] = i * 2;
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}