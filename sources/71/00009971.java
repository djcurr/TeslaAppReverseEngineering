package org.spongycastle.asn1.x509;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.spongycastle.asn1.ASN1Encodable;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.ASN1TaggedObject;
import org.spongycastle.asn1.DERSequence;

/* loaded from: classes5.dex */
public class Extensions extends ASN1Object {
    private Hashtable extensions;
    private Vector ordering;

    private Extensions(ASN1Sequence aSN1Sequence) {
        this.extensions = new Hashtable();
        this.ordering = new Vector();
        Enumeration objects = aSN1Sequence.getObjects();
        while (objects.hasMoreElements()) {
            Extension extension = Extension.getInstance(objects.nextElement());
            this.extensions.put(extension.getExtnId(), extension);
            this.ordering.addElement(extension.getExtnId());
        }
    }

    public static Extensions getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z11) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z11));
    }

    private ASN1ObjectIdentifier[] toOidArray(Vector vector) {
        int size = vector.size();
        ASN1ObjectIdentifier[] aSN1ObjectIdentifierArr = new ASN1ObjectIdentifier[size];
        for (int i11 = 0; i11 != size; i11++) {
            aSN1ObjectIdentifierArr[i11] = (ASN1ObjectIdentifier) vector.elementAt(i11);
        }
        return aSN1ObjectIdentifierArr;
    }

    public boolean equivalent(Extensions extensions) {
        if (this.extensions.size() != extensions.extensions.size()) {
            return false;
        }
        Enumeration keys = this.extensions.keys();
        while (keys.hasMoreElements()) {
            Object nextElement = keys.nextElement();
            if (!this.extensions.get(nextElement).equals(extensions.extensions.get(nextElement))) {
                return false;
            }
        }
        return true;
    }

    public ASN1ObjectIdentifier[] getCriticalExtensionOIDs() {
        return getExtensionOIDs(true);
    }

    public Extension getExtension(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (Extension) this.extensions.get(aSN1ObjectIdentifier);
    }

    public ASN1ObjectIdentifier[] getExtensionOIDs() {
        return toOidArray(this.ordering);
    }

    public ASN1Encodable getExtensionParsedValue(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        Extension extension = getExtension(aSN1ObjectIdentifier);
        if (extension != null) {
            return extension.getParsedValue();
        }
        return null;
    }

    public ASN1ObjectIdentifier[] getNonCriticalExtensionOIDs() {
        return getExtensionOIDs(false);
    }

    public Enumeration oids() {
        return this.ordering.elements();
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        Enumeration elements = this.ordering.elements();
        while (elements.hasMoreElements()) {
            aSN1EncodableVector.add((Extension) this.extensions.get((ASN1ObjectIdentifier) elements.nextElement()));
        }
        return new DERSequence(aSN1EncodableVector);
    }

    private ASN1ObjectIdentifier[] getExtensionOIDs(boolean z11) {
        Vector vector = new Vector();
        for (int i11 = 0; i11 != this.ordering.size(); i11++) {
            Object elementAt = this.ordering.elementAt(i11);
            if (((Extension) this.extensions.get(elementAt)).isCritical() == z11) {
                vector.addElement(elementAt);
            }
        }
        return toOidArray(vector);
    }

    public static Extensions getInstance(Object obj) {
        if (obj instanceof Extensions) {
            return (Extensions) obj;
        }
        if (obj != null) {
            return new Extensions(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public Extensions(Extension extension) {
        this.extensions = new Hashtable();
        Vector vector = new Vector();
        this.ordering = vector;
        vector.addElement(extension.getExtnId());
        this.extensions.put(extension.getExtnId(), extension);
    }

    public Extensions(Extension[] extensionArr) {
        this.extensions = new Hashtable();
        this.ordering = new Vector();
        for (int i11 = 0; i11 != extensionArr.length; i11++) {
            Extension extension = extensionArr[i11];
            this.ordering.addElement(extension.getExtnId());
            this.extensions.put(extension.getExtnId(), extension);
        }
    }
}