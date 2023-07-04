package l60;

import java.security.spec.AlgorithmParameterSpec;

/* loaded from: classes5.dex */
public class l implements AlgorithmParameterSpec, k60.h {

    /* renamed from: a  reason: collision with root package name */
    private n f37073a;

    /* renamed from: b  reason: collision with root package name */
    private String f37074b;

    /* renamed from: c  reason: collision with root package name */
    private String f37075c;

    /* renamed from: d  reason: collision with root package name */
    private String f37076d;

    public l(String str) {
        this(str, i40.a.f29853p.t(), null);
    }

    public l(String str, String str2) {
        this(str, str2, null);
    }

    public l(String str, String str2, String str3) {
        i40.e eVar;
        try {
            eVar = i40.d.a(new org.bouncycastle.asn1.k(str));
        } catch (IllegalArgumentException unused) {
            org.bouncycastle.asn1.k b11 = i40.d.b(str);
            if (b11 != null) {
                str = b11.t();
                eVar = i40.d.a(b11);
            } else {
                eVar = null;
            }
        }
        if (eVar == null) {
            throw new IllegalArgumentException("no key parameter set for passed in name/OID.");
        }
        this.f37073a = new n(eVar.f(), eVar.h(), eVar.e());
        this.f37074b = str;
        this.f37075c = str2;
        this.f37076d = str3;
    }

    public l(n nVar) {
        this.f37073a = nVar;
        this.f37075c = i40.a.f29853p.t();
        this.f37076d = null;
    }

    public static l a(i40.f fVar) {
        return fVar.f() != null ? new l(fVar.i().t(), fVar.e().t(), fVar.f().t()) : new l(fVar.i().t(), fVar.e().t());
    }

    public boolean equals(Object obj) {
        if (obj instanceof l) {
            l lVar = (l) obj;
            if (this.f37073a.equals(lVar.f37073a) && this.f37075c.equals(lVar.f37075c)) {
                String str = this.f37076d;
                String str2 = lVar.f37076d;
                return str == str2 || (str != null && str.equals(str2));
            }
            return false;
        }
        return false;
    }

    @Override // k60.h
    public String getDigestParamSetOID() {
        return this.f37075c;
    }

    @Override // k60.h
    public String getEncryptionParamSetOID() {
        return this.f37076d;
    }

    @Override // k60.h
    public String getPublicKeyParamSetOID() {
        return this.f37074b;
    }

    @Override // k60.h
    public n getPublicKeyParameters() {
        return this.f37073a;
    }

    public int hashCode() {
        int hashCode = this.f37073a.hashCode() ^ this.f37075c.hashCode();
        String str = this.f37076d;
        return hashCode ^ (str != null ? str.hashCode() : 0);
    }
}