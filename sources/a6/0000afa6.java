package r1;

import androidx.compose.ui.platform.x0;
import androidx.compose.ui.platform.y0;
import c1.o0;
import c1.s1;

/* loaded from: classes.dex */
public final class b {

    /* loaded from: classes.dex */
    public static final class a extends kotlin.jvm.internal.u implements h00.l<y0, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h00.l f48971a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(h00.l lVar) {
            super(1);
            this.f48971a = lVar;
        }

        public final void a(y0 y0Var) {
            kotlin.jvm.internal.s.g(y0Var, "$this$null");
            y0Var.b("onFocusChanged");
            y0Var.a().b("onFocusChanged", this.f48971a);
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(y0 y0Var) {
            a(y0Var);
            return vz.b0.f54756a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r1.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C1067b extends kotlin.jvm.internal.u implements h00.q<o1.f, c1.i, Integer, o1.f> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h00.l<w, vz.b0> f48972a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: r1.b$b$a */
        /* loaded from: classes.dex */
        public static final class a extends kotlin.jvm.internal.u implements h00.l<w, vz.b0> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ o0<w> f48973a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ h00.l<w, vz.b0> f48974b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(o0<w> o0Var, h00.l<? super w, vz.b0> lVar) {
                super(1);
                this.f48973a = o0Var;
                this.f48974b = lVar;
            }

            @Override // h00.l
            public /* bridge */ /* synthetic */ vz.b0 invoke(w wVar) {
                invoke2(wVar);
                return vz.b0.f54756a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(w it2) {
                kotlin.jvm.internal.s.g(it2, "it");
                if (kotlin.jvm.internal.s.c(this.f48973a.getValue(), it2)) {
                    return;
                }
                this.f48973a.setValue(it2);
                this.f48974b.invoke(it2);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C1067b(h00.l<? super w, vz.b0> lVar) {
            super(3);
            this.f48972a = lVar;
        }

        public final o1.f a(o1.f composed, c1.i iVar, int i11) {
            kotlin.jvm.internal.s.g(composed, "$this$composed");
            iVar.x(-610209312);
            iVar.x(-3687241);
            Object y11 = iVar.y();
            if (y11 == c1.i.f8486a.a()) {
                y11 = s1.d(null, null, 2, null);
                iVar.p(y11);
            }
            iVar.N();
            o1.f a11 = f.a(o1.f.f42062f1, new a((o0) y11, this.f48972a));
            iVar.N();
            return a11;
        }

        @Override // h00.q
        public /* bridge */ /* synthetic */ o1.f invoke(o1.f fVar, c1.i iVar, Integer num) {
            return a(fVar, iVar, num.intValue());
        }
    }

    public static final o1.f a(o1.f fVar, h00.l<? super w, vz.b0> onFocusChanged) {
        kotlin.jvm.internal.s.g(fVar, "<this>");
        kotlin.jvm.internal.s.g(onFocusChanged, "onFocusChanged");
        return o1.e.a(fVar, x0.c() ? new a(onFocusChanged) : x0.a(), new C1067b(onFocusChanged));
    }
}