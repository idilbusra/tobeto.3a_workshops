package oop;

import oop.*;

public class Program {

    public static void main(String[] args) {
        CreditManager creditManager = new CreditManager();
        Company company1 = new Company(1,"Bursa","Simple Three",101010);
        Person person1 = new Person(2,"Ankara","Busra","Idil","Turkish");
        person1.setCity("Istanbul");
        company1.setCompanyName("Kodlama.io");

        CustomerManager customerManager = new CustomerManager(company1,new MilitaryCreditManager());
        customerManager.giveCredit();



    }
}
