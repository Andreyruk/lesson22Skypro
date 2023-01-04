package product;

import java.util.HashSet;
import java.util.Set;

public class MainProduct {
    public static void main(String[] args) {
        System.out.println("Домашнее задание 22.");
        System.out.println();
        //Map<product.Product, product.Product> products = new HashMap<>();
        Set<Product> productSet = new HashSet<>();

        Product products = new Product();
        products.setName("банан");
        products.setAmount(10.0);
        products.setPrice(100.0);

        Product products2 = new Product();
        products2.setName("свекла");
        products2.setAmount(101.0);
        products2.setPrice(1001.0);

        Product products3 = new Product();
        products3.setName("лимон");
        products3.setAmount(10.0);
        products3.setPrice(50.0);

        Product products4 = new Product();
        products4.setName("киви");
        products4.setAmount(10.0);
        products4.setPrice(00.0);

        Product products5 = new Product();
        products5.setName("яблоки");
        products5.setAmount(20.0);
        products5.setPrice(70.0);

        addProduct(productSet, products);
        addProduct(productSet, products2);
        addProduct(productSet, products3);
        addProduct(productSet, products4);
        addProduct(productSet, products5);

        removeProduct(productSet, products2);
//        productSet.remove(products2);
        System.out.println(String.format("продукт %s уже куплен и удалён из списка", products2));
        System.out.println("Общая цена всех продуктов: " + sum(productSet));

        for (Product p : productSet) {
            System.out.println(p);
        }
        System.out.println();

        Set<Receipt> receipt = new HashSet<>();

        Receipt receipt1 = new Receipt();
        receipt1.setName("рецепт1");
        receipt1.setProducts(productSet);
        receipt1.setSum(sum(productSet));
        receipt1.setAmount(sumAmount(productSet));
        Receipt receipt2 = new Receipt();
        receipt2.setName("рецепт2");
        receipt2.setProducts(productSet);
        receipt2.setSum(sum(productSet));
        receipt2.setAmount(sumAmount(productSet));

        addReceipt(receipt, receipt1);
        addReceipt(receipt, receipt2);

        for (Receipt pr : receipt) {
            System.out.println(pr);
        }
    }

    public static void addProduct(Set<Product> productSet, Product value) {
        if (value.getName() == null || value.getName().isBlank() || value.getName().isEmpty()) {
            throw new RuntimeException("у продукта не заполнено наименование");
        }
        if (productSet.contains(value)) {
            throw new RuntimeException(String.format("продукт %s уже есть в списке", value.getName()));
        }
        if (value.getAmount() == 0 || value.getPrice() == 0) {
            System.out.println(String.format("Заполните все параметры у продукта %s", value.getName()));
        } else {
            productSet.add(value);
        }
    }

    public static void removeProduct(Set<Product> productSet, Product value) {
        productSet.remove(value);
    }

    public static double sum(Set<Product> productSet) {
        double s = 0;
        for (Product p : productSet) {
            s += p.getPrice();
        }
        return s;
    }

    public static void addReceipt(Set<Receipt> receipt, Receipt value) {
        if (value.getName() == null || value.getName().isBlank() || value.getName().isEmpty()) {
            throw new RuntimeException("нет названия рецепта");
        }
        if (receipt.contains(value)) {
            throw new RuntimeException(String.format("рецепт: %s уже есть в списке", value.getName()));
        }else {
            receipt.add(value);
        }
    }

    public static double sumAmount(Set<Product> productSet) {
        double a = 0;
        for (Product pr : productSet) {
            a += pr.getAmount();
        }
        return a;
    }
}