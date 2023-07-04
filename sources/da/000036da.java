package com.google.android.material.transformation;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.a0;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.transformation.FabTransformationBehavior;
import fk.a;
import gk.h;
import gk.j;
import java.util.HashMap;
import java.util.Map;

@Deprecated
/* loaded from: classes3.dex */
public class FabTransformationSheetBehavior extends FabTransformationBehavior {

    /* renamed from: i  reason: collision with root package name */
    private Map<View, Integer> f15832i;

    public FabTransformationSheetBehavior() {
    }

    private void g0(View view, boolean z11) {
        ViewParent parent = view.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (Build.VERSION.SDK_INT >= 16 && z11) {
                this.f15832i = new HashMap(childCount);
            }
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = coordinatorLayout.getChildAt(i11);
                boolean z12 = (childAt.getLayoutParams() instanceof CoordinatorLayout.f) && (((CoordinatorLayout.f) childAt.getLayoutParams()).f() instanceof FabTransformationScrimBehavior);
                if (childAt != view && !z12) {
                    if (!z11) {
                        Map<View, Integer> map = this.f15832i;
                        if (map != null && map.containsKey(childAt)) {
                            a0.G0(childAt, this.f15832i.get(childAt).intValue());
                        }
                    } else {
                        if (Build.VERSION.SDK_INT >= 16) {
                            this.f15832i.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        }
                        a0.G0(childAt, 4);
                    }
                }
            }
            if (z11) {
                return;
            }
            this.f15832i = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior, com.google.android.material.transformation.ExpandableBehavior
    public boolean H(View view, View view2, boolean z11, boolean z12) {
        g0(view2, z11);
        return super.H(view, view2, z11, z12);
    }

    @Override // com.google.android.material.transformation.FabTransformationBehavior
    protected FabTransformationBehavior.e e0(Context context, boolean z11) {
        int i11;
        if (z11) {
            i11 = a.f26364h;
        } else {
            i11 = a.f26363g;
        }
        FabTransformationBehavior.e eVar = new FabTransformationBehavior.e();
        eVar.f15826a = h.c(context, i11);
        eVar.f15827b = new j(17, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        return eVar;
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}