package com.stripe.android.ui.core.elements;

import c1.i;
import com.stripe.android.ui.core.elements.TextFieldIcon;
import h00.q;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import vz.b0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class TextFieldUIKt$AnimatedIcons$2 extends u implements q<TextFieldIcon.Trailing, i, Integer, b0> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ boolean $loading;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldUIKt$AnimatedIcons$2(boolean z11, int i11) {
        super(3);
        this.$loading = z11;
        this.$$dirty = i11;
    }

    @Override // h00.q
    public /* bridge */ /* synthetic */ b0 invoke(TextFieldIcon.Trailing trailing, i iVar, Integer num) {
        invoke(trailing, iVar, num.intValue());
        return b0.f54756a;
    }

    public final void invoke(TextFieldIcon.Trailing it2, i iVar, int i11) {
        s.g(it2, "it");
        if ((i11 & 14) == 0) {
            i11 |= iVar.O(it2) ? 4 : 2;
        }
        if (((i11 & 91) ^ 18) == 0 && iVar.i()) {
            iVar.G();
        } else {
            TextFieldUIKt.TrailingIcon(it2, this.$loading, iVar, (i11 & 14) | (this.$$dirty & 112));
        }
    }
}