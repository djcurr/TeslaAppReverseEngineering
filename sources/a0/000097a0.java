package org.spongycastle.asn1;

/* loaded from: classes6.dex */
public interface ASN1TaggedObjectParser extends ASN1Encodable, InMemoryRepresentable {
    ASN1Encodable getObjectParser(int i11, boolean z11);

    int getTagNo();
}