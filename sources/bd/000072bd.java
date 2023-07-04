package h60;

import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.AlgorithmParameterSpec;

/* loaded from: classes5.dex */
public class l implements AlgorithmParameterSpec {

    /* renamed from: a  reason: collision with root package name */
    private final PublicKey f28948a;

    /* renamed from: b  reason: collision with root package name */
    private final PrivateKey f28949b;

    /* renamed from: c  reason: collision with root package name */
    private final PublicKey f28950c;

    /* renamed from: d  reason: collision with root package name */
    private final byte[] f28951d;

    public PrivateKey a() {
        return this.f28949b;
    }

    public PublicKey b() {
        return this.f28948a;
    }

    public PublicKey c() {
        return this.f28950c;
    }

    public byte[] d() {
        return org.bouncycastle.util.a.h(this.f28951d);
    }
}