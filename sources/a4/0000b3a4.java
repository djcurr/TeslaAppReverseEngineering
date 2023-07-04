package t;

import android.content.Context;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class u implements androidx.camera.core.impl.q {

    /* renamed from: a  reason: collision with root package name */
    private final androidx.camera.core.impl.y f51216a;

    /* renamed from: c  reason: collision with root package name */
    private final u.j f51218c;

    /* renamed from: d  reason: collision with root package name */
    private final List<String> f51219d;

    /* renamed from: e  reason: collision with root package name */
    private final Map<String, k0> f51220e = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final androidx.camera.core.impl.x f51217b = new androidx.camera.core.impl.x(1);

    public u(Context context, androidx.camera.core.impl.y yVar, z.e eVar) {
        this.f51216a = yVar;
        this.f51218c = u.j.b(context, yVar.c());
        this.f51219d = v0.b(this, eVar);
    }

    @Override // androidx.camera.core.impl.q
    public androidx.camera.core.impl.s a(String str) {
        if (this.f51219d.contains(str)) {
            return new h0(this.f51218c, str, d(str), this.f51217b, this.f51216a.b(), this.f51216a.c());
        }
        throw new IllegalArgumentException("The given camera id is not on the available camera id list.");
    }

    @Override // androidx.camera.core.impl.q
    public Set<String> b() {
        return new LinkedHashSet(this.f51219d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public k0 d(String str) {
        try {
            k0 k0Var = this.f51220e.get(str);
            if (k0Var == null) {
                k0 k0Var2 = new k0(str, this.f51218c.c(str));
                this.f51220e.put(str, k0Var2);
                return k0Var2;
            }
            return k0Var;
        } catch (CameraAccessExceptionCompat e11) {
            throw w0.a(e11);
        }
    }

    @Override // androidx.camera.core.impl.q
    /* renamed from: e */
    public u.j c() {
        return this.f51218c;
    }
}