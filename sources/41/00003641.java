package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import androidx.core.view.a0;

/* loaded from: classes3.dex */
public final class LinearProgressIndicator extends a<n> {

    /* renamed from: o  reason: collision with root package name */
    public static final int f15473o = fk.j.f26512p;

    public LinearProgressIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, fk.b.f26385u);
    }

    private void s() {
        setIndeterminateDrawable(j.t(getContext(), (n) this.f15475a));
        setProgressDrawable(f.v(getContext(), (n) this.f15475a));
    }

    public int getIndeterminateAnimationType() {
        return ((n) this.f15475a).f15574g;
    }

    public int getIndicatorDirection() {
        return ((n) this.f15475a).f15575h;
    }

    @Override // com.google.android.material.progressindicator.a
    public void o(int i11, boolean z11) {
        S s11 = this.f15475a;
        if (s11 != 0 && ((n) s11).f15574g == 0 && isIndeterminate()) {
            return;
        }
        super.o(i11, z11);
    }

    @Override // android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        S s11 = this.f15475a;
        n nVar = (n) s11;
        boolean z12 = true;
        if (((n) s11).f15575h != 1 && ((a0.F(this) != 1 || ((n) this.f15475a).f15575h != 2) && (a0.F(this) != 0 || ((n) this.f15475a).f15575h != 3))) {
            z12 = false;
        }
        nVar.f15576i = z12;
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected void onSizeChanged(int i11, int i12, int i13, int i14) {
        int paddingLeft = i11 - (getPaddingLeft() + getPaddingRight());
        int paddingTop = i12 - (getPaddingTop() + getPaddingBottom());
        j<n> indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable != null) {
            indeterminateDrawable.setBounds(0, 0, paddingLeft, paddingTop);
        }
        f<n> progressDrawable = getProgressDrawable();
        if (progressDrawable != null) {
            progressDrawable.setBounds(0, 0, paddingLeft, paddingTop);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.progressindicator.a
    /* renamed from: r */
    public n i(Context context, AttributeSet attributeSet) {
        return new n(context, attributeSet);
    }

    public void setIndeterminateAnimationType(int i11) {
        if (((n) this.f15475a).f15574g == i11) {
            return;
        }
        if (q() && isIndeterminate()) {
            throw new IllegalStateException("Cannot change indeterminate animation type while the progress indicator is show in indeterminate mode.");
        }
        S s11 = this.f15475a;
        ((n) s11).f15574g = i11;
        ((n) s11).e();
        if (i11 == 0) {
            getIndeterminateDrawable().w(new l((n) this.f15475a));
        } else {
            getIndeterminateDrawable().w(new m(getContext(), (n) this.f15475a));
        }
        invalidate();
    }

    @Override // com.google.android.material.progressindicator.a
    public void setIndicatorColor(int... iArr) {
        super.setIndicatorColor(iArr);
        ((n) this.f15475a).e();
    }

    public void setIndicatorDirection(int i11) {
        S s11 = this.f15475a;
        ((n) s11).f15575h = i11;
        n nVar = (n) s11;
        boolean z11 = true;
        if (i11 != 1 && ((a0.F(this) != 1 || ((n) this.f15475a).f15575h != 2) && (a0.F(this) != 0 || i11 != 3))) {
            z11 = false;
        }
        nVar.f15576i = z11;
        invalidate();
    }

    @Override // com.google.android.material.progressindicator.a
    public void setTrackCornerRadius(int i11) {
        super.setTrackCornerRadius(i11);
        ((n) this.f15475a).e();
        invalidate();
    }

    public LinearProgressIndicator(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11, f15473o);
        s();
    }
}