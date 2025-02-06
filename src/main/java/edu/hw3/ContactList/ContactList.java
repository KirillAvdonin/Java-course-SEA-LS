package edu.hw3.ContactList;

import java.util.Collections;
import java.util.List;

public class ContactList {

    private ContactList() {

    }

    public static SortedContacts parseContact(List<String> contacts, String ascOrDesc) {

        try {
            if (!contacts.isEmpty()) {

                if (ascOrDesc.equals("DESC")) {
                    Collections.sort(contacts);
                    Collections.reverse(contacts);
                    return new SortedContacts(contacts);
                } else if (ascOrDesc.equals("ASC")) {
                    Collections.sort(contacts);
                    return new SortedContacts(contacts);
                } else {
                    throw new IllegalArgumentException("Некорректный выбор сортировки");
                }
            } else {
                throw new IllegalArgumentException("Лист не должен быть пустым");
            }
        } catch (NullPointerException e) {
            throw new IllegalArgumentException("Лист контактов не должен быть null");
        }
    }
}


