package Core;

import Utilities.Arrays;
import org.junit.Test;

public class TestClass {

    @Test
    public void searchScannerVar() {
        Integer[] test = {1, 2, 3, 5, 6, 7, 8, 9};
        test = Arrays.set(test, 3, 4);
        Arrays.print(test);
    }

}
