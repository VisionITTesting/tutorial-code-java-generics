package generic.wildcard;

import java.util.List;

public class Calculator {



    public double sum(List<? extends Number> list){

        double result = 0;
        for(Number l : list){
            result = result + l.doubleValue();
        }

        return result;
    }
}
