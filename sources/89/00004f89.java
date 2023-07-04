package com.stripe.android.link.ui;

import c1.i;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.stripe.android.link.theme.ThemeKt;
import h00.l;
import h00.q;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import l2.o;
import l2.t;
import l2.v;
import o1.f;
import p0.c0;
import p0.e0;
import t1.a0;
import vz.b0;
import x2.g;
import y0.h0;
import y0.o1;
import y0.s0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class PrimaryButtonKt$PrimaryButton$1$1$1 extends u implements q<c0, i, Integer, b0> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ String $label;
    final /* synthetic */ PrimaryButtonState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.link.ui.PrimaryButtonKt$PrimaryButton$1$1$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends u implements l<v, b0> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ b0 mo12invoke(v vVar) {
            invoke2(vVar);
            return b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(v semantics) {
            s.g(semantics, "$this$semantics");
            t.Q(semantics, PrimaryButtonKt.progressIndicatorTestTag);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrimaryButtonKt$PrimaryButton$1$1$1(PrimaryButtonState primaryButtonState, String str, int i11) {
        super(3);
        this.$state = primaryButtonState;
        this.$label = str;
        this.$$dirty = i11;
    }

    @Override // h00.q
    public /* bridge */ /* synthetic */ b0 invoke(c0 c0Var, i iVar, Integer num) {
        invoke(c0Var, iVar, num.intValue());
        return b0.f54756a;
    }

    public final void invoke(c0 TextButton, i iVar, int i11) {
        s.g(TextButton, "$this$TextButton");
        if (((i11 & 81) ^ 16) == 0 && iVar.i()) {
            iVar.G();
        } else if (this.$state == PrimaryButtonState.Processing) {
            iVar.x(-1127964214);
            s0.a(o.b(e0.v(f.f42062f1, g.f(18)), false, AnonymousClass1.INSTANCE, 1, null), ThemeKt.getLinkColors(h0.f58131a, iVar, 8).m187getButtonLabel0d7_KjU(), g.f(2), iVar, 384, 0);
            iVar.N();
        } else {
            iVar.x(-1127963783);
            o1.b(this.$label, null, a0.l(ThemeKt.getLinkColors(h0.f58131a, iVar, 8).m187getButtonLabel0d7_KjU(), ((Number) iVar.A(y0.o.a())).floatValue(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, iVar, this.$$dirty & 14, 0, 65530);
            iVar.N();
        }
    }
}