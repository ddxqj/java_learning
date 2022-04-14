package 泛型;

public class GenericInterImp<T> implements GenericInter<T>{

    @Override
    public void show(T t) {
        System.out.println(t);
    }
}
