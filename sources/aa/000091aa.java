package org.bouncycastle.jcajce.provider.asymmetric.dstu;

import a50.a;
import a50.b;
import a50.d;
import a50.f;
import e50.m0;
import f50.i;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import k60.c;
import l60.e;
import l60.g;
import n60.e;
import org.bouncycastle.asn1.j0;
import org.bouncycastle.asn1.k;
import org.bouncycastle.asn1.l;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.s0;
import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil;
import org.bouncycastle.jcajce.provider.config.ProviderConfiguration;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import u50.e0;
import u50.y;

/* loaded from: classes5.dex */
public class BCDSTU4145PublicKey implements ECPublicKey, c {
    static final long serialVersionUID = 7026240464295649314L;
    private String algorithm;
    private transient d dstuParams;
    private transient e0 ecPublicKey;
    private transient ECParameterSpec ecSpec;
    private boolean withCompression;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BCDSTU4145PublicKey(m0 m0Var) {
        this.algorithm = "DSTU4145";
        populateFromPubKeyInfo(m0Var);
    }

    public BCDSTU4145PublicKey(String str, e0 e0Var) {
        this.algorithm = "DSTU4145";
        this.algorithm = str;
        this.ecPublicKey = e0Var;
        this.ecSpec = null;
    }

    public BCDSTU4145PublicKey(String str, e0 e0Var, ECParameterSpec eCParameterSpec) {
        this.algorithm = "DSTU4145";
        y b11 = e0Var.b();
        this.algorithm = str;
        this.ecPublicKey = e0Var;
        if (eCParameterSpec == null) {
            this.ecSpec = createSpec(EC5Util.convertCurve(b11.a(), b11.f()), b11);
        } else {
            this.ecSpec = eCParameterSpec;
        }
    }

    public BCDSTU4145PublicKey(String str, e0 e0Var, e eVar) {
        this.algorithm = "DSTU4145";
        y b11 = e0Var.b();
        this.algorithm = str;
        this.ecSpec = eVar == null ? createSpec(EC5Util.convertCurve(b11.a(), b11.f()), b11) : EC5Util.convertSpec(EC5Util.convertCurve(eVar.a(), eVar.e()), eVar);
        this.ecPublicKey = e0Var;
    }

    public BCDSTU4145PublicKey(ECPublicKeySpec eCPublicKeySpec) {
        this.algorithm = "DSTU4145";
        ECParameterSpec params = eCPublicKeySpec.getParams();
        this.ecSpec = params;
        this.ecPublicKey = new e0(EC5Util.convertPoint(params, eCPublicKeySpec.getW()), EC5Util.getDomainParameters(null, this.ecSpec));
    }

    public BCDSTU4145PublicKey(g gVar, ProviderConfiguration providerConfiguration) {
        this.algorithm = "DSTU4145";
        if (gVar.a() == null) {
            this.ecPublicKey = new e0(providerConfiguration.getEcImplicitlyCa().a().g(gVar.b().f().t(), gVar.b().g().t()), EC5Util.getDomainParameters(providerConfiguration, null));
            this.ecSpec = null;
            return;
        }
        EllipticCurve convertCurve = EC5Util.convertCurve(gVar.a().a(), gVar.a().e());
        this.ecPublicKey = new e0(gVar.b(), ECUtil.getDomainParameters(providerConfiguration, gVar.a()));
        this.ecSpec = EC5Util.convertSpec(convertCurve, gVar.a());
    }

    public BCDSTU4145PublicKey(BCDSTU4145PublicKey bCDSTU4145PublicKey) {
        this.algorithm = "DSTU4145";
        this.ecPublicKey = bCDSTU4145PublicKey.ecPublicKey;
        this.ecSpec = bCDSTU4145PublicKey.ecSpec;
        this.withCompression = bCDSTU4145PublicKey.withCompression;
        this.dstuParams = bCDSTU4145PublicKey.dstuParams;
    }

    private ECParameterSpec createSpec(EllipticCurve ellipticCurve, y yVar) {
        return new ECParameterSpec(ellipticCurve, EC5Util.convertPoint(yVar.b()), yVar.e(), yVar.c().intValue());
    }

    private void populateFromPubKeyInfo(m0 m0Var) {
        e eVar;
        i iVar;
        ECParameterSpec convertToSpec;
        j0 i11 = m0Var.i();
        this.algorithm = "DSTU4145";
        try {
            byte[] r11 = ((l) n.k(i11.q())).r();
            k e11 = m0Var.e().e();
            k kVar = f.f253b;
            if (e11.j(kVar)) {
                reverseBytes(r11);
            }
            p p11 = p.p(m0Var.e().i());
            if (p11.r(0) instanceof org.bouncycastle.asn1.i) {
                iVar = i.i(p11);
                eVar = new e(iVar.e(), iVar.f(), iVar.j(), iVar.h(), iVar.k());
            } else {
                d i12 = d.i(p11);
                this.dstuParams = i12;
                if (i12.k()) {
                    k j11 = this.dstuParams.j();
                    y a11 = a50.c.a(j11);
                    eVar = new l60.c(j11.t(), a11.a(), a11.b(), a11.e(), a11.c(), a11.f());
                } else {
                    b h11 = this.dstuParams.h();
                    byte[] f11 = h11.f();
                    if (m0Var.e().e().j(kVar)) {
                        reverseBytes(f11);
                    }
                    a h12 = h11.h();
                    e.C0796e c0796e = new e.C0796e(h12.j(), h12.f(), h12.h(), h12.i(), h11.e(), new BigInteger(1, f11));
                    byte[] i13 = h11.i();
                    if (m0Var.e().e().j(kVar)) {
                        reverseBytes(i13);
                    }
                    eVar = new l60.e(c0796e, a50.e.a(c0796e, i13), h11.k());
                }
                iVar = null;
            }
            n60.e a12 = eVar.a();
            EllipticCurve convertCurve = EC5Util.convertCurve(a12, eVar.e());
            if (this.dstuParams != null) {
                ECPoint convertPoint = EC5Util.convertPoint(eVar.b());
                convertToSpec = this.dstuParams.k() ? new l60.d(this.dstuParams.j().t(), convertCurve, convertPoint, eVar.d(), eVar.c()) : new ECParameterSpec(convertCurve, convertPoint, eVar.d(), eVar.c().intValue());
            } else {
                convertToSpec = EC5Util.convertToSpec(iVar);
            }
            this.ecSpec = convertToSpec;
            this.ecPublicKey = new e0(a50.e.a(a12, r11), EC5Util.getDomainParameters(null, this.ecSpec));
        } catch (IOException unused) {
            throw new IllegalArgumentException("error recovering public key");
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        populateFromPubKeyInfo(m0.h(n.k((byte[]) objectInputStream.readObject())));
    }

    private void reverseBytes(byte[] bArr) {
        for (int i11 = 0; i11 < bArr.length / 2; i11++) {
            byte b11 = bArr[i11];
            bArr[i11] = bArr[(bArr.length - 1) - i11];
            bArr[(bArr.length - 1) - i11] = b11;
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e0 engineGetKeyParameters() {
        return this.ecPublicKey;
    }

    l60.e engineGetSpec() {
        ECParameterSpec eCParameterSpec = this.ecSpec;
        return eCParameterSpec != null ? EC5Util.convertSpec(eCParameterSpec) : BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa();
    }

    public boolean equals(Object obj) {
        if (obj instanceof BCDSTU4145PublicKey) {
            BCDSTU4145PublicKey bCDSTU4145PublicKey = (BCDSTU4145PublicKey) obj;
            return this.ecPublicKey.c().e(bCDSTU4145PublicKey.ecPublicKey.c()) && engineGetSpec().equals(bCDSTU4145PublicKey.engineGetSpec());
        }
        return false;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return this.algorithm;
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        e40.c cVar = this.dstuParams;
        if (cVar == null) {
            ECParameterSpec eCParameterSpec = this.ecSpec;
            if (eCParameterSpec instanceof l60.d) {
                cVar = new d(new k(((l60.d) this.ecSpec).c()));
            } else {
                n60.e convertCurve = EC5Util.convertCurve(eCParameterSpec.getCurve());
                cVar = new f50.g(new i(convertCurve, new f50.k(EC5Util.convertPoint(convertCurve, this.ecSpec.getGenerator()), this.withCompression), this.ecSpec.getOrder(), BigInteger.valueOf(this.ecSpec.getCofactor()), this.ecSpec.getCurve().getSeed()));
            }
        }
        try {
            return KeyUtil.getEncodedSubjectPublicKeyInfo(new m0(new e50.b(f.f254c, cVar), new s0(a50.e.b(this.ecPublicKey.c()))));
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    @Override // k60.a
    public l60.e getParameters() {
        ECParameterSpec eCParameterSpec = this.ecSpec;
        if (eCParameterSpec == null) {
            return null;
        }
        return EC5Util.convertSpec(eCParameterSpec);
    }

    @Override // java.security.interfaces.ECKey
    public ECParameterSpec getParams() {
        return this.ecSpec;
    }

    @Override // k60.c
    public n60.i getQ() {
        n60.i c11 = this.ecPublicKey.c();
        return this.ecSpec == null ? c11.k() : c11;
    }

    public byte[] getSbox() {
        d dVar = this.dstuParams;
        return dVar != null ? dVar.e() : d.f();
    }

    @Override // java.security.interfaces.ECPublicKey
    public ECPoint getW() {
        return EC5Util.convertPoint(this.ecPublicKey.c());
    }

    public int hashCode() {
        return this.ecPublicKey.c().hashCode() ^ engineGetSpec().hashCode();
    }

    public void setPointFormat(String str) {
        this.withCompression = !"UNCOMPRESSED".equalsIgnoreCase(str);
    }

    public String toString() {
        return ECUtil.publicKeyToString(this.algorithm, this.ecPublicKey.c(), engineGetSpec());
    }
}