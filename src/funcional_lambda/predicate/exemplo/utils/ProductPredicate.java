package funcional_lambda.predicate.exemplo.utils;

import funcional_lambda.predicate.exemplo.entities.Product;

import java.util.function.Predicate;

public class ProductPredicate implements Predicate<Product> {

    @Override
    public boolean test(Product product) {
        return product.getPrice() >= 100.0;
    }
}
