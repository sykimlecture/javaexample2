package java0321;

public class ArrayEx {
    public static void main(String[] args) {
        int array[] = new int[5];
        int size = array.length;
        System.out.println(size);
        int intArray[] = {1, 2, 3, 4, 5, 6};
        for (int i = 0; i < intArray.length; i++) {
            System.out.println("intArray[" + i +"] = " + intArray[i]);
        }

        String strArr[] = {"강아지","고양이","개구리","병아리","토끼"};
        for (String str : strArr) {
            System.out.println(str);
        }
        for (int i = 0; i < strArr.length; i++) {
            System.out.println("strArr[" + i +"] = " + strArr[i]);
        }

        // 2차원 배열
        int intArray2[][] = new int[2][5];
        System.out.println("intArray2.length : "+ intArray2.length);
        System.out.println("intArray2[0].length : "+ intArray2[0].length);
        System.out.println("intArray2[1].length : "+ intArray2[1].length);

    }
}
