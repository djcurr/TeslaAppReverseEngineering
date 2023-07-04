package com.plaid.gson;

import ch.qos.logback.core.CoreConstants;
import com.google.gson.k;
import com.google.gson.m;
import com.google.gson.p;
import com.google.gson.q;
import com.plaid.link.result.LinkInstitution;
import java.lang.reflect.Type;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\f"}, d2 = {"Lcom/plaid/gson/RNLinkInstitutionAdapter;", "Lcom/google/gson/q;", "Lcom/plaid/link/result/LinkInstitution;", "src", "Ljava/lang/reflect/Type;", "typeOfSrc", "Lcom/google/gson/p;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/google/gson/k;", "serialize", "<init>", "()V", "react-native-plaid-link-sdk_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class RNLinkInstitutionAdapter implements q<LinkInstitution> {
    @Override // com.google.gson.q
    public k serialize(LinkInstitution linkInstitution, Type type, p pVar) {
        if (linkInstitution == null) {
            return new m();
        }
        m mVar = new m();
        mVar.n("id", linkInstitution.getId());
        mVar.n("name", linkInstitution.getName());
        return mVar;
    }
}