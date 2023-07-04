package org.bouncycastle.jcajce.provider.asymmetric.gost;

import e50.b;
import e50.m0;
import i40.a;
import i40.f;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import k60.h;
import k60.j;
import l60.l;
import l60.n;
import l60.o;
import org.bouncycastle.asn1.k;
import org.bouncycastle.asn1.s0;
import org.bouncycastle.jcajce.provider.asymmetric.util.GOST3410Util;
import org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil;
import u50.v0;

/* loaded from: classes5.dex */
public class BCGOST3410PublicKey implements j {
    static final long serialVersionUID = -6251023343619275990L;
    private transient h gost3410Spec;

    /* renamed from: y  reason: collision with root package name */
    private BigInteger f43174y;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BCGOST3410PublicKey(m0 m0Var) {
        f h11 = f.h(m0Var.e().i());
        try {
            byte[] r11 = ((s0) m0Var.j()).r();
            byte[] bArr = new byte[r11.length];
            for (int i11 = 0; i11 != r11.length; i11++) {
                bArr[i11] = r11[(r11.length - 1) - i11];
            }
            this.f43174y = new BigInteger(1, bArr);
            this.gost3410Spec = l.a(h11);
        } catch (IOException unused) {
            throw new IllegalArgumentException("invalid info structure in GOST3410 public key");
        }
    }

    BCGOST3410PublicKey(BigInteger bigInteger, l lVar) {
        this.f43174y = bigInteger;
        this.gost3410Spec = lVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BCGOST3410PublicKey(j jVar) {
        this.f43174y = jVar.getY();
        this.gost3410Spec = jVar.getParameters();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BCGOST3410PublicKey(o oVar) {
        this.f43174y = oVar.d();
        this.gost3410Spec = new l(new n(oVar.b(), oVar.c(), oVar.a()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BCGOST3410PublicKey(v0 v0Var, l lVar) {
        this.f43174y = v0Var.c();
        this.gost3410Spec = lVar;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        String str = (String) objectInputStream.readObject();
        if (str != null) {
            this.gost3410Spec = new l(str, (String) objectInputStream.readObject(), (String) objectInputStream.readObject());
            return;
        }
        this.gost3410Spec = new l(new n((BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject()));
        objectInputStream.readObject();
        objectInputStream.readObject();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        Object a11;
        objectOutputStream.defaultWriteObject();
        if (this.gost3410Spec.getPublicKeyParamSetOID() != null) {
            a11 = this.gost3410Spec.getPublicKeyParamSetOID();
        } else {
            objectOutputStream.writeObject(null);
            objectOutputStream.writeObject(this.gost3410Spec.getPublicKeyParameters().b());
            objectOutputStream.writeObject(this.gost3410Spec.getPublicKeyParameters().c());
            a11 = this.gost3410Spec.getPublicKeyParameters().a();
        }
        objectOutputStream.writeObject(a11);
        objectOutputStream.writeObject(this.gost3410Spec.getDigestParamSetOID());
        objectOutputStream.writeObject(this.gost3410Spec.getEncryptionParamSetOID());
    }

    public boolean equals(Object obj) {
        if (obj instanceof BCGOST3410PublicKey) {
            BCGOST3410PublicKey bCGOST3410PublicKey = (BCGOST3410PublicKey) obj;
            return this.f43174y.equals(bCGOST3410PublicKey.f43174y) && this.gost3410Spec.equals(bCGOST3410PublicKey.gost3410Spec);
        }
        return false;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "GOST3410";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        byte[] byteArray = getY().toByteArray();
        byte[] bArr = new byte[byteArray[0] == 0 ? byteArray.length - 1 : byteArray.length];
        for (int i11 = 0; i11 != bArr.length; i11++) {
            bArr[i11] = byteArray[(byteArray.length - 1) - i11];
        }
        try {
            h hVar = this.gost3410Spec;
            return KeyUtil.getEncodedSubjectPublicKeyInfo(hVar instanceof l ? hVar.getEncryptionParamSetOID() != null ? new m0(new b(a.f29849l, new f(new k(this.gost3410Spec.getPublicKeyParamSetOID()), new k(this.gost3410Spec.getDigestParamSetOID()), new k(this.gost3410Spec.getEncryptionParamSetOID()))), new s0(bArr)) : new m0(new b(a.f29849l, new f(new k(this.gost3410Spec.getPublicKeyParamSetOID()), new k(this.gost3410Spec.getDigestParamSetOID()))), new s0(bArr)) : new m0(new b(a.f29849l), new s0(bArr)));
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    @Override // k60.g
    public h getParameters() {
        return this.gost3410Spec;
    }

    @Override // k60.j
    public BigInteger getY() {
        return this.f43174y;
    }

    public int hashCode() {
        return this.f43174y.hashCode() ^ this.gost3410Spec.hashCode();
    }

    public String toString() {
        try {
            return GOSTUtil.publicKeyToString("GOST3410", this.f43174y, ((v0) GOST3410Util.generatePublicKeyParameter(this)).b());
        } catch (InvalidKeyException e11) {
            throw new IllegalStateException(e11.getMessage());
        }
    }
}