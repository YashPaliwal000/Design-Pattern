package CreationalPattern.Builder;

/*
Intent: Separate the construction of a complex object from its representation so that the same construction process 
can create different representations.

Example Use Case: Consider a scenario where you're developing a class Product with many optional parameters.
You want to provide a way to construct Product objects step by step.
*/

// Product class
class Product {
    private String part1;
    private String part2;
    private String part3;

    public void setPart1(String part1) {
        this.part1 = part1;
    }

    public void setPart2(String part2) {
        this.part2 = part2;
    }

    public void setPart3(String part3) {
        this.part3 = part3;
    }

    public void display() {
        System.out.println("Part 1: " + part1);
        System.out.println("Part 2: " + part2);
        System.out.println("Part 3: " + part3);
    }
}

// Builder interface
interface Builder {
    void buildPart1();
    void buildPart2();
    void buildPart3();
    Product getProduct();
}

// Concrete builder
class ConcreteBuilder implements Builder {
    private Product product;

    public ConcreteBuilder() {
        this.product = new Product();
    }

    public void buildPart1() {
        product.setPart1("Part 1 built");
    }

    public void buildPart2() {
        product.setPart2("Part 2 built");
    }

    public void buildPart3() {
        product.setPart3("Part 3 built");
    }

    public Product getProduct() {
        return this.product;
    }
}


public class BuilderPattern {
    public static void main(String[] args) {
        // Create builder
        Builder builder = new ConcreteBuilder();
        builder.buildPart1();
        builder.buildPart2();

        // Get product
        Product product = builder.getProduct();

        // Display product
        product.display();
    }
}
