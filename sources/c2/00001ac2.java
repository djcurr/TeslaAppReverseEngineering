package com.facebook.soloader;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* loaded from: classes3.dex */
public class h implements f {

    /* renamed from: a  reason: collision with root package name */
    private InputStream f12901a;

    /* renamed from: b  reason: collision with root package name */
    private final ZipEntry f12902b;

    /* renamed from: c  reason: collision with root package name */
    private final ZipFile f12903c;

    /* renamed from: d  reason: collision with root package name */
    private final long f12904d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f12905e = true;

    /* renamed from: f  reason: collision with root package name */
    private long f12906f = 0;

    public h(ZipFile zipFile, ZipEntry zipEntry) {
        this.f12903c = zipFile;
        this.f12902b = zipEntry;
        this.f12904d = zipEntry.getSize();
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        this.f12901a = inputStream;
        if (inputStream != null) {
            return;
        }
        throw new IOException(zipEntry.getName() + "'s InputStream is null");
    }

    @Override // com.facebook.soloader.f
    public int M(ByteBuffer byteBuffer, long j11) {
        if (this.f12901a != null) {
            int remaining = byteBuffer.remaining();
            long j12 = this.f12904d - j11;
            if (j12 <= 0) {
                return -1;
            }
            int i11 = (int) j12;
            if (remaining > i11) {
                remaining = i11;
            }
            a(j11);
            if (byteBuffer.hasArray()) {
                this.f12901a.read(byteBuffer.array(), 0, remaining);
                byteBuffer.position(byteBuffer.position() + remaining);
            } else {
                byte[] bArr = new byte[remaining];
                this.f12901a.read(bArr, 0, remaining);
                byteBuffer.put(bArr, 0, remaining);
            }
            this.f12906f += remaining;
            return remaining;
        }
        throw new IOException("InputStream is null");
    }

    public f a(long j11) {
        InputStream inputStream = this.f12901a;
        if (inputStream != null) {
            long j12 = this.f12906f;
            if (j11 == j12) {
                return this;
            }
            long j13 = this.f12904d;
            if (j11 > j13) {
                j11 = j13;
            }
            if (j11 >= j12) {
                inputStream.skip(j11 - j12);
            } else {
                inputStream.close();
                InputStream inputStream2 = this.f12903c.getInputStream(this.f12902b);
                this.f12901a = inputStream2;
                if (inputStream2 != null) {
                    inputStream2.skip(j11);
                } else {
                    throw new IOException(this.f12902b.getName() + "'s InputStream is null");
                }
            }
            this.f12906f = j11;
            return this;
        }
        throw new IOException(this.f12902b.getName() + "'s InputStream is null");
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        InputStream inputStream = this.f12901a;
        if (inputStream != null) {
            inputStream.close();
            this.f12905e = false;
        }
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return this.f12905e;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) {
        return M(byteBuffer, this.f12906f);
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) {
        throw new UnsupportedOperationException("ElfZipFileChannel doesn't support write");
    }
}