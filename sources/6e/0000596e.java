package com.stripe.android.ui.core;

import c1.i;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import f2.a0;
import f2.b0;
import f2.m0;
import f2.v0;
import h00.l;
import h00.p;
import h00.q;
import j1.c;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import vz.b0;
import x2.b;
import x2.g;

/* loaded from: classes6.dex */
final class MeasureComposableWidthKt$MeasureComposableWidth$1$1 extends u implements p<v0, b, a0> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ p<i, Integer, b0> $composable;
    final /* synthetic */ q<g, i, Integer, b0> $content;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.ui.core.MeasureComposableWidthKt$MeasureComposableWidth$1$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends u implements l<m0.a, b0> {
        final /* synthetic */ m0 $contentPlaceable;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(m0 m0Var) {
            super(1);
            this.$contentPlaceable = m0Var;
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ b0 invoke(m0.a aVar) {
            invoke2(aVar);
            return b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(m0.a layout) {
            s.g(layout, "$this$layout");
            m0.a.j(layout, this.$contentPlaceable, 0, 0, BitmapDescriptorFactory.HUE_RED, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MeasureComposableWidthKt$MeasureComposableWidth$1$1(p<? super i, ? super Integer, b0> pVar, int i11, q<? super g, ? super i, ? super Integer, b0> qVar) {
        super(2);
        this.$composable = pVar;
        this.$$dirty = i11;
        this.$content = qVar;
    }

    @Override // h00.p
    public /* bridge */ /* synthetic */ a0 invoke(v0 v0Var, b bVar) {
        return m369invoke0kLqBqw(v0Var, bVar.s());
    }

    /* renamed from: invoke-0kLqBqw  reason: not valid java name */
    public final a0 m369invoke0kLqBqw(v0 SubcomposeLayout, long j11) {
        s.g(SubcomposeLayout, "$this$SubcomposeLayout");
        m0 X = SubcomposeLayout.F("content", c.c(-985533768, true, new MeasureComposableWidthKt$MeasureComposableWidth$1$1$contentPlaceable$1(this.$content, SubcomposeLayout.b0(SubcomposeLayout.F("measuredComposable", c.c(-985533894, true, new MeasureComposableWidthKt$MeasureComposableWidth$1$1$composableWidth$1(this.$composable, this.$$dirty))).get(0).X(x2.c.b(0, 0, 0, 0, 15, null)).B0()), this.$$dirty))).get(0).X(j11);
        return b0.a.b(SubcomposeLayout, X.B0(), X.w0(), null, new AnonymousClass1(X), 4, null);
    }
}