package com.stripe.android.ui.core.elements;

/* loaded from: classes6.dex */
public interface TextFieldState {
    FieldError getError();

    boolean isBlank();

    boolean isFull();

    boolean isValid();

    boolean shouldShowError(boolean z11);
}