package org.bouncycastle.jcajce.provider.asymmetric.gost;

import e40.b;
import i40.a;
import i40.f;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.util.Enumeration;
import k60.h;
import k60.i;
import k60.n;
import l60.l;
import l60.m;
import org.bouncycastle.asn1.k;
import org.bouncycastle.asn1.s0;
import org.bouncycastle.jcajce.provider.asymmetric.util.GOST3410Util;
import org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl;
import org.spongycastle.asn1.ASN1Encoding;
import u50.u0;
import w40.p;

/* loaded from: classes5.dex */
public class BCGOST3410PrivateKey implements i, n {
    static final long serialVersionUID = 8581661527592305464L;
    private transient n attrCarrier = new PKCS12BagAttributeCarrierImpl();
    private transient h gost3410Spec;

    /* renamed from: x  reason: collision with root package name */
    private BigInteger f43173x;

    protected BCGOST3410PrivateKey() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BCGOST3410PrivateKey(i iVar) {
        this.f43173x = iVar.getX();
        this.gost3410Spec = iVar.getParameters();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BCGOST3410PrivateKey(m mVar) {
        this.f43173x = mVar.d();
        this.gost3410Spec = new l(new l60.n(mVar.b(), mVar.c(), mVar.a()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BCGOST3410PrivateKey(u0 u0Var, l lVar) {
        this.f43173x = u0Var.c();
        this.gost3410Spec = lVar;
        if (lVar == null) {
            throw new IllegalArgumentException("spec is null");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BCGOST3410PrivateKey(p pVar) {
        BigInteger bigInteger;
        f h11 = f.h(pVar.i().i());
        b n11 = pVar.n();
        if (n11 instanceof org.bouncycastle.asn1.i) {
            bigInteger = org.bouncycastle.asn1.i.p(n11).r();
        } else {
            byte[] r11 = org.bouncycastle.asn1.l.p(pVar.n()).r();
            byte[] bArr = new byte[r11.length];
            for (int i11 = 0; i11 != r11.length; i11++) {
                bArr[i11] = r11[(r11.length - 1) - i11];
            }
            bigInteger = new BigInteger(1, bArr);
        }
        this.f43173x = bigInteger;
        this.gost3410Spec = l.a(h11);
    }

    private boolean compareObj(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        return obj.equals(obj2);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        String str = (String) objectInputStream.readObject();
        if (str != null) {
            this.gost3410Spec = new l(str, (String) objectInputStream.readObject(), (String) objectInputStream.readObject());
        } else {
            this.gost3410Spec = new l(new l60.n((BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject()));
            objectInputStream.readObject();
            objectInputStream.readObject();
        }
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
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
        if (obj instanceof i) {
            i iVar = (i) obj;
            return getX().equals(iVar.getX()) && getParameters().getPublicKeyParameters().equals(iVar.getParameters().getPublicKeyParameters()) && getParameters().getDigestParamSetOID().equals(iVar.getParameters().getDigestParamSetOID()) && compareObj(getParameters().getEncryptionParamSetOID(), iVar.getParameters().getEncryptionParamSetOID());
        }
        return false;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "GOST3410";
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
        byte[] byteArray = getX().toByteArray();
        byte[] bArr = new byte[byteArray[0] == 0 ? byteArray.length - 1 : byteArray.length];
        for (int i11 = 0; i11 != bArr.length; i11++) {
            bArr[i11] = byteArray[(byteArray.length - 1) - i11];
        }
        try {
            return (this.gost3410Spec instanceof l ? new p(new e50.b(a.f29849l, new f(new k(this.gost3410Spec.getPublicKeyParamSetOID()), new k(this.gost3410Spec.getDigestParamSetOID()))), new s0(bArr)) : new p(new e50.b(a.f29849l), new s0(bArr))).d(ASN1Encoding.DER);
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    @Override // k60.g
    public h getParameters() {
        return this.gost3410Spec;
    }

    @Override // k60.i
    public BigInteger getX() {
        return this.f43173x;
    }

    public int hashCode() {
        return getX().hashCode() ^ this.gost3410Spec.hashCode();
    }

    @Override // k60.n
    public void setBagAttribute(k kVar, b bVar) {
        this.attrCarrier.setBagAttribute(kVar, bVar);
    }

    public String toString() {
        try {
            return GOSTUtil.privateKeyToString("GOST3410", this.f43173x, ((u0) GOST3410Util.generatePrivateKeyParameter(this)).b());
        } catch (InvalidKeyException e11) {
            throw new IllegalStateException(e11.getMessage());
        }
    }
}