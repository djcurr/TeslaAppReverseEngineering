package h60;

import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.AlgorithmParameterSpec;

/* loaded from: classes5.dex */
public class e implements AlgorithmParameterSpec {

    /* renamed from: a  reason: collision with root package name */
    private final PublicKey f28929a;

    /* renamed from: b  reason: collision with root package name */
    private final PrivateKey f28930b;

    /* renamed from: c  reason: collision with root package name */
    private final PublicKey f28931c;

    /* renamed from: d  reason: collision with root package name */
    private final byte[] f28932d;

    public PrivateKey a() {
        return this.f28930b;
    }

    public PublicKey b() {
        return this.f28929a;
    }

    public PublicKey c() {
        return this.f28931c;
    }

    public byte[] d() {
        return org.bouncycastle.util.a.h(this.f28932d);
    }
}