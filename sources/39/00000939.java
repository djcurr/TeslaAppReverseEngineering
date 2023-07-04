package androidx.transition;

import android.view.View;

/* loaded from: classes.dex */
public abstract class x0 extends b0 {
    private static final String PROPNAME_VISIBILITY = "android:visibilityPropagation:visibility";
    private static final String PROPNAME_VIEW_CENTER = "android:visibilityPropagation:center";
    private static final String[] VISIBILITY_PROPAGATION_VALUES = {PROPNAME_VISIBILITY, PROPNAME_VIEW_CENTER};

    private static int getViewCoordinate(e0 e0Var, int i11) {
        int[] iArr;
        if (e0Var == null || (iArr = (int[]) e0Var.f6129a.get(PROPNAME_VIEW_CENTER)) == null) {
            return -1;
        }
        return iArr[i11];
    }

    @Override // androidx.transition.b0
    public void captureValues(e0 e0Var) {
        View view = e0Var.f6130b;
        Integer num = (Integer) e0Var.f6129a.get("android:visibility:visibility");
        if (num == null) {
            num = Integer.valueOf(view.getVisibility());
        }
        e0Var.f6129a.put(PROPNAME_VISIBILITY, num);
        view.getLocationOnScreen(r2);
        int[] iArr = {iArr[0] + Math.round(view.getTranslationX())};
        iArr[0] = iArr[0] + (view.getWidth() / 2);
        iArr[1] = iArr[1] + Math.round(view.getTranslationY());
        iArr[1] = iArr[1] + (view.getHeight() / 2);
        e0Var.f6129a.put(PROPNAME_VIEW_CENTER, iArr);
    }

    @Override // androidx.transition.b0
    public String[] getPropagationProperties() {
        return VISIBILITY_PROPAGATION_VALUES;
    }

    public int getViewVisibility(e0 e0Var) {
        Integer num;
        if (e0Var == null || (num = (Integer) e0Var.f6129a.get(PROPNAME_VISIBILITY)) == null) {
            return 8;
        }
        return num.intValue();
    }

    public int getViewX(e0 e0Var) {
        return getViewCoordinate(e0Var, 0);
    }

    public int getViewY(e0 e0Var) {
        return getViewCoordinate(e0Var, 1);
    }
}