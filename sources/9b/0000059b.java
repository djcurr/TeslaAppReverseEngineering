package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public class e extends ViewGroup {

    /* renamed from: a  reason: collision with root package name */
    d f3914a;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: a */
    public a generateDefaultLayoutParams() {
        return new a(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: b */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    public d getConstraintSet() {
        if (this.f3914a == null) {
            this.f3914a = new d();
        }
        this.f3914a.p(this);
        return this.f3914a;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.b(layoutParams);
    }

    /* loaded from: classes.dex */
    public static class a extends ConstraintLayout.b {
        public float A0;
        public float B0;
        public float C0;
        public float D0;
        public float E0;

        /* renamed from: s0  reason: collision with root package name */
        public float f3915s0;

        /* renamed from: t0  reason: collision with root package name */
        public boolean f3916t0;

        /* renamed from: u0  reason: collision with root package name */
        public float f3917u0;

        /* renamed from: v0  reason: collision with root package name */
        public float f3918v0;

        /* renamed from: w0  reason: collision with root package name */
        public float f3919w0;

        /* renamed from: x0  reason: collision with root package name */
        public float f3920x0;

        /* renamed from: y0  reason: collision with root package name */
        public float f3921y0;

        /* renamed from: z0  reason: collision with root package name */
        public float f3922z0;

        public a(int i11, int i12) {
            super(i11, i12);
            this.f3915s0 = 1.0f;
            this.f3916t0 = false;
            this.f3917u0 = BitmapDescriptorFactory.HUE_RED;
            this.f3918v0 = BitmapDescriptorFactory.HUE_RED;
            this.f3919w0 = BitmapDescriptorFactory.HUE_RED;
            this.f3920x0 = BitmapDescriptorFactory.HUE_RED;
            this.f3921y0 = 1.0f;
            this.f3922z0 = 1.0f;
            this.A0 = BitmapDescriptorFactory.HUE_RED;
            this.B0 = BitmapDescriptorFactory.HUE_RED;
            this.C0 = BitmapDescriptorFactory.HUE_RED;
            this.D0 = BitmapDescriptorFactory.HUE_RED;
            this.E0 = BitmapDescriptorFactory.HUE_RED;
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f3915s0 = 1.0f;
            this.f3916t0 = false;
            this.f3917u0 = BitmapDescriptorFactory.HUE_RED;
            this.f3918v0 = BitmapDescriptorFactory.HUE_RED;
            this.f3919w0 = BitmapDescriptorFactory.HUE_RED;
            this.f3920x0 = BitmapDescriptorFactory.HUE_RED;
            this.f3921y0 = 1.0f;
            this.f3922z0 = 1.0f;
            this.A0 = BitmapDescriptorFactory.HUE_RED;
            this.B0 = BitmapDescriptorFactory.HUE_RED;
            this.C0 = BitmapDescriptorFactory.HUE_RED;
            this.D0 = BitmapDescriptorFactory.HUE_RED;
            this.E0 = BitmapDescriptorFactory.HUE_RED;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.Q3);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = obtainStyledAttributes.getIndex(i11);
                if (index == i.R3) {
                    this.f3915s0 = obtainStyledAttributes.getFloat(index, this.f3915s0);
                } else if (index == i.f3955c4) {
                    if (Build.VERSION.SDK_INT >= 21) {
                        this.f3917u0 = obtainStyledAttributes.getFloat(index, this.f3917u0);
                        this.f3916t0 = true;
                    }
                } else if (index == i.Z3) {
                    this.f3919w0 = obtainStyledAttributes.getFloat(index, this.f3919w0);
                } else if (index == i.f3933a4) {
                    this.f3920x0 = obtainStyledAttributes.getFloat(index, this.f3920x0);
                } else if (index == i.Y3) {
                    this.f3918v0 = obtainStyledAttributes.getFloat(index, this.f3918v0);
                } else if (index == i.W3) {
                    this.f3921y0 = obtainStyledAttributes.getFloat(index, this.f3921y0);
                } else if (index == i.X3) {
                    this.f3922z0 = obtainStyledAttributes.getFloat(index, this.f3922z0);
                } else if (index == i.S3) {
                    this.A0 = obtainStyledAttributes.getFloat(index, this.A0);
                } else if (index == i.T3) {
                    this.B0 = obtainStyledAttributes.getFloat(index, this.B0);
                } else if (index == i.U3) {
                    this.C0 = obtainStyledAttributes.getFloat(index, this.C0);
                } else if (index == i.V3) {
                    this.D0 = obtainStyledAttributes.getFloat(index, this.D0);
                } else if (index == i.f3944b4 && Build.VERSION.SDK_INT >= 21) {
                    this.E0 = obtainStyledAttributes.getFloat(index, this.E0);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }
}