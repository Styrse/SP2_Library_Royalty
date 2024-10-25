import java.util.Locale;

public class LibraryRoyaltyCalculator {
    public static void main(String[] args) {

        double USD_DKK = 6.9;

        Author author1 = new Author("Sylvia Plath");
        Author author2 = new Author("Ernest Hemingway");
        Author author3 = new Author("Virginia Woolf");

        PrintedBook book1 = new PrintedBook("The Bell Jar", "SKØN", 100, 288);
        PrintedBook book2 = new PrintedBook("Ariel", "SKØN", 135, 194);
        PrintedBook book3 = new PrintedBook("The sun Also Rises", "SKØN", 394, 255);
        PrintedBook book4 = new PrintedBook("A Room of one´s own", "SKØN", 172, 195);
        AudioBook audioBook1 = new AudioBook("The Old Man and the See", "SKØN", 310, 148);
        AudioBook audioBook2 = new AudioBook("A Movable Feast", "SKØN", 175, 246);

//        author1.addTitle(book1);
//        author1.addTitle(book2);
//        author2.addTitle(book3);
//        author3.addTitle(book4);
//        author2.addTitle(audioBook1);
        author2.addTitle(audioBook2);

        //Formatting to two decimals
        //System.out.println("Author name: " + author1.getName() + "\nYearly payout: " + String.format("%.2f", author1.calculateTotalPay()) + " DKK");
        //Converted to get amount in USD
        //Using "Locale.US" to work around local setting making it show xx.xx which is wrong when working with USD
        //System.out.println("Author name: " + author1.getName() + "\nYearly payout: $" + String.format(Locale.US, "%.2f", author1.calculateTotalPay() / USD_DKK));

        System.out.println("Author name: " + author2.getName() + "\nYearly payout: " + String.format("%.2f", author2.calculateTotalPay()) + " DKK");
        System.out.println("Author name: " + author2.getName() + "\nYearly payout: $" + String.format(Locale.US, "%.2f", author2.calculateTotalPay() / USD_DKK));
//
//        System.out.println("Author name: " + author3.getName() + "\nYearly payout: " + String.format("%.2f", author3.calculateTotalPay()) + " DKK");
//        System.out.println("Author name: " + author3.getName() + "\nYearly payout: $" + String.format(Locale.US, "%.2f", author3.calculateTotalPay() / USD_DKK));
    }
}
