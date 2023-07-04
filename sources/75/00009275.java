package org.bouncycastle.jcajce.provider.asymmetric.elgamal;

import e40.b;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.util.Enumeration;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.DHPrivateKeySpec;
import k60.e;
import k60.n;
import l60.i;
import l60.j;
import org.bouncycastle.asn1.k;
import org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl;
import org.spongycastle.asn1.ASN1Encoding;
import u50.o0;
import v40.a;
import w40.p;

/* loaded from: classes5.dex */
public class BCElGamalPrivateKey implements e, DHPrivateKey, n {
    static final long serialVersionUID = 4819350091141529678L;
    private transient PKCS12BagAttributeCarrierImpl attrCarrier = new PKCS12BagAttributeCarrierImpl();
    private transient i elSpec;

    /* renamed from: x  reason: collision with root package name */
    private BigInteger f43171x;

    protected BCElGamalPrivateKey() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BCElGamalPrivateKey(DHPrivateKey dHPrivateKey) {
        this.f43171x = dHPrivateKey.getX();
        this.elSpec = new i(dHPrivateKey.getParams().getP(), dHPrivateKey.getParams().getG());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BCElGamalPrivateKey(DHPrivateKeySpec dHPrivateKeySpec) {
        this.f43171x = dHPrivateKeySpec.getX();
        this.elSpec = new i(dHPrivateKeySpec.getP(), dHPrivateKeySpec.getG());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BCElGamalPrivateKey(e eVar) {
        this.f43171x = eVar.getX();
        this.elSpec = eVar.getParameters();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BCElGamalPrivateKey(j jVar) {
        this.f43171x = jVar.b();
        this.elSpec = new i(jVar.a().b(), jVar.a().a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BCElGamalPrivateKey(o0 o0Var) {
        this.f43171x = o0Var.c();
        this.elSpec = new i(o0Var.b().c(), o0Var.b().a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BCElGamalPrivateKey(p pVar) {
        a f11 = a.f(pVar.i().i());
        this.f43171x = org.bouncycastle.asn1.i.p(pVar.n()).s();
        this.elSpec = new i(f11.h(), f11.e());
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.elSpec = new i((BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject());
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.elSpec.b());
        objectOutputStream.writeObject(this.elSpec.a());
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
        return "ElGamal";
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
            return new p(new e50.b(v40.b.f54054i, new a(this.elSpec.b(), this.elSpec.a())), new org.bouncycastle.asn1.i(getX())).d(ASN1Encoding.DER);
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    @Override // k60.d
    public i getParameters() {
        return this.elSpec;
    }

    @Override // javax.crypto.interfaces.DHKey
    public DHParameterSpec getParams() {
        return new DHParameterSpec(this.elSpec.b(), this.elSpec.a());
    }

    @Override // k60.e, javax.crypto.interfaces.DHPrivateKey
    public BigInteger getX() {
        return this.f43171x;
    }

    public int hashCode() {
        return ((getX().hashCode() ^ getParams().getG().hashCode()) ^ getParams().getP().hashCode()) ^ getParams().getL();
    }

    @Override // k60.n
    public void setBagAttribute(k kVar, b bVar) {
        this.attrCarrier.setBagAttribute(kVar, bVar);
    }
}