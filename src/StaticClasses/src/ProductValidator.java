package StaticClasses.src;

public class ProductValidator {

    static {
        System.out.println("Static yapıcı block çalıştı");
    }

    public ProductValidator() {
        System.out.println("Yapıcı blok çalıştı");
    }

    public static boolean isValid(Product product) {
        if (product.price > 0 && !product.name.isEmpty()) {
            return true;

        } else {
            return false;
        }
    }
    public static void bisey(){
        System.out.println("Biseyys");
    }
}
