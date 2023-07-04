package com.stripe.android.ui.core.elements;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class FieldError {
    public static final int $stable = 8;
    private final int errorMessage;
    private final Object[] formatArgs;

    public FieldError(int i11, Object[] objArr) {
        this.errorMessage = i11;
        this.formatArgs = objArr;
    }

    public final int getErrorMessage() {
        return this.errorMessage;
    }

    public final Object[] getFormatArgs() {
        return this.formatArgs;
    }

    public /* synthetic */ FieldError(int i11, Object[] objArr, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, (i12 & 2) != 0 ? null : objArr);
    }
}