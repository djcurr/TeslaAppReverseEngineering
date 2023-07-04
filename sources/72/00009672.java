package org.bouncycastle.jce.provider;

import e40.b;
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
import org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil;
import org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl;
import u50.o0;
import v40.a;
import w40.p;

/* loaded from: classes5.dex */
public class JCEElGamalPrivateKey implements e, DHPrivateKey, n {
    static final long serialVersionUID = 4819350091141529678L;
    private PKCS12BagAttributeCarrierImpl attrCarrier = new PKCS12BagAttributeCarrierImpl();
    i elSpec;

    /* renamed from: x  reason: collision with root package name */
    BigInteger f43198x;

    protected JCEElGamalPrivateKey() {
    }

    JCEElGamalPrivateKey(DHPrivateKey dHPrivateKey) {
        this.f43198x = dHPrivateKey.getX();
        this.elSpec = new i(dHPrivateKey.getParams().getP(), dHPrivateKey.getParams().getG());
    }

    JCEElGamalPrivateKey(DHPrivateKeySpec dHPrivateKeySpec) {
        this.f43198x = dHPrivateKeySpec.getX();
        this.elSpec = new i(dHPrivateKeySpec.getP(), dHPrivateKeySpec.getG());
    }

    JCEElGamalPrivateKey(e eVar) {
        this.f43198x = eVar.getX();
        this.elSpec = eVar.getParameters();
    }

    JCEElGamalPrivateKey(j jVar) {
        this.f43198x = jVar.b();
        this.elSpec = new i(jVar.a().b(), jVar.a().a());
    }

    JCEElGamalPrivateKey(o0 o0Var) {
        this.f43198x = o0Var.c();
        this.elSpec = new i(o0Var.b().c(), o0Var.b().a());
    }

    JCEElGamalPrivateKey(p pVar) {
        a f11 = a.f(pVar.i().i());
        this.f43198x = org.bouncycastle.asn1.i.p(pVar.n()).s();
        this.elSpec = new i(f11.h(), f11.e());
    }

    private void readObject(ObjectInputStream objectInputStream) {
        this.f43198x = (BigInteger) objectInputStream.readObject();
        this.elSpec = new i((BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeObject(getX());
        objectOutputStream.writeObject(this.elSpec.b());
        objectOutputStream.writeObject(this.elSpec.a());
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
        return KeyUtil.getEncodedPrivateKeyInfo(new e50.b(v40.b.f54054i, new a(this.elSpec.b(), this.elSpec.a())), new org.bouncycastle.asn1.i(getX()));
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
        return this.f43198x;
    }

    @Override // k60.n
    public void setBagAttribute(k kVar, b bVar) {
        this.attrCarrier.setBagAttribute(kVar, bVar);
    }
}