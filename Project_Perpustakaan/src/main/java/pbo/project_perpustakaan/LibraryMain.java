package pbo.project_perpustakaan;

import java.util.Scanner;
import java.util.InputMismatchException;

public class LibraryMain {
    public static Item[] bookList = {
            new Book("To Kill a Mockingbird", "Harper Lee", "9780060935467", 324, true),
            new Book("The Great Gatsby", "F. Scott Fitzgerald", "9780141182634", 256, true),
            new Book("Pride and Prejudice", "Jane Austen", "9780141439518", 432, true),
            new Book("The Catcher in the Rye", "J.D. Salinger", "9780316769488", 277, true),
            new Book("1984", "George Orwell", "9780451524935", 328, true),
            new Book("The Lord of the Rings", "J.R.R. Tolkien", "9780618645617", 1216, true),
            new Book("The Hobbit", "J.R.R. Tolkien", "9780618968633", 320, true),
            new Book("The Little Prince", "Antoine de Saint-Exupéry", "9780156012195", 96, true),
            new Book("The Diary of a Young Girl", "Anne Frank", "9780553296984", 283, true),
            new Book("The Adventures of Huckleberry Finn", "Mark Twain", "9780486280615", 366, true)
    };

    public static Item[] cdList = {
            new CD("The Beatles", 14, "Abbey Road", "The Beatles", true),
            new CD("Pink Floyd", 10, "The Dark Side of the Moon", "Pink Floyd", true),
            new CD("Michael Jackson", 10, "Thriller", "Michael Jackson", true),
            new CD("Eminem", 20, "The Eminem Show", "Eminem", true),
            new CD("Nirvana", 13, "Nevermind", "Nirvana", true),
            new CD("Queen", 17, "Greatest Hits", "Queen", true),
            new CD("Adele", 11, "21", "Adele", true),
            new CD("Taylor Swift", 16, "1989", "Taylor Swift", true),
            new CD("Drake", 25, "Scorpion", "Drake", true),
            new CD("Kanye West", 23, "The Life of Pablo", "Kanye West", true)

    };

    public static Item[] journalList = {
            new Journal("Nature", "Nature Publishing Group", "Volume 1", "Issue 1", true),
            new Journal("Science", "American Association for the Advancement of Science", "Volume 2", "Issue 2",
                    true),
            new Journal("Cell", "Cell Press", "Volume 3", "Issue 3", true),
            new Journal("The Lancet", "Elsevier", "Volume 4", "Issue 4", true),
            new Journal("The New England Journal of Medicine", "Massachusetts Medical Society", "Volume 5",
                    "Issue 5", true),
            new Journal("The Journal of the American Medical Association", "American Medical Association",
                    "Volume 6", "Issue 6", true),
            new Journal("The BMJ", "BMJ Publishing Group Ltd", "Volume 7", "Issue 7", true),
            new Journal("The Annals of Internal Medicine", "American College of Physicians", "Volume 8", "Issue 8",
                    true),
            new Journal("The Journal of the American College of Cardiology", "Elsevier", "Volume 9", "Issue 9",
                    true),
            new Journal("The Journal of Clinical Investigation", "American Society for Clinical Investigation",
                    "Volume 10", "Issue 10", true)
    };

    public static Item[] magazineList = {
            new Magazine("Time", "Time USA, LLC", "Edition 1", true),
            new Magazine("National Geographic", "National Geographic Partners", "Edition 2", true),
            new Magazine("The Economist", "The Economist Group", "Edition 3", true),
            new Magazine("People", "Meredith Corporation", "Edition 4", true),
            new Magazine("Sports Illustrated", "Meredith Corporation", "Edition 5", true),
            new Magazine("Rolling Stone", "Wenner Media LLC", "Edition 6", true),
            new Magazine("Vogue", "Condé Nast", "Edition 7", true),
            new Magazine("Elle", "Hearst Magazines", "Edition 8", true),
            new Magazine("Cosmopolitan", "Hearst Magazines", "Edition 9", true),
            new Magazine("Harper's Bazaar", "Hearst Magazines", "Edition 10", true)
    };

    public static Item[] newspaperList = {
            new Newspaper("The New York Times", "The New York Times Company", "2022-01-01", 20, true),
            new Newspaper("The Wall Street Journal", "Dow Jones & Company", "2022-01-02", 30, true),
            new Newspaper("USA Today", "Gannett Company", "2022-01-03", 25, true),
            new Newspaper("Los Angeles Times", "Tronc", "2022-01-04", 28, true),
            new Newspaper("The Washington Post", "Nash Holdings", "2022-01-05", 22, true),
            new Newspaper("Chicago Tribune", "Tribune Publishing", "2022-01-06", 26, true),
            new Newspaper("Houston Chronicle", "Hearst Corporation", "2022-01-07", 24, true),
            new Newspaper("The Dallas Morning News", "A. H. Belo Corporation", "2022-01-08", 27, true),
            new Newspaper("San Francisco Chronicle", "Hearst Corporation", "2022-01-09", 29, true),
            new Newspaper("The Denver Post", "Digital First Media", "2022-01-10", 23, true)
    };

    public static void main(String[] args) {

        System.out.println("");

    }

    public void displayMenu() {
        System.out.println("Library menu ");
        System.out.println("1. Looking for items ");
        System.out.println("2. Loan menu ");
        System.out.println("3. return Menu");
        System.out.println("4. Exit");
    }

    public static void login(int nim, String name) {
        Member member = new Member(name, nim);
    }

    public void loanMenu(Item[] books, Item[] cds, Item[] journals, Item[] magazines, Item[] newspapers,
            Member member) {
        Scanner input = new Scanner(System.in);
        int x;
        while (true) {
            System.out.println("LOAN MENU : ");
            System.out.println("1. Book");
            System.out.println("2. CD");
            System.out.println("3. Journal");
            System.out.println("4. Magazine");
            System.out.println("5. Newspaper");
            System.out.print("Enter your input : ");
            try {
                x = input.nextInt();
                System.out.println();
                if (x > 5 || x < 1) {
                    falseRespond();
                } else {
                    break;
                }
            } catch (InputMismatchException e) {
                falseRespond();
                input.next();
            }
        }

        switch (x) {
            case 1:
                System.out.println("List of books that can be borrowed:");
                printItems(books);
                break;
            case 2:
                System.out.println("List of CDs that can be borrowed:");
                printItems(cds);
                break;
            case 3:
                System.out.println("List of journals that can be borrowed:");
                printItems(journals);
                break;
            case 4:
                System.out.println("List of Magazines that can be borrowed:");
                printItems(magazines);
                break;
            case 5:
                System.out.println("List of CD that can be borrowed:");
                printItems(newspapers);
                break;

            default:
                break;
        }
        input.close();
    }

    public void returnMenu(Item[] books, Item[] cds, Item[] journals, Item[] magazines, Item[] newspapers,
            Member member, borrowedPortal borrow) {
        Scanner input = new Scanner(System.in);
        int returned = 0;
        if (borrow.getCounterItem() == 0) {
            System.out.println("You haven't borrowed any items, borrow it now!");
        } else {
            while (true) {
                System.out.println("items that have not been returned:");
                borrow.printBorrowedItem();
                System.out.print("Enter the items you want to return (number):");
                try {
                    returned = input.nextInt();
                    if (borrow.isValidReturn(returned)) {
                        borrow.deleteBorrowedItem(returned);
                        break;
                    } else {
                        falseRespond();
                    }
                } catch (InputMismatchException e) {
                    falseRespond();
                    input.next();
                }
            }

        }
        input.close();
    }

    public void falseRespond() {
        System.out.println("SORRY YOUR INPUT IS WRONG");
    }

    public void trueRespond(String username, int x) {
        switch (x) {
            case 1:
                System.out.println("WELCOME" + username.toUpperCase() + "In our library!");
                break;
            case 2:
                System.out.println("Thank you for borrowing at our library!");
                break;
            case 3:
                System.out.println("Thank you for returning at our library!");
                break;
            default:
                break;
        }
    }

    public void printItems(Item[] items) {
        for (int i = 0; i < items.length; i++) {
            System.out.println((i + 1) + ". " + items[i].getTitle());
        }
    }

    public void printDisplayInfo(Item item) {
        item.displayInfo();
    }
}
