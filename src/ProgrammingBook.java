public class ProgrammingBook extends Book{
    private String language;
    private String famework;

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getFamework() {
        return famework;
    }

    public void setFamework(String famework) {
        this.famework = famework;
    }

    public ProgrammingBook() {
    }

    public ProgrammingBook(String id, String name, double price, String author, String language, String famework) {
        super(id, name, price, author);
        this.language = language;
        this.famework = famework;
    }

    @Override
    public double getAmount() {
        return super.getAmount();
    }
}
