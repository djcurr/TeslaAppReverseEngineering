package org.spongycastle.cert.selector;

import java.math.BigInteger;
import java.util.Collection;
import java.util.Date;
import org.spongycastle.asn1.x509.Extension;
import org.spongycastle.asn1.x509.GeneralName;
import org.spongycastle.asn1.x509.Target;
import org.spongycastle.asn1.x509.TargetInformation;
import org.spongycastle.asn1.x509.Targets;
import org.spongycastle.cert.AttributeCertificateHolder;
import org.spongycastle.cert.AttributeCertificateIssuer;
import org.spongycastle.cert.X509AttributeCertificateHolder;
import org.spongycastle.util.Selector;

/* loaded from: classes5.dex */
public class X509AttributeCertificateHolderSelector implements Selector {
    private final X509AttributeCertificateHolder attributeCert;
    private final Date attributeCertificateValid;
    private final AttributeCertificateHolder holder;
    private final AttributeCertificateIssuer issuer;
    private final BigInteger serialNumber;
    private final Collection targetGroups;
    private final Collection targetNames;

    /* JADX INFO: Access modifiers changed from: package-private */
    public X509AttributeCertificateHolderSelector(AttributeCertificateHolder attributeCertificateHolder, AttributeCertificateIssuer attributeCertificateIssuer, BigInteger bigInteger, Date date, X509AttributeCertificateHolder x509AttributeCertificateHolder, Collection collection, Collection collection2) {
        this.holder = attributeCertificateHolder;
        this.issuer = attributeCertificateIssuer;
        this.serialNumber = bigInteger;
        this.attributeCertificateValid = date;
        this.attributeCert = x509AttributeCertificateHolder;
        this.targetNames = collection;
        this.targetGroups = collection2;
    }

    @Override // org.spongycastle.util.Selector
    public Object clone() {
        return new X509AttributeCertificateHolderSelector(this.holder, this.issuer, this.serialNumber, this.attributeCertificateValid, this.attributeCert, this.targetNames, this.targetGroups);
    }

    public X509AttributeCertificateHolder getAttributeCert() {
        return this.attributeCert;
    }

    public Date getAttributeCertificateValid() {
        if (this.attributeCertificateValid != null) {
            return new Date(this.attributeCertificateValid.getTime());
        }
        return null;
    }

    public AttributeCertificateHolder getHolder() {
        return this.holder;
    }

    public AttributeCertificateIssuer getIssuer() {
        return this.issuer;
    }

    public BigInteger getSerialNumber() {
        return this.serialNumber;
    }

    public Collection getTargetGroups() {
        return this.targetGroups;
    }

    public Collection getTargetNames() {
        return this.targetNames;
    }

    @Override // org.spongycastle.util.Selector
    public boolean match(Object obj) {
        Extension extension;
        Targets[] targetsObjects;
        if (obj instanceof X509AttributeCertificateHolder) {
            X509AttributeCertificateHolder x509AttributeCertificateHolder = (X509AttributeCertificateHolder) obj;
            X509AttributeCertificateHolder x509AttributeCertificateHolder2 = this.attributeCert;
            if (x509AttributeCertificateHolder2 == null || x509AttributeCertificateHolder2.equals(x509AttributeCertificateHolder)) {
                if (this.serialNumber == null || x509AttributeCertificateHolder.getSerialNumber().equals(this.serialNumber)) {
                    if (this.holder == null || x509AttributeCertificateHolder.getHolder().equals(this.holder)) {
                        if (this.issuer == null || x509AttributeCertificateHolder.getIssuer().equals(this.issuer)) {
                            Date date = this.attributeCertificateValid;
                            if (date == null || x509AttributeCertificateHolder.isValidOn(date)) {
                                if ((!this.targetNames.isEmpty() || !this.targetGroups.isEmpty()) && (extension = x509AttributeCertificateHolder.getExtension(Extension.targetInformation)) != null) {
                                    try {
                                        targetsObjects = TargetInformation.getInstance(extension.getParsedValue()).getTargetsObjects();
                                        if (!this.targetNames.isEmpty()) {
                                            boolean z11 = false;
                                            for (Targets targets : targetsObjects) {
                                                Target[] targets2 = targets.getTargets();
                                                int i11 = 0;
                                                while (true) {
                                                    if (i11 >= targets2.length) {
                                                        break;
                                                    } else if (this.targetNames.contains(GeneralName.getInstance(targets2[i11].getTargetName()))) {
                                                        z11 = true;
                                                        break;
                                                    } else {
                                                        i11++;
                                                    }
                                                }
                                            }
                                            if (!z11) {
                                                return false;
                                            }
                                        }
                                    } catch (IllegalArgumentException unused) {
                                    }
                                    if (!this.targetGroups.isEmpty()) {
                                        boolean z12 = false;
                                        for (Targets targets3 : targetsObjects) {
                                            Target[] targets4 = targets3.getTargets();
                                            int i12 = 0;
                                            while (true) {
                                                if (i12 >= targets4.length) {
                                                    break;
                                                } else if (this.targetGroups.contains(GeneralName.getInstance(targets4[i12].getTargetGroup()))) {
                                                    z12 = true;
                                                    break;
                                                } else {
                                                    i12++;
                                                }
                                            }
                                        }
                                        if (!z12) {
                                            return false;
                                        }
                                    }
                                }
                                return true;
                            }
                            return false;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }
}