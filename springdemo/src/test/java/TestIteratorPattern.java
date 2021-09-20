import org.junit.jupiter.api.Test;
import pattern.iterator.Iterator;
import pattern.iterator.NameRepository;

public class TestIteratorPattern {
    @Test
    public  void  test(){
        NameRepository nameRepository=new NameRepository();
        for ( Iterator it=nameRepository.getIterator();it.hasNext();){
            System.out.println(it.next());
        }
        Iterator it=nameRepository.getIterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
