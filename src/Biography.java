import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Biography {
    public static void main(String[] args) {

        /**
         * WORK ON BOOK AND AUTHOR CLASSES FIRST
         This will be our actual program that we define author and his books
         In this program we will write the biography of Stefan Zweig, an Austrian novelist.


         Write a program that will get information from user and
         -Print information for the favorite author
         -Print information of the books of favorite author

         Full name = Stefan Zweig
         County = Austria
         Is still alive: No (28 November 1881 – 22 February 1942)
         Some of his books as listed below:

         BookName                            Genre           TotalPage
         Amok                                tale            189
         The Royal Game                      novella         53
         24 Hours in the Life of a Woman     novella         80
         */

        /*
        Expected result:
        Author's information = Author{firstName='Stefan', lastName='Zweig', country='Austria', isAlive=false}
        Author's books are as listed below:
        Book{name='Amok', genre:'tale', page=189}
        Book{name='The Royal Game', tale='novella', page=53}
        Book{name='24 Hours in the Life of a Woman', tale='novella', page=80}
         */

        //YOUR CODE HERE
        Scanner input = new Scanner(System.in);
        System.out.println("What is your favorite author’s first name?");
        String firstName = input.nextLine();

        System.out.println("What is your favorite author’s last name?");
        String lastName = input.nextLine();

        System.out.println("Where is your favorite author from?");
        String country = input.nextLine();

        System.out.println("Is your favorite author alive? Y/N");
        String isAliveInput = input.nextLine();

        while (!isAliveInput.equalsIgnoreCase("Y") && !isAliveInput.equalsIgnoreCase("N")) {
            System.out.println("Input was invalid, please use only 'Y' or 'N'\n");
            System.out.println("Is your favorite author alive? Y/N");
            isAliveInput = input.nextLine();

        }
        boolean isAlive = isAliveInput.equalsIgnoreCase("Y");
        int age = 0;


        if (isAlive) {
            System.out.println("How old is your favorite author?");
            age = input.nextInt();
        }

        System.out.println("Would you like to enter book information? (Y/N)");
        String bookCheck = input.nextLine();
        List<Book> listOfBook = new ArrayList<>();

        while (bookCheck.equalsIgnoreCase("Y")) {
            System.out.println("What is the book name?");
            String bookName = input.nextLine();

            System.out.println("What is the genre of the book?");
            String bookGenre = input.nextLine();

            System.out.println("How many pages does book have?");
            int page = input.nextInt();
            input.nextLine();

            Book bookInfo = new Book(bookName, bookGenre, page);
            listOfBook.add(bookInfo);

            System.out.println("Would you like to enter book information? (Y/N)");
            bookCheck = input.nextLine();

        }
        System.out.println(new Author(firstName, lastName, country, isAlive, age, listOfBook));
    }
}