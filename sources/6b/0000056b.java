package androidx.constraintlayout.motion.widget;

import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.p;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes.dex */
public class n extends androidx.constraintlayout.widget.b implements p.i {

    /* renamed from: j  reason: collision with root package name */
    private boolean f3506j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f3507k;

    /* renamed from: l  reason: collision with root package name */
    private float f3508l;

    /* renamed from: m  reason: collision with root package name */
    protected View[] f3509m;

    public void A(View view, float f11) {
    }

    @Override // androidx.constraintlayout.motion.widget.p.i
    public void a(p pVar, int i11, int i12, float f11) {
    }

    @Override // androidx.constraintlayout.motion.widget.p.i
    public void b(p pVar, int i11) {
    }

    @Override // androidx.constraintlayout.motion.widget.p.i
    public void c(p pVar, int i11, int i12) {
    }

    @Override // androidx.constraintlayout.motion.widget.p.i
    public void d(p pVar, int i11, boolean z11, float f11) {
    }

    public float getProgress() {
        return this.f3508l;
    }

    @Override // androidx.constraintlayout.widget.b
    protected void n(AttributeSet attributeSet) {
        super.n(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.i.f4140u7);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = obtainStyledAttributes.getIndex(i11);
                if (index == androidx.constraintlayout.widget.i.f4160w7) {
                    this.f3506j = obtainStyledAttributes.getBoolean(index, this.f3506j);
                } else if (index == androidx.constraintlayout.widget.i.f4150v7) {
                    this.f3507k = obtainStyledAttributes.getBoolean(index, this.f3507k);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void setProgress(float f11) {
        this.f3508l = f11;
        int i11 = 0;
        if (this.f3784b > 0) {
            this.f3509m = m((ConstraintLayout) getParent());
            while (i11 < this.f3784b) {
                A(this.f3509m[i11], f11);
                i11++;
            }
            return;
        }
        ViewGroup viewGroup = (ViewGroup) getParent();
        int childCount = viewGroup.getChildCount();
        while (i11 < childCount) {
            View childAt = viewGroup.getChildAt(i11);
            if (!(childAt instanceof n)) {
                A(childAt, f11);
            }
            i11++;
        }
    }

    public boolean u() {
        return false;
    }

    public boolean v() {
        return this.f3507k;
    }

    public boolean w() {
        return this.f3506j;
    }

    public void x(p pVar) {
    }

    public void y(Canvas canvas) {
    }

    public void z(Canvas canvas) {
    }
}