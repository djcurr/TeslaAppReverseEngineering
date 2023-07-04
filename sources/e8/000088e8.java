package n00;

/* loaded from: classes5.dex */
public interface m<V> extends c<V> {

    /* loaded from: classes5.dex */
    public interface a<V> {
        m<V> d();
    }

    /* loaded from: classes5.dex */
    public interface b<V> extends a<V>, h<V> {
    }

    b<V> getGetter();

    boolean isConst();

    boolean isLateinit();
}