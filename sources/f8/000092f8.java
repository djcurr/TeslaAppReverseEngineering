package org.bouncycastle.jcajce.provider.asymmetric.util;

import e40.b;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import k60.n;
import org.bouncycastle.asn1.h;
import org.bouncycastle.asn1.k;
import org.bouncycastle.asn1.m;

/* loaded from: classes5.dex */
public class PKCS12BagAttributeCarrierImpl implements n {
    private Hashtable pkcs12Attributes;
    private Vector pkcs12Ordering;

    public PKCS12BagAttributeCarrierImpl() {
        this(new Hashtable(), new Vector());
    }

    PKCS12BagAttributeCarrierImpl(Hashtable hashtable, Vector vector) {
        this.pkcs12Attributes = hashtable;
        this.pkcs12Ordering = vector;
    }

    Hashtable getAttributes() {
        return this.pkcs12Attributes;
    }

    @Override // k60.n
    public b getBagAttribute(k kVar) {
        return (b) this.pkcs12Attributes.get(kVar);
    }

    @Override // k60.n
    public Enumeration getBagAttributeKeys() {
        return this.pkcs12Ordering.elements();
    }

    Vector getOrdering() {
        return this.pkcs12Ordering;
    }

    public void readObject(ObjectInputStream objectInputStream) {
        Object readObject = objectInputStream.readObject();
        if (readObject instanceof Hashtable) {
            this.pkcs12Attributes = (Hashtable) readObject;
            this.pkcs12Ordering = (Vector) objectInputStream.readObject();
            return;
        }
        h hVar = new h((byte[]) readObject);
        while (true) {
            k kVar = (k) hVar.D();
            if (kVar == null) {
                return;
            }
            setBagAttribute(kVar, hVar.D());
        }
    }

    @Override // k60.n
    public void setBagAttribute(k kVar, b bVar) {
        if (this.pkcs12Attributes.containsKey(kVar)) {
            this.pkcs12Attributes.put(kVar, bVar);
            return;
        }
        this.pkcs12Attributes.put(kVar, bVar);
        this.pkcs12Ordering.addElement(kVar);
    }

    int size() {
        return this.pkcs12Ordering.size();
    }

    public void writeObject(ObjectOutputStream objectOutputStream) {
        if (this.pkcs12Ordering.size() == 0) {
            objectOutputStream.writeObject(new Hashtable());
            objectOutputStream.writeObject(new Vector());
            return;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        m a11 = m.a(byteArrayOutputStream);
        Enumeration bagAttributeKeys = getBagAttributeKeys();
        while (bagAttributeKeys.hasMoreElements()) {
            k u11 = k.u(bagAttributeKeys.nextElement());
            a11.t(u11);
            a11.s((b) this.pkcs12Attributes.get(u11));
        }
        objectOutputStream.writeObject(byteArrayOutputStream.toByteArray());
    }
}