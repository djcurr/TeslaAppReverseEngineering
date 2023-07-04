package com.stripe.android.link.ui;

import androidx.compose.ui.platform.l0;
import androidx.compose.ui.platform.y1;
import c1.a2;
import c1.g1;
import c1.h;
import c1.i;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.stripe.android.link.R;
import com.stripe.android.link.theme.ThemeKt;
import f2.z;
import h00.a;
import h00.p;
import h00.q;
import h2.a;
import k2.c;
import k2.e;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import o1.f;
import p0.c0;
import p0.e0;
import p0.w;
import t1.a0;
import vz.b0;
import w1.b;
import x2.d;
import x2.g;
import y0.d0;
import y0.h0;
import y0.o;
import y0.o1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class LinkButtonKt$LinkButton$4 extends u implements p<i, Integer, b0> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ String $email;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ a<b0> $onClick;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.link.ui.LinkButtonKt$LinkButton$4$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends u implements p<i, Integer, b0> {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ String $email;
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ a<b0> $onClick;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.stripe.android.link.ui.LinkButtonKt$LinkButton$4$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C03721 extends u implements q<c0, i, Integer, b0> {
            final /* synthetic */ String $email;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C03721(String str) {
                super(3);
                this.$email = str;
            }

            @Override // h00.q
            public /* bridge */ /* synthetic */ b0 invoke(c0 c0Var, i iVar, Integer num) {
                invoke(c0Var, iVar, num.intValue());
                return b0.f54756a;
            }

            public final void invoke(c0 Button, i iVar, int i11) {
                int i12;
                s.g(Button, "$this$Button");
                if ((i11 & 14) == 0) {
                    i12 = i11 | (iVar.O(Button) ? 4 : 2);
                } else {
                    i12 = i11;
                }
                if (((i12 & 91) ^ 18) == 0 && iVar.i()) {
                    iVar.G();
                    return;
                }
                b c11 = c.c(R.drawable.ic_link_logo, iVar, 0);
                String b11 = e.b(R.string.link, iVar, 0);
                f.a aVar = f.f42062f1;
                float f11 = 3;
                f l11 = p0.u.l(e0.o(aVar, g.f(22)), g.f(5), g.f(f11), BitmapDescriptorFactory.HUE_RED, g.f(f11), 4, null);
                h0 h0Var = h0.f58131a;
                d0.a(c11, b11, l11, a0.l(ThemeKt.getLinkColors(h0Var, iVar, 8).m187getButtonLabel0d7_KjU(), ((Number) iVar.A(o.a())).floatValue(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), iVar, 392, 0);
                String str = this.$email;
                if (str == null) {
                    return;
                }
                p0.h0.a(c0.a.a(Button, aVar, 1.0f, false, 2, null), iVar, 0);
                f a11 = m0.b.a(aVar, a0.l(a0.f51365b.a(), 0.05f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), h0Var.b(iVar, 8).e());
                iVar.x(-1990474327);
                z i13 = p0.c.i(o1.a.f42039a.k(), false, iVar, 0);
                iVar.x(1376089394);
                d dVar = (d) iVar.A(l0.d());
                x2.q qVar = (x2.q) iVar.A(l0.i());
                y1 y1Var = (y1) iVar.A(l0.m());
                a.C0551a c0551a = h2.a.Y0;
                h00.a<h2.a> a12 = c0551a.a();
                q<g1<h2.a>, i, Integer, b0> b12 = f2.u.b(a11);
                if (!(iVar.k() instanceof c1.e)) {
                    h.c();
                }
                iVar.D();
                if (iVar.f()) {
                    iVar.s(a12);
                } else {
                    iVar.o();
                }
                iVar.E();
                i a13 = a2.a(iVar);
                a2.c(a13, i13, c0551a.d());
                a2.c(a13, dVar, c0551a.b());
                a2.c(a13, qVar, c0551a.c());
                a2.c(a13, y1Var, c0551a.f());
                iVar.c();
                b12.invoke(g1.a(g1.b(iVar)), iVar, 0);
                iVar.x(2058660585);
                iVar.x(-1253629305);
                p0.d dVar2 = p0.d.f45270a;
                o1.b(str, p0.u.h(aVar, g.f(6)), ThemeKt.getLinkColors(h0Var, iVar, 8).m187getButtonLabel0d7_KjU(), x2.s.f(14), null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, iVar, 3120, 0, 65520);
                iVar.N();
                iVar.N();
                iVar.q();
                iVar.N();
                iVar.N();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(h00.a<b0> aVar, boolean z11, int i11, String str) {
            super(2);
            this.$onClick = aVar;
            this.$enabled = z11;
            this.$$dirty = i11;
            this.$email = str;
        }

        @Override // h00.p
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ b0 mo160invoke(i iVar, Integer num) {
            invoke(iVar, num.intValue());
            return b0.f54756a;
        }

        public final void invoke(i iVar, int i11) {
            float f11;
            float f12;
            float f13;
            float f14;
            if (((i11 & 11) ^ 2) == 0 && iVar.i()) {
                iVar.G();
                return;
            }
            h00.a<b0> aVar = this.$onClick;
            boolean z11 = this.$enabled;
            y0.d dVar = y0.d.f57958a;
            h0 h0Var = h0.f58131a;
            y0.c a11 = dVar.a(h0Var.a(iVar, 8).j(), 0L, h0Var.a(iVar, 8).j(), 0L, iVar, 32768, 10);
            f11 = LinkButtonKt.LinkButtonHorizontalPadding;
            f12 = LinkButtonKt.LinkButtonVerticalPadding;
            f13 = LinkButtonKt.LinkButtonHorizontalPadding;
            f14 = LinkButtonKt.LinkButtonVerticalPadding;
            w d11 = p0.u.d(f11, f12, f13, f14);
            j1.a b11 = j1.c.b(iVar, -819892913, true, new C03721(this.$email));
            int i12 = this.$$dirty;
            y0.f.a(aVar, null, z11, null, null, null, null, a11, d11, b11, iVar, 905969664 | ((i12 >> 6) & 14) | ((i12 << 6) & 896), 122);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkButtonKt$LinkButton$4(h00.a<b0> aVar, boolean z11, int i11, String str) {
        super(2);
        this.$onClick = aVar;
        this.$enabled = z11;
        this.$$dirty = i11;
        this.$email = str;
    }

    @Override // h00.p
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ b0 mo160invoke(i iVar, Integer num) {
        invoke(iVar, num.intValue());
        return b0.f54756a;
    }

    public final void invoke(i iVar, int i11) {
        if (((i11 & 11) ^ 2) == 0 && iVar.i()) {
            iVar.G();
        } else {
            ThemeKt.DefaultLinkTheme(false, j1.c.b(iVar, -819892241, true, new AnonymousClass1(this.$onClick, this.$enabled, this.$$dirty, this.$email)), iVar, 48, 1);
        }
    }
}