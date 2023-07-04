package m0;

import androidx.compose.ui.platform.x0;
import androidx.compose.ui.platform.y0;
import c1.w0;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a  reason: collision with root package name */
    private static final w0<p> f38072a = c1.r.d(a.f38073a);

    /* loaded from: classes.dex */
    static final class a extends kotlin.jvm.internal.u implements h00.a<p> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f38073a = new a();

        a() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: a */
        public final p invoke() {
            return l.f37994a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends kotlin.jvm.internal.u implements h00.l<y0, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p f38074a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ o0.k f38075b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(p pVar, o0.k kVar) {
            super(1);
            this.f38074a = pVar;
            this.f38075b = kVar;
        }

        public final void a(y0 y0Var) {
            kotlin.jvm.internal.s.g(y0Var, "$this$null");
            y0Var.b("indication");
            y0Var.a().b("indication", this.f38074a);
            y0Var.a().b("interactionSource", this.f38075b);
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(y0 y0Var) {
            a(y0Var);
            return vz.b0.f54756a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class c extends kotlin.jvm.internal.u implements h00.q<o1.f, c1.i, Integer, o1.f> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p f38076a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ o0.k f38077b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(p pVar, o0.k kVar) {
            super(3);
            this.f38076a = pVar;
            this.f38077b = kVar;
        }

        public final o1.f a(o1.f composed, c1.i iVar, int i11) {
            kotlin.jvm.internal.s.g(composed, "$this$composed");
            iVar.x(-1051155076);
            p pVar = this.f38076a;
            if (pVar == null) {
                pVar = x.f38134a;
            }
            q a11 = pVar.a(this.f38077b, iVar, 0);
            iVar.x(-3686930);
            boolean O = iVar.O(a11);
            Object y11 = iVar.y();
            if (O || y11 == c1.i.f8486a.a()) {
                y11 = new s(a11);
                iVar.p(y11);
            }
            iVar.N();
            s sVar = (s) y11;
            iVar.N();
            return sVar;
        }

        @Override // h00.q
        public /* bridge */ /* synthetic */ o1.f invoke(o1.f fVar, c1.i iVar, Integer num) {
            return a(fVar, iVar, num.intValue());
        }
    }

    public static final w0<p> a() {
        return f38072a;
    }

    public static final o1.f b(o1.f fVar, o0.k interactionSource, p pVar) {
        kotlin.jvm.internal.s.g(fVar, "<this>");
        kotlin.jvm.internal.s.g(interactionSource, "interactionSource");
        return o1.e.a(fVar, x0.c() ? new b(pVar, interactionSource) : x0.a(), new c(pVar, interactionSource));
    }
}