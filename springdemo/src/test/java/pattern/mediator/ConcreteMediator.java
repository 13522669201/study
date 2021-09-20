package pattern.mediator;

import java.util.ArrayList;
import java.util.List;
//具体中介者
public class ConcreteMediator  extends  Mediator{
    private List<Colleague> colleagues = new ArrayList<Colleague>();
    @Override
    public void register(Colleague colleague) {
        colleague.setMedium(this);
        colleagues.add(colleague);
    }

    @Override
    public void relay(Colleague cl) {
        for (Colleague ob : colleagues) {
            if (ob.equals(cl)) {
                ((Colleague) ob).receive();
            }
        }
    }
}
