package org.bouncycastle.jce.provider;

import e50.m0;
import f50.g;
import f50.i;
import f50.o;
import i40.a;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.ECPrivateKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPrivateKeySpec;
import java.util.Enumeration;
import k60.b;
import k60.n;
import l60.d;
import l60.e;
import l60.f;
import org.bouncycastle.asn1.j;
import org.bouncycastle.asn1.j0;
import org.bouncycastle.asn1.k;
import org.bouncycastle.asn1.q0;
import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl;
import org.spongycastle.asn1.ASN1Encoding;
import r70.m;
import u50.d0;
import u50.y;
import w40.p;

/* loaded from: classes5.dex */
public class JCEECPrivateKey implements ECPrivateKey, b, n {
    private String algorithm;
    private PKCS12BagAttributeCarrierImpl attrCarrier;

    /* renamed from: d  reason: collision with root package name */
    private BigInteger f43196d;
    private ECParameterSpec ecSpec;
    private j0 publicKey;
    private boolean withCompression;

    protected JCEECPrivateKey() {
        this.algorithm = "EC";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
    }

    public JCEECPrivateKey(String str, ECPrivateKeySpec eCPrivateKeySpec) {
        this.algorithm = "EC";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.algorithm = str;
        this.f43196d = eCPrivateKeySpec.getS();
        this.ecSpec = eCPrivateKeySpec.getParams();
    }

    public JCEECPrivateKey(String str, f fVar) {
        this.algorithm = "EC";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.algorithm = str;
        this.f43196d = fVar.b();
        this.ecSpec = fVar.a() != null ? EC5Util.convertSpec(EC5Util.convertCurve(fVar.a().a(), fVar.a().e()), fVar.a()) : null;
    }

    public JCEECPrivateKey(String str, JCEECPrivateKey jCEECPrivateKey) {
        this.algorithm = "EC";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.algorithm = str;
        this.f43196d = jCEECPrivateKey.f43196d;
        this.ecSpec = jCEECPrivateKey.ecSpec;
        this.withCompression = jCEECPrivateKey.withCompression;
        this.attrCarrier = jCEECPrivateKey.attrCarrier;
        this.publicKey = jCEECPrivateKey.publicKey;
    }

    public JCEECPrivateKey(String str, d0 d0Var) {
        this.algorithm = "EC";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.algorithm = str;
        this.f43196d = d0Var.c();
        this.ecSpec = null;
    }

    public JCEECPrivateKey(String str, d0 d0Var, JCEECPublicKey jCEECPublicKey, ECParameterSpec eCParameterSpec) {
        this.algorithm = "EC";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.algorithm = str;
        this.f43196d = d0Var.c();
        if (eCParameterSpec == null) {
            y b11 = d0Var.b();
            eCParameterSpec = new ECParameterSpec(EC5Util.convertCurve(b11.a(), b11.f()), EC5Util.convertPoint(b11.b()), b11.e(), b11.c().intValue());
        }
        this.ecSpec = eCParameterSpec;
        this.publicKey = getPublicKeyDetails(jCEECPublicKey);
    }

    public JCEECPrivateKey(String str, d0 d0Var, JCEECPublicKey jCEECPublicKey, e eVar) {
        this.algorithm = "EC";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.algorithm = str;
        this.f43196d = d0Var.c();
        if (eVar == null) {
            y b11 = d0Var.b();
            this.ecSpec = new ECParameterSpec(EC5Util.convertCurve(b11.a(), b11.f()), EC5Util.convertPoint(b11.b()), b11.e(), b11.c().intValue());
        } else {
            this.ecSpec = new ECParameterSpec(EC5Util.convertCurve(eVar.a(), eVar.e()), EC5Util.convertPoint(eVar.b()), eVar.d(), eVar.c().intValue());
        }
        this.publicKey = getPublicKeyDetails(jCEECPublicKey);
    }

    public JCEECPrivateKey(ECPrivateKey eCPrivateKey) {
        this.algorithm = "EC";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.f43196d = eCPrivateKey.getS();
        this.algorithm = eCPrivateKey.getAlgorithm();
        this.ecSpec = eCPrivateKey.getParams();
    }

    JCEECPrivateKey(p pVar) {
        this.algorithm = "EC";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        populateFromPrivKeyInfo(pVar);
    }

    private j0 getPublicKeyDetails(JCEECPublicKey jCEECPublicKey) {
        try {
            return m0.h(org.bouncycastle.asn1.n.k(jCEECPublicKey.getEncoded())).i();
        } catch (IOException unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void populateFromPrivKeyInfo(w40.p r11) {
        /*
            r10 = this;
            e50.b r0 = r11.i()
            e40.b r0 = r0.i()
            f50.g r0 = f50.g.e(r0)
            boolean r1 = r0.i()
            if (r1 == 0) goto L72
            org.bouncycastle.asn1.n r0 = r0.f()
            org.bouncycastle.asn1.k r0 = org.bouncycastle.asn1.k.u(r0)
            f50.i r1 = org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.getNamedCurveByOid(r0)
            if (r1 != 0) goto L4b
            u50.y r1 = i40.b.e(r0)
            n60.e r2 = r1.a()
            byte[] r3 = r1.f()
            java.security.spec.EllipticCurve r6 = org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertCurve(r2, r3)
            l60.d r2 = new l60.d
            java.lang.String r5 = i40.b.g(r0)
            n60.i r0 = r1.b()
            java.security.spec.ECPoint r7 = org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertPoint(r0)
            java.math.BigInteger r8 = r1.e()
            java.math.BigInteger r9 = r1.c()
            r4 = r2
            r4.<init>(r5, r6, r7, r8, r9)
            goto La9
        L4b:
            n60.e r2 = r1.e()
            byte[] r3 = r1.k()
            java.security.spec.EllipticCurve r6 = org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertCurve(r2, r3)
            l60.d r2 = new l60.d
            java.lang.String r5 = org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.getCurveName(r0)
            n60.i r0 = r1.f()
            java.security.spec.ECPoint r7 = org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertPoint(r0)
            java.math.BigInteger r8 = r1.j()
            java.math.BigInteger r9 = r1.h()
            r4 = r2
            r4.<init>(r5, r6, r7, r8, r9)
            goto La9
        L72:
            boolean r1 = r0.h()
            if (r1 == 0) goto L7c
            r0 = 0
            r10.ecSpec = r0
            goto Lab
        L7c:
            org.bouncycastle.asn1.n r0 = r0.f()
            f50.i r0 = f50.i.i(r0)
            n60.e r1 = r0.e()
            byte[] r2 = r0.k()
            java.security.spec.EllipticCurve r1 = org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertCurve(r1, r2)
            java.security.spec.ECParameterSpec r2 = new java.security.spec.ECParameterSpec
            n60.i r3 = r0.f()
            java.security.spec.ECPoint r3 = org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertPoint(r3)
            java.math.BigInteger r4 = r0.j()
            java.math.BigInteger r0 = r0.h()
            int r0 = r0.intValue()
            r2.<init>(r1, r3, r4, r0)
        La9:
            r10.ecSpec = r2
        Lab:
            e40.b r11 = r11.n()
            boolean r0 = r11 instanceof org.bouncycastle.asn1.i
            if (r0 == 0) goto Lbe
            org.bouncycastle.asn1.i r11 = org.bouncycastle.asn1.i.p(r11)
            java.math.BigInteger r11 = r11.s()
            r10.f43196d = r11
            goto Ld1
        Lbe:
            y40.b r0 = new y40.b
            org.bouncycastle.asn1.p r11 = (org.bouncycastle.asn1.p) r11
            r0.<init>(r11)
            java.math.BigInteger r11 = r0.e()
            r10.f43196d = r11
            org.bouncycastle.asn1.j0 r11 = r0.h()
            r10.publicKey = r11
        Ld1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.JCEECPrivateKey.populateFromPrivKeyInfo(w40.p):void");
    }

    private void readObject(ObjectInputStream objectInputStream) {
        populateFromPrivKeyInfo(p.f(org.bouncycastle.asn1.n.k((byte[]) objectInputStream.readObject())));
        this.algorithm = (String) objectInputStream.readObject();
        this.withCompression = objectInputStream.readBoolean();
        PKCS12BagAttributeCarrierImpl pKCS12BagAttributeCarrierImpl = new PKCS12BagAttributeCarrierImpl();
        this.attrCarrier = pKCS12BagAttributeCarrierImpl;
        pKCS12BagAttributeCarrierImpl.readObject(objectInputStream);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeObject(getEncoded());
        objectOutputStream.writeObject(this.algorithm);
        objectOutputStream.writeBoolean(this.withCompression);
        this.attrCarrier.writeObject(objectOutputStream);
    }

    e engineGetSpec() {
        ECParameterSpec eCParameterSpec = this.ecSpec;
        return eCParameterSpec != null ? EC5Util.convertSpec(eCParameterSpec) : BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa();
    }

    public boolean equals(Object obj) {
        if (obj instanceof JCEECPrivateKey) {
            JCEECPrivateKey jCEECPrivateKey = (JCEECPrivateKey) obj;
            return getD().equals(jCEECPrivateKey.getD()) && engineGetSpec().equals(jCEECPrivateKey.engineGetSpec());
        }
        return false;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return this.algorithm;
    }

    @Override // k60.n
    public e40.b getBagAttribute(k kVar) {
        return this.attrCarrier.getBagAttribute(kVar);
    }

    @Override // k60.n
    public Enumeration getBagAttributeKeys() {
        return this.attrCarrier.getBagAttributeKeys();
    }

    @Override // k60.b
    public BigInteger getD() {
        return this.f43196d;
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        g gVar;
        ECParameterSpec eCParameterSpec = this.ecSpec;
        if (eCParameterSpec instanceof d) {
            k namedCurveOid = ECUtil.getNamedCurveOid(((d) eCParameterSpec).c());
            if (namedCurveOid == null) {
                namedCurveOid = new k(((d) this.ecSpec).c());
            }
            gVar = new g(namedCurveOid);
        } else if (eCParameterSpec == null) {
            gVar = new g((j) q0.f43085a);
        } else {
            n60.e convertCurve = EC5Util.convertCurve(eCParameterSpec.getCurve());
            gVar = new g(new i(convertCurve, new f50.k(EC5Util.convertPoint(convertCurve, this.ecSpec.getGenerator()), this.withCompression), this.ecSpec.getOrder(), BigInteger.valueOf(this.ecSpec.getCofactor()), this.ecSpec.getCurve().getSeed()));
        }
        y40.b bVar = this.publicKey != null ? new y40.b(getS(), this.publicKey, gVar) : new y40.b(getS(), gVar);
        try {
            return (this.algorithm.equals("ECGOST3410") ? new p(new e50.b(a.f29850m, gVar.toASN1Primitive()), bVar.toASN1Primitive()) : new p(new e50.b(o.f25891h0, gVar.toASN1Primitive()), bVar.toASN1Primitive())).d(ASN1Encoding.DER);
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
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

    @Override // java.security.interfaces.ECPrivateKey
    public BigInteger getS() {
        return this.f43196d;
    }

    public int hashCode() {
        return getD().hashCode() ^ engineGetSpec().hashCode();
    }

    @Override // k60.n
    public void setBagAttribute(k kVar, e40.b bVar) {
        this.attrCarrier.setBagAttribute(kVar, bVar);
    }

    public void setPointFormat(String str) {
        this.withCompression = !"UNCOMPRESSED".equalsIgnoreCase(str);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String d11 = m.d();
        stringBuffer.append("EC Private Key");
        stringBuffer.append(d11);
        stringBuffer.append("             S: ");
        stringBuffer.append(this.f43196d.toString(16));
        stringBuffer.append(d11);
        return stringBuffer.toString();
    }
}