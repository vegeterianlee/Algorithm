/*
import java.util.Scanner;
import java.util.Arrays;

class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];
        if((arr1.length != arr2.length)&&(arr1[0].length!=arr2[0].length)){
            return answer;
        }
        for (int i=0; i< arr1.length; i++){
            for (int j=0; j<arr1[0].length; j++){
                answer[i][j]= arr1[i][j]+arr2[i][j];
            }
        }
        return answer;
    }



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Solution input = new Solution();
        System.out.println("첫번째 배열의 Row 입력");
        int inputNumber1 = scan.nextInt();
        System.out.println("첫번째 배열의 Column 입력");
        int inputNumber2 = scan.nextInt();
        System.out.println("두번째 배열의 Row 입력");
        int inputNumber3 = scan.nextInt();
        System.out.println("두번째 배열의 Column 입력");
        int inputNumber4 = scan.nextInt();
        int[][]array1 = new int[inputNumber1][inputNumber2];
        int[][]array2 = new int[inputNumber3][inputNumber4];
        for(int i = 0; i < inputNumber1; ++i) {
            for(int j = 0; j < inputNumber2; ++j) {
                System.out.println("("+i+","+j+")"+"배열에 입력할 정수(양수)를 하나씩 입력하세요 : ");
                array1[i][j] = scan.nextInt();
            }
        }
        for(int i = 0; i < inputNumber3; ++i) {
            for(int j = 0; j < inputNumber4; ++j) {
                System.out.println("("+i+","+j+")"+"배열에 입력할 정수(양수)를 하나씩 입력하세요 : ");
                array2[i][j] = scan.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(array1));
        System.out.println(Arrays.deepToString(array2));
        System.out.println(Arrays.deepToString(input.solution(array1,array2)));
    }





}*/
