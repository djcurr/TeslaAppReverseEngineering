package zg;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final b f60411a = new c();

    /* loaded from: classes3.dex */
    public static abstract class b {
        public abstract b a(String str, int i11);

        public abstract b b(String str, Object obj);

        public abstract void c();
    }

    /* loaded from: classes3.dex */
    private static class c extends b {
        private c() {
        }

        @Override // zg.a.b
        public b a(String str, int i11) {
            return this;
        }

        @Override // zg.a.b
        public b b(String str, Object obj) {
            return this;
        }

        @Override // zg.a.b
        public void c() {
        }
    }

    public static b a(long j11, String str) {
        return f60411a;
    }

    public static b b(long j11) {
        return f60411a;
    }
}