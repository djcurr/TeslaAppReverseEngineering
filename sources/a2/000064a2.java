package d;

import androidx.activity.OnBackPressedDispatcher;
import androidx.lifecycle.v;
import c1.e1;
import c1.i;
import c1.n1;
import c1.v1;
import c1.y;
import c1.z;
import h00.l;
import h00.p;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import vz.b0;

/* loaded from: classes.dex */
public final class c {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a extends u implements h00.a<b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f23226a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f23227b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(d dVar, boolean z11) {
            super(0);
            this.f23226a = dVar;
            this.f23227b = z11;
        }

        @Override // h00.a
        public /* bridge */ /* synthetic */ b0 invoke() {
            invoke2();
            return b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f23226a.setEnabled(this.f23227b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends u implements l<z, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ OnBackPressedDispatcher f23228a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ v f23229b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ d f23230c;

        /* loaded from: classes.dex */
        public static final class a implements y {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ d f23231a;

            public a(d dVar) {
                this.f23231a = dVar;
            }

            @Override // c1.y
            public void dispose() {
                this.f23231a.remove();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(OnBackPressedDispatcher onBackPressedDispatcher, v vVar, d dVar) {
            super(1);
            this.f23228a = onBackPressedDispatcher;
            this.f23229b = vVar;
            this.f23230c = dVar;
        }

        @Override // h00.l
        public final y invoke(z DisposableEffect) {
            s.g(DisposableEffect, "$this$DisposableEffect");
            this.f23228a.b(this.f23229b, this.f23230c);
            return new a(this.f23230c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0448c extends u implements p<i, Integer, b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f23232a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h00.a<b0> f23233b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f23234c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f23235d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0448c(boolean z11, h00.a<b0> aVar, int i11, int i12) {
            super(2);
            this.f23232a = z11;
            this.f23233b = aVar;
            this.f23234c = i11;
            this.f23235d = i12;
        }

        @Override // h00.p
        public /* bridge */ /* synthetic */ b0 invoke(i iVar, Integer num) {
            invoke(iVar, num.intValue());
            return b0.f54756a;
        }

        public final void invoke(i iVar, int i11) {
            c.a(this.f23232a, this.f23233b, iVar, this.f23234c | 1, this.f23235d);
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends androidx.activity.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ v1<h00.a<b0>> f23236a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(v1<? extends h00.a<b0>> v1Var, boolean z11) {
            super(z11);
            this.f23236a = v1Var;
        }

        @Override // androidx.activity.e
        public void handleOnBackPressed() {
            c.b(this.f23236a).invoke();
        }
    }

    public static final void a(boolean z11, h00.a<b0> onBack, i iVar, int i11, int i12) {
        int i13;
        s.g(onBack, "onBack");
        i h11 = iVar.h(-971160336);
        int i14 = i12 & 1;
        if (i14 != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 14) == 0) {
            i13 = (h11.a(z11) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 112) == 0) {
            i13 |= h11.O(onBack) ? 32 : 16;
        }
        if (((i13 & 91) ^ 18) == 0 && h11.i()) {
            h11.G();
        } else {
            if (i14 != 0) {
                z11 = true;
            }
            v1 m11 = n1.m(onBack, h11, (i13 >> 3) & 14);
            h11.x(-3687241);
            Object y11 = h11.y();
            i.a aVar = i.f8486a;
            if (y11 == aVar.a()) {
                y11 = new d(m11, z11);
                h11.p(y11);
            }
            h11.N();
            d dVar = (d) y11;
            Boolean valueOf = Boolean.valueOf(z11);
            h11.x(-3686552);
            boolean O = h11.O(valueOf) | h11.O(dVar);
            Object y12 = h11.y();
            if (O || y12 == aVar.a()) {
                y12 = new a(dVar, z11);
                h11.p(y12);
            }
            h11.N();
            c1.b0.h((h00.a) y12, h11, 0);
            androidx.activity.f a11 = f.f23241a.a(h11, 0);
            if (a11 != null) {
                OnBackPressedDispatcher onBackPressedDispatcher = a11.getOnBackPressedDispatcher();
                s.f(onBackPressedDispatcher, "checkNotNull(LocalOnBack…}.onBackPressedDispatcher");
                v vVar = (v) h11.A(androidx.compose.ui.platform.z.i());
                c1.b0.b(vVar, onBackPressedDispatcher, new b(onBackPressedDispatcher, vVar, dVar), h11, 72);
            } else {
                throw new IllegalStateException("No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner".toString());
            }
        }
        e1 l11 = h11.l();
        if (l11 == null) {
            return;
        }
        l11.a(new C0448c(z11, onBack, i11, i12));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h00.a<b0> b(v1<? extends h00.a<b0>> v1Var) {
        return v1Var.getValue();
    }
}