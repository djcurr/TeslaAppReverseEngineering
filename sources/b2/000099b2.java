package org.spongycastle.asn1.x509.sigi;

import java.util.Enumeration;
import org.spongycastle.asn1.ASN1Choice;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.ASN1String;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.asn1.x500.DirectoryString;

/* loaded from: classes5.dex */
public class NameOrPseudonym extends ASN1Object implements ASN1Choice {
    private ASN1Sequence givenName;
    private DirectoryString pseudonym;
    private DirectoryString surname;

    public NameOrPseudonym(DirectoryString directoryString) {
        this.pseudonym = directoryString;
    }

    public static NameOrPseudonym getInstance(Object obj) {
        if (obj != null && !(obj instanceof NameOrPseudonym)) {
            if (obj instanceof ASN1String) {
                return new NameOrPseudonym(DirectoryString.getInstance(obj));
            }
            if (obj instanceof ASN1Sequence) {
                return new NameOrPseudonym((ASN1Sequence) obj);
            }
            throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
        }
        return (NameOrPseudonym) obj;
    }

    public DirectoryString[] getGivenName() {
        DirectoryString[] directoryStringArr = new DirectoryString[this.givenName.size()];
        Enumeration objects = this.givenName.getObjects();
        int i11 = 0;
        while (objects.hasMoreElements()) {
            directoryStringArr[i11] = DirectoryString.getInstance(objects.nextElement());
            i11++;
        }
        return directoryStringArr;
    }

    public DirectoryString getPseudonym() {
        return this.pseudonym;
    }

    public DirectoryString getSurname() {
        return this.surname;
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        DirectoryString directoryString = this.pseudonym;
        if (directoryString != null) {
            return directoryString.toASN1Primitive();
        }
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(this.surname);
        aSN1EncodableVector.add(this.givenName);
        return new DERSequence(aSN1EncodableVector);
    }

    private NameOrPseudonym(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() == 2) {
            if (aSN1Sequence.getObjectAt(0) instanceof ASN1String) {
                this.surname = DirectoryString.getInstance(aSN1Sequence.getObjectAt(0));
                this.givenName = ASN1Sequence.getInstance(aSN1Sequence.getObjectAt(1));
                return;
            }
            throw new IllegalArgumentException("Bad object encountered: " + aSN1Sequence.getObjectAt(0).getClass());
        }
        throw new IllegalArgumentException("Bad sequence size: " + aSN1Sequence.size());
    }

    public NameOrPseudonym(String str) {
        this(new DirectoryString(str));
    }

    public NameOrPseudonym(DirectoryString directoryString, ASN1Sequence aSN1Sequence) {
        this.surname = directoryString;
        this.givenName = aSN1Sequence;
    }
}