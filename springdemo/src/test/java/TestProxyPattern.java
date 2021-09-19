import org.junit.jupiter.api.Test;
import pattern.proxypattern.Image;
import pattern.proxypattern.ProxyImage;

public class TestProxyPattern {
    @Test
    public  void test() {
        Image image = new ProxyImage("test_10mb.jpg");
        // 图像将从磁盘加载
        image.display();
        System.out.println("");
        // 图像不需要从磁盘加载
        image.display();
    }
}
