import org.junit.jupiter.api.Test;
import ru.netology.Radio;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    // Prev
    @Test  //   по возрастанию более 9
    public void testStationPrev() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);

        radio.prev();

        int actual = radio.getCurrentStation();
        int expented = 9;

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

        radio.increaseVolume();

        int actual = radio.getCurrentVolume();
        int expented = 10;

        assertEquals(expented, actual);
    }
    @Test
    public void testVolume10() {
        Radio radio = new Radio( );
        radio.setCurrentVolume(100);

        radio.increaseVolume();

        int actual = radio.getCurrentVolume();
        int expented = 99;

        assertEquals(expented, actual);
    }

    @Test
    public void testVolume11() {
        Radio radio = new Radio( );
        radio.setCurrentVolume(11);

        radio.increaseVolume();

        int actual = radio.getCurrentVolume();
        int expented = 0;

        assertEquals(expented, actual);
    }
    @Test
    public void testVolume0() {
        Radio radio = new Radio( );
        radio.setCurrentVolume(0);

        radio.increaseVolume();

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
    //     Увеличиваем и граничим  100. 99. 50. 1. 0

    @Test
    public void testIncreaseVolume100() {
        Radio radio = new Radio( );
        radio.setCurrentVolume(100);
        radio.increaseVolume();



        int actual = radio.getCurrentVolume();
        int expented =101;
        assertEquals(expented, actual);
    }
    @Test
    public void testIncreaseVolume99() {
        Radio radio = new Radio( );
        radio.setCurrentVolume(99);
        radio.increaseVolume();



        int actual = radio.getCurrentVolume();
        int expented = 99;
        assertEquals(expented, actual);
    }
    @Test
    public void testIncreaseVolume50() {
        Radio radio = new Radio( );
        radio.setCurrentVolume(50);
        radio.increaseVolume();



        int actual = radio.getCurrentVolume();
        int expented = 51;
        assertEquals(expented, actual);
    }
    @Test
    public void testIncreaseVolume1() {
        Radio radio = new Radio( );
        radio.setCurrentVolume(1);
        radio.increaseVolume();



        int actual = radio.getCurrentVolume();
        int expented = 2;
        assertEquals(expented, actual);
    }
    @Test
    public void testIncreaseVolume0() {
        Radio radio = new Radio( );
        radio.setCurrentVolume(0);
        radio.increaseVolume();



        int actual = radio.getCurrentVolume();
        int expented = 1;
        assertEquals(expented, actual);
    }

       //Уменьшаем и граничим 0. 101. . 999. 50. 1


    @Test  //  = 0
    public void testReduceVolume00() {
        Radio radio = new Radio( );
        radio.setCurrentVolume(0);
        radio.reduceVolume();



        int actual = radio.getCurrentVolume();
        int expented = 0;
        assertEquals(expented, actual);
    }

    @Test  // >100
    public void testReduceVolume101() {
        Radio radio = new Radio( );
        radio.setCurrentVolume(101);
        radio.reduceVolume();



        int actual = radio.getCurrentVolume();
        int expented = 99;
        assertEquals(expented, actual);
    }



    @Test
    public void testReduceVolume100() {
        Radio radio = new Radio( );
        radio.setCurrentVolume(100);
        radio.reduceVolume();



        int actual = radio.getCurrentVolume();
        int expented = 99;
        assertEquals(expented, actual);
    }
    @Test
    public void testReduceVolume50() {
        Radio radio = new Radio( );
        radio.setCurrentVolume(50);
        radio.reduceVolume();



        int actual = radio.getCurrentVolume();
        int expented = 49;
        assertEquals(expented, actual);
    }
    @Test
    public void testReduceVolume1() {
        Radio radio = new Radio( );
        radio.setCurrentVolume(1);
        radio.reduceVolume();



        int actual = radio.getCurrentVolume();
        int expented = 0;
        assertEquals(expented, actual);
    }



}
