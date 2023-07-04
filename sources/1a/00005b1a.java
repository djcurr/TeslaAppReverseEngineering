package com.stripe.android.ui.core.elements;

import android.content.Context;
import android.content.Intent;
import com.stripe.android.ui.core.cardscan.CardScanActivity;
import d.g;
import h00.a;
import kotlin.jvm.internal.u;
import vz.b0;

/* loaded from: classes6.dex */
final class ScanCardButtonUIKt$ScanCardButtonUI$2 extends u implements a<b0> {
    final /* synthetic */ g<Intent, androidx.activity.result.a> $cardScanLauncher;
    final /* synthetic */ Context $context;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScanCardButtonUIKt$ScanCardButtonUI$2(g<Intent, androidx.activity.result.a> gVar, Context context) {
        super(0);
        this.$cardScanLauncher = gVar;
        this.$context = context;
    }

    @Override // h00.a
    public /* bridge */ /* synthetic */ b0 invoke() {
        invoke2();
        return b0.f54756a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$cardScanLauncher.b(new Intent(this.$context, CardScanActivity.class));
    }
}