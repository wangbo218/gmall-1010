package atguigu;

import org.junit.Test;
import org.springframework.boot.SpringBootVersion;

public class BoTest {
    @Test
    public void test() {
/*        String a = SpringBootVersion.getVersion();
        System.out.println(a);
        int arr[][] = new int[][]{{1, 2, 3}, {2}, {3}, {3, 4}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j] + "\t");
            }
        }*/
        int arr[][] = new int[][]{{1, 2, 3}, {2}, {3}, {3, 4}};
        for (int j = 0; j < arr[0].length; j++) {
            System.out.println(arr[0][j] + "\t");
        }
    }
}
