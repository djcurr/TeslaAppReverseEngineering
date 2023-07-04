package androidx.room;

/* loaded from: classes.dex */
public abstract class r<T> extends z0 {
    public r(t0 t0Var) {
        super(t0Var);
    }

    protected abstract void bind(v4.k kVar, T t11);

    @Override // androidx.room.z0
    protected abstract String createQuery();

    public final int handle(T t11) {
        v4.k acquire = acquire();
        try {
            bind(acquire, t11);
            return acquire.w();
        } finally {
            release(acquire);
        }
    }

    public final int handleMultiple(Iterable<? extends T> iterable) {
        v4.k acquire = acquire();
        int i11 = 0;
        try {
            for (T t11 : iterable) {
                bind(acquire, t11);
                i11 += acquire.w();
            }
            return i11;
        } finally {
            release(acquire);
        }
    }

    public final int handleMultiple(T[] tArr) {
        v4.k acquire = acquire();
        try {
            int i11 = 0;
            for (T t11 : tArr) {
                bind(acquire, t11);
                i11 += acquire.w();
            }
            return i11;
        } finally {
            release(acquire);
        }
    }
}