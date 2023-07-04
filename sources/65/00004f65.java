package com.stripe.android.link.theme;

import c1.i;
import h00.p;
import kotlin.jvm.internal.u;
import vz.b0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class ThemeKt$DefaultLinkTheme$2 extends u implements p<i, Integer, b0> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ p<i, Integer, b0> $content;
    final /* synthetic */ boolean $darkTheme;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ThemeKt$DefaultLinkTheme$2(boolean z11, p<? super i, ? super Integer, b0> pVar, int i11, int i12) {
        super(2);
        this.$darkTheme = z11;
        this.$content = pVar;
        this.$$changed = i11;
        this.$$default = i12;
    }

    @Override // h00.p
    public /* bridge */ /* synthetic */ b0 invoke(i iVar, Integer num) {
        invoke(iVar, num.intValue());
        return b0.f54756a;
    }

    public final void invoke(i iVar, int i11) {
        ThemeKt.DefaultLinkTheme(this.$darkTheme, this.$content, iVar, this.$$changed | 1, this.$$default);
    }
}