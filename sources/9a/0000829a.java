package l50;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.spongycastle.crypto.signers.PSSSigner;
import org.spongycastle.math.ec.Tnaf;

/* loaded from: classes5.dex */
public class r implements org.bouncycastle.crypto.e {

    /* renamed from: h  reason: collision with root package name */
    private static final byte[] f36870h = {-88, 67, 95, 6, 107, 117, 108, 89, 113, -33, -121, -107, 23, -16, -40, 9, 109, -13, 29, -53, -55, 77, 44, -81, 121, -32, -105, -3, 111, 75, 69, 57, 62, -35, -93, 79, -76, -74, -102, 14, 31, -65, 21, -31, 73, -46, -109, -58, -110, 114, -98, 97, -47, 99, -6, -18, -12, 25, -43, -83, 88, -92, -69, -95, -36, -14, -125, 55, 66, -28, 122, 50, -100, -52, -85, 74, -113, 110, 4, 39, 46, -25, -30, 90, -106, 22, 35, 43, -62, 101, 102, 15, PSSSigner.TRAILER_IMPLICIT, -87, 71, 65, 52, 72, -4, -73, 106, -120, -91, 83, -122, -7, 91, -37, 56, 123, -61, 30, 34, 51, 36, 40, 54, -57, -78, 59, -114, 119, -70, -11, 20, -97, 8, 85, -101, 76, -2, 96, 92, -38, 24, 70, -51, 125, 33, -80, 63, 27, -119, -1, -21, -124, 105, 58, -99, -41, -45, 112, 103, 64, -75, -34, 93, 48, -111, -79, 120, 17, 1, -27, 0, 104, -104, -96, -59, 2, -90, 116, 45, 11, -94, 118, -77, -66, -50, -67, -82, -23, -118, 49, 28, -20, -15, -103, -108, -86, -10, 38, 47, -17, -24, -116, 53, 3, -44, Byte.MAX_VALUE, -5, 5, -63, 94, -112, 32, 61, -126, -9, -22, 10, 13, 126, -8, 80, 26, -60, 7, 87, -72, 60, 98, -29, -56, -84, 82, 100, Tnaf.POW_2_WIDTH, -48, -39, 19, 12, 18, 41, 81, -71, -49, -42, 115, -115, -127, 84, -64, -19, 78, 68, -89, 42, -123, 37, -26, -54, 124, -117, 86, Byte.MIN_VALUE};

    /* renamed from: i  reason: collision with root package name */
    private static final byte[] f36871i = {-50, -69, -21, -110, -22, -53, 19, -63, -23, 58, -42, -78, -46, -112, 23, -8, 66, 21, 86, -76, 101, 28, -120, 67, -59, 92, 54, -70, -11, 87, 103, -115, 49, -10, 100, 88, -98, -12, 34, -86, 117, 15, 2, -79, -33, 109, 115, 77, 124, 38, 46, -9, 8, 93, 68, 62, -97, 20, -56, -82, 84, Tnaf.POW_2_WIDTH, -40, PSSSigner.TRAILER_IMPLICIT, 26, 107, 105, -13, -67, 51, -85, -6, -47, -101, 104, 78, 22, -107, -111, -18, 76, 99, -114, 91, -52, 60, 25, -95, -127, 73, 123, -39, 111, 55, 96, -54, -25, 43, 72, -3, -106, 69, -4, 65, 18, 13, 121, -27, -119, -116, -29, 32, 48, -36, -73, 108, 74, -75, 63, -105, -44, 98, 45, 6, -92, -91, -125, 95, 42, -38, -55, 0, 126, -94, 85, -65, 17, -43, -100, -49, 14, 10, 61, 81, 125, -109, 27, -2, -60, 71, 9, -122, 11, -113, -99, 106, 7, -71, -80, -104, 24, 50, 113, 75, -17, 59, 112, -96, -28, 64, -1, -61, -87, -26, 120, -7, -117, 70, Byte.MIN_VALUE, 30, 56, -31, -72, -88, -32, 12, 35, 118, 29, 37, 36, 5, -15, 110, -108, 40, -102, -124, -24, -93, 79, 119, -45, -123, -30, 82, -14, -126, 80, 122, 47, 116, 83, -77, 97, -81, 57, 53, -34, -51, 31, -103, -84, -83, 114, 44, -35, -48, -121, -66, 94, -90, -20, 4, -58, 3, 52, -5, -37, 89, -74, -62, 1, -16, 90, -19, -89, 102, 33, Byte.MAX_VALUE, -118, 39, -57, -64, 41, -41};

    /* renamed from: j  reason: collision with root package name */
    private static final byte[] f36872j = {-109, -39, -102, -75, -104, 34, 69, -4, -70, 106, -33, 2, -97, -36, 81, 89, 74, 23, 43, -62, -108, -12, -69, -93, 98, -28, 113, -44, -51, 112, 22, -31, 73, 60, -64, -40, 92, -101, -83, -123, 83, -95, 122, -56, 45, -32, -47, 114, -90, 44, -60, -29, 118, 120, -73, -76, 9, 59, 14, 65, 76, -34, -78, -112, 37, -91, -41, 3, 17, 0, -61, 46, -110, -17, 78, 18, -99, 125, -53, 53, Tnaf.POW_2_WIDTH, -43, 79, -98, 77, -87, 85, -58, -48, 123, 24, -105, -45, 54, -26, 72, 86, -127, -113, 119, -52, -100, -71, -30, -84, -72, 47, 21, -92, 124, -38, 56, 30, 11, 5, -42, 20, 110, 108, 126, 102, -3, -79, -27, 96, -81, 94, 51, -121, -55, -16, 93, 109, 63, -120, -115, -57, -9, 29, -23, -20, -19, Byte.MIN_VALUE, 41, 39, -49, -103, -88, 80, 15, 55, 36, 40, 48, -107, -46, 62, 91, 64, -125, -77, 105, 87, 31, 7, 28, -118, PSSSigner.TRAILER_IMPLICIT, 32, -21, -50, -114, -85, -18, 49, -94, 115, -7, -54, 58, 26, -5, 13, -63, -2, -6, -14, 111, -67, -106, -35, 67, 82, -74, 8, -13, -82, -66, 25, -119, 50, 38, -80, -22, 75, 100, -124, -126, 107, -11, 121, -65, 1, 95, 117, 99, 27, 35, 61, 104, 42, 101, -24, -111, -10, -1, 19, 88, -15, 71, 10, Byte.MAX_VALUE, -59, -89, -25, 97, 90, 6, 70, 68, 66, 4, -96, -37, 57, -122, 84, -86, -116, 52, 33, -117, -8, 12, 116, 103};

    /* renamed from: k  reason: collision with root package name */
    private static final byte[] f36873k = {104, -115, -54, 77, 115, 75, 78, 42, -44, 82, 38, -77, 84, 30, 25, 31, 34, 3, 70, 61, 45, 74, 83, -125, 19, -118, -73, -43, 37, 121, -11, -67, 88, 47, 13, 2, -19, 81, -98, 17, -14, 62, 85, 94, -47, 22, 60, 102, 112, 93, -13, 69, 64, -52, -24, -108, 86, 8, -50, 26, 58, -46, -31, -33, -75, 56, 110, 14, -27, -12, -7, -122, -23, 79, -42, -123, 35, -49, 50, -103, 49, 20, -82, -18, -56, 72, -45, 48, -95, -110, 65, -79, 24, -60, 44, 113, 114, 68, 21, -3, 55, -66, 95, -86, -101, -120, -40, -85, -119, -100, -6, 96, -22, PSSSigner.TRAILER_IMPLICIT, 98, 12, 36, -90, -88, -20, 103, 32, -37, 124, 40, -35, -84, 91, 52, 126, Tnaf.POW_2_WIDTH, -15, 123, -113, 99, -96, 5, -102, 67, 119, 33, -65, 39, 9, -61, -97, -74, -41, 41, -62, -21, -64, -92, -117, -116, 29, -5, -1, -63, -78, -105, 46, -8, 101, -10, 117, 7, 4, 73, 51, -28, -39, -71, -48, 66, -57, 108, -112, 0, -114, 111, 80, 1, -59, -38, 71, 63, -51, 105, -94, -30, 122, -89, -58, -109, 15, 10, 6, -26, 43, -106, -93, 28, -81, 106, 18, -124, 57, -25, -80, -126, -9, -2, -99, -121, 92, -127, 53, -34, -76, -91, -4, Byte.MIN_VALUE, -17, -53, -69, 107, 118, -70, 90, 125, 120, 11, -107, -29, -83, 116, -104, 59, 54, 100, 109, -36, -16, 89, -87, 76, 23, Byte.MAX_VALUE, -111, -72, -55, 87, 27, -32, 97};

    /* renamed from: l  reason: collision with root package name */
    private static final byte[] f36874l = {-92, -94, -87, -59, 78, -55, 3, -39, 126, 15, -46, -83, -25, -45, 39, 91, -29, -95, -24, -26, 124, 42, 85, 12, -122, 57, -41, -115, -72, 18, 111, 40, -51, -118, 112, 86, 114, -7, -65, 79, 115, -23, -9, 87, 22, -84, 80, -64, -99, -73, 71, 113, 96, -60, 116, 67, 108, 31, -109, 119, -36, -50, 32, -116, -103, 95, 68, 1, -11, 30, -121, 94, 97, 44, 75, 29, -127, 21, -12, 35, -42, -22, -31, 103, -15, Byte.MAX_VALUE, -2, -38, 60, 7, 83, 106, -124, -100, -53, 2, -125, 51, -35, 53, -30, 89, 90, -104, -91, -110, 100, 4, 6, Tnaf.POW_2_WIDTH, 77, 28, -105, 8, 49, -18, -85, 5, -81, 121, -96, 24, 70, 109, -4, -119, -44, -57, -1, -16, -49, 66, -111, -8, 104, 10, 101, -114, -74, -3, -61, -17, 120, 76, -52, -98, 48, 46, PSSSigner.TRAILER_IMPLICIT, 11, 84, 26, -90, -69, 38, Byte.MIN_VALUE, 72, -108, 50, 125, -89, 63, -82, 34, 61, 102, -86, -10, 0, 93, -67, 74, -32, 59, -76, 23, -117, -97, 118, -80, 36, -102, 37, 99, -37, -21, 122, 62, 92, -77, -79, 41, -14, -54, 88, 110, -40, -88, 47, 117, -33, 20, -5, 19, 73, -120, -78, -20, -28, 52, 45, -106, -58, 58, -19, -107, 14, -27, -123, 107, 64, 33, -101, 9, 25, 43, 82, -34, 69, -93, -6, 81, -62, -75, -47, -112, -71, -13, 55, -63, 13, -70, 65, 17, 56, 123, -66, -48, -43, 105, 54, -56, 98, 27, -126, -113};

    /* renamed from: m  reason: collision with root package name */
    private static final byte[] f36875m = {-125, -14, 42, -21, -23, -65, 123, -100, 52, -106, -115, -104, -71, 105, -116, 41, 61, -120, 104, 6, 57, 17, 76, 14, -96, 86, 64, -110, 21, PSSSigner.TRAILER_IMPLICIT, -77, -36, 111, -8, 38, -70, -66, -67, 49, -5, -61, -2, Byte.MIN_VALUE, 97, -31, 122, 50, -46, 112, 32, -95, 69, -20, -39, 26, 93, -76, -40, 9, -91, 85, -114, 55, 118, -87, 103, Tnaf.POW_2_WIDTH, 23, 54, 101, -79, -107, 98, 89, 116, -93, 80, 47, 75, -56, -48, -113, -51, -44, 60, -122, 18, 29, 35, -17, -12, 83, 25, 53, -26, Byte.MAX_VALUE, 94, -42, 121, 81, 34, 20, -9, 30, 74, 66, -101, 65, 115, 45, -63, 92, -90, -94, -32, 46, -45, 40, -69, -55, -82, 106, -47, 90, 48, -112, -124, -7, -78, 88, -49, 126, -59, -53, -105, -28, 22, 108, -6, -80, 109, 31, 82, -103, 13, 78, 3, -111, -62, 77, 100, 119, -97, -35, -60, 73, -118, -102, 36, 56, -89, 87, -123, -57, 124, 125, -25, -10, -73, -84, 39, 70, -34, -33, 59, -41, -98, 43, 11, -43, 19, 117, -16, 114, -74, -99, 27, 1, 63, 68, -27, -121, -3, 7, -15, -85, -108, 24, -22, -4, 58, -126, 95, 5, 84, -37, 0, -117, -29, 72, 12, -54, 120, -119, 10, -1, 62, 91, -127, -18, 113, -30, -38, 44, -72, -75, -52, 110, -88, 107, -83, 96, -58, 8, 4, 2, -24, -11, 79, -92, -13, -64, -50, 67, 37, 28, 33, 51, 15, -81, 71, -19, 102, 99, -109, -86};

    /* renamed from: n  reason: collision with root package name */
    private static final byte[] f36876n = {69, -44, 11, 67, -15, 114, -19, -92, -62, 56, -26, 113, -3, -74, 58, -107, 80, 68, 75, -30, 116, 107, 30, 17, 90, -58, -76, -40, -91, -118, 112, -93, -88, -6, 5, -39, -105, 64, -55, -112, -104, -113, -36, 18, 49, 44, 71, 106, -103, -82, -56, Byte.MAX_VALUE, -7, 79, 93, -106, 111, -12, -77, 57, 33, -38, -100, -123, -98, 59, -16, -65, -17, 6, -18, -27, 95, 32, Tnaf.POW_2_WIDTH, -52, 60, 84, 74, 82, -108, 14, -64, 40, -10, 86, 96, -94, -29, 15, -20, -99, 36, -125, 126, -43, 124, -21, 24, -41, -51, -35, 120, -1, -37, -95, 9, -48, 118, -124, 117, -69, 29, 26, 47, -80, -2, -42, 52, 99, 53, -46, 42, 89, 109, 77, 119, -25, -114, 97, -49, -97, -50, 39, -11, Byte.MIN_VALUE, -122, -57, -90, -5, -8, -121, -85, 98, 63, -33, 72, 0, 20, -102, -67, 91, 4, -110, 2, 37, 101, 76, 83, 12, -14, 41, -81, 23, 108, 65, 48, -23, -109, 85, -9, -84, 104, 38, -60, 125, -54, 122, 62, -96, 55, 3, -63, 54, 105, 102, 8, 22, -89, PSSSigner.TRAILER_IMPLICIT, -59, -45, 34, -73, 19, 70, 50, -24, 87, -120, 43, -127, -78, 78, 100, 28, -86, -111, 88, 46, -101, 92, 27, 81, 115, 66, 35, 1, 110, -13, 13, -66, 61, 10, 45, 31, 103, 51, 25, 123, 94, -22, -34, -117, -53, -87, -116, -115, -83, 73, -126, -28, -70, -61, 21, -47, -32, -119, -4, -79, -71, -75, 7, 121, -72, -31};

    /* renamed from: o  reason: collision with root package name */
    private static final byte[] f36877o = {-78, -74, 35, 17, -89, -120, -59, -90, 57, -113, -60, -24, 115, 34, 67, -61, -126, 39, -51, 24, 81, 98, 45, -9, 92, 14, 59, -3, -54, -101, 13, 15, 121, -116, Tnaf.POW_2_WIDTH, 76, 116, 28, 10, -114, 124, -108, 7, -57, 94, 20, -95, 33, 87, 80, 78, -87, Byte.MIN_VALUE, -39, -17, 100, 65, -49, 60, -18, 46, 19, 41, -70, 52, 90, -82, -118, 97, 51, 18, -71, 85, -88, 21, 5, -10, 3, 6, 73, -75, 37, 9, 22, 12, 42, 56, -4, 32, -12, -27, Byte.MAX_VALUE, -41, 49, 43, 102, 111, -1, 114, -122, -16, -93, 47, 120, 0, PSSSigner.TRAILER_IMPLICIT, -52, -30, -80, -15, 66, -76, 48, 95, 96, 4, -20, -91, -29, -117, -25, 29, -65, -124, 123, -26, -127, -8, -34, -40, -46, 23, -50, 75, 71, -42, 105, 108, 25, -103, -102, 1, -77, -123, -79, -7, 89, -62, 55, -23, -56, -96, -19, 79, -119, 104, 109, -43, 38, -111, -121, 88, -67, -55, -104, -36, 117, -64, 118, -11, 103, 107, 126, -21, 82, -53, -47, 91, -97, 11, -37, 64, -110, 26, -6, -84, -28, -31, 113, 31, 101, -115, -105, -98, -107, -112, 93, -73, -63, -81, 84, -5, 2, -32, 53, -69, 58, 77, -83, 44, 61, 86, 8, 27, 74, -109, 106, -85, -72, 122, -14, 125, -38, 63, -2, 62, -66, -22, -86, 68, -58, -48, 54, 72, 112, -106, 119, 36, 83, -33, -13, -125, 40, 50, 69, 30, -92, -45, -94, 70, 110, -100, -35, 99, -44, -99};

    /* renamed from: a  reason: collision with root package name */
    private long[] f36878a;

    /* renamed from: b  reason: collision with root package name */
    private long[] f36879b;

    /* renamed from: c  reason: collision with root package name */
    private long[][] f36880c;

    /* renamed from: d  reason: collision with root package name */
    private int f36881d;

    /* renamed from: e  reason: collision with root package name */
    private int f36882e;

    /* renamed from: f  reason: collision with root package name */
    private int f36883f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f36884g;

    public r(int i11) {
        if (i11 != 128 && i11 != 256 && i11 != 512) {
            throw new IllegalArgumentException("unsupported block length: only 128/256/512 are allowed");
        }
        int i12 = i11 >>> 6;
        this.f36881d = i12;
        this.f36878a = new long[i12];
    }

    private void a(int i11) {
        long[] jArr = this.f36880c[i11];
        for (int i12 = 0; i12 < this.f36881d; i12++) {
            long[] jArr2 = this.f36878a;
            jArr2[i12] = jArr2[i12] + jArr[i12];
        }
    }

    private void b(byte[] bArr, int i11, byte[] bArr2, int i12) {
        long p11 = r70.i.p(bArr, i11);
        long p12 = r70.i.p(bArr, i11 + 8);
        long[][] jArr = this.f36880c;
        int i13 = this.f36883f;
        long[] jArr2 = jArr[i13];
        long j11 = p11 - jArr2[0];
        long j12 = p12 - jArr2[1];
        while (true) {
            long g11 = g(j11);
            long g12 = g(j12);
            int i14 = (int) g11;
            int i15 = (int) (g11 >>> 32);
            int i16 = (int) g12;
            int i17 = (int) (g12 >>> 32);
            byte[] bArr3 = f36874l;
            byte b11 = bArr3[i14 & 255];
            byte[] bArr4 = f36875m;
            byte b12 = bArr4[(i14 >>> 8) & 255];
            byte[] bArr5 = f36876n;
            byte b13 = bArr5[(i14 >>> 16) & 255];
            byte[] bArr6 = f36877o;
            int i18 = (bArr6[i14 >>> 24] << 24) | ((b13 & 255) << 16) | (b11 & 255) | ((b12 & 255) << 8);
            byte b14 = bArr3[i17 & 255];
            byte b15 = bArr4[(i17 >>> 8) & 255];
            byte b16 = bArr5[(i17 >>> 16) & 255];
            long j13 = (((bArr6[i17 >>> 24] << 24) | (((b14 & 255) | ((b15 & 255) << 8)) | ((b16 & 255) << 16))) << 32) | (i18 & 4294967295L);
            int i19 = (bArr6[i16 >>> 24] << 24) | (bArr3[i16 & 255] & 255) | ((bArr4[(i16 >>> 8) & 255] & 255) << 8) | ((bArr5[(i16 >>> 16) & 255] & 255) << 16);
            byte b17 = bArr3[i15 & 255];
            byte b18 = bArr4[(i15 >>> 8) & 255];
            byte b19 = bArr5[(i15 >>> 16) & 255];
            long j14 = (i19 & 4294967295L) | (((bArr6[i15 >>> 24] << 24) | (((b17 & 255) | ((b18 & 255) << 8)) | ((b19 & 255) << 16))) << 32);
            i13--;
            if (i13 == 0) {
                long[] jArr3 = this.f36880c[0];
                r70.i.v(j13 - jArr3[0], bArr2, i12);
                r70.i.v(j14 - jArr3[1], bArr2, i12 + 8);
                return;
            }
            long[] jArr4 = this.f36880c[i13];
            long j15 = j13 ^ jArr4[0];
            j12 = j14 ^ jArr4[1];
            j11 = j15;
        }
    }

    private void c(byte[] bArr, int i11, byte[] bArr2, int i12) {
        long p11 = r70.i.p(bArr, i11);
        long p12 = r70.i.p(bArr, i11 + 8);
        long[] jArr = this.f36880c[0];
        long j11 = p11 + jArr[0];
        long j12 = p12 + jArr[1];
        int i13 = 0;
        while (true) {
            int i14 = (int) j11;
            int i15 = (int) (j11 >>> 32);
            int i16 = (int) j12;
            int i17 = (int) (j12 >>> 32);
            byte[] bArr3 = f36870h;
            byte b11 = bArr3[i14 & 255];
            byte[] bArr4 = f36871i;
            byte b12 = bArr4[(i14 >>> 8) & 255];
            byte[] bArr5 = f36872j;
            byte b13 = bArr5[(i14 >>> 16) & 255];
            byte[] bArr6 = f36873k;
            int i18 = ((b13 & 255) << 16) | (b11 & 255) | ((b12 & 255) << 8) | (bArr6[i14 >>> 24] << 24);
            byte b14 = bArr3[i17 & 255];
            byte b15 = bArr4[(i17 >>> 8) & 255];
            byte b16 = bArr5[(i17 >>> 16) & 255];
            long j13 = (((bArr6[i17 >>> 24] << 24) | (((b14 & 255) | ((b15 & 255) << 8)) | ((b16 & 255) << 16))) << 32) | (i18 & 4294967295L);
            int i19 = (bArr6[i16 >>> 24] << 24) | (bArr3[i16 & 255] & 255) | ((bArr4[(i16 >>> 8) & 255] & 255) << 8) | ((bArr5[(i16 >>> 16) & 255] & 255) << 16);
            byte b17 = bArr3[i15 & 255];
            byte b18 = bArr4[(i15 >>> 8) & 255];
            byte b19 = bArr5[(i15 >>> 16) & 255];
            int i21 = bArr6[i15 >>> 24] << 24;
            long f11 = f(j13);
            long f12 = f((i19 & 4294967295L) | ((i21 | (((b17 & 255) | ((b18 & 255) << 8)) | ((b19 & 255) << 16))) << 32));
            i13++;
            int i22 = this.f36883f;
            if (i13 == i22) {
                long[] jArr2 = this.f36880c[i22];
                r70.i.v(f11 + jArr2[0], bArr2, i12);
                r70.i.v(f12 + jArr2[1], bArr2, i12 + 8);
                return;
            }
            long[] jArr3 = this.f36880c[i13];
            long j14 = f11 ^ jArr3[0];
            j12 = f12 ^ jArr3[1];
            j11 = j14;
        }
    }

    private void d() {
        int i11 = this.f36881d;
        if (i11 == 2) {
            long[] jArr = this.f36878a;
            long j11 = jArr[0];
            long j12 = jArr[1];
            long j13 = (-4294967296L) & (j11 ^ j12);
            jArr[0] = j11 ^ j13;
            jArr[1] = j13 ^ j12;
        } else if (i11 == 4) {
            long[] jArr2 = this.f36878a;
            long j14 = jArr2[0];
            long j15 = jArr2[1];
            long j16 = jArr2[2];
            long j17 = jArr2[3];
            long j18 = (j14 ^ j15) & (-281470681808896L);
            long j19 = j14 ^ j18;
            long j21 = j15 ^ j18;
            long j22 = (j16 ^ j17) & (-281470681808896L);
            long j23 = j16 ^ j22;
            long j24 = j17 ^ j22;
            long j25 = (j19 ^ j23) & (-4294967296L);
            long j26 = j19 ^ j25;
            long j27 = (j21 ^ j24) & 281474976645120L;
            jArr2[0] = j26;
            jArr2[1] = j21 ^ j27;
            jArr2[2] = j23 ^ j25;
            jArr2[3] = j27 ^ j24;
        } else if (i11 != 8) {
            throw new IllegalStateException("unsupported block length: only 128/256/512 are allowed");
        } else {
            long[] jArr3 = this.f36878a;
            long j28 = jArr3[0];
            long j29 = jArr3[1];
            long j31 = jArr3[2];
            long j32 = jArr3[3];
            long j33 = jArr3[4];
            long j34 = jArr3[5];
            long j35 = jArr3[6];
            long j36 = jArr3[7];
            long j37 = (j28 ^ j29) & (-71777214294589696L);
            long j38 = j28 ^ j37;
            long j39 = j29 ^ j37;
            long j41 = (j31 ^ j32) & (-71777214294589696L);
            long j42 = j31 ^ j41;
            long j43 = j32 ^ j41;
            long j44 = (j33 ^ j34) & (-71777214294589696L);
            long j45 = j33 ^ j44;
            long j46 = j34 ^ j44;
            long j47 = (j35 ^ j36) & (-71777214294589696L);
            long j48 = j35 ^ j47;
            long j49 = j36 ^ j47;
            long j51 = (j38 ^ j42) & (-281470681808896L);
            long j52 = j38 ^ j51;
            long j53 = j42 ^ j51;
            long j54 = (j39 ^ j43) & 72056494543077120L;
            long j55 = j39 ^ j54;
            long j56 = j43 ^ j54;
            long j57 = (j45 ^ j48) & (-281470681808896L);
            long j58 = j45 ^ j57;
            long j59 = j48 ^ j57;
            long j61 = (j46 ^ j49) & 72056494543077120L;
            long j62 = j46 ^ j61;
            long j63 = j49 ^ j61;
            long j64 = (j52 ^ j58) & (-4294967296L);
            long j65 = j52 ^ j64;
            long j66 = j58 ^ j64;
            long j67 = (j55 ^ j62) & 72057594021150720L;
            long j68 = j55 ^ j67;
            long j69 = (j53 ^ j59) & 281474976645120L;
            long j71 = j53 ^ j69;
            long j72 = j69 ^ j59;
            long j73 = (j56 ^ j63) & 1099511627520L;
            jArr3[0] = j65;
            jArr3[1] = j68;
            jArr3[2] = j71;
            jArr3[3] = j56 ^ j73;
            jArr3[4] = j66;
            jArr3[5] = j62 ^ j67;
            jArr3[6] = j72;
            jArr3[7] = j63 ^ j73;
        }
    }

    private void e() {
        for (int i11 = 0; i11 < this.f36881d; i11++) {
            long[] jArr = this.f36878a;
            long j11 = jArr[i11];
            int i12 = (int) j11;
            int i13 = (int) (j11 >>> 32);
            byte[] bArr = f36874l;
            byte b11 = bArr[i12 & 255];
            byte[] bArr2 = f36875m;
            byte b12 = bArr2[(i12 >>> 8) & 255];
            byte[] bArr3 = f36876n;
            byte b13 = bArr3[(i12 >>> 16) & 255];
            byte[] bArr4 = f36877o;
            int i14 = (bArr4[i12 >>> 24] << 24) | (b11 & 255) | ((b12 & 255) << 8) | ((b13 & 255) << 16);
            byte b14 = bArr[i13 & 255];
            byte b15 = bArr2[(i13 >>> 8) & 255];
            byte b16 = bArr3[(i13 >>> 16) & 255];
            jArr[i11] = (i14 & 4294967295L) | (((bArr4[i13 >>> 24] << 24) | (((b14 & 255) | ((b15 & 255) << 8)) | ((b16 & 255) << 16))) << 32);
        }
    }

    private static long f(long j11) {
        long j12 = j(j11);
        long l11 = l(8, j11) ^ j11;
        long l12 = (l11 ^ l(16, l11)) ^ l(48, j11);
        return ((l(32, k((j11 ^ l12) ^ j12)) ^ l12) ^ l(40, j12)) ^ l(48, j12);
    }

    private static long g(long j11) {
        long l11 = l(8, j11) ^ j11;
        long l12 = (l11 ^ l(32, l11)) ^ l(48, j11);
        long j12 = l12 ^ j11;
        long l13 = l(48, j11);
        long l14 = l(56, j11);
        long l15 = l(16, l12);
        return j(l(40, ((j11 ^ l(32, j12)) ^ l14) ^ j(((l13 ^ (l(24, j11) ^ j12)) ^ l14) ^ j(j(j(l(40, j(j(j12 ^ l14) ^ l(56, j12)) ^ j11) ^ (l(16, j12) ^ j11)) ^ (j12 ^ l13)) ^ l15)))) ^ l12;
    }

    private void h() {
        for (int i11 = 0; i11 < this.f36881d; i11++) {
            long[] jArr = this.f36878a;
            jArr[i11] = f(jArr[i11]);
        }
    }

    private void i() {
        for (int i11 = 0; i11 < this.f36881d; i11++) {
            long[] jArr = this.f36878a;
            jArr[i11] = g(jArr[i11]);
        }
    }

    private static long j(long j11) {
        return (((j11 & (-9187201950435737472L)) >>> 7) * 29) ^ ((9187201950435737471L & j11) << 1);
    }

    private static long k(long j11) {
        return (((j11 & 4629771061636907072L) >>> 6) * 29) ^ (((4557430888798830399L & j11) << 2) ^ ((((-9187201950435737472L) & j11) >>> 6) * 29));
    }

    private static long l(int i11, long j11) {
        return (j11 << (-i11)) | (j11 >>> i11);
    }

    private void m(long[] jArr, long[] jArr2) {
        int i11 = this.f36881d;
        if (i11 == 2) {
            long j11 = jArr[0];
            long j12 = jArr[1];
            jArr2[0] = (j11 >>> 56) | (j12 << 8);
            jArr2[1] = (j11 << 8) | (j12 >>> 56);
        } else if (i11 == 4) {
            long j13 = jArr[0];
            long j14 = jArr[1];
            long j15 = jArr[2];
            long j16 = jArr[3];
            jArr2[0] = (j14 >>> 24) | (j15 << 40);
            jArr2[1] = (j15 >>> 24) | (j16 << 40);
            jArr2[2] = (j16 >>> 24) | (j13 << 40);
            jArr2[3] = (j13 >>> 24) | (j14 << 40);
        } else if (i11 != 8) {
            throw new IllegalStateException("unsupported block length: only 128/256/512 are allowed");
        } else {
            long j17 = jArr[0];
            long j18 = jArr[1];
            long j19 = jArr[2];
            long j21 = jArr[3];
            long j22 = jArr[4];
            long j23 = jArr[5];
            long j24 = jArr[6];
            long j25 = jArr[7];
            jArr2[0] = (j19 >>> 24) | (j21 << 40);
            jArr2[1] = (j21 >>> 24) | (j22 << 40);
            jArr2[2] = (j22 >>> 24) | (j23 << 40);
            jArr2[3] = (j23 >>> 24) | (j24 << 40);
            jArr2[4] = (j24 >>> 24) | (j25 << 40);
            jArr2[5] = (j25 >>> 24) | (j17 << 40);
            jArr2[6] = (j17 >>> 24) | (j18 << 40);
            jArr2[7] = (j18 >>> 24) | (j19 << 40);
        }
    }

    private void n() {
        int i11 = this.f36881d;
        if (i11 == 2) {
            long[] jArr = this.f36878a;
            long j11 = jArr[0];
            long j12 = jArr[1];
            long j13 = (-4294967296L) & (j11 ^ j12);
            jArr[0] = j11 ^ j13;
            jArr[1] = j13 ^ j12;
        } else if (i11 == 4) {
            long[] jArr2 = this.f36878a;
            long j14 = jArr2[0];
            long j15 = jArr2[1];
            long j16 = jArr2[2];
            long j17 = jArr2[3];
            long j18 = (j14 ^ j16) & (-4294967296L);
            long j19 = j14 ^ j18;
            long j21 = j16 ^ j18;
            long j22 = (j15 ^ j17) & 281474976645120L;
            long j23 = j15 ^ j22;
            long j24 = j17 ^ j22;
            long j25 = (j19 ^ j23) & (-281470681808896L);
            long j26 = (j21 ^ j24) & (-281470681808896L);
            jArr2[0] = j19 ^ j25;
            jArr2[1] = j23 ^ j25;
            jArr2[2] = j21 ^ j26;
            jArr2[3] = j24 ^ j26;
        } else if (i11 != 8) {
            throw new IllegalStateException("unsupported block length: only 128/256/512 are allowed");
        } else {
            long[] jArr3 = this.f36878a;
            long j27 = jArr3[0];
            long j28 = jArr3[1];
            long j29 = jArr3[2];
            long j31 = jArr3[3];
            long j32 = jArr3[4];
            long j33 = jArr3[5];
            long j34 = jArr3[6];
            long j35 = jArr3[7];
            long j36 = (j27 ^ j32) & (-4294967296L);
            long j37 = j27 ^ j36;
            long j38 = j32 ^ j36;
            long j39 = (j28 ^ j33) & 72057594021150720L;
            long j41 = j28 ^ j39;
            long j42 = j33 ^ j39;
            long j43 = (j29 ^ j34) & 281474976645120L;
            long j44 = j29 ^ j43;
            long j45 = j34 ^ j43;
            long j46 = (j31 ^ j35) & 1099511627520L;
            long j47 = j31 ^ j46;
            long j48 = j35 ^ j46;
            long j49 = (j37 ^ j44) & (-281470681808896L);
            long j51 = j37 ^ j49;
            long j52 = j44 ^ j49;
            long j53 = (j41 ^ j47) & 72056494543077120L;
            long j54 = j41 ^ j53;
            long j55 = j47 ^ j53;
            long j56 = (j38 ^ j45) & (-281470681808896L);
            long j57 = j38 ^ j56;
            long j58 = j45 ^ j56;
            long j59 = (j42 ^ j48) & 72056494543077120L;
            long j61 = j42 ^ j59;
            long j62 = j48 ^ j59;
            long j63 = (j51 ^ j54) & (-71777214294589696L);
            long j64 = j51 ^ j63;
            long j65 = j54 ^ j63;
            long j66 = (j52 ^ j55) & (-71777214294589696L);
            long j67 = j52 ^ j66;
            long j68 = j55 ^ j66;
            long j69 = (j57 ^ j61) & (-71777214294589696L);
            long j71 = j57 ^ j69;
            long j72 = j61 ^ j69;
            long j73 = (j58 ^ j62) & (-71777214294589696L);
            jArr3[0] = j64;
            jArr3[1] = j65;
            jArr3[2] = j67;
            jArr3[3] = j68;
            jArr3[4] = j71;
            jArr3[5] = j72;
            jArr3[6] = j58 ^ j73;
            jArr3[7] = j62 ^ j73;
        }
    }

    private void o() {
        for (int i11 = 0; i11 < this.f36881d; i11++) {
            long[] jArr = this.f36878a;
            long j11 = jArr[i11];
            int i12 = (int) j11;
            int i13 = (int) (j11 >>> 32);
            byte[] bArr = f36870h;
            byte b11 = bArr[i12 & 255];
            byte[] bArr2 = f36871i;
            byte b12 = bArr2[(i12 >>> 8) & 255];
            byte[] bArr3 = f36872j;
            byte b13 = bArr3[(i12 >>> 16) & 255];
            byte[] bArr4 = f36873k;
            int i14 = (bArr4[i12 >>> 24] << 24) | (b11 & 255) | ((b12 & 255) << 8) | ((b13 & 255) << 16);
            byte b14 = bArr[i13 & 255];
            byte b15 = bArr2[(i13 >>> 8) & 255];
            byte b16 = bArr3[(i13 >>> 16) & 255];
            jArr[i11] = (i14 & 4294967295L) | (((bArr4[i13 >>> 24] << 24) | (((b14 & 255) | ((b15 & 255) << 8)) | ((b16 & 255) << 16))) << 32);
        }
    }

    private void p(int i11) {
        long[] jArr = this.f36880c[i11];
        for (int i12 = 0; i12 < this.f36881d; i12++) {
            long[] jArr2 = this.f36878a;
            jArr2[i12] = jArr2[i12] - jArr[i12];
        }
    }

    private void q(long[] jArr, long[] jArr2) {
        int i11;
        int i12;
        int i13 = this.f36882e;
        long[] jArr3 = new long[i13];
        long[] jArr4 = new long[this.f36881d];
        System.arraycopy(jArr, 0, jArr3, 0, i13);
        long j11 = 281479271743489L;
        int i14 = 0;
        while (true) {
            for (int i15 = 0; i15 < this.f36881d; i15++) {
                jArr4[i15] = jArr2[i15] + j11;
            }
            for (int i16 = 0; i16 < this.f36881d; i16++) {
                this.f36878a[i16] = jArr3[i16] + jArr4[i16];
            }
            o();
            n();
            h();
            for (int i17 = 0; i17 < this.f36881d; i17++) {
                long[] jArr5 = this.f36878a;
                jArr5[i17] = jArr5[i17] ^ jArr4[i17];
            }
            o();
            n();
            h();
            int i18 = 0;
            while (true) {
                i11 = this.f36881d;
                if (i18 >= i11) {
                    break;
                }
                long[] jArr6 = this.f36878a;
                jArr6[i18] = jArr6[i18] + jArr4[i18];
                i18++;
            }
            System.arraycopy(this.f36878a, 0, this.f36880c[i14], 0, i11);
            if (this.f36883f == i14) {
                return;
            }
            if (this.f36881d != this.f36882e) {
                i14 += 2;
                j11 <<= 1;
                for (int i19 = 0; i19 < this.f36881d; i19++) {
                    jArr4[i19] = jArr2[i19] + j11;
                }
                int i21 = 0;
                while (true) {
                    int i22 = this.f36881d;
                    if (i21 >= i22) {
                        break;
                    }
                    this.f36878a[i21] = jArr3[i22 + i21] + jArr4[i21];
                    i21++;
                }
                o();
                n();
                h();
                for (int i23 = 0; i23 < this.f36881d; i23++) {
                    long[] jArr7 = this.f36878a;
                    jArr7[i23] = jArr7[i23] ^ jArr4[i23];
                }
                o();
                n();
                h();
                int i24 = 0;
                while (true) {
                    i12 = this.f36881d;
                    if (i24 >= i12) {
                        break;
                    }
                    long[] jArr8 = this.f36878a;
                    jArr8[i24] = jArr8[i24] + jArr4[i24];
                    i24++;
                }
                System.arraycopy(this.f36878a, 0, this.f36880c[i14], 0, i12);
                if (this.f36883f == i14) {
                    return;
                }
            }
            i14 += 2;
            j11 <<= 1;
            long j12 = jArr3[0];
            for (int i25 = 1; i25 < i13; i25++) {
                jArr3[i25 - 1] = jArr3[i25];
            }
            jArr3[i13 - 1] = j12;
        }
    }

    private void r(long[] jArr, long[] jArr2) {
        int i11 = this.f36881d;
        long[] jArr3 = new long[i11];
        long[] jArr4 = new long[i11];
        long[] jArr5 = new long[i11];
        this.f36878a = jArr5;
        long j11 = jArr5[0];
        int i12 = this.f36882e;
        jArr5[0] = j11 + i11 + i12 + 1;
        System.arraycopy(jArr, 0, jArr3, 0, i11);
        if (i11 == i12) {
            System.arraycopy(jArr, 0, jArr4, 0, i11);
        } else {
            int i13 = this.f36881d;
            System.arraycopy(jArr, i13, jArr4, 0, i13);
        }
        int i14 = 0;
        while (true) {
            long[] jArr6 = this.f36878a;
            if (i14 >= jArr6.length) {
                break;
            }
            jArr6[i14] = jArr6[i14] + jArr3[i14];
            i14++;
        }
        o();
        n();
        h();
        int i15 = 0;
        while (true) {
            long[] jArr7 = this.f36878a;
            if (i15 >= jArr7.length) {
                break;
            }
            jArr7[i15] = jArr7[i15] ^ jArr4[i15];
            i15++;
        }
        o();
        n();
        h();
        int i16 = 0;
        while (true) {
            long[] jArr8 = this.f36878a;
            if (i16 >= jArr8.length) {
                o();
                n();
                h();
                System.arraycopy(this.f36878a, 0, jArr2, 0, this.f36881d);
                return;
            }
            jArr8[i16] = jArr8[i16] + jArr3[i16];
            i16++;
        }
    }

    private void s() {
        for (int i11 = 1; i11 < this.f36883f; i11 += 2) {
            long[][] jArr = this.f36880c;
            m(jArr[i11 - 1], jArr[i11]);
        }
    }

    private void t(int i11) {
        long[] jArr = this.f36880c[i11];
        for (int i12 = 0; i12 < this.f36881d; i12++) {
            long[] jArr2 = this.f36878a;
            jArr2[i12] = jArr2[i12] ^ jArr[i12];
        }
    }

    @Override // org.bouncycastle.crypto.e
    public String getAlgorithmName() {
        return "DSTU7624";
    }

    @Override // org.bouncycastle.crypto.e
    public int getBlockSize() {
        return this.f36881d << 3;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x005b A[LOOP:0: B:26:0x0056->B:28:0x005b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0064 A[EDGE_INSN: B:37:0x0064->B:29:0x0064 ?: BREAK  , SYNTHETIC] */
    @Override // org.bouncycastle.crypto.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void init(boolean r5, org.bouncycastle.crypto.i r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof u50.b1
            if (r0 == 0) goto L8c
            r4.f36884g = r5
            u50.b1 r6 = (u50.b1) r6
            byte[] r5 = r6.a()
            int r6 = r5.length
            int r6 = r6 << 3
            int r0 = r4.f36881d
            int r0 = r0 << 6
            r1 = 512(0x200, float:7.175E-43)
            r2 = 256(0x100, float:3.59E-43)
            r3 = 128(0x80, float:1.794E-43)
            if (r6 == r3) goto L28
            if (r6 == r2) goto L28
            if (r6 != r1) goto L20
            goto L28
        L20:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "unsupported key length: only 128/256/512 are allowed"
            r5.<init>(r6)
            throw r5
        L28:
            if (r6 == r0) goto L37
            int r0 = r0 * 2
            if (r6 != r0) goto L2f
            goto L37
        L2f:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Unsupported key length"
            r5.<init>(r6)
            throw r5
        L37:
            if (r6 == r3) goto L44
            if (r6 == r2) goto L41
            if (r6 == r1) goto L3e
            goto L48
        L3e:
            r0 = 18
            goto L46
        L41:
            r0 = 14
            goto L46
        L44:
            r0 = 10
        L46:
            r4.f36883f = r0
        L48:
            int r0 = r6 >>> 6
            r4.f36882e = r0
            int r0 = r4.f36883f
            int r0 = r0 + 1
            long[][] r0 = new long[r0]
            r4.f36880c = r0
            r0 = 0
            r1 = r0
        L56:
            long[][] r2 = r4.f36880c
            int r3 = r2.length
            if (r1 >= r3) goto L64
            int r3 = r4.f36881d
            long[] r3 = new long[r3]
            r2[r1] = r3
            int r1 = r1 + 1
            goto L56
        L64:
            int r1 = r4.f36882e
            long[] r1 = new long[r1]
            r4.f36879b = r1
            int r2 = r5.length
            int r6 = r6 >>> 3
            if (r2 != r6) goto L84
            r70.i.q(r5, r0, r1)
            int r5 = r4.f36881d
            long[] r5 = new long[r5]
            long[] r6 = r4.f36879b
            r4.r(r6, r5)
            long[] r6 = r4.f36879b
            r4.q(r6, r5)
            r4.s()
            return
        L84:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Invalid key parameter passed to DSTU7624Engine init"
            r5.<init>(r6)
            throw r5
        L8c:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Invalid parameter passed to DSTU7624Engine init"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: l50.r.init(boolean, org.bouncycastle.crypto.i):void");
    }

    @Override // org.bouncycastle.crypto.e
    public int processBlock(byte[] bArr, int i11, byte[] bArr2, int i12) {
        int i13;
        if (this.f36879b != null) {
            if (getBlockSize() + i11 <= bArr.length) {
                if (getBlockSize() + i12 <= bArr2.length) {
                    int i14 = 0;
                    if (this.f36884g) {
                        if (this.f36881d != 2) {
                            r70.i.q(bArr, i11, this.f36878a);
                            a(0);
                            while (true) {
                                o();
                                n();
                                h();
                                i14++;
                                i13 = this.f36883f;
                                if (i14 == i13) {
                                    break;
                                }
                                t(i14);
                            }
                            a(i13);
                            r70.i.x(this.f36878a, bArr2, i12);
                        } else {
                            c(bArr, i11, bArr2, i12);
                        }
                    } else if (this.f36881d != 2) {
                        r70.i.q(bArr, i11, this.f36878a);
                        p(this.f36883f);
                        int i15 = this.f36883f;
                        while (true) {
                            i();
                            d();
                            e();
                            i15--;
                            if (i15 == 0) {
                                break;
                            }
                            t(i15);
                        }
                        p(0);
                        r70.i.x(this.f36878a, bArr2, i12);
                    } else {
                        b(bArr, i11, bArr2, i12);
                    }
                    return getBlockSize();
                }
                throw new OutputLengthException("Output buffer too short");
            }
            throw new DataLengthException("Input buffer too short");
        }
        throw new IllegalStateException("DSTU7624Engine not initialised");
    }

    @Override // org.bouncycastle.crypto.e
    public void reset() {
        org.bouncycastle.util.a.C(this.f36878a, 0L);
    }
}