/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package is;

import java.util.LinkedList;

/**
 *
 * @author Muhammed
 */
public class GSMProvider implements ServiceProvider {

    private String name;
    private LinkedList<SubscriptionPlan> subscriptionPlans;

    public GSMProvider(String name) {
        this.name = name;
         this.subscriptionPlans = new LinkedList <SubscriptionPlan>();
        
    }
    
    @Override
    public void addSubscriptionPlan(SubscriptionPlan eklenecekplan) {
        subscriptionPlans.add(eklenecekplan);
    }

    @Override
    public SubscriptionPlan findSubscriptionPlan(String key) {
       for(int i=0 ; i< subscriptionPlans.size(); i++){
           SubscriptionPlan temp = subscriptionPlans.get(i);
           if(temp.getName().equals(key)){
               return temp;
           }
       }
       return null;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String isim) {
      this.name = isim;
    }
    
}
