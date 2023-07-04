package lq;

/* loaded from: classes2.dex */
public abstract class f<T> {

    /* renamed from: b  reason: collision with root package name */
    private static String f37295b = "Invalid or non Implemented status";

    /* renamed from: a  reason: collision with root package name */
    public final e f37296a;

    public f(e eVar) {
        this.f37296a = eVar;
    }

    public abstract void a(Object obj, Object obj2);

    /* JADX WARN: Multi-variable type inference failed */
    public T b(Object obj) {
        return obj;
    }

    public abstract Object c();

    public Object d() {
        throw new RuntimeException(f37295b + " createObject() in " + getClass());
    }

    public void e(Object obj, String str, Object obj2) {
        throw new RuntimeException(f37295b + " setValue in " + getClass() + " key=" + str);
    }

    public f<?> f(String str) {
        throw new RuntimeException(f37295b + " startArray in " + getClass() + " key=" + str);
    }

    public f<?> g(String str) {
        throw new RuntimeException(f37295b + " startObject(String key) in " + getClass() + " key=" + str);
    }
}