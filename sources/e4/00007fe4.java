package kotlinx.coroutines.flow;

/* loaded from: classes5.dex */
public interface u<T> extends h0<T>, t<T> {
    boolean compareAndSet(T t11, T t12);

    @Override // kotlinx.coroutines.flow.h0
    T getValue();

    void setValue(T t11);
}