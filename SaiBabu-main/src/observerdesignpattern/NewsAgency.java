/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerdesignpattern;

/**
 *
 * @author Dell
 */
public class NewsAgency implements Observer{
    
    @Override
    public void UpdateWeather(int temperature){
        
            System.out.println("News Agency updates current temperature as: "+ temperature + " degrees");
            }
}
