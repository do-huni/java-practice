package GoodTicketApp;

public class Ticket{
    private long fee;
    
    public Ticket(){
        this(1000l);
    }
    public Ticket(long fee){
        this.fee = fee;
    }
    public long getFee(){
        return fee;
    }
}