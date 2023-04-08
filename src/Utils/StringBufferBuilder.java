class StringBufferBuilder{
    public static void main (String[] args){
        StringBuffer sb = new StringBuffer(3);
        sb.append("1104510235464").append("YEAH");
        //값이 버퍼를 초과하면 자동으로 더 큰 공간으로 재할당.
        System.out.print(sb.toString() + '\n' + sb.length() + '\n' + sb.capacity() + '\n');
        //+연산으로 출력 불가. 문자열로 바꿔줘야 함.
        
        
        //StringBuilder <- StringBuffer에서 동기화 기능만 제외한 것
        //멀티쓰레드가 아닌 환경의 경우 성능이 조금 더 좋음. 그러나 buffer 성능이 충분히 좋아서 굳이 바꿀 필요는 없음.
        StringBuilder sbb = new StringBuilder("Hello");
        System.out.println(sbb.substring(2,4));
    }
}