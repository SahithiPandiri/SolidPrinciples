package com.example.validation;

public class Payment implements PaymentDetails{
    PaymentProcessing paymentTool;
    public Payment(PaymentProcessing pp){
        this.paymentTool=pp;
    }
   public  void getPrice(){
        System.out.print("The Price of the Book is");
    }

    @Override


    public void paymentMethod(String method) {

       if(method.equalsIgnoreCase("Gpay")){
           paymentTool.gpay();

           }
       else if(method.equalsIgnoreCase("phonepay")){
           paymentTool.phonePay();

       }
       else if(method.equalsIgnoreCase("paytm")){
           paymentTool.paytm();
       }
       else if(method.equalsIgnoreCase("cash")){
           paymentTool.cash();
       }
       else{
           System.out.print("No Payment through "+method+" is accepted");
       }

    }
}
