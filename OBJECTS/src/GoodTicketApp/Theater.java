package GoodTicketApp;

public class Theater{
    private TicketSeller ticketSeller;
    
    public Theater(TicketSeller ticketSeller){
        this.ticketSeller = ticketSeller;
    }
    
    public void enter(Audience audience){
        System.out.println("======================================================================================================================");
        System.out.println("Theater: " + audience +"가 입장했습니다.");
        ticketSeller.sellTo(audience);
        System.out.println("======================================================================================================================");
    }
}