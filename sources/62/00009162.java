package org.bouncycastle.jcajce.provider.asymmetric.dh;

import f50.e;
import f50.o;
import h60.b;
import h60.c;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.util.Enumeration;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.DHPrivateKeySpec;
import k60.n;
import org.bouncycastle.asn1.i;
import org.bouncycastle.asn1.k;
import org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl;
import org.spongycastle.asn1.ASN1Encoding;
import u50.j;
import w40.d;
import w40.p;

/* loaded from: classes5.dex */
public class BCDHPrivateKey implements DHPrivateKey, n {
    static final long serialVersionUID = 311058815616901812L;
    private transient PKCS12BagAttributeCarrierImpl attrCarrier = new PKCS12BagAttributeCarrierImpl();
    private transient j dhPrivateKey;
    private transient DHParameterSpec dhSpec;
    private transient p info;

    /* renamed from: x  reason: collision with root package name */
    private BigInteger f43159x;

    protected BCDHPrivateKey() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BCDHPrivateKey(DHPrivateKey dHPrivateKey) {
        this.f43159x = dHPrivateKey.getX();
        this.dhSpec = dHPrivateKey.getParams();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BCDHPrivateKey(DHPrivateKeySpec dHPrivateKeySpec) {
        this.f43159x = dHPrivateKeySpec.getX();
        if (dHPrivateKeySpec instanceof c) {
            this.dhSpec = ((c) dHPrivateKeySpec).a();
        } else {
            this.dhSpec = new DHParameterSpec(dHPrivateKeySpec.getP(), dHPrivateKeySpec.getG());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BCDHPrivateKey(j jVar) {
        this.f43159x = jVar.c();
        this.dhSpec = new b(jVar.b());
    }

    public BCDHPrivateKey(p pVar) {
        j jVar;
        org.bouncycastle.asn1.p p11 = org.bouncycastle.asn1.p.p(pVar.i().i());
        k e11 = pVar.i().e();
        this.info = pVar;
        this.f43159x = ((i) pVar.n()).s();
        if (e11.j(w40.n.G1)) {
            d f11 = d.f(p11);
            if (f11.h() != null) {
                this.dhSpec = new DHParameterSpec(f11.i(), f11.e(), f11.h().intValue());
                jVar = new j(this.f43159x, new u50.i(f11.i(), f11.e(), null, f11.h().intValue()));
            } else {
                this.dhSpec = new DHParameterSpec(f11.i(), f11.e());
                jVar = new j(this.f43159x, new u50.i(f11.i(), f11.e()));
            }
        } else if (!e11.j(o.U0)) {
            throw new IllegalArgumentException("unknown algorithm type: " + e11);
        } else {
            f50.c f12 = f50.c.f(p11);
            this.dhSpec = new b(f12.j(), f12.k(), f12.e(), f12.h(), 0);
            jVar = new j(this.f43159x, new u50.i(f12.j(), f12.e(), f12.k(), f12.h(), null));
        }
        this.dhPrivateKey = jVar;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.dhSpec = new DHParameterSpec((BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject(), objectInputStream.readInt());
        this.info = null;
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.dhSpec.getP());
        objectOutputStream.writeObject(this.dhSpec.getG());
        objectOutputStream.writeInt(this.dhSpec.getL());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public j engineGetKeyParameters() {
        j jVar = this.dhPrivateKey;
        if (jVar != null) {
            return jVar;
        }
        DHParameterSpec dHParameterSpec = this.dhSpec;
        return dHParameterSpec instanceof b ? new j(this.f43159x, ((b) dHParameterSpec).a()) : new j(this.f43159x, new u50.i(dHParameterSpec.getP(), this.dhSpec.getG(), null, this.dhSpec.getL()));
    }

    public boolean equals(Object obj) {
        if (obj instanceof DHPrivateKey) {
            DHPrivateKey dHPrivateKey = (DHPrivateKey) obj;
            return getX().equals(dHPrivateKey.getX()) && getParams().getG().equals(dHPrivateKey.getParams().getG()) && getParams().getP().equals(dHPrivateKey.getParams().getP()) && getParams().getL() == dHPrivateKey.getParams().getL();
        }
        return false;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "DH";
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
        p pVar;
        try {
            p pVar2 = this.info;
            if (pVar2 != null) {
                return pVar2.d(ASN1Encoding.DER);
            }
            DHParameterSpec dHParameterSpec = this.dhSpec;
            if (!(dHParameterSpec instanceof b) || ((b) dHParameterSpec).b() == null) {
                pVar = new p(new e50.b(w40.n.G1, new d(this.dhSpec.getP(), this.dhSpec.getG(), this.dhSpec.getL()).toASN1Primitive()), new i(getX()));
            } else {
                u50.i a11 = ((b) this.dhSpec).a();
                u50.n h11 = a11.h();
                pVar = new p(new e50.b(o.U0, new f50.c(a11.f(), a11.b(), a11.g(), a11.c(), h11 != null ? new e(h11.b(), h11.a()) : null).toASN1Primitive()), new i(getX()));
            }
            return pVar.d(ASN1Encoding.DER);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    @Override // javax.crypto.interfaces.DHKey
    public DHParameterSpec getParams() {
        return this.dhSpec;
    }

    @Override // javax.crypto.interfaces.DHPrivateKey
    public BigInteger getX() {
        return this.f43159x;
    }

    public int hashCode() {
        return ((getX().hashCode() ^ getParams().getG().hashCode()) ^ getParams().getP().hashCode()) ^ getParams().getL();
    }

    @Override // k60.n
    public void setBagAttribute(k kVar, e40.b bVar) {
        this.attrCarrier.setBagAttribute(kVar, bVar);
    }

    public String toString() {
        return DHUtil.privateKeyToString("DH", this.f43159x, new u50.i(this.dhSpec.getP(), this.dhSpec.getG()));
    }
}