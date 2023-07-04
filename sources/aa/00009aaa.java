package org.spongycastle.cms;

import org.spongycastle.asn1.ASN1ObjectIdentifier;

/* loaded from: classes5.dex */
public interface CMSTypedData extends CMSProcessable {
    ASN1ObjectIdentifier getContentType();
}