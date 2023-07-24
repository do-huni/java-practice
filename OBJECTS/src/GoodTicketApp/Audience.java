package GoodTicketApp;

public class Audience{
    private Bag bag;
    
    public Audience(Bag bag){
        this.bag = bag;
    }
    
    public Long buy(Ticket ticket){
        System.out.println("Audience: " + ticket + "을 삽니다.");
        return bag.hold(ticket);
    }
}