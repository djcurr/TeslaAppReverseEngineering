package org.spongycastle.x509;

import java.io.IOException;
import java.math.BigInteger;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import org.spongycastle.asn1.ASN1InputStream;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.DEROctetString;
import org.spongycastle.asn1.x509.GeneralName;
import org.spongycastle.asn1.x509.Target;
import org.spongycastle.asn1.x509.TargetInformation;
import org.spongycastle.asn1.x509.Targets;
import org.spongycastle.asn1.x509.X509Extensions;
import org.spongycastle.util.Selector;

/* loaded from: classes4.dex */
public class X509AttributeCertStoreSelector implements Selector {
    private X509AttributeCertificate attributeCert;
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
                if (obj instanceof GeneralName) {
                    hashSet.add(obj);
                } else {
                    hashSet.add(GeneralName.getInstance(ASN1Primitive.fromByteArray((byte[]) obj)));
                }
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

    @Override // org.spongycastle.util.Selector
    public Object clone() {
        X509AttributeCertStoreSelector x509AttributeCertStoreSelector = new X509AttributeCertStoreSelector();
        x509AttributeCertStoreSelector.attributeCert = this.attributeCert;
        x509AttributeCertStoreSelector.attributeCertificateValid = getAttributeCertificateValid();
        x509AttributeCertStoreSelector.holder = this.holder;
        x509AttributeCertStoreSelector.issuer = this.issuer;
        x509AttributeCertStoreSelector.serialNumber = this.serialNumber;
        x509AttributeCertStoreSelector.targetGroups = getTargetGroups();
        x509AttributeCertStoreSelector.targetNames = getTargetNames();
        return x509AttributeCertStoreSelector;
    }

    public X509AttributeCertificate getAttributeCert() {
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
        return Collections.unmodifiableCollection(this.targetGroups);
    }

    public Collection getTargetNames() {
        return Collections.unmodifiableCollection(this.targetNames);
    }

    @Override // org.spongycastle.util.Selector
    public boolean match(Object obj) {
        byte[] extensionValue;
        Targets[] targetsObjects;
        if (obj instanceof X509AttributeCertificate) {
            X509AttributeCertificate x509AttributeCertificate = (X509AttributeCertificate) obj;
            X509AttributeCertificate x509AttributeCertificate2 = this.attributeCert;
            if (x509AttributeCertificate2 == null || x509AttributeCertificate2.equals(x509AttributeCertificate)) {
                if (this.serialNumber == null || x509AttributeCertificate.getSerialNumber().equals(this.serialNumber)) {
                    if (this.holder == null || x509AttributeCertificate.getHolder().equals(this.holder)) {
                        if (this.issuer == null || x509AttributeCertificate.getIssuer().equals(this.issuer)) {
                            Date date = this.attributeCertificateValid;
                            if (date != null) {
                                try {
                                    x509AttributeCertificate.checkValidity(date);
                                } catch (CertificateExpiredException | CertificateNotYetValidException unused) {
                                    return false;
                                }
                            }
                            if ((!this.targetNames.isEmpty() || !this.targetGroups.isEmpty()) && (extensionValue = x509AttributeCertificate.getExtensionValue(X509Extensions.TargetInformation.getId())) != null) {
                                try {
                                    targetsObjects = TargetInformation.getInstance(new ASN1InputStream(((DEROctetString) ASN1Primitive.fromByteArray(extensionValue)).getOctets()).readObject()).getTargetsObjects();
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
                                } catch (IOException | IllegalArgumentException unused2) {
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

    public void setAttributeCert(X509AttributeCertificate x509AttributeCertificate) {
        this.attributeCert = x509AttributeCertificate;
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

    public void addTargetGroup(byte[] bArr) {
        addTargetGroup(GeneralName.getInstance(ASN1Primitive.fromByteArray(bArr)));
    }

    public void addTargetName(byte[] bArr) {
        addTargetName(GeneralName.getInstance(ASN1Primitive.fromByteArray(bArr)));
    }
}