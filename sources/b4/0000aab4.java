package ph;

import ph.c;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class n {

    /* loaded from: classes3.dex */
    public static abstract class a {
        public abstract n a();

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract a b(nh.b bVar);

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract a c(nh.c<?> cVar);

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract a d(nh.e<?, byte[]> eVar);

        public abstract a e(o oVar);

        public abstract a f(String str);
    }

    public static a a() {
        return new c.b();
    }

    public abstract nh.b b();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract nh.c<?> c();

    public byte[] d() {
        return e().apply(c().b());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract nh.e<?, byte[]> e();

    public abstract o f();

    public abstract String g();
}