package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;

/* loaded from: classes.dex */
public class e extends Button implements androidx.core.view.y, androidx.core.widget.b, androidx.core.widget.p {
    private final d mBackgroundTintHelper;
    private final x mTextHelper;

    public e(Context context) {
        this(context, null);
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        d dVar = this.mBackgroundTintHelper;
        if (dVar != null) {
            dVar.b();
        }
        x xVar = this.mTextHelper;
        if (xVar != null) {
            xVar.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (androidx.core.widget.b.f4641u) {
            return super.getAutoSizeMaxTextSize();
        }
        x xVar = this.mTextHelper;
        if (xVar != null) {
            return xVar.e();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (androidx.core.widget.b.f4641u) {
            return super.getAutoSizeMinTextSize();
        }
        x xVar = this.mTextHelper;
        if (xVar != null) {
            return xVar.f();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (androidx.core.widget.b.f4641u) {
            return super.getAutoSizeStepGranularity();
        }
        x xVar = this.mTextHelper;
        if (xVar != null) {
            return xVar.g();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (androidx.core.widget.b.f4641u) {
            return super.getAutoSizeTextAvailableSizes();
        }
        x xVar = this.mTextHelper;
        return xVar != null ? xVar.h() : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (androidx.core.widget.b.f4641u) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        x xVar = this.mTextHelper;
        if (xVar != null) {
            return xVar.i();
        }
        return 0;
    }

    @Override // androidx.core.view.y
    public ColorStateList getSupportBackgroundTintList() {
        d dVar = this.mBackgroundTintHelper;
        if (dVar != null) {
            return dVar.c();
        }
        return null;
    }

    @Override // androidx.core.view.y
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        d dVar = this.mBackgroundTintHelper;
        if (dVar != null) {
            return dVar.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.mTextHelper.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.mTextHelper.k();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        x xVar = this.mTextHelper;
        if (xVar != null) {
            xVar.o(z11, i11, i12, i13, i14);
        }
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        super.onTextChanged(charSequence, i11, i12, i13);
        x xVar = this.mTextHelper;
        if (xVar == null || androidx.core.widget.b.f4641u || !xVar.l()) {
            return;
        }
        this.mTextHelper.c();
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i11, int i12, int i13, int i14) {
        if (androidx.core.widget.b.f4641u) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i11, i12, i13, i14);
            return;
        }
        x xVar = this.mTextHelper;
        if (xVar != null) {
            xVar.t(i11, i12, i13, i14);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i11) {
        if (androidx.core.widget.b.f4641u) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i11);
            return;
        }
        x xVar = this.mTextHelper;
        if (xVar != null) {
            xVar.u(iArr, i11);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i11) {
        if (androidx.core.widget.b.f4641u) {
            super.setAutoSizeTextTypeWithDefaults(i11);
            return;
        }
        x xVar = this.mTextHelper;
        if (xVar != null) {
            xVar.v(i11);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        d dVar = this.mBackgroundTintHelper;
        if (dVar != null) {
            dVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i11) {
        super.setBackgroundResource(i11);
        d dVar = this.mBackgroundTintHelper;
        if (dVar != null) {
            dVar.g(i11);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.m.p(this, callback));
    }

    public void setSupportAllCaps(boolean z11) {
        x xVar = this.mTextHelper;
        if (xVar != null) {
            xVar.s(z11);
        }
    }

    @Override // androidx.core.view.y
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        d dVar = this.mBackgroundTintHelper;
        if (dVar != null) {
            dVar.i(colorStateList);
        }
    }

    @Override // androidx.core.view.y
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        d dVar = this.mBackgroundTintHelper;
        if (dVar != null) {
            dVar.j(mode);
        }
    }

    @Override // androidx.core.widget.p
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.mTextHelper.w(colorStateList);
        this.mTextHelper.b();
    }

    @Override // androidx.core.widget.p
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.mTextHelper.x(mode);
        this.mTextHelper.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i11) {
        super.setTextAppearance(context, i11);
        x xVar = this.mTextHelper;
        if (xVar != null) {
            xVar.q(context, i11);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i11, float f11) {
        if (androidx.core.widget.b.f4641u) {
            super.setTextSize(i11, f11);
            return;
        }
        x xVar = this.mTextHelper;
        if (xVar != null) {
            xVar.A(i11, f11);
        }
    }

    public e(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, g.a.f27055q);
    }

    public e(Context context, AttributeSet attributeSet, int i11) {
        super(r0.b(context), attributeSet, i11);
        p0.a(this, getContext());
        d dVar = new d(this);
        this.mBackgroundTintHelper = dVar;
        dVar.e(attributeSet, i11);
        x xVar = new x(this);
        this.mTextHelper = xVar;
        xVar.m(attributeSet, i11);
        xVar.b();
    }
}