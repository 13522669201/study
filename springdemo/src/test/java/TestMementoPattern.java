import org.junit.jupiter.api.Test;
import pattern.memento.Caretaker;
import pattern.memento.Originator;

public class TestMementoPattern {
    @Test
    public  void test(){
        Originator or = new Originator();
        Caretaker cr = new Caretaker();
        or.setState("S0");
        System.out.println(or.getState());
        //备忘
        cr.setMemento(or.createMemento());
        or.setState("S1");
        System.out.println(or.getState());
        //恢复
        or.restoreMemento(cr.getMemento());
        System.out.println(or.getState());
    }
}
