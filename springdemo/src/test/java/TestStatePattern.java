import org.junit.jupiter.api.Test;
import pattern.state.Context;

public class TestStatePattern {
    @Test
    public void test(){
        Context context = new Context();    //创建环境
        context.Handle();    //处理请求
        context.Handle();
        context.Handle();
        context.Handle();
    }
}
