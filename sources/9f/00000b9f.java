package b1;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.ui.platform.z;
import c1.v1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import t1.a0;

/* loaded from: classes.dex */
public final class d extends e {
    private d(boolean z11, float f11, v1<a0> v1Var) {
        super(z11, f11, v1Var, null);
    }

    public /* synthetic */ d(boolean z11, float f11, v1 v1Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(z11, f11, v1Var);
    }

    private final ViewGroup c(c1.i iVar, int i11) {
        iVar.x(601470064);
        Object A = iVar.A(z.k());
        while (!(A instanceof ViewGroup)) {
            ViewParent parent = ((View) A).getParent();
            if (parent instanceof View) {
                s.f(parent, "parent");
                A = parent;
            } else {
                throw new IllegalArgumentException(("Couldn't find a valid parent for " + A + ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?").toString());
            }
        }
        ViewGroup viewGroup = (ViewGroup) A;
        iVar.N();
        return viewGroup;
    }

    @Override // b1.e
    public m b(o0.k interactionSource, boolean z11, float f11, v1<a0> color, v1<f> rippleAlpha, c1.i iVar, int i11) {
        s.g(interactionSource, "interactionSource");
        s.g(color, "color");
        s.g(rippleAlpha, "rippleAlpha");
        iVar.x(1643266907);
        ViewGroup c11 = c(iVar, (i11 >> 15) & 14);
        iVar.x(1643267286);
        if (c11.isInEditMode()) {
            iVar.x(-3686552);
            boolean O = iVar.O(interactionSource) | iVar.O(this);
            Object y11 = iVar.y();
            if (O || y11 == c1.i.f8486a.a()) {
                y11 = new b(z11, f11, color, rippleAlpha, null);
                iVar.p(y11);
            }
            iVar.N();
            b bVar = (b) y11;
            iVar.N();
            iVar.N();
            return bVar;
        }
        iVar.N();
        i iVar2 = null;
        int i12 = 0;
        int childCount = c11.getChildCount();
        while (true) {
            if (i12 >= childCount) {
                break;
            }
            int i13 = i12 + 1;
            View childAt = c11.getChildAt(i12);
            if (childAt instanceof i) {
                iVar2 = childAt;
                break;
            }
            i12 = i13;
        }
        if (iVar2 == null) {
            Context context = c11.getContext();
            s.f(context, "view.context");
            iVar2 = new i(context);
            c11.addView(iVar2);
        }
        iVar.x(-3686095);
        boolean O2 = iVar.O(interactionSource) | iVar.O(this) | iVar.O(iVar2);
        Object y12 = iVar.y();
        if (O2 || y12 == c1.i.f8486a.a()) {
            y12 = new a(z11, f11, color, rippleAlpha, iVar2, null);
            iVar.p(y12);
        }
        iVar.N();
        a aVar = (a) y12;
        iVar.N();
        return aVar;
    }
}