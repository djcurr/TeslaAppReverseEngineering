package androidx.work;

/* loaded from: classes.dex */
public interface t {

    /* renamed from: a  reason: collision with root package name */
    public static final b.c f6703a = new b.c();

    /* renamed from: b  reason: collision with root package name */
    public static final b.C0120b f6704b = new b.C0120b();

    /* loaded from: classes.dex */
    public static abstract class b {

        /* loaded from: classes.dex */
        public static final class a extends b {

            /* renamed from: a  reason: collision with root package name */
            private final Throwable f6705a;

            public a(Throwable th2) {
                this.f6705a = th2;
            }

            public Throwable a() {
                return this.f6705a;
            }

            public String toString() {
                return String.format("FAILURE (%s)", this.f6705a.getMessage());
            }
        }

        /* renamed from: androidx.work.t$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0120b extends b {
            public String toString() {
                return "IN_PROGRESS";
            }

            private C0120b() {
            }
        }

        /* loaded from: classes.dex */
        public static final class c extends b {
            public String toString() {
                return "SUCCESS";
            }

            private c() {
            }
        }

        b() {
        }
    }
}