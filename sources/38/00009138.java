package org.bouncycastle.crypto;

import java.security.SecureRandom;

/* loaded from: classes5.dex */
public class t {

    /* renamed from: a  reason: collision with root package name */
    private SecureRandom f43155a;

    /* renamed from: b  reason: collision with root package name */
    private int f43156b;

    public t(SecureRandom secureRandom, int i11) {
        this.f43155a = k.c(secureRandom);
        this.f43156b = i11;
    }

    public SecureRandom a() {
        return this.f43155a;
    }

    public int b() {
        return this.f43156b;
    }
}