package ul;

/* loaded from: classes3.dex */
public class t<T> implements sm.b<T> {

    /* renamed from: c  reason: collision with root package name */
    private static final Object f53598c = new Object();

    /* renamed from: a  reason: collision with root package name */
    private volatile Object f53599a = f53598c;

    /* renamed from: b  reason: collision with root package name */
    private volatile sm.b<T> f53600b;

    public t(sm.b<T> bVar) {
        this.f53600b = bVar;
    }

    @Override // sm.b
    public T get() {
        T t11 = (T) this.f53599a;
        Object obj = f53598c;
        if (t11 == obj) {
            synchronized (this) {
                t11 = this.f53599a;
                if (t11 == obj) {
                    t11 = this.f53600b.get();
                    this.f53599a = t11;
                    this.f53600b = null;
                }
            }
        }
        return t11;
    }
}