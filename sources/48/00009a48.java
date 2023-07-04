package org.spongycastle.cert.ocsp;

import java.io.ByteArrayOutputStream;
import java.util.List;
import java.util.Set;
import org.spongycastle.asn1.ASN1Encoding;
import org.spongycastle.asn1.ASN1Exception;
import org.spongycastle.asn1.ASN1InputStream;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1OutputStream;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.ocsp.OCSPRequest;
import org.spongycastle.asn1.ocsp.Request;
import org.spongycastle.asn1.x509.Certificate;
import org.spongycastle.asn1.x509.Extension;
import org.spongycastle.asn1.x509.Extensions;
import org.spongycastle.asn1.x509.GeneralName;
import org.spongycastle.cert.CertIOException;
import org.spongycastle.cert.X509CertificateHolder;
import org.spongycastle.operator.ContentVerifier;
import org.spongycastle.operator.ContentVerifierProvider;

/* loaded from: classes5.dex */
public class OCSPReq {
    private static final X509CertificateHolder[] EMPTY_CERTS = new X509CertificateHolder[0];
    private Extensions extensions;
    private OCSPRequest req;

    public OCSPReq(OCSPRequest oCSPRequest) {
        this.req = oCSPRequest;
        this.extensions = oCSPRequest.getTbsRequest().getRequestExtensions();
    }

    public X509CertificateHolder[] getCerts() {
        if (this.req.getOptionalSignature() != null) {
            ASN1Sequence certs = this.req.getOptionalSignature().getCerts();
            if (certs != null) {
                int size = certs.size();
                X509CertificateHolder[] x509CertificateHolderArr = new X509CertificateHolder[size];
                for (int i11 = 0; i11 != size; i11++) {
                    x509CertificateHolderArr[i11] = new X509CertificateHolder(Certificate.getInstance(certs.getObjectAt(i11)));
                }
                return x509CertificateHolderArr;
            }
            return EMPTY_CERTS;
        }
        return EMPTY_CERTS;
    }

    public Set getCriticalExtensionOIDs() {
        return OCSPUtils.getCriticalExtensionOIDs(this.extensions);
    }

    public byte[] getEncoded() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        new ASN1OutputStream(byteArrayOutputStream).writeObject(this.req);
        return byteArrayOutputStream.toByteArray();
    }

    public Extension getExtension(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        Extensions extensions = this.extensions;
        if (extensions != null) {
            return extensions.getExtension(aSN1ObjectIdentifier);
        }
        return null;
    }

    public List getExtensionOIDs() {
        return OCSPUtils.getExtensionOIDs(this.extensions);
    }

    public Set getNonCriticalExtensionOIDs() {
        return OCSPUtils.getNonCriticalExtensionOIDs(this.extensions);
    }

    public Req[] getRequestList() {
        ASN1Sequence requestList = this.req.getTbsRequest().getRequestList();
        int size = requestList.size();
        Req[] reqArr = new Req[size];
        for (int i11 = 0; i11 != size; i11++) {
            reqArr[i11] = new Req(Request.getInstance(requestList.getObjectAt(i11)));
        }
        return reqArr;
    }

    public GeneralName getRequestorName() {
        return GeneralName.getInstance(this.req.getTbsRequest().getRequestorName());
    }

    public byte[] getSignature() {
        if (isSigned()) {
            return this.req.getOptionalSignature().getSignature().getOctets();
        }
        return null;
    }

    public ASN1ObjectIdentifier getSignatureAlgOID() {
        if (isSigned()) {
            return this.req.getOptionalSignature().getSignatureAlgorithm().getAlgorithm();
        }
        return null;
    }

    public int getVersionNumber() {
        return this.req.getTbsRequest().getVersion().getValue().intValue() + 1;
    }

    public boolean hasExtensions() {
        return this.extensions != null;
    }

    public boolean isSignatureValid(ContentVerifierProvider contentVerifierProvider) {
        if (isSigned()) {
            try {
                ContentVerifier contentVerifier = contentVerifierProvider.get(this.req.getOptionalSignature().getSignatureAlgorithm());
                contentVerifier.getOutputStream().write(this.req.getTbsRequest().getEncoded(ASN1Encoding.DER));
                return contentVerifier.verify(getSignature());
            } catch (Exception e11) {
                throw new OCSPException("exception processing signature: " + e11, e11);
            }
        }
        throw new OCSPException("attempt to verify signature on unsigned object");
    }

    public boolean isSigned() {
        return this.req.getOptionalSignature() != null;
    }

    public OCSPReq(byte[] bArr) {
        this(new ASN1InputStream(bArr));
    }

    private OCSPReq(ASN1InputStream aSN1InputStream) {
        try {
            OCSPRequest oCSPRequest = OCSPRequest.getInstance(aSN1InputStream.readObject());
            this.req = oCSPRequest;
            if (oCSPRequest != null) {
                this.extensions = oCSPRequest.getTbsRequest().getRequestExtensions();
                return;
            }
            throw new CertIOException("malformed request: no request data found");
        } catch (ClassCastException e11) {
            throw new CertIOException("malformed request: " + e11.getMessage(), e11);
        } catch (IllegalArgumentException e12) {
            throw new CertIOException("malformed request: " + e12.getMessage(), e12);
        } catch (ASN1Exception e13) {
            throw new CertIOException("malformed request: " + e13.getMessage(), e13);
        }
    }
}