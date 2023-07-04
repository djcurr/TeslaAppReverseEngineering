package ko;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.Image;
import android.os.SystemClock;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.mlkit_vision_common.zzli;
import com.google.android.gms.internal.mlkit_vision_common.zzlk;
import com.google.mlkit.common.sdkinternal.h;
import java.nio.ByteBuffer;
import lo.c;

/* loaded from: classes2.dex */
public class a implements h {

    /* renamed from: a  reason: collision with root package name */
    private volatile Bitmap f34878a;

    /* renamed from: b  reason: collision with root package name */
    private volatile ByteBuffer f34879b;

    /* renamed from: c  reason: collision with root package name */
    private volatile b f34880c;

    /* renamed from: d  reason: collision with root package name */
    private final int f34881d;

    /* renamed from: e  reason: collision with root package name */
    private final int f34882e;

    /* renamed from: f  reason: collision with root package name */
    private final int f34883f;

    /* renamed from: g  reason: collision with root package name */
    private final int f34884g;

    /* renamed from: h  reason: collision with root package name */
    private final Matrix f34885h;

    private a(Bitmap bitmap, int i11) {
        this.f34878a = (Bitmap) Preconditions.checkNotNull(bitmap);
        this.f34881d = bitmap.getWidth();
        this.f34882e = bitmap.getHeight();
        l(i11);
        this.f34883f = i11;
        this.f34884g = -1;
        this.f34885h = null;
    }

    public static a a(ByteBuffer byteBuffer, int i11, int i12, int i13, int i14) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        a aVar = new a(byteBuffer, i11, i12, i13, i14);
        n(i14, 3, elapsedRealtime, i12, i11, byteBuffer.limit(), i13);
        return aVar;
    }

    public static a b(Image image, int i11) {
        return m(image, i11, null);
    }

    private static int l(int i11) {
        boolean z11 = true;
        if (i11 != 0 && i11 != 90 && i11 != 180) {
            if (i11 == 270) {
                i11 = 270;
            } else {
                z11 = false;
            }
        }
        Preconditions.checkArgument(z11, "Invalid rotation. Only 0, 90, 180, 270 are supported currently.");
        return i11;
    }

    private static a m(Image image, int i11, Matrix matrix) {
        a aVar;
        int limit;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Preconditions.checkNotNull(image, "Please provide a valid image");
        l(i11);
        boolean z11 = true;
        if (image.getFormat() != 256 && image.getFormat() != 35) {
            z11 = false;
        }
        Preconditions.checkArgument(z11, "Only JPEG and YUV_420_888 are supported now");
        Image.Plane[] planes = image.getPlanes();
        if (image.getFormat() == 256) {
            limit = image.getPlanes()[0].getBuffer().limit();
            aVar = new a(c.f().c(image, i11), 0);
        } else {
            for (Image.Plane plane : planes) {
                if (plane.getBuffer() != null) {
                    plane.getBuffer().rewind();
                }
            }
            aVar = new a(image, image.getWidth(), image.getHeight(), i11, matrix);
            limit = (image.getPlanes()[0].getBuffer().limit() * 3) / 2;
        }
        int i12 = limit;
        a aVar2 = aVar;
        n(image.getFormat(), 5, elapsedRealtime, image.getHeight(), image.getWidth(), i12, i11);
        return aVar2;
    }

    private static void n(int i11, int i12, long j11, int i13, int i14, int i15, int i16) {
        zzlk.zza(zzli.zzb("vision-common"), i11, i12, j11, i13, i14, i15, i16);
    }

    @KeepForSdk
    public Bitmap c() {
        return this.f34878a;
    }

    @KeepForSdk
    public ByteBuffer d() {
        return this.f34879b;
    }

    @KeepForSdk
    public Matrix e() {
        return this.f34885h;
    }

    @KeepForSdk
    public int f() {
        return this.f34884g;
    }

    @KeepForSdk
    public int g() {
        return this.f34882e;
    }

    @KeepForSdk
    public Image h() {
        if (this.f34880c == null) {
            return null;
        }
        return this.f34880c.a();
    }

    @KeepForSdk
    public Image.Plane[] i() {
        if (this.f34880c == null) {
            return null;
        }
        return this.f34880c.b();
    }

    @KeepForSdk
    public int j() {
        return this.f34883f;
    }

    @KeepForSdk
    public int k() {
        return this.f34881d;
    }

    private a(Image image, int i11, int i12, int i13, Matrix matrix) {
        Preconditions.checkNotNull(image);
        this.f34880c = new b(image);
        this.f34881d = i11;
        this.f34882e = i12;
        l(i13);
        this.f34883f = i13;
        this.f34884g = 35;
        this.f34885h = matrix;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private a(java.nio.ByteBuffer r5, int r6, int r7, int r8, int r9) {
        /*
            r4 = this;
            r4.<init>()
            r0 = 0
            r1 = 17
            r2 = 1
            r3 = 842094169(0x32315659, float:1.0322389E-8)
            if (r9 == r3) goto L12
            if (r9 != r1) goto L10
            r9 = r1
            goto L12
        L10:
            r1 = r0
            goto L13
        L12:
            r1 = r2
        L13:
            com.google.android.gms.common.internal.Preconditions.checkArgument(r1)
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r5)
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
            r4.f34879b = r1
            int r1 = r5.limit()
            int r3 = r6 * r7
            if (r1 <= r3) goto L27
            r0 = r2
        L27:
            java.lang.String r1 = "Image dimension, ByteBuffer size and format don't match. Please check if the ByteBuffer is in the decalred format."
            com.google.android.gms.common.internal.Preconditions.checkArgument(r0, r1)
            r5.rewind()
            r4.f34881d = r6
            r4.f34882e = r7
            l(r8)
            r4.f34883f = r8
            r4.f34884g = r9
            r5 = 0
            r4.f34885h = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ko.a.<init>(java.nio.ByteBuffer, int, int, int, int):void");
    }
}