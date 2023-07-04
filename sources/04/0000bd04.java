package wm;

import wm.b;

/* loaded from: classes2.dex */
public abstract class f {

    /* loaded from: classes2.dex */
    public static abstract class a {
        public abstract f a();

        public abstract a b(b bVar);

        public abstract a c(String str);

        public abstract a d(long j11);
    }

    /* loaded from: classes2.dex */
    public enum b {
        OK,
        BAD_CONFIG,
        AUTH_ERROR
    }

    public static a a() {
        return new b.C1272b().d(0L);
    }

    public abstract b b();

    public abstract String c();

    public abstract long d();
}