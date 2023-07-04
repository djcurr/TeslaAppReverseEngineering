package m4;

import androidx.lifecycle.p0;
import androidx.lifecycle.s0;
import androidx.lifecycle.u0;
import c1.i;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class b {
    private static final <VM extends p0> VM a(u0 u0Var, Class<VM> cls, String str, s0.b bVar) {
        s0 s0Var;
        if (bVar != null) {
            s0Var = new s0(u0Var, bVar);
        } else {
            s0Var = new s0(u0Var);
        }
        if (str != null) {
            VM vm2 = (VM) s0Var.b(str, cls);
            s.f(vm2, "{\n        provider.get(key, javaClass)\n    }");
            return vm2;
        }
        VM vm3 = (VM) s0Var.a(cls);
        s.f(vm3, "{\n        provider.get(javaClass)\n    }");
        return vm3;
    }

    public static final <VM extends p0> VM b(Class<VM> modelClass, u0 u0Var, String str, s0.b bVar, i iVar, int i11, int i12) {
        s.g(modelClass, "modelClass");
        iVar.x(564615719);
        if ((i12 & 2) == 0 || (u0Var = a.f38401a.a(iVar, 0)) != null) {
            if ((i12 & 4) != 0) {
                str = null;
            }
            if ((i12 & 8) != 0) {
                bVar = null;
            }
            VM vm2 = (VM) a(u0Var, modelClass, str, bVar);
            iVar.N();
            return vm2;
        }
        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
    }
}