package org.spongycastle.asn1.dvcs;

import java.util.Arrays;
import org.spongycastle.asn1.ASN1Boolean;
import org.spongycastle.asn1.ASN1Encodable;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.ASN1TaggedObject;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.asn1.DERTaggedObject;
import org.spongycastle.asn1.x509.PolicyInformation;

/* loaded from: classes6.dex */
public class PathProcInput extends ASN1Object {
    private PolicyInformation[] acceptablePolicySet;
    private boolean explicitPolicyReqd;
    private boolean inhibitAnyPolicy;
    private boolean inhibitPolicyMapping;

    public PathProcInput(PolicyInformation[] policyInformationArr) {
        this.inhibitPolicyMapping = false;
        this.explicitPolicyReqd = false;
        this.inhibitAnyPolicy = false;
        this.acceptablePolicySet = policyInformationArr;
    }

    private static PolicyInformation[] fromSequence(ASN1Sequence aSN1Sequence) {
        int size = aSN1Sequence.size();
        PolicyInformation[] policyInformationArr = new PolicyInformation[size];
        for (int i11 = 0; i11 != size; i11++) {
            policyInformationArr[i11] = PolicyInformation.getInstance(aSN1Sequence.getObjectAt(i11));
        }
        return policyInformationArr;
    }

    public static PathProcInput getInstance(Object obj) {
        if (obj instanceof PathProcInput) {
            return (PathProcInput) obj;
        }
        if (obj != null) {
            ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
            PathProcInput pathProcInput = new PathProcInput(fromSequence(ASN1Sequence.getInstance(aSN1Sequence.getObjectAt(0))));
            for (int i11 = 1; i11 < aSN1Sequence.size(); i11++) {
                ASN1Encodable objectAt = aSN1Sequence.getObjectAt(i11);
                if (objectAt instanceof ASN1Boolean) {
                    pathProcInput.setInhibitPolicyMapping(ASN1Boolean.getInstance(objectAt).isTrue());
                } else if (objectAt instanceof ASN1TaggedObject) {
                    ASN1TaggedObject aSN1TaggedObject = ASN1TaggedObject.getInstance(objectAt);
                    int tagNo = aSN1TaggedObject.getTagNo();
                    if (tagNo == 0) {
                        pathProcInput.setExplicitPolicyReqd(ASN1Boolean.getInstance(aSN1TaggedObject, false).isTrue());
                    } else if (tagNo == 1) {
                        pathProcInput.setInhibitAnyPolicy(ASN1Boolean.getInstance(aSN1TaggedObject, false).isTrue());
                    } else {
                        throw new IllegalArgumentException("Unknown tag encountered: " + aSN1TaggedObject.getTagNo());
                    }
                } else {
                    continue;
                }
            }
            return pathProcInput;
        }
        return null;
    }

    private void setExplicitPolicyReqd(boolean z11) {
        this.explicitPolicyReqd = z11;
    }

    private void setInhibitAnyPolicy(boolean z11) {
        this.inhibitAnyPolicy = z11;
    }

    private void setInhibitPolicyMapping(boolean z11) {
        this.inhibitPolicyMapping = z11;
    }

    public PolicyInformation[] getAcceptablePolicySet() {
        return this.acceptablePolicySet;
    }

    public boolean isExplicitPolicyReqd() {
        return this.explicitPolicyReqd;
    }

    public boolean isInhibitAnyPolicy() {
        return this.inhibitAnyPolicy;
    }

    public boolean isInhibitPolicyMapping() {
        return this.inhibitPolicyMapping;
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector();
        int i11 = 0;
        while (true) {
            PolicyInformation[] policyInformationArr = this.acceptablePolicySet;
            if (i11 == policyInformationArr.length) {
                break;
            }
            aSN1EncodableVector2.add(policyInformationArr[i11]);
            i11++;
        }
        aSN1EncodableVector.add(new DERSequence(aSN1EncodableVector2));
        boolean z11 = this.inhibitPolicyMapping;
        if (z11) {
            aSN1EncodableVector.add(ASN1Boolean.getInstance(z11));
        }
        if (this.explicitPolicyReqd) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 0, ASN1Boolean.getInstance(this.explicitPolicyReqd)));
        }
        if (this.inhibitAnyPolicy) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 1, ASN1Boolean.getInstance(this.inhibitAnyPolicy)));
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public String toString() {
        return "PathProcInput: {\nacceptablePolicySet: " + Arrays.asList(this.acceptablePolicySet) + "\ninhibitPolicyMapping: " + this.inhibitPolicyMapping + "\nexplicitPolicyReqd: " + this.explicitPolicyReqd + "\ninhibitAnyPolicy: " + this.inhibitAnyPolicy + "\n}\n";
    }

    public PathProcInput(PolicyInformation[] policyInformationArr, boolean z11, boolean z12, boolean z13) {
        this.inhibitPolicyMapping = false;
        this.explicitPolicyReqd = false;
        this.inhibitAnyPolicy = false;
        this.acceptablePolicySet = policyInformationArr;
        this.inhibitPolicyMapping = z11;
        this.explicitPolicyReqd = z12;
        this.inhibitAnyPolicy = z13;
    }

    public static PathProcInput getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z11) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z11));
    }
}