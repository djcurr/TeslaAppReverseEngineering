package com.stripe.android.paymentsheet.paymentdatacollection;

import androidx.compose.ui.platform.l0;
import androidx.compose.ui.platform.y1;
import c1.a2;
import c1.e;
import c1.g1;
import c1.i;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.stripe.android.paymentsheet.forms.FormUIKt;
import com.stripe.android.ui.core.PaymentsThemeKt;
import f2.z;
import h00.p;
import h2.a;
import j1.c;
import kotlin.jvm.internal.u;
import o1.f;
import p0.e0;
import p0.h;
import p0.j;
import vz.b0;
import x2.d;
import x2.q;

/* loaded from: classes6.dex */
final class ComposeFormDataCollectionFragment$onCreateView$1$1 extends u implements p<i, Integer, b0> {
    final /* synthetic */ ComposeFormDataCollectionFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.ComposeFormDataCollectionFragment$onCreateView$1$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends u implements p<i, Integer, b0> {
        final /* synthetic */ ComposeFormDataCollectionFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ComposeFormDataCollectionFragment composeFormDataCollectionFragment) {
            super(2);
            this.this$0 = composeFormDataCollectionFragment;
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
                return;
            }
            f l11 = e0.l(f.f42062f1, BitmapDescriptorFactory.HUE_RED, 1, null);
            ComposeFormDataCollectionFragment composeFormDataCollectionFragment = this.this$0;
            iVar.x(-1113030915);
            z a11 = h.a(p0.a.f45228a.h(), o1.a.f42039a.h(), iVar, 0);
            iVar.x(1376089394);
            d dVar = (d) iVar.A(l0.d());
            q qVar = (q) iVar.A(l0.i());
            y1 y1Var = (y1) iVar.A(l0.m());
            a.C0551a c0551a = h2.a.Y0;
            h00.a<h2.a> a12 = c0551a.a();
            h00.q<g1<h2.a>, i, Integer, b0> b11 = f2.u.b(l11);
            if (!(iVar.k() instanceof e)) {
                c1.h.c();
            }
            iVar.D();
            if (iVar.f()) {
                iVar.s(a12);
            } else {
                iVar.o();
            }
            iVar.E();
            i a13 = a2.a(iVar);
            a2.c(a13, a11, c0551a.d());
            a2.c(a13, dVar, c0551a.b());
            a2.c(a13, qVar, c0551a.c());
            a2.c(a13, y1Var, c0551a.f());
            iVar.c();
            b11.invoke(g1.a(g1.b(iVar)), iVar, 0);
            iVar.x(2058660585);
            iVar.x(276693625);
            j jVar = j.f45341a;
            FormUIKt.Form(composeFormDataCollectionFragment.getFormViewModel(), iVar, 8);
            iVar.N();
            iVar.N();
            iVar.q();
            iVar.N();
            iVar.N();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposeFormDataCollectionFragment$onCreateView$1$1(ComposeFormDataCollectionFragment composeFormDataCollectionFragment) {
        super(2);
        this.this$0 = composeFormDataCollectionFragment;
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
            PaymentsThemeKt.PaymentsTheme(null, null, null, c.b(iVar, -819892821, true, new AnonymousClass1(this.this$0)), iVar, 3072, 7);
        }
    }
}