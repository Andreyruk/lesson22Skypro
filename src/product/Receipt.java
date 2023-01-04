package product;

import java.util.Objects;
import java.util.Set;

public class Receipt {
    private String name;
    private Set<Product> products;
    private Double sum;
    private Double amount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }

    public Double getSum() {
        return sum;
    }

    public void setSum(Double sum) {
        this.sum = sum;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Receipt receipt = (Receipt) o;
        return Objects.equals(name, receipt.name) && Objects.equals(products, receipt.products) && Objects.equals(sum, receipt.sum) && Objects.equals(amount, receipt.amount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, products, sum, amount);
    }

    @Override
    public String toString() {
        return "product.Receipt{" +
                "name='" + name + '\'' +
                ", products=" + products +
                ", sum=" + sum +
                ", amount=" + amount +
                '}';
    }
}