package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;

/* loaded from: classes3.dex */
public final class CircularProgressIndicator extends a<e> {

    /* renamed from: o  reason: collision with root package name */
    public static final int f15472o = fk.j.f26509m;

    public CircularProgressIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, fk.b.f26372h);
    }

    private void s() {
        setIndeterminateDrawable(j.s(getContext(), (e) this.f15475a));
        setProgressDrawable(f.u(getContext(), (e) this.f15475a));
    }

    public int getIndicatorDirection() {
        return ((e) this.f15475a).f15519i;
    }

    public int getIndicatorInset() {
        return ((e) this.f15475a).f15518h;
    }

    public int getIndicatorSize() {
        return ((e) this.f15475a).f15517g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.progressindicator.a
    /* renamed from: r */
    public e i(Context context, AttributeSet attributeSet) {
        return new e(context, attributeSet);
    }

    public void setIndicatorDirection(int i11) {
        ((e) this.f15475a).f15519i = i11;
        invalidate();
    }

    public void setIndicatorInset(int i11) {
        S s11 = this.f15475a;
        if (((e) s11).f15518h != i11) {
            ((e) s11).f15518h = i11;
            invalidate();
        }
    }

    public void setIndicatorSize(int i11) {
        int max = Math.max(i11, getTrackThickness() * 2);
        S s11 = this.f15475a;
        if (((e) s11).f15517g != max) {
            ((e) s11).f15517g = max;
            ((e) s11).e();
            invalidate();
        }
    }

    @Override // com.google.android.material.progressindicator.a
    public void setTrackThickness(int i11) {
        super.setTrackThickness(i11);
        ((e) this.f15475a).e();
    }

    public CircularProgressIndicator(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11, f15472o);
        s();
    }
}