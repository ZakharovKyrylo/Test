package Lection;

public class L009 {


    public static void main(String[] args) {
        Pair<Integer , String> pair = new Pair<>(34, "adads");
//            Pair pair=new Pair(34, "asdasdad");
//        int t = (Integer)pair.first;
//        String s =(String)pair.secnd;
        int t = pair.first;
        String s = pair.secnd;
    }
}

class Pair<T, V>{
    T first;
    V secnd;

    public Pair(Object first,Object secnd){
//        this.first=first;
//        this.secnd=secnd;


    }
}