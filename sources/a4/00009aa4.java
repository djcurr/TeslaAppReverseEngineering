package org.spongycastle.cms;

import java.io.OutputStream;
import java.util.Iterator;
import java.util.List;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1TaggedObject;
import org.spongycastle.asn1.BERSequenceGenerator;
import org.spongycastle.asn1.BERTaggedObject;
import org.spongycastle.asn1.DERSet;
import org.spongycastle.asn1.cms.CMSObjectIdentifiers;
import org.spongycastle.asn1.cms.SignerInfo;

/* loaded from: classes5.dex */
public class CMSSignedDataStreamGenerator extends CMSSignedGenerator {
    private int _bufferSize;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public class CmsSignedDataOutputStream extends OutputStream {
        private ASN1ObjectIdentifier _contentOID;
        private BERSequenceGenerator _eiGen;
        private OutputStream _out;
        private BERSequenceGenerator _sGen;
        private BERSequenceGenerator _sigGen;

        public CmsSignedDataOutputStream(OutputStream outputStream, ASN1ObjectIdentifier aSN1ObjectIdentifier, BERSequenceGenerator bERSequenceGenerator, BERSequenceGenerator bERSequenceGenerator2, BERSequenceGenerator bERSequenceGenerator3) {
            this._out = outputStream;
            this._contentOID = aSN1ObjectIdentifier;
            this._sGen = bERSequenceGenerator;
            this._sigGen = bERSequenceGenerator2;
            this._eiGen = bERSequenceGenerator3;
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this._out.close();
            this._eiGen.close();
            CMSSignedDataStreamGenerator.this.digests.clear();
            if (CMSSignedDataStreamGenerator.this.certs.size() != 0) {
                this._sigGen.getRawOutputStream().write(new BERTaggedObject(false, 0, CMSUtils.createBerSetFromList(CMSSignedDataStreamGenerator.this.certs)).getEncoded());
            }
            if (CMSSignedDataStreamGenerator.this.crls.size() != 0) {
                this._sigGen.getRawOutputStream().write(new BERTaggedObject(false, 1, CMSUtils.createBerSetFromList(CMSSignedDataStreamGenerator.this.crls)).getEncoded());
            }
            ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
            for (SignerInfoGenerator signerInfoGenerator : CMSSignedDataStreamGenerator.this.signerGens) {
                try {
                    aSN1EncodableVector.add(signerInfoGenerator.generate(this._contentOID));
                    CMSSignedDataStreamGenerator.this.digests.put(signerInfoGenerator.getDigestAlgorithm().getAlgorithm().getId(), signerInfoGenerator.getCalculatedDigest());
                } catch (CMSException e11) {
                    throw new CMSStreamException("exception generating signers: " + e11.getMessage(), e11);
                }
            }
            for (SignerInformation signerInformation : CMSSignedDataStreamGenerator.this._signers) {
                aSN1EncodableVector.add(signerInformation.toASN1Structure());
            }
            this._sigGen.getRawOutputStream().write(new DERSet(aSN1EncodableVector).getEncoded());
            this._sigGen.close();
            this._sGen.close();
        }

        @Override // java.io.OutputStream
        public void write(int i11) {
            this._out.write(i11);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i11, int i12) {
            this._out.write(bArr, i11, i12);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) {
            this._out.write(bArr);
        }
    }

    private ASN1Integer calculateVersion(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        boolean z11;
        boolean z12;
        boolean z13;
        List list = this.certs;
        boolean z14 = false;
        if (list != null) {
            z11 = false;
            z12 = false;
            z13 = false;
            for (Object obj : list) {
                if (obj instanceof ASN1TaggedObject) {
                    ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) obj;
                    if (aSN1TaggedObject.getTagNo() == 1) {
                        z12 = true;
                    } else if (aSN1TaggedObject.getTagNo() == 2) {
                        z13 = true;
                    } else if (aSN1TaggedObject.getTagNo() == 3) {
                        z11 = true;
                    }
                }
            }
        } else {
            z11 = false;
            z12 = false;
            z13 = false;
        }
        if (z11) {
            return new ASN1Integer(5L);
        }
        List<Object> list2 = this.crls;
        if (list2 != null) {
            for (Object obj2 : list2) {
                if (obj2 instanceof ASN1TaggedObject) {
                    z14 = true;
                }
            }
        }
        if (z14) {
            return new ASN1Integer(5L);
        }
        if (z13) {
            return new ASN1Integer(4L);
        }
        if (z12) {
            return new ASN1Integer(3L);
        }
        if (checkForVersion3(this._signers, this.signerGens)) {
            return new ASN1Integer(3L);
        }
        if (!CMSObjectIdentifiers.data.equals(aSN1ObjectIdentifier)) {
            return new ASN1Integer(3L);
        }
        return new ASN1Integer(1L);
    }

    private boolean checkForVersion3(List list, List list2) {
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            if (SignerInfo.getInstance(((SignerInformation) it2.next()).toASN1Structure()).getVersion().getValue().intValue() == 3) {
                return true;
            }
        }
        Iterator it3 = list2.iterator();
        while (it3.hasNext()) {
            if (((SignerInfoGenerator) it3.next()).getGeneratedVersion() == 3) {
                return true;
            }
        }
        return false;
    }

    public OutputStream open(OutputStream outputStream) {
        return open(outputStream, false);
    }

    public void setBufferSize(int i11) {
        this._bufferSize = i11;
    }

    public OutputStream open(OutputStream outputStream, boolean z11) {
        return open(CMSObjectIdentifiers.data, outputStream, z11);
    }

    public OutputStream open(OutputStream outputStream, boolean z11, OutputStream outputStream2) {
        return open(CMSObjectIdentifiers.data, outputStream, z11, outputStream2);
    }

    public OutputStream open(ASN1ObjectIdentifier aSN1ObjectIdentifier, OutputStream outputStream, boolean z11) {
        return open(aSN1ObjectIdentifier, outputStream, z11, null);
    }

    public OutputStream open(ASN1ObjectIdentifier aSN1ObjectIdentifier, OutputStream outputStream, boolean z11, OutputStream outputStream2) {
        BERSequenceGenerator bERSequenceGenerator = new BERSequenceGenerator(outputStream);
        bERSequenceGenerator.addObject(CMSObjectIdentifiers.signedData);
        BERSequenceGenerator bERSequenceGenerator2 = new BERSequenceGenerator(bERSequenceGenerator.getRawOutputStream(), 0, true);
        bERSequenceGenerator2.addObject(calculateVersion(aSN1ObjectIdentifier));
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        for (SignerInformation signerInformation : this._signers) {
            aSN1EncodableVector.add(CMSSignedHelper.INSTANCE.fixAlgID(signerInformation.getDigestAlgorithmID()));
        }
        for (SignerInfoGenerator signerInfoGenerator : this.signerGens) {
            aSN1EncodableVector.add(signerInfoGenerator.getDigestAlgorithm());
        }
        bERSequenceGenerator2.getRawOutputStream().write(new DERSet(aSN1EncodableVector).getEncoded());
        BERSequenceGenerator bERSequenceGenerator3 = new BERSequenceGenerator(bERSequenceGenerator2.getRawOutputStream());
        bERSequenceGenerator3.addObject(aSN1ObjectIdentifier);
        return new CmsSignedDataOutputStream(CMSUtils.attachSignersToOutputStream(this.signerGens, CMSUtils.getSafeTeeOutputStream(outputStream2, z11 ? CMSUtils.createBEROctetOutputStream(bERSequenceGenerator3.getRawOutputStream(), 0, true, this._bufferSize) : null)), aSN1ObjectIdentifier, bERSequenceGenerator, bERSequenceGenerator2, bERSequenceGenerator3);
    }
}