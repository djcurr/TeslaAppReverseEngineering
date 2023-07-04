package xj;

import ak.k0;
import ci.o;

/* loaded from: classes3.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public final int f57588a;

    /* renamed from: b  reason: collision with root package name */
    public final o[] f57589b;

    /* renamed from: c  reason: collision with root package name */
    public final g[] f57590c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f57591d;

    public n(o[] oVarArr, g[] gVarArr, Object obj) {
        this.f57589b = oVarArr;
        this.f57590c = (g[]) gVarArr.clone();
        this.f57591d = obj;
        this.f57588a = oVarArr.length;
    }

    public boolean a(n nVar) {
        if (nVar == null || nVar.f57590c.length != this.f57590c.length) {
            return false;
        }
        for (int i11 = 0; i11 < this.f57590c.length; i11++) {
            if (!b(nVar, i11)) {
                return false;
            }
        }
        return true;
    }

    public boolean b(n nVar, int i11) {
        return nVar != null && k0.c(this.f57589b[i11], nVar.f57589b[i11]) && k0.c(this.f57590c[i11], nVar.f57590c[i11]);
    }

    public boolean c(int i11) {
        return this.f57589b[i11] != null;
    }
}