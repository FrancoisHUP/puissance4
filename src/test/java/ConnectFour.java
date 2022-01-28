import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConnectFour {

    @Test
    public void connectFourTest(){
        // contexte
        ConnectFour connectFour = new ConnectFour();
        int a = 4;
        int b = 4;

        // attendu
        int attendu = 8;

        // test
        assertEquals(attendu,a+b);
    }
}
