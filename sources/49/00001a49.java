package com.facebook.react.views.switchview;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import androidx.appcompat.widget.SwitchCompat;

/* loaded from: classes3.dex */
class a extends SwitchCompat {
    private boolean Q1;
    private Integer V1;

    /* renamed from: b2  reason: collision with root package name */
    private Integer f12602b2;

    public a(Context context) {
        super(context);
        this.Q1 = true;
        this.V1 = null;
        this.f12602b2 = null;
    }

    private ColorStateList o(Integer num) {
        return new ColorStateList(new int[][]{new int[]{16842919}}, new int[]{num.intValue()});
    }

    private void t(boolean z11) {
        Integer num = this.f12602b2;
        if (num == null && this.V1 == null) {
            return;
        }
        if (!z11) {
            num = this.V1;
        }
        s(num);
    }

    void p(Drawable drawable, Integer num) {
        if (num == null) {
            drawable.clearColorFilter();
        } else {
            drawable.setColorFilter(num.intValue(), PorterDuff.Mode.MULTIPLY);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q(boolean z11) {
        if (isChecked() != z11) {
            super.setChecked(z11);
            t(z11);
        }
        this.Q1 = true;
    }

    public void r(Integer num) {
        p(super.getThumbDrawable(), num);
        if (num == null || !(super.getBackground() instanceof RippleDrawable)) {
            return;
        }
        ((RippleDrawable) super.getBackground()).setColor(o(num));
    }

    public void s(Integer num) {
        p(super.getTrackDrawable(), num);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i11) {
        if (Build.VERSION.SDK_INT >= 21) {
            setBackground(new RippleDrawable(o(Integer.valueOf(i11)), new ColorDrawable(i11), null));
        } else {
            super.setBackgroundColor(i11);
        }
    }

    @Override // androidx.appcompat.widget.SwitchCompat, android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z11) {
        if (this.Q1 && isChecked() != z11) {
            this.Q1 = false;
            super.setChecked(z11);
            t(z11);
            return;
        }
        super.setChecked(isChecked());
    }

    public void u(Integer num) {
        if (num == this.V1) {
            return;
        }
        this.V1 = num;
        if (isChecked()) {
            return;
        }
        s(this.V1);
    }

    public void v(Integer num) {
        if (num == this.f12602b2) {
            return;
        }
        this.f12602b2 = num;
        if (isChecked()) {
            s(this.f12602b2);
        }
    }
}