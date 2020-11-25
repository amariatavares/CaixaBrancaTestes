import main.java.Exercicio.NextDate;
import org.junit.jupiter.api.*;

public class NextDateTests {
    /*gral@Test
    public void TC1(){
        int month = 1;
        String day ="10";
        int year = 2020;
        NextDate date = new NextDate(month, day, year);
        System.out.println("Type: " + date.run(month, day, year));
    }
    @Test
    public void TC2(){
        String month = "1";
        int day = 10;
        int year = 2020;
        NextDate date = new NextDate(month, day, year);
        System.out.println("Type: " + date.run(month, day, year));
    }
    @Test
    public void TC3(){
        int month = 1;
        int day = 0;
        String year = "2020";
        NextDate date = new NextDate(month, day, year);
        System.out.println("Type: " + date.run(month, day, year));
    }*/
    @Test
    public void TC4_line31(){
        int month = 1;
        int day = 0;
        int year = 2020;
        NextDate date = new NextDate(month, day, year);
        System.out.println("Type: " + date.run(month, day, year));
    }
    @Test
    public void TC5_line31(){
        int month = 1;
        int day = -1;
        int year = 2020;
        NextDate date = new NextDate(month, day, year);
        System.out.println("Type: " + date.run(month, day, year));
    }
    @Test
    public void TC6_line31(){
        int month = 0;
        int day = 10;
        int year = 2020;
        NextDate date = new NextDate(month, day, year);
        System.out.println("Type: " + date.run(month, day, year));
    }
    @Test
    public void TC7_line31(){
        int month = -1;
        int day = 10;
        int year = 2020;
        NextDate date = new NextDate(month, day, year);
        System.out.println("Type: " + date.run(month, day, year));
    }
    @Test
    public void TC8_line31(){
        int month = 13;
        int day = 10;
        int year = 2020;
        NextDate date = new NextDate(month, day, year);
        System.out.println("Type: " + date.run(month, day, year));
    }
    @Test
    public void TC9_line31(){
        int month = 1;
        int day = 10;
        int year = 1800;
        NextDate date = new NextDate(month, day, year);
        System.out.println("Type: " + date.run(month, day, year));
    }
    @Test
    public void TC10_line31(){
        int month = 1;
        int day = 10;
        int year = 2022;
        NextDate date = new NextDate(month, day, year);
        System.out.println("Type: " + date.run(month, day, year));
    }
    @Test
    public void TC11_line40(){
        int month = 1;
        int day = 10;
        int year = 2020;
        NextDate date = new NextDate(month, day, year);
        System.out.println("Type: " + date.run(month, day, year));
    }
    @Test
    public void TC12_line40(){
        int month = 7;
        int day = 10;
        int year = 2020;
        NextDate date = new NextDate(month, day, year);
        System.out.println("Type: " + date.run(month, day, year));
    }
    @Test
    public void TC13_line40(){
        int month = 1;
        int day = 31;
        int year = 2020;
        NextDate date = new NextDate(month, day, year);
        System.out.println("Type: " + date.run(month, day, year));
    }
    @Test
    public void TC14_line40(){
        int month = 1;
        int day = 32;
        int year = 2020;
        NextDate date = new NextDate(month, day, year);
        System.out.println("Type: " + date.run(month, day, year));
    }
    @Test
    public void TC15_line50(){
        int month = 4;
        int day = 10;
        int year = 2020;
        NextDate date = new NextDate(month, day, year);
        System.out.println("Type: " + date.run(month, day, year));
    }
    @Test
    public void TC16_line50(){
        int month = 4;
        int day = 30;
        int year = 2020;
        NextDate date = new NextDate(month, day, year);
        System.out.println("Type: " + date.run(month, day, year));
    }
    @Test
    public void TC17_line50(){
        int month = 4;
        int day = 31;
        int year = 2020;
        NextDate date = new NextDate(month, day, year);
        System.out.println("Type: " + date.run(month, day, year));
    }
    @Test
    public void TC18_line64(){
        int month = 12;
        int day = 13;
        int year = 2020;
        NextDate date = new NextDate(month, day, year);
        System.out.println("Type: " + date.run(month, day, year));
    }
    @Test
    public void TC19_line64(){
        int month = 12;
        int day = 31;
        int year = 2020;
        NextDate date = new NextDate(month, day, year);
        System.out.println("Type: " + date.run(month, day, year));
    }
    @Test
    public void TC20_line64(){
        int month = 12;
        int day = 10;
        int year = 2021;
        NextDate date = new NextDate(month, day, year);
        System.out.println("Type: " + date.run(month, day, year));
    }
    @Test
    public void TC21_line79(){
        int month = 2;
        int day = 25;
        int year = 2020;
        NextDate date = new NextDate(month, day, year);
        System.out.println("Type: " + date.run(month, day, year));
    }
    @Test
    public void TC22_line79(){
        int month = 2;
        int day = 28;
        int year = 2020;
        NextDate date = new NextDate(month, day, year);
        System.out.println("Type: " + date.run(month, day, year));
    }
    @Test
    public void TC23_line79(){
        int month = 2;
        int day = 28;
        int year = 2019;
        NextDate date = new NextDate(month, day, year);
        System.out.println("Type: " + date.run(month, day, year));
    }
    @Test
    public void TC24_line79(){
        int month = 2;
        int day = 29;
        int year = 2020;
        NextDate date = new NextDate(month, day, year);
        System.out.println("Type: " + date.run(month, day, year));
    }
    @Test
    public void TC25_line79(){
        int month = 2;
        int day = 29;
        int year = 2019;
        NextDate date = new NextDate(month, day, year);
        System.out.println("Type: " + date.run(month, day, year));
    }
    @Test
    public void TC26_line79(){
        int month = 2;
        int day = 30;
        int year = 2020;
        NextDate date = new NextDate(month, day, year);
        System.out.println("Type: " + date.run(month, day, year));
    }
}
