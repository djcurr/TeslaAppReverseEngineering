package e60;

import java.io.OutputStream;
import java.security.KeyStore;

/* loaded from: classes5.dex */
public class b implements KeyStore.LoadStoreParameter {

    /* renamed from: a  reason: collision with root package name */
    private final KeyStore.ProtectionParameter f24861a;

    /* renamed from: b  reason: collision with root package name */
    private final z50.e f24862b;

    /* renamed from: c  reason: collision with root package name */
    private OutputStream f24863c;

    public OutputStream a() {
        return this.f24863c;
    }

    public z50.e b() {
        return this.f24862b;
    }

    @Override // java.security.KeyStore.LoadStoreParameter
    public KeyStore.ProtectionParameter getProtectionParameter() {
        return this.f24861a;
    }
}