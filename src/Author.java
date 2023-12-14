public class Author implements Cloneable {


    private String nameAuthor;

    public Author(String nameAuthor) {
        this.nameAuthor = nameAuthor;
    }
    public Author() {
        this.nameAuthor = "nameAuthor";
    }

    @Override
    public String toString() {
        return
                nameAuthor;
    }


    public String getNameAuthor() {
        return nameAuthor;
    }

    public void setNameAuthor(String nameAuthor) {
        this.nameAuthor = nameAuthor;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
