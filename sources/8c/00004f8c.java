package com.stripe.android.link.ui;

import c1.i;
import com.stripe.android.link.theme.ThemeKt;
import h00.q;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import p0.c0;
import vz.b0;
import y0.h0;
import y0.o1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class PrimaryButtonKt$SecondaryButton$1 extends u implements q<c0, i, Integer, b0> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ String $label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrimaryButtonKt$SecondaryButton$1(String str, int i11) {
        super(3);
        this.$label = str;
        this.$$dirty = i11;
    }

    @Override // h00.q
    public /* bridge */ /* synthetic */ b0 invoke(c0 c0Var, i iVar, Integer num) {
        invoke(c0Var, iVar, num.intValue());
        return b0.f54756a;
    }

    public final void invoke(c0 TextButton, i iVar, int i11) {
        s.g(TextButton, "$this$TextButton");
        if (((i11 & 81) ^ 16) == 0 && iVar.i()) {
            iVar.G();
        } else {
            o1.b(this.$label, null, ThemeKt.getLinkColors(h0.f58131a, iVar, 8).m197getSecondaryButtonLabel0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, iVar, (this.$$dirty >> 3) & 14, 0, 65530);
        }
    }
}