package edu.hw3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class ContactList {

    private ContactList() {

    }

    public static List<String> parseContact(List<String> contacts, String ascOrDesc) {
        List<String> sortedContacts = new ArrayList<>();
        PriorityQueue<String> contactsQueue;

        if (ascOrDesc.equals("DESC")) {
            contactsQueue = new PriorityQueue<>(Comparator.reverseOrder());
            contactsQueue.addAll(contacts);
        } else {
            contactsQueue = new PriorityQueue<>(contacts);
        }
        while (!contactsQueue.isEmpty()) {
            sortedContacts.add(contactsQueue.poll());
        }

        return sortedContacts;
    }

}
