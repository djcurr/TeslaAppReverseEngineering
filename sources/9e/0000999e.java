package org.spongycastle.asn1.x509;

import java.io.IOException;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1GeneralizedTime;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.ASN1UTCTime;
import org.spongycastle.asn1.DEROctetString;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.asn1.DERTaggedObject;
import org.spongycastle.asn1.x500.X500Name;

/* loaded from: classes5.dex */
public class V2TBSCertListGenerator {
    private static final ASN1Sequence[] reasons;
    private X500Name issuer;
    private AlgorithmIdentifier signature;
    private Time thisUpdate;
    private ASN1Integer version = new ASN1Integer(1);
    private Time nextUpdate = null;
    private Extensions extensions = null;
    private ASN1EncodableVector crlentries = new ASN1EncodableVector();

    static {
        reasons = r0;
        ASN1Sequence[] aSN1SequenceArr = {createReasonExtension(0), createReasonExtension(1), createReasonExtension(2), createReasonExtension(3), createReasonExtension(4), createReasonExtension(5), createReasonExtension(6), createReasonExtension(7), createReasonExtension(8), createReasonExtension(9), createReasonExtension(10)};
    }

    private static ASN1Sequence createInvalidityDateExtension(ASN1GeneralizedTime aSN1GeneralizedTime) {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        try {
            aSN1EncodableVector.add(Extension.invalidityDate);
            aSN1EncodableVector.add(new DEROctetString(aSN1GeneralizedTime.getEncoded()));
            return new DERSequence(aSN1EncodableVector);
        } catch (IOException e11) {
            throw new IllegalArgumentException("error encoding reason: " + e11);
        }
    }

    private static ASN1Sequence createReasonExtension(int i11) {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        CRLReason lookup = CRLReason.lookup(i11);
        try {
            aSN1EncodableVector.add(Extension.reasonCode);
            aSN1EncodableVector.add(new DEROctetString(lookup.getEncoded()));
            return new DERSequence(aSN1EncodableVector);
        } catch (IOException e11) {
            throw new IllegalArgumentException("error encoding reason: " + e11);
        }
    }

    private void internalAddCRLEntry(ASN1Integer aSN1Integer, Time time, ASN1Sequence aSN1Sequence) {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(aSN1Integer);
        aSN1EncodableVector.add(time);
        if (aSN1Sequence != null) {
            aSN1EncodableVector.add(aSN1Sequence);
        }
        addCRLEntry(new DERSequence(aSN1EncodableVector));
    }

    public void addCRLEntry(ASN1Sequence aSN1Sequence) {
        this.crlentries.add(aSN1Sequence);
    }

    public TBSCertList generateTBSCertList() {
        if (this.signature != null && this.issuer != null && this.thisUpdate != null) {
            ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
            aSN1EncodableVector.add(this.version);
            aSN1EncodableVector.add(this.signature);
            aSN1EncodableVector.add(this.issuer);
            aSN1EncodableVector.add(this.thisUpdate);
            Time time = this.nextUpdate;
            if (time != null) {
                aSN1EncodableVector.add(time);
            }
            if (this.crlentries.size() != 0) {
                aSN1EncodableVector.add(new DERSequence(this.crlentries));
            }
            if (this.extensions != null) {
                aSN1EncodableVector.add(new DERTaggedObject(0, this.extensions));
            }
            return new TBSCertList(new DERSequence(aSN1EncodableVector));
        }
        throw new IllegalStateException("Not all mandatory fields set in V2 TBSCertList generator.");
    }

    public void setExtensions(X509Extensions x509Extensions) {
        setExtensions(Extensions.getInstance(x509Extensions));
    }

    public void setIssuer(X509Name x509Name) {
        this.issuer = X500Name.getInstance(x509Name.toASN1Primitive());
    }

    public void setNextUpdate(ASN1UTCTime aSN1UTCTime) {
        this.nextUpdate = new Time(aSN1UTCTime);
    }

    public void setSignature(AlgorithmIdentifier algorithmIdentifier) {
        this.signature = algorithmIdentifier;
    }

    public void setThisUpdate(ASN1UTCTime aSN1UTCTime) {
        this.thisUpdate = new Time(aSN1UTCTime);
    }

    public void addCRLEntry(ASN1Integer aSN1Integer, ASN1UTCTime aSN1UTCTime, int i11) {
        addCRLEntry(aSN1Integer, new Time(aSN1UTCTime), i11);
    }

    public void setExtensions(Extensions extensions) {
        this.extensions = extensions;
    }

    public void setIssuer(X500Name x500Name) {
        this.issuer = x500Name;
    }

    public void setNextUpdate(Time time) {
        this.nextUpdate = time;
    }

    public void setThisUpdate(Time time) {
        this.thisUpdate = time;
    }

    public void addCRLEntry(ASN1Integer aSN1Integer, Time time, int i11) {
        addCRLEntry(aSN1Integer, time, i11, null);
    }

    public void addCRLEntry(ASN1Integer aSN1Integer, Time time, int i11, ASN1GeneralizedTime aSN1GeneralizedTime) {
        if (i11 == 0) {
            if (aSN1GeneralizedTime != null) {
                ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
                aSN1EncodableVector.add(createInvalidityDateExtension(aSN1GeneralizedTime));
                internalAddCRLEntry(aSN1Integer, time, new DERSequence(aSN1EncodableVector));
                return;
            }
            addCRLEntry(aSN1Integer, time, (Extensions) null);
            return;
        }
        ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector();
        ASN1Sequence[] aSN1SequenceArr = reasons;
        if (i11 >= aSN1SequenceArr.length) {
            aSN1EncodableVector2.add(createReasonExtension(i11));
        } else if (i11 >= 0) {
            aSN1EncodableVector2.add(aSN1SequenceArr[i11]);
        } else {
            throw new IllegalArgumentException("invalid reason value: " + i11);
        }
        if (aSN1GeneralizedTime != null) {
            aSN1EncodableVector2.add(createInvalidityDateExtension(aSN1GeneralizedTime));
        }
        internalAddCRLEntry(aSN1Integer, time, new DERSequence(aSN1EncodableVector2));
    }

    public void addCRLEntry(ASN1Integer aSN1Integer, Time time, Extensions extensions) {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(aSN1Integer);
        aSN1EncodableVector.add(time);
        if (extensions != null) {
            aSN1EncodableVector.add(extensions);
        }
        addCRLEntry(new DERSequence(aSN1EncodableVector));
    }
}