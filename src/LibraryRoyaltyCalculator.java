import java.util.Locale;

public class LibraryRoyaltyCalculator {
    public static void main(String[] args) {

        double USD_DKK = 6.9;

        Author author1 = new Author("Sylvia Plath");
        Author author2 = new Author("Ernest Hemingway");
        Author author3 = new Author("Virginia Woolf");
        Author author4 = new Author("Test Author");

        PrintedBook book1 = new PrintedBook("The Bell Jar", "SKØN", 100, 288);
        PrintedBook book2 = new PrintedBook("Ariel", "SKØN", 135, 194);
        PrintedBook book3 = new PrintedBook("The sun Also Rises", "SKØN", 394, 255);
        PrintedBook book4 = new PrintedBook("A Room of one´s own", "SKØN", 172, 195);
        AudioBook audioBook1 = new AudioBook("The Old Man and the See", "SKØN", 310, 148);
        AudioBook audioBook2 = new AudioBook("A Movable Feast", "SKØN", 175, 262);
        EBook eBook1 = new EBook("A Farewell to Arms", "FAG", 85, 52, 257, 138000, false, true);
        PrintedBook book5 = new PrintedBook("Test book", "TE", 40, 30);
        AudioBook audioBook3 = new AudioBook("Test audio book", "SKØN", 10, 400);
        EBook eBook2 = new EBook("Test ebook", "FAG", 97, 50, 205, 360000, false, true);
        EAudioBook eAudioBook1 = new EAudioBook("Test eAudio book", "OVERS", 97, 50, 205, 440);

        author1.addTitle(book1);
        author1.addTitle(book2);
        author2.addTitle(book3);
        author3.addTitle(book4);
        author2.addTitle(audioBook1);
        author2.addTitle(audioBook2);
        author2.addTitle(eBook1);
        author4.addTitle(book5);
        author4.addTitle(audioBook3);
        author4.addTitle(eBook2);
        author4.addTitle(eAudioBook1);

        //Formatting to two decimals
        //System.out.println("Author name: " + author1.getName() + "\nYearly payout: " + String.format("%.2f", author1.calculateTotalPay()) + " DKK");
        //Converted to get amount in USD
        //Using "Locale.US" to work around local setting making it show xx.xx which is wrong when working with USD
        //System.out.println("Author name: " + author1.getName() + "\nYearly payout: $" + String.format(Locale.US, "%.2f", author1.calculateTotalPay() / USD_DKK));

        //System.out.println("Author name: " + author2.getName() + "\nYearly payout: " + String.format("%.2f", author2.calculateTotalPay()) + " DKK");
        //System.out.println("Author name: " + author2.getName() + "\nYearly payout: $" + String.format(Locale.US, "%.2f", author2.calculateTotalPay() / USD_DKK));

        System.out.println("Author name: " + author4.getName() + "\nYearly payout: " + String.format("%.2f", author4.calculateTotalPay()) + " DKK");
        System.out.println("Author name: " + author4.getName() + "\nYearly payout: $" + String.format(Locale.US, "%.2f", author4.calculateTotalPay() / USD_DKK));
    }
}
