package BadTicketApp;

public class Theater{
    private TicketSeller ticketSeller;
    
    public Theater(TicketSeller ticketSeller){
        this.ticketSeller = ticketSeller;
    }
    
    public void enter(Audience audience){
        if(audience.getBag().hasInvitation()){
            Ticket ticket = ticketSeller.getTicketOffice().getTicket();
            audience.getBag().setTicket(ticket);
            System.out.println("티켓을 주고 입장했음");
        } else{
            Ticket ticket = ticketSeller.getTicketOffice().getTicket();
            audience.getBag().minusAmount(ticket.getFee());
            ticketSeller.getTicketOffice().plusAmount(ticket.getFee());
            audience.getBag().setTicket(ticket);
            System.out.println("티켓을 사서 입장했음");            
        }
    }
}