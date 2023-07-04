package com.google.android.material.internal;

import android.widget.ImageButton;

/* loaded from: classes3.dex */
public class m extends ImageButton {

    /* renamed from: a  reason: collision with root package name */
    private int f15471a;

    public final void b(int i11, boolean z11) {
        super.setVisibility(i11);
        if (z11) {
            this.f15471a = i11;
        }
    }

    public final int getUserSetVisibility() {
        return this.f15471a;
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i11) {
        b(i11, true);
    }
}