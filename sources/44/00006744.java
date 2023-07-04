package e50;

import java.math.BigInteger;
import java.util.Hashtable;

/* loaded from: classes5.dex */
public class m extends e40.c {

    /* renamed from: b  reason: collision with root package name */
    private static final String[] f24725b = {"unspecified", "keyCompromise", "cACompromise", "affiliationChanged", "superseded", "cessationOfOperation", "certificateHold", "unknown", "removeFromCRL", "privilegeWithdrawn", "aACompromise"};

    /* renamed from: c  reason: collision with root package name */
    private static final Hashtable f24726c = new Hashtable();

    /* renamed from: a  reason: collision with root package name */
    private org.bouncycastle.asn1.e f24727a;

    private m(int i11) {
        if (i11 < 0) {
            throw new IllegalArgumentException("Invalid CRL reason : not in (0..MAX)");
        }
        this.f24727a = new org.bouncycastle.asn1.e(i11);
    }

    public static m e(Object obj) {
        if (obj instanceof m) {
            return (m) obj;
        }
        if (obj != null) {
            return h(org.bouncycastle.asn1.e.q(obj).t());
        }
        return null;
    }

    public static m h(int i11) {
        Integer d11 = r70.f.d(i11);
        Hashtable hashtable = f24726c;
        if (!hashtable.containsKey(d11)) {
            hashtable.put(d11, new m(i11));
        }
        return (m) hashtable.get(d11);
    }

    public BigInteger f() {
        return this.f24727a.s();
    }

    @Override // e40.c, e40.b
    public org.bouncycastle.asn1.n toASN1Primitive() {
        return this.f24727a;
    }

    public String toString() {
        int intValue = f().intValue();
        String str = (intValue < 0 || intValue > 10) ? "invalid" : f24725b[intValue];
        return "CRLReason: " + str;
    }
}