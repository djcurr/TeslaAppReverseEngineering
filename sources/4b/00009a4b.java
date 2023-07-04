package org.spongycastle.cert.ocsp;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import org.spongycastle.asn1.ASN1Exception;
import org.spongycastle.asn1.ASN1InputStream;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ocsp.BasicOCSPResponse;
import org.spongycastle.asn1.ocsp.OCSPObjectIdentifiers;
import org.spongycastle.asn1.ocsp.OCSPResponse;
import org.spongycastle.asn1.ocsp.ResponseBytes;
import org.spongycastle.cert.CertIOException;

/* loaded from: classes5.dex */
public class OCSPResp {
    public static final int INTERNAL_ERROR = 2;
    public static final int MALFORMED_REQUEST = 1;
    public static final int SIG_REQUIRED = 5;
    public static final int SUCCESSFUL = 0;
    public static final int TRY_LATER = 3;
    public static final int UNAUTHORIZED = 6;
    private OCSPResponse resp;

    public OCSPResp(OCSPResponse oCSPResponse) {
        this.resp = oCSPResponse;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof OCSPResp) {
            return this.resp.equals(((OCSPResp) obj).resp);
        }
        return false;
    }

    public byte[] getEncoded() {
        return this.resp.getEncoded();
    }

    public Object getResponseObject() {
        ResponseBytes responseBytes = this.resp.getResponseBytes();
        if (responseBytes == null) {
            return null;
        }
        if (responseBytes.getResponseType().equals(OCSPObjectIdentifiers.id_pkix_ocsp_basic)) {
            try {
                return new BasicOCSPResp(BasicOCSPResponse.getInstance(ASN1Primitive.fromByteArray(responseBytes.getResponse().getOctets())));
            } catch (Exception e11) {
                throw new OCSPException("problem decoding object: " + e11, e11);
            }
        }
        return responseBytes.getResponse();
    }

    public int getStatus() {
        return this.resp.getResponseStatus().getValue().intValue();
    }

    public int hashCode() {
        return this.resp.hashCode();
    }

    public OCSPResponse toASN1Structure() {
        return this.resp;
    }

    public OCSPResp(byte[] bArr) {
        this(new ByteArrayInputStream(bArr));
    }

    public OCSPResp(InputStream inputStream) {
        this(new ASN1InputStream(inputStream));
    }

    private OCSPResp(ASN1InputStream aSN1InputStream) {
        try {
            OCSPResponse oCSPResponse = OCSPResponse.getInstance(aSN1InputStream.readObject());
            this.resp = oCSPResponse;
            if (oCSPResponse == null) {
                throw new CertIOException("malformed response: no response data found");
            }
        } catch (ClassCastException e11) {
            throw new CertIOException("malformed response: " + e11.getMessage(), e11);
        } catch (IllegalArgumentException e12) {
            throw new CertIOException("malformed response: " + e12.getMessage(), e12);
        } catch (ASN1Exception e13) {
            throw new CertIOException("malformed response: " + e13.getMessage(), e13);
        }
    }
}