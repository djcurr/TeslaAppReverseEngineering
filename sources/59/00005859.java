package com.stripe.android.stripe3ds2.service;

import com.stripe.android.stripe3ds2.init.Warning;
import com.stripe.android.stripe3ds2.transaction.Transaction;
import java.util.List;

/* loaded from: classes6.dex */
public interface ThreeDS2Service {
    Transaction createTransaction(String str, String str2);

    String getSdkVersion();

    List<Warning> getWarnings();
}