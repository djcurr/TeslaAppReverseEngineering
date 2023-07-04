package org.bouncycastle.jce.provider;

import e50.b;
import e50.m0;
import f50.a;
import f50.o;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.DHPublicKeySpec;
import org.bouncycastle.asn1.i;
import org.bouncycastle.asn1.k;
import org.bouncycastle.asn1.p;
import org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil;
import w40.d;
import w40.n;

/* loaded from: classes5.dex */
public class JCEDHPublicKey implements DHPublicKey {
    static final long serialVersionUID = -216691575254424324L;
    private DHParameterSpec dhSpec;
    private m0 info;

    /* renamed from: y  reason: collision with root package name */
    private BigInteger f43195y;

    JCEDHPublicKey(m0 m0Var) {
        DHParameterSpec dHParameterSpec;
        this.info = m0Var;
        try {
            this.f43195y = ((i) m0Var.j()).s();
            p p11 = p.p(m0Var.f().i());
            k e11 = m0Var.f().e();
            if (e11.j(n.G1) || isPKCSParam(p11)) {
                d f11 = d.f(p11);
                dHParameterSpec = f11.h() != null ? new DHParameterSpec(f11.i(), f11.e(), f11.h().intValue()) : new DHParameterSpec(f11.i(), f11.e());
            } else if (!e11.j(o.U0)) {
                throw new IllegalArgumentException("unknown algorithm type: " + e11);
            } else {
                a f12 = a.f(p11);
                dHParameterSpec = new DHParameterSpec(f12.i().s(), f12.e().s());
            }
            this.dhSpec = dHParameterSpec;
        } catch (IOException unused) {
            throw new IllegalArgumentException("invalid info structure in DH public key");
        }
    }

    JCEDHPublicKey(BigInteger bigInteger, DHParameterSpec dHParameterSpec) {
        this.f43195y = bigInteger;
        this.dhSpec = dHParameterSpec;
    }

    JCEDHPublicKey(DHPublicKey dHPublicKey) {
        this.f43195y = dHPublicKey.getY();
        this.dhSpec = dHPublicKey.getParams();
    }

    JCEDHPublicKey(DHPublicKeySpec dHPublicKeySpec) {
        this.f43195y = dHPublicKeySpec.getY();
        this.dhSpec = new DHParameterSpec(dHPublicKeySpec.getP(), dHPublicKeySpec.getG());
    }

    JCEDHPublicKey(u50.k kVar) {
        this.f43195y = kVar.c();
        this.dhSpec = new DHParameterSpec(kVar.b().f(), kVar.b().b(), kVar.b().d());
    }

    private boolean isPKCSParam(p pVar) {
        if (pVar.size() == 2) {
            return true;
        }
        if (pVar.size() > 3) {
            return false;
        }
        return i.p(pVar.r(2)).s().compareTo(BigInteger.valueOf((long) i.p(pVar.r(0)).s().bitLength())) <= 0;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        this.f43195y = (BigInteger) objectInputStream.readObject();
        this.dhSpec = new DHParameterSpec((BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject(), objectInputStream.readInt());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeObject(getY());
        objectOutputStream.writeObject(this.dhSpec.getP());
        objectOutputStream.writeObject(this.dhSpec.getG());
        objectOutputStream.writeInt(this.dhSpec.getL());
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "DH";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        m0 m0Var = this.info;
        return m0Var != null ? KeyUtil.getEncodedSubjectPublicKeyInfo(m0Var) : KeyUtil.getEncodedSubjectPublicKeyInfo(new b(n.G1, new d(this.dhSpec.getP(), this.dhSpec.getG(), this.dhSpec.getL())), new i(this.f43195y));
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    @Override // javax.crypto.interfaces.DHKey
    public DHParameterSpec getParams() {
        return this.dhSpec;
    }

    @Override // javax.crypto.interfaces.DHPublicKey
    public BigInteger getY() {
        return this.f43195y;
    }
}