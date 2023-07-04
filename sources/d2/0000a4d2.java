package org.spongycastle.util.io;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes4.dex */
public final class Streams {
    private static int BUFFER_SIZE = 4096;

    public static void drain(InputStream inputStream) {
        int i11 = BUFFER_SIZE;
        do {
        } while (inputStream.read(new byte[i11], 0, i11) >= 0);
    }

    public static void pipeAll(InputStream inputStream, OutputStream outputStream) {
        int i11 = BUFFER_SIZE;
        byte[] bArr = new byte[i11];
        while (true) {
            int read = inputStream.read(bArr, 0, i11);
            if (read < 0) {
                return;
            }
            outputStream.write(bArr, 0, read);
        }
    }

    public static long pipeAllLimited(InputStream inputStream, long j11, OutputStream outputStream) {
        int i11 = BUFFER_SIZE;
        byte[] bArr = new byte[i11];
        long j12 = 0;
        while (true) {
            int read = inputStream.read(bArr, 0, i11);
            if (read < 0) {
                return j12;
            }
            long j13 = read;
            if (j11 - j12 >= j13) {
                j12 += j13;
                outputStream.write(bArr, 0, read);
            } else {
                throw new StreamOverflowException("Data Overflow");
            }
        }
    }

    public static byte[] readAll(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        pipeAll(inputStream, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static byte[] readAllLimited(InputStream inputStream, int i11) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        pipeAllLimited(inputStream, i11, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static int readFully(InputStream inputStream, byte[] bArr) {
        return readFully(inputStream, bArr, 0, bArr.length);
    }

    public static void writeBufTo(ByteArrayOutputStream byteArrayOutputStream, OutputStream outputStream) {
        byteArrayOutputStream.writeTo(outputStream);
    }

    public static int readFully(InputStream inputStream, byte[] bArr, int i11, int i12) {
        int i13 = 0;
        while (i13 < i12) {
            int read = inputStream.read(bArr, i11 + i13, i12 - i13);
            if (read < 0) {
                break;
            }
            i13 += read;
        }
        return i13;
    }
}