import com.edu.strategy.RootRouter;
import org.junit.Test;
import org.springframework.boot.SpringApplication;

/**
 * @Description TODO
 * @author: GT
 * @Date: 2021/1/28 10:24
 * @Version 1.0
 */
public class TestStrategyRouter {


    @Test
    public void get() {
        RootRouter rootRouter = new RootRouter();
        String result = rootRouter.applyStrategy("");
        System.out.println(result);
    }
}