package com.swmansion.gesturehandler.react;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.uimanager.q;
import com.facebook.react.uimanager.z;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class p implements xr.o {

    /* loaded from: classes6.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f21211a;

        static {
            int[] iArr = new int[q.values().length];
            iArr[q.BOX_ONLY.ordinal()] = 1;
            iArr[q.BOX_NONE.ordinal()] = 2;
            iArr[q.NONE.ordinal()] = 3;
            iArr[q.AUTO.ordinal()] = 4;
            f21211a = iArr;
        }
    }

    @Override // xr.o
    public com.swmansion.gesturehandler.e a(View view) {
        q qVar;
        s.g(view, "view");
        if (view instanceof z) {
            qVar = ((z) view).getPointerEvents();
            s.f(qVar, "{\n        (view as React…ew).pointerEvents\n      }");
        } else {
            qVar = q.AUTO;
        }
        if (!view.isEnabled()) {
            if (qVar == q.AUTO) {
                return com.swmansion.gesturehandler.e.BOX_NONE;
            }
            if (qVar == q.BOX_ONLY) {
                return com.swmansion.gesturehandler.e.NONE;
            }
        }
        int i11 = a.f21211a[qVar.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 == 4) {
                        return com.swmansion.gesturehandler.e.AUTO;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                return com.swmansion.gesturehandler.e.NONE;
            }
            return com.swmansion.gesturehandler.e.BOX_NONE;
        }
        return com.swmansion.gesturehandler.e.BOX_ONLY;
    }

    @Override // xr.o
    public boolean b(ViewGroup view) {
        s.g(view, "view");
        if (view.getClipChildren()) {
            return true;
        }
        if (view instanceof com.facebook.react.views.view.g) {
            return s.c("hidden", ((com.facebook.react.views.view.g) view).getOverflow());
        }
        return false;
    }

    @Override // xr.o
    public View c(ViewGroup parent, int i11) {
        s.g(parent, "parent");
        if (parent instanceof com.facebook.react.views.view.g) {
            View childAt = parent.getChildAt(((com.facebook.react.views.view.g) parent).getZIndexMappedChildIndex(i11));
            s.f(childAt, "{\n      parent.getChildA…dChildIndex(index))\n    }");
            return childAt;
        }
        View childAt2 = parent.getChildAt(i11);
        s.f(childAt2, "parent.getChildAt(index)");
        return childAt2;
    }
}