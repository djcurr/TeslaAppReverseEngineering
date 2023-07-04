package com.reactnativecommunity.checkbox;

import android.content.Context;
import androidx.appcompat.widget.f;

/* loaded from: classes2.dex */
class a extends f {

    /* renamed from: d  reason: collision with root package name */
    private boolean f20087d;

    public a(Context context) {
        super(context);
        this.f20087d = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(boolean z11) {
        if (isChecked() != z11) {
            super.setChecked(z11);
        }
        this.f20087d = true;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z11) {
        if (this.f20087d) {
            this.f20087d = false;
            super.setChecked(z11);
        }
    }
}