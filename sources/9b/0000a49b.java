package org.spongycastle.tsp;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import org.spongycastle.asn1.ASN1InputStream;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import org.spongycastle.asn1.cmp.PKIFreeText;
import org.spongycastle.asn1.cms.Attribute;
import org.spongycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.spongycastle.asn1.tsp.TimeStampResp;
import org.spongycastle.util.Arrays;

/* loaded from: classes4.dex */
public class TimeStampResponse {
    TimeStampResp resp;
    TimeStampToken timeStampToken;

    public TimeStampResponse(TimeStampResp timeStampResp) {
        this.resp = timeStampResp;
        if (timeStampResp.getTimeStampToken() != null) {
            this.timeStampToken = new TimeStampToken(timeStampResp.getTimeStampToken());
        }
    }

    private static TimeStampResp readTimeStampResp(InputStream inputStream) {
        try {
            return TimeStampResp.getInstance(new ASN1InputStream(inputStream).readObject());
        } catch (ClassCastException e11) {
            throw new TSPException("malformed timestamp response: " + e11, e11);
        } catch (IllegalArgumentException e12) {
            throw new TSPException("malformed timestamp response: " + e12, e12);
        }
    }

    public byte[] getEncoded() {
        return this.resp.getEncoded();
    }

    public PKIFailureInfo getFailInfo() {
        if (this.resp.getStatus().getFailInfo() != null) {
            return new PKIFailureInfo(this.resp.getStatus().getFailInfo());
        }
        return null;
    }

    public int getStatus() {
        return this.resp.getStatus().getStatus().intValue();
    }

    public String getStatusString() {
        if (this.resp.getStatus().getStatusString() != null) {
            StringBuffer stringBuffer = new StringBuffer();
            PKIFreeText statusString = this.resp.getStatus().getStatusString();
            for (int i11 = 0; i11 != statusString.size(); i11++) {
                stringBuffer.append(statusString.getStringAt(i11).getString());
            }
            return stringBuffer.toString();
        }
        return null;
    }

    public TimeStampToken getTimeStampToken() {
        return this.timeStampToken;
    }

    public void validate(TimeStampRequest timeStampRequest) {
        TimeStampToken timeStampToken = getTimeStampToken();
        if (timeStampToken != null) {
            TimeStampTokenInfo timeStampInfo = timeStampToken.getTimeStampInfo();
            if (timeStampRequest.getNonce() != null && !timeStampRequest.getNonce().equals(timeStampInfo.getNonce())) {
                throw new TSPValidationException("response contains wrong nonce value.");
            }
            if (getStatus() != 0 && getStatus() != 1) {
                throw new TSPValidationException("time stamp token found in failed request.");
            }
            if (Arrays.constantTimeAreEqual(timeStampRequest.getMessageImprintDigest(), timeStampInfo.getMessageImprintDigest())) {
                if (timeStampInfo.getMessageImprintAlgOID().equals(timeStampRequest.getMessageImprintAlgOID())) {
                    Attribute attribute = timeStampToken.getSignedAttributes().get(PKCSObjectIdentifiers.id_aa_signingCertificate);
                    Attribute attribute2 = timeStampToken.getSignedAttributes().get(PKCSObjectIdentifiers.id_aa_signingCertificateV2);
                    if (attribute == null && attribute2 == null) {
                        throw new TSPValidationException("no signing certificate attribute present.");
                    }
                    if (timeStampRequest.getReqPolicy() != null && !timeStampRequest.getReqPolicy().equals(timeStampInfo.getPolicy())) {
                        throw new TSPValidationException("TSA policy wrong for request.");
                    }
                    return;
                }
                throw new TSPValidationException("response for different message imprint algorithm.");
            }
            throw new TSPValidationException("response for different message imprint digest.");
        } else if (getStatus() == 0 || getStatus() == 1) {
            throw new TSPValidationException("no time stamp token found and one expected.");
        }
    }

    public TimeStampResponse(byte[] bArr) {
        this(new ByteArrayInputStream(bArr));
    }

    public TimeStampResponse(InputStream inputStream) {
        this(readTimeStampResp(inputStream));
    }
}