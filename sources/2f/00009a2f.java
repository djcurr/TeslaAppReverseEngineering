package org.spongycastle.cert.jcajce;

import java.io.IOException;
import java.security.cert.CRLException;
import java.security.cert.X509CRL;
import java.util.ArrayList;
import java.util.Collection;
import org.spongycastle.cert.X509CRLHolder;
import org.spongycastle.util.CollectionStore;

/* loaded from: classes5.dex */
public class JcaCRLStore extends CollectionStore {
    public JcaCRLStore(Collection collection) {
        super(convertCRLs(collection));
    }

    private static Collection convertCRLs(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (Object obj : collection) {
            if (obj instanceof X509CRL) {
                try {
                    arrayList.add(new X509CRLHolder(((X509CRL) obj).getEncoded()));
                } catch (IOException e11) {
                    throw new CRLException("cannot read encoding: " + e11.getMessage());
                }
            } else {
                arrayList.add((X509CRLHolder) obj);
            }
        }
        return arrayList;
    }
}