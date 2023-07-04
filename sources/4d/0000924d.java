package org.bouncycastle.jcajce.provider.asymmetric.edec;

import e50.m0;
import f60.b;
import j40.a;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import u50.h0;
import u50.k0;

/* loaded from: classes5.dex */
public class BCEdDSAPublicKey implements b {
    static final long serialVersionUID = 1;
    transient u50.b eddsaPublicKey;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BCEdDSAPublicKey(m0 m0Var) {
        populateFromPubKeyInfo(m0Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BCEdDSAPublicKey(u50.b bVar) {
        this.eddsaPublicKey = bVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BCEdDSAPublicKey(byte[] bArr, byte[] bArr2) {
        u50.b h0Var;
        int length = bArr.length;
        if (!Utils.isValidPrefix(bArr, bArr2)) {
            throw new InvalidKeySpecException("raw key data not recognised");
        }
        if (bArr2.length - length == 57) {
            h0Var = new k0(bArr2, length);
        } else if (bArr2.length - length != 32) {
            throw new InvalidKeySpecException("raw key data not recognised");
        } else {
            h0Var = new h0(bArr2, length);
        }
        this.eddsaPublicKey = h0Var;
    }

    private void populateFromPubKeyInfo(m0 m0Var) {
        byte[] r11 = m0Var.i().r();
        this.eddsaPublicKey = a.f33208e.j(m0Var.e().e()) ? new k0(r11) : new h0(r11);
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
    public u50.b engineGetKeyParameters() {
        return this.eddsaPublicKey;
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
        return this.eddsaPublicKey instanceof k0 ? "Ed448" : "Ed25519";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        if (this.eddsaPublicKey instanceof k0) {
            byte[] bArr = KeyFactorySpi.Ed448Prefix;
            byte[] bArr2 = new byte[bArr.length + 57];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            ((k0) this.eddsaPublicKey).b(bArr2, bArr.length);
            return bArr2;
        }
        byte[] bArr3 = KeyFactorySpi.Ed25519Prefix;
        byte[] bArr4 = new byte[bArr3.length + 32];
        System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
        ((h0) this.eddsaPublicKey).b(bArr4, bArr3.length);
        return bArr4;
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    @Override // f60.b
    public byte[] getPointEncoding() {
        u50.b bVar = this.eddsaPublicKey;
        return bVar instanceof k0 ? ((k0) bVar).getEncoded() : ((h0) bVar).getEncoded();
    }

    public int hashCode() {
        return org.bouncycastle.util.a.F(getEncoded());
    }

    public String toString() {
        return Utils.keyToString("Public Key", getAlgorithm(), this.eddsaPublicKey);
    }
}