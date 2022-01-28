package com.example.validation;
import java.util.*;
public class HelloApplication{
    public static void main(String args[]){
        ReadOnly rd= new ReadOnly(new Availability());
        rd.readBook();
        ReadOrTake rt= new ReadOrTake(new Availability());
        rt.issueBook();
        System.out.println("Enter Payment Method");
        Scanner sc= new Scanner(System.in);
        String method=sc.next();
        Payment p= new Payment(new PaymentProcessing());
        p.paymentMethod(method);
    }
}

