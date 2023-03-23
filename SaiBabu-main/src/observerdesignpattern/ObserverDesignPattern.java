/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerdesignpattern;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *This application gives the weather update to 
 * the news channels, newspaper agency and weather sites.
 * @author Dell
 */
public class ObserverDesignPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            
            WeatherBroadcasting broadcast = new WeatherBroadcasting();
            Observer obs1 = new NewsAgency();
            Observer obs2 = new NewsChannels();
            Observer obs3 = new WebsitesWeather();
            // add the agencies in weather broadcasting.
            broadcast.registerObserver(obs1);                                                                                                                                      
            broadcast.registerObserver(obs2);
            broadcast.registerObserver(obs3);
            // Change the temperature of Weather 
            broadcast.changeTemp(30);
            
            broadcast.unregisterObserver(obs3);
            //  update weather about 2 minutes 
            System.out.println("Weather updates after 2 minutes: ");
            Thread.sleep(10000);
            // Again change the temperature of weather
            broadcast.changeTemp(33);

            
        } catch (InterruptedException ex) {
            Logger.getLogger(ObserverDesignPattern.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
}
