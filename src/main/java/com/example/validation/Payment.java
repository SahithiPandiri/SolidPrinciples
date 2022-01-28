package com.example.validation;

public class Payment implements PaymentDetails{
    PaymentProcessing pp;
    public Payment(PaymentProcessing pp){
        this.pp=pp;
    }
   public  void getPrice(){
        System.out.print("The Price of the Book is");
    }

    @Override


    public void paymentMethod(String method) {

       if(method.equalsIgnoreCase("Gpay")){
           pp.gpay();

           }
       else if(method.equalsIgnoreCase("phonepay")){
           pp.phonePay();

       }
       else if(method.equalsIgnoreCase("paytm")){
           pp.paytm();
       }
       else if(method.equalsIgnoreCase("cash")){
           pp.cash();
       }
       else{
           System.out.print("No Payment through "+method+" is accepted");
       }

    }
}
