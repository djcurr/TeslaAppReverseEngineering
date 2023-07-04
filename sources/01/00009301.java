package org.bouncycastle.jcajce.provider.asymmetric.x509;

import e40.b;
import i60.a;
import i60.c;
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
import org.bouncycastle.asn1.d;
import org.bouncycastle.asn1.h;
import org.bouncycastle.asn1.i;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.w0;
import org.bouncycastle.asn1.x0;
import org.spongycastle.asn1.ASN1Encoding;
import w40.w;

/* loaded from: classes5.dex */
public class PKIXCertPath extends CertPath {
    static final List certPathEncodings;
    private List certificates;
    private final c helper;

    static {
        ArrayList arrayList = new ArrayList();
        arrayList.add("PkiPath");
        arrayList.add("PEM");
        arrayList.add("PKCS7");
        certPathEncodings = Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PKIXCertPath(InputStream inputStream, String str) {
        super("X.509");
        a aVar = new a();
        this.helper = aVar;
        try {
            if (!str.equalsIgnoreCase("PkiPath")) {
                if (!str.equalsIgnoreCase("PKCS7") && !str.equalsIgnoreCase("PEM")) {
                    throw new CertificateException("unsupported encoding: " + str);
                }
                BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
                this.certificates = new ArrayList();
                java.security.cert.CertificateFactory createCertificateFactory = aVar.createCertificateFactory("X.509");
                while (true) {
                    Certificate generateCertificate = createCertificateFactory.generateCertificate(bufferedInputStream);
                    if (generateCertificate == null) {
                        break;
                    }
                    this.certificates.add(generateCertificate);
                }
            } else {
                n D = new h(inputStream).D();
                if (!(D instanceof p)) {
                    throw new CertificateException("input stream does not contain a ASN1 SEQUENCE while reading PkiPath encoded data to load CertPath");
                }
                Enumeration s11 = ((p) D).s();
                this.certificates = new ArrayList();
                java.security.cert.CertificateFactory createCertificateFactory2 = aVar.createCertificateFactory("X.509");
                while (s11.hasMoreElements()) {
                    this.certificates.add(0, createCertificateFactory2.generateCertificate(new ByteArrayInputStream(((b) s11.nextElement()).toASN1Primitive().d(ASN1Encoding.DER))));
                }
            }
            this.certificates = sortCerts(this.certificates);
        } catch (IOException e11) {
            throw new CertificateException("IOException throw while decoding CertPath:\n" + e11.toString());
        } catch (NoSuchProviderException e12) {
            throw new CertificateException("BouncyCastle provider not found while trying to get a CertificateFactory:\n" + e12.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PKIXCertPath(List list) {
        super("X.509");
        this.helper = new a();
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

    private n toASN1Object(X509Certificate x509Certificate) {
        try {
            return new h(x509Certificate.getEncoded()).D();
        } catch (Exception e11) {
            throw new CertificateEncodingException("Exception while encoding certificate: " + e11.toString());
        }
    }

    private byte[] toDEREncoded(b bVar) {
        try {
            return bVar.toASN1Primitive().d(ASN1Encoding.DER);
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
    public byte[] getEncoded(String str) {
        if (str.equalsIgnoreCase("PkiPath")) {
            d dVar = new d();
            List list = this.certificates;
            ListIterator listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                dVar.a(toASN1Object((X509Certificate) listIterator.previous()));
            }
            return toDEREncoded(new w0(dVar));
        }
        int i11 = 0;
        if (str.equalsIgnoreCase("PKCS7")) {
            w40.c cVar = new w40.c(w40.n.f55534h2, null);
            d dVar2 = new d();
            while (i11 != this.certificates.size()) {
                dVar2.a(toASN1Object((X509Certificate) this.certificates.get(i11)));
                i11++;
            }
            return toDEREncoded(new w40.c(w40.n.f55535i2, new w(new i(1L), new x0(), cVar, new x0(dVar2), null, new x0())));
        } else if (!str.equalsIgnoreCase("PEM")) {
            throw new CertificateEncodingException("unsupported encoding: " + str);
        } else {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            u70.d dVar3 = new u70.d(new OutputStreamWriter(byteArrayOutputStream));
            while (i11 != this.certificates.size()) {
                try {
                    dVar3.g(new u70.b("CERTIFICATE", ((X509Certificate) this.certificates.get(i11)).getEncoded()));
                    i11++;
                } catch (Exception unused) {
                    throw new CertificateEncodingException("can't encode certificate for PEM encoded path");
                }
            }
            dVar3.close();
            return byteArrayOutputStream.toByteArray();
        }
    }

    @Override // java.security.cert.CertPath
    public Iterator getEncodings() {
        return certPathEncodings.iterator();
    }
}