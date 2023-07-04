package org.spongycastle.cms;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.spongycastle.asn1.ASN1Encodable;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1InputStream;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1Set;
import org.spongycastle.asn1.ASN1TaggedObject;
import org.spongycastle.asn1.BEROctetStringGenerator;
import org.spongycastle.asn1.BERSet;
import org.spongycastle.asn1.DERNull;
import org.spongycastle.asn1.DERSet;
import org.spongycastle.asn1.DERTaggedObject;
import org.spongycastle.asn1.cms.CMSObjectIdentifiers;
import org.spongycastle.asn1.cms.ContentInfo;
import org.spongycastle.asn1.cms.OtherRevocationInfoFormat;
import org.spongycastle.asn1.ocsp.OCSPResponse;
import org.spongycastle.asn1.oiw.OIWObjectIdentifiers;
import org.spongycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;
import org.spongycastle.cert.X509AttributeCertificateHolder;
import org.spongycastle.cert.X509CRLHolder;
import org.spongycastle.cert.X509CertificateHolder;
import org.spongycastle.operator.DigestCalculator;
import org.spongycastle.util.Store;
import org.spongycastle.util.Strings;
import org.spongycastle.util.io.Streams;
import org.spongycastle.util.io.TeeInputStream;
import org.spongycastle.util.io.TeeOutputStream;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class CMSUtils {
    private static final Set<String> des;

    static {
        HashSet hashSet = new HashSet();
        des = hashSet;
        hashSet.add("DES");
        hashSet.add("DESEDE");
        hashSet.add(OIWObjectIdentifiers.desCBC.getId());
        ASN1ObjectIdentifier aSN1ObjectIdentifier = PKCSObjectIdentifiers.des_EDE3_CBC;
        hashSet.add(aSN1ObjectIdentifier.getId());
        hashSet.add(aSN1ObjectIdentifier.getId());
        hashSet.add(PKCSObjectIdentifiers.id_alg_CMS3DESwrap.getId());
    }

    CMSUtils() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static InputStream attachDigestsToInputStream(Collection collection, InputStream inputStream) {
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            inputStream = new TeeInputStream(inputStream, ((DigestCalculator) it2.next()).getOutputStream());
        }
        return inputStream;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static OutputStream attachSignersToOutputStream(Collection collection, OutputStream outputStream) {
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            outputStream = getSafeTeeOutputStream(outputStream, ((SignerInfoGenerator) it2.next()).getCalculatingOutputStream());
        }
        return outputStream;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static OutputStream createBEROctetOutputStream(OutputStream outputStream, int i11, boolean z11, int i12) {
        BEROctetStringGenerator bEROctetStringGenerator = new BEROctetStringGenerator(outputStream, i11, z11);
        if (i12 != 0) {
            return bEROctetStringGenerator.getOctetOutputStream(new byte[i12]);
        }
        return bEROctetStringGenerator.getOctetOutputStream();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ASN1Set createBerSetFromList(List list) {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            aSN1EncodableVector.add((ASN1Encodable) it2.next());
        }
        return new BERSet(aSN1EncodableVector);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ASN1Set createDerSetFromList(List list) {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            aSN1EncodableVector.add((ASN1Encodable) it2.next());
        }
        return new DERSet(aSN1EncodableVector);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List getAttributeCertificatesFromStore(Store store) {
        ArrayList arrayList = new ArrayList();
        try {
            for (X509AttributeCertificateHolder x509AttributeCertificateHolder : store.getMatches(null)) {
                arrayList.add(new DERTaggedObject(false, 2, x509AttributeCertificateHolder.toASN1Structure()));
            }
            return arrayList;
        } catch (ClassCastException e11) {
            throw new CMSException("error processing certs", e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List getCRLsFromStore(Store store) {
        ArrayList arrayList = new ArrayList();
        try {
            for (Object obj : store.getMatches(null)) {
                if (obj instanceof X509CRLHolder) {
                    arrayList.add(((X509CRLHolder) obj).toASN1Structure());
                } else if (obj instanceof OtherRevocationInfoFormat) {
                    OtherRevocationInfoFormat otherRevocationInfoFormat = OtherRevocationInfoFormat.getInstance(obj);
                    validateInfoFormat(otherRevocationInfoFormat);
                    arrayList.add(new DERTaggedObject(false, 1, otherRevocationInfoFormat));
                } else if (obj instanceof ASN1TaggedObject) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        } catch (ClassCastException e11) {
            throw new CMSException("error processing certs", e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List getCertificatesFromStore(Store store) {
        ArrayList arrayList = new ArrayList();
        try {
            for (X509CertificateHolder x509CertificateHolder : store.getMatches(null)) {
                arrayList.add(x509CertificateHolder.toASN1Structure());
            }
            return arrayList;
        } catch (ClassCastException e11) {
            throw new CMSException("error processing certs", e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Collection getOthersFromStore(ASN1ObjectIdentifier aSN1ObjectIdentifier, Store store) {
        ArrayList arrayList = new ArrayList();
        for (ASN1Encodable aSN1Encodable : store.getMatches(null)) {
            OtherRevocationInfoFormat otherRevocationInfoFormat = new OtherRevocationInfoFormat(aSN1ObjectIdentifier, aSN1Encodable);
            validateInfoFormat(otherRevocationInfoFormat);
            arrayList.add(new DERTaggedObject(false, 1, otherRevocationInfoFormat));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static OutputStream getSafeOutputStream(OutputStream outputStream) {
        return outputStream == null ? new NullOutputStream() : outputStream;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static OutputStream getSafeTeeOutputStream(OutputStream outputStream, OutputStream outputStream2) {
        if (outputStream == null) {
            return getSafeOutputStream(outputStream2);
        }
        return outputStream2 == null ? getSafeOutputStream(outputStream) : new TeeOutputStream(outputStream, outputStream2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean isDES(String str) {
        return des.contains(Strings.toUpperCase(str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean isEquivalent(AlgorithmIdentifier algorithmIdentifier, AlgorithmIdentifier algorithmIdentifier2) {
        if (algorithmIdentifier == null || algorithmIdentifier2 == null || !algorithmIdentifier.getAlgorithm().equals(algorithmIdentifier2.getAlgorithm())) {
            return false;
        }
        ASN1Encodable parameters = algorithmIdentifier.getParameters();
        ASN1Encodable parameters2 = algorithmIdentifier2.getParameters();
        return parameters != null ? parameters.equals(parameters2) || (parameters.equals(DERNull.INSTANCE) && parameters2 == null) : parameters2 == null || parameters2.equals(DERNull.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ContentInfo readContentInfo(byte[] bArr) {
        return readContentInfo(new ASN1InputStream(bArr));
    }

    public static byte[] streamToByteArray(InputStream inputStream) {
        return Streams.readAll(inputStream);
    }

    private static void validateInfoFormat(OtherRevocationInfoFormat otherRevocationInfoFormat) {
        if (CMSObjectIdentifiers.id_ri_ocsp_response.equals(otherRevocationInfoFormat.getInfoFormat()) && OCSPResponse.getInstance(otherRevocationInfoFormat.getInfo()).getResponseStatus().getValue().intValue() != 0) {
            throw new IllegalArgumentException("cannot add unsuccessful OCSP response to CMS SignedData");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ContentInfo readContentInfo(InputStream inputStream) {
        return readContentInfo(new ASN1InputStream(inputStream));
    }

    public static byte[] streamToByteArray(InputStream inputStream, int i11) {
        return Streams.readAllLimited(inputStream, i11);
    }

    private static ContentInfo readContentInfo(ASN1InputStream aSN1InputStream) {
        try {
            return ContentInfo.getInstance(aSN1InputStream.readObject());
        } catch (IOException e11) {
            throw new CMSException("IOException reading content.", e11);
        } catch (ClassCastException e12) {
            throw new CMSException("Malformed content.", e12);
        } catch (IllegalArgumentException e13) {
            throw new CMSException("Malformed content.", e13);
        }
    }
}