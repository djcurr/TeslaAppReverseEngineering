package mq;

/* loaded from: classes2.dex */
public abstract class f {
    public f(int i11) {
        this(i11, null);
    }

    public abstract void a(int i11, int i12, String str, String str2, String str3, String[] strArr);

    public abstract a b(String str, boolean z11);

    public abstract void c(c cVar);

    public abstract void d();

    public abstract m e(int i11, String str, String str2, String str3, Object obj);

    public abstract void f(String str, String str2, String str3, int i11);

    public abstract s g(int i11, String str, String str2, String str3, String[] strArr);

    public abstract u h(String str, int i11, String str2);

    public abstract void i(String str);

    public abstract void j(String str);

    public abstract void k(String str, String str2, String str3);

    public abstract void l(String str);

    public abstract x m(String str, String str2, String str3);

    public abstract void n(String str, String str2);

    public abstract a o(int i11, c0 c0Var, String str, boolean z11);

    public f(int i11, f fVar) {
        if (i11 == 589824 || i11 == 524288 || i11 == 458752 || i11 == 393216 || i11 == 327680 || i11 == 262144 || i11 == 17432576) {
            if (i11 == 17432576) {
                i.a(this);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Unsupported api " + i11);
    }
}