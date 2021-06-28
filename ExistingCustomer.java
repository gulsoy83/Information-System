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
public class ExistingCustomer extends Customer {
    private Subscription subscription;

    public ExistingCustomer(String CitizenshipNr) {
        super(CitizenshipNr);
    }

    public ExistingCustomer(String CitizenshipNr, Subscription subscription) {
        super(CitizenshipNr);
        this.subscription = subscription;
    }

    public Subscription getSubscription() {
        return subscription;
    }

    public void setSubscription(Subscription subscription) {
        this.subscription = subscription;
    }
    
}
