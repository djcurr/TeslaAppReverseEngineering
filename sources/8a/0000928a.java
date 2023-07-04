package org.bouncycastle.jcajce.provider.asymmetric.rsa;

import e50.b;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.RSAPrivateKey;
import java.security.spec.RSAPrivateKeySpec;
import java.util.Enumeration;
import k60.n;
import org.bouncycastle.asn1.k;
import org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil;
import org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl;
import r70.m;
import u50.n1;
import w40.s;

/* loaded from: classes5.dex */
public class BCRSAPrivateKey implements RSAPrivateKey, n {
    private static BigInteger ZERO = BigInteger.valueOf(0);
    static final long serialVersionUID = 5110188922551353628L;
    protected transient b algorithmIdentifier;
    private byte[] algorithmIdentifierEnc;
    protected transient PKCS12BagAttributeCarrierImpl attrCarrier;
    protected BigInteger modulus;
    protected BigInteger privateExponent;
    protected transient n1 rsaPrivateKey;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BCRSAPrivateKey(b bVar, n1 n1Var) {
        b bVar2 = BCRSAPublicKey.DEFAULT_ALGORITHM_IDENTIFIER;
        this.algorithmIdentifierEnc = getEncoding(bVar2);
        this.algorithmIdentifier = bVar2;
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.algorithmIdentifier = bVar;
        this.algorithmIdentifierEnc = getEncoding(bVar);
        this.modulus = n1Var.c();
        this.privateExponent = n1Var.b();
        this.rsaPrivateKey = n1Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BCRSAPrivateKey(b bVar, s sVar) {
        b bVar2 = BCRSAPublicKey.DEFAULT_ALGORITHM_IDENTIFIER;
        this.algorithmIdentifierEnc = getEncoding(bVar2);
        this.algorithmIdentifier = bVar2;
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.algorithmIdentifier = bVar;
        this.algorithmIdentifierEnc = getEncoding(bVar);
        this.modulus = sVar.j();
        this.privateExponent = sVar.n();
        this.rsaPrivateKey = new n1(true, this.modulus, this.privateExponent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BCRSAPrivateKey(RSAPrivateKey rSAPrivateKey) {
        b bVar = BCRSAPublicKey.DEFAULT_ALGORITHM_IDENTIFIER;
        this.algorithmIdentifierEnc = getEncoding(bVar);
        this.algorithmIdentifier = bVar;
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.modulus = rSAPrivateKey.getModulus();
        this.privateExponent = rSAPrivateKey.getPrivateExponent();
        this.rsaPrivateKey = new n1(true, this.modulus, this.privateExponent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BCRSAPrivateKey(RSAPrivateKeySpec rSAPrivateKeySpec) {
        b bVar = BCRSAPublicKey.DEFAULT_ALGORITHM_IDENTIFIER;
        this.algorithmIdentifierEnc = getEncoding(bVar);
        this.algorithmIdentifier = bVar;
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.modulus = rSAPrivateKeySpec.getModulus();
        this.privateExponent = rSAPrivateKeySpec.getPrivateExponent();
        this.rsaPrivateKey = new n1(true, this.modulus, this.privateExponent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BCRSAPrivateKey(n1 n1Var) {
        b bVar = BCRSAPublicKey.DEFAULT_ALGORITHM_IDENTIFIER;
        this.algorithmIdentifierEnc = getEncoding(bVar);
        this.algorithmIdentifier = bVar;
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.modulus = n1Var.c();
        this.privateExponent = n1Var.b();
        this.rsaPrivateKey = n1Var;
    }

    private static byte[] getEncoding(b bVar) {
        try {
            return bVar.getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        if (this.algorithmIdentifierEnc == null) {
            this.algorithmIdentifierEnc = getEncoding(BCRSAPublicKey.DEFAULT_ALGORITHM_IDENTIFIER);
        }
        this.algorithmIdentifier = b.f(this.algorithmIdentifierEnc);
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.rsaPrivateKey = new n1(true, this.modulus, this.privateExponent);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public n1 engineGetKeyParameters() {
        return this.rsaPrivateKey;
    }

    public boolean equals(Object obj) {
        if (obj instanceof RSAPrivateKey) {
            if (obj == this) {
                return true;
            }
            RSAPrivateKey rSAPrivateKey = (RSAPrivateKey) obj;
            return getModulus().equals(rSAPrivateKey.getModulus()) && getPrivateExponent().equals(rSAPrivateKey.getPrivateExponent());
        }
        return false;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return this.algorithmIdentifier.e().j(w40.n.f55557w1) ? "RSASSA-PSS" : "RSA";
    }

    @Override // k60.n
    public e40.b getBagAttribute(k kVar) {
        return this.attrCarrier.getBagAttribute(kVar);
    }

    @Override // k60.n
    public Enumeration getBagAttributeKeys() {
        return this.attrCarrier.getBagAttributeKeys();
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        b bVar = this.algorithmIdentifier;
        BigInteger modulus = getModulus();
        BigInteger bigInteger = ZERO;
        BigInteger privateExponent = getPrivateExponent();
        BigInteger bigInteger2 = ZERO;
        return KeyUtil.getEncodedPrivateKeyInfo(bVar, new s(modulus, bigInteger, privateExponent, bigInteger2, bigInteger2, bigInteger2, bigInteger2, bigInteger2));
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    @Override // java.security.interfaces.RSAKey
    public BigInteger getModulus() {
        return this.modulus;
    }

    @Override // java.security.interfaces.RSAPrivateKey
    public BigInteger getPrivateExponent() {
        return this.privateExponent;
    }

    public int hashCode() {
        return getModulus().hashCode() ^ getPrivateExponent().hashCode();
    }

    @Override // k60.n
    public void setBagAttribute(k kVar, e40.b bVar) {
        this.attrCarrier.setBagAttribute(kVar, bVar);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String d11 = m.d();
        stringBuffer.append("RSA Private Key [");
        stringBuffer.append(RSAUtil.generateKeyFingerprint(getModulus()));
        stringBuffer.append("],[]");
        stringBuffer.append(d11);
        stringBuffer.append("            modulus: ");
        stringBuffer.append(getModulus().toString(16));
        stringBuffer.append(d11);
        return stringBuffer.toString();
    }
}