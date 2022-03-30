import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author :zhangxiaoliang
 * @date :2022/3/29 16:19
 */
public class MainTest {

    public static void main(String[] args) {
    }
    public static String frr(List<String> stringArrayList ){
        for (String s : stringArrayList) {
            if (s.equals("2")) {
                return "a";
            }
            System.out.println(s);
        }
        return null ;
    }

}
