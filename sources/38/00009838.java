package org.spongycastle.asn1.cms;

import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1OctetString;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.ASN1TaggedObject;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.asn1.DERTaggedObject;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;

/* loaded from: classes6.dex */
public class KeyAgreeRecipientInfo extends ASN1Object {
    private AlgorithmIdentifier keyEncryptionAlgorithm;
    private OriginatorIdentifierOrKey originator;
    private ASN1Sequence recipientEncryptedKeys;
    private ASN1OctetString ukm;
    private ASN1Integer version;

    public KeyAgreeRecipientInfo(OriginatorIdentifierOrKey originatorIdentifierOrKey, ASN1OctetString aSN1OctetString, AlgorithmIdentifier algorithmIdentifier, ASN1Sequence aSN1Sequence) {
        this.version = new ASN1Integer(3L);
        this.originator = originatorIdentifierOrKey;
        this.ukm = aSN1OctetString;
        this.keyEncryptionAlgorithm = algorithmIdentifier;
        this.recipientEncryptedKeys = aSN1Sequence;
    }

    public static KeyAgreeRecipientInfo getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z11) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z11));
    }

    public AlgorithmIdentifier getKeyEncryptionAlgorithm() {
        return this.keyEncryptionAlgorithm;
    }

    public OriginatorIdentifierOrKey getOriginator() {
        return this.originator;
    }

    public ASN1Sequence getRecipientEncryptedKeys() {
        return this.recipientEncryptedKeys;
    }

    public ASN1OctetString getUserKeyingMaterial() {
        return this.ukm;
    }

    public ASN1Integer getVersion() {
        return this.version;
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(this.version);
        aSN1EncodableVector.add(new DERTaggedObject(true, 0, this.originator));
        if (this.ukm != null) {
            aSN1EncodableVector.add(new DERTaggedObject(true, 1, this.ukm));
        }
        aSN1EncodableVector.add(this.keyEncryptionAlgorithm);
        aSN1EncodableVector.add(this.recipientEncryptedKeys);
        return new DERSequence(aSN1EncodableVector);
    }

    public static KeyAgreeRecipientInfo getInstance(Object obj) {
        if (obj instanceof KeyAgreeRecipientInfo) {
            return (KeyAgreeRecipientInfo) obj;
        }
        if (obj != null) {
            return new KeyAgreeRecipientInfo(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public KeyAgreeRecipientInfo(ASN1Sequence aSN1Sequence) {
        this.version = (ASN1Integer) aSN1Sequence.getObjectAt(0);
        this.originator = OriginatorIdentifierOrKey.getInstance((ASN1TaggedObject) aSN1Sequence.getObjectAt(1), true);
        int i11 = 2;
        if (aSN1Sequence.getObjectAt(2) instanceof ASN1TaggedObject) {
            this.ukm = ASN1OctetString.getInstance((ASN1TaggedObject) aSN1Sequence.getObjectAt(2), true);
            i11 = 3;
        }
        this.keyEncryptionAlgorithm = AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(i11));
        this.recipientEncryptedKeys = (ASN1Sequence) aSN1Sequence.getObjectAt(i11 + 1);
    }
}