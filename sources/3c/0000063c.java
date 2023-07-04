package androidx.core.view;

import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;

/* loaded from: classes.dex */
public final class f0 {
    public static boolean a(ViewParent viewParent, View view, float f11, float f12, boolean z11) {
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                return viewParent.onNestedFling(view, f11, f12, z11);
            } catch (AbstractMethodError e11) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedFling", e11);
                return false;
            }
        } else if (viewParent instanceof s) {
            return ((s) viewParent).onNestedFling(view, f11, f12, z11);
        } else {
            return false;
        }
    }

    public static boolean b(ViewParent viewParent, View view, float f11, float f12) {
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                return viewParent.onNestedPreFling(view, f11, f12);
            } catch (AbstractMethodError e11) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedPreFling", e11);
                return false;
            }
        } else if (viewParent instanceof s) {
            return ((s) viewParent).onNestedPreFling(view, f11, f12);
        } else {
            return false;
        }
    }

    public static void c(ViewParent viewParent, View view, int i11, int i12, int[] iArr, int i13) {
        if (viewParent instanceof q) {
            ((q) viewParent).k(view, i11, i12, iArr, i13);
        } else if (i13 == 0) {
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    viewParent.onNestedPreScroll(view, i11, i12, iArr);
                } catch (AbstractMethodError e11) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedPreScroll", e11);
                }
            } else if (viewParent instanceof s) {
                ((s) viewParent).onNestedPreScroll(view, i11, i12, iArr);
            }
        }
    }

    public static void d(ViewParent viewParent, View view, int i11, int i12, int i13, int i14, int i15, int[] iArr) {
        if (viewParent instanceof r) {
            ((r) viewParent).m(view, i11, i12, i13, i14, i15, iArr);
            return;
        }
        iArr[0] = iArr[0] + i13;
        iArr[1] = iArr[1] + i14;
        if (viewParent instanceof q) {
            ((q) viewParent).n(view, i11, i12, i13, i14, i15);
        } else if (i15 == 0) {
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    viewParent.onNestedScroll(view, i11, i12, i13, i14);
                } catch (AbstractMethodError e11) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedScroll", e11);
                }
            } else if (viewParent instanceof s) {
                ((s) viewParent).onNestedScroll(view, i11, i12, i13, i14);
            }
        }
    }

    public static void e(ViewParent viewParent, View view, View view2, int i11, int i12) {
        if (viewParent instanceof q) {
            ((q) viewParent).a(view, view2, i11, i12);
        } else if (i12 == 0) {
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    viewParent.onNestedScrollAccepted(view, view2, i11);
                } catch (AbstractMethodError e11) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedScrollAccepted", e11);
                }
            } else if (viewParent instanceof s) {
                ((s) viewParent).onNestedScrollAccepted(view, view2, i11);
            }
        }
    }

    public static boolean f(ViewParent viewParent, View view, View view2, int i11, int i12) {
        if (viewParent instanceof q) {
            return ((q) viewParent).o(view, view2, i11, i12);
        }
        if (i12 == 0) {
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    return viewParent.onStartNestedScroll(view, view2, i11);
                } catch (AbstractMethodError e11) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onStartNestedScroll", e11);
                    return false;
                }
            } else if (viewParent instanceof s) {
                return ((s) viewParent).onStartNestedScroll(view, view2, i11);
            } else {
                return false;
            }
        }
        return false;
    }

    public static void g(ViewParent viewParent, View view, int i11) {
        if (viewParent instanceof q) {
            ((q) viewParent).j(view, i11);
        } else if (i11 == 0) {
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    viewParent.onStopNestedScroll(view);
                } catch (AbstractMethodError e11) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onStopNestedScroll", e11);
                }
            } else if (viewParent instanceof s) {
                ((s) viewParent).onStopNestedScroll(view);
            }
        }
    }
}