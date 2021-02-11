package generic.wildcard;

import java.util.ArrayList;
import java.util.List;

public class RunnerCalc {

    public static void main(String[] args){
        Calculator calculator = new Calculator();
        List<Integer> list = new ArrayList<Integer>();
        list.add(2);list.add(4);list.add(6);

        calculator.sum(list);

    }
}
