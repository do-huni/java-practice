class Varargs{
    public static void main(String[] args){
        System.out.println(concatenate("-","100","200","300","500"));
        System.out.println(concatenate("-")); // 인자가 없어도 에러X
        System.out.println(concatenate(",",new String[]{"A","B","C","D"}));
    }
    
    /*가변인자 사용 시 매개변수 중 가장 마지막에 선언해야 함*/
    static String concatenate(String delim, String... args){
        String result = "";
        
        /*가변인자의 원리는 입력받은 값들을 배열로 변환시키는 것*/
        for (String str : args){
            result += str + delim;
        }

        result = (result.length() != 0)?result.substring(0, result.length()-1): result;
        return result;
    }
}