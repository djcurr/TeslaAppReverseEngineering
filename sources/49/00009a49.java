package org.spongycastle.cert.ocsp;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Encoding;
import org.spongycastle.asn1.DERBitString;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.asn1.ocsp.OCSPRequest;
import org.spongycastle.asn1.ocsp.Request;
import org.spongycastle.asn1.ocsp.Signature;
import org.spongycastle.asn1.ocsp.TBSRequest;
import org.spongycastle.asn1.x500.X500Name;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;
import org.spongycastle.asn1.x509.Extensions;
import org.spongycastle.asn1.x509.GeneralName;
import org.spongycastle.cert.X509CertificateHolder;
import org.spongycastle.operator.ContentSigner;

/* loaded from: classes5.dex */
public class OCSPReqBuilder {
    private List list = new ArrayList();
    private GeneralName requestorName = null;
    private Extensions requestExtensions = null;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public class RequestObject {
        CertificateID certId;
        Extensions extensions;

        public RequestObject(CertificateID certificateID, Extensions extensions) {
            this.certId = certificateID;
            this.extensions = extensions;
        }

        public Request toRequest() {
            return new Request(this.certId.toASN1Primitive(), this.extensions);
        }
    }

    private OCSPReq generateRequest(ContentSigner contentSigner, X509CertificateHolder[] x509CertificateHolderArr) {
        Signature signature;
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        for (RequestObject requestObject : this.list) {
            try {
                aSN1EncodableVector.add(requestObject.toRequest());
            } catch (Exception e11) {
                throw new OCSPException("exception creating Request", e11);
            }
        }
        TBSRequest tBSRequest = new TBSRequest(this.requestorName, new DERSequence(aSN1EncodableVector), this.requestExtensions);
        Signature signature2 = null;
        if (contentSigner != null) {
            if (this.requestorName != null) {
                try {
                    OutputStream outputStream = contentSigner.getOutputStream();
                    outputStream.write(tBSRequest.getEncoded(ASN1Encoding.DER));
                    outputStream.close();
                    DERBitString dERBitString = new DERBitString(contentSigner.getSignature());
                    AlgorithmIdentifier algorithmIdentifier = contentSigner.getAlgorithmIdentifier();
                    if (x509CertificateHolderArr != null && x509CertificateHolderArr.length > 0) {
                        ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector();
                        for (int i11 = 0; i11 != x509CertificateHolderArr.length; i11++) {
                            aSN1EncodableVector2.add(x509CertificateHolderArr[i11].toASN1Structure());
                        }
                        signature = new Signature(algorithmIdentifier, dERBitString, new DERSequence(aSN1EncodableVector2));
                    } else {
                        signature = new Signature(algorithmIdentifier, dERBitString);
                    }
                    signature2 = signature;
                } catch (Exception e12) {
                    throw new OCSPException("exception processing TBSRequest: " + e12, e12);
                }
            } else {
                throw new OCSPException("requestorName must be specified if request is signed.");
            }
        }
        return new OCSPReq(new OCSPRequest(tBSRequest, signature2));
    }

    public OCSPReqBuilder addRequest(CertificateID certificateID) {
        this.list.add(new RequestObject(certificateID, null));
        return this;
    }

    public OCSPReq build() {
        return generateRequest(null, null);
    }

    public OCSPReqBuilder setRequestExtensions(Extensions extensions) {
        this.requestExtensions = extensions;
        return this;
    }

    public OCSPReqBuilder setRequestorName(X500Name x500Name) {
        this.requestorName = new GeneralName(4, x500Name);
        return this;
    }

    public OCSPReqBuilder addRequest(CertificateID certificateID, Extensions extensions) {
        this.list.add(new RequestObject(certificateID, extensions));
        return this;
    }

    public OCSPReq build(ContentSigner contentSigner, X509CertificateHolder[] x509CertificateHolderArr) {
        if (contentSigner != null) {
            return generateRequest(contentSigner, x509CertificateHolderArr);
        }
        throw new IllegalArgumentException("no signer specified");
    }

    public OCSPReqBuilder setRequestorName(GeneralName generalName) {
        this.requestorName = generalName;
        return this;
    }
}