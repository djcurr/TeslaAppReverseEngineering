package org.spongycastle.asn1;

import java.util.Enumeration;
import java.util.Vector;

/* loaded from: classes6.dex */
public class ASN1EncodableVector {

    /* renamed from: v  reason: collision with root package name */
    private final Vector f43362v = new Vector();

    public void add(ASN1Encodable aSN1Encodable) {
        this.f43362v.addElement(aSN1Encodable);
    }

    public void addAll(ASN1EncodableVector aSN1EncodableVector) {
        Enumeration elements = aSN1EncodableVector.f43362v.elements();
        while (elements.hasMoreElements()) {
            this.f43362v.addElement(elements.nextElement());
        }
    }

    public ASN1Encodable get(int i11) {
        return (ASN1Encodable) this.f43362v.elementAt(i11);
    }

    public int size() {
        return this.f43362v.size();
    }
}