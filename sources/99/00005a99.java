package com.stripe.android.ui.core.elements;

import c1.i;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import h00.q;
import k2.e;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import m0.o;
import o1.f;
import p0.e0;
import vz.b0;
import w1.b;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class HtmlKt$Html$inlineContentMap$1$1 extends u implements q<String, i, Integer, b0> {
    final /* synthetic */ b $painter;
    final /* synthetic */ EmbeddableImage $value;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HtmlKt$Html$inlineContentMap$1$1(EmbeddableImage embeddableImage, b bVar) {
        super(3);
        this.$value = embeddableImage;
        this.$painter = bVar;
    }

    @Override // h00.q
    public /* bridge */ /* synthetic */ b0 invoke(String str, i iVar, Integer num) {
        invoke(str, iVar, num.intValue());
        return b0.f54756a;
    }

    public final void invoke(String it2, i iVar, int i11) {
        s.g(it2, "it");
        if (((i11 & 81) ^ 16) == 0 && iVar.i()) {
            iVar.G();
            return;
        }
        f j11 = e0.j(e0.n(f.f42062f1, BitmapDescriptorFactory.HUE_RED, 1, null), BitmapDescriptorFactory.HUE_RED, 1, null);
        o.a(this.$painter, e.b(this.$value.getContentDescription(), iVar, 0), j11, null, null, BitmapDescriptorFactory.HUE_RED, null, iVar, 392, 120);
    }
}