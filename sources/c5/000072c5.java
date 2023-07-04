package h60;

import java.security.spec.KeySpec;

/* loaded from: classes5.dex */
public class t implements KeySpec {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f28964a;

    /* renamed from: b  reason: collision with root package name */
    private final String f28965b;

    /* renamed from: c  reason: collision with root package name */
    private final int f28966c;

    /* renamed from: d  reason: collision with root package name */
    private final byte[] f28967d;

    public String a() {
        return this.f28965b;
    }

    public int b() {
        return this.f28966c;
    }

    public byte[] c() {
        return org.bouncycastle.util.a.h(this.f28964a);
    }

    public byte[] d() {
        return org.bouncycastle.util.a.h(this.f28967d);
    }
}