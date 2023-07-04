package com.plaid;

import com.plaid.gson.PlaidJsonConverter;
import kotlin.Metadata;
import kotlin.jvm.internal.u;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/plaid/gson/PlaidJsonConverter;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes2.dex */
final class PlaidModule$jsonConverter$2 extends u implements h00.a<PlaidJsonConverter> {
    public static final PlaidModule$jsonConverter$2 INSTANCE = new PlaidModule$jsonConverter$2();

    PlaidModule$jsonConverter$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h00.a
    public final PlaidJsonConverter invoke() {
        return new PlaidJsonConverter();
    }
}