package com.stripe.android.core.networking;

import com.stripe.android.core.networking.QueryStringFactory;
import h00.l;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class QueryStringFactory$create$1 extends u implements l<QueryStringFactory.Parameter, CharSequence> {
    public static final QueryStringFactory$create$1 INSTANCE = new QueryStringFactory$create$1();

    QueryStringFactory$create$1() {
        super(1);
    }

    @Override // h00.l
    public final CharSequence invoke(QueryStringFactory.Parameter it2) {
        s.g(it2, "it");
        return it2.toString();
    }
}