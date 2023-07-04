package org.spongycastle.tsp.cms;

import java.io.IOException;
import java.io.OutputStream;
import org.spongycastle.asn1.ASN1Encoding;
import org.spongycastle.asn1.cms.AttributeTable;
import org.spongycastle.asn1.cms.TimeStampAndCRL;
import org.spongycastle.asn1.cms.TimeStampedData;
import org.spongycastle.asn1.cms.TimeStampedDataParser;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;
import org.spongycastle.cms.CMSException;
import org.spongycastle.operator.DigestCalculator;
import org.spongycastle.operator.DigestCalculatorProvider;
import org.spongycastle.operator.OperatorCreationException;
import org.spongycastle.tsp.TSPException;
import org.spongycastle.tsp.TimeStampToken;
import org.spongycastle.util.Arrays;

/* loaded from: classes4.dex */
class TimeStampDataUtil {
    private final MetaDataUtil metaDataUtil;
    private final TimeStampAndCRL[] timeStamps;

    /* JADX INFO: Access modifiers changed from: package-private */
    public TimeStampDataUtil(TimeStampedData timeStampedData) {
        this.metaDataUtil = new MetaDataUtil(timeStampedData.getMetaData());
        this.timeStamps = timeStampedData.getTemporalEvidence().getTstEvidence().toTimeStampAndCRLArray();
    }

    private void compareDigest(TimeStampToken timeStampToken, byte[] bArr) {
        if (!Arrays.areEqual(bArr, timeStampToken.getTimeStampInfo().getMessageImprintDigest())) {
            throw new ImprintDigestInvalidException("hash calculated is different from MessageImprintDigest found in TimeStampToken", timeStampToken);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public byte[] calculateNextHash(DigestCalculator digestCalculator) {
        TimeStampAndCRL[] timeStampAndCRLArr = this.timeStamps;
        TimeStampAndCRL timeStampAndCRL = timeStampAndCRLArr[timeStampAndCRLArr.length - 1];
        OutputStream outputStream = digestCalculator.getOutputStream();
        try {
            outputStream.write(timeStampAndCRL.getEncoded(ASN1Encoding.DER));
            outputStream.close();
            return digestCalculator.getDigest();
        } catch (IOException e11) {
            throw new CMSException("exception calculating hash: " + e11.getMessage(), e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String getFileName() {
        return this.metaDataUtil.getFileName();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String getMediaType() {
        return this.metaDataUtil.getMediaType();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public DigestCalculator getMessageImprintDigestCalculator(DigestCalculatorProvider digestCalculatorProvider) {
        try {
            DigestCalculator digestCalculator = digestCalculatorProvider.get(new AlgorithmIdentifier(getTimeStampToken(this.timeStamps[0]).getTimeStampInfo().getMessageImprintAlgOID()));
            initialiseMessageImprintDigestCalculator(digestCalculator);
            return digestCalculator;
        } catch (CMSException e11) {
            throw new OperatorCreationException("unable to extract algorithm ID: " + e11.getMessage(), e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AttributeTable getOtherMetaData() {
        return new AttributeTable(this.metaDataUtil.getOtherMetaData());
    }

    TimeStampToken getTimeStampToken(TimeStampAndCRL timeStampAndCRL) {
        try {
            return new TimeStampToken(timeStampAndCRL.getTimeStampToken());
        } catch (IOException e11) {
            throw new CMSException("unable to parse token data: " + e11.getMessage(), e11);
        } catch (IllegalArgumentException e12) {
            throw new CMSException("token data invalid: " + e12.getMessage(), e12);
        } catch (TSPException e13) {
            if (e13.getCause() instanceof CMSException) {
                throw ((CMSException) e13.getCause());
            }
            throw new CMSException("token data invalid: " + e13.getMessage(), e13);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public TimeStampToken[] getTimeStampTokens() {
        TimeStampToken[] timeStampTokenArr = new TimeStampToken[this.timeStamps.length];
        int i11 = 0;
        while (true) {
            TimeStampAndCRL[] timeStampAndCRLArr = this.timeStamps;
            if (i11 >= timeStampAndCRLArr.length) {
                return timeStampTokenArr;
            }
            timeStampTokenArr[i11] = getTimeStampToken(timeStampAndCRLArr[i11]);
            i11++;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public TimeStampAndCRL[] getTimeStamps() {
        return this.timeStamps;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void initialiseMessageImprintDigestCalculator(DigestCalculator digestCalculator) {
        this.metaDataUtil.initialiseMessageImprintDigestCalculator(digestCalculator);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void validate(DigestCalculatorProvider digestCalculatorProvider, byte[] bArr) {
        int i11 = 0;
        while (true) {
            TimeStampAndCRL[] timeStampAndCRLArr = this.timeStamps;
            if (i11 >= timeStampAndCRLArr.length) {
                return;
            }
            try {
                TimeStampToken timeStampToken = getTimeStampToken(timeStampAndCRLArr[i11]);
                if (i11 > 0) {
                    DigestCalculator digestCalculator = digestCalculatorProvider.get(timeStampToken.getTimeStampInfo().getHashAlgorithm());
                    digestCalculator.getOutputStream().write(this.timeStamps[i11 - 1].getEncoded(ASN1Encoding.DER));
                    bArr = digestCalculator.getDigest();
                }
                compareDigest(timeStampToken, bArr);
                i11++;
            } catch (IOException e11) {
                throw new CMSException("exception calculating hash: " + e11.getMessage(), e11);
            } catch (OperatorCreationException e12) {
                throw new CMSException("cannot create digest: " + e12.getMessage(), e12);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public TimeStampDataUtil(TimeStampedDataParser timeStampedDataParser) {
        this.metaDataUtil = new MetaDataUtil(timeStampedDataParser.getMetaData());
        this.timeStamps = timeStampedDataParser.getTemporalEvidence().getTstEvidence().toTimeStampAndCRLArray();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void validate(DigestCalculatorProvider digestCalculatorProvider, byte[] bArr, TimeStampToken timeStampToken) {
        try {
            byte[] encoded = timeStampToken.getEncoded();
            int i11 = 0;
            while (true) {
                TimeStampAndCRL[] timeStampAndCRLArr = this.timeStamps;
                if (i11 < timeStampAndCRLArr.length) {
                    try {
                        TimeStampToken timeStampToken2 = getTimeStampToken(timeStampAndCRLArr[i11]);
                        if (i11 > 0) {
                            DigestCalculator digestCalculator = digestCalculatorProvider.get(timeStampToken2.getTimeStampInfo().getHashAlgorithm());
                            digestCalculator.getOutputStream().write(this.timeStamps[i11 - 1].getEncoded(ASN1Encoding.DER));
                            bArr = digestCalculator.getDigest();
                        }
                        compareDigest(timeStampToken2, bArr);
                        if (Arrays.areEqual(timeStampToken2.getEncoded(), encoded)) {
                            return;
                        }
                        i11++;
                    } catch (IOException e11) {
                        throw new CMSException("exception calculating hash: " + e11.getMessage(), e11);
                    } catch (OperatorCreationException e12) {
                        throw new CMSException("cannot create digest: " + e12.getMessage(), e12);
                    }
                } else {
                    throw new ImprintDigestInvalidException("passed in token not associated with timestamps present", timeStampToken);
                }
            }
        } catch (IOException e13) {
            throw new CMSException("exception encoding timeStampToken: " + e13.getMessage(), e13);
        }
    }
}