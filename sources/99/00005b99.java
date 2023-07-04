package com.stripe.android.ui.core.elements.menu;

import c1.i;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import h00.l;
import h00.p;
import kotlin.jvm.internal.u;
import o1.f;
import q0.c;
import q0.g;
import vz.b0;

/* loaded from: classes6.dex */
final class MenuKt$DropdownMenuContent$2 extends u implements p<i, Integer, b0> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ l<g, b0> $content;
    final /* synthetic */ int $initialFirstVisibleItemIndex;
    final /* synthetic */ f $modifier;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MenuKt$DropdownMenuContent$2(int i11, int i12, f fVar, l<? super g, b0> lVar) {
        super(2);
        this.$initialFirstVisibleItemIndex = i11;
        this.$$dirty = i12;
        this.$modifier = fVar;
        this.$content = lVar;
    }

    @Override // h00.p
    public /* bridge */ /* synthetic */ b0 invoke(i iVar, Integer num) {
        invoke(iVar, num.intValue());
        return b0.f54756a;
    }

    public final void invoke(i iVar, int i11) {
        if (((i11 & 11) ^ 2) == 0 && iVar.i()) {
            iVar.G();
            return;
        }
        c.a(p0.u.j(this.$modifier, BitmapDescriptorFactory.HUE_RED, MenuKt.getDropdownMenuVerticalPadding(), 1, null), q0.i.a(this.$initialFirstVisibleItemIndex, 0, iVar, (this.$$dirty >> 6) & 14, 2), null, false, null, null, null, this.$content, iVar, (this.$$dirty << 9) & 29360128, 124);
    }
}