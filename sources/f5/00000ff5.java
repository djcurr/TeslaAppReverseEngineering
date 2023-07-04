package cb;

/* loaded from: classes.dex */
public abstract class c {

    /* loaded from: classes.dex */
    private static class b extends c {

        /* renamed from: a  reason: collision with root package name */
        private volatile boolean f9038a;

        b() {
            super();
        }

        @Override // cb.c
        public void b(boolean z11) {
            this.f9038a = z11;
        }

        @Override // cb.c
        public void c() {
            if (this.f9038a) {
                throw new IllegalStateException("Already released");
            }
        }
    }

    public static c a() {
        return new b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void b(boolean z11);

    public abstract void c();

    private c() {
    }
}