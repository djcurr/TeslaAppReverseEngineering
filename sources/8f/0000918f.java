package org.bouncycastle.jcajce.provider.asymmetric.dsa;

import e40.b;
import e50.m0;
import e50.q;
import f50.o;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.DSAParams;
import java.security.interfaces.DSAPublicKey;
import java.security.spec.DSAParameterSpec;
import java.security.spec.DSAPublicKeySpec;
import org.bouncycastle.asn1.i;
import org.bouncycastle.asn1.q0;
import org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil;
import r70.m;
import u50.t;

/* loaded from: classes5.dex */
public class BCDSAPublicKey implements DSAPublicKey {
    private static BigInteger ZERO = BigInteger.valueOf(0);
    private static final long serialVersionUID = 1752452449903495175L;
    private transient DSAParams dsaSpec;
    private transient t lwKeyParams;

    /* renamed from: y  reason: collision with root package name */
    private BigInteger f43165y;

    public BCDSAPublicKey(m0 m0Var) {
        try {
            this.f43165y = ((i) m0Var.j()).s();
            if (isNotNull(m0Var.e().i())) {
                q f11 = q.f(m0Var.e().i());
                this.dsaSpec = new DSAParameterSpec(f11.h(), f11.i(), f11.e());
            } else {
                this.dsaSpec = null;
            }
            this.lwKeyParams = new t(this.f43165y, DSAUtil.toDSAParameters(this.dsaSpec));
        } catch (IOException unused) {
            throw new IllegalArgumentException("invalid info structure in DSA public key");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BCDSAPublicKey(DSAPublicKey dSAPublicKey) {
        this.f43165y = dSAPublicKey.getY();
        this.dsaSpec = dSAPublicKey.getParams();
        this.lwKeyParams = new t(this.f43165y, DSAUtil.toDSAParameters(this.dsaSpec));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BCDSAPublicKey(DSAPublicKeySpec dSAPublicKeySpec) {
        this.f43165y = dSAPublicKeySpec.getY();
        this.dsaSpec = new DSAParameterSpec(dSAPublicKeySpec.getP(), dSAPublicKeySpec.getQ(), dSAPublicKeySpec.getG());
        this.lwKeyParams = new t(this.f43165y, DSAUtil.toDSAParameters(this.dsaSpec));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BCDSAPublicKey(t tVar) {
        this.f43165y = tVar.c();
        this.dsaSpec = tVar.b() != null ? new DSAParameterSpec(tVar.b().b(), tVar.b().c(), tVar.b().a()) : null;
        this.lwKeyParams = tVar;
    }

    private boolean isNotNull(b bVar) {
        return (bVar == null || q0.f43085a.j(bVar.toASN1Primitive())) ? false : true;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        BigInteger bigInteger = (BigInteger) objectInputStream.readObject();
        if (bigInteger.equals(ZERO)) {
            this.dsaSpec = null;
        } else {
            this.dsaSpec = new DSAParameterSpec(bigInteger, (BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject());
        }
        this.lwKeyParams = new t(this.f43165y, DSAUtil.toDSAParameters(this.dsaSpec));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        BigInteger g11;
        objectOutputStream.defaultWriteObject();
        DSAParams dSAParams = this.dsaSpec;
        if (dSAParams == null) {
            g11 = ZERO;
        } else {
            objectOutputStream.writeObject(dSAParams.getP());
            objectOutputStream.writeObject(this.dsaSpec.getQ());
            g11 = this.dsaSpec.getG();
        }
        objectOutputStream.writeObject(g11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public t engineGetKeyParameters() {
        return this.lwKeyParams;
    }

    public boolean equals(Object obj) {
        if (obj instanceof DSAPublicKey) {
            DSAPublicKey dSAPublicKey = (DSAPublicKey) obj;
            return this.dsaSpec != null ? getY().equals(dSAPublicKey.getY()) && dSAPublicKey.getParams() != null && getParams().getG().equals(dSAPublicKey.getParams().getG()) && getParams().getP().equals(dSAPublicKey.getParams().getP()) && getParams().getQ().equals(dSAPublicKey.getParams().getQ()) : getY().equals(dSAPublicKey.getY()) && dSAPublicKey.getParams() == null;
        }
        return false;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "DSA";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        DSAParams dSAParams = this.dsaSpec;
        return dSAParams == null ? KeyUtil.getEncodedSubjectPublicKeyInfo(new e50.b(o.N0), new i(this.f43165y)) : KeyUtil.getEncodedSubjectPublicKeyInfo(new e50.b(o.N0, new q(dSAParams.getP(), this.dsaSpec.getQ(), this.dsaSpec.getG()).toASN1Primitive()), new i(this.f43165y));
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    @Override // java.security.interfaces.DSAKey
    public DSAParams getParams() {
        return this.dsaSpec;
    }

    @Override // java.security.interfaces.DSAPublicKey
    public BigInteger getY() {
        return this.f43165y;
    }

    public int hashCode() {
        return this.dsaSpec != null ? ((getY().hashCode() ^ getParams().getG().hashCode()) ^ getParams().getP().hashCode()) ^ getParams().getQ().hashCode() : getY().hashCode();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String d11 = m.d();
        stringBuffer.append("DSA Public Key [");
        stringBuffer.append(DSAUtil.generateKeyFingerprint(this.f43165y, getParams()));
        stringBuffer.append("]");
        stringBuffer.append(d11);
        stringBuffer.append("            Y: ");
        stringBuffer.append(getY().toString(16));
        stringBuffer.append(d11);
        return stringBuffer.toString();
    }
}