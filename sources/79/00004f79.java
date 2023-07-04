package com.stripe.android.link.ui;

import c1.i;
import h00.a;
import h00.p;
import kotlin.jvm.internal.u;
import vz.b0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class LinkAppBarKt$LinkAppBar$3 extends u implements p<i, Integer, b0> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ String $email;
    final /* synthetic */ a<b0> $onCloseButtonClick;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkAppBarKt$LinkAppBar$3(String str, a<b0> aVar, int i11) {
        super(2);
        this.$email = str;
        this.$onCloseButtonClick = aVar;
        this.$$changed = i11;
    }

    @Override // h00.p
    public /* bridge */ /* synthetic */ b0 invoke(i iVar, Integer num) {
        invoke(iVar, num.intValue());
        return b0.f54756a;
    }

    public final void invoke(i iVar, int i11) {
        LinkAppBarKt.LinkAppBar(this.$email, this.$onCloseButtonClick, iVar, this.$$changed | 1);
    }
}