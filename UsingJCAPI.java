/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usingjcapicomparator;

import java.util.*;
/**
 *
 * @author kamaj
 */
public class UsingJCAPI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<TrafficCard> cardUsers = new ArrayList<TrafficCard>();
        RandomString rString = new RandomString(10);
        float genBalance;
        TrafficCard myCard;
        Random r = new Random();
        int i;
        for (i = 0; i < 10; i++) {
            genBalance = ((float) r.nextInt(1000) / 10);
            myCard = new TrafficCard(r.nextInt(100), rString.nextString(), genBalance);
            cardUsers.add(myCard);
            
            
        }
        Collections.sort(cardUsers, new TravellerNumberComparator().reversed());
        
        System.out.println("Alkiot asiakasnumeron mukaisesti pienimmästä suurempaan.");
        
        Iterator itr = cardUsers.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        
        System.out.println();
        
        
        Collections.sort(cardUsers, new BalanceComparator().reversed());
        
        
        System.out.println("Alkiot tilin saldon mukaisesti pienimmästä suurempaan.");
        Iterator itr2 = cardUsers.iterator();
        while (itr2.hasNext()) {
            System.out.println(itr2.next());
        }
        
        System.out.println();
         
        Collections.sort(cardUsers, new TravellerNameComparator().reversed());
        
        
        System.out.println("Alkiot tilin nimen ensimmäisen kirjaimen mukaisesti.");
        Iterator itr3 = cardUsers.iterator();
        while (itr3.hasNext()) {
            System.out.println(itr3.next());
        }
    
        
        
    }
    
}
