package ty;

/* loaded from: classes5.dex */
public final class i {

    /* loaded from: classes5.dex */
    enum a implements ky.h<hy.q, b80.a> {
        INSTANCE;

        @Override // ky.h
        public b80.a apply(hy.q qVar) {
            return new q(qVar);
        }
    }

    public static <T> ky.h<hy.q<? extends T>, b80.a<? extends T>> a() {
        return a.INSTANCE;
    }
}