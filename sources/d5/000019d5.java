package com.facebook.react.uimanager;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.config.ReactFeatureFlags;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.EnumSet;
import java.util.List;

/* loaded from: classes3.dex */
public class o0 {

    /* renamed from: a  reason: collision with root package name */
    private static final float[] f12384a = new float[2];

    /* renamed from: b  reason: collision with root package name */
    private static final PointF f12385b = new PointF();

    /* renamed from: c  reason: collision with root package name */
    private static final float[] f12386c = new float[2];

    /* renamed from: d  reason: collision with root package name */
    private static final Matrix f12387d = new Matrix();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public enum a {
        SELF,
        CHILD
    }

    private static View a(View view) {
        while (view != null && view.getId() <= 0) {
            view = (View) view.getParent();
        }
        return view;
    }

    public static int b(float f11, float f12, ViewGroup viewGroup, float[] fArr, int[] iArr) {
        View a11;
        UiThreadUtil.assertOnUiThread();
        int id2 = viewGroup.getId();
        fArr[0] = f11;
        fArr[1] = f12;
        View e11 = e(fArr, viewGroup, null);
        if (e11 == null || (a11 = a(e11)) == null) {
            return id2;
        }
        if (iArr != null) {
            iArr[0] = a11.getId();
        }
        return g(a11, fArr[0], fArr[1]);
    }

    public static int c(float f11, float f12, ViewGroup viewGroup) {
        return b(f11, f12, viewGroup, f12384a, null);
    }

    private static View d(float[] fArr, View view, EnumSet<a> enumSet, List<Integer> list) {
        if (enumSet.contains(a.CHILD) && (view instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (!h(fArr[0], fArr[1], view)) {
                if (view instanceof y) {
                    if (og.a.a(view.getId()) == 2 && ReactFeatureFlags.doesUseOverflowInset() && !i(fArr[0], fArr[1], view)) {
                        return null;
                    }
                    String overflow = ((y) view).getOverflow();
                    if ("hidden".equals(overflow) || "scroll".equals(overflow)) {
                        return null;
                    }
                }
                if (viewGroup.getClipChildren()) {
                    return null;
                }
            }
            int childCount = viewGroup.getChildCount();
            g0 g0Var = viewGroup instanceof g0 ? (g0) viewGroup : null;
            for (int i11 = childCount - 1; i11 >= 0; i11--) {
                View childAt = viewGroup.getChildAt(g0Var != null ? g0Var.getZIndexMappedChildIndex(i11) : i11);
                PointF pointF = f12385b;
                f(fArr[0], fArr[1], viewGroup, childAt, pointF);
                float f11 = fArr[0];
                float f12 = fArr[1];
                fArr[0] = pointF.x;
                fArr[1] = pointF.y;
                View e11 = e(fArr, childAt, list);
                if (e11 != null) {
                    return e11;
                }
                fArr[0] = f11;
                fArr[1] = f12;
            }
        }
        if (enumSet.contains(a.SELF) && h(fArr[0], fArr[1], view)) {
            return view;
        }
        return null;
    }

    private static View e(float[] fArr, View view, List<Integer> list) {
        q qVar;
        if (view instanceof z) {
            qVar = ((z) view).getPointerEvents();
        } else {
            qVar = q.AUTO;
        }
        if (!view.isEnabled()) {
            if (qVar == q.AUTO) {
                qVar = q.BOX_NONE;
            } else if (qVar == q.BOX_ONLY) {
                qVar = q.NONE;
            }
        }
        if (qVar == q.NONE) {
            return null;
        }
        if (qVar == q.BOX_ONLY) {
            View d11 = d(fArr, view, EnumSet.of(a.SELF), list);
            if (d11 != null && list != null) {
                list.add(Integer.valueOf(view.getId()));
            }
            return d11;
        } else if (qVar == q.BOX_NONE) {
            View d12 = d(fArr, view, EnumSet.of(a.CHILD), list);
            if (d12 != null) {
                if (list != null) {
                    list.add(Integer.valueOf(view.getId()));
                }
                return d12;
            } else if ((view instanceof v) && h(fArr[0], fArr[1], view) && ((v) view).reactTagForTouch(fArr[0], fArr[1]) != view.getId()) {
                if (list != null) {
                    list.add(Integer.valueOf(view.getId()));
                }
                return view;
            } else {
                return null;
            }
        } else if (qVar == q.AUTO) {
            if ((view instanceof w) && h(fArr[0], fArr[1], view) && ((w) view).interceptsTouchEvent(fArr[0], fArr[1])) {
                if (list != null) {
                    list.add(Integer.valueOf(view.getId()));
                }
                return view;
            }
            View d13 = d(fArr, view, EnumSet.of(a.SELF, a.CHILD), list);
            if (d13 != null && list != null) {
                list.add(Integer.valueOf(view.getId()));
            }
            return d13;
        } else {
            throw new JSApplicationIllegalArgumentException("Unknown pointer event type: " + qVar.toString());
        }
    }

    private static void f(float f11, float f12, ViewGroup viewGroup, View view, PointF pointF) {
        float scrollX = (f11 + viewGroup.getScrollX()) - view.getLeft();
        float scrollY = (f12 + viewGroup.getScrollY()) - view.getTop();
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            float[] fArr = f12386c;
            fArr[0] = scrollX;
            fArr[1] = scrollY;
            Matrix matrix2 = f12387d;
            matrix.invert(matrix2);
            matrix2.mapPoints(fArr);
            float f13 = fArr[0];
            scrollY = fArr[1];
            scrollX = f13;
        }
        pointF.set(scrollX, scrollY);
    }

    private static int g(View view, float f11, float f12) {
        if (view instanceof v) {
            return ((v) view).reactTagForTouch(f11, f12);
        }
        return view.getId();
    }

    private static boolean h(float f11, float f12, View view) {
        if (view instanceof mg.c) {
            mg.c cVar = (mg.c) view;
            if (cVar.getHitSlopRect() != null) {
                Rect hitSlopRect = cVar.getHitSlopRect();
                return f11 >= ((float) (-hitSlopRect.left)) && f11 < ((float) (view.getWidth() + hitSlopRect.right)) && f12 >= ((float) (-hitSlopRect.top)) && f12 < ((float) (view.getHeight() + hitSlopRect.bottom));
            }
        }
        return f11 >= BitmapDescriptorFactory.HUE_RED && f11 < ((float) view.getWidth()) && f12 >= BitmapDescriptorFactory.HUE_RED && f12 < ((float) view.getHeight());
    }

    private static boolean i(float f11, float f12, View view) {
        if (view instanceof y) {
            Rect overflowInset = ((y) view).getOverflowInset();
            return f11 >= ((float) overflowInset.left) && f11 < ((float) (view.getWidth() - overflowInset.right)) && f12 >= ((float) overflowInset.top) && f12 < ((float) (view.getHeight() - overflowInset.bottom));
        }
        return false;
    }
}