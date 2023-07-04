package com.stripe.android.link.ui.inline;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.ui.platform.a;
import c1.e1;
import c1.i;
import c1.o0;
import c1.s1;
import com.stripe.android.link.LinkPaymentLauncher;
import com.stripe.android.link.injection.NonFallbackInjector;
import com.stripe.android.ui.core.PaymentsThemeKt;
import j1.c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.flow.j0;
import kotlinx.coroutines.flow.u;

/* loaded from: classes6.dex */
public final class LinkInlineSignupView extends a {
    public static final int $stable = 8;
    private final o0 enabledState$delegate;
    private boolean hasUserInteracted;
    private final u<Boolean> isSelected;
    private LinkPaymentLauncher linkLauncher;
    private boolean shouldCreateCompositionOnAttachedToWindow;
    private final u<UserInput> userInput;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LinkInlineSignupView(Context context) {
        this(context, null, 0, 6, null);
        s.g(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LinkInlineSignupView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        s.g(context, "context");
    }

    public /* synthetic */ LinkInlineSignupView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getEnabledState() {
        return ((Boolean) this.enabledState$delegate.getValue()).booleanValue();
    }

    private final void setEnabledState(boolean z11) {
        this.enabledState$delegate.setValue(Boolean.valueOf(z11));
    }

    @Override // androidx.compose.ui.platform.a
    public void Content(i iVar, int i11) {
        i h11 = iVar.h(288425598);
        LinkPaymentLauncher linkPaymentLauncher = this.linkLauncher;
        NonFallbackInjector injector$link_release = linkPaymentLauncher == null ? null : linkPaymentLauncher.getInjector$link_release();
        if (injector$link_release != null) {
            PaymentsThemeKt.PaymentsTheme(null, null, null, c.b(h11, -819903701, true, new LinkInlineSignupView$Content$1$1(injector$link_release, this)), h11, 3072, 7);
        }
        e1 l11 = h11.l();
        if (l11 == null) {
            return;
        }
        l11.a(new LinkInlineSignupView$Content$2(this, i11));
    }

    public final boolean getHasUserInteracted() {
        return this.hasUserInteracted;
    }

    public final LinkPaymentLauncher getLinkLauncher() {
        return this.linkLauncher;
    }

    @Override // androidx.compose.ui.platform.a
    protected boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.shouldCreateCompositionOnAttachedToWindow;
    }

    public final u<UserInput> getUserInput() {
        return this.userInput;
    }

    @Override // android.view.View
    public final u<Boolean> isSelected() {
        return this.isSelected;
    }

    @Override // android.view.View
    public void setEnabled(boolean z11) {
        super.setEnabled(z11);
        setEnabledState(z11);
    }

    public final void setHasUserInteracted(boolean z11) {
        this.hasUserInteracted = z11;
    }

    public final void setLinkLauncher(LinkPaymentLauncher linkPaymentLauncher) {
        this.linkLauncher = linkPaymentLauncher;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkInlineSignupView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        o0 d11;
        s.g(context, "context");
        this.userInput = j0.a(null);
        this.isSelected = j0.a(Boolean.FALSE);
        d11 = s1.d(Boolean.valueOf(isEnabled()), null, 2, null);
        this.enabledState$delegate = d11;
    }
}