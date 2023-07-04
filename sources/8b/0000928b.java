package org.bouncycastle.jcajce.provider.asymmetric.rsa;

import e50.b;
import e50.m0;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;
import org.bouncycastle.asn1.q0;
import org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil;
import r70.m;
import u50.n1;
import w40.n;
import w40.t;

/* loaded from: classes5.dex */
public class BCRSAPublicKey implements RSAPublicKey {
    static final b DEFAULT_ALGORITHM_IDENTIFIER = new b(n.f55541n1, q0.f43085a);
    static final long serialVersionUID = 2675817738516720772L;
    private transient b algorithmIdentifier;
    private BigInteger modulus;
    private BigInteger publicExponent;
    private transient n1 rsaPublicKey;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BCRSAPublicKey(b bVar, n1 n1Var) {
        this.algorithmIdentifier = bVar;
        this.modulus = n1Var.c();
        this.publicExponent = n1Var.b();
        this.rsaPublicKey = n1Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BCRSAPublicKey(m0 m0Var) {
        populateFromPublicKeyInfo(m0Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BCRSAPublicKey(RSAPublicKey rSAPublicKey) {
        this.algorithmIdentifier = DEFAULT_ALGORITHM_IDENTIFIER;
        this.modulus = rSAPublicKey.getModulus();
        this.publicExponent = rSAPublicKey.getPublicExponent();
        this.rsaPublicKey = new n1(false, this.modulus, this.publicExponent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BCRSAPublicKey(RSAPublicKeySpec rSAPublicKeySpec) {
        this.algorithmIdentifier = DEFAULT_ALGORITHM_IDENTIFIER;
        this.modulus = rSAPublicKeySpec.getModulus();
        this.publicExponent = rSAPublicKeySpec.getPublicExponent();
        this.rsaPublicKey = new n1(false, this.modulus, this.publicExponent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BCRSAPublicKey(n1 n1Var) {
        this(DEFAULT_ALGORITHM_IDENTIFIER, n1Var);
    }

    private void populateFromPublicKeyInfo(m0 m0Var) {
        try {
            t e11 = t.e(m0Var.j());
            this.algorithmIdentifier = m0Var.e();
            this.modulus = e11.f();
            this.publicExponent = e11.h();
            this.rsaPublicKey = new n1(false, this.modulus, this.publicExponent);
        } catch (IOException unused) {
            throw new IllegalArgumentException("invalid info structure in RSA public key");
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        try {
            this.algorithmIdentifier = b.f(objectInputStream.readObject());
        } catch (Exception unused) {
            this.algorithmIdentifier = DEFAULT_ALGORITHM_IDENTIFIER;
        }
        this.rsaPublicKey = new n1(false, this.modulus, this.publicExponent);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        if (this.algorithmIdentifier.equals(DEFAULT_ALGORITHM_IDENTIFIER)) {
            return;
        }
        objectOutputStream.writeObject(this.algorithmIdentifier.getEncoded());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public n1 engineGetKeyParameters() {
        return this.rsaPublicKey;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof RSAPublicKey) {
            RSAPublicKey rSAPublicKey = (RSAPublicKey) obj;
            return getModulus().equals(rSAPublicKey.getModulus()) && getPublicExponent().equals(rSAPublicKey.getPublicExponent());
        }
        return false;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return this.algorithmIdentifier.e().j(n.f55557w1) ? "RSASSA-PSS" : "RSA";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        return KeyUtil.getEncodedSubjectPublicKeyInfo(this.algorithmIdentifier, new t(getModulus(), getPublicExponent()));
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    @Override // java.security.interfaces.RSAKey
    public BigInteger getModulus() {
        return this.modulus;
    }

    @Override // java.security.interfaces.RSAPublicKey
    public BigInteger getPublicExponent() {
        return this.publicExponent;
    }

    public int hashCode() {
        return getModulus().hashCode() ^ getPublicExponent().hashCode();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String d11 = m.d();
        stringBuffer.append("RSA Public Key [");
        stringBuffer.append(RSAUtil.generateKeyFingerprint(getModulus()));
        stringBuffer.append("]");
        stringBuffer.append(",[");
        stringBuffer.append(RSAUtil.generateExponentFingerprint(getPublicExponent()));
        stringBuffer.append("]");
        stringBuffer.append(d11);
        stringBuffer.append("        modulus: ");
        stringBuffer.append(getModulus().toString(16));
        stringBuffer.append(d11);
        stringBuffer.append("public exponent: ");
        stringBuffer.append(getPublicExponent().toString(16));
        stringBuffer.append(d11);
        return stringBuffer.toString();
    }
}