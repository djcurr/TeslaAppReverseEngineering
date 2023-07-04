package g60;

import java.io.FilterInputStream;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import org.bouncycastle.crypto.io.InvalidCipherTextIOException;

/* loaded from: classes5.dex */
public class a extends FilterInputStream {

    /* renamed from: a  reason: collision with root package name */
    private final Cipher f27805a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f27806b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f27807c;

    /* renamed from: d  reason: collision with root package name */
    private byte[] f27808d;

    /* renamed from: e  reason: collision with root package name */
    private int f27809e;

    /* renamed from: f  reason: collision with root package name */
    private int f27810f;

    public a(InputStream inputStream, Cipher cipher) {
        super(inputStream);
        this.f27806b = new byte[512];
        this.f27807c = false;
        this.f27805a = cipher;
    }

    private byte[] a() {
        try {
            if (this.f27807c) {
                return null;
            }
            this.f27807c = true;
            return this.f27805a.doFinal();
        } catch (GeneralSecurityException e11) {
            throw new InvalidCipherTextIOException("Error finalising cipher", e11);
        }
    }

    private int g() {
        if (this.f27807c) {
            return -1;
        }
        this.f27810f = 0;
        this.f27809e = 0;
        while (true) {
            int i11 = this.f27809e;
            if (i11 != 0) {
                return i11;
            }
            int read = ((FilterInputStream) this).in.read(this.f27806b);
            if (read == -1) {
                byte[] a11 = a();
                this.f27808d = a11;
                if (a11 == null || a11.length == 0) {
                    return -1;
                }
                int length = a11.length;
                this.f27809e = length;
                return length;
            }
            byte[] update = this.f27805a.update(this.f27806b, 0, read);
            this.f27808d = update;
            if (update != null) {
                this.f27809e = update.length;
            }
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        return this.f27809e - this.f27810f;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            ((FilterInputStream) this).in.close();
            this.f27810f = 0;
            this.f27809e = 0;
        } finally {
            if (!this.f27807c) {
                a();
            }
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i11) {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        if (this.f27810f < this.f27809e || g() >= 0) {
            byte[] bArr = this.f27808d;
            int i11 = this.f27810f;
            this.f27810f = i11 + 1;
            return bArr[i11] & 255;
        }
        return -1;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i11, int i12) {
        if (this.f27810f < this.f27809e || g() >= 0) {
            int min = Math.min(i12, available());
            System.arraycopy(this.f27808d, this.f27810f, bArr, i11, min);
            this.f27810f += min;
            return min;
        }
        return -1;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j11) {
        if (j11 <= 0) {
            return 0L;
        }
        int min = (int) Math.min(j11, available());
        this.f27810f += min;
        return min;
    }
}