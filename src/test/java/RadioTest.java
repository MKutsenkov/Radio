import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import ru.netology.Radio;

public class RadioTest {

    @Test  //   по возрастанию более 9
    public void testStationNext9() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.next();

        int actual = radio.getCurrentStation();
        int expented = 0;

        assertEquals(expented, actual);
    }

//   @Test // за пределом станций
//   public void testStation15() {
//       Radio radio = new Radio( 20);
//       radio.setCurrentStation(15);

//       radio.next();

//       int actual = radio.getCurrentStation();
//       int expented = 15;

//       assertEquals(expented, actual);
//   }
}
