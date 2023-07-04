package org.spongycastle.asn1.x509;

/* loaded from: classes5.dex */
public interface NameConstraintValidator {
    void addExcludedSubtree(GeneralSubtree generalSubtree);

    void checkExcluded(GeneralName generalName);

    void checkPermitted(GeneralName generalName);

    void intersectEmptyPermittedSubtree(int i11);

    void intersectPermittedSubtree(GeneralSubtree generalSubtree);

    void intersectPermittedSubtree(GeneralSubtree[] generalSubtreeArr);
}