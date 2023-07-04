package n0;

import android.content.Context;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static final a f39689a = new a();

    /* loaded from: classes.dex */
    public static final class a implements v {
        a() {
        }

        @Override // n0.v
        public void a(long j11, long j12, s1.f fVar, int i11) {
        }

        @Override // n0.v
        public void b(long j11) {
        }

        @Override // n0.v
        public long c(long j11) {
            return x2.u.f56966b.a();
        }

        @Override // n0.v
        public void d(long j11, boolean z11) {
        }

        @Override // n0.v
        public void e(v1.e eVar) {
            kotlin.jvm.internal.s.g(eVar, "<this>");
        }

        @Override // n0.v
        public boolean f() {
            return false;
        }

        @Override // n0.v
        public long g(long j11, s1.f fVar, int i11) {
            return s1.f.f49950b.c();
        }

        @Override // n0.v
        public void release() {
        }
    }

    /* renamed from: n0.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static final class C0767b extends kotlin.jvm.internal.u implements h00.l<v1.c, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ v f39690a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0767b(v vVar) {
            super(1);
            this.f39690a = vVar;
        }

        public final void a(v1.c drawWithContent) {
            kotlin.jvm.internal.s.g(drawWithContent, "$this$drawWithContent");
            drawWithContent.s0();
            this.f39690a.e(drawWithContent);
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(v1.c cVar) {
            a(cVar);
            return vz.b0.f54756a;
        }
    }

    public static final o1.f a(o1.f fVar, v overScrollController) {
        kotlin.jvm.internal.s.g(fVar, "<this>");
        kotlin.jvm.internal.s.g(overScrollController, "overScrollController");
        return q1.i.c(fVar, new C0767b(overScrollController));
    }

    public static final v b(c1.i iVar, int i11) {
        iVar.x(-1658914945);
        Context context = (Context) iVar.A(androidx.compose.ui.platform.z.g());
        t tVar = (t) iVar.A(u.a());
        iVar.x(-3686552);
        boolean O = iVar.O(context) | iVar.O(tVar);
        Object y11 = iVar.y();
        if (O || y11 == c1.i.f8486a.a()) {
            if (tVar != null) {
                y11 = new n0.a(context, tVar);
            } else {
                y11 = f39689a;
            }
            iVar.p(y11);
        }
        iVar.N();
        v vVar = (v) y11;
        iVar.N();
        return vVar;
    }
}