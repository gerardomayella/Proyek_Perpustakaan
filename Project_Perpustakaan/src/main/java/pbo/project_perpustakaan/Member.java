package pbo.project_perpustakaan;

public class Member {
    private String name;
    private String nim;
    private int counterItem;
    // maksimal member hanya boleh meminjam 20 barang
    private Item[] borrowedItem = new Item[20];

    public Member(String name, String student) {
        this.name = name;
        this.nim = student;
        this.counterItem = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String student) {
        this.nim = student;
    }

    public int getCounterItem() {
        return counterItem;
    }

    public void printBorrowedItem() {
        for (int i = 0; i < borrowedItem.length; i++) {
            System.out.println(borrowedItem[i].getTitle());
        }
    }

    public void setBorrowedItem(Item item) {
        if (counterItem < borrowedItem.length) {
            this.borrowedItem[counterItem] = item;
            counterItem++;
        } else {
            System.out.println("The maximum item that can be borrowed is only 20 pieces");
        }
    }

    public void deleteBorrowesItem(int x) {
        if (!(borrowedItem[x - 1] == null)) {
            borrowedItem[x - 1] = null;
            counterItem--;
            for (int i = x - 1; i < borrowedItem.length; i++) {
                borrowedItem[i] = borrowedItem[i + 1];
            }
            borrowedItem[borrowedItem.length - 1] = null;
        } else {
            System.out.println("The item that you want to delete is not exist");
        }
    }

    public boolean isValidReturn() {
        for (int i = 0; i < borrowedItem.length; i++) {
            if (borrowedItem[i] != null) {
                return false;
            }
        }
        return true;
    }
}
