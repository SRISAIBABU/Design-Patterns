/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerdesignpattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dell
 */
public class WeatherBroadcasting implements Subject{
    
    private List<Observer> lstobservers;
    private int temp;
    
    public WeatherBroadcasting()
    {
        lstobservers = new ArrayList<Observer>();
    }
    @Override
    public void registerObserver(Observer obs){
        lstobservers.add(obs);
    }
    @Override
    public void unregisterObserver(Observer obs){
       lstobservers.remove(obs);
    }
    @Override
    public void notifyObserver(){
         for(Observer ob : lstobservers){
            ob.UpdateWeather(temp);
        }
    }
    
    public void changeTemp(int temp){
        this.temp = temp;
        notifyObserver();
    }
    
}
