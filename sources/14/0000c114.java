package y00;

/* loaded from: classes5.dex */
public interface a0 {

    /* renamed from: a  reason: collision with root package name */
    public static final a f58736a = a.f58737a;

    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f58737a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static final w00.w<a0> f58738b = new w00.w<>("PackageViewDescriptorFactory");

        private a() {
        }

        public final w00.w<a0> a() {
            return f58738b;
        }
    }

    /* loaded from: classes5.dex */
    public static final class b implements a0 {

        /* renamed from: b  reason: collision with root package name */
        public static final b f58739b = new b();

        private b() {
        }

        @Override // y00.a0
        public w00.f0 a(x module, u10.c fqName, j20.n storageManager) {
            kotlin.jvm.internal.s.g(module, "module");
            kotlin.jvm.internal.s.g(fqName, "fqName");
            kotlin.jvm.internal.s.g(storageManager, "storageManager");
            return new r(module, fqName, storageManager);
        }
    }

    w00.f0 a(x xVar, u10.c cVar, j20.n nVar);
}