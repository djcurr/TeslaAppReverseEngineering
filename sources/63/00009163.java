package org.bouncycastle.jcajce.provider.asymmetric.dh;

import e50.m0;
import f50.c;
import f50.e;
import f50.o;
import h60.b;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.DHPublicKeySpec;
import org.bouncycastle.asn1.i;
import org.bouncycastle.asn1.p;
import org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil;
import u50.k;
import w40.d;
import w40.n;

/* loaded from: classes5.dex */
public class BCDHPublicKey implements DHPublicKey {
    static final long serialVersionUID = -216691575254424324L;
    private transient k dhPublicKey;
    private transient DHParameterSpec dhSpec;
    private transient m0 info;

    /* renamed from: y  reason: collision with root package name */
    private BigInteger f43160y;

    public BCDHPublicKey(m0 m0Var) {
        k kVar;
        this.info = m0Var;
        try {
            this.f43160y = ((i) m0Var.j()).s();
            p p11 = p.p(m0Var.e().i());
            org.bouncycastle.asn1.k e11 = m0Var.e().e();
            if (e11.j(n.G1) || isPKCSParam(p11)) {
                d f11 = d.f(p11);
                if (f11.h() != null) {
                    this.dhSpec = new DHParameterSpec(f11.i(), f11.e(), f11.h().intValue());
                    kVar = new k(this.f43160y, new u50.i(this.dhSpec.getP(), this.dhSpec.getG(), null, this.dhSpec.getL()));
                } else {
                    this.dhSpec = new DHParameterSpec(f11.i(), f11.e());
                    kVar = new k(this.f43160y, new u50.i(this.dhSpec.getP(), this.dhSpec.getG()));
                }
                this.dhPublicKey = kVar;
            } else if (!e11.j(o.U0)) {
                throw new IllegalArgumentException("unknown algorithm type: " + e11);
            } else {
                c f12 = c.f(p11);
                e m11 = f12.m();
                if (m11 != null) {
                    this.dhPublicKey = new k(this.f43160y, new u50.i(f12.j(), f12.e(), f12.k(), f12.h(), new u50.n(m11.h(), m11.f().intValue())));
                } else {
                    this.dhPublicKey = new k(this.f43160y, new u50.i(f12.j(), f12.e(), f12.k(), f12.h(), null));
                }
                this.dhSpec = new b(this.dhPublicKey.b());
            }
        } catch (IOException unused) {
            throw new IllegalArgumentException("invalid info structure in DH public key");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BCDHPublicKey(BigInteger bigInteger, DHParameterSpec dHParameterSpec) {
        this.f43160y = bigInteger;
        this.dhSpec = dHParameterSpec;
        this.dhPublicKey = dHParameterSpec instanceof b ? new k(bigInteger, ((b) dHParameterSpec).a()) : new k(bigInteger, new u50.i(dHParameterSpec.getP(), dHParameterSpec.getG()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BCDHPublicKey(DHPublicKey dHPublicKey) {
        this.f43160y = dHPublicKey.getY();
        DHParameterSpec params = dHPublicKey.getParams();
        this.dhSpec = params;
        if (params instanceof b) {
            this.dhPublicKey = new k(this.f43160y, ((b) params).a());
        } else {
            this.dhPublicKey = new k(this.f43160y, new u50.i(this.dhSpec.getP(), this.dhSpec.getG()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BCDHPublicKey(DHPublicKeySpec dHPublicKeySpec) {
        this.f43160y = dHPublicKeySpec.getY();
        this.dhSpec = dHPublicKeySpec instanceof h60.d ? ((h60.d) dHPublicKeySpec).a() : new DHParameterSpec(dHPublicKeySpec.getP(), dHPublicKeySpec.getG());
        DHParameterSpec dHParameterSpec = this.dhSpec;
        if (dHParameterSpec instanceof b) {
            this.dhPublicKey = new k(this.f43160y, ((b) dHParameterSpec).a());
        } else {
            this.dhPublicKey = new k(this.f43160y, new u50.i(dHPublicKeySpec.getP(), dHPublicKeySpec.getG()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BCDHPublicKey(k kVar) {
        this.f43160y = kVar.c();
        this.dhSpec = new b(kVar.b());
        this.dhPublicKey = kVar;
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
        objectInputStream.defaultReadObject();
        this.dhSpec = new DHParameterSpec((BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject(), objectInputStream.readInt());
        this.info = null;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.dhSpec.getP());
        objectOutputStream.writeObject(this.dhSpec.getG());
        objectOutputStream.writeInt(this.dhSpec.getL());
    }

    public k engineGetKeyParameters() {
        return this.dhPublicKey;
    }

    public boolean equals(Object obj) {
        if (obj instanceof DHPublicKey) {
            DHPublicKey dHPublicKey = (DHPublicKey) obj;
            return getY().equals(dHPublicKey.getY()) && getParams().getG().equals(dHPublicKey.getParams().getG()) && getParams().getP().equals(dHPublicKey.getParams().getP()) && getParams().getL() == dHPublicKey.getParams().getL();
        }
        return false;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "DH";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        m0 m0Var = this.info;
        if (m0Var != null) {
            return KeyUtil.getEncodedSubjectPublicKeyInfo(m0Var);
        }
        DHParameterSpec dHParameterSpec = this.dhSpec;
        if (!(dHParameterSpec instanceof b) || ((b) dHParameterSpec).b() == null) {
            return KeyUtil.getEncodedSubjectPublicKeyInfo(new e50.b(n.G1, new d(this.dhSpec.getP(), this.dhSpec.getG(), this.dhSpec.getL()).toASN1Primitive()), new i(this.f43160y));
        }
        u50.i a11 = ((b) this.dhSpec).a();
        u50.n h11 = a11.h();
        return KeyUtil.getEncodedSubjectPublicKeyInfo(new e50.b(o.U0, new c(a11.f(), a11.b(), a11.g(), a11.c(), h11 != null ? new e(h11.b(), h11.a()) : null).toASN1Primitive()), new i(this.f43160y));
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
        return this.f43160y;
    }

    public int hashCode() {
        return ((getY().hashCode() ^ getParams().getG().hashCode()) ^ getParams().getP().hashCode()) ^ getParams().getL();
    }

    public String toString() {
        return DHUtil.publicKeyToString("DH", this.f43160y, new u50.i(this.dhSpec.getP(), this.dhSpec.getG()));
    }
}