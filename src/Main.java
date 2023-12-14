public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Author author = new Author("Ime");
        Presentation p = new Presentation(author,"Biology",30);



        Presentation p1 = (Presentation) p.clone();
        p1.getAuthor().setNameAuthor("Nicola");
        System.out.println(p1);
        p1.submit(true);



        Presentation p2 = (Presentation) p.clone();
        p2.getAuthor().setNameAuthor("Maria");
        System.out.println(p2);
        p2.submit(false);

        Presentation p3 = (Presentation) p.clone();
        p3.getAuthor().setNameAuthor("Ivan");
        System.out.println(p3);
        p3.submit(true);


    }
}