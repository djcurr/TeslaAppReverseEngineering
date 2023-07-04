package com.stripe.android.ui.core.elements;

import c1.i;
import c1.v1;
import com.stripe.android.ui.core.PaymentsThemeKt;
import h00.p;
import kotlin.jvm.internal.u;
import vz.b0;
import y0.h0;
import y0.o1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class BsbElementUIKt$BsbElementUI$1$1 extends u implements p<i, Integer, b0> {
    final /* synthetic */ v1<String> $bankName$delegate;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BsbElementUIKt$BsbElementUI$1$1(v1<String> v1Var) {
        super(2);
        this.$bankName$delegate = v1Var;
    }

    @Override // h00.p
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ b0 mo160invoke(i iVar, Integer num) {
        invoke(iVar, num.intValue());
        return b0.f54756a;
    }

    public final void invoke(i iVar, int i11) {
        String m428BsbElementUI$lambda1;
        if (((i11 & 11) ^ 2) != 0 || !iVar.i()) {
            m428BsbElementUI$lambda1 = BsbElementUIKt.m428BsbElementUI$lambda1(this.$bankName$delegate);
            if (m428BsbElementUI$lambda1 == null) {
                return;
            }
            o1.b(m428BsbElementUI$lambda1, null, PaymentsThemeKt.getPaymentsColors(h0.f58131a, iVar, 8).m386getSubtitle0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, iVar, 0, 0, 65530);
            return;
        }
        iVar.G();
    }
}