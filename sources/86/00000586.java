package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;

/* loaded from: classes.dex */
public class Barrier extends b {

    /* renamed from: j  reason: collision with root package name */
    private int f3717j;

    /* renamed from: k  reason: collision with root package name */
    private int f3718k;

    /* renamed from: l  reason: collision with root package name */
    private f3.a f3719l;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    private void u(f3.e eVar, int i11, boolean z11) {
        this.f3718k = i11;
        if (Build.VERSION.SDK_INT < 17) {
            int i12 = this.f3717j;
            if (i12 == 5) {
                this.f3718k = 0;
            } else if (i12 == 6) {
                this.f3718k = 1;
            }
        } else if (z11) {
            int i13 = this.f3717j;
            if (i13 == 5) {
                this.f3718k = 1;
            } else if (i13 == 6) {
                this.f3718k = 0;
            }
        } else {
            int i14 = this.f3717j;
            if (i14 == 5) {
                this.f3718k = 0;
            } else if (i14 == 6) {
                this.f3718k = 1;
            }
        }
        if (eVar instanceof f3.a) {
            ((f3.a) eVar).z1(this.f3718k);
        }
    }

    public boolean getAllowsGoneWidget() {
        return this.f3719l.t1();
    }

    public int getMargin() {
        return this.f3719l.v1();
    }

    public int getType() {
        return this.f3717j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.b
    public void n(AttributeSet attributeSet) {
        super.n(attributeSet);
        this.f3719l = new f3.a();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, i.U0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = obtainStyledAttributes.getIndex(i11);
                if (index == i.f3963d1) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == i.f3952c1) {
                    this.f3719l.y1(obtainStyledAttributes.getBoolean(index, true));
                } else if (index == i.f3974e1) {
                    this.f3719l.A1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f3786d = this.f3719l;
        t();
    }

    @Override // androidx.constraintlayout.widget.b
    public void o(f3.e eVar, boolean z11) {
        u(eVar, this.f3717j, z11);
    }

    public void setAllowsGoneWidget(boolean z11) {
        this.f3719l.y1(z11);
    }

    public void setDpMargin(int i11) {
        f3.a aVar = this.f3719l;
        aVar.A1((int) ((i11 * getResources().getDisplayMetrics().density) + 0.5f));
    }

    public void setMargin(int i11) {
        this.f3719l.A1(i11);
    }

    public void setType(int i11) {
        this.f3717j = i11;
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }
}