package org.bouncycastle.jcajce.provider.asymmetric.ecgost12;

import e50.m0;
import f50.i;
import i40.b;
import i40.f;
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
import l60.d;
import l60.e;
import l60.g;
import org.bouncycastle.asn1.j0;
import org.bouncycastle.asn1.k;
import org.bouncycastle.asn1.l;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.s0;
import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil;
import org.bouncycastle.jcajce.provider.config.ProviderConfiguration;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import u50.e0;
import u50.y;
import u50.z;
import x40.a;

/* loaded from: classes5.dex */
public class BCECGOST3410_2012PublicKey implements ECPublicKey, c {
    static final long serialVersionUID = 7026240464295649314L;
    private String algorithm;
    private transient e0 ecPublicKey;
    private transient ECParameterSpec ecSpec;
    private transient f gostParams;
    private boolean withCompression;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BCECGOST3410_2012PublicKey(m0 m0Var) {
        this.algorithm = "ECGOST3410-2012";
        populateFromPubKeyInfo(m0Var);
    }

    public BCECGOST3410_2012PublicKey(String str, e0 e0Var) {
        this.algorithm = "ECGOST3410-2012";
        this.algorithm = str;
        this.ecPublicKey = e0Var;
        this.ecSpec = null;
    }

    public BCECGOST3410_2012PublicKey(String str, e0 e0Var, ECParameterSpec eCParameterSpec) {
        this.algorithm = "ECGOST3410-2012";
        y b11 = e0Var.b();
        this.algorithm = str;
        this.ecPublicKey = e0Var;
        if (b11 instanceof z) {
            z zVar = (z) b11;
            this.gostParams = new f(zVar.m(), zVar.k(), zVar.l());
        }
        if (eCParameterSpec == null) {
            this.ecSpec = createSpec(EC5Util.convertCurve(b11.a(), b11.f()), b11);
        } else {
            this.ecSpec = eCParameterSpec;
        }
    }

    public BCECGOST3410_2012PublicKey(String str, e0 e0Var, e eVar) {
        this.algorithm = "ECGOST3410-2012";
        y b11 = e0Var.b();
        this.algorithm = str;
        this.ecPublicKey = e0Var;
        this.ecSpec = eVar == null ? createSpec(EC5Util.convertCurve(b11.a(), b11.f()), b11) : EC5Util.convertSpec(EC5Util.convertCurve(eVar.a(), eVar.e()), eVar);
    }

    public BCECGOST3410_2012PublicKey(ECPublicKey eCPublicKey) {
        this.algorithm = "ECGOST3410-2012";
        this.algorithm = eCPublicKey.getAlgorithm();
        ECParameterSpec params = eCPublicKey.getParams();
        this.ecSpec = params;
        this.ecPublicKey = new e0(EC5Util.convertPoint(params, eCPublicKey.getW()), EC5Util.getDomainParameters(null, eCPublicKey.getParams()));
    }

    public BCECGOST3410_2012PublicKey(ECPublicKeySpec eCPublicKeySpec) {
        this.algorithm = "ECGOST3410-2012";
        ECParameterSpec params = eCPublicKeySpec.getParams();
        this.ecSpec = params;
        this.ecPublicKey = new e0(EC5Util.convertPoint(params, eCPublicKeySpec.getW()), EC5Util.getDomainParameters(null, eCPublicKeySpec.getParams()));
    }

    public BCECGOST3410_2012PublicKey(g gVar, ProviderConfiguration providerConfiguration) {
        this.algorithm = "ECGOST3410-2012";
        if (gVar.a() == null) {
            this.ecPublicKey = new e0(providerConfiguration.getEcImplicitlyCa().a().g(gVar.b().f().t(), gVar.b().g().t()), EC5Util.getDomainParameters(providerConfiguration, null));
            this.ecSpec = null;
            return;
        }
        EllipticCurve convertCurve = EC5Util.convertCurve(gVar.a().a(), gVar.a().e());
        this.ecPublicKey = new e0(gVar.b(), ECUtil.getDomainParameters(providerConfiguration, gVar.a()));
        this.ecSpec = EC5Util.convertSpec(convertCurve, gVar.a());
    }

    public BCECGOST3410_2012PublicKey(BCECGOST3410_2012PublicKey bCECGOST3410_2012PublicKey) {
        this.algorithm = "ECGOST3410-2012";
        this.ecPublicKey = bCECGOST3410_2012PublicKey.ecPublicKey;
        this.ecSpec = bCECGOST3410_2012PublicKey.ecSpec;
        this.withCompression = bCECGOST3410_2012PublicKey.withCompression;
        this.gostParams = bCECGOST3410_2012PublicKey.gostParams;
    }

    private ECParameterSpec createSpec(EllipticCurve ellipticCurve, y yVar) {
        return new ECParameterSpec(ellipticCurve, EC5Util.convertPoint(yVar.b()), yVar.e(), yVar.c().intValue());
    }

    private void extractBytes(byte[] bArr, int i11, int i12, BigInteger bigInteger) {
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray.length < i11) {
            byte[] bArr2 = new byte[i11];
            System.arraycopy(byteArray, 0, bArr2, i11 - byteArray.length, byteArray.length);
            byteArray = bArr2;
        }
        for (int i13 = 0; i13 != i11; i13++) {
            bArr[i12 + i13] = byteArray[(byteArray.length - 1) - i13];
        }
    }

    private void populateFromPubKeyInfo(m0 m0Var) {
        k e11 = m0Var.e().e();
        j0 i11 = m0Var.i();
        this.algorithm = "ECGOST3410-2012";
        try {
            byte[] r11 = ((l) n.k(i11.q())).r();
            int i12 = e11.j(a.f57034h) ? 64 : 32;
            int i13 = i12 * 2;
            byte[] bArr = new byte[i13 + 1];
            bArr[0] = 4;
            for (int i14 = 1; i14 <= i12; i14++) {
                bArr[i14] = r11[i12 - i14];
                bArr[i14 + i12] = r11[i13 - i14];
            }
            f h11 = f.h(m0Var.e().i());
            this.gostParams = h11;
            l60.c a11 = j60.a.a(b.g(h11.i()));
            n60.e a12 = a11.a();
            EllipticCurve convertCurve = EC5Util.convertCurve(a12, a11.e());
            this.ecPublicKey = new e0(a12.j(bArr), ECUtil.getDomainParameters((ProviderConfiguration) null, a11));
            this.ecSpec = new d(b.g(this.gostParams.i()), convertCurve, EC5Util.convertPoint(a11.b()), a11.d(), a11.c());
        } catch (IOException unused) {
            throw new IllegalArgumentException("error recovering public key");
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        populateFromPubKeyInfo(m0.h(n.k((byte[]) objectInputStream.readObject())));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e0 engineGetKeyParameters() {
        return this.ecPublicKey;
    }

    e engineGetSpec() {
        ECParameterSpec eCParameterSpec = this.ecSpec;
        return eCParameterSpec != null ? EC5Util.convertSpec(eCParameterSpec) : BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa();
    }

    public boolean equals(Object obj) {
        if (obj instanceof BCECGOST3410_2012PublicKey) {
            BCECGOST3410_2012PublicKey bCECGOST3410_2012PublicKey = (BCECGOST3410_2012PublicKey) obj;
            return this.ecPublicKey.c().e(bCECGOST3410_2012PublicKey.ecPublicKey.c()) && engineGetSpec().equals(bCECGOST3410_2012PublicKey.engineGetSpec());
        }
        return false;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return this.algorithm;
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        int i11;
        k kVar;
        e40.c gVar;
        BigInteger t11 = this.ecPublicKey.c().f().t();
        BigInteger t12 = this.ecPublicKey.c().g().t();
        boolean z11 = t11.bitLength() > 256;
        e40.c gostParams = getGostParams();
        if (gostParams == null) {
            ECParameterSpec eCParameterSpec = this.ecSpec;
            if (eCParameterSpec instanceof d) {
                k i12 = b.i(((d) eCParameterSpec).c());
                gVar = z11 ? new f(i12, a.f57030d) : new f(i12, a.f57029c);
            } else {
                n60.e convertCurve = EC5Util.convertCurve(eCParameterSpec.getCurve());
                gVar = new f50.g(new i(convertCurve, new f50.k(EC5Util.convertPoint(convertCurve, this.ecSpec.getGenerator()), this.withCompression), this.ecSpec.getOrder(), BigInteger.valueOf(this.ecSpec.getCofactor()), this.ecSpec.getCurve().getSeed()));
            }
            gostParams = gVar;
        }
        int i13 = 64;
        if (z11) {
            kVar = a.f57034h;
            i13 = 128;
            i11 = 128;
        } else {
            i11 = 32;
            kVar = a.f57033g;
        }
        byte[] bArr = new byte[i13];
        int i14 = i13 / 2;
        extractBytes(bArr, i14, 0, t11);
        extractBytes(bArr, i14, i11, t12);
        try {
            return KeyUtil.getEncodedSubjectPublicKeyInfo(new m0(new e50.b(kVar, gostParams), new s0(bArr)));
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    public f getGostParams() {
        if (this.gostParams == null && (this.ecSpec instanceof d)) {
            this.gostParams = this.ecPublicKey.c().f().t().bitLength() > 256 ? new f(b.i(((d) this.ecSpec).c()), a.f57030d) : new f(b.i(((d) this.ecSpec).c()), a.f57029c);
        }
        return this.gostParams;
    }

    @Override // k60.a
    public e getParameters() {
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
        return this.ecSpec == null ? this.ecPublicKey.c().k() : this.ecPublicKey.c();
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