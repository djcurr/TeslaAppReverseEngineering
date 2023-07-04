package x0;

import c1.e1;
import d2.c0;
import d2.i0;
import vz.b0;
import w0.e0;
import w0.t0;

/* loaded from: classes.dex */
public final class u {

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt$TextFieldSelectionHandle$1", f = "TextFieldSelectionManager.kt", l = {743}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.l implements h00.p<c0, zz.d<? super b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f56620a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f56621b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ e0 f56622c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(e0 e0Var, zz.d<? super a> dVar) {
            super(2, dVar);
            this.f56622c = e0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<b0> create(Object obj, zz.d<?> dVar) {
            a aVar = new a(this.f56622c, dVar);
            aVar.f56621b = obj;
            return aVar;
        }

        @Override // h00.p
        public final Object mo160invoke(c0 c0Var, zz.d<? super b0> dVar) {
            return ((a) create(c0Var, dVar)).invokeSuspend(b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            d11 = a00.d.d();
            int i11 = this.f56620a;
            if (i11 == 0) {
                vz.r.b(obj);
                e0 e0Var = this.f56622c;
                this.f56620a = 1;
                if (w0.w.b((c0) this.f56621b, e0Var, this) == d11) {
                    return d11;
                }
            } else if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                vz.r.b(obj);
            }
            return b0.f54756a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends kotlin.jvm.internal.u implements h00.p<c1.i, Integer, b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f56623a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ w2.c f56624b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ t f56625c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f56626d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z11, w2.c cVar, t tVar, int i11) {
            super(2);
            this.f56623a = z11;
            this.f56624b = cVar;
            this.f56625c = tVar;
            this.f56626d = i11;
        }

        @Override // h00.p
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ b0 mo160invoke(c1.i iVar, Integer num) {
            invoke(iVar, num.intValue());
            return b0.f54756a;
        }

        public final void invoke(c1.i iVar, int i11) {
            u.a(this.f56623a, this.f56624b, this.f56625c, iVar, this.f56626d | 1);
        }
    }

    public static final void a(boolean z11, w2.c direction, t manager, c1.i iVar, int i11) {
        kotlin.jvm.internal.s.g(direction, "direction");
        kotlin.jvm.internal.s.g(manager, "manager");
        c1.i h11 = iVar.h(-1630620237);
        Boolean valueOf = Boolean.valueOf(z11);
        h11.x(-3686552);
        boolean O = h11.O(valueOf) | h11.O(manager);
        Object y11 = h11.y();
        if (O || y11 == c1.i.f8486a.a()) {
            y11 = manager.D(z11);
            h11.p(y11);
        }
        h11.N();
        e0 e0Var = (e0) y11;
        long u11 = manager.u(z11);
        boolean m11 = n2.y.m(manager.C().g());
        o1.f b11 = i0.b(o1.f.f42062f1, e0Var, new a(e0Var, null));
        int i12 = i11 << 3;
        x0.a.c(u11, z11, direction, m11, b11, null, h11, 196608 | (i12 & 112) | (i12 & 896));
        e1 l11 = h11.l();
        if (l11 == null) {
            return;
        }
        l11.a(new b(z11, direction, manager, i11));
    }

    public static final boolean b(t tVar, boolean z11) {
        f2.o f11;
        s1.h b11;
        kotlin.jvm.internal.s.g(tVar, "<this>");
        t0 z12 = tVar.z();
        if (z12 == null || (f11 = z12.f()) == null || (b11 = n.b(f11)) == null) {
            return false;
        }
        return n.a(b11, tVar.u(z11));
    }
}