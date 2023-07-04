package org.webrtc;

import java.nio.ByteBuffer;
import org.spongycastle.crypto.tls.CipherSuite;

/* loaded from: classes4.dex */
public class YuvHelper {
    public static void ABGRToI420(ByteBuffer byteBuffer, int i11, ByteBuffer byteBuffer2, int i12, ByteBuffer byteBuffer3, int i13, ByteBuffer byteBuffer4, int i14, int i15, int i16) {
        nativeABGRToI420(byteBuffer, i11, byteBuffer2, i12, byteBuffer3, i13, byteBuffer4, i14, i15, i16);
    }

    public static void I420Copy(ByteBuffer byteBuffer, int i11, ByteBuffer byteBuffer2, int i12, ByteBuffer byteBuffer3, int i13, ByteBuffer byteBuffer4, int i14, int i15, int i16, int i17, int i18, int i19) {
        int i21 = (i15 + 1) / 2;
        int i22 = (i16 * i15) + 0;
        int i23 = (i16 * i17) + 0;
        int i24 = (i18 * i21) + i23;
        int i25 = (i18 * i19) + i23;
        int i26 = ((i21 - 1) * i18) + i25 + ((i14 + 1) / 2);
        if (byteBuffer4.capacity() >= i26) {
            ByteBuffer byteBuffer5 = (ByteBuffer) byteBuffer4.limit(i22);
            ByteBuffer byteBuffer6 = (ByteBuffer) byteBuffer4.position(0);
            ByteBuffer slice = byteBuffer4.slice();
            ByteBuffer byteBuffer7 = (ByteBuffer) byteBuffer4.limit(i24);
            ByteBuffer byteBuffer8 = (ByteBuffer) byteBuffer4.position(i23);
            ByteBuffer slice2 = byteBuffer4.slice();
            ByteBuffer byteBuffer9 = (ByteBuffer) byteBuffer4.limit(i26);
            ByteBuffer byteBuffer10 = (ByteBuffer) byteBuffer4.position(i25);
            I420Copy(byteBuffer, i11, byteBuffer2, i12, byteBuffer3, i13, slice, i16, slice2, i18, byteBuffer4.slice(), i18, i14, i15);
            return;
        }
        int capacity = byteBuffer4.capacity();
        throw new IllegalArgumentException("Expected destination buffer capacity to be at least " + i26 + " was " + capacity);
    }

    public static void I420Rotate(ByteBuffer byteBuffer, int i11, ByteBuffer byteBuffer2, int i12, ByteBuffer byteBuffer3, int i13, ByteBuffer byteBuffer4, int i14, int i15, int i16) {
        int i17 = i16 % CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA256;
        int i18 = i17 == 0 ? i14 : i15;
        int i19 = i17 == 0 ? i15 : i14;
        int i21 = (i18 + 1) / 2;
        int i22 = i19 * i18;
        int i23 = ((i19 + 1) / 2) * i21;
        int i24 = (i23 * 2) + i22;
        if (byteBuffer4.capacity() >= i24) {
            int i25 = i23 + i22;
            ByteBuffer byteBuffer5 = (ByteBuffer) byteBuffer4.position(0);
            ByteBuffer slice = byteBuffer4.slice();
            ByteBuffer byteBuffer6 = (ByteBuffer) byteBuffer4.position(i22);
            ByteBuffer slice2 = byteBuffer4.slice();
            ByteBuffer byteBuffer7 = (ByteBuffer) byteBuffer4.position(i25);
            nativeI420Rotate(byteBuffer, i11, byteBuffer2, i12, byteBuffer3, i13, slice, i18, slice2, i21, byteBuffer4.slice(), i21, i14, i15, i16);
            return;
        }
        int capacity = byteBuffer4.capacity();
        throw new IllegalArgumentException("Expected destination buffer capacity to be at least " + i24 + " was " + capacity);
    }

    public static void I420ToNV12(ByteBuffer byteBuffer, int i11, ByteBuffer byteBuffer2, int i12, ByteBuffer byteBuffer3, int i13, ByteBuffer byteBuffer4, int i14, int i15, int i16, int i17) {
        int i18 = (i14 + 1) / 2;
        int i19 = (i16 * i15) + 0;
        int i21 = (i16 * i17) + 0;
        int i22 = (((i15 + 1) / 2) * i18 * 2) + i21;
        if (byteBuffer4.capacity() >= i22) {
            ByteBuffer byteBuffer5 = (ByteBuffer) byteBuffer4.limit(i19);
            ByteBuffer byteBuffer6 = (ByteBuffer) byteBuffer4.position(0);
            ByteBuffer slice = byteBuffer4.slice();
            ByteBuffer byteBuffer7 = (ByteBuffer) byteBuffer4.limit(i22);
            ByteBuffer byteBuffer8 = (ByteBuffer) byteBuffer4.position(i21);
            I420ToNV12(byteBuffer, i11, byteBuffer2, i12, byteBuffer3, i13, slice, i16, byteBuffer4.slice(), i18 * 2, i14, i15);
            return;
        }
        int capacity = byteBuffer4.capacity();
        throw new IllegalArgumentException("Expected destination buffer capacity to be at least " + i22 + " was " + capacity);
    }

    public static void copyPlane(ByteBuffer byteBuffer, int i11, ByteBuffer byteBuffer2, int i12, int i13, int i14) {
        nativeCopyPlane(byteBuffer, i11, byteBuffer2, i12, i13, i14);
    }

    private static native void nativeABGRToI420(ByteBuffer byteBuffer, int i11, ByteBuffer byteBuffer2, int i12, ByteBuffer byteBuffer3, int i13, ByteBuffer byteBuffer4, int i14, int i15, int i16);

    private static native void nativeCopyPlane(ByteBuffer byteBuffer, int i11, ByteBuffer byteBuffer2, int i12, int i13, int i14);

    private static native void nativeI420Copy(ByteBuffer byteBuffer, int i11, ByteBuffer byteBuffer2, int i12, ByteBuffer byteBuffer3, int i13, ByteBuffer byteBuffer4, int i14, ByteBuffer byteBuffer5, int i15, ByteBuffer byteBuffer6, int i16, int i17, int i18);

    private static native void nativeI420Rotate(ByteBuffer byteBuffer, int i11, ByteBuffer byteBuffer2, int i12, ByteBuffer byteBuffer3, int i13, ByteBuffer byteBuffer4, int i14, ByteBuffer byteBuffer5, int i15, ByteBuffer byteBuffer6, int i16, int i17, int i18, int i19);

    private static native void nativeI420ToNV12(ByteBuffer byteBuffer, int i11, ByteBuffer byteBuffer2, int i12, ByteBuffer byteBuffer3, int i13, ByteBuffer byteBuffer4, int i14, ByteBuffer byteBuffer5, int i15, int i16, int i17);

    public static void I420ToNV12(ByteBuffer byteBuffer, int i11, ByteBuffer byteBuffer2, int i12, ByteBuffer byteBuffer3, int i13, ByteBuffer byteBuffer4, int i14, int i15) {
        I420ToNV12(byteBuffer, i11, byteBuffer2, i12, byteBuffer3, i13, byteBuffer4, i14, i15, i14, i15);
    }

    public static void I420Rotate(ByteBuffer byteBuffer, int i11, ByteBuffer byteBuffer2, int i12, ByteBuffer byteBuffer3, int i13, ByteBuffer byteBuffer4, int i14, ByteBuffer byteBuffer5, int i15, ByteBuffer byteBuffer6, int i16, int i17, int i18, int i19) {
        nativeI420Rotate(byteBuffer, i11, byteBuffer2, i12, byteBuffer3, i13, byteBuffer4, i14, byteBuffer5, i15, byteBuffer6, i16, i17, i18, i19);
    }

    public static void I420ToNV12(ByteBuffer byteBuffer, int i11, ByteBuffer byteBuffer2, int i12, ByteBuffer byteBuffer3, int i13, ByteBuffer byteBuffer4, int i14, ByteBuffer byteBuffer5, int i15, int i16, int i17) {
        if (byteBuffer != null && byteBuffer2 != null && byteBuffer3 != null && byteBuffer4 != null && byteBuffer5 != null && i16 > 0 && i17 > 0) {
            nativeI420ToNV12(byteBuffer, i11, byteBuffer2, i12, byteBuffer3, i13, byteBuffer4, i14, byteBuffer5, i15, i16, i17);
            return;
        }
        throw new IllegalArgumentException("Invalid I420ToNV12 input arguments");
    }

    public static void I420Copy(ByteBuffer byteBuffer, int i11, ByteBuffer byteBuffer2, int i12, ByteBuffer byteBuffer3, int i13, ByteBuffer byteBuffer4, int i14, int i15) {
        I420Copy(byteBuffer, i11, byteBuffer2, i12, byteBuffer3, i13, byteBuffer4, i14, i15, i14, i15, (i14 + 1) / 2, (i15 + 1) / 2);
    }

    public static void I420Copy(ByteBuffer byteBuffer, int i11, ByteBuffer byteBuffer2, int i12, ByteBuffer byteBuffer3, int i13, ByteBuffer byteBuffer4, int i14, ByteBuffer byteBuffer5, int i15, ByteBuffer byteBuffer6, int i16, int i17, int i18) {
        if (byteBuffer != null && byteBuffer2 != null && byteBuffer3 != null && byteBuffer4 != null && byteBuffer5 != null && byteBuffer6 != null && i17 > 0 && i18 > 0) {
            nativeI420Copy(byteBuffer, i11, byteBuffer2, i12, byteBuffer3, i13, byteBuffer4, i14, byteBuffer5, i15, byteBuffer6, i16, i17, i18);
            return;
        }
        throw new IllegalArgumentException("Invalid I420Copy input arguments");
    }
}