package w0;

import android.view.KeyEvent;

/* loaded from: classes.dex */
public final class k0 {

    /* loaded from: classes.dex */
    static final class a extends kotlin.jvm.internal.u implements h00.q<o1.f, c1.i, Integer, o1.f> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ t0 f55101a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ x0.t f55102b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ s2.a0 f55103c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f55104d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f55105e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ s2.t f55106f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ a1 f55107g;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: w0.k0$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public /* synthetic */ class C1250a extends kotlin.jvm.internal.p implements h00.l<b2.b, Boolean> {
            C1250a(Object obj) {
                super(1, obj, j0.class, "process", "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0);
            }

            public final Boolean d(KeyEvent p02) {
                kotlin.jvm.internal.s.g(p02, "p0");
                return Boolean.valueOf(((j0) this.receiver).j(p02));
            }

            @Override // h00.l
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Boolean mo12invoke(b2.b bVar) {
                return d(bVar.f());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(t0 t0Var, x0.t tVar, s2.a0 a0Var, boolean z11, boolean z12, s2.t tVar2, a1 a1Var) {
            super(3);
            this.f55101a = t0Var;
            this.f55102b = tVar;
            this.f55103c = a0Var;
            this.f55104d = z11;
            this.f55105e = z12;
            this.f55106f = tVar2;
            this.f55107g = a1Var;
        }

        public final o1.f a(o1.f composed, c1.i iVar, int i11) {
            kotlin.jvm.internal.s.g(composed, "$this$composed");
            iVar.x(-1205064668);
            iVar.x(-3687241);
            Object y11 = iVar.y();
            if (y11 == c1.i.f8486a.a()) {
                y11 = new x0.w();
                iVar.p(y11);
            }
            iVar.N();
            o1.f a11 = b2.f.a(o1.f.f42062f1, new C1250a(new j0(this.f55101a, this.f55102b, this.f55103c, this.f55104d, this.f55105e, (x0.w) y11, this.f55106f, this.f55107g, null, 256, null)));
            iVar.N();
            return a11;
        }

        @Override // h00.q
        public /* bridge */ /* synthetic */ o1.f invoke(o1.f fVar, c1.i iVar, Integer num) {
            return a(fVar, iVar, num.intValue());
        }
    }

    public static final o1.f a(o1.f fVar, t0 state, x0.t manager, s2.a0 value, boolean z11, boolean z12, s2.t offsetMapping, a1 undoManager) {
        kotlin.jvm.internal.s.g(fVar, "<this>");
        kotlin.jvm.internal.s.g(state, "state");
        kotlin.jvm.internal.s.g(manager, "manager");
        kotlin.jvm.internal.s.g(value, "value");
        kotlin.jvm.internal.s.g(offsetMapping, "offsetMapping");
        kotlin.jvm.internal.s.g(undoManager, "undoManager");
        return o1.e.b(fVar, null, new a(state, manager, value, z11, z12, offsetMapping, undoManager), 1, null);
    }
}