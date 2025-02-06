package edu.hw3;

import edu.hw3.ContactList.SortedContacts;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static edu.hw3.ContactList.ContactList.parseContact;

import java.util.ArrayList;
import java.util.List;

class ContactListTest {
    @Test
    void contactListTest() {
        List<String> listOfContactsTest1 = new ArrayList<>();

        listOfContactsTest1.add("Масагутов Кирилл");
        listOfContactsTest1.add("Шишканов Владислав");
        listOfContactsTest1.add("Аванесян Григорий");

        List<String> listOfContactsTest2 = new ArrayList<>();

        listOfContactsTest2.add("Дилигенская Анна");
        listOfContactsTest2.add("Щетинин Владимир");
        listOfContactsTest2.add("Мандра Андрей");
        listOfContactsTest2.add("Колоденкова Анна");

        SortedContacts parseContactAscMethodTest = parseContact(listOfContactsTest1, "ASC");
        SortedContacts parseContactDescMethodTest = parseContact(listOfContactsTest2, "DESC");

        List<String> testAfterAscSort =
            new SortedContacts(List.of("Аванесян Григорий", "Масагутов Кирилл", "Шишканов Владислав")).getContactList();

        List<String> testAfterDescSort =
            new SortedContacts(List.of(
                "Щетинин Владимир",
                "Мандра Андрей",
                "Колоденкова Анна",
                "Дилигенская Анна"
            )).getContactList();

        assertEquals(parseContactAscMethodTest.getContactList().toString()
            ,testAfterAscSort.toString()
        );

        assertEquals(
            parseContactDescMethodTest.getContactList().toString(), testAfterDescSort.toString()
        );


    }
}
