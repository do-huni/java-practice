class iterationStatement{
    public static void main(String[] args){
        //for문: js와 동.
        //예제 생략
        
        /*enhanced for statement
        for(int tmp : arr){
            ...code
        }
        #Java에는 for i in arr이 존재 X. 
        #(int var : iteration) 으로 대체.
        */
        
        int[] arr = {1,2,3};
        for (int i : arr){
            System.out.println(i);
        }
        
        //while문. js/python과 동.
        int i = 10;
        while(i-- != 0){
            System.out.println(i);
        }
        
        /*java의 무한 반복문
        [for문] for(;;){
            if (condition) {
                break;
            }
        }
        
        [while문] while(true){
            if (condition) {
                break;
            }
        }
        */
        
       //누적합 while문
        int sum = 0;
        int j = 0;
        while((sum += ++j) <= 100){
            System.out.printf("%d, %d \n", j, sum);
        }
        
        //do-while 문
        boolean flag = true;
        do{
            System.out.println("일단 무조건 한번 실행함");
            flag = false;
        } while(flag);
        
        //continue 문 python과 동.
        //break 문 python과 동.
        
        //for문에 이름붙이기. break/continue와 연동.
        loop1 : for (;;){
            for(;;){
                System.out.println("이중 for문 동시에 끝내기");
                break loop1;
            }
        }
    }
}