package m4;

import android.view.View;
import androidx.compose.ui.platform.z;
import androidx.lifecycle.u0;
import c1.i;
import c1.r;
import c1.w0;
import c1.x0;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f38401a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final w0<u0> f38402b = r.c(null, C0737a.f38403a, 1, null);

    /* renamed from: m4.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static final class C0737a extends u implements h00.a<u0> {

        /* renamed from: a  reason: collision with root package name */
        public static final C0737a f38403a = new C0737a();

        C0737a() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: a */
        public final u0 invoke() {
            return null;
        }
    }

    private a() {
    }

    public final u0 a(i iVar, int i11) {
        iVar.x(-420916950);
        u0 u0Var = (u0) iVar.A(f38402b);
        if (u0Var == null) {
            u0Var = androidx.lifecycle.w0.a((View) iVar.A(z.k()));
        }
        iVar.N();
        return u0Var;
    }

    public final x0<u0> b(u0 viewModelStoreOwner) {
        s.g(viewModelStoreOwner, "viewModelStoreOwner");
        return f38402b.c(viewModelStoreOwner);
    }
}