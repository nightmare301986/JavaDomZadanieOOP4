package HW4z1;

public class Prel<M, R, T> {
    M ob1;
    R ob2;
    T ob3;
    Prel(M o1, R o2, T o3){
        ob1 = o1;
        ob2 = o2;
        ob3 = o3;
    }
    M getOb1(){
        return  ob1;
    }
    R getOb2(){
        return  ob2;
    }
    T getOb3(){
        return  ob3;
    }
    void printElement(){
        System.out.println("Значение первого элемента "+getOb1());
        System.out.println("Значение второго элемента "+getOb2());
        System.out.println("Значение третьего элемента "+getOb3());
    }

}
