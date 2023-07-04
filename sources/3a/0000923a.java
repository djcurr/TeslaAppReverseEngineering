package org.bouncycastle.jcajce.provider.asymmetric.ecgost;

import e50.m0;
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
import l60.e;
import l60.f;
import org.bouncycastle.asn1.j0;
import org.bouncycastle.asn1.k;
import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import u50.d0;
import u50.y;
import w40.p;

/* loaded from: classes5.dex */
public class BCECGOST3410PrivateKey implements ECPrivateKey, b, n {
    static final long serialVersionUID = 7245981689601667138L;
    private String algorithm;
    private transient PKCS12BagAttributeCarrierImpl attrCarrier;

    /* renamed from: d  reason: collision with root package name */
    private transient BigInteger f43168d;
    private transient ECParameterSpec ecSpec;
    private transient e40.b gostParams;
    private transient j0 publicKey;
    private boolean withCompression;

    protected BCECGOST3410PrivateKey() {
        this.algorithm = "ECGOST3410";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
    }

    public BCECGOST3410PrivateKey(String str, d0 d0Var) {
        this.algorithm = "ECGOST3410";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.algorithm = str;
        this.f43168d = d0Var.c();
        this.ecSpec = null;
    }

    public BCECGOST3410PrivateKey(String str, d0 d0Var, BCECGOST3410PublicKey bCECGOST3410PublicKey, ECParameterSpec eCParameterSpec) {
        this.algorithm = "ECGOST3410";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.algorithm = str;
        this.f43168d = d0Var.c();
        if (eCParameterSpec == null) {
            y b11 = d0Var.b();
            eCParameterSpec = new ECParameterSpec(EC5Util.convertCurve(b11.a(), b11.f()), EC5Util.convertPoint(b11.b()), b11.e(), b11.c().intValue());
        }
        this.ecSpec = eCParameterSpec;
        this.gostParams = bCECGOST3410PublicKey.getGostParams();
        this.publicKey = getPublicKeyDetails(bCECGOST3410PublicKey);
    }

    public BCECGOST3410PrivateKey(String str, d0 d0Var, BCECGOST3410PublicKey bCECGOST3410PublicKey, e eVar) {
        this.algorithm = "ECGOST3410";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.algorithm = str;
        this.f43168d = d0Var.c();
        if (eVar == null) {
            y b11 = d0Var.b();
            this.ecSpec = new ECParameterSpec(EC5Util.convertCurve(b11.a(), b11.f()), EC5Util.convertPoint(b11.b()), b11.e(), b11.c().intValue());
        } else {
            this.ecSpec = new ECParameterSpec(EC5Util.convertCurve(eVar.a(), eVar.e()), EC5Util.convertPoint(eVar.b()), eVar.d(), eVar.c().intValue());
        }
        this.gostParams = bCECGOST3410PublicKey.getGostParams();
        this.publicKey = getPublicKeyDetails(bCECGOST3410PublicKey);
    }

    public BCECGOST3410PrivateKey(ECPrivateKey eCPrivateKey) {
        this.algorithm = "ECGOST3410";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.f43168d = eCPrivateKey.getS();
        this.algorithm = eCPrivateKey.getAlgorithm();
        this.ecSpec = eCPrivateKey.getParams();
    }

    public BCECGOST3410PrivateKey(ECPrivateKeySpec eCPrivateKeySpec) {
        this.algorithm = "ECGOST3410";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.f43168d = eCPrivateKeySpec.getS();
        this.ecSpec = eCPrivateKeySpec.getParams();
    }

    public BCECGOST3410PrivateKey(f fVar) {
        this.algorithm = "ECGOST3410";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.f43168d = fVar.b();
        this.ecSpec = fVar.a() != null ? EC5Util.convertSpec(EC5Util.convertCurve(fVar.a().a(), fVar.a().e()), fVar.a()) : null;
    }

    public BCECGOST3410PrivateKey(BCECGOST3410PrivateKey bCECGOST3410PrivateKey) {
        this.algorithm = "ECGOST3410";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.f43168d = bCECGOST3410PrivateKey.f43168d;
        this.ecSpec = bCECGOST3410PrivateKey.ecSpec;
        this.withCompression = bCECGOST3410PrivateKey.withCompression;
        this.attrCarrier = bCECGOST3410PrivateKey.attrCarrier;
        this.publicKey = bCECGOST3410PrivateKey.publicKey;
        this.gostParams = bCECGOST3410PrivateKey.gostParams;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BCECGOST3410PrivateKey(p pVar) {
        this.algorithm = "ECGOST3410";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        populateFromPrivKeyInfo(pVar);
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

    private j0 getPublicKeyDetails(BCECGOST3410PublicKey bCECGOST3410PublicKey) {
        try {
            return m0.h(org.bouncycastle.asn1.n.k(bCECGOST3410PublicKey.getEncoded())).i();
        } catch (IOException unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0128  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void populateFromPrivKeyInfo(w40.p r11) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jcajce.provider.asymmetric.ecgost.BCECGOST3410PrivateKey.populateFromPrivKeyInfo(w40.p):void");
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        populateFromPrivKeyInfo(p.f(org.bouncycastle.asn1.n.k((byte[]) objectInputStream.readObject())));
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    e engineGetSpec() {
        ECParameterSpec eCParameterSpec = this.ecSpec;
        return eCParameterSpec != null ? EC5Util.convertSpec(eCParameterSpec) : BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa();
    }

    public boolean equals(Object obj) {
        if (obj instanceof BCECGOST3410PrivateKey) {
            BCECGOST3410PrivateKey bCECGOST3410PrivateKey = (BCECGOST3410PrivateKey) obj;
            return getD().equals(bCECGOST3410PrivateKey.getD()) && engineGetSpec().equals(bCECGOST3410PrivateKey.engineGetSpec());
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
        return this.f43168d;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c4  */
    @Override // java.security.Key
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public byte[] getEncoded() {
        /*
            r9 = this;
            e40.b r0 = r9.gostParams
            java.lang.String r1 = "DER"
            r2 = 0
            if (r0 == 0) goto L2c
            r0 = 32
            byte[] r0 = new byte[r0]
            r3 = 0
            java.math.BigInteger r4 = r9.getS()
            r9.extractBytes(r0, r3, r4)
            w40.p r3 = new w40.p     // Catch: java.io.IOException -> L2b
            e50.b r4 = new e50.b     // Catch: java.io.IOException -> L2b
            org.bouncycastle.asn1.k r5 = i40.a.f29850m     // Catch: java.io.IOException -> L2b
            e40.b r6 = r9.gostParams     // Catch: java.io.IOException -> L2b
            r4.<init>(r5, r6)     // Catch: java.io.IOException -> L2b
            org.bouncycastle.asn1.s0 r5 = new org.bouncycastle.asn1.s0     // Catch: java.io.IOException -> L2b
            r5.<init>(r0)     // Catch: java.io.IOException -> L2b
            r3.<init>(r4, r5)     // Catch: java.io.IOException -> L2b
            byte[] r0 = r3.d(r1)     // Catch: java.io.IOException -> L2b
            return r0
        L2b:
            return r2
        L2c:
            java.security.spec.ECParameterSpec r0 = r9.ecSpec
            boolean r3 = r0 instanceof l60.d
            if (r3 == 0) goto L51
            l60.d r0 = (l60.d) r0
            java.lang.String r0 = r0.c()
            org.bouncycastle.asn1.k r0 = org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.getNamedCurveOid(r0)
            if (r0 != 0) goto L4b
            org.bouncycastle.asn1.k r0 = new org.bouncycastle.asn1.k
            java.security.spec.ECParameterSpec r3 = r9.ecSpec
            l60.d r3 = (l60.d) r3
            java.lang.String r3 = r3.c()
            r0.<init>(r3)
        L4b:
            f50.g r3 = new f50.g
            r3.<init>(r0)
            goto La4
        L51:
            if (r0 != 0) goto L65
            f50.g r3 = new f50.g
            org.bouncycastle.asn1.q0 r0 = org.bouncycastle.asn1.q0.f43085a
            r3.<init>(r0)
            org.bouncycastle.jcajce.provider.config.ProviderConfiguration r0 = org.bouncycastle.jce.provider.BouncyCastleProvider.CONFIGURATION
            java.math.BigInteger r4 = r9.getS()
            int r0 = org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.getOrderBitLength(r0, r2, r4)
            goto Lb4
        L65:
            java.security.spec.EllipticCurve r0 = r0.getCurve()
            n60.e r4 = org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertCurve(r0)
            f50.i r0 = new f50.i
            f50.k r5 = new f50.k
            java.security.spec.ECParameterSpec r3 = r9.ecSpec
            java.security.spec.ECPoint r3 = r3.getGenerator()
            n60.i r3 = org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertPoint(r4, r3)
            boolean r6 = r9.withCompression
            r5.<init>(r3, r6)
            java.security.spec.ECParameterSpec r3 = r9.ecSpec
            java.math.BigInteger r6 = r3.getOrder()
            java.security.spec.ECParameterSpec r3 = r9.ecSpec
            int r3 = r3.getCofactor()
            long r7 = (long) r3
            java.math.BigInteger r7 = java.math.BigInteger.valueOf(r7)
            java.security.spec.ECParameterSpec r3 = r9.ecSpec
            java.security.spec.EllipticCurve r3 = r3.getCurve()
            byte[] r8 = r3.getSeed()
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8)
            f50.g r3 = new f50.g
            r3.<init>(r0)
        La4:
            org.bouncycastle.jcajce.provider.config.ProviderConfiguration r0 = org.bouncycastle.jce.provider.BouncyCastleProvider.CONFIGURATION
            java.security.spec.ECParameterSpec r4 = r9.ecSpec
            java.math.BigInteger r4 = r4.getOrder()
            java.math.BigInteger r5 = r9.getS()
            int r0 = org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.getOrderBitLength(r0, r4, r5)
        Lb4:
            org.bouncycastle.asn1.j0 r4 = r9.publicKey
            if (r4 == 0) goto Lc4
            y40.a r4 = new y40.a
            java.math.BigInteger r5 = r9.getS()
            org.bouncycastle.asn1.j0 r6 = r9.publicKey
            r4.<init>(r0, r5, r6, r3)
            goto Lcd
        Lc4:
            y40.a r4 = new y40.a
            java.math.BigInteger r5 = r9.getS()
            r4.<init>(r0, r5, r3)
        Lcd:
            w40.p r0 = new w40.p     // Catch: java.io.IOException -> Le6
            e50.b r5 = new e50.b     // Catch: java.io.IOException -> Le6
            org.bouncycastle.asn1.k r6 = i40.a.f29850m     // Catch: java.io.IOException -> Le6
            org.bouncycastle.asn1.n r3 = r3.toASN1Primitive()     // Catch: java.io.IOException -> Le6
            r5.<init>(r6, r3)     // Catch: java.io.IOException -> Le6
            org.bouncycastle.asn1.n r3 = r4.toASN1Primitive()     // Catch: java.io.IOException -> Le6
            r0.<init>(r5, r3)     // Catch: java.io.IOException -> Le6
            byte[] r0 = r0.d(r1)     // Catch: java.io.IOException -> Le6
            return r0
        Le6:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jcajce.provider.asymmetric.ecgost.BCECGOST3410PrivateKey.getEncoded():byte[]");
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
        return this.f43168d;
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
        return ECUtil.privateKeyToString(this.algorithm, this.f43168d, engineGetSpec());
    }
}