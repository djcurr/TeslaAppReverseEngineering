package androidx.profileinstaller;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;

/* loaded from: classes.dex */
class c {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(int i11) {
        return (((i11 + 8) - 1) & (-8)) / 8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static RuntimeException b(String str) {
        return new IllegalStateException(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] c(InputStream inputStream, int i11) {
        byte[] bArr = new byte[i11];
        int i12 = 0;
        while (i12 < i11) {
            int read = inputStream.read(bArr, i12, i11 - i12);
            if (read < 0) {
                throw b("Not enough bytes to read: " + i11);
            }
            i12 += read;
        }
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0059, code lost:
        if (r0.finished() == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005e, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0065, code lost:
        throw b("Inflater did not finish");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] d(java.io.InputStream r8, int r9, int r10) {
        /*
            java.util.zip.Inflater r0 = new java.util.zip.Inflater
            r0.<init>()
            byte[] r1 = new byte[r10]     // Catch: java.lang.Throwable -> L84
            r2 = 2048(0x800, float:2.87E-42)
            byte[] r2 = new byte[r2]     // Catch: java.lang.Throwable -> L84
            r3 = 0
            r4 = r3
            r5 = r4
        Le:
            boolean r6 = r0.finished()     // Catch: java.lang.Throwable -> L84
            if (r6 != 0) goto L53
            boolean r6 = r0.needsDictionary()     // Catch: java.lang.Throwable -> L84
            if (r6 != 0) goto L53
            if (r4 >= r9) goto L53
            int r6 = r8.read(r2)     // Catch: java.lang.Throwable -> L84
            if (r6 < 0) goto L38
            r0.setInput(r2, r3, r6)     // Catch: java.lang.Throwable -> L84
            int r7 = r10 - r5
            int r7 = r0.inflate(r1, r5, r7)     // Catch: java.util.zip.DataFormatException -> L2e java.lang.Throwable -> L84
            int r5 = r5 + r7
            int r4 = r4 + r6
            goto Le
        L2e:
            r8 = move-exception
            java.lang.String r8 = r8.getMessage()     // Catch: java.lang.Throwable -> L84
            java.lang.RuntimeException r8 = b(r8)     // Catch: java.lang.Throwable -> L84
            throw r8     // Catch: java.lang.Throwable -> L84
        L38:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L84
            r8.<init>()     // Catch: java.lang.Throwable -> L84
            java.lang.String r10 = "Invalid zip data. Stream ended after $totalBytesRead bytes. Expected "
            r8.append(r10)     // Catch: java.lang.Throwable -> L84
            r8.append(r9)     // Catch: java.lang.Throwable -> L84
            java.lang.String r9 = " bytes"
            r8.append(r9)     // Catch: java.lang.Throwable -> L84
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L84
            java.lang.RuntimeException r8 = b(r8)     // Catch: java.lang.Throwable -> L84
            throw r8     // Catch: java.lang.Throwable -> L84
        L53:
            if (r4 != r9) goto L66
            boolean r8 = r0.finished()     // Catch: java.lang.Throwable -> L84
            if (r8 == 0) goto L5f
            r0.end()
            return r1
        L5f:
            java.lang.String r8 = "Inflater did not finish"
            java.lang.RuntimeException r8 = b(r8)     // Catch: java.lang.Throwable -> L84
            throw r8     // Catch: java.lang.Throwable -> L84
        L66:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L84
            r8.<init>()     // Catch: java.lang.Throwable -> L84
            java.lang.String r10 = "Didn't read enough bytes during decompression. expected="
            r8.append(r10)     // Catch: java.lang.Throwable -> L84
            r8.append(r9)     // Catch: java.lang.Throwable -> L84
            java.lang.String r9 = " actual="
            r8.append(r9)     // Catch: java.lang.Throwable -> L84
            r8.append(r4)     // Catch: java.lang.Throwable -> L84
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L84
            java.lang.RuntimeException r8 = b(r8)     // Catch: java.lang.Throwable -> L84
            throw r8     // Catch: java.lang.Throwable -> L84
        L84:
            r8 = move-exception
            r0.end()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.profileinstaller.c.d(java.io.InputStream, int, int):byte[]");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String e(InputStream inputStream, int i11) {
        return new String(c(inputStream, i11), StandardCharsets.UTF_8);
    }

    static long f(InputStream inputStream, int i11) {
        byte[] c11 = c(inputStream, i11);
        long j11 = 0;
        for (int i12 = 0; i12 < i11; i12++) {
            j11 += (c11[i12] & 255) << (i12 * 8);
        }
        return j11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int g(InputStream inputStream) {
        return (int) f(inputStream, 2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long h(InputStream inputStream) {
        return f(inputStream, 4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int i(InputStream inputStream) {
        return (int) f(inputStream, 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int j(String str) {
        return str.getBytes(StandardCharsets.UTF_8).length;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void k(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[512];
        while (true) {
            int read = inputStream.read(bArr);
            if (read <= 0) {
                return;
            }
            outputStream.write(bArr, 0, read);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void l(OutputStream outputStream, byte[] bArr) {
        p(outputStream, bArr.length);
        Deflater deflater = new Deflater(1);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            deflaterOutputStream.write(bArr);
            deflaterOutputStream.close();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            p(outputStream, byteArray.length);
            outputStream.write(byteArray);
        } finally {
            deflater.end();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void m(OutputStream outputStream, String str) {
        outputStream.write(str.getBytes(StandardCharsets.UTF_8));
    }

    static void n(OutputStream outputStream, long j11, int i11) {
        byte[] bArr = new byte[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            bArr[i12] = (byte) ((j11 >> (i12 * 8)) & 255);
        }
        outputStream.write(bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void o(OutputStream outputStream, int i11) {
        n(outputStream, i11, 2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void p(OutputStream outputStream, long j11) {
        n(outputStream, j11, 4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void q(OutputStream outputStream, int i11) {
        n(outputStream, i11, 1);
    }
}