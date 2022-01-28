package com.example.validation;

class ReadOnly extends AddingBook{
    Availability a;
    ReadOnly(){
        Availability a;
    }
    ReadOnly(Availability a){
        this.a=a;
    }
    void readBook(){
        int c=0;
        if(c==0|| a.isAvailable()){
            System.out.println("Book SuccessFully Read");
        }
        else{
            System.out.println("No Book Found!");
        }

    }
}
