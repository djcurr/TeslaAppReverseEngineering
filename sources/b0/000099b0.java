package org.spongycastle.asn1.x509.qualified;

import java.util.Enumeration;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.asn1.x509.GeneralName;

/* loaded from: classes5.dex */
public class SemanticsInformation extends ASN1Object {
    private GeneralName[] nameRegistrationAuthorities;
    private ASN1ObjectIdentifier semanticsIdentifier;

    private SemanticsInformation(ASN1Sequence aSN1Sequence) {
        Enumeration objects = aSN1Sequence.getObjects();
        if (aSN1Sequence.size() >= 1) {
            Object nextElement = objects.nextElement();
            if (nextElement instanceof ASN1ObjectIdentifier) {
                this.semanticsIdentifier = ASN1ObjectIdentifier.getInstance(nextElement);
                nextElement = objects.hasMoreElements() ? objects.nextElement() : null;
            }
            if (nextElement != null) {
                ASN1Sequence aSN1Sequence2 = ASN1Sequence.getInstance(nextElement);
                this.nameRegistrationAuthorities = new GeneralName[aSN1Sequence2.size()];
                for (int i11 = 0; i11 < aSN1Sequence2.size(); i11++) {
                    this.nameRegistrationAuthorities[i11] = GeneralName.getInstance(aSN1Sequence2.getObjectAt(i11));
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException("no objects in SemanticsInformation");
    }

    private static GeneralName[] cloneNames(GeneralName[] generalNameArr) {
        if (generalNameArr != null) {
            GeneralName[] generalNameArr2 = new GeneralName[generalNameArr.length];
            System.arraycopy(generalNameArr, 0, generalNameArr2, 0, generalNameArr.length);
            return generalNameArr2;
        }
        return null;
    }

    public static SemanticsInformation getInstance(Object obj) {
        if (obj instanceof SemanticsInformation) {
            return (SemanticsInformation) obj;
        }
        if (obj != null) {
            return new SemanticsInformation(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public GeneralName[] getNameRegistrationAuthorities() {
        return cloneNames(this.nameRegistrationAuthorities);
    }

    public ASN1ObjectIdentifier getSemanticsIdentifier() {
        return this.semanticsIdentifier;
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        ASN1ObjectIdentifier aSN1ObjectIdentifier = this.semanticsIdentifier;
        if (aSN1ObjectIdentifier != null) {
            aSN1EncodableVector.add(aSN1ObjectIdentifier);
        }
        if (this.nameRegistrationAuthorities != null) {
            ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector();
            int i11 = 0;
            while (true) {
                GeneralName[] generalNameArr = this.nameRegistrationAuthorities;
                if (i11 >= generalNameArr.length) {
                    break;
                }
                aSN1EncodableVector2.add(generalNameArr[i11]);
                i11++;
            }
            aSN1EncodableVector.add(new DERSequence(aSN1EncodableVector2));
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public SemanticsInformation(ASN1ObjectIdentifier aSN1ObjectIdentifier, GeneralName[] generalNameArr) {
        this.semanticsIdentifier = aSN1ObjectIdentifier;
        this.nameRegistrationAuthorities = cloneNames(generalNameArr);
    }

    public SemanticsInformation(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this.semanticsIdentifier = aSN1ObjectIdentifier;
        this.nameRegistrationAuthorities = null;
    }

    public SemanticsInformation(GeneralName[] generalNameArr) {
        this.semanticsIdentifier = null;
        this.nameRegistrationAuthorities = cloneNames(generalNameArr);
    }
}