class SingleInheritance{
    public static void main(String[] args){
        TVCR tvcr = new TVCR();
        
        tvcr.play();
        tvcr.stop();
        tvcr.channel = 24;
        tvcr.channelDown();
        System.out.println(tvcr.channel);
    }}

    class Tv{
        int channel;
        boolean power;
        
        void power()        {power = !power;}
        void channelUp()    {channel += 1;}
        void channelDown()  {channel -= 1;}
    }
    class VCR{
        void play()    {System.out.println("재생중");}
        void stop()    {System.out.println("재생종료");}
        
    }
    class TVCR extends Tv{
        VCR vcr = new VCR();
        
        void play(){
            vcr.play();
        }
        void stop(){
            vcr.stop();
        }
    }