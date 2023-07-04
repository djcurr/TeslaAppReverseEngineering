package com.bumptech.glide.load.resource.bitmap;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public class w extends FilterInputStream {

    /* renamed from: a  reason: collision with root package name */
    private volatile byte[] f10809a;

    /* renamed from: b  reason: collision with root package name */
    private int f10810b;

    /* renamed from: c  reason: collision with root package name */
    private int f10811c;

    /* renamed from: d  reason: collision with root package name */
    private int f10812d;

    /* renamed from: e  reason: collision with root package name */
    private int f10813e;

    /* renamed from: f  reason: collision with root package name */
    private final ka.b f10814f;

    /* loaded from: classes.dex */
    static class a extends IOException {
        a(String str) {
            super(str);
        }
    }

    public w(InputStream inputStream, ka.b bVar) {
        this(inputStream, bVar, 65536);
    }

    private int a(InputStream inputStream, byte[] bArr) {
        int i11 = this.f10812d;
        if (i11 != -1) {
            int i12 = this.f10813e - i11;
            int i13 = this.f10811c;
            if (i12 < i13) {
                if (i11 == 0 && i13 > bArr.length && this.f10810b == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i13) {
                        i13 = length;
                    }
                    byte[] bArr2 = (byte[]) this.f10814f.f(i13, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.f10809a = bArr2;
                    this.f10814f.e(bArr);
                    bArr = bArr2;
                } else if (i11 > 0) {
                    System.arraycopy(bArr, i11, bArr, 0, bArr.length - i11);
                }
                int i14 = this.f10813e - this.f10812d;
                this.f10813e = i14;
                this.f10812d = 0;
                this.f10810b = 0;
                int read = inputStream.read(bArr, i14, bArr.length - i14);
                int i15 = this.f10813e;
                if (read > 0) {
                    i15 += read;
                }
                this.f10810b = i15;
                return read;
            }
        }
        int read2 = inputStream.read(bArr);
        if (read2 > 0) {
            this.f10812d = -1;
            this.f10813e = 0;
            this.f10810b = read2;
        }
        return read2;
    }

    private static IOException j() {
        throw new IOException("BufferedInputStream is closed");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.f10809a != null && inputStream != null) {
        } else {
            throw j();
        }
        return (this.f10810b - this.f10813e) + inputStream.available();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f10809a != null) {
            this.f10814f.e(this.f10809a);
            this.f10809a = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    public synchronized void g() {
        this.f10811c = this.f10809a.length;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i11) {
        this.f10811c = Math.max(this.f10811c, i11);
        this.f10812d = this.f10813e;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() {
        byte[] bArr = this.f10809a;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr != null && inputStream != null) {
            if (this.f10813e < this.f10810b || a(inputStream, bArr) != -1) {
                if (bArr != this.f10809a && (bArr = this.f10809a) == null) {
                    throw j();
                }
                int i11 = this.f10810b;
                int i12 = this.f10813e;
                if (i11 - i12 > 0) {
                    this.f10813e = i12 + 1;
                    return bArr[i12] & 255;
                }
                return -1;
            }
            return -1;
        }
        throw j();
    }

    public synchronized void release() {
        if (this.f10809a != null) {
            this.f10814f.e(this.f10809a);
            this.f10809a = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() {
        if (this.f10809a != null) {
            int i11 = this.f10812d;
            if (-1 != i11) {
                this.f10813e = i11;
            } else {
                throw new a("Mark has been invalidated, pos: " + this.f10813e + " markLimit: " + this.f10811c);
            }
        } else {
            throw new IOException("Stream is closed");
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized long skip(long j11) {
        if (j11 < 1) {
            return 0L;
        }
        byte[] bArr = this.f10809a;
        if (bArr != null) {
            InputStream inputStream = ((FilterInputStream) this).in;
            if (inputStream != null) {
                int i11 = this.f10810b;
                int i12 = this.f10813e;
                if (i11 - i12 >= j11) {
                    this.f10813e = (int) (i12 + j11);
                    return j11;
                }
                long j12 = i11 - i12;
                this.f10813e = i11;
                if (this.f10812d != -1 && j11 <= this.f10811c) {
                    if (a(inputStream, bArr) == -1) {
                        return j12;
                    }
                    int i13 = this.f10810b;
                    int i14 = this.f10813e;
                    if (i13 - i14 >= j11 - j12) {
                        this.f10813e = (int) ((i14 + j11) - j12);
                        return j11;
                    }
                    long j13 = (j12 + i13) - i14;
                    this.f10813e = i13;
                    return j13;
                }
                long skip = inputStream.skip(j11 - j12);
                if (skip > 0) {
                    this.f10812d = -1;
                }
                return j12 + skip;
            }
            throw j();
        }
        throw j();
    }

    w(InputStream inputStream, ka.b bVar, int i11) {
        super(inputStream);
        this.f10812d = -1;
        this.f10814f = bVar;
        this.f10809a = (byte[]) bVar.f(i11, byte[].class);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i11, int i12) {
        int i13;
        int i14;
        byte[] bArr2 = this.f10809a;
        if (bArr2 == null) {
            throw j();
        }
        if (i12 == 0) {
            return 0;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream != null) {
            int i15 = this.f10813e;
            int i16 = this.f10810b;
            if (i15 < i16) {
                int i17 = i16 - i15 >= i12 ? i12 : i16 - i15;
                System.arraycopy(bArr2, i15, bArr, i11, i17);
                this.f10813e += i17;
                if (i17 == i12 || inputStream.available() == 0) {
                    return i17;
                }
                i11 += i17;
                i13 = i12 - i17;
            } else {
                i13 = i12;
            }
            while (true) {
                if (this.f10812d == -1 && i13 >= bArr2.length) {
                    i14 = inputStream.read(bArr, i11, i13);
                    if (i14 == -1) {
                        return i13 != i12 ? i12 - i13 : -1;
                    }
                } else if (a(inputStream, bArr2) == -1) {
                    return i13 != i12 ? i12 - i13 : -1;
                } else {
                    if (bArr2 != this.f10809a && (bArr2 = this.f10809a) == null) {
                        throw j();
                    }
                    int i18 = this.f10810b;
                    int i19 = this.f10813e;
                    i14 = i18 - i19 >= i13 ? i13 : i18 - i19;
                    System.arraycopy(bArr2, i19, bArr, i11, i14);
                    this.f10813e += i14;
                }
                i13 -= i14;
                if (i13 == 0) {
                    return i12;
                }
                if (inputStream.available() == 0) {
                    return i12 - i13;
                }
                i11 += i14;
            }
        } else {
            throw j();
        }
    }
}