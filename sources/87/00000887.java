package androidx.room;

/* loaded from: classes.dex */
public abstract class s<T> extends z0 {
    public s(t0 t0Var) {
        super(t0Var);
    }

    public final void a(T t11) {
        v4.k acquire = acquire();
        try {
            bind(acquire, t11);
            acquire.s0();
        } finally {
            release(acquire);
        }
    }

    protected abstract void bind(v4.k kVar, T t11);
}