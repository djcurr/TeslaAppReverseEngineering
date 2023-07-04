package org.bouncycastle.jce.provider;

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
import org.spongycastle.asn1.ASN1Encoding;
import r70.m;
import u50.t;

/* loaded from: classes5.dex */
public class JDKDSAPublicKey implements DSAPublicKey {
    private static final long serialVersionUID = 1752452449903495175L;
    private DSAParams dsaSpec;

    /* renamed from: y  reason: collision with root package name */
    private BigInteger f43201y;

    JDKDSAPublicKey(m0 m0Var) {
        try {
            this.f43201y = ((i) m0Var.j()).s();
            if (isNotNull(m0Var.e().i())) {
                q f11 = q.f(m0Var.e().i());
                this.dsaSpec = new DSAParameterSpec(f11.h(), f11.i(), f11.e());
            }
        } catch (IOException unused) {
            throw new IllegalArgumentException("invalid info structure in DSA public key");
        }
    }

    JDKDSAPublicKey(BigInteger bigInteger, DSAParameterSpec dSAParameterSpec) {
        this.f43201y = bigInteger;
        this.dsaSpec = dSAParameterSpec;
    }

    JDKDSAPublicKey(DSAPublicKey dSAPublicKey) {
        this.f43201y = dSAPublicKey.getY();
        this.dsaSpec = dSAPublicKey.getParams();
    }

    JDKDSAPublicKey(DSAPublicKeySpec dSAPublicKeySpec) {
        this.f43201y = dSAPublicKeySpec.getY();
        this.dsaSpec = new DSAParameterSpec(dSAPublicKeySpec.getP(), dSAPublicKeySpec.getQ(), dSAPublicKeySpec.getG());
    }

    JDKDSAPublicKey(t tVar) {
        this.f43201y = tVar.c();
        this.dsaSpec = new DSAParameterSpec(tVar.b().b(), tVar.b().c(), tVar.b().a());
    }

    private boolean isNotNull(b bVar) {
        return (bVar == null || q0.f43085a.i(bVar)) ? false : true;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        this.f43201y = (BigInteger) objectInputStream.readObject();
        this.dsaSpec = new DSAParameterSpec((BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeObject(this.f43201y);
        objectOutputStream.writeObject(this.dsaSpec.getP());
        objectOutputStream.writeObject(this.dsaSpec.getQ());
        objectOutputStream.writeObject(this.dsaSpec.getG());
    }

    public boolean equals(Object obj) {
        if (obj instanceof DSAPublicKey) {
            DSAPublicKey dSAPublicKey = (DSAPublicKey) obj;
            return getY().equals(dSAPublicKey.getY()) && getParams().getG().equals(dSAPublicKey.getParams().getG()) && getParams().getP().equals(dSAPublicKey.getParams().getP()) && getParams().getQ().equals(dSAPublicKey.getParams().getQ());
        }
        return false;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "DSA";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            DSAParams dSAParams = this.dsaSpec;
            return dSAParams == null ? new m0(new e50.b(o.N0), new i(this.f43201y)).d(ASN1Encoding.DER) : new m0(new e50.b(o.N0, new q(dSAParams.getP(), this.dsaSpec.getQ(), this.dsaSpec.getG())), new i(this.f43201y)).d(ASN1Encoding.DER);
        } catch (IOException unused) {
            return null;
        }
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
        return this.f43201y;
    }

    public int hashCode() {
        return ((getY().hashCode() ^ getParams().getG().hashCode()) ^ getParams().getP().hashCode()) ^ getParams().getQ().hashCode();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String d11 = m.d();
        stringBuffer.append("DSA Public Key");
        stringBuffer.append(d11);
        stringBuffer.append("            y: ");
        stringBuffer.append(getY().toString(16));
        stringBuffer.append(d11);
        return stringBuffer.toString();
    }
}