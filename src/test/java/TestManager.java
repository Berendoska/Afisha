import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TestManager {


    private String Чужой;

    @Test
    public void test() {
        ManagerFilm manager = new ManagerFilm(3);
        manager.addFilm("film1");
        manager.addFilm("film2");
        manager.addFilm("film3");
        manager.addFilm("film4");
        manager.addFilm("film5");

       String[] actual = manager.showLast();
       String[] expected = {"film5", "film4", "film3"};

       assertArrayEquals(expected, actual);
    }
    @Test
    public void testAdd() {
        ManagerFilm manager = new ManagerFilm();

        manager.addFilm("film1");
        manager.addFilm("film2");
        manager.addFilm("film3");

        String[] actual = manager.addFilm(Чужой);
        String[] expected = {"film1", "film2", "film3", Чужой};

        assertArrayEquals(expected, actual);
    }

    }

