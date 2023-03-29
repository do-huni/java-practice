class FinallyBlock{
    public static void main(String[] args){
        try{
            startInstall();
            copyFiles();
            int rand1 = (int)(Math.random()*2);
            if (rand1 == 0){
                System.out.println("정상 설치");
            } else{
                throw new FileCloseException("파일 설치 중 오류");
            }
        } catch (SpaceException e2){
            e2.printStackTrace();
            e2.printCode();
        } catch (FileCloseException e1){
            e1.printStackTrace();
            e1.printCode();
        } finally {
            deleteTempFiles();
        }
    }
    
    static void startInstall(){
        System.out.println("설치에 필요한 파일을 불러옵니다.");
    }
    static void copyFiles()
    throws SpaceException{
        System.out.println("파일들을 복사합니다.");
        if (!spaceMeasure()){
            throw new SpaceException("설치 공간 오류");
        }
    }
    static void deleteTempFiles(){
        System.out.println("임시파일들을 삭제합니다.");
    }
    static Boolean spaceMeasure(){
        int rand1 = (int)(Math.random()*2);
        if (rand1 == 0){
            return false;
        } else{
            return true;
        }
    }
}
class FileCloseException extends Exception{
    final private int errorCode = 101;
    FileCloseException(String msg){
        super(msg);
    }
    void printCode(){
        System.out.println(this.errorCode);
    }
}

class SpaceException extends Exception{
    final private int errorCode = 102;
    SpaceException(String msg){
        super(msg);
    }
    void printCode(){
        System.out.println(this.errorCode);
    }
}