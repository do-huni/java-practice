import java.util.*;

class arrayBasic{
    public static void main(String[] args){
        int[] score; //int배열 score 선언
        score = new int[5]; //5 크기의 배열을 생성. 각 인덱스에는 기본적으로 0이 들어있음.
        
        /* score변수는 참조 변수.
        실제 값을 가지는 것이 아니라 배열의 값이 저장되어있는 주소를 담고있다.
        따라서 score를 그대로 출력 시 '타입@주소'형태의 문자열이 출력된다. '*/
        System.out.println(score);
        
        //예외로 char배열은 요소가 그대로 출력됨
        char[] charArr = {'a','b','c','d','e','f'};
        System.out.println(charArr);
        score[1] = 50;
        score[0] = 20;
        score[4] = 120;
        score[3] = 100; //인덱스 접근 파이썬과 동.
        int value = score[3];
        
        System.out.println(score.length); //길이 확인
            
        //배열 생성 + 초기화
        int[] score2 = new int[]{40,50,60,70,80};
        int[] score3 = {10,20,30,40,50,60,70,80}; //new int[] 생략
        
        System.out.println(Arrays.toString(score2)); //배열을 문자열로 바꾸는 매서드
        
        //배열의 복사. 크기 키우기
        int[] arr = {1,2,3,4,5};
        int[] tmp = new int[arr.length*2];
        
        for (int i = 0; i < arr.length; i++){
            tmp[i] = arr[i];
        }
        arr = tmp;
        System.out.println(Arrays.toString(arr));
        
        /*
        System.arraycopy(num, num_index, newNum, new_index, num.length);
        배열 num의 num_index부터 num.length 개의 데이터를 newNum의 new_index부터 쭈루룩 복사해 저장한다.
        */
        
        char[] abc = {'q','w','e','r','평','q','땅'};
        char[] num = {'1','2','3','4','5','6','7','8','9'};
        System.arraycopy(abc, 4, num, 3, 3);
        System.out.println(Arrays.toString(num));
        System.out.println("-------------------------------");
        System.out.printf("score: \n%s\n", Arrays.toString(score));        
        //평균 구하기
        int sum = 0;
        for (int i = 0; i<score.length; i++){
            sum += score[i];
        }
        System.out.printf("sum: %d\n", sum);
        System.out.printf("mean: %f\n", (sum / (float) score.length));
        
        int max = score[0];
        int min = score[1];
        for (int i = 0; i < score.length; i++){
            if (max < score[i]){
                max = score[i];
            }
            if (min > score[i]){
                min = score[i];
            }
        }
        System.out.printf("max: %d\nmin: %d\n", max, min);
        System.out.println("-------------------------------");
        //로또번호 추첨
        int[] ball = new int[45];
        for(int i=0; i<ball.length; i++){
            ball[i] = i+1;
        }
        int temp = 0;
        int j = 0;
        for (int i = 0; i<6; i++){
            j = (int)(Math.random()*45);
            temp = ball[i];
            ball[i] = ball[j];
            ball[j] = temp;
        }
        System.out.println(Arrays.toString(Arrays.copyOfRange(ball, 0, 6)));
        System.out.println("-------------------------------");
        //배열에서 임의의 원소 추출하기
        int[] arrPop = new int[10];
        for (int i = 0; i < arrPop.length; i++){
            int tmp1 = (int)(Math.random()*score.length);
            arrPop[i] = score[tmp1];
            
        }
        System.out.println(Arrays.toString(arrPop));
    }
}