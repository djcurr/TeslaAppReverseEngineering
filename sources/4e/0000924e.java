package org.bouncycastle.jcajce.provider.asymmetric.edec;

import f60.c;
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
import u50.s1;
import u50.v1;
import w40.p;
import z50.f;

/* loaded from: classes5.dex */
public class BCXDHPrivateKey implements Key, PrivateKey {
    static final long serialVersionUID = 1;
    private final byte[] attributes;
    private final boolean hasPublicKey;
    transient b xdhPrivateKey;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BCXDHPrivateKey(b bVar) {
        this.hasPublicKey = true;
        this.attributes = null;
        this.xdhPrivateKey = bVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BCXDHPrivateKey(p pVar) {
        this.hasPublicKey = pVar.m();
        this.attributes = pVar.e() != null ? pVar.e().getEncoded() : null;
        populateFromPrivateKeyInfo(pVar);
    }

    private void populateFromPrivateKeyInfo(p pVar) {
        byte[] r11 = pVar.h().r();
        if (r11.length != 32 && r11.length != 56) {
            r11 = l.p(pVar.n()).r();
        }
        this.xdhPrivateKey = a.f33206c.j(pVar.i().e()) ? new v1(r11) : new s1(r11);
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
        return this.xdhPrivateKey;
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
        return this.xdhPrivateKey instanceof v1 ? "X448" : "X25519";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            q q11 = q.q(this.attributes);
            p b11 = f.b(this.xdhPrivateKey, q11);
            return (!this.hasPublicKey || j.c("org.bouncycastle.pkcs8.v1_info_only")) ? new p(b11.i(), b11.n(), q11).getEncoded() : b11.getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    public c getPublicKey() {
        b bVar = this.xdhPrivateKey;
        return bVar instanceof v1 ? new BCXDHPublicKey(((v1) bVar).b()) : new BCXDHPublicKey(((s1) bVar).b());
    }

    public int hashCode() {
        return org.bouncycastle.util.a.F(getEncoded());
    }

    public String toString() {
        b bVar = this.xdhPrivateKey;
        return Utils.keyToString("Private Key", getAlgorithm(), bVar instanceof v1 ? ((v1) bVar).b() : ((s1) bVar).b());
    }
}