package x60;

import java.io.ByteArrayOutputStream;
import okhttp3.internal.http2.Settings;

/* loaded from: classes5.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private final ByteArrayOutputStream f57135a = new ByteArrayOutputStream();

    private a() {
    }

    public static a f() {
        return new a();
    }

    public a a(boolean z11) {
        this.f57135a.write(z11 ? 1 : 0);
        return this;
    }

    public byte[] b() {
        return this.f57135a.toByteArray();
    }

    public a c(r70.c cVar) {
        try {
            this.f57135a.write(cVar.getEncoded());
            return this;
        } catch (Exception e11) {
            throw new RuntimeException(e11.getMessage(), e11);
        }
    }

    public a d(byte[] bArr) {
        try {
            this.f57135a.write(bArr);
            return this;
        } catch (Exception e11) {
            throw new RuntimeException(e11.getMessage(), e11);
        }
    }

    public a e(byte[][] bArr) {
        try {
            for (byte[] bArr2 : bArr) {
                this.f57135a.write(bArr2);
            }
            return this;
        } catch (Exception e11) {
            throw new RuntimeException(e11.getMessage(), e11);
        }
    }

    public a g(int i11, int i12) {
        while (this.f57135a.size() < i12) {
            this.f57135a.write(i11);
        }
        return this;
    }

    public a h(int i11) {
        int i12 = i11 & Settings.DEFAULT_INITIAL_WINDOW_SIZE;
        this.f57135a.write((byte) (i12 >>> 8));
        this.f57135a.write((byte) i12);
        return this;
    }

    public a i(int i11) {
        this.f57135a.write((byte) (i11 >>> 24));
        this.f57135a.write((byte) (i11 >>> 16));
        this.f57135a.write((byte) (i11 >>> 8));
        this.f57135a.write((byte) i11);
        return this;
    }

    public a j(long j11) {
        i((int) (j11 >>> 32));
        i((int) j11);
        return this;
    }
}