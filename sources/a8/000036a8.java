package com.google.android.material.textfield;

import android.content.Context;
import com.google.android.material.internal.CheckableImageButton;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    TextInputLayout f15703a;

    /* renamed from: b  reason: collision with root package name */
    Context f15704b;

    /* renamed from: c  reason: collision with root package name */
    CheckableImageButton f15705c;

    /* renamed from: d  reason: collision with root package name */
    final int f15706d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(TextInputLayout textInputLayout, int i11) {
        this.f15703a = textInputLayout;
        this.f15704b = textInputLayout.getContext();
        this.f15705c = textInputLayout.getEndIconView();
        this.f15706d = i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void a();

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b(int i11) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(boolean z11) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean d() {
        return false;
    }
}