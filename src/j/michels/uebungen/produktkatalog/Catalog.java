package j.michels.uebungen.produktkatalog;

import java.util.Optional;

public class Catalog {
    private final Product[] products = new Product[100];

    public boolean createProduct(Product product) {
        for (int i = 0; i < products.length; ++i) {
            if(products[i] == null) {
                products[i] = product;
                return true;
            }
        }
        return false;
    }

    public void deleteProduct(Product product) {
        for(int i = 0; i < products.length; i++) {
            if(products[i] != null && products[i].equals(product)) {
                deleteProduct(i);
                break;
            }
        }
    }

    public void deleteProduct(int idx) {
        products[idx] = null;
    }

    public Optional<Product> cheapest() {
        return first().map(product -> {
            for (Product p : products) {
                if (p != null && p.getPrice() < product.getPrice()) {
                    product = p;
                }
            }
            return product;
        });
    }
    public Optional<Product> priciest() {
        return first().map(product -> {
            for (Product p : products) {
                if (p != null && p.getPrice() > product.getPrice()) {
                    product = p;
                }
            }
            return product;
        });
    }

    private Optional<Product> first() {
        for(Product p : products) {
            if(p != null) {
                return Optional.of(p);
            }
        }
        return Optional.empty();
    }
}
