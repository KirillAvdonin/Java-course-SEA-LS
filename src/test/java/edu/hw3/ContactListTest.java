package edu.hw3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;

class ContactListTest {
    @Test
    void contactListTest() {
        assertEquals(
            List.of("Шишканов Влад", "Масагутов Кирилл", "Аванесян Григорий"), ContactList.parseContact(
                List.of("Масагутов Кирилл", "Аванесян Григорий", "Шишканов Влад"),
                "DESC"
            )
        );
        assertEquals(
            List.of("Аванесян Григорий", "Масагутов Кирилл", "Шишканов Влад"), ContactList.parseContact(
                List.of("Масагутов Кирилл", "Аванесян Григорий", "Шишканов Влад"),
                "ASC"
            )
        );
    }
}
