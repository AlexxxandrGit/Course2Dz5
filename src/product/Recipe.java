package product;

import java.util.Objects;
import java.util.Set;

public class Recipe {
    private Product product;
    private int totalCost;
    private String nameRecipe;

    public Recipe(Product product, int totalCost, String nameRecipe) {
        this.product = product;
        this.totalCost = totalCost;
        this.nameRecipe = nameRecipe;
    }
    public Recipe(Set<Product> productsList, int totalCost, String nameRecipe) {

    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(int totalCost) {
        this.totalCost = totalCost;
    }

    public String getNameRecipe() {
        return nameRecipe;
    }

    public void setNameRecipe(String nameRecipe) {
        this.nameRecipe = nameRecipe;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return Objects.equals(nameRecipe, recipe.nameRecipe);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameRecipe);
    }

    @Override
    public String toString() {
        return
                "product=" + product +
                        ", totalCost=" + totalCost +
                        ", nameRecipe='" + nameRecipe + '\'' +
                        '}';
    }
}