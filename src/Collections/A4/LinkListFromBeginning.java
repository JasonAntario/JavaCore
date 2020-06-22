package Collections.A4;

import java.util.LinkedList;
import java.util.List;

public class LinkListFromBeginning {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < 1000000; i++) {
            list.add((1 + (int) (Math.random() *1000000)));
        }
        Choosen(list);
    }
    static void Choosen(List list){
        int chose=0;
        for (int i = 0; i<10000;i++){
            list.add(i);
            //list.remove(i);
            System.out.println("Add");
            //System.out.println("Remove");
        }
    }
}
//  1.5 seconds +-200 ms  - remove
//  1 seconds +-200 ms  - add