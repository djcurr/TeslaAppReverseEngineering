package org.spongycastle.cert.dane;

import org.spongycastle.cert.X509CertificateHolder;
import org.spongycastle.operator.DigestCalculator;

/* loaded from: classes5.dex */
public class DANEEntryFactory {
    private final DANEEntrySelectorFactory selectorFactory;

    public DANEEntryFactory(DigestCalculator digestCalculator) {
        this.selectorFactory = new DANEEntrySelectorFactory(digestCalculator);
    }

    public DANEEntry createEntry(String str, X509CertificateHolder x509CertificateHolder) {
        return createEntry(str, 3, x509CertificateHolder);
    }

    public DANEEntry createEntry(String str, int i11, X509CertificateHolder x509CertificateHolder) {
        if (i11 >= 0 && i11 <= 3) {
            return new DANEEntry(this.selectorFactory.createSelector(str).getDomainName(), new byte[]{(byte) i11, 0, 0}, x509CertificateHolder);
        }
        throw new DANEException("unknown certificate usage: " + i11);
    }
}