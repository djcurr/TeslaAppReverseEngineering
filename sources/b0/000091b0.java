package org.bouncycastle.jcajce.provider.asymmetric.ec;

import e50.m0;
import f50.g;
import f50.o;
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
import org.bouncycastle.asn1.i;
import org.bouncycastle.asn1.j0;
import org.bouncycastle.asn1.k;
import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl;
import org.bouncycastle.jcajce.provider.config.ProviderConfiguration;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.spongycastle.asn1.ASN1Encoding;
import u50.d0;
import u50.y;
import w40.p;
import y40.a;

/* loaded from: classes5.dex */
public class BCECPrivateKey implements ECPrivateKey, b, n {
    static final long serialVersionUID = 994553197664784084L;
    private String algorithm;
    private transient PKCS12BagAttributeCarrierImpl attrCarrier;
    private transient ProviderConfiguration configuration;

    /* renamed from: d  reason: collision with root package name */
    private transient BigInteger f43167d;
    private transient ECParameterSpec ecSpec;
    private transient j0 publicKey;
    private boolean withCompression;

    protected BCECPrivateKey() {
        this.algorithm = "EC";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
    }

    public BCECPrivateKey(String str, ECPrivateKeySpec eCPrivateKeySpec, ProviderConfiguration providerConfiguration) {
        this.algorithm = "EC";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.algorithm = str;
        this.f43167d = eCPrivateKeySpec.getS();
        this.ecSpec = eCPrivateKeySpec.getParams();
        this.configuration = providerConfiguration;
    }

    public BCECPrivateKey(String str, f fVar, ProviderConfiguration providerConfiguration) {
        this.algorithm = "EC";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.algorithm = str;
        this.f43167d = fVar.b();
        this.ecSpec = fVar.a() != null ? EC5Util.convertSpec(EC5Util.convertCurve(fVar.a().a(), fVar.a().e()), fVar.a()) : null;
        this.configuration = providerConfiguration;
    }

    public BCECPrivateKey(String str, BCECPrivateKey bCECPrivateKey) {
        this.algorithm = "EC";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.algorithm = str;
        this.f43167d = bCECPrivateKey.f43167d;
        this.ecSpec = bCECPrivateKey.ecSpec;
        this.withCompression = bCECPrivateKey.withCompression;
        this.attrCarrier = bCECPrivateKey.attrCarrier;
        this.publicKey = bCECPrivateKey.publicKey;
        this.configuration = bCECPrivateKey.configuration;
    }

    public BCECPrivateKey(String str, d0 d0Var, BCECPublicKey bCECPublicKey, ECParameterSpec eCParameterSpec, ProviderConfiguration providerConfiguration) {
        this.algorithm = "EC";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.algorithm = str;
        this.f43167d = d0Var.c();
        this.configuration = providerConfiguration;
        if (eCParameterSpec == null) {
            y b11 = d0Var.b();
            eCParameterSpec = new ECParameterSpec(EC5Util.convertCurve(b11.a(), b11.f()), EC5Util.convertPoint(b11.b()), b11.e(), b11.c().intValue());
        }
        this.ecSpec = eCParameterSpec;
        this.publicKey = getPublicKeyDetails(bCECPublicKey);
    }

    public BCECPrivateKey(String str, d0 d0Var, BCECPublicKey bCECPublicKey, e eVar, ProviderConfiguration providerConfiguration) {
        this.algorithm = "EC";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.algorithm = str;
        this.f43167d = d0Var.c();
        this.configuration = providerConfiguration;
        if (eVar == null) {
            y b11 = d0Var.b();
            this.ecSpec = new ECParameterSpec(EC5Util.convertCurve(b11.a(), b11.f()), EC5Util.convertPoint(b11.b()), b11.e(), b11.c().intValue());
        } else {
            this.ecSpec = EC5Util.convertSpec(EC5Util.convertCurve(eVar.a(), eVar.e()), eVar);
        }
        try {
            this.publicKey = getPublicKeyDetails(bCECPublicKey);
        } catch (Exception unused) {
            this.publicKey = null;
        }
    }

    public BCECPrivateKey(String str, d0 d0Var, ProviderConfiguration providerConfiguration) {
        this.algorithm = "EC";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.algorithm = str;
        this.f43167d = d0Var.c();
        this.ecSpec = null;
        this.configuration = providerConfiguration;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BCECPrivateKey(String str, p pVar, ProviderConfiguration providerConfiguration) {
        this.algorithm = "EC";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.algorithm = str;
        this.configuration = providerConfiguration;
        populateFromPrivKeyInfo(pVar);
    }

    public BCECPrivateKey(ECPrivateKey eCPrivateKey, ProviderConfiguration providerConfiguration) {
        this.algorithm = "EC";
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.f43167d = eCPrivateKey.getS();
        this.algorithm = eCPrivateKey.getAlgorithm();
        this.ecSpec = eCPrivateKey.getParams();
        this.configuration = providerConfiguration;
    }

    private j0 getPublicKeyDetails(BCECPublicKey bCECPublicKey) {
        try {
            return m0.h(org.bouncycastle.asn1.n.k(bCECPublicKey.getEncoded())).i();
        } catch (IOException unused) {
            return null;
        }
    }

    private void populateFromPrivKeyInfo(p pVar) {
        g e11 = g.e(pVar.i().i());
        this.ecSpec = EC5Util.convertToSpec(e11, EC5Util.getCurve(this.configuration, e11));
        e40.b n11 = pVar.n();
        if (n11 instanceof i) {
            this.f43167d = i.p(n11).s();
            return;
        }
        a e12 = a.e(n11);
        this.f43167d = e12.f();
        this.publicKey = e12.j();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.configuration = BouncyCastleProvider.CONFIGURATION;
        populateFromPrivKeyInfo(p.f(org.bouncycastle.asn1.n.k((byte[]) objectInputStream.readObject())));
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    e engineGetSpec() {
        ECParameterSpec eCParameterSpec = this.ecSpec;
        return eCParameterSpec != null ? EC5Util.convertSpec(eCParameterSpec) : this.configuration.getEcImplicitlyCa();
    }

    public boolean equals(Object obj) {
        if (obj instanceof BCECPrivateKey) {
            BCECPrivateKey bCECPrivateKey = (BCECPrivateKey) obj;
            return getD().equals(bCECPrivateKey.getD()) && engineGetSpec().equals(bCECPrivateKey.engineGetSpec());
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
        return this.f43167d;
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        g domainParametersFromName = ECUtils.getDomainParametersFromName(this.ecSpec, this.withCompression);
        ECParameterSpec eCParameterSpec = this.ecSpec;
        int orderBitLength = eCParameterSpec == null ? ECUtil.getOrderBitLength(this.configuration, null, getS()) : ECUtil.getOrderBitLength(this.configuration, eCParameterSpec.getOrder(), getS());
        try {
            return new p(new e50.b(o.f25891h0, domainParametersFromName), this.publicKey != null ? new a(orderBitLength, getS(), this.publicKey, domainParametersFromName) : new a(orderBitLength, getS(), domainParametersFromName)).d(ASN1Encoding.DER);
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
        return this.f43167d;
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
        return ECUtil.privateKeyToString("EC", this.f43167d, engineGetSpec());
    }
}