package com.plaid.internal;

import com.plaid.link.configuration.PlaidEnvironment;

/* loaded from: classes2.dex */
public final /* synthetic */ class f9 {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int[] f18589a;

    static {
        int[] iArr = new int[PlaidEnvironment.values().length];
        iArr[PlaidEnvironment.PRODUCTION.ordinal()] = 1;
        iArr[PlaidEnvironment.DEVELOPMENT.ordinal()] = 2;
        iArr[PlaidEnvironment.SANDBOX.ordinal()] = 3;
        f18589a = iArr;
    }
}