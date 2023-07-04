package h60;

import java.security.spec.AlgorithmParameterSpec;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public class j implements AlgorithmParameterSpec {

    /* renamed from: c  reason: collision with root package name */
    private static Map f28942c;

    /* renamed from: a  reason: collision with root package name */
    private byte[] f28943a;

    /* renamed from: b  reason: collision with root package name */
    private byte[] f28944b;

    static {
        HashMap hashMap = new HashMap();
        f28942c = hashMap;
        hashMap.put(i40.a.f29845h, "E-A");
        f28942c.put(i40.a.f29846i, "E-B");
        f28942c.put(i40.a.f29847j, "E-C");
        f28942c.put(i40.a.f29848k, "E-D");
        f28942c.put(x40.a.f57046t, "Param-Z");
    }

    public byte[] a() {
        return org.bouncycastle.util.a.h(this.f28944b);
    }

    public byte[] b() {
        return org.bouncycastle.util.a.h(this.f28943a);
    }
}