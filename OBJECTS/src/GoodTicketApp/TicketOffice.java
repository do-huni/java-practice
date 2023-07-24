package GoodTicketApp;
import java.util.*;

public class TicketOffice{
    private Long amount;
    private List<Ticket> tickets = new ArrayList<>();
        
    public TicketOffice(Long amount, Ticket ... tickets){
        this.amount = amount;
        this.tickets.addAll(Arrays.asList(tickets));        
    }
    
    public Ticket getTicket(){
        System.out.println("TicketOffice: " + tickets.get(0) + "을 줍니다.");
        return tickets.remove(0);
    }
    
    public void minusAmount(Long amount){
        this.amount -= amount;
    }
    
    public void plusAmount(Long amount){
        System.out.println("TicketOffice: 금고에 " + amount + "를 추가합니다." );
        this.amount += amount;
        System.out.println("TicketOffice: 현재 잔고는 " + this.amount);        
    }        
}