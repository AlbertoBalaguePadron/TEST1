import static org.junit.Assert.*;
import org.junit.*;

public class text {

    @Test
    public void testsuma() {

        calcular app = new calcular(6, 2);

        assertEquals(8, app.suma());
    }

    @Test
    public void testresta() {

        calcular app = new calcular(6, 2);

        assertEquals(4, app.resta());
    }

    @Test
    public void testmulti() {

        calcular app = new calcular(6, 2);

        assertEquals(12, app.multi());
    }

    @Test
    public void testdivi() {

        calcular app = new calcular(6, 2);

        assertEquals(3, app.Divi());
    }

    @Test
    public void testabso() {

        calcular app = new calcular(4, 3);

        assertEquals(4, app.absolu());
    }

    @Test
    public void testeleva() {

        calcular app = new calcular(4, 3);

        assertEquals(64, app.elevado());
    }

    @Test
    public void testposi() {

        calcular app = new calcular(4, 3);

        assertEquals(true, app.positivo());
    }
}
