package oh;

import oh.f;

/* loaded from: classes3.dex */
public abstract class l {

    /* loaded from: classes3.dex */
    public static abstract class a {
        public abstract l a();

        public abstract a b(Integer num);

        public abstract a c(long j11);

        public abstract a d(long j11);

        public abstract a e(o oVar);

        abstract a f(byte[] bArr);

        abstract a g(String str);

        public abstract a h(long j11);
    }

    private static a a() {
        return new f.b();
    }

    public static a i(String str) {
        return a().g(str);
    }

    public static a j(byte[] bArr) {
        return a().f(bArr);
    }

    public abstract Integer b();

    public abstract long c();

    public abstract long d();

    public abstract o e();

    public abstract byte[] f();

    public abstract String g();

    public abstract long h();
}