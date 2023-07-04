package org.spongycastle.cert.selector;

import java.math.BigInteger;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import org.spongycastle.asn1.x509.GeneralName;
import org.spongycastle.cert.AttributeCertificateHolder;
import org.spongycastle.cert.AttributeCertificateIssuer;
import org.spongycastle.cert.X509AttributeCertificateHolder;

/* loaded from: classes5.dex */
public class X509AttributeCertificateHolderSelectorBuilder {
    private X509AttributeCertificateHolder attributeCert;
    private Date attributeCertificateValid;
    private AttributeCertificateHolder holder;
    private AttributeCertificateIssuer issuer;
    private BigInteger serialNumber;
    private Collection targetNames = new HashSet();
    private Collection targetGroups = new HashSet();

    private Set extractGeneralNames(Collection collection) {
        if (collection != null && !collection.isEmpty()) {
            HashSet hashSet = new HashSet();
            for (Object obj : collection) {
                hashSet.add(GeneralName.getInstance(obj));
            }
            return hashSet;
        }
        return new HashSet();
    }

    public void addTargetGroup(GeneralName generalName) {
        this.targetGroups.add(generalName);
    }

    public void addTargetName(GeneralName generalName) {
        this.targetNames.add(generalName);
    }

    public X509AttributeCertificateHolderSelector build() {
        return new X509AttributeCertificateHolderSelector(this.holder, this.issuer, this.serialNumber, this.attributeCertificateValid, this.attributeCert, Collections.unmodifiableCollection(new HashSet(this.targetNames)), Collections.unmodifiableCollection(new HashSet(this.targetGroups)));
    }

    public void setAttributeCert(X509AttributeCertificateHolder x509AttributeCertificateHolder) {
        this.attributeCert = x509AttributeCertificateHolder;
    }

    public void setAttributeCertificateValid(Date date) {
        if (date != null) {
            this.attributeCertificateValid = new Date(date.getTime());
        } else {
            this.attributeCertificateValid = null;
        }
    }

    public void setHolder(AttributeCertificateHolder attributeCertificateHolder) {
        this.holder = attributeCertificateHolder;
    }

    public void setIssuer(AttributeCertificateIssuer attributeCertificateIssuer) {
        this.issuer = attributeCertificateIssuer;
    }

    public void setSerialNumber(BigInteger bigInteger) {
        this.serialNumber = bigInteger;
    }

    public void setTargetGroups(Collection collection) {
        this.targetGroups = extractGeneralNames(collection);
    }

    public void setTargetNames(Collection collection) {
        this.targetNames = extractGeneralNames(collection);
    }
}