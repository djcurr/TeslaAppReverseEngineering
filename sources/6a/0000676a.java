package e60;

import java.io.InputStream;
import java.io.OutputStream;
import java.security.KeyStore;

/* loaded from: classes5.dex */
public class c implements KeyStore.LoadStoreParameter {

    /* renamed from: a  reason: collision with root package name */
    private final InputStream f24864a;

    /* renamed from: b  reason: collision with root package name */
    private final OutputStream f24865b;

    /* renamed from: c  reason: collision with root package name */
    private final KeyStore.ProtectionParameter f24866c;

    public InputStream a() {
        if (this.f24865b == null) {
            return this.f24864a;
        }
        throw new UnsupportedOperationException("parameter configured for storage OutputStream present");
    }

    public OutputStream b() {
        OutputStream outputStream = this.f24865b;
        if (outputStream != null) {
            return outputStream;
        }
        throw new UnsupportedOperationException("parameter not configured for storage - no OutputStream");
    }

    @Override // java.security.KeyStore.LoadStoreParameter
    public KeyStore.ProtectionParameter getProtectionParameter() {
        return this.f24866c;
    }
}