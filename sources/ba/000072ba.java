package h60;

import java.security.spec.AlgorithmParameterSpec;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public class i implements AlgorithmParameterSpec {

    /* renamed from: c  reason: collision with root package name */
    private static Map f28939c;

    /* renamed from: a  reason: collision with root package name */
    private byte[] f28940a;

    /* renamed from: b  reason: collision with root package name */
    private byte[] f28941b;

    static {
        HashMap hashMap = new HashMap();
        f28939c = hashMap;
        hashMap.put(i40.a.f29845h, "E-A");
        f28939c.put(i40.a.f29846i, "E-B");
        f28939c.put(i40.a.f29847j, "E-C");
        f28939c.put(i40.a.f29848k, "E-D");
        f28939c.put(x40.a.f57046t, "Param-Z");
    }

    public i(String str) {
        this.f28940a = null;
        this.f28941b = null;
        this.f28941b = l50.u.f(str);
    }

    public i(org.bouncycastle.asn1.k kVar, byte[] bArr) {
        this(b(kVar));
        this.f28940a = org.bouncycastle.util.a.h(bArr);
    }

    public i(byte[] bArr) {
        this.f28940a = null;
        this.f28941b = null;
        byte[] bArr2 = new byte[bArr.length];
        this.f28941b = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
    }

    public i(byte[] bArr, byte[] bArr2) {
        this(bArr);
        byte[] bArr3 = new byte[bArr2.length];
        this.f28940a = bArr3;
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
    }

    private static String b(org.bouncycastle.asn1.k kVar) {
        String str = (String) f28939c.get(kVar);
        if (str != null) {
            return str;
        }
        throw new IllegalArgumentException("unknown OID: " + kVar);
    }

    public byte[] a() {
        return org.bouncycastle.util.a.h(this.f28940a);
    }

    public byte[] c() {
        return org.bouncycastle.util.a.h(this.f28941b);
    }

    public byte[] d() {
        return org.bouncycastle.util.a.h(this.f28941b);
    }
}