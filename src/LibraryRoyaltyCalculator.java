import java.util.Locale;

public class LibraryRoyaltyCalculator {
    public static void main(String[] args) {

        Author author1 = new Author("Sylvia Plath");
        Author author2 = new Author("Ernest Hemingway");

        PrintedBook book1 = new PrintedBook("The Bell Jar", "SKØN", 100, 288);
        PrintedBook book2 = new PrintedBook("Ariel", "SKØN", 135, 194);
        AudioBook audioBook1 = new AudioBook("")



        author1.addTitle(book1);

        //Formatting to two decimals
        System.out.println("Author name: " + author1.getName() + "\nYearly payout: " + String.format("%.2f", author1.calculateTotalPay()) + " DKK");

        //Using "Locale.US" to work around local setting making it show xx.xx which is wrong when working with USD
        System.out.println("Author name: " + author1.getName() + "\nYearly payout: $" + String.format(Locale.US, "%.2f", author1.calculateTotalPay()));
    }
}
