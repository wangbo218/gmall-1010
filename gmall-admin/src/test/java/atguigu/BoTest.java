package atguigu;

import org.junit.Test;
import org.springframework.boot.SpringBootVersion;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BoTest {
    @Test
    public void test() {

        int arr[][] = new int[][]{{1, 2, 3}, {2}, {3}, {3, 4}};
            System.out.println(Arrays.toString(arr[0]));
    }
}
