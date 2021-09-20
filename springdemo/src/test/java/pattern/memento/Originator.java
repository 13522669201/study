package pattern.memento;

import lombok.Data;

//发起人
@Data
public class Originator {
    private String state;

    public Memento createMemento() {
        return new Memento(state);
    }
    public  void  restoreMemento(Memento memento){
        this.setState(memento.getState());
    }
}
