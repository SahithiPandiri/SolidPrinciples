package com.example.violation;
 class ReadOnly implements BookManagementSystem{
    int c=0;
    public boolean isAvailable() {

        if (c == 0) {
            return true;
        } else {
            return false;
        }
    }
     public void addBook(){
         System.out.println("Book Successfully Added ");
     }
     public void getBookDetails(){
         System.out.println("The details of the book are:");
     }
     public void issueBook(){
         System.out.println("Books cannot be issued");
     }
     public void getPrice(){

     }
}
