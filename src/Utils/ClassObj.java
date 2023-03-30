class ClassObj{
    public static void main(String[] babo){
        Card c1 = new Card(5,"HEART");
        try{
            Card c2 = Card.class.newInstance();
        } catch (Exception e){}

        
        Class cardClassObj = c1.getClass(); //== Card.class
    
        System.out.println(cardClassObj.getName());
        System.out.println(cardClassObj.toGenericString());
        System.out.println(cardClassObj.toString());
        
    }
}

final class Card{
    int number;
    String kind;
    
    Card()    {this(12,"SPADE");}
    Card(int number, String kind){
        this.number = number;
        this.kind = kind;
    }
    
    public String toString(){
        return kind + ":" + number;
    }
}