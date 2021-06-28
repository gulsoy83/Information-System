/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package is;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Muhammed
 */
public class InformationSystem {

    
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("GSM SERVICE PROVIDER?");
        String sprovider = sc.nextLine();
        
        ServiceProvider n1 = new GSMProvider(sprovider);
        System.out.println("NUMBER OF SUBSCRIPTON PLANS?");
        int plansayisi = sc.nextInt();
        sc.nextLine();
        
        if(plansayisi<=0){
            System.out.println("Invalid number.");
            System.exit(-1);
        }
        
        for (int i=0; i<plansayisi; i++){
            System.out.println("NAME OF THE PLAN #"+i);
            String planismi = sc.nextLine();
            SubscriptionPlan newplan = new SubscriptionPlan(planismi,n1);
            n1.addSubscriptionPlan(newplan);
     
        }
        System.out.println(" ");
        System.out.println("CUSTOMER CITIZENSHIP NUMBER?");
        String tc = sc.nextLine();
        
        System.out.println("CUSTOMER NAME?");
        String cname = sc.nextLine();
        
        Customer c1 = new ExistingCustomer(tc);
        c1.setName(cname);
        
        
        System.out.println("NAME OF THE PLAN TO BE SUBSCRIBED?");
        String kaydolacagiplan = sc.nextLine();
        
        SubscriptionPlan splan = n1.findSubscriptionPlan(kaydolacagiplan);
        
        
        
        if(splan==null){
            System.out.println("###The plan you wanted to subscribe is  unavailable at the moment.");
            System.exit(-2);
        }
        
        System.out.println("START DATE FOR SUBSCRIPTION (MM/DD/YYYY)?");
        Date date1=null;
          
        String subdate = sc.nextLine();
        try{
            if(subdate !=null && subdate.trim().length()>0)
                date1 = (new SimpleDateFormat("dd/MM/yyyy")).parse(subdate);
        }catch (ParseException e){
            System.out.println("###You've entered the subscription start date in wrong format.");
            System.exit(-3);
        }    
        
        if(c1 instanceof ExistingCustomer)
          ((ExistingCustomer)c1).setSubscription(new Subscription(date1, splan));
        
        
        
        
        System.out.println(" ");
        System.out.println("CUSTOMER CITIZENSHIP NUMBER = "+ c1.getCitizenshipNr());
        System.out.println("CUSTOMER NAME = "+ c1.getName());
        if(c1 instanceof ExistingCustomer){    
            System.out.println("SERVICE PROVIDER : " + ((ExistingCustomer)c1).getSubscription().getSubscriptionPlan().getServiceProvider().getName()         );
            System.out.println("SUBSCRIPTION START DATE : " +  (new SimpleDateFormat("dd/MM/yyyy")).format(  ((ExistingCustomer) c1).getSubscription().getSubscriptionStartDate()  )  );
            System.out.println("SUBSCRIPTION PLAN NAME : " + ((ExistingCustomer)c1).getSubscription().getSubscriptionPlan().getName());
        }
        sc.close();
    }
    
}
