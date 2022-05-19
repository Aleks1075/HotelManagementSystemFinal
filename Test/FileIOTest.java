import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class FileIOTest {

    FileIO fileIO = new FileIO();

    @org.junit.jupiter.api.Test
    void isAvailable() {

        fileIO.readData();

        boolean assertion = false;
        boolean actual = fileIO.isAvailable(fileIO.rooms.get(4).getRoomNumber());

        assertEquals(assertion, actual);
    }

    @org.junit.jupiter.api.Test
    void findGuest() {

        fileIO.readData();

        String assertion = "Aleks";
        Guest testGuest = fileIO.guests.get(11);

        assertEquals(assertion, testGuest.getName());

    }
}