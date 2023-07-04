package k0;

import android.view.ViewConfiguration;
import androidx.compose.ui.platform.l0;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a  reason: collision with root package name */
    private static final float f34200a = ViewConfiguration.getScrollFriction();

    public static final float a() {
        return f34200a;
    }

    public static final <T> l0.w<T> b(c1.i iVar, int i11) {
        iVar.x(-903108490);
        x2.d dVar = (x2.d) iVar.A(l0.d());
        Float valueOf = Float.valueOf(dVar.getDensity());
        iVar.x(-3686930);
        boolean O = iVar.O(valueOf);
        Object y11 = iVar.y();
        if (O || y11 == c1.i.f8486a.a()) {
            y11 = l0.y.a(new y(dVar));
            iVar.p(y11);
        }
        iVar.N();
        l0.w<T> wVar = (l0.w) y11;
        iVar.N();
        return wVar;
    }
}