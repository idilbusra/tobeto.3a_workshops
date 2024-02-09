package cleancode;

public class Main {
    public static void main(String[] args) {

        Product product1 = new Product(1,"Book",100.0);
        Product product2 = new Product(2,"Pencil",35.0);

        Customer customer1 = new Customer(1,"Engin Demirog");
        Student customer2 = new Student(2,"Busra Idil");

        IBankService iBankService = new CentralBankService();
        ProductManager productManager = new ProductManager(iBankService);
        System.out.println("************");


        productManager.sell(product1,customer1);




    }

}
