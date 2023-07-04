package org.spongycastle.cms.jcajce;

import java.io.FilterInputStream;
import java.io.InputStream;
import java.util.zip.InflaterInputStream;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;
import org.spongycastle.operator.InputExpander;
import org.spongycastle.operator.InputExpanderProvider;

/* loaded from: classes4.dex */
public class ZlibExpanderProvider implements InputExpanderProvider {
    private final long limit;

    public ZlibExpanderProvider() {
        this.limit = -1L;
    }

    @Override // org.spongycastle.operator.InputExpanderProvider
    public InputExpander get(final AlgorithmIdentifier algorithmIdentifier) {
        return new InputExpander() { // from class: org.spongycastle.cms.jcajce.ZlibExpanderProvider.1
            @Override // org.spongycastle.operator.InputExpander
            public AlgorithmIdentifier getAlgorithmIdentifier() {
                return algorithmIdentifier;
            }

            @Override // org.spongycastle.operator.InputExpander
            public InputStream getInputStream(InputStream inputStream) {
                InflaterInputStream inflaterInputStream = new InflaterInputStream(inputStream);
                return ZlibExpanderProvider.this.limit >= 0 ? new LimitedInputStream(inflaterInputStream, ZlibExpanderProvider.this.limit) : inflaterInputStream;
            }
        };
    }

    public ZlibExpanderProvider(long j11) {
        this.limit = j11;
    }

    /* loaded from: classes4.dex */
    private static class LimitedInputStream extends FilterInputStream {
        private long remaining;

        public LimitedInputStream(InputStream inputStream, long j11) {
            super(inputStream);
            this.remaining = j11;
        }

        /* JADX WARN: Code restructure failed: missing block: B:7:0x0019, code lost:
            if (r4 >= 0) goto L7;
         */
        @Override // java.io.FilterInputStream, java.io.InputStream
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int read() {
            /*
                r8 = this;
                long r0 = r8.remaining
                r2 = 0
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 < 0) goto L1c
                java.io.InputStream r0 = r8.in
                int r0 = r0.read()
                if (r0 < 0) goto L1b
                long r4 = r8.remaining
                r6 = 1
                long r4 = r4 - r6
                r8.remaining = r4
                int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
                if (r1 < 0) goto L1c
            L1b:
                return r0
            L1c:
                org.spongycastle.util.io.StreamOverflowException r0 = new org.spongycastle.util.io.StreamOverflowException
                java.lang.String r1 = "expanded byte limit exceeded"
                r0.<init>(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: org.spongycastle.cms.jcajce.ZlibExpanderProvider.LimitedInputStream.read():int");
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i11, int i12) {
            if (i12 < 1) {
                return super.read(bArr, i11, i12);
            }
            long j11 = this.remaining;
            if (j11 < 1) {
                read();
                return -1;
            }
            if (j11 <= i12) {
                i12 = (int) j11;
            }
            int read = ((FilterInputStream) this).in.read(bArr, i11, i12);
            if (read > 0) {
                this.remaining -= read;
            }
            return read;
        }
    }
}