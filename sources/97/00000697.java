package androidx.exifinterface.media;

import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.Os;
import android.util.Log;
import java.io.Closeable;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.spongycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
class b {

    /* loaded from: classes.dex */
    static class a {
        static void a(FileDescriptor fileDescriptor) {
            Os.close(fileDescriptor);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static FileDescriptor b(FileDescriptor fileDescriptor) {
            return Os.dup(fileDescriptor);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static long c(FileDescriptor fileDescriptor, long j11, int i11) {
            return Os.lseek(fileDescriptor, j11, i11);
        }
    }

    /* renamed from: androidx.exifinterface.media.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static class C0079b {
        /* JADX INFO: Access modifiers changed from: package-private */
        public static void a(MediaMetadataRetriever mediaMetadataRetriever, MediaDataSource mediaDataSource) {
            mediaMetadataRetriever.setDataSource(mediaDataSource);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        for (int i11 = 0; i11 < bArr.length; i11++) {
            sb2.append(String.format("%02x", Byte.valueOf(bArr[i11])));
        }
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(FileDescriptor fileDescriptor) {
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                a.a(fileDescriptor);
                return;
            } catch (Exception unused) {
                Log.e("ExifInterfaceUtils", "Error closing fd.");
                return;
            }
        }
        Log.e("ExifInterfaceUtils", "closeFileDescriptor is called in API < 21, which must be wrong.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e11) {
                throw e11;
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long[] d(Object obj) {
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            long[] jArr = new long[iArr.length];
            for (int i11 = 0; i11 < iArr.length; i11++) {
                jArr[i11] = iArr[i11];
            }
            return jArr;
        } else if (obj instanceof long[]) {
            return (long[]) obj;
        } else {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int e(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[PKIFailureInfo.certRevoked];
        int i11 = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return i11;
            }
            i11 += read;
            outputStream.write(bArr, 0, read);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void f(InputStream inputStream, OutputStream outputStream, int i11) {
        byte[] bArr = new byte[PKIFailureInfo.certRevoked];
        while (i11 > 0) {
            int min = Math.min(i11, (int) PKIFailureInfo.certRevoked);
            int read = inputStream.read(bArr, 0, min);
            if (read == min) {
                i11 -= read;
                outputStream.write(bArr, 0, read);
            } else {
                throw new IOException("Failed to copy the given amount of bytes from the inputstream to the output stream.");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean g(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null || bArr.length < bArr2.length) {
            return false;
        }
        for (int i11 = 0; i11 < bArr2.length; i11++) {
            if (bArr[i11] != bArr2[i11]) {
                return false;
            }
        }
        return true;
    }
}