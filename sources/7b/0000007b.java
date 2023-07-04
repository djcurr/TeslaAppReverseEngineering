package a8;

/* loaded from: classes.dex */
public class g {

    /* renamed from: b  reason: collision with root package name */
    private static final g f345b = new g();

    /* renamed from: a  reason: collision with root package name */
    private final androidx.collection.e<String, v7.d> f346a = new androidx.collection.e<>(20);

    g() {
    }

    public static g b() {
        return f345b;
    }

    public v7.d a(String str) {
        if (str == null) {
            return null;
        }
        return this.f346a.get(str);
    }

    public void c(String str, v7.d dVar) {
        if (str == null) {
            return;
        }
        this.f346a.put(str, dVar);
    }
}