package com.stripe.android.ui.core.elements;

import android.content.Intent;
import androidx.activity.result.a;
import h00.l;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import vz.b0;

/* loaded from: classes6.dex */
final class ScanCardButtonUIKt$ScanCardButtonUI$cardScanLauncher$1$1 extends u implements l<a, b0> {
    final /* synthetic */ l<Intent, b0> $onResult;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ScanCardButtonUIKt$ScanCardButtonUI$cardScanLauncher$1$1(l<? super Intent, b0> lVar) {
        super(1);
        this.$onResult = lVar;
    }

    @Override // h00.l
    public /* bridge */ /* synthetic */ b0 invoke(a aVar) {
        invoke2(aVar);
        return b0.f54756a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(a it2) {
        s.g(it2, "it");
        Intent a11 = it2.a();
        if (a11 == null) {
            return;
        }
        this.$onResult.invoke(a11);
    }
}