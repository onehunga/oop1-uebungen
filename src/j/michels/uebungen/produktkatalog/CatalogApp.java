package j.michels.uebungen.produktkatalog;

public class CatalogApp {
    public static void main(String[] args) {
        final Catalog catalog = new Catalog();
        catalog.createProduct(new Product(10, "a", ""));
        catalog.createProduct(new Product(69, "b", ""));
        catalog.createProduct(new Product(5, "c", ""));
        catalog.createProduct(new Product(1, "d", ""));

        final Product c = catalog.cheapest().orElseThrow();
        System.out.println("cheapest: " + c.getName());
        catalog.deleteProduct(2);
        catalog.deleteProduct(c);
        System.out.println("cheapest: " + catalog.cheapest().orElseThrow().getName());
    }
}
