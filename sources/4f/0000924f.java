package org.bouncycastle.jcajce.provider.asymmetric.edec;

import e50.m0;
import f60.c;
import j40.a;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import u50.b;
import u50.t1;
import u50.w1;

/* loaded from: classes5.dex */
public class BCXDHPublicKey implements c {
    static final long serialVersionUID = 1;
    transient b xdhPublicKey;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BCXDHPublicKey(m0 m0Var) {
        populateFromPubKeyInfo(m0Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BCXDHPublicKey(b bVar) {
        this.xdhPublicKey = bVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BCXDHPublicKey(byte[] bArr, byte[] bArr2) {
        b t1Var;
        int length = bArr.length;
        if (!Utils.isValidPrefix(bArr, bArr2)) {
            throw new InvalidKeySpecException("raw key data not recognised");
        }
        if (bArr2.length - length == 56) {
            t1Var = new w1(bArr2, length);
        } else if (bArr2.length - length != 32) {
            throw new InvalidKeySpecException("raw key data not recognised");
        } else {
            t1Var = new t1(bArr2, length);
        }
        this.xdhPublicKey = t1Var;
    }

    private void populateFromPubKeyInfo(m0 m0Var) {
        byte[] r11 = m0Var.i().r();
        this.xdhPublicKey = a.f33206c.j(m0Var.e().e()) ? new w1(r11) : new t1(r11);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        populateFromPubKeyInfo(m0.h((byte[]) objectInputStream.readObject()));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b engineGetKeyParameters() {
        return this.xdhPublicKey;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PublicKey) {
            return org.bouncycastle.util.a.c(((PublicKey) obj).getEncoded(), getEncoded());
        }
        return false;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return this.xdhPublicKey instanceof w1 ? "X448" : "X25519";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        if (this.xdhPublicKey instanceof w1) {
            byte[] bArr = KeyFactorySpi.x448Prefix;
            byte[] bArr2 = new byte[bArr.length + 56];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            ((w1) this.xdhPublicKey).b(bArr2, bArr.length);
            return bArr2;
        }
        byte[] bArr3 = KeyFactorySpi.x25519Prefix;
        byte[] bArr4 = new byte[bArr3.length + 32];
        System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
        ((t1) this.xdhPublicKey).b(bArr4, bArr3.length);
        return bArr4;
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    public BigInteger getU() {
        byte[] uEncoding = getUEncoding();
        org.bouncycastle.util.a.Q(uEncoding);
        return new BigInteger(1, uEncoding);
    }

    @Override // f60.c
    public byte[] getUEncoding() {
        b bVar = this.xdhPublicKey;
        return bVar instanceof w1 ? ((w1) bVar).getEncoded() : ((t1) bVar).getEncoded();
    }

    public int hashCode() {
        return org.bouncycastle.util.a.F(getEncoded());
    }

    public String toString() {
        return Utils.keyToString("Public Key", getAlgorithm(), this.xdhPublicKey);
    }
}