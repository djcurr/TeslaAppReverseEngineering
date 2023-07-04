package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import t3.d;

/* loaded from: classes.dex */
public class AppCompatTextView extends TextView implements androidx.core.view.y, androidx.core.widget.p, androidx.core.widget.b {
    private final d mBackgroundTintHelper;
    private boolean mIsSetTypefaceProcessing;
    private Future<t3.d> mPrecomputedTextFuture;
    private final w mTextClassifierHelper;
    private final x mTextHelper;

    public AppCompatTextView(Context context) {
        this(context, null);
    }

    private void consumeTextFutureAndSetBlocking() {
        Future<t3.d> future = this.mPrecomputedTextFuture;
        if (future != null) {
            try {
                this.mPrecomputedTextFuture = null;
                androidx.core.widget.m.m(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
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

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return androidx.core.widget.m.b(this);
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return androidx.core.widget.m.c(this);
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

    @Override // android.widget.TextView
    public CharSequence getText() {
        consumeTextFutureAndSetBlocking();
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        w wVar;
        if (Build.VERSION.SDK_INT < 28 && (wVar = this.mTextClassifierHelper) != null) {
            return wVar.a();
        }
        return super.getTextClassifier();
    }

    public d.a getTextMetricsParamsCompat() {
        return androidx.core.widget.m.f(this);
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.mTextHelper.r(this, onCreateInputConnection, editorInfo);
        return k.a(onCreateInputConnection, editorInfo, this);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        x xVar = this.mTextHelper;
        if (xVar != null) {
            xVar.o(z11, i11, i12, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i11, int i12) {
        consumeTextFutureAndSetBlocking();
        super.onMeasure(i11, i12);
    }

    @Override // android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
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
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        x xVar = this.mTextHelper;
        if (xVar != null) {
            xVar.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        x xVar = this.mTextHelper;
        if (xVar != null) {
            xVar.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        x xVar = this.mTextHelper;
        if (xVar != null) {
            xVar.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        x xVar = this.mTextHelper;
        if (xVar != null) {
            xVar.p();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.m.p(this, callback));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i11) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i11);
        } else {
            androidx.core.widget.m.j(this, i11);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i11) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i11);
        } else {
            androidx.core.widget.m.k(this, i11);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i11) {
        androidx.core.widget.m.l(this, i11);
    }

    public void setPrecomputedText(t3.d dVar) {
        androidx.core.widget.m.m(this, dVar);
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
    public void setTextClassifier(TextClassifier textClassifier) {
        w wVar;
        if (Build.VERSION.SDK_INT < 28 && (wVar = this.mTextClassifierHelper) != null) {
            wVar.b(textClassifier);
        } else {
            super.setTextClassifier(textClassifier);
        }
    }

    public void setTextFuture(Future<t3.d> future) {
        this.mPrecomputedTextFuture = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(d.a aVar) {
        androidx.core.widget.m.o(this, aVar);
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

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface, int i11) {
        if (this.mIsSetTypefaceProcessing) {
            return;
        }
        Typeface typeface2 = null;
        if (typeface != null && i11 > 0) {
            typeface2 = m3.d.a(getContext(), typeface, i11);
        }
        this.mIsSetTypefaceProcessing = true;
        if (typeface2 != null) {
            typeface = typeface2;
        }
        try {
            super.setTypeface(typeface, i11);
        } finally {
            this.mIsSetTypefaceProcessing = false;
        }
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet, int i11) {
        super(r0.b(context), attributeSet, i11);
        this.mIsSetTypefaceProcessing = false;
        p0.a(this, getContext());
        d dVar = new d(this);
        this.mBackgroundTintHelper = dVar;
        dVar.e(attributeSet, i11);
        x xVar = new x(this);
        this.mTextHelper = xVar;
        xVar.m(attributeSet, i11);
        xVar.b();
        this.mTextClassifierHelper = new w(this);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i11, int i12, int i13, int i14) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i11 != 0 ? h.a.d(context, i11) : null, i12 != 0 ? h.a.d(context, i12) : null, i13 != 0 ? h.a.d(context, i13) : null, i14 != 0 ? h.a.d(context, i14) : null);
        x xVar = this.mTextHelper;
        if (xVar != null) {
            xVar.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i11, int i12, int i13, int i14) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i11 != 0 ? h.a.d(context, i11) : null, i12 != 0 ? h.a.d(context, i12) : null, i13 != 0 ? h.a.d(context, i13) : null, i14 != 0 ? h.a.d(context, i14) : null);
        x xVar = this.mTextHelper;
        if (xVar != null) {
            xVar.p();
        }
    }
}