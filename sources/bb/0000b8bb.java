package v20;

/* loaded from: classes5.dex */
public final class g3<T> extends kotlinx.coroutines.internal.d0<T> {

    /* renamed from: d  reason: collision with root package name */
    private ThreadLocal<vz.p<zz.g, Object>> f53925d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public g3(zz.g r3, zz.d<? super T> r4) {
        /*
            r2 = this;
            v20.h3 r0 = v20.h3.f53942a
            zz.g$b r1 = r3.get(r0)
            if (r1 != 0) goto Lc
            zz.g r3 = r3.plus(r0)
        Lc:
            r2.<init>(r3, r4)
            java.lang.ThreadLocal r3 = new java.lang.ThreadLocal
            r3.<init>()
            r2.f53925d = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v20.g3.<init>(zz.g, zz.d):void");
    }

    @Override // kotlinx.coroutines.internal.d0, v20.a
    protected void W0(Object obj) {
        vz.p<zz.g, Object> pVar = this.f53925d.get();
        if (pVar != null) {
            kotlinx.coroutines.internal.j0.a(pVar.a(), pVar.b());
            this.f53925d.set(null);
        }
        Object a11 = f0.a(obj, this.f35453c);
        zz.d<T> dVar = this.f35453c;
        zz.g context = dVar.getContext();
        Object c11 = kotlinx.coroutines.internal.j0.c(context, null);
        g3<?> g11 = c11 != kotlinx.coroutines.internal.j0.f35469a ? i0.g(dVar, context, c11) : null;
        try {
            this.f35453c.resumeWith(a11);
            vz.b0 b0Var = vz.b0.f54756a;
        } finally {
            if (g11 == null || g11.b1()) {
                kotlinx.coroutines.internal.j0.a(context, c11);
            }
        }
    }

    public final boolean b1() {
        if (this.f53925d.get() == null) {
            return false;
        }
        this.f53925d.set(null);
        return true;
    }

    public final void c1(zz.g gVar, Object obj) {
        this.f53925d.set(vz.v.a(gVar, obj));
    }
}