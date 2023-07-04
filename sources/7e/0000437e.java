package com.plaid.internal.core.ui_components;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import com.plaid.internal.h8;
import com.plaid.link.R;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class PlaidSecondaryButton extends h8 {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PlaidSecondaryButton(Context context) {
        this(context, null, 0, 6, null);
        s.g(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PlaidSecondaryButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        s.g(context, "context");
    }

    public /* synthetic */ PlaidSecondaryButton(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? R.style.PlaidButton_Secondary : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaidSecondaryButton(Context context, AttributeSet attributeSet, int i11) {
        super(new ContextThemeWrapper(context, R.style.PlaidButton_Secondary), attributeSet, i11);
        s.g(context, "context");
    }
}