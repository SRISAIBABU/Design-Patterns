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
public interface Subject {
    public void registerObserver(Observer obs);
    public void unregisterObserver(Observer obs);
    public void notifyObserver();


}
