package 泛型;

public class Generic<T,K> {
    private T t;
    private K k;

    public T getT() {
        return t;
    }

    public K getK() {
        return k;
    }

    public void setK(K k) {
        this.k = k;
    }

    public void setT(T t) {
        this.t = t;
    }

    public <V> void show(V v){
        System.out.println(v);
    }
}
