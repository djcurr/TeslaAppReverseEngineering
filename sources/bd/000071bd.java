package h1;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final Object f28534a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f28535b;

    public a(Object obj, Object obj2) {
        this.f28534a = obj;
        this.f28535b = obj2;
    }

    public final boolean a() {
        return this.f28535b != i1.c.f29556a;
    }

    public final boolean b() {
        return this.f28534a != i1.c.f29556a;
    }

    public final Object c() {
        return this.f28535b;
    }

    public final Object d() {
        return this.f28534a;
    }

    public final a e(Object obj) {
        return new a(this.f28534a, obj);
    }

    public final a f(Object obj) {
        return new a(obj, this.f28535b);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public a() {
        /*
            r1 = this;
            i1.c r0 = i1.c.f29556a
            r1.<init>(r0, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h1.a.<init>():void");
    }

    public a(Object obj) {
        this(obj, i1.c.f29556a);
    }
}