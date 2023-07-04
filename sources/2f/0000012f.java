package am;

/* loaded from: classes3.dex */
public abstract class c0 {

    /* loaded from: classes3.dex */
    public static abstract class a {
        public static a b(String str, String str2, String str3, String str4, int i11, wl.e eVar) {
            return new x(str, str2, str3, str4, i11, eVar);
        }

        public abstract String a();

        public abstract int c();

        public abstract wl.e d();

        public abstract String e();

        public abstract String f();

        public abstract String g();
    }

    /* loaded from: classes3.dex */
    public static abstract class b {
        public static b c(int i11, String str, int i12, long j11, long j12, boolean z11, int i13, String str2, String str3) {
            return new y(i11, str, i12, j11, j12, z11, i13, str2, str3);
        }

        public abstract int a();

        public abstract int b();

        public abstract long d();

        public abstract boolean e();

        public abstract String f();

        public abstract String g();

        public abstract String h();

        public abstract int i();

        public abstract long j();
    }

    /* loaded from: classes3.dex */
    public static abstract class c {
        public static c a(String str, String str2, boolean z11) {
            return new z(str, str2, z11);
        }

        public abstract boolean b();

        public abstract String c();

        public abstract String d();
    }

    public static c0 b(a aVar, c cVar, b bVar) {
        return new w(aVar, cVar, bVar);
    }

    public abstract a a();

    public abstract b c();

    public abstract c d();
}