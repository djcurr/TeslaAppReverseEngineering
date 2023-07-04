package com.stripe.android.paymentsheet.ui;

import com.stripe.android.ui.core.PaymentsThemeKt;
import com.stripe.android.ui.core.elements.HtmlKt;
import java.util.Map;
import kotlin.jvm.internal.u;
import n2.a0;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import vz.b0;
import wz.s0;
import y0.h0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class BaseSheetActivity$setupNotes$1$1$1 extends u implements h00.p<c1.i, Integer, b0> {
    final /* synthetic */ String $text;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.paymentsheet.ui.BaseSheetActivity$setupNotes$1$1$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends u implements h00.p<c1.i, Integer, b0> {
        final /* synthetic */ String $text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(String str) {
            super(2);
            this.$text = str;
        }

        @Override // h00.p
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ b0 mo160invoke(c1.i iVar, Integer num) {
            invoke(iVar, num.intValue());
            return b0.f54756a;
        }

        public final void invoke(c1.i iVar, int i11) {
            Map i12;
            a0 b11;
            if (((i11 & 11) ^ 2) == 0 && iVar.i()) {
                iVar.G();
                return;
            }
            String str = this.$text;
            i12 = s0.i();
            h0 h0Var = h0.f58131a;
            long m386getSubtitle0d7_KjU = PaymentsThemeKt.getPaymentsColors(h0Var, iVar, 8).m386getSubtitle0d7_KjU();
            b11 = r11.b((r44 & 1) != 0 ? r11.f() : 0L, (r44 & 2) != 0 ? r11.i() : 0L, (r44 & 4) != 0 ? r11.f40266c : null, (r44 & 8) != 0 ? r11.j() : null, (r44 & 16) != 0 ? r11.k() : null, (r44 & 32) != 0 ? r11.f40269f : null, (r44 & 64) != 0 ? r11.f40270g : null, (r44 & 128) != 0 ? r11.m() : 0L, (r44 & 256) != 0 ? r11.e() : null, (r44 & 512) != 0 ? r11.f40273j : null, (r44 & 1024) != 0 ? r11.f40274k : null, (r44 & 2048) != 0 ? r11.d() : 0L, (r44 & 4096) != 0 ? r11.f40276m : null, (r44 & PKIFailureInfo.certRevoked) != 0 ? r11.f40277n : null, (r44 & 16384) != 0 ? r11.q() : w2.d.g(w2.d.f55400b.a()), (r44 & 32768) != 0 ? r11.s() : null, (r44 & 65536) != 0 ? r11.n() : 0L, (r44 & 131072) != 0 ? h0Var.c(iVar, 8).c().f40281r : null);
            HtmlKt.m444HtmlFU0evQE(str, i12, m386getSubtitle0d7_KjU, b11, null, null, iVar, 64, 48);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseSheetActivity$setupNotes$1$1$1(String str) {
        super(2);
        this.$text = str;
    }

    @Override // h00.p
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ b0 mo160invoke(c1.i iVar, Integer num) {
        invoke(iVar, num.intValue());
        return b0.f54756a;
    }

    public final void invoke(c1.i iVar, int i11) {
        if (((i11 & 11) ^ 2) == 0 && iVar.i()) {
            iVar.G();
        } else {
            PaymentsThemeKt.PaymentsTheme(null, null, null, j1.c.b(iVar, -819904436, true, new AnonymousClass1(this.$text)), iVar, 3072, 7);
        }
    }
}