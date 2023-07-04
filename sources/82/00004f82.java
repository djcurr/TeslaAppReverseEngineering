package com.stripe.android.link.ui;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.ui.platform.a;
import c1.e1;
import c1.i;
import c1.o0;
import c1.s1;
import com.stripe.android.link.LinkPaymentLauncher;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import vz.b0;

/* loaded from: classes6.dex */
public final class LinkButtonView extends a {
    public static final int $stable = 8;
    private final o0 isEnabledState$delegate;
    private LinkPaymentLauncher linkPaymentLauncher;
    private final o0 onClick$delegate;
    private boolean shouldCreateCompositionOnAttachedToWindow;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LinkButtonView(Context context) {
        this(context, null, 0, 6, null);
        s.g(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LinkButtonView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        s.g(context, "context");
    }

    public /* synthetic */ LinkButtonView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final boolean isEnabledState() {
        return ((Boolean) this.isEnabledState$delegate.getValue()).booleanValue();
    }

    private final void setEnabledState(boolean z11) {
        this.isEnabledState$delegate.setValue(Boolean.valueOf(z11));
    }

    @Override // androidx.compose.ui.platform.a
    public void Content(i iVar, int i11) {
        i h11 = iVar.h(-1763874690);
        LinkPaymentLauncher linkPaymentLauncher = this.linkPaymentLauncher;
        if (linkPaymentLauncher != null) {
            LinkButtonKt.LinkButton(linkPaymentLauncher, isEnabledState(), getOnClick(), h11, 8);
        }
        e1 l11 = h11.l();
        if (l11 == null) {
            return;
        }
        l11.a(new LinkButtonView$Content$2(this, i11));
    }

    public final LinkPaymentLauncher getLinkPaymentLauncher() {
        return this.linkPaymentLauncher;
    }

    public final h00.a<b0> getOnClick() {
        return (h00.a) this.onClick$delegate.getValue();
    }

    @Override // androidx.compose.ui.platform.a
    protected boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.shouldCreateCompositionOnAttachedToWindow;
    }

    @Override // android.view.View
    public void setEnabled(boolean z11) {
        super.setEnabled(z11);
        setEnabledState(z11);
    }

    public final void setLinkPaymentLauncher(LinkPaymentLauncher linkPaymentLauncher) {
        this.linkPaymentLauncher = linkPaymentLauncher;
    }

    public final void setOnClick(h00.a<b0> aVar) {
        s.g(aVar, "<set-?>");
        this.onClick$delegate.setValue(aVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkButtonView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        o0 d11;
        o0 d12;
        s.g(context, "context");
        d11 = s1.d(LinkButtonView$onClick$2.INSTANCE, null, 2, null);
        this.onClick$delegate = d11;
        d12 = s1.d(Boolean.valueOf(isEnabled()), null, 2, null);
        this.isEnabledState$delegate = d12;
    }
}