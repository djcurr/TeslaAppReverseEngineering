package org.spongycastle.asn1.cmp;

import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;

/* loaded from: classes6.dex */
public class POPODecKeyChallContent extends ASN1Object {
    private ASN1Sequence content;

    private POPODecKeyChallContent(ASN1Sequence aSN1Sequence) {
        this.content = aSN1Sequence;
    }

    public static POPODecKeyChallContent getInstance(Object obj) {
        if (obj instanceof POPODecKeyChallContent) {
            return (POPODecKeyChallContent) obj;
        }
        if (obj != null) {
            return new POPODecKeyChallContent(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.content;
    }

    public Challenge[] toChallengeArray() {
        int size = this.content.size();
        Challenge[] challengeArr = new Challenge[size];
        for (int i11 = 0; i11 != size; i11++) {
            challengeArr[i11] = Challenge.getInstance(this.content.getObjectAt(i11));
        }
        return challengeArr;
    }
}