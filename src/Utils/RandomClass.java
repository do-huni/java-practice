import java.util.Random;

class RandomClass {
    public static void main(String[] args){
        Random rand = new Random();
        
        System.out.println(rand.nextBoolean());

        System.out.println(rand.nextDouble());
        
        System.out.println(rand.nextFloat());
        
        System.out.println(rand.nextGaussian());
        
        System.out.println(rand.nextInt());
        
    }
}