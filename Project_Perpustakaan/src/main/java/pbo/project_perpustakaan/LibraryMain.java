package pbo.project_perpustakaan;

import java.util.Scanner;
import java.util.InputMismatchException;

public class LibraryMain {
    public static Item itemList[] = {
            new Book("To Kill a Mockingbird", "Harper Lee", "9780060935467", 324, true),
            new Book("The Great Gatsby", "F. Scott Fitzgerald", "9780141182634", 256, true),
            new Book("Pride and Prejudice", "Jane Austen", "9780141439518", 432, true),
            new Book("The Catcher in the Rye", "J.D. Salinger", "9780316769488", 277, true),
            new Book("1984", "George Orwell", "9780451524935", 328, true),
            new Book("The Lord of the Rings", "J.R.R. Tolkien", "9780618645617", 1216, true),
            new Book("The Hobbit", "J.R.R. Tolkien", "9780618968633", 320, true),
            new Book("The Little Prince", "Antoine de Saint-Exupéry", "9780156012195", 96, true),
            new Book("The Diary of a Young Girl", "Anne Frank", "9780553296984", 283, true),
            new Book("The Adventures of Huckleberry Finn", "Mark Twain", "9780486280615", 366, true),

            new CD("The Beatles", 14, "Abbey Road", "The Beatles", true),
            new CD("Pink Floyd", 10, "The Dark Side of the Moon", "Pink Floyd", true),
            new CD("Michael Jackson", 10, "Thriller", "Michael Jackson", true),
            new CD("Eminem", 20, "The Eminem Show", "Eminem", true),
            new CD("Nirvana", 13, "Nevermind", "Nirvana", true),
            new CD("Queen", 17, "Greatest Hits", "Queen", true),
            new CD("Adele", 11, "21", "Adele", true),
            new CD("Taylor Swift", 16, "1989", "Taylor Swift", true),
            new CD("Drake", 25, "Scorpion", "Drake", true),
            new CD("Kanye West", 23, "The Life of Pablo", "Kanye West", true),

            new Journal("Nature", "Nature Publishing Group", "Volume 1", "Issue 1", true, 100),
            new Journal("Science", "American Association for the Advancement of Science", "Volume 2", "Issue 2", true,
                    150),
            new Journal("Cell", "Cell Press", "Volume 3", "Issue 3", true, 120),
            new Journal("The Lancet", "Elsevier", "Volume 4", "Issue 4", true, 180),
            new Journal("The New England Journal of Medicine", "Massachusetts Medical Society", "Volume 5", "Issue 5",
                    true, 200),
            new Journal("The Journal of the American Medical Association", "American Medical Association", "Volume 6",
                    "Issue 6", true, 220),
            new Journal("The BMJ", "BMJ Publishing Group Ltd", "Volume 7", "Issue 7", true, 140),
            new Journal("The Annals of Internal Medicine", "American College of Physicians", "Volume 8", "Issue 8",
                    true, 160),
            new Journal("The Journal of the American College of Cardiology", "Elsevier", "Volume 9", "Issue 9", true,
                    190),
            new Journal("The Journal of Clinical Investigation", "American Society for Clinical Investigation",
                    "Volume 10", "Issue 10", true, 210),
            new Journal("Nature", "Nature Publishing Group", "Volume 1", "Issue 1", true, 100),
            new Journal("Science", "American Association for the Advancement of Science", "Volume 2", "Issue 2", true,
                    150),

            new Magazine("Time", "Time USA, LLC", "Edition 1", true),
            new Magazine("National Geographic", "National Geographic Partners", "Edition 2", true),
            new Magazine("The Economist", "The Economist Group", "Edition 3", true),
            new Magazine("People", "Meredith Corporation", "Edition 4", true),
            new Magazine("Sports Illustrated", "Meredith Corporation", "Edition 5", true),
            new Magazine("Rolling Stone", "Wenner Media LLC", "Edition 6", true),
            new Magazine("Vogue", "Condé Nast", "Edition 7", true),
            new Magazine("Elle", "Hearst Magazines", "Edition 8", true),
            new Magazine("Cosmopolitan", "Hearst Magazines", "Edition 9", true),
            new Magazine("Harper's Bazaar", "Hearst Magazines", "Edition 10", true),

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

    public static Member memberList[] = {
            new Member("Akhmad Fahmi", 12345),
            new Member("Ratna Sari", 67890),
            new Member("Ayu Lestari", 11111),
            new Member("Budi Santoso", 22222),
            new Member("Eva Wijaya", 33333),
            new Member("Charlie Liem", 44444),
            new Member("David Gunawan", 55555),
            new Member("Franky Tan", 66666),
            new Member("George Widjaja", 77777),
            new Member("Helen Sutanto", 88888),
            new Member("Ivan Setiawan", 99999),
            new Member("Jenny Prasetyo", 10101),
            new Member("Kevin Widodo", 12121),
            new Member("Lily Surya", 13131),
            new Member("Mariana Indrawati", 14141),
            new Member("Nadia Satria", 15151),
            new Member("Olivia Wibowo", 16161),
            new Member("Puspita Sari", 17171),
            new Member("Quincy Hartono", 18181),
            new Member("Rachel Pratama", 19191),
            new Member("Sari Widiyanti", 20202),
            new Member("Tanti Nugroho", 21212),
            new Member("Umi Salamah", 22222),
            new Member("Vivian Wijaya", 23232),
            new Member("Walter Liem", 24242),
            new Member("Xenia Prasetyo", 25252),
            new Member("Yolanda Indrawati", 26262),
            new Member("Zulkifli Satria", 27272),
            new Member("Asep Saefulloh", 28282),
            new Member("Bambang Surya", 29292),
            new Member("Cici Widyawati", 30303)
    };

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihanMember, pilihanMenu;

        // memilih member
        while (true) {
            System.out.println("pilih member (angka): ");
            displayMembers();
            try {
                pilihanMember = input.nextInt();
                if (pilihanMember > 0 && pilihanMember <= memberList.length) {
                    break;
                } else {
                    falseRespond();
                }
            } catch (InputMismatchException e) {
                falseRespond();
                input.next();
            }
        }

        // memilih menu
        while (true) {
            int x = displayMenu();
            System.out.println("pilih menu : ");
            try {
                pilihanMenu = input.nextInt();
                if (pilihanMenu > 0 && pilihanMenu < x) {
                    break;
                } else {
                    falseRespond();
                }
            } catch (InputMismatchException e) {
                falseRespond();
                input.next();
            }
        }

        if (pilihanMenu == 1) { // mencari koleksi
            int koleksiDicari;
            displayItems(itemList);
            while (true) {
                System.out.println("Koleksi apa yang ingin anda cari : ");
                try {
                    koleksiDicari = input.nextInt();
                    if (koleksiDicari > 0 && koleksiDicari <= itemList.length) {
                        break;
                    }
                    falseRespond();
                } catch (InputMismatchException e) {
                    falseRespond();
                    input.next();
                }
            }

            printDisplayInfo(itemList[koleksiDicari - 1]);

        } else if (pilihanMenu == 2) { // menu peminjaman
            menuPeminjaman(itemList, memberList[pilihanMember - 1]);

        } else if (pilihanMenu == 3) { // menu pengembalian

        } else {
            // exit
        }
        input.close();
    } // end of main

    public static void displayMembers() {
        for (int i = 0; i < memberList.length; i++) {
            System.out.println((i + 1) + memberList[i].getNama());
        }
    }

    public static int displayMenu() {
        System.out.println("Library menu ");
        System.out.println("1. Mencari koleksi ");
        System.out.println("2. Menu peminjaman ");
        System.out.println("3. Menu pengembalian");
        System.out.println("4. Exit");
        return 5;
    }

    public static void menuPeminjaman(Item[] item, Member member) {

        Scanner input = new Scanner(System.in);

        input.close();
    }

    public void menuPengembalian(Member member, peminjamanKoleksi borrow) {

    }

    public static void falseRespond() {
        System.out.println("MAAF INPUTAN ANDA SALAH");
    }

    public static void displayItems(Item[] items) {
        for (int i = 0; i < items.length; i++) {
            System.out.println((i + 1) + ". " + items[i].getTitle());
        }
    }

    public static void printDisplayInfo(Item item) {

        if (item instanceof Book) {
            ((Book) item).displayInfo();
        } else if (item instanceof CD) {
            ((CD) item).displayInfo();
        } else if (item instanceof Journal) {
            ((Journal) item).displayInfo();
        } else if (item instanceof Magazine) {
            ((Magazine) item).displayInfo();
        } else {
            ((Newspaper) item).displayInfo();
        }
    }

}
