package org.spongycastle.asn1.x509;

import java.util.Hashtable;
import java.util.Vector;
import org.spongycastle.asn1.ASN1Encodable;
import org.spongycastle.asn1.ASN1Encoding;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.DEROctetString;

/* loaded from: classes5.dex */
public class ExtensionsGenerator {
    private Hashtable extensions = new Hashtable();
    private Vector extOrdering = new Vector();

    public void addExtension(ASN1ObjectIdentifier aSN1ObjectIdentifier, boolean z11, ASN1Encodable aSN1Encodable) {
        addExtension(aSN1ObjectIdentifier, z11, aSN1Encodable.toASN1Primitive().getEncoded(ASN1Encoding.DER));
    }

    public Extensions generate() {
        Extension[] extensionArr = new Extension[this.extOrdering.size()];
        for (int i11 = 0; i11 != this.extOrdering.size(); i11++) {
            extensionArr[i11] = (Extension) this.extensions.get(this.extOrdering.elementAt(i11));
        }
        return new Extensions(extensionArr);
    }

    public boolean isEmpty() {
        return this.extOrdering.isEmpty();
    }

    public void reset() {
        this.extensions = new Hashtable();
        this.extOrdering = new Vector();
    }

    public void addExtension(ASN1ObjectIdentifier aSN1ObjectIdentifier, boolean z11, byte[] bArr) {
        if (!this.extensions.containsKey(aSN1ObjectIdentifier)) {
            this.extOrdering.addElement(aSN1ObjectIdentifier);
            this.extensions.put(aSN1ObjectIdentifier, new Extension(aSN1ObjectIdentifier, z11, new DEROctetString(bArr)));
            return;
        }
        throw new IllegalArgumentException("extension " + aSN1ObjectIdentifier + " already added");
    }

    public void addExtension(Extension extension) {
        if (!this.extensions.containsKey(extension.getExtnId())) {
            this.extOrdering.addElement(extension.getExtnId());
            this.extensions.put(extension.getExtnId(), extension);
            return;
        }
        throw new IllegalArgumentException("extension " + extension.getExtnId() + " already added");
    }
}