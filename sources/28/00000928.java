package androidx.transition;

import android.graphics.Rect;
import android.view.ViewGroup;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public class v extends x0 {
    private float mPropagationSpeed = 3.0f;
    private int mSide = 80;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0017, code lost:
        r0 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0026, code lost:
        if ((androidx.core.view.a0.F(r7) == 1) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0013, code lost:
        if ((androidx.core.view.a0.F(r7) == 1) != false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0015, code lost:
        r0 = 5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int distance(android.view.View r7, int r8, int r9, int r10, int r11, int r12, int r13, int r14, int r15) {
        /*
            r6 = this;
            int r0 = r6.mSide
            r1 = 5
            r2 = 3
            r3 = 0
            r4 = 1
            r5 = 8388611(0x800003, float:1.1754948E-38)
            if (r0 != r5) goto L19
            int r7 = androidx.core.view.a0.F(r7)
            if (r7 != r4) goto L12
            goto L13
        L12:
            r4 = r3
        L13:
            if (r4 == 0) goto L17
        L15:
            r0 = r1
            goto L29
        L17:
            r0 = r2
            goto L29
        L19:
            r5 = 8388613(0x800005, float:1.175495E-38)
            if (r0 != r5) goto L29
            int r7 = androidx.core.view.a0.F(r7)
            if (r7 != r4) goto L25
            goto L26
        L25:
            r4 = r3
        L26:
            if (r4 == 0) goto L15
            goto L17
        L29:
            if (r0 == r2) goto L51
            if (r0 == r1) goto L48
            r7 = 48
            if (r0 == r7) goto L3f
            r7 = 80
            if (r0 == r7) goto L36
            goto L59
        L36:
            int r9 = r9 - r13
            int r10 = r10 - r8
            int r7 = java.lang.Math.abs(r10)
            int r3 = r9 + r7
            goto L59
        L3f:
            int r15 = r15 - r9
            int r10 = r10 - r8
            int r7 = java.lang.Math.abs(r10)
            int r3 = r15 + r7
            goto L59
        L48:
            int r8 = r8 - r12
            int r11 = r11 - r9
            int r7 = java.lang.Math.abs(r11)
            int r3 = r8 + r7
            goto L59
        L51:
            int r14 = r14 - r8
            int r11 = r11 - r9
            int r7 = java.lang.Math.abs(r11)
            int r3 = r14 + r7
        L59:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.v.distance(android.view.View, int, int, int, int, int, int, int, int):int");
    }

    private int getMaxDistance(ViewGroup viewGroup) {
        int i11 = this.mSide;
        if (i11 != 3 && i11 != 5 && i11 != 8388611 && i11 != 8388613) {
            return viewGroup.getHeight();
        }
        return viewGroup.getWidth();
    }

    @Override // androidx.transition.b0
    public long getStartDelay(ViewGroup viewGroup, y yVar, e0 e0Var, e0 e0Var2) {
        int i11;
        int i12;
        int i13;
        e0 e0Var3 = e0Var;
        if (e0Var3 == null && e0Var2 == null) {
            return 0L;
        }
        Rect epicenter = yVar.getEpicenter();
        if (e0Var2 == null || getViewVisibility(e0Var3) == 0) {
            i11 = -1;
        } else {
            e0Var3 = e0Var2;
            i11 = 1;
        }
        int viewX = getViewX(e0Var3);
        int viewY = getViewY(e0Var3);
        int[] iArr = new int[2];
        viewGroup.getLocationOnScreen(iArr);
        int round = iArr[0] + Math.round(viewGroup.getTranslationX());
        int round2 = iArr[1] + Math.round(viewGroup.getTranslationY());
        int width = round + viewGroup.getWidth();
        int height = round2 + viewGroup.getHeight();
        if (epicenter != null) {
            i12 = epicenter.centerX();
            i13 = epicenter.centerY();
        } else {
            i12 = (round + width) / 2;
            i13 = (round2 + height) / 2;
        }
        float distance = distance(viewGroup, viewX, viewY, i12, i13, round, round2, width, height) / getMaxDistance(viewGroup);
        long duration = yVar.getDuration();
        if (duration < 0) {
            duration = 300;
        }
        return Math.round((((float) (duration * i11)) / this.mPropagationSpeed) * distance);
    }

    public void setPropagationSpeed(float f11) {
        if (f11 != BitmapDescriptorFactory.HUE_RED) {
            this.mPropagationSpeed = f11;
            return;
        }
        throw new IllegalArgumentException("propagationSpeed may not be 0");
    }

    public void setSide(int i11) {
        this.mSide = i11;
    }
}