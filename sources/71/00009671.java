package org.bouncycastle.jce.provider;

import e50.b;
import e50.m0;
import f50.o;
import i40.a;
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
import n60.i;
import org.bouncycastle.asn1.j;
import org.bouncycastle.asn1.j0;
import org.bouncycastle.asn1.k;
import org.bouncycastle.asn1.l;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.q0;
import org.bouncycastle.asn1.s0;
import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil;
import r70.m;
import u50.e0;
import u50.y;

/* loaded from: classes5.dex */
public class JCEECPublicKey implements ECPublicKey, c {
    private String algorithm;
    private ECParameterSpec ecSpec;
    private f gostParams;

    /* renamed from: q  reason: collision with root package name */
    private i f43197q;
    private boolean withCompression;

    JCEECPublicKey(m0 m0Var) {
        this.algorithm = "EC";
        populateFromPubKeyInfo(m0Var);
    }

    public JCEECPublicKey(String str, ECPublicKeySpec eCPublicKeySpec) {
        this.algorithm = "EC";
        this.algorithm = str;
        ECParameterSpec params = eCPublicKeySpec.getParams();
        this.ecSpec = params;
        this.f43197q = EC5Util.convertPoint(params, eCPublicKeySpec.getW());
    }

    public JCEECPublicKey(String str, g gVar) {
        ECParameterSpec eCParameterSpec;
        this.algorithm = "EC";
        this.algorithm = str;
        this.f43197q = gVar.b();
        if (gVar.a() != null) {
            eCParameterSpec = EC5Util.convertSpec(EC5Util.convertCurve(gVar.a().a(), gVar.a().e()), gVar.a());
        } else {
            if (this.f43197q.i() == null) {
                this.f43197q = BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa().a().g(this.f43197q.f().t(), this.f43197q.g().t());
            }
            eCParameterSpec = null;
        }
        this.ecSpec = eCParameterSpec;
    }

    public JCEECPublicKey(String str, JCEECPublicKey jCEECPublicKey) {
        this.algorithm = "EC";
        this.algorithm = str;
        this.f43197q = jCEECPublicKey.f43197q;
        this.ecSpec = jCEECPublicKey.ecSpec;
        this.withCompression = jCEECPublicKey.withCompression;
        this.gostParams = jCEECPublicKey.gostParams;
    }

    public JCEECPublicKey(String str, e0 e0Var) {
        this.algorithm = "EC";
        this.algorithm = str;
        this.f43197q = e0Var.c();
        this.ecSpec = null;
    }

    public JCEECPublicKey(String str, e0 e0Var, ECParameterSpec eCParameterSpec) {
        this.algorithm = "EC";
        y b11 = e0Var.b();
        this.algorithm = str;
        this.f43197q = e0Var.c();
        if (eCParameterSpec == null) {
            this.ecSpec = createSpec(EC5Util.convertCurve(b11.a(), b11.f()), b11);
        } else {
            this.ecSpec = eCParameterSpec;
        }
    }

    public JCEECPublicKey(String str, e0 e0Var, e eVar) {
        this.algorithm = "EC";
        y b11 = e0Var.b();
        this.algorithm = str;
        this.f43197q = e0Var.c();
        this.ecSpec = eVar == null ? createSpec(EC5Util.convertCurve(b11.a(), b11.f()), b11) : EC5Util.convertSpec(EC5Util.convertCurve(eVar.a(), eVar.e()), eVar);
    }

    public JCEECPublicKey(ECPublicKey eCPublicKey) {
        this.algorithm = "EC";
        this.algorithm = eCPublicKey.getAlgorithm();
        ECParameterSpec params = eCPublicKey.getParams();
        this.ecSpec = params;
        this.f43197q = EC5Util.convertPoint(params, eCPublicKey.getW());
    }

    private ECParameterSpec createSpec(EllipticCurve ellipticCurve, y yVar) {
        return new ECParameterSpec(ellipticCurve, EC5Util.convertPoint(yVar.b()), yVar.e(), yVar.c().intValue());
    }

    private void extractBytes(byte[] bArr, int i11, BigInteger bigInteger) {
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray.length < 32) {
            byte[] bArr2 = new byte[32];
            System.arraycopy(byteArray, 0, bArr2, 32 - byteArray.length, byteArray.length);
            byteArray = bArr2;
        }
        for (int i12 = 0; i12 != 32; i12++) {
            bArr[i11 + i12] = byteArray[(byteArray.length - 1) - i12];
        }
    }

    private void populateFromPubKeyInfo(m0 m0Var) {
        n60.e e11;
        ECParameterSpec eCParameterSpec;
        byte[] q11;
        l s0Var;
        b e12 = m0Var.e();
        if (e12.e().j(a.f29850m)) {
            j0 i11 = m0Var.i();
            this.algorithm = "ECGOST3410";
            try {
                byte[] r11 = ((l) n.k(i11.q())).r();
                byte[] bArr = new byte[65];
                bArr[0] = 4;
                for (int i12 = 1; i12 <= 32; i12++) {
                    bArr[i12] = r11[32 - i12];
                    bArr[i12 + 32] = r11[64 - i12];
                }
                f h11 = f.h(e12.i());
                this.gostParams = h11;
                l60.c a11 = j60.a.a(i40.b.g(h11.i()));
                n60.e a12 = a11.a();
                EllipticCurve convertCurve = EC5Util.convertCurve(a12, a11.e());
                this.f43197q = a12.j(bArr);
                this.ecSpec = new d(i40.b.g(this.gostParams.i()), convertCurve, EC5Util.convertPoint(a11.b()), a11.d(), a11.c());
                return;
            } catch (IOException unused) {
                throw new IllegalArgumentException("error recovering public key");
            }
        }
        f50.g e13 = f50.g.e(e12.i());
        if (e13.i()) {
            k kVar = (k) e13.f();
            f50.i namedCurveByOid = ECUtil.getNamedCurveByOid(kVar);
            e11 = namedCurveByOid.e();
            eCParameterSpec = new d(ECUtil.getCurveName(kVar), EC5Util.convertCurve(e11, namedCurveByOid.k()), EC5Util.convertPoint(namedCurveByOid.f()), namedCurveByOid.j(), namedCurveByOid.h());
        } else if (e13.h()) {
            this.ecSpec = null;
            e11 = BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa().a();
            q11 = m0Var.i().q();
            s0Var = new s0(q11);
            if (q11[0] == 4 && q11[1] == q11.length - 2 && ((q11[2] == 2 || q11[2] == 3) && new f50.n().a(e11) >= q11.length - 3)) {
                try {
                    s0Var = (l) n.k(q11);
                } catch (IOException unused2) {
                    throw new IllegalArgumentException("error recovering public key");
                }
            }
            this.f43197q = new f50.k(e11, s0Var).e();
        } else {
            f50.i i13 = f50.i.i(e13.f());
            e11 = i13.e();
            eCParameterSpec = new ECParameterSpec(EC5Util.convertCurve(e11, i13.k()), EC5Util.convertPoint(i13.f()), i13.j(), i13.h().intValue());
        }
        this.ecSpec = eCParameterSpec;
        q11 = m0Var.i().q();
        s0Var = new s0(q11);
        if (q11[0] == 4) {
            s0Var = (l) n.k(q11);
        }
        this.f43197q = new f50.k(e11, s0Var).e();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        populateFromPubKeyInfo(m0.h(n.k((byte[]) objectInputStream.readObject())));
        this.algorithm = (String) objectInputStream.readObject();
        this.withCompression = objectInputStream.readBoolean();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeObject(getEncoded());
        objectOutputStream.writeObject(this.algorithm);
        objectOutputStream.writeBoolean(this.withCompression);
    }

    public i engineGetQ() {
        return this.f43197q;
    }

    e engineGetSpec() {
        ECParameterSpec eCParameterSpec = this.ecSpec;
        return eCParameterSpec != null ? EC5Util.convertSpec(eCParameterSpec) : BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa();
    }

    public boolean equals(Object obj) {
        if (obj instanceof JCEECPublicKey) {
            JCEECPublicKey jCEECPublicKey = (JCEECPublicKey) obj;
            return engineGetQ().e(jCEECPublicKey.engineGetQ()) && engineGetSpec().equals(jCEECPublicKey.engineGetSpec());
        }
        return false;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return this.algorithm;
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        f50.g gVar;
        m0 m0Var;
        e40.c gVar2;
        if (this.algorithm.equals("ECGOST3410")) {
            e40.c cVar = this.gostParams;
            if (cVar == null) {
                ECParameterSpec eCParameterSpec = this.ecSpec;
                if (eCParameterSpec instanceof d) {
                    gVar2 = new f(i40.b.i(((d) eCParameterSpec).c()), a.f29853p);
                } else {
                    n60.e convertCurve = EC5Util.convertCurve(eCParameterSpec.getCurve());
                    gVar2 = new f50.g(new f50.i(convertCurve, new f50.k(EC5Util.convertPoint(convertCurve, this.ecSpec.getGenerator()), this.withCompression), this.ecSpec.getOrder(), BigInteger.valueOf(this.ecSpec.getCofactor()), this.ecSpec.getCurve().getSeed()));
                }
                cVar = gVar2;
            }
            BigInteger t11 = this.f43197q.f().t();
            BigInteger t12 = this.f43197q.g().t();
            byte[] bArr = new byte[64];
            extractBytes(bArr, 0, t11);
            extractBytes(bArr, 32, t12);
            try {
                m0Var = new m0(new b(a.f29850m, cVar), new s0(bArr));
            } catch (IOException unused) {
                return null;
            }
        } else {
            ECParameterSpec eCParameterSpec2 = this.ecSpec;
            if (eCParameterSpec2 instanceof d) {
                k namedCurveOid = ECUtil.getNamedCurveOid(((d) eCParameterSpec2).c());
                if (namedCurveOid == null) {
                    namedCurveOid = new k(((d) this.ecSpec).c());
                }
                gVar = new f50.g(namedCurveOid);
            } else if (eCParameterSpec2 == null) {
                gVar = new f50.g((j) q0.f43085a);
            } else {
                n60.e convertCurve2 = EC5Util.convertCurve(eCParameterSpec2.getCurve());
                gVar = new f50.g(new f50.i(convertCurve2, new f50.k(EC5Util.convertPoint(convertCurve2, this.ecSpec.getGenerator()), this.withCompression), this.ecSpec.getOrder(), BigInteger.valueOf(this.ecSpec.getCofactor()), this.ecSpec.getCurve().getSeed()));
            }
            m0Var = new m0(new b(o.f25891h0, gVar), getQ().l(this.withCompression));
        }
        return KeyUtil.getEncodedSubjectPublicKeyInfo(m0Var);
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
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
    public i getQ() {
        return this.ecSpec == null ? this.f43197q.k() : this.f43197q;
    }

    @Override // java.security.interfaces.ECPublicKey
    public ECPoint getW() {
        return EC5Util.convertPoint(this.f43197q);
    }

    public int hashCode() {
        return engineGetQ().hashCode() ^ engineGetSpec().hashCode();
    }

    public void setPointFormat(String str) {
        this.withCompression = !"UNCOMPRESSED".equalsIgnoreCase(str);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String d11 = m.d();
        stringBuffer.append("EC Public Key");
        stringBuffer.append(d11);
        stringBuffer.append("            X: ");
        stringBuffer.append(this.f43197q.f().t().toString(16));
        stringBuffer.append(d11);
        stringBuffer.append("            Y: ");
        stringBuffer.append(this.f43197q.g().t().toString(16));
        stringBuffer.append(d11);
        return stringBuffer.toString();
    }
}