@FunctionalInterface
public interface MyInterface<T> {

    void method(T t);

    int hashCode();

    boolean equals(Object o);

}
