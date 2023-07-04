package org.bouncycastle.jce.provider;

import e50.b;
import e50.m0;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.DHPublicKeySpec;
import k60.f;
import l60.i;
import l60.k;
import org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil;
import u50.p0;
import v40.a;

/* loaded from: classes5.dex */
public class JCEElGamalPublicKey implements f, DHPublicKey {
    static final long serialVersionUID = 8712728417091216948L;
    private i elSpec;

    /* renamed from: y  reason: collision with root package name */
    private BigInteger f43199y;

    JCEElGamalPublicKey(m0 m0Var) {
        a f11 = a.f(m0Var.e().i());
        try {
            this.f43199y = ((org.bouncycastle.asn1.i) m0Var.j()).s();
            this.elSpec = new i(f11.h(), f11.e());
        } catch (IOException unused) {
            throw new IllegalArgumentException("invalid info structure in DSA public key");
        }
    }

    JCEElGamalPublicKey(BigInteger bigInteger, i iVar) {
        this.f43199y = bigInteger;
        this.elSpec = iVar;
    }

    JCEElGamalPublicKey(DHPublicKey dHPublicKey) {
        this.f43199y = dHPublicKey.getY();
        this.elSpec = new i(dHPublicKey.getParams().getP(), dHPublicKey.getParams().getG());
    }

    JCEElGamalPublicKey(DHPublicKeySpec dHPublicKeySpec) {
        this.f43199y = dHPublicKeySpec.getY();
        this.elSpec = new i(dHPublicKeySpec.getP(), dHPublicKeySpec.getG());
    }

    JCEElGamalPublicKey(f fVar) {
        this.f43199y = fVar.getY();
        this.elSpec = fVar.getParameters();
    }

    JCEElGamalPublicKey(k kVar) {
        this.f43199y = kVar.b();
        this.elSpec = new i(kVar.a().b(), kVar.a().a());
    }

    JCEElGamalPublicKey(p0 p0Var) {
        this.f43199y = p0Var.c();
        this.elSpec = new i(p0Var.b().c(), p0Var.b().a());
    }

    private void readObject(ObjectInputStream objectInputStream) {
        this.f43199y = (BigInteger) objectInputStream.readObject();
        this.elSpec = new i((BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeObject(getY());
        objectOutputStream.writeObject(this.elSpec.b());
        objectOutputStream.writeObject(this.elSpec.a());
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "ElGamal";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        return KeyUtil.getEncodedSubjectPublicKeyInfo(new b(v40.b.f54054i, new a(this.elSpec.b(), this.elSpec.a())), new org.bouncycastle.asn1.i(this.f43199y));
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    @Override // k60.d
    public i getParameters() {
        return this.elSpec;
    }

    @Override // javax.crypto.interfaces.DHKey
    public DHParameterSpec getParams() {
        return new DHParameterSpec(this.elSpec.b(), this.elSpec.a());
    }

    @Override // k60.f, javax.crypto.interfaces.DHPublicKey
    public BigInteger getY() {
        return this.f43199y;
    }
}