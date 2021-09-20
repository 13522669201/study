package pattern.memento;

import lombok.Data;
//备忘录
@Data
public class Memento {
    private  String state;

    public Memento(String state) {
        this.state = state;
    }
}
