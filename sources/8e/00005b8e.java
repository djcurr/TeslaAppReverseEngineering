package com.stripe.android.ui.core.elements;

import c1.i;
import com.stripe.android.ui.core.elements.TextFieldIcon;
import h00.p;
import kotlin.jvm.internal.u;
import vz.b0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class TextFieldUIKt$TrailingIcon$3 extends u implements p<i, Integer, b0> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ boolean $loading;
    final /* synthetic */ TextFieldIcon.Trailing $trailingIcon;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldUIKt$TrailingIcon$3(TextFieldIcon.Trailing trailing, boolean z11, int i11) {
        super(2);
        this.$trailingIcon = trailing;
        this.$loading = z11;
        this.$$changed = i11;
    }

    @Override // h00.p
    public /* bridge */ /* synthetic */ b0 invoke(i iVar, Integer num) {
        invoke(iVar, num.intValue());
        return b0.f54756a;
    }

    public final void invoke(i iVar, int i11) {
        TextFieldUIKt.TrailingIcon(this.$trailingIcon, this.$loading, iVar, this.$$changed | 1);
    }
}