package java0321;

public class MethodReturn {
    public static int[] makeArray() {
        int temp[] = new int[20];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = i;
        }
        return temp;
    }
    public static void main(String[] args) {
        int intArray[] = makeArray();
        int sum = 0;
        for (int i : intArray) {
            sum += i;
            System.out.println(i);
        }
        System.out.println();
        System.out.println(sum);

    }
}
