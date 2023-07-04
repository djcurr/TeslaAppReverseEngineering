package com.stripe.android.ui.core.elements;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import h00.l;
import kotlin.jvm.internal.u;
import n2.a;
import vz.b0;

/* loaded from: classes6.dex */
final class HtmlKt$Html$2 extends u implements l<Integer, b0> {
    final /* synthetic */ a $annotatedText;
    final /* synthetic */ Context $context;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HtmlKt$Html$2(a aVar, Context context) {
        super(1);
        this.$annotatedText = aVar;
        this.$context = context;
    }

    @Override // h00.l
    public /* bridge */ /* synthetic */ b0 invoke(Integer num) {
        invoke(num.intValue());
        return b0.f54756a;
    }

    public final void invoke(int i11) {
        a.b bVar = (a.b) wz.u.d0(this.$annotatedText.f("URL", i11, i11));
        if (bVar == null) {
            return;
        }
        Context context = this.$context;
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse((String) bVar.e()));
        context.startActivity(intent);
    }
}