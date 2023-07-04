package ea;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import org.spongycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
class b implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    private final InputStream f25052a;

    /* renamed from: b  reason: collision with root package name */
    private final Charset f25053b;

    /* renamed from: c  reason: collision with root package name */
    private byte[] f25054c;

    /* renamed from: d  reason: collision with root package name */
    private int f25055d;

    /* renamed from: e  reason: collision with root package name */
    private int f25056e;

    /* loaded from: classes.dex */
    class a extends ByteArrayOutputStream {
        a(int i11) {
            super(i11);
        }

        @Override // java.io.ByteArrayOutputStream
        public String toString() {
            int i11 = ((ByteArrayOutputStream) this).count;
            if (i11 > 0 && ((ByteArrayOutputStream) this).buf[i11 - 1] == 13) {
                i11--;
            }
            try {
                return new String(((ByteArrayOutputStream) this).buf, 0, i11, b.this.f25053b.name());
            } catch (UnsupportedEncodingException e11) {
                throw new AssertionError(e11);
            }
        }
    }

    public b(InputStream inputStream, Charset charset) {
        this(inputStream, PKIFailureInfo.certRevoked, charset);
    }

    private void g() {
        InputStream inputStream = this.f25052a;
        byte[] bArr = this.f25054c;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read != -1) {
            this.f25055d = 0;
            this.f25056e = read;
            return;
        }
        throw new EOFException();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.f25052a) {
            if (this.f25054c != null) {
                this.f25054c = null;
                this.f25052a.close();
            }
        }
    }

    public boolean j() {
        return this.f25056e == -1;
    }

    public String l() {
        int i11;
        byte[] bArr;
        int i12;
        synchronized (this.f25052a) {
            if (this.f25054c != null) {
                if (this.f25055d >= this.f25056e) {
                    g();
                }
                for (int i13 = this.f25055d; i13 != this.f25056e; i13++) {
                    byte[] bArr2 = this.f25054c;
                    if (bArr2[i13] == 10) {
                        int i14 = this.f25055d;
                        if (i13 != i14) {
                            i12 = i13 - 1;
                            if (bArr2[i12] == 13) {
                                String str = new String(bArr2, i14, i12 - i14, this.f25053b.name());
                                this.f25055d = i13 + 1;
                                return str;
                            }
                        }
                        i12 = i13;
                        String str2 = new String(bArr2, i14, i12 - i14, this.f25053b.name());
                        this.f25055d = i13 + 1;
                        return str2;
                    }
                }
                a aVar = new a((this.f25056e - this.f25055d) + 80);
                loop1: while (true) {
                    byte[] bArr3 = this.f25054c;
                    int i15 = this.f25055d;
                    aVar.write(bArr3, i15, this.f25056e - i15);
                    this.f25056e = -1;
                    g();
                    i11 = this.f25055d;
                    while (i11 != this.f25056e) {
                        bArr = this.f25054c;
                        if (bArr[i11] == 10) {
                            break loop1;
                        }
                        i11++;
                    }
                }
                int i16 = this.f25055d;
                if (i11 != i16) {
                    aVar.write(bArr, i16, i11 - i16);
                }
                this.f25055d = i11 + 1;
                return aVar.toString();
            }
            throw new IOException("LineReader is closed");
        }
    }

    public b(InputStream inputStream, int i11, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        }
        if (i11 >= 0) {
            if (charset.equals(c.f25058a)) {
                this.f25052a = inputStream;
                this.f25053b = charset;
                this.f25054c = new byte[i11];
                return;
            }
            throw new IllegalArgumentException("Unsupported encoding");
        }
        throw new IllegalArgumentException("capacity <= 0");
    }
}