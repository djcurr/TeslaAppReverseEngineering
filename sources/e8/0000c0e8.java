package y0;

import androidx.compose.ui.platform.y1;

/* loaded from: classes.dex */
public final class q1 {

    /* renamed from: a  reason: collision with root package name */
    private static final c1.w0<Boolean> f58597a = c1.r.d(a.f58598a);

    /* loaded from: classes.dex */
    static final class a extends kotlin.jvm.internal.u implements h00.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f58598a = new a();

        a() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // h00.a
        public final Boolean invoke() {
            return Boolean.TRUE;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends kotlin.jvm.internal.u implements h00.l<androidx.compose.ui.platform.y0, vz.b0> {
        public b() {
            super(1);
        }

        public final void a(androidx.compose.ui.platform.y0 y0Var) {
            kotlin.jvm.internal.s.g(y0Var, "$this$null");
            y0Var.b("minimumTouchTargetSize");
            y0Var.a().b("README", "Adds outer padding to measure at least 48.dp (default) in size to disambiguate touch interactions if the element would measure smaller");
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(androidx.compose.ui.platform.y0 y0Var) {
            a(y0Var);
            return vz.b0.f54756a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class c extends kotlin.jvm.internal.u implements h00.q<o1.f, c1.i, Integer, o1.f> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f58599a = new c();

        c() {
            super(3);
        }

        public final o1.f a(o1.f composed, c1.i iVar, int i11) {
            o1.f fVar;
            kotlin.jvm.internal.s.g(composed, "$this$composed");
            iVar.x(88894699);
            if (((Boolean) iVar.A(q1.a())).booleanValue()) {
                fVar = new k0(((y1) iVar.A(androidx.compose.ui.platform.l0.m())).d(), null);
            } else {
                fVar = o1.f.f42062f1;
            }
            iVar.N();
            return fVar;
        }

        @Override // h00.q
        public /* bridge */ /* synthetic */ o1.f invoke(o1.f fVar, c1.i iVar, Integer num) {
            return a(fVar, iVar, num.intValue());
        }
    }

    public static final c1.w0<Boolean> a() {
        return f58597a;
    }

    public static final o1.f b(o1.f fVar) {
        kotlin.jvm.internal.s.g(fVar, "<this>");
        return o1.e.a(fVar, androidx.compose.ui.platform.x0.c() ? new b() : androidx.compose.ui.platform.x0.a(), c.f58599a);
    }
}