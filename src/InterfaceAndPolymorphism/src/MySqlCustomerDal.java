package InterfaceAndPolymorphism.src;

public class MySqlCustomerDal implements ICustomerDal, IRepository{

    @Override
    public void Add() {
        System.out.println("My Sql eklendi");
    }

    @Override
    public void Ekle() {
        System.out.println("My Sql eklendi by IRepository");
    }
}
