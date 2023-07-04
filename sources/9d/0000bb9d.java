package w00;

/* loaded from: classes5.dex */
public interface n0 {

    /* renamed from: a  reason: collision with root package name */
    public static final n0 f55303a = new a();

    /* loaded from: classes5.dex */
    static class a implements n0 {
        a() {
        }

        private static /* synthetic */ void d(int i11) {
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/descriptors/SourceElement$1", "getContainingFile"));
        }

        @Override // w00.n0
        public o0 b() {
            o0 o0Var = o0.f55304a;
            if (o0Var == null) {
                d(0);
            }
            return o0Var;
        }

        public String toString() {
            return "NO_SOURCE";
        }
    }

    o0 b();
}