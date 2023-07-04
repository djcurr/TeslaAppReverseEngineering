package k1;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.g0;
import androidx.lifecycle.v;
import c1.b0;
import c1.i;
import c1.o0;
import c1.s1;
import c1.v1;
import c1.y;
import c1.z;
import h00.l;
import k1.b;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;

/* loaded from: classes.dex */
public final class b {

    /* loaded from: classes.dex */
    public static final class a extends u implements l<z, y> {

        /* renamed from: a */
        final /* synthetic */ LiveData<T> f34205a;

        /* renamed from: b */
        final /* synthetic */ v f34206b;

        /* renamed from: c */
        final /* synthetic */ o0<R> f34207c;

        /* renamed from: k1.b$a$a */
        /* loaded from: classes.dex */
        public static final class C0634a implements y {

            /* renamed from: a */
            final /* synthetic */ LiveData f34208a;

            /* renamed from: b */
            final /* synthetic */ g0 f34209b;

            public C0634a(LiveData liveData, g0 g0Var) {
                this.f34208a = liveData;
                this.f34209b = g0Var;
            }

            @Override // c1.y
            public void dispose() {
                this.f34208a.removeObserver(this.f34209b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(LiveData<T> liveData, v vVar, o0<R> o0Var) {
            super(1);
            this.f34205a = liveData;
            this.f34206b = vVar;
            this.f34207c = o0Var;
        }

        public static /* synthetic */ void a(o0 o0Var, Object obj) {
            b(o0Var, obj);
        }

        public static final void b(o0 state, Object obj) {
            s.g(state, "$state");
            state.setValue(obj);
        }

        @Override // h00.l
        public final y invoke(z DisposableEffect) {
            s.g(DisposableEffect, "$this$DisposableEffect");
            final o0<R> o0Var = this.f34207c;
            g0 g0Var = new g0() { // from class: k1.a
                @Override // androidx.lifecycle.g0
                public final void onChanged(Object obj) {
                    b.a.a(o0Var, obj);
                }
            };
            this.f34205a.observe(this.f34206b, g0Var);
            return new C0634a(this.f34205a, g0Var);
        }
    }

    public static final <T> v1<T> a(LiveData<T> liveData, i iVar, int i11) {
        s.g(liveData, "<this>");
        iVar.x(-2027640062);
        v1<T> b11 = b(liveData, liveData.getValue(), iVar, 8);
        iVar.N();
        return b11;
    }

    public static final <R, T extends R> v1<R> b(LiveData<T> liveData, R r11, i iVar, int i11) {
        s.g(liveData, "<this>");
        iVar.x(-2027639486);
        v vVar = (v) iVar.A(androidx.compose.ui.platform.z.i());
        iVar.x(-3687241);
        Object y11 = iVar.y();
        if (y11 == i.f8486a.a()) {
            y11 = s1.d(r11, null, 2, null);
            iVar.p(y11);
        }
        iVar.N();
        o0 o0Var = (o0) y11;
        b0.b(liveData, vVar, new a(liveData, vVar, o0Var), iVar, 72);
        iVar.N();
        return o0Var;
    }
}