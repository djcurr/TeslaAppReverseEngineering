package com.stripe.android.ui.core.elements;

import c1.o0;
import c1.v1;
import h00.l;
import j1.c;
import java.util.List;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import q0.g;
import vz.b0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class DropdownFieldUIKt$DropDown$1$5 extends u implements l<g, b0> {
    final /* synthetic */ DropdownFieldController $controller;
    final /* synthetic */ long $currentTextColor;
    final /* synthetic */ o0<Boolean> $expanded$delegate;
    final /* synthetic */ List<String> $items;
    final /* synthetic */ v1<Integer> $selectedIndex$delegate;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DropdownFieldUIKt$DropDown$1$5(List<String> list, long j11, v1<Integer> v1Var, DropdownFieldController dropdownFieldController, o0<Boolean> o0Var) {
        super(1);
        this.$items = list;
        this.$currentTextColor = j11;
        this.$selectedIndex$delegate = v1Var;
        this.$controller = dropdownFieldController;
        this.$expanded$delegate = o0Var;
    }

    @Override // h00.l
    public /* bridge */ /* synthetic */ b0 invoke(g gVar) {
        invoke2(gVar);
        return b0.f54756a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(g DropdownMenu) {
        s.g(DropdownMenu, "$this$DropdownMenu");
        List<String> list = this.$items;
        DropdownMenu.a(list.size(), null, c.c(-985537359, true, new DropdownFieldUIKt$DropDown$1$5$invoke$$inlined$itemsIndexed$default$2(list, this.$currentTextColor, this.$selectedIndex$delegate, this.$controller, this.$expanded$delegate)));
    }
}