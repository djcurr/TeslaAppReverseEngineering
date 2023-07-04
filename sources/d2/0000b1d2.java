package s2;

/* loaded from: classes.dex */
public interface t {

    /* renamed from: a  reason: collision with root package name */
    public static final a f50149a = a.f50150a;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f50150a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static final t f50151b = new C1108a();

        /* renamed from: s2.t$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C1108a implements t {
            C1108a() {
            }

            @Override // s2.t
            public int originalToTransformed(int i11) {
                return i11;
            }

            @Override // s2.t
            public int transformedToOriginal(int i11) {
                return i11;
            }
        }

        private a() {
        }

        public final t a() {
            return f50151b;
        }
    }

    int originalToTransformed(int i11);

    int transformedToOriginal(int i11);
}