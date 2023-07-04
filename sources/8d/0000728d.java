package h30;

/* loaded from: classes5.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    private final g30.v f28854a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f28855b;

    /* loaded from: classes5.dex */
    /* synthetic */ class a extends kotlin.jvm.internal.p implements h00.p<e30.f, Integer, Boolean> {
        a(Object obj) {
            super(2, obj, n.class, "readIfAbsent", "readIfAbsent(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", 0);
        }

        public final Boolean d(e30.f p02, int i11) {
            kotlin.jvm.internal.s.g(p02, "p0");
            return Boolean.valueOf(((n) this.receiver).e(p02, i11));
        }

        @Override // h00.p
        public /* bridge */ /* synthetic */ Boolean invoke(e30.f fVar, Integer num) {
            return d(fVar, num.intValue());
        }
    }

    public n(e30.f descriptor) {
        kotlin.jvm.internal.s.g(descriptor, "descriptor");
        this.f28854a = new g30.v(descriptor, new a(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean e(e30.f fVar, int i11) {
        boolean z11 = !fVar.i(i11) && fVar.g(i11).b();
        this.f28855b = z11;
        return z11;
    }

    public final boolean b() {
        return this.f28855b;
    }

    public final void c(int i11) {
        this.f28854a.a(i11);
    }

    public final int d() {
        return this.f28854a.d();
    }
}