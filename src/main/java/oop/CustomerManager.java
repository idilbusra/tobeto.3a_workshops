package oop;

import oop.Customer;

public class CustomerManager {
    private Customer customer;
    private ICreditManager iCreditManager;
    public CustomerManager(Customer customer, ICreditManager iCreditManager){
        this.customer = customer;
        this.iCreditManager = iCreditManager;

    }

    public void save(){
        System.out.println("Musteri kaydedildi.");
    }
    public void delete(){
        System.out.println("Musteri silindi.");
    }
    public void giveCredit(){
        iCreditManager.calculate();
        System.out.println("Kredi verildi.");

    }







}
