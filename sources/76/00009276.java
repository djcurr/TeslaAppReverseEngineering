package org.bouncycastle.jcajce.provider.asymmetric.elgamal;

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
import org.spongycastle.asn1.ASN1Encoding;
import u50.p0;
import v40.a;

/* loaded from: classes5.dex */
public class BCElGamalPublicKey implements f, DHPublicKey {
    static final long serialVersionUID = 8712728417091216948L;
    private transient i elSpec;

    /* renamed from: y  reason: collision with root package name */
    private BigInteger f43172y;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BCElGamalPublicKey(m0 m0Var) {
        a f11 = a.f(m0Var.e().i());
        try {
            this.f43172y = ((org.bouncycastle.asn1.i) m0Var.j()).s();
            this.elSpec = new i(f11.h(), f11.e());
        } catch (IOException unused) {
            throw new IllegalArgumentException("invalid info structure in DSA public key");
        }
    }

    BCElGamalPublicKey(BigInteger bigInteger, i iVar) {
        this.f43172y = bigInteger;
        this.elSpec = iVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BCElGamalPublicKey(DHPublicKey dHPublicKey) {
        this.f43172y = dHPublicKey.getY();
        this.elSpec = new i(dHPublicKey.getParams().getP(), dHPublicKey.getParams().getG());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BCElGamalPublicKey(DHPublicKeySpec dHPublicKeySpec) {
        this.f43172y = dHPublicKeySpec.getY();
        this.elSpec = new i(dHPublicKeySpec.getP(), dHPublicKeySpec.getG());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BCElGamalPublicKey(f fVar) {
        this.f43172y = fVar.getY();
        this.elSpec = fVar.getParameters();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BCElGamalPublicKey(k kVar) {
        this.f43172y = kVar.b();
        this.elSpec = new i(kVar.a().b(), kVar.a().a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BCElGamalPublicKey(p0 p0Var) {
        this.f43172y = p0Var.c();
        this.elSpec = new i(p0Var.b().c(), p0Var.b().a());
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.elSpec = new i((BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.elSpec.b());
        objectOutputStream.writeObject(this.elSpec.a());
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
        return "ElGamal";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return new m0(new b(v40.b.f54054i, new a(this.elSpec.b(), this.elSpec.a())), new org.bouncycastle.asn1.i(this.f43172y)).d(ASN1Encoding.DER);
        } catch (IOException unused) {
            return null;
        }
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
        return this.f43172y;
    }

    public int hashCode() {
        return ((getY().hashCode() ^ getParams().getG().hashCode()) ^ getParams().getP().hashCode()) ^ getParams().getL();
    }
}