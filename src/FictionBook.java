public class FictionBook extends Book{
    private String categoty;

    public String getCategoty() {
        return categoty;
    }

    public void setCategoty(String categoty) {
        this.categoty = categoty;
    }

    public FictionBook() {
    }

    public FictionBook(String id, String name, double price, String author, String categoty) {
        super(id, name, price, author);
        this.categoty = categoty;
    }

    @Override
    public double getAmount() {
        return super.getAmount();
    }
}
