package StaticClasses.src;

public class Main {
    public static void main(String[] args) {
        ProductManager manager = new ProductManager();
        Product product = new Product();
        product.name = "emin";
        product.price = 999999;
        product.id = 1;

        ProductValidator.bisey();
        manager.add(product);

        DatabaseHelper.Crud.delete();
    }
}