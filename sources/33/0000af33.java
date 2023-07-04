package qz;

/* loaded from: classes5.dex */
public abstract class a0 {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static final class b extends a0 {

        /* renamed from: a  reason: collision with root package name */
        private final int f48809a;

        b(int i11) {
            super();
            this.f48809a = i11;
        }

        @Override // qz.a0
        public int c() {
            return this.f48809a;
        }

        @Override // qz.a0
        public boolean d() {
            return false;
        }
    }

    /* loaded from: classes5.dex */
    private static final class c extends a0 {

        /* renamed from: a  reason: collision with root package name */
        static final c f48810a = new c();

        private c() {
            super();
        }

        @Override // qz.a0
        public int c() {
            return -1;
        }

        @Override // qz.a0
        public boolean d() {
            return true;
        }
    }

    public static a0 a() {
        return b(-1);
    }

    public static a0 b(int i11) {
        return new b(i11);
    }

    public static a0 e() {
        return c.f48810a;
    }

    public abstract int c();

    public abstract boolean d();

    private a0() {
    }
}