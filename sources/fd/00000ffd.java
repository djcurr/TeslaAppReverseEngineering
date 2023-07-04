package cc;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f9056a;

    /* renamed from: b  reason: collision with root package name */
    private final Charset f9057b;

    public f(byte[] bArr, Charset charset) {
        this.f9056a = bArr;
        this.f9057b = charset;
    }

    public byte[] a() {
        return this.f9056a;
    }

    public String b(Charset charset) {
        if (charset != null) {
            try {
                return new String(this.f9056a, charset.name());
            } catch (UnsupportedEncodingException unused) {
            }
        }
        return new String(this.f9056a);
    }

    public String toString() {
        return b(this.f9057b);
    }
}