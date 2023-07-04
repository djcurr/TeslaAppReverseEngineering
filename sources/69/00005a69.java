package com.stripe.android.ui.core.elements;

import c1.i;
import c1.o0;
import c1.v1;
import h00.r;
import java.util.List;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import q0.d;
import vz.b0;

/* loaded from: classes6.dex */
public final class DropdownFieldUIKt$DropDown$1$5$invoke$$inlined$itemsIndexed$default$2 extends u implements r<d, Integer, i, Integer, b0> {
    final /* synthetic */ DropdownFieldController $controller$inlined;
    final /* synthetic */ long $currentTextColor$inlined;
    final /* synthetic */ o0 $expanded$delegate$inlined;
    final /* synthetic */ List $items;
    final /* synthetic */ v1 $selectedIndex$delegate$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DropdownFieldUIKt$DropDown$1$5$invoke$$inlined$itemsIndexed$default$2(List list, long j11, v1 v1Var, DropdownFieldController dropdownFieldController, o0 o0Var) {
        super(4);
        this.$items = list;
        this.$currentTextColor$inlined = j11;
        this.$selectedIndex$delegate$inlined = v1Var;
        this.$controller$inlined = dropdownFieldController;
        this.$expanded$delegate$inlined = o0Var;
    }

    @Override // h00.r
    public /* bridge */ /* synthetic */ b0 invoke(d dVar, Integer num, i iVar, Integer num2) {
        invoke(dVar, num.intValue(), iVar, num2.intValue());
        return b0.f54756a;
    }

    public final void invoke(d items, int i11, i iVar, int i12) {
        int i13;
        int i14;
        int m437DropDown$lambda1;
        s.g(items, "$this$items");
        if ((i12 & 14) == 0) {
            i13 = (iVar.O(items) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            i13 |= iVar.d(i11) ? 32 : 16;
        }
        if (((i13 & 731) ^ 146) == 0 && iVar.i()) {
            iVar.G();
            return;
        }
        int i15 = (i13 & 112) | (i13 & 14);
        String str = (String) this.$items.get(i11);
        if ((i15 & 112) == 0) {
            i14 = i15 | (iVar.d(i11) ? 32 : 16);
        } else {
            i14 = i15;
        }
        if ((i15 & 896) == 0) {
            i14 |= iVar.O(str) ? 256 : 128;
        }
        if (((i14 & 5841) ^ 1168) != 0 || !iVar.i()) {
            m437DropDown$lambda1 = DropdownFieldUIKt.m437DropDown$lambda1(this.$selectedIndex$delegate$inlined);
            DropdownFieldUIKt.m440DropdownMenuItemcf5BqRc(str, i11 == m437DropDown$lambda1, this.$currentTextColor$inlined, new DropdownFieldUIKt$DropDown$1$5$1$1(this.$controller$inlined, i11, this.$expanded$delegate$inlined), iVar, (i14 >> 6) & 14, 0);
            return;
        }
        iVar.G();
    }
}