package com.plaid.internal;

import android.content.Context;
import android.util.AttributeSet;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public abstract class h8 extends androidx.appcompat.widget.e {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h8(Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.s.g(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h8(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.s.g(context, "context");
    }

    public /* synthetic */ h8(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h8(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        kotlin.jvm.internal.s.g(context, "context");
    }
}