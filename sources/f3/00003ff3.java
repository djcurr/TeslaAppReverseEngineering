package com.plaid.internal;

import android.util.Base64;

/* loaded from: classes2.dex */
public final class c implements e {
    @Override // com.plaid.internal.e
    public byte[] a(String input, int i11) {
        kotlin.jvm.internal.s.g(input, "input");
        return Base64.decode(input, i11);
    }

    @Override // com.plaid.internal.e
    public String a(byte[] input, int i11) {
        kotlin.jvm.internal.s.g(input, "input");
        return Base64.encodeToString(input, i11);
    }
}