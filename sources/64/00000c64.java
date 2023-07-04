package bc;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

/* loaded from: classes.dex */
public class n extends m {

    /* renamed from: b  reason: collision with root package name */
    private final InputStream f7618b;

    /* renamed from: c  reason: collision with root package name */
    private long f7619c;

    public n(InputStream inputStream) {
        Objects.requireNonNull(inputStream);
        this.f7618b = inputStream;
        this.f7619c = 0L;
    }

    private long v(long j11) {
        long j12 = 0;
        while (j12 != j11) {
            long skip = this.f7618b.skip(j11 - j12);
            j12 += skip;
            if (skip == 0) {
                break;
            }
        }
        this.f7619c += j12;
        return j12;
    }

    @Override // bc.m
    public int a() {
        try {
            return this.f7618b.available();
        } catch (IOException unused) {
            return 0;
        }
    }

    @Override // bc.m
    public byte b() {
        int read = this.f7618b.read();
        if (read != -1) {
            this.f7619c++;
            return (byte) read;
        }
        throw new EOFException("End of data reached.");
    }

    @Override // bc.m
    public void c(byte[] bArr, int i11, int i12) {
        int i13 = 0;
        while (i13 != i12) {
            int read = this.f7618b.read(bArr, i11 + i13, i12 - i13);
            if (read == -1) {
                throw new EOFException("End of data reached.");
            }
            i13 += read;
        }
        this.f7619c += i13;
    }

    @Override // bc.m
    public byte[] d(int i11) {
        byte[] bArr = new byte[i11];
        c(bArr, 0, i11);
        return bArr;
    }

    @Override // bc.m
    public long l() {
        return this.f7619c;
    }

    @Override // bc.m
    public void t(long j11) {
        if (j11 >= 0) {
            long v11 = v(j11);
            if (v11 != j11) {
                throw new EOFException(String.format("Unable to skip. Requested %d bytes but skipped %d.", Long.valueOf(j11), Long.valueOf(v11)));
            }
            return;
        }
        throw new IllegalArgumentException("n must be zero or greater.");
    }

    @Override // bc.m
    public boolean u(long j11) {
        if (j11 >= 0) {
            return v(j11) == j11;
        }
        throw new IllegalArgumentException("n must be zero or greater.");
    }
}