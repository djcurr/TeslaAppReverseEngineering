package md;

/* loaded from: classes.dex */
public class o {

    /* renamed from: a  reason: collision with root package name */
    public static final n<Boolean> f38489a;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes.dex */
    static class a<T> implements n<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Object f38490a;

        a(Object obj) {
            this.f38490a = obj;
        }

        @Override // md.n
        public T get() {
            return (T) this.f38490a;
        }
    }

    /* loaded from: classes.dex */
    static class b implements n<Boolean> {
        b() {
        }

        @Override // md.n
        /* renamed from: a */
        public Boolean get() {
            return Boolean.TRUE;
        }
    }

    /* loaded from: classes.dex */
    static class c implements n<Boolean> {
        c() {
        }

        @Override // md.n
        /* renamed from: a */
        public Boolean get() {
            return Boolean.FALSE;
        }
    }

    static {
        new b();
        f38489a = new c();
    }

    public static <T> n<T> a(T t11) {
        return new a(t11);
    }
}