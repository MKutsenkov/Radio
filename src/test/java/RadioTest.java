import org.junit.jupiter.api.Test;
import ru.netology.Radio;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    // Prev
    @Test  //   по возрастанию более 9
    public void testStationPrev() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.prev();

        int actual = radio.getCurrentStation();
        int expented = 8;

        assertEquals(expented, actual);
    }
//jhh
    @Test  //   по возрастанию более 9
    public void testStationPrev0() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.prev();

        int actual = radio.getCurrentStation();
        int expented = 9;

        assertEquals(expented, actual);
    }


    @Test  //   по возрастанию
    public void testStationNext9() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.next();

        int actual = radio.getCurrentStation();
        int expented = 0;

        assertEquals(expented, actual);
    }
    @Test  //   по возрастанию 0
    public void testStationNext0() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.next();

        int actual = radio.getCurrentStation();
        int expented = 1;

        assertEquals(expented, actual);
    }
    @Test  //   по возрастанию 0
    public void testStationNext00() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);

        radio.next();

        int actual = radio.getCurrentStation();
        int expented = 1;

        assertEquals(expented, actual);
    }
//    @Test  //   по возрастанию 0
//   public void testStationNext0() {
//       Radio radio = new Radio();
//       radio.setCurrentStation(0);

//       radio.next();

//       int actual = radio.getCurrentStation();
//       int expented = 1;

//       assertEquals(expented, actual);
//   }
  @Test // за пределом станций
  public void testStation15() {
      Radio radio = new Radio( 20);
      radio.setCurrentStation(15);

      radio.next();

      int actual = radio.getCurrentStation();
      int expented = 16;

      assertEquals(expented, actual);
  }

    @Test // за пределом станций
    public void testStation10() {
        Radio radio = new Radio( );
        radio.setCurrentStation(10);

        radio.next();

        int actual = radio.getCurrentStation();
        int expented = 1;

        assertEquals(expented, actual);
    }
    @Test // за пределом станций
    public void testStation1() {
        Radio radio = new Radio( 20);
        radio.setCurrentStation(1);

        radio.next();

        int actual = radio.getCurrentStation();
        int expented = 2;

        assertEquals(expented, actual);
    }


        //   Звук  9
    @Test
    public void testVolume9() {
        Radio radio = new Radio( );
        radio.setCurrentVolume(9);

        radio.next();

        int actual = radio.getCurrentVolume();
        int expented = 9;

        assertEquals(expented, actual);
    }
    @Test
    public void testVolume10() {
        Radio radio = new Radio( );
        radio.setCurrentVolume(10);

        radio.next();

        int actual = radio.getCurrentVolume();
        int expented = 10;

        assertEquals(expented, actual);
    }

    @Test
    public void testVolume11() {
        Radio radio = new Radio( );
        radio.setCurrentVolume(11);

        radio.next();

        int actual = radio.getCurrentVolume();
        int expented = 0;

        assertEquals(expented, actual);
    }
    @Test
    public void testVolume0() {
        Radio radio = new Radio( );
        radio.setCurrentVolume(0);

        radio.next();

        int actual = radio.getCurrentVolume();
        int expented = 0;

        assertEquals(expented, actual);
    }
    @Test
    public void testVolume1() {
        Radio radio = new Radio( );
        radio.setCurrentVolume(1);

        radio.next();

        int actual = radio.getCurrentVolume();
        int expented = 1;

        assertEquals(expented, actual);
    }
    //     Увеличиваем и граничим 0.1.5.9.10.11
   @Test
   public void testIncreaseVolume0() {
       Radio radio = new Radio( );
       radio.setCurrentVolume(0);
       radio.increaseVolume();

       radio.next();

       int actual = radio.getCurrentVolume();
       int expented = 1;
       assertEquals(expented, actual);
   }
    @Test
    public void testIncreaseVolume1() {
        Radio radio = new Radio( );
        radio.setCurrentVolume(1);
        radio.increaseVolume();

        radio.next();

        int actual = radio.getCurrentVolume();
        int expented = 2;
        assertEquals(expented, actual);
    }
    @Test
    public void testIncreaseVolume5() {
        Radio radio = new Radio( );
        radio.setCurrentVolume(5);
        radio.increaseVolume();

        radio.next();

        int actual = radio.getCurrentVolume();
        int expented = 6;
        assertEquals(expented, actual);
    }
    @Test
    public void testIncreaseVolume9() {
        Radio radio = new Radio( );
        radio.setCurrentVolume(9);
        radio.increaseVolume();

        radio.next();

        int actual = radio.getCurrentVolume();
        int expented = 10;
        assertEquals(expented, actual);
    }
    @Test
    public void testIncreaseVolume10() {
        Radio radio = new Radio( );
        radio.setCurrentVolume(10);
        radio.increaseVolume();

        radio.next();

        int actual = radio.getCurrentVolume();
        int expented = 10;
        assertEquals(expented, actual);
    }
    @Test
    public void testIncreaseVolume11() {
        Radio radio = new Radio( );
        radio.setCurrentVolume(11);
        radio.increaseVolume();

        radio.next();

        int actual = radio.getCurrentVolume();
        int expented = 1;
        assertEquals(expented, actual);
    }

       //Уменьшаем и граничим 10. 9. 5. 1. 0
    @Test
    public void testReduceVolume10() {
        Radio radio = new Radio( );
        radio.setCurrentVolume(10);
        radio.reduceVolume();

        radio.next();

        int actual = radio.getCurrentVolume();
        int expented = 9;
        assertEquals(expented, actual);
    }

    @Test
    public void testReduceVolume00() {
        Radio radio = new Radio( );
        radio.setCurrentVolume(-1);
        radio.reduceVolume();

        radio.next();

        int actual = radio.getCurrentVolume();
        int expented = 0;
        assertEquals(expented, actual);
    }

    @Test
    public void testReduceVolume9() {
        Radio radio = new Radio( );
        radio.setCurrentVolume(9);
        radio.reduceVolume();

        radio.next();

        int actual = radio.getCurrentVolume();
        int expented = 8;
        assertEquals(expented, actual);
    }
    @Test
    public void testReduceVolume5() {
        Radio radio = new Radio( );
        radio.setCurrentVolume(5);
        radio.reduceVolume();

        radio.next();

        int actual = radio.getCurrentVolume();
        int expented = 4;
        assertEquals(expented, actual);
    }
    @Test
    public void testReduceVolume1() {
        Radio radio = new Radio( );
        radio.setCurrentVolume(1);
        radio.reduceVolume();

        radio.next();

        int actual = radio.getCurrentVolume();
        int expented = 0;
        assertEquals(expented, actual);
    }



}
