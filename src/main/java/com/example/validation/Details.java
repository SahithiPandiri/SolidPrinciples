package com.example.validation;

class Details extends Availability{
    void getDetails(){
        if(isAvailable()){
            System.out.println("Book Details are:");
        }
        else{
            System.out.println("No Book Found!");
        }
    }
    void getQuantity(){
        if(isAvailable()){
            System.out.println("Number of Books present are:");
        }
        else{
            System.out.println("No Book Found!");
        }

    }
}
