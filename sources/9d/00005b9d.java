package com.stripe.android.ui.core.elements.menu;

import c1.i;
import c1.r;
import c1.x0;
import h00.p;
import h00.q;
import j1.c;
import kotlin.jvm.internal.u;
import p0.c0;
import vz.b0;
import y0.n;
import y0.o;

/* loaded from: classes6.dex */
final class MenuKt$DropdownMenuItemContent$2$1 extends u implements p<i, Integer, b0> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ int $$dirty$1;
    final /* synthetic */ q<c0, i, Integer, b0> $content;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ c0 $this_Row;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.ui.core.elements.menu.MenuKt$DropdownMenuItemContent$2$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends u implements p<i, Integer, b0> {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ int $$dirty$1;
        final /* synthetic */ q<c0, i, Integer, b0> $content;
        final /* synthetic */ c0 $this_Row;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(q<? super c0, ? super i, ? super Integer, b0> qVar, c0 c0Var, int i11, int i12) {
            super(2);
            this.$content = qVar;
            this.$this_Row = c0Var;
            this.$$dirty = i11;
            this.$$dirty$1 = i12;
        }

        @Override // h00.p
        public /* bridge */ /* synthetic */ b0 invoke(i iVar, Integer num) {
            invoke(iVar, num.intValue());
            return b0.f54756a;
        }

        public final void invoke(i iVar, int i11) {
            if (((i11 & 11) ^ 2) == 0 && iVar.i()) {
                iVar.G();
            } else {
                this.$content.invoke(this.$this_Row, iVar, Integer.valueOf((this.$$dirty & 14) | ((this.$$dirty$1 >> 12) & 112)));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MenuKt$DropdownMenuItemContent$2$1(boolean z11, q<? super c0, ? super i, ? super Integer, b0> qVar, c0 c0Var, int i11, int i12) {
        super(2);
        this.$enabled = z11;
        this.$content = qVar;
        this.$this_Row = c0Var;
        this.$$dirty = i11;
        this.$$dirty$1 = i12;
    }

    @Override // h00.p
    public /* bridge */ /* synthetic */ b0 invoke(i iVar, Integer num) {
        invoke(iVar, num.intValue());
        return b0.f54756a;
    }

    public final void invoke(i iVar, int i11) {
        float b11;
        if (((i11 & 11) ^ 2) == 0 && iVar.i()) {
            iVar.G();
            return;
        }
        if (this.$enabled) {
            iVar.x(-1827379410);
            b11 = n.f58482a.c(iVar, 8);
        } else {
            iVar.x(-1827379387);
            b11 = n.f58482a.b(iVar, 8);
        }
        iVar.N();
        r.a(new x0[]{o.a().c(Float.valueOf(b11))}, c.b(iVar, -819888898, true, new AnonymousClass1(this.$content, this.$this_Row, this.$$dirty, this.$$dirty$1)), iVar, 56);
    }
}