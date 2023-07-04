package org.bouncycastle.jcajce.provider.asymmetric.edec;

import j40.a;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.Key;
import java.security.PrivateKey;
import org.bouncycastle.asn1.l;
import org.bouncycastle.asn1.q;
import r70.j;
import u50.b;
import u50.g0;
import u50.j0;
import w40.p;
import z50.f;

/* loaded from: classes5.dex */
public class BCEdDSAPrivateKey implements Key, PrivateKey {
    static final long serialVersionUID = 1;
    private final byte[] attributes;
    transient b eddsaPrivateKey;
    private final boolean hasPublicKey;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BCEdDSAPrivateKey(b bVar) {
        this.hasPublicKey = true;
        this.attributes = null;
        this.eddsaPrivateKey = bVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BCEdDSAPrivateKey(p pVar) {
        this.hasPublicKey = pVar.m();
        this.attributes = pVar.e() != null ? pVar.e().getEncoded() : null;
        populateFromPrivateKeyInfo(pVar);
    }

    private void populateFromPrivateKeyInfo(p pVar) {
        byte[] r11 = l.p(pVar.n()).r();
        this.eddsaPrivateKey = a.f33208e.j(pVar.i().e()) ? new j0(r11) : new g0(r11);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        populateFromPrivateKeyInfo(p.f((byte[]) objectInputStream.readObject()));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b engineGetKeyParameters() {
        return this.eddsaPrivateKey;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PrivateKey) {
            return org.bouncycastle.util.a.c(((PrivateKey) obj).getEncoded(), getEncoded());
        }
        return false;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return this.eddsaPrivateKey instanceof j0 ? "Ed448" : "Ed25519";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            q q11 = q.q(this.attributes);
            p b11 = f.b(this.eddsaPrivateKey, q11);
            return (!this.hasPublicKey || j.c("org.bouncycastle.pkcs8.v1_info_only")) ? new p(b11.i(), b11.n(), q11).getEncoded() : b11.getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    public f60.b getPublicKey() {
        b bVar = this.eddsaPrivateKey;
        return bVar instanceof j0 ? new BCEdDSAPublicKey(((j0) bVar).b()) : new BCEdDSAPublicKey(((g0) bVar).b());
    }

    public int hashCode() {
        return org.bouncycastle.util.a.F(getEncoded());
    }

    public String toString() {
        b bVar = this.eddsaPrivateKey;
        return Utils.keyToString("Private Key", getAlgorithm(), bVar instanceof j0 ? ((j0) bVar).b() : ((g0) bVar).b());
    }
}