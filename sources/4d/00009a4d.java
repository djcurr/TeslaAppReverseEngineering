package org.spongycastle.cert.ocsp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.spongycastle.asn1.ASN1GeneralizedTime;
import org.spongycastle.asn1.x509.Extensions;
import org.spongycastle.cert.X509CertificateHolder;

/* loaded from: classes5.dex */
class OCSPUtils {
    static final X509CertificateHolder[] EMPTY_CERTS = new X509CertificateHolder[0];
    static Set EMPTY_SET = Collections.unmodifiableSet(new HashSet());
    static List EMPTY_LIST = Collections.unmodifiableList(new ArrayList());

    OCSPUtils() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Date extractDate(ASN1GeneralizedTime aSN1GeneralizedTime) {
        try {
            return aSN1GeneralizedTime.getDate();
        } catch (Exception e11) {
            throw new IllegalStateException("exception processing GeneralizedTime: " + e11.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Set getCriticalExtensionOIDs(Extensions extensions) {
        if (extensions == null) {
            return EMPTY_SET;
        }
        return Collections.unmodifiableSet(new HashSet(Arrays.asList(extensions.getCriticalExtensionOIDs())));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List getExtensionOIDs(Extensions extensions) {
        if (extensions == null) {
            return EMPTY_LIST;
        }
        return Collections.unmodifiableList(Arrays.asList(extensions.getExtensionOIDs()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Set getNonCriticalExtensionOIDs(Extensions extensions) {
        if (extensions == null) {
            return EMPTY_SET;
        }
        return Collections.unmodifiableSet(new HashSet(Arrays.asList(extensions.getNonCriticalExtensionOIDs())));
    }
}