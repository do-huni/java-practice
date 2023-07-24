package GoodTicketApp;

public class TicketSeller{
    private TicketOffice ticketOffice;
    
    public TicketSeller(TicketOffice ticketOffice){
        this.ticketOffice = ticketOffice;
    }
    
    public TicketOffice getTicketOffice(){
        return ticketOffice;
    }
    
    public void sellTo(Audience audience){
        System.out.println("TicketSeller: " + audience + "에게 티켓을 팝니다.");
        ticketOffice.plusAmount(audience.buy(ticketOffice.getTicket()));
    }
}