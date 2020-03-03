package funcional_lambda.consumer.exemplo.utils;

import funcional_lambda.consumer.exemplo.entities.Product;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class PriceUpdate implements Consumer<Product> {

    @Override
    public void accept(Product product) {
        product.setPrice(product.getPrice() * 1.1);
    }
}
