package org.spongycastle.jcajce.provider.asymmetric.x509;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.security.NoSuchProviderException;
import java.security.cert.CertPath;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import javax.security.auth.x500.X500Principal;
import org.spongycastle.asn1.ASN1Encodable;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Encoding;
import org.spongycastle.asn1.ASN1InputStream;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.asn1.DERSet;
import org.spongycastle.asn1.pkcs.ContentInfo;
import org.spongycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.spongycastle.asn1.pkcs.SignedData;
import org.spongycastle.jcajce.util.BCJcaJceHelper;
import org.spongycastle.jcajce.util.JcaJceHelper;
import org.spongycastle.util.io.pem.PemObject;
import org.spongycastle.util.io.pem.PemWriter;

/* loaded from: classes4.dex */
public class PKIXCertPath extends CertPath {
    static final List certPathEncodings;
    private List certificates;
    private final JcaJceHelper helper;

    static {
        ArrayList arrayList = new ArrayList();
        arrayList.add("PkiPath");
        arrayList.add("PEM");
        arrayList.add("PKCS7");
        certPathEncodings = Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PKIXCertPath(List list) {
        super("X.509");
        this.helper = new BCJcaJceHelper();
        this.certificates = sortCerts(new ArrayList(list));
    }

    private List sortCerts(List list) {
        boolean z11;
        boolean z12;
        if (list.size() < 2) {
            return list;
        }
        X500Principal issuerX500Principal = ((X509Certificate) list.get(0)).getIssuerX500Principal();
        int i11 = 1;
        while (true) {
            if (i11 == list.size()) {
                z11 = true;
                break;
            } else if (!issuerX500Principal.equals(((X509Certificate) list.get(i11)).getSubjectX500Principal())) {
                z11 = false;
                break;
            } else {
                issuerX500Principal = ((X509Certificate) list.get(i11)).getIssuerX500Principal();
                i11++;
            }
        }
        if (z11) {
            return list;
        }
        ArrayList arrayList = new ArrayList(list.size());
        ArrayList arrayList2 = new ArrayList(list);
        for (int i12 = 0; i12 < list.size(); i12++) {
            X509Certificate x509Certificate = (X509Certificate) list.get(i12);
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            int i13 = 0;
            while (true) {
                if (i13 == list.size()) {
                    z12 = false;
                    break;
                } else if (((X509Certificate) list.get(i13)).getIssuerX500Principal().equals(subjectX500Principal)) {
                    z12 = true;
                    break;
                } else {
                    i13++;
                }
            }
            if (!z12) {
                arrayList.add(x509Certificate);
                list.remove(i12);
            }
        }
        if (arrayList.size() > 1) {
            return arrayList2;
        }
        for (int i14 = 0; i14 != arrayList.size(); i14++) {
            X500Principal issuerX500Principal2 = ((X509Certificate) arrayList.get(i14)).getIssuerX500Principal();
            int i15 = 0;
            while (true) {
                if (i15 < list.size()) {
                    X509Certificate x509Certificate2 = (X509Certificate) list.get(i15);
                    if (issuerX500Principal2.equals(x509Certificate2.getSubjectX500Principal())) {
                        arrayList.add(x509Certificate2);
                        list.remove(i15);
                        break;
                    }
                    i15++;
                }
            }
        }
        return list.size() > 0 ? arrayList2 : arrayList;
    }

    private ASN1Primitive toASN1Object(X509Certificate x509Certificate) {
        try {
            return new ASN1InputStream(x509Certificate.getEncoded()).readObject();
        } catch (Exception e11) {
            throw new CertificateEncodingException("Exception while encoding certificate: " + e11.toString());
        }
    }

    private byte[] toDEREncoded(ASN1Encodable aSN1Encodable) {
        try {
            return aSN1Encodable.toASN1Primitive().getEncoded(ASN1Encoding.DER);
        } catch (IOException e11) {
            throw new CertificateEncodingException("Exception thrown: " + e11);
        }
    }

    @Override // java.security.cert.CertPath
    public List getCertificates() {
        return Collections.unmodifiableList(new ArrayList(this.certificates));
    }

    @Override // java.security.cert.CertPath
    public byte[] getEncoded() {
        Iterator encodings = getEncodings();
        if (encodings.hasNext()) {
            Object next = encodings.next();
            if (next instanceof String) {
                return getEncoded((String) next);
            }
            return null;
        }
        return null;
    }

    @Override // java.security.cert.CertPath
    public Iterator getEncodings() {
        return certPathEncodings.iterator();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PKIXCertPath(InputStream inputStream, String str) {
        super("X.509");
        BCJcaJceHelper bCJcaJceHelper = new BCJcaJceHelper();
        this.helper = bCJcaJceHelper;
        try {
            if (str.equalsIgnoreCase("PkiPath")) {
                ASN1Primitive readObject = new ASN1InputStream(inputStream).readObject();
                if (readObject instanceof ASN1Sequence) {
                    Enumeration objects = ((ASN1Sequence) readObject).getObjects();
                    this.certificates = new ArrayList();
                    java.security.cert.CertificateFactory createCertificateFactory = bCJcaJceHelper.createCertificateFactory("X.509");
                    while (objects.hasMoreElements()) {
                        this.certificates.add(0, createCertificateFactory.generateCertificate(new ByteArrayInputStream(((ASN1Encodable) objects.nextElement()).toASN1Primitive().getEncoded(ASN1Encoding.DER))));
                    }
                } else {
                    throw new CertificateException("input stream does not contain a ASN1 SEQUENCE while reading PkiPath encoded data to load CertPath");
                }
            } else {
                if (!str.equalsIgnoreCase("PKCS7") && !str.equalsIgnoreCase("PEM")) {
                    throw new CertificateException("unsupported encoding: " + str);
                }
                BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
                this.certificates = new ArrayList();
                java.security.cert.CertificateFactory createCertificateFactory2 = bCJcaJceHelper.createCertificateFactory("X.509");
                while (true) {
                    Certificate generateCertificate = createCertificateFactory2.generateCertificate(bufferedInputStream);
                    if (generateCertificate == null) {
                        break;
                    }
                    this.certificates.add(generateCertificate);
                }
            }
            this.certificates = sortCerts(this.certificates);
        } catch (IOException e11) {
            throw new CertificateException("IOException throw while decoding CertPath:\n" + e11.toString());
        } catch (NoSuchProviderException e12) {
            throw new CertificateException("BouncyCastle provider not found while trying to get a CertificateFactory:\n" + e12.toString());
        }
    }

    @Override // java.security.cert.CertPath
    public byte[] getEncoded(String str) {
        if (str.equalsIgnoreCase("PkiPath")) {
            ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
            List list = this.certificates;
            ListIterator listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                aSN1EncodableVector.add(toASN1Object((X509Certificate) listIterator.previous()));
            }
            return toDEREncoded(new DERSequence(aSN1EncodableVector));
        }
        int i11 = 0;
        if (str.equalsIgnoreCase("PKCS7")) {
            ContentInfo contentInfo = new ContentInfo(PKCSObjectIdentifiers.data, null);
            ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector();
            while (i11 != this.certificates.size()) {
                aSN1EncodableVector2.add(toASN1Object((X509Certificate) this.certificates.get(i11)));
                i11++;
            }
            return toDEREncoded(new ContentInfo(PKCSObjectIdentifiers.signedData, new SignedData(new ASN1Integer(1L), new DERSet(), contentInfo, new DERSet(aSN1EncodableVector2), null, new DERSet())));
        } else if (str.equalsIgnoreCase("PEM")) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            PemWriter pemWriter = new PemWriter(new OutputStreamWriter(byteArrayOutputStream));
            while (i11 != this.certificates.size()) {
                try {
                    pemWriter.writeObject(new PemObject("CERTIFICATE", ((X509Certificate) this.certificates.get(i11)).getEncoded()));
                    i11++;
                } catch (Exception unused) {
                    throw new CertificateEncodingException("can't encode certificate for PEM encoded path");
                }
            }
            pemWriter.close();
            return byteArrayOutputStream.toByteArray();
        } else {
            throw new CertificateEncodingException("unsupported encoding: " + str);
        }
    }
}