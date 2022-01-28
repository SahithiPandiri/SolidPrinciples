package com.example.validation;
class ReadOrTake extends ReadOnly implements Issue{
    Availability a;
    ReadOrTake(Availability a)
    {
        this.a=a;
    }
    public void issueBook(){
        if(a.isAvailable()){
            System.out.println("Book SuccessFully Issued");
        }
        else{
            System.out.println("No Book Found!");
        }
    }
}