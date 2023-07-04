package com.stripe.android.model;

import com.stripe.android.model.BankAccountTokenParams;

/* loaded from: classes6.dex */
public final class BankAccountTokenParamsFixtures {
    public static final BankAccountTokenParamsFixtures INSTANCE = new BankAccountTokenParamsFixtures();
    public static final BankAccountTokenParams DEFAULT = new BankAccountTokenParams("US", Source.USD, "000123456789", BankAccountTokenParams.Type.Individual, "Jenny Rosen", "110000000");
    public static final int $stable = 8;

    private BankAccountTokenParamsFixtures() {
    }
}