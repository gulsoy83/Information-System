/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package is;

/**
 *
 * @author Muhammed
 */
public interface ServiceProvider {
    public void addSubscriptionPlan(SubscriptionPlan eklenecekplan);
    public SubscriptionPlan findSubscriptionPlan(String key);
    public String getName();
    public void setName(String isim);
    
    
}
