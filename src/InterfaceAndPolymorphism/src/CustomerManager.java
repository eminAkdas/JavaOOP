package InterfaceAndPolymorphism.src;

public class CustomerManager {

    private ICustomerDal customerDal;

    public CustomerManager(ICustomerDal customerDal) {
        this.customerDal = customerDal;
    }

    private IRepository repository;



    public void Add() {
        // iş kodları burda yazılır
        customerDal.Add();
    }

    public void Ekle() {
        repository.Ekle();
    }
}
