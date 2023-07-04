package org.bouncycastle.jce.provider;

import e40.b;
import f50.a;
import f50.o;
import java.io.IOException;
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
public class JCEDHPrivateKey implements DHPrivateKey, n {
    static final long serialVersionUID = 311058815616901812L;
    private n attrCarrier = new PKCS12BagAttributeCarrierImpl();
    private DHParameterSpec dhSpec;
    private p info;

    /* renamed from: x  reason: collision with root package name */
    BigInteger f43194x;

    protected JCEDHPrivateKey() {
    }

    JCEDHPrivateKey(DHPrivateKey dHPrivateKey) {
        this.f43194x = dHPrivateKey.getX();
        this.dhSpec = dHPrivateKey.getParams();
    }

    JCEDHPrivateKey(DHPrivateKeySpec dHPrivateKeySpec) {
        this.f43194x = dHPrivateKeySpec.getX();
        this.dhSpec = new DHParameterSpec(dHPrivateKeySpec.getP(), dHPrivateKeySpec.getG());
    }

    JCEDHPrivateKey(j jVar) {
        this.f43194x = jVar.c();
        this.dhSpec = new DHParameterSpec(jVar.b().f(), jVar.b().b(), jVar.b().d());
    }

    JCEDHPrivateKey(p pVar) {
        DHParameterSpec dHParameterSpec;
        org.bouncycastle.asn1.p p11 = org.bouncycastle.asn1.p.p(pVar.i().i());
        i p12 = i.p(pVar.n());
        k e11 = pVar.i().e();
        this.info = pVar;
        this.f43194x = p12.s();
        if (e11.j(w40.n.G1)) {
            d f11 = d.f(p11);
            dHParameterSpec = f11.h() != null ? new DHParameterSpec(f11.i(), f11.e(), f11.h().intValue()) : new DHParameterSpec(f11.i(), f11.e());
        } else if (!e11.j(o.U0)) {
            throw new IllegalArgumentException("unknown algorithm type: " + e11);
        } else {
            a f12 = a.f(p11);
            dHParameterSpec = new DHParameterSpec(f12.i().s(), f12.e().s());
        }
        this.dhSpec = dHParameterSpec;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        this.f43194x = (BigInteger) objectInputStream.readObject();
        this.dhSpec = new DHParameterSpec((BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject(), objectInputStream.readInt());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeObject(getX());
        objectOutputStream.writeObject(this.dhSpec.getP());
        objectOutputStream.writeObject(this.dhSpec.getG());
        objectOutputStream.writeInt(this.dhSpec.getL());
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "DH";
    }

    @Override // k60.n
    public b getBagAttribute(k kVar) {
        return this.attrCarrier.getBagAttribute(kVar);
    }

    @Override // k60.n
    public Enumeration getBagAttributeKeys() {
        return this.attrCarrier.getBagAttributeKeys();
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            p pVar = this.info;
            return pVar != null ? pVar.d(ASN1Encoding.DER) : new p(new e50.b(w40.n.G1, new d(this.dhSpec.getP(), this.dhSpec.getG(), this.dhSpec.getL())), new i(getX())).d(ASN1Encoding.DER);
        } catch (IOException unused) {
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
        return this.f43194x;
    }

    @Override // k60.n
    public void setBagAttribute(k kVar, b bVar) {
        this.attrCarrier.setBagAttribute(kVar, bVar);
    }
}