public class Presentation extends Document implements Cloneable{



    private Author author;
    private String theme;
    private int numOfSlides;
    public Presentation(Author author, String theme, int numOfSlides) {
        this.author = author;
        this.theme = theme;
        this.numOfSlides = numOfSlides;
    }

    public Presentation() {
        this.author = new Author();
        this.theme =" theme";
        this.numOfSlides = 100;
    }
    @Override
    public String toString() {
        return "The presentation made by " +
                 author +
                " with the theme " + theme + " has " +
               numOfSlides + " slides."  ;

    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public int getNumOfSlides() {
        return numOfSlides;
    }

    public void setNumOfSlides(int numOfSlides) {
        this.numOfSlides = numOfSlides;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Presentation cloneP = (Presentation) super.clone();
        cloneP.setAuthor( (Author) author.clone());
        return cloneP;
    }

    @Override
    public void submit(boolean isSubmitted) {
        if(isSubmitted == true)
            System.out.println("The presentation made by " + this.getAuthor().getNameAuthor()+" is submitted.\n");
        else System.out.println("The presentation made by "+this.getAuthor().getNameAuthor()+ " is NOT submitted.\n");
    }
}
