package yw;

import ezvcard.property.VCardProperty;
import java.util.HashMap;
import java.util.Map;
import javax.xml.namespace.QName;

/* loaded from: classes5.dex */
public class s0 {

    /* renamed from: b  reason: collision with root package name */
    private static final Map<String, g1<? extends VCardProperty>> f59909b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private static final Map<Class<? extends VCardProperty>, g1<? extends VCardProperty>> f59910c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private static final Map<QName, g1<? extends VCardProperty>> f59911d = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, g1<? extends VCardProperty>> f59912a = new HashMap(0);

    static {
        b(new a());
        b(new b());
        b(new c());
        b(new e());
        b(new g());
        b(new h());
        b(new i());
        b(new j());
        b(new k());
        b(new o());
        b(new r());
        b(new q());
        b(new s());
        b(new t());
        b(new w());
        b(new y());
        b(new z());
        b(new a0());
        b(new b0());
        b(new d0());
        b(new e0());
        b(new f0());
        b(new g0());
        b(new h0());
        b(new j0());
        b(new k0());
        b(new m0());
        b(new n0());
        b(new p0());
        b(new q0());
        b(new r0());
        b(new u0());
        b(new v0());
        b(new w0());
        b(new x0());
        b(new z0());
        b(new a1());
        b(new b1());
        b(new c1());
        b(new d1());
        b(new f1());
        b(new h1());
        b(new f());
        b(new m());
        b(new n());
        b(new p());
        b(new i0());
        b(new x());
        b(new u());
    }

    public s0() {
        new HashMap(0);
        new HashMap(0);
    }

    private static void b(g1<? extends VCardProperty> g1Var) {
        f59909b.put(g1Var.f().toUpperCase(), g1Var);
        f59910c.put(g1Var.e(), g1Var);
        f59911d.put(g1Var.g(), g1Var);
    }

    public g1<? extends VCardProperty> a(String str) {
        String upperCase = str.toUpperCase();
        g1<? extends VCardProperty> g1Var = this.f59912a.get(upperCase);
        return g1Var != null ? g1Var : f59909b.get(upperCase);
    }
}