package GoodTicketApp;

public class Bag{
    private Long amount;
    private Invitation invitation;
    private Ticket ticket;
    //constructors
    public Bag(long amount){
        this(null, amount);
    }
    public Bag(Invitation invitation, long amount){
        this.invitation = invitation;
        this.amount = amount;
    }
    //methods
    public Long hold(Ticket ticket){
        if (hasInvitation()){
            System.out.println("Bag: 가방안에 초대장이 있어서 " + ticket + "을 무료로 얻습니다." );
            setTicket(ticket);
            return 0L;
        } else{
            setTicket(ticket);
            minusAmount(ticket.getFee());
            System.out.println("Bag: 가방안에 초대장이 없어서 " + ticket + "을" + ticket.getFee() +"를 지불하고 얻습니다." );            
            return ticket.getFee();
        }    
    }

    private boolean hasInvitation(){
        return invitation != null;
    }
    
    private boolean hasTicket(){
        return ticket != null;            
    }
    
    private void setTicket(Ticket ticket){
        this.ticket = ticket;
    }
    
    private void minusAmount(Long amount){
        this.amount -= amount;
    }
    private void plusAmount(Long amount){
        this.amount += amount;
    }
}