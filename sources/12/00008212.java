package l2;

/* loaded from: classes.dex */
public final class l {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes.dex */
    static final class a<T> extends kotlin.jvm.internal.u implements h00.a<T> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f36438a = new a();

        a() {
            super(0);
        }

        @Override // h00.a
        public final T invoke() {
            return null;
        }
    }

    public static final <T> T a(k kVar, u<T> key) {
        kotlin.jvm.internal.s.g(kVar, "<this>");
        kotlin.jvm.internal.s.g(key, "key");
        return (T) kVar.j(key, a.f36438a);
    }
}