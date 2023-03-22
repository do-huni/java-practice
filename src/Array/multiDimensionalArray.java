import java.util.*;
class multiDimensionalArray{
    public static void main(String[] args){
        //2차원 배열 선언
        int[][] score = new int[4][3]; //(4,3) shape의 2d array
        //2차원 배열 초기화
        int[][] arr1 = new int[][]{{1,2,3},{4,5,6}};
        int[][] arr2 = {{1,2,3},{4,5,6}}; //new int 생략
        
        System.out.println(arr2.length); //2
        System.out.println(arr2[0].length); //3
        
        
        //성적 테이블
        int[][] myScore = {
            {100, 100, 100},
            {20,20,45},
            {60,40,30},
            {40,60,80},
            {60,20,70}
        };
        
        int korTotal = 0, engTotal = 0, mathTotal = 0;
        System.out.println("번호  국어  영어  수학  총점  평균");
        System.out.println("==================================");
        
        for(int i = 0; i<myScore.length; i++){
            int sum = 0;
            double avg = 0;
            System.out.printf("%3d", i+1);
            korTotal += myScore[i][0];
            engTotal += myScore[i][1];
            mathTotal += myScore[i][2];
            for (int j = 0; j<myScore[i].length; j++){
                sum += myScore[i][j];
                System.out.printf("%6d", myScore[i][j]);
            }
            avg = sum / myScore[i].length;
            System.out.printf("%6d %6.1f \n", sum, avg);
        }
        System.out.println("==================================");
        System.out.printf("총점:%4d%6d%6d\n",korTotal, engTotal, mathTotal);
     
        
        //가변 배열
        int[][] arr = new int[10][];
        arr[0] = new int[5];
        arr[1] = new int[7];
        arr[2] = new int[10];
        arr[3] = new int[] {5,3,2,8};
        for (int i =0; i<arr.length; i++){
            System.out.println(Arrays.toString(arr[i]));
        }
        
        //innerProduct
        System.out.println("INNER PRODUCT");
        System.out.println("==================================");
        int[][] matrix1 = {
            {1,6,8},
            {7,5,2}
        };
        int[][] matrix2 = {
            {5,2},
            {2,8},
            {2,7}
        };
        int[][] resultArr = new int[matrix1.length][matrix2[0].length];
        for (int i = 0; i<matrix1.length; i++){
            for(int j = 0; j<matrix2.length; j++){
                for (int k = 0; k<matrix1.length; k++){
                    //System.out.printf("i: %d, j: %d, k: %d\n", i, j, k);
                    resultArr[i][k] += (matrix1[i][j]*matrix2[j][k]);
                }
            }
        }
        for(int i = 0; i<matrix2.length; i++){
            if (i < 2){
                System.out.print(Arrays.toString(matrix1[i]) + '\t');                                
            } else{
                System.out.print("\t\t");
            }
            System.out.print(Arrays.toString(matrix2[i]) + '\t');
            if (i < 2){
                System.out.print(Arrays.toString(resultArr[i]) + '\n');                
            }            
        }
    }
}