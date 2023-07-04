package yh;

/* loaded from: classes3.dex */
public final class i implements sh.b<Integer> {

    /* loaded from: classes3.dex */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private static final i f59524a = new i();
    }

    public static i a() {
        return a.f59524a;
    }

    public static int c() {
        return f.c();
    }

    @Override // javax.inject.Provider
    /* renamed from: b */
    public Integer get() {
        return Integer.valueOf(c());
    }
}