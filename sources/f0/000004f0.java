package androidx.compose.ui.platform;

import androidx.lifecycle.p;

/* loaded from: classes.dex */
public final class x1 {

    /* loaded from: classes.dex */
    public static final class a extends kotlin.jvm.internal.u implements h00.a<vz.b0> {

        /* renamed from: a */
        final /* synthetic */ androidx.lifecycle.p f3141a;

        /* renamed from: b */
        final /* synthetic */ androidx.lifecycle.s f3142b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.lifecycle.p pVar, androidx.lifecycle.s sVar) {
            super(0);
            this.f3141a = pVar;
            this.f3142b = sVar;
        }

        @Override // h00.a
        public /* bridge */ /* synthetic */ vz.b0 invoke() {
            invoke2();
            return vz.b0.f54756a;
        }

        /* renamed from: invoke */
        public final void invoke2() {
            this.f3141a.c(this.f3142b);
        }
    }

    public static /* synthetic */ void a(androidx.compose.ui.platform.a aVar, androidx.lifecycle.v vVar, p.b bVar) {
        d(aVar, vVar, bVar);
    }

    public static final /* synthetic */ h00.a b(androidx.compose.ui.platform.a aVar, androidx.lifecycle.p pVar) {
        return c(aVar, pVar);
    }

    public static final h00.a<vz.b0> c(final androidx.compose.ui.platform.a aVar, androidx.lifecycle.p pVar) {
        if (pVar.b().compareTo(p.c.DESTROYED) > 0) {
            androidx.lifecycle.s sVar = new androidx.lifecycle.s() { // from class: androidx.compose.ui.platform.w1
                @Override // androidx.lifecycle.s
                public final void g(androidx.lifecycle.v vVar, p.b bVar) {
                    x1.a(a.this, vVar, bVar);
                }
            };
            pVar.a(sVar);
            return new a(pVar, sVar);
        }
        throw new IllegalStateException(("Cannot configure " + aVar + " to disposeComposition at Lifecycle ON_DESTROY: " + pVar + "is already destroyed").toString());
    }

    public static final void d(androidx.compose.ui.platform.a view, androidx.lifecycle.v noName_0, p.b event) {
        kotlin.jvm.internal.s.g(view, "$view");
        kotlin.jvm.internal.s.g(noName_0, "$noName_0");
        kotlin.jvm.internal.s.g(event, "event");
        if (event == p.b.ON_DESTROY) {
            view.disposeComposition();
        }
    }
}