package part2.task12;

public abstract class ProductType {
    public static final ProductType BOOK = new BookType();
    public static final ProductType SOFTWARE = new SoftwareType();

    public abstract String getTypeName();
}
