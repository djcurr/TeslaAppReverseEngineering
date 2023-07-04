package org.spongycastle.cms;

import org.spongycastle.asn1.cms.RecipientInfo;
import org.spongycastle.operator.GenericKey;

/* loaded from: classes5.dex */
public interface RecipientInfoGenerator {
    RecipientInfo generate(GenericKey genericKey);
}