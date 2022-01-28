package com.example.violation;
class ReadOrTake implements BookManagementSystem{
    int c=0;
    public boolean isAvailable(){
        if(c==0){
            return true;
        }
        else{
            return false;
        }
    }
    public void addBook(){
        System.out.println("Book Successfully Added ");
    }

    public void getBookDetails(){
        if(isAvailable()) {
            System.out.println("The details of the book are:");
        }
        else{
            System.out.println("No Book Found");
        }
    }
    public void issueBook() {
        if (isAvailable()) {
            System.out.println("Book has been successfully issued");
        } else {
            System.out.println("No Book Found");
        }

    }
    //a new method getQuantity has to be Implemented
    public void getQuantity(){
        if(isAvailable()){
            System.out.print("The Number of Books present are:");
        }
        else{
            System.out.println("No Book Found");
        }
    }
    public void getPrice(){
        System.out.print("The Price of the Book is:");
    }
    public void viaGooglePay(){
        System.out.print("Done Through GooglePay");
    }
    public void viaPhonePay(){
        System.out.print("Done Through PhonePay");
    }
    public void viaPaytm(){
        System.out.print("Done Through Paytm");
    }

}

