/*
Author: Edidiong Okon (101204818)
Date: September 19, 2022
 */

import java.util.ArrayList;

public class AddressBook {

    private ArrayList<BuddyInfo> buddies;

    public AddressBook(){
        this.buddies = new ArrayList<>();
    }
    public void addBuddy(BuddyInfo buddy){
        this.buddies.add(buddy);
    }

    public void removeBuddy(BuddyInfo buddy){
        this.buddies.remove(buddy);
    }

    public static void main(String [] args){
        BuddyInfo buddy = new BuddyInfo ("Dami", "Lagos", "+2349072135711");
        AddressBook addressBook = new AddressBook ();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
    }
}