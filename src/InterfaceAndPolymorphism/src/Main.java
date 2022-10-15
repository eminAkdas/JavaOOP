package InterfaceAndPolymorphism.src;

public class Main {
    public static void main(String[] args) {
        var oracleCDal = new OracleCustomerDal();
        CustomerManager customerManager = new CustomerManager(oracleCDal);

        customerManager.Ekle();

    }
}