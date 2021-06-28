/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package is;

import java.util.Date;


public class Subscription {
    private Date subscriptionStartDate;
    private SubscriptionPlan subscriptionPlan;

    public Subscription(Date subscriptionStartDate, SubscriptionPlan subscriptionPlan) {
        this.subscriptionStartDate = subscriptionStartDate;
        this.subscriptionPlan = subscriptionPlan;
    }

    public Date getSubscriptionStartDate() {
        return subscriptionStartDate;
    }

    public void setSubscriptionStartDate(Date subscriptionStartDate) {
        this.subscriptionStartDate = subscriptionStartDate;
    }

    public SubscriptionPlan getSubscriptionPlan() {
        return subscriptionPlan;
    }

    public void setSubscriptionPlan(SubscriptionPlan subscriptionPlan) {
        this.subscriptionPlan = subscriptionPlan;
    }
    
}
