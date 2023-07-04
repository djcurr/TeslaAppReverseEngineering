package com.google.android.material.snackbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.a0;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import fk.f;

/* loaded from: classes3.dex */
public class SnackbarContentLayout extends LinearLayout implements a {

    /* renamed from: a  reason: collision with root package name */
    private TextView f15635a;

    /* renamed from: b  reason: collision with root package name */
    private Button f15636b;

    /* renamed from: c  reason: collision with root package name */
    private int f15637c;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private static void d(View view, int i11, int i12) {
        if (a0.c0(view)) {
            a0.K0(view, a0.K(view), i11, a0.J(view), i12);
        } else {
            view.setPadding(view.getPaddingLeft(), i11, view.getPaddingRight(), i12);
        }
    }

    private boolean e(int i11, int i12, int i13) {
        boolean z11;
        if (i11 != getOrientation()) {
            setOrientation(i11);
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f15635a.getPaddingTop() == i12 && this.f15635a.getPaddingBottom() == i13) {
            return z11;
        }
        d(this.f15635a, i12, i13);
        return true;
    }

    @Override // com.google.android.material.snackbar.a
    public void a(int i11, int i12) {
        this.f15635a.setAlpha(BitmapDescriptorFactory.HUE_RED);
        long j11 = i12;
        long j12 = i11;
        this.f15635a.animate().alpha(1.0f).setDuration(j11).setStartDelay(j12).start();
        if (this.f15636b.getVisibility() == 0) {
            this.f15636b.setAlpha(BitmapDescriptorFactory.HUE_RED);
            this.f15636b.animate().alpha(1.0f).setDuration(j11).setStartDelay(j12).start();
        }
    }

    @Override // com.google.android.material.snackbar.a
    public void b(int i11, int i12) {
        this.f15635a.setAlpha(1.0f);
        long j11 = i12;
        long j12 = i11;
        this.f15635a.animate().alpha(BitmapDescriptorFactory.HUE_RED).setDuration(j11).setStartDelay(j12).start();
        if (this.f15636b.getVisibility() == 0) {
            this.f15636b.setAlpha(1.0f);
            this.f15636b.animate().alpha(BitmapDescriptorFactory.HUE_RED).setDuration(j11).setStartDelay(j12).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(float f11) {
        if (f11 != 1.0f) {
            this.f15636b.setTextColor(kk.a.h(kk.a.d(this, fk.b.f26378n), this.f15636b.getCurrentTextColor(), f11));
        }
    }

    public Button getActionView() {
        return this.f15636b;
    }

    public TextView getMessageView() {
        return this.f15635a;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f15635a = (TextView) findViewById(f.K);
        this.f15636b = (Button) findViewById(f.J);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003e, code lost:
        if (e(1, r0, r0 - r1) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0049, code lost:
        if (e(0, r0, r0) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004b, code lost:
        r3 = true;
     */
    @Override // android.widget.LinearLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            super.onMeasure(r8, r9)
            android.content.res.Resources r0 = r7.getResources()
            int r1 = fk.d.f26403g
            int r0 = r0.getDimensionPixelSize(r1)
            android.content.res.Resources r1 = r7.getResources()
            int r2 = fk.d.f26402f
            int r1 = r1.getDimensionPixelSize(r2)
            android.widget.TextView r2 = r7.f15635a
            android.text.Layout r2 = r2.getLayout()
            int r2 = r2.getLineCount()
            r3 = 0
            r4 = 1
            if (r2 <= r4) goto L27
            r2 = r4
            goto L28
        L27:
            r2 = r3
        L28:
            if (r2 == 0) goto L41
            int r5 = r7.f15637c
            if (r5 <= 0) goto L41
            android.widget.Button r5 = r7.f15636b
            int r5 = r5.getMeasuredWidth()
            int r6 = r7.f15637c
            if (r5 <= r6) goto L41
            int r1 = r0 - r1
            boolean r0 = r7.e(r4, r0, r1)
            if (r0 == 0) goto L4c
            goto L4b
        L41:
            if (r2 == 0) goto L44
            goto L45
        L44:
            r0 = r1
        L45:
            boolean r0 = r7.e(r3, r0, r0)
            if (r0 == 0) goto L4c
        L4b:
            r3 = r4
        L4c:
            if (r3 == 0) goto L51
            super.onMeasure(r8, r9)
        L51:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.SnackbarContentLayout.onMeasure(int, int):void");
    }

    public void setMaxInlineActionWidth(int i11) {
        this.f15637c = i11;
    }
}