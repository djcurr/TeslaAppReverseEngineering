package org.spongycastle.cert.jcajce;

import java.io.IOException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import org.spongycastle.cert.X509CertificateHolder;
import org.spongycastle.util.CollectionStore;

/* loaded from: classes5.dex */
public class JcaCertStore extends CollectionStore {
    public JcaCertStore(Collection collection) {
        super(convertCerts(collection));
    }

    private static Collection convertCerts(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (Object obj : collection) {
            if (obj instanceof X509Certificate) {
                try {
                    arrayList.add(new X509CertificateHolder(((X509Certificate) obj).getEncoded()));
                } catch (IOException e11) {
                    throw new CertificateEncodingException("unable to read encoding: " + e11.getMessage());
                }
            } else {
                arrayList.add((X509CertificateHolder) obj);
            }
        }
        return arrayList;
    }
}