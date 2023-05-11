import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
        public static void main(String[] args) {
            counter a = new counter();
            
            Thread ax = new Thread(a);

            ax.start();



    }
}