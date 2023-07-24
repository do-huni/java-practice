import java.util.*;
import GoodTicketApp.*;

class GoodTicketAppMain{
    public static void main(String[] args){
        
        Bag b1 = new Bag(2000); //초대장 없고 2000원 든 가방
        Audience a1 = new Audience(b1); //b1가방을 지닌 관객 객체
        Audience a2 = new Audience(new Bag(new Invitation(), 3000));
        Ticket[] ticketArr = new Ticket[2];
        Arrays.fill(ticketArr, new Ticket());
        TicketOffice to1 = new TicketOffice(20l,ticketArr);
        TicketSeller t1 = new TicketSeller(to1);
        Theater th1 = new Theater(t1);
        
        th1.enter(a1);       
        th1.enter(a2);        
    }
}