package com.google.android.gms.common.util;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

@ShowFirstParty
@KeepForSdk
@Deprecated
/* loaded from: classes3.dex */
public final class IOUtils {
    private IOUtils() {
    }

    @KeepForSdk
    public static void closeQuietly(ParcelFileDescriptor parcelFileDescriptor) {
        if (parcelFileDescriptor != null) {
            try {
                parcelFileDescriptor.close();
            } catch (IOException unused) {
            }
        }
    }

    @KeepForSdk
    @Deprecated
    public static long copyStream(InputStream inputStream, OutputStream outputStream) {
        return copyStream(inputStream, outputStream, false, 1024);
    }

    @KeepForSdk
    public static boolean isGzipByteBuffer(byte[] bArr) {
        if (bArr.length > 1) {
            if ((((bArr[1] & 255) << 8) | (bArr[0] & 255)) == 35615) {
                return true;
            }
        }
        return false;
    }

    @KeepForSdk
    @Deprecated
    public static byte[] readInputStreamFully(InputStream inputStream) {
        return readInputStreamFully(inputStream, true);
    }

    @KeepForSdk
    @Deprecated
    public static byte[] toByteArray(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Preconditions.checkNotNull(inputStream);
        Preconditions.checkNotNull(byteArrayOutputStream);
        byte[] bArr = new byte[4096];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    @KeepForSdk
    public static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    @KeepForSdk
    @Deprecated
    public static long copyStream(InputStream inputStream, OutputStream outputStream, boolean z11, int i11) {
        byte[] bArr = new byte[i11];
        long j11 = 0;
        while (true) {
            try {
                int read = inputStream.read(bArr, 0, i11);
                if (read == -1) {
                    break;
                }
                j11 += read;
                outputStream.write(bArr, 0, read);
            } catch (Throwable th2) {
                if (z11) {
                    closeQuietly(inputStream);
                    closeQuietly(outputStream);
                }
                throw th2;
            }
        }
        if (z11) {
            closeQuietly(inputStream);
            closeQuietly(outputStream);
        }
        return j11;
    }

    @KeepForSdk
    @Deprecated
    public static byte[] readInputStreamFully(InputStream inputStream, boolean z11) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        copyStream(inputStream, byteArrayOutputStream, z11, 1024);
        return byteArrayOutputStream.toByteArray();
    }
}