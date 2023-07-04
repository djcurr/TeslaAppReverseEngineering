package org.spongycastle.jce.provider;

import java.security.InvalidAlgorithmParameterException;
import java.security.PublicKey;
import java.security.cert.CertPath;
import java.security.cert.CertPathParameters;
import java.security.cert.CertPathValidatorException;
import java.security.cert.CertPathValidatorResult;
import java.security.cert.CertPathValidatorSpi;
import java.security.cert.Certificate;
import java.security.cert.PKIXCertPathChecker;
import java.security.cert.PKIXCertPathValidatorResult;
import java.security.cert.PKIXParameters;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.spongycastle.asn1.x500.X500Name;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;
import org.spongycastle.asn1.x509.Extension;
import org.spongycastle.jcajce.PKIXExtendedBuilderParameters;
import org.spongycastle.jcajce.PKIXExtendedParameters;
import org.spongycastle.jcajce.util.BCJcaJceHelper;
import org.spongycastle.jcajce.util.JcaJceHelper;
import org.spongycastle.jce.exception.ExtCertPathValidatorException;
import org.spongycastle.x509.ExtendedPKIXParameters;

/* loaded from: classes4.dex */
public class PKIXCertPathValidatorSpi extends CertPathValidatorSpi {
    private final JcaJceHelper helper = new BCJcaJceHelper();

    @Override // java.security.cert.CertPathValidatorSpi
    public CertPathValidatorResult engineValidate(CertPath certPath, CertPathParameters certPathParameters) {
        PKIXExtendedParameters pKIXExtendedParameters;
        X500Name ca2;
        PublicKey cAPublicKey;
        HashSet hashSet;
        ArrayList[] arrayListArr;
        HashSet hashSet2;
        if (certPathParameters instanceof PKIXParameters) {
            PKIXExtendedParameters.Builder builder = new PKIXExtendedParameters.Builder((PKIXParameters) certPathParameters);
            if (certPathParameters instanceof ExtendedPKIXParameters) {
                ExtendedPKIXParameters extendedPKIXParameters = (ExtendedPKIXParameters) certPathParameters;
                builder.setUseDeltasEnabled(extendedPKIXParameters.isUseDeltasEnabled());
                builder.setValidityModel(extendedPKIXParameters.getValidityModel());
            }
            pKIXExtendedParameters = builder.build();
        } else if (certPathParameters instanceof PKIXExtendedBuilderParameters) {
            pKIXExtendedParameters = ((PKIXExtendedBuilderParameters) certPathParameters).getBaseParameters();
        } else if (certPathParameters instanceof PKIXExtendedParameters) {
            pKIXExtendedParameters = (PKIXExtendedParameters) certPathParameters;
        } else {
            throw new InvalidAlgorithmParameterException("Parameters must be a " + PKIXParameters.class.getName() + " instance.");
        }
        if (pKIXExtendedParameters.getTrustAnchors() != null) {
            List<? extends Certificate> certificates = certPath.getCertificates();
            int size = certificates.size();
            if (!certificates.isEmpty()) {
                Set initialPolicies = pKIXExtendedParameters.getInitialPolicies();
                try {
                    TrustAnchor findTrustAnchor = CertPathValidatorUtilities.findTrustAnchor((X509Certificate) certificates.get(certificates.size() - 1), pKIXExtendedParameters.getTrustAnchors(), pKIXExtendedParameters.getSigProvider());
                    if (findTrustAnchor != null) {
                        PKIXExtendedParameters build = new PKIXExtendedParameters.Builder(pKIXExtendedParameters).setTrustAnchor(findTrustAnchor).build();
                        int i11 = size + 1;
                        ArrayList[] arrayListArr2 = new ArrayList[i11];
                        for (int i12 = 0; i12 < i11; i12++) {
                            arrayListArr2[i12] = new ArrayList();
                        }
                        HashSet hashSet3 = new HashSet();
                        hashSet3.add("2.5.29.32.0");
                        PKIXPolicyNode pKIXPolicyNode = new PKIXPolicyNode(new ArrayList(), 0, hashSet3, null, new HashSet(), "2.5.29.32.0", false);
                        arrayListArr2[0].add(pKIXPolicyNode);
                        PKIXNameConstraintValidator pKIXNameConstraintValidator = new PKIXNameConstraintValidator();
                        HashSet hashSet4 = new HashSet();
                        int i13 = build.isExplicitPolicyRequired() ? 0 : i11;
                        int i14 = build.isAnyPolicyInhibited() ? 0 : i11;
                        if (build.isPolicyMappingInhibited()) {
                            i11 = 0;
                        }
                        X509Certificate trustedCert = findTrustAnchor.getTrustedCert();
                        try {
                            if (trustedCert != null) {
                                ca2 = PrincipalUtils.getSubjectPrincipal(trustedCert);
                                cAPublicKey = trustedCert.getPublicKey();
                            } else {
                                ca2 = PrincipalUtils.getCA(findTrustAnchor);
                                cAPublicKey = findTrustAnchor.getCAPublicKey();
                            }
                            try {
                                AlgorithmIdentifier algorithmIdentifier = CertPathValidatorUtilities.getAlgorithmIdentifier(cAPublicKey);
                                algorithmIdentifier.getAlgorithm();
                                algorithmIdentifier.getParameters();
                                if (build.getTargetConstraints() != null && !build.getTargetConstraints().match((Certificate) ((X509Certificate) certificates.get(0)))) {
                                    throw new ExtCertPathValidatorException("Target certificate in certification path does not match targetConstraints.", null, certPath, 0);
                                }
                                List<PKIXCertPathChecker> certPathCheckers = build.getCertPathCheckers();
                                for (PKIXCertPathChecker pKIXCertPathChecker : certPathCheckers) {
                                    pKIXCertPathChecker.init(false);
                                }
                                int i15 = size;
                                X509Certificate x509Certificate = null;
                                int i16 = i11;
                                int i17 = i14;
                                PKIXPolicyNode pKIXPolicyNode2 = pKIXPolicyNode;
                                int i18 = i13;
                                int size2 = certificates.size() - 1;
                                int i19 = i18;
                                while (size2 >= 0) {
                                    int i21 = size - size2;
                                    x509Certificate = (X509Certificate) certificates.get(size2);
                                    TrustAnchor trustAnchor = findTrustAnchor;
                                    boolean z11 = size2 == certificates.size() + (-1);
                                    int i22 = i17;
                                    List<? extends Certificate> list = certificates;
                                    int i23 = i19;
                                    int i24 = size2;
                                    Set set = initialPolicies;
                                    int i25 = i16;
                                    PKIXExtendedParameters pKIXExtendedParameters2 = build;
                                    PKIXNameConstraintValidator pKIXNameConstraintValidator2 = pKIXNameConstraintValidator;
                                    ArrayList[] arrayListArr3 = arrayListArr2;
                                    RFC3280CertPathUtilities.processCertA(certPath, build, size2, cAPublicKey, z11, ca2, trustedCert, this.helper);
                                    RFC3280CertPathUtilities.processCertBC(certPath, i24, pKIXNameConstraintValidator2);
                                    PKIXPolicyNode processCertE = RFC3280CertPathUtilities.processCertE(certPath, i24, RFC3280CertPathUtilities.processCertD(certPath, i24, hashSet4, pKIXPolicyNode2, arrayListArr3, i22));
                                    RFC3280CertPathUtilities.processCertF(certPath, i24, processCertE, i23);
                                    if (i21 == size) {
                                        arrayListArr = arrayListArr3;
                                        pKIXPolicyNode2 = processCertE;
                                        i17 = i22;
                                        i19 = i23;
                                        i16 = i25;
                                    } else if (x509Certificate != null && x509Certificate.getVersion() == 1) {
                                        throw new CertPathValidatorException("Version 1 certificates can't be used as CA ones.", null, certPath, i24);
                                    } else {
                                        RFC3280CertPathUtilities.prepareNextCertA(certPath, i24);
                                        arrayListArr = arrayListArr3;
                                        PKIXPolicyNode prepareCertB = RFC3280CertPathUtilities.prepareCertB(certPath, i24, arrayListArr, processCertE, i25);
                                        RFC3280CertPathUtilities.prepareNextCertG(certPath, i24, pKIXNameConstraintValidator2);
                                        int prepareNextCertH1 = RFC3280CertPathUtilities.prepareNextCertH1(certPath, i24, i23);
                                        int prepareNextCertH2 = RFC3280CertPathUtilities.prepareNextCertH2(certPath, i24, i25);
                                        int prepareNextCertH3 = RFC3280CertPathUtilities.prepareNextCertH3(certPath, i24, i22);
                                        i19 = RFC3280CertPathUtilities.prepareNextCertI1(certPath, i24, prepareNextCertH1);
                                        int prepareNextCertI2 = RFC3280CertPathUtilities.prepareNextCertI2(certPath, i24, prepareNextCertH2);
                                        int prepareNextCertJ = RFC3280CertPathUtilities.prepareNextCertJ(certPath, i24, prepareNextCertH3);
                                        RFC3280CertPathUtilities.prepareNextCertK(certPath, i24);
                                        i15 = RFC3280CertPathUtilities.prepareNextCertM(certPath, i24, RFC3280CertPathUtilities.prepareNextCertL(certPath, i24, i15));
                                        RFC3280CertPathUtilities.prepareNextCertN(certPath, i24);
                                        Set<String> criticalExtensionOIDs = x509Certificate.getCriticalExtensionOIDs();
                                        if (criticalExtensionOIDs != null) {
                                            hashSet2 = new HashSet(criticalExtensionOIDs);
                                            hashSet2.remove(RFC3280CertPathUtilities.KEY_USAGE);
                                            hashSet2.remove(RFC3280CertPathUtilities.CERTIFICATE_POLICIES);
                                            hashSet2.remove(RFC3280CertPathUtilities.POLICY_MAPPINGS);
                                            hashSet2.remove(RFC3280CertPathUtilities.INHIBIT_ANY_POLICY);
                                            hashSet2.remove(RFC3280CertPathUtilities.ISSUING_DISTRIBUTION_POINT);
                                            hashSet2.remove(RFC3280CertPathUtilities.DELTA_CRL_INDICATOR);
                                            hashSet2.remove(RFC3280CertPathUtilities.POLICY_CONSTRAINTS);
                                            hashSet2.remove(RFC3280CertPathUtilities.BASIC_CONSTRAINTS);
                                            hashSet2.remove(RFC3280CertPathUtilities.SUBJECT_ALTERNATIVE_NAME);
                                            hashSet2.remove(RFC3280CertPathUtilities.NAME_CONSTRAINTS);
                                        } else {
                                            hashSet2 = new HashSet();
                                        }
                                        RFC3280CertPathUtilities.prepareNextCertO(certPath, i24, hashSet2, certPathCheckers);
                                        X500Name subjectPrincipal = PrincipalUtils.getSubjectPrincipal(x509Certificate);
                                        try {
                                            PublicKey nextWorkingKey = CertPathValidatorUtilities.getNextWorkingKey(certPath.getCertificates(), i24, this.helper);
                                            AlgorithmIdentifier algorithmIdentifier2 = CertPathValidatorUtilities.getAlgorithmIdentifier(nextWorkingKey);
                                            algorithmIdentifier2.getAlgorithm();
                                            algorithmIdentifier2.getParameters();
                                            pKIXPolicyNode2 = prepareCertB;
                                            i17 = prepareNextCertJ;
                                            ca2 = subjectPrincipal;
                                            cAPublicKey = nextWorkingKey;
                                            trustedCert = x509Certificate;
                                            i16 = prepareNextCertI2;
                                        } catch (CertPathValidatorException e11) {
                                            throw new CertPathValidatorException("Next working key could not be retrieved.", e11, certPath, i24);
                                        }
                                    }
                                    size2 = i24 - 1;
                                    arrayListArr2 = arrayListArr;
                                    certificates = list;
                                    initialPolicies = set;
                                    findTrustAnchor = trustAnchor;
                                    pKIXNameConstraintValidator = pKIXNameConstraintValidator2;
                                    build = pKIXExtendedParameters2;
                                }
                                PKIXExtendedParameters pKIXExtendedParameters3 = build;
                                ArrayList[] arrayListArr4 = arrayListArr2;
                                TrustAnchor trustAnchor2 = findTrustAnchor;
                                Set set2 = initialPolicies;
                                X509Certificate x509Certificate2 = x509Certificate;
                                int i26 = size2;
                                int i27 = i26 + 1;
                                int wrapupCertB = RFC3280CertPathUtilities.wrapupCertB(certPath, i27, RFC3280CertPathUtilities.wrapupCertA(i19, x509Certificate2));
                                Set<String> criticalExtensionOIDs2 = x509Certificate2.getCriticalExtensionOIDs();
                                if (criticalExtensionOIDs2 != null) {
                                    hashSet = new HashSet(criticalExtensionOIDs2);
                                    hashSet.remove(RFC3280CertPathUtilities.KEY_USAGE);
                                    hashSet.remove(RFC3280CertPathUtilities.CERTIFICATE_POLICIES);
                                    hashSet.remove(RFC3280CertPathUtilities.POLICY_MAPPINGS);
                                    hashSet.remove(RFC3280CertPathUtilities.INHIBIT_ANY_POLICY);
                                    hashSet.remove(RFC3280CertPathUtilities.ISSUING_DISTRIBUTION_POINT);
                                    hashSet.remove(RFC3280CertPathUtilities.DELTA_CRL_INDICATOR);
                                    hashSet.remove(RFC3280CertPathUtilities.POLICY_CONSTRAINTS);
                                    hashSet.remove(RFC3280CertPathUtilities.BASIC_CONSTRAINTS);
                                    hashSet.remove(RFC3280CertPathUtilities.SUBJECT_ALTERNATIVE_NAME);
                                    hashSet.remove(RFC3280CertPathUtilities.NAME_CONSTRAINTS);
                                    hashSet.remove(RFC3280CertPathUtilities.CRL_DISTRIBUTION_POINTS);
                                    hashSet.remove(Extension.extendedKeyUsage.getId());
                                } else {
                                    hashSet = new HashSet();
                                }
                                RFC3280CertPathUtilities.wrapupCertF(certPath, i27, certPathCheckers, hashSet);
                                PKIXPolicyNode wrapupCertG = RFC3280CertPathUtilities.wrapupCertG(certPath, pKIXExtendedParameters3, set2, i27, arrayListArr4, pKIXPolicyNode2, hashSet4);
                                if (wrapupCertB <= 0 && wrapupCertG == null) {
                                    throw new CertPathValidatorException("Path processing failed on policy.", null, certPath, i26);
                                }
                                return new PKIXCertPathValidatorResult(trustAnchor2, wrapupCertG, x509Certificate2.getPublicKey());
                            } catch (CertPathValidatorException e12) {
                                throw new ExtCertPathValidatorException("Algorithm identifier of public key of trust anchor could not be read.", e12, certPath, -1);
                            }
                        } catch (IllegalArgumentException e13) {
                            throw new ExtCertPathValidatorException("Subject of trust anchor could not be (re)encoded.", e13, certPath, -1);
                        }
                    }
                    throw new CertPathValidatorException("Trust anchor for certification path not found.", null, certPath, -1);
                } catch (AnnotatedException e14) {
                    throw new CertPathValidatorException(e14.getMessage(), e14, certPath, certificates.size() - 1);
                }
            }
            throw new CertPathValidatorException("Certification path is empty.", null, certPath, -1);
        }
        throw new InvalidAlgorithmParameterException("trustAnchors is null, this is not allowed for certification path validation.");
    }
}