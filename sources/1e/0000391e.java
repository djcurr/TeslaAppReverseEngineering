package com.google.firebase.messaging;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import org.spongycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes2.dex */
final class b {
    private static byte[] a(Queue<byte[]> queue, int i11) {
        if (queue.isEmpty()) {
            return new byte[0];
        }
        byte[] remove = queue.remove();
        if (remove.length == i11) {
            return remove;
        }
        int length = i11 - remove.length;
        byte[] copyOf = Arrays.copyOf(remove, i11);
        while (length > 0) {
            byte[] remove2 = queue.remove();
            int min = Math.min(length, remove2.length);
            System.arraycopy(remove2, 0, copyOf, i11 - length, min);
            length -= min;
        }
        return copyOf;
    }

    public static InputStream b(InputStream inputStream, long j11) {
        return new a(inputStream, j11);
    }

    private static int c(long j11) {
        if (j11 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j11 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j11;
    }

    public static byte[] d(InputStream inputStream) {
        return e(inputStream, new ArrayDeque(20), 0);
    }

    private static byte[] e(InputStream inputStream, Queue<byte[]> queue, int i11) {
        int min = Math.min((int) PKIFailureInfo.certRevoked, Math.max(128, Integer.highestOneBit(i11) * 2));
        while (i11 < 2147483639) {
            int min2 = Math.min(min, 2147483639 - i11);
            byte[] bArr = new byte[min2];
            queue.add(bArr);
            int i12 = 0;
            while (i12 < min2) {
                int read = inputStream.read(bArr, i12, min2 - i12);
                if (read == -1) {
                    return a(queue, i11);
                }
                i12 += read;
                i11 += read;
            }
            min = c(min * (min < 4096 ? 4 : 2));
        }
        if (inputStream.read() == -1) {
            return a(queue, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    /* loaded from: classes2.dex */
    private static final class a extends FilterInputStream {

        /* renamed from: a  reason: collision with root package name */
        private long f16758a;

        /* renamed from: b  reason: collision with root package name */
        private long f16759b;

        a(InputStream inputStream, long j11) {
            super(inputStream);
            this.f16759b = -1L;
            this.f16758a = j11;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int available() {
            return (int) Math.min(((FilterInputStream) this).in.available(), this.f16758a);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public synchronized void mark(int i11) {
            ((FilterInputStream) this).in.mark(i11);
            this.f16759b = this.f16758a;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() {
            if (this.f16758a == 0) {
                return -1;
            }
            int read = ((FilterInputStream) this).in.read();
            if (read != -1) {
                this.f16758a--;
            }
            return read;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public synchronized void reset() {
            if (((FilterInputStream) this).in.markSupported()) {
                if (this.f16759b != -1) {
                    ((FilterInputStream) this).in.reset();
                    this.f16758a = this.f16759b;
                } else {
                    throw new IOException("Mark not set");
                }
            } else {
                throw new IOException("Mark not supported");
            }
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public long skip(long j11) {
            long skip = ((FilterInputStream) this).in.skip(Math.min(j11, this.f16758a));
            this.f16758a -= skip;
            return skip;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i11, int i12) {
            long j11 = this.f16758a;
            if (j11 == 0) {
                return -1;
            }
            int read = ((FilterInputStream) this).in.read(bArr, i11, (int) Math.min(i12, j11));
            if (read != -1) {
                this.f16758a -= read;
            }
            return read;
        }
    }
}