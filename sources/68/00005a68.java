package com.stripe.android.ui.core.elements;

import h00.l;
import h00.p;
import java.util.List;
import kotlin.jvm.internal.u;

/* loaded from: classes6.dex */
public final class DropdownFieldUIKt$DropDown$1$5$invoke$$inlined$itemsIndexed$default$1 extends u implements l<Integer, Object> {
    final /* synthetic */ List $items;
    final /* synthetic */ p $key;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DropdownFieldUIKt$DropDown$1$5$invoke$$inlined$itemsIndexed$default$1(p pVar, List list) {
        super(1);
        this.$key = pVar;
        this.$items = list;
    }

    public final Object invoke(int i11) {
        return this.$key.invoke(Integer.valueOf(i11), this.$items.get(i11));
    }

    @Override // h00.l
    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
        return invoke(num.intValue());
    }
}