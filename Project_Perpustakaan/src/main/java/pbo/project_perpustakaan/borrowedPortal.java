/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package pbo.project_perpustakaan;

/**
 *
 * @author Gerardo Ardianta
 */

public class borrowedPortal {
    private String dateBorrow[] = new String[20];
    private String dateReturn[] = new String[20];
    private Member member;
    private int counterItem;
    private Item[] borrowedItem = new Item[20];

    public borrowedPortal(Member member) {
        this.member = member;
        this.counterItem = 0;
    }

    public Member member() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public void getMember() {
        System.out.println("Member Name : " + member.getName());
        System.out.println("Member NIM : " + member.getNim());
    }

    // bagian pinjaman
    public void setBorrowedItem(Item item, String dateB, String dateR) {
        if (counterItem < borrowedItem.length) {
            this.borrowedItem[counterItem] = item;
            this.dateBorrow[counterItem] = dateB;
            this.dateReturn[counterItem] = dateR;
            item.setIsAvailable(false);
            counterItem++;
        } else {
            System.out.println("The maximum item that can be borrowed is only 20 pieces");
        }
    }

    public int getCounterItem() {
        return counterItem;
    }

    // bagian pengembalian
    public void deleteBorrowedItem(int x) {
        if (isValidReturn(x)) {
            borrowedItem[x - 1] = null;
            dateBorrow[x - 1] = null;
            dateReturn[x - 1] = null;
            borrowedItem[x - 1].setIsAvailable(true);
            counterItem--;
            for (int i = x - 1; i < borrowedItem.length; i++) {
                borrowedItem[i] = borrowedItem[i + 1];
                dateBorrow[i] = dateBorrow[i + 1];
                dateReturn[i] = dateReturn[i + 1];
            }
            borrowedItem[borrowedItem.length - 1] = null;
            dateBorrow[borrowedItem.length - 1] = null;
            dateReturn[borrowedItem.length - 1] = null;
        } else {
            System.out.println("The item that you want to delete is not exist");
        }
    }

    // bagian tambahan
    public void printBorrowedItem() {
        for (int i = 0; i < borrowedItem.length; i++) {
            System.out.println(borrowedItem[i].getTitle());
        }
    }

    public boolean isValidReturn(int returned) {
        if (borrowedItem[returned - 1] == null) {
            return false;
        }
        return true;
    }
}
