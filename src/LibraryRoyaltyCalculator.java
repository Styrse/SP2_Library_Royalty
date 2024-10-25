public class LibraryRoyaltyCalculator {
    public static void main(String[] args) {

        Author author1 = new Author("Sylvia Plath");

        PrintedBook book1 = new PrintedBook("The Bell Jar", "SKØN", 100, 288);

        author1.addTitle(book1);
    }
}
