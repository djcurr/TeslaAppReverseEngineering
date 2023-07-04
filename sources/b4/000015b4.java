package com.canhub.cropper;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.util.Log;
import android.util.Pair;
import androidx.core.content.FileProvider;
import com.canhub.cropper.CropImageView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.stripe.android.core.networking.FileUploadRequest;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    static final Rect f10968a = new Rect();

    /* renamed from: b  reason: collision with root package name */
    static final RectF f10969b = new RectF();

    /* renamed from: c  reason: collision with root package name */
    static final RectF f10970c = new RectF();

    /* renamed from: d  reason: collision with root package name */
    static final float[] f10971d = new float[6];

    /* renamed from: e  reason: collision with root package name */
    static final float[] f10972e = new float[6];

    /* renamed from: f  reason: collision with root package name */
    private static int f10973f;

    /* renamed from: g  reason: collision with root package name */
    static Pair<String, WeakReference<Bitmap>> f10974g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Bitmap f10975a;

        /* renamed from: b  reason: collision with root package name */
        final int f10976b;

        a(Bitmap bitmap, int i11) {
            this.f10975a = bitmap;
            this.f10976b = i11;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final Bitmap f10977a;

        /* renamed from: b  reason: collision with root package name */
        final int f10978b;

        b(Bitmap bitmap, int i11) {
            this.f10977a = bitmap;
            this.f10978b = i11;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static b A(Bitmap bitmap, Context context, Uri uri) {
        androidx.exifinterface.media.a aVar = null;
        try {
            InputStream openInputStream = context.getContentResolver().openInputStream(uri);
            if (openInputStream != null) {
                androidx.exifinterface.media.a aVar2 = new androidx.exifinterface.media.a(openInputStream);
                try {
                    openInputStream.close();
                } catch (Exception unused) {
                }
                aVar = aVar2;
            }
        } catch (Exception unused2) {
        }
        return aVar != null ? B(bitmap, aVar) : new b(bitmap, 0);
    }

    static b B(Bitmap bitmap, androidx.exifinterface.media.a aVar) {
        int i11 = aVar.i("Orientation", 1);
        return new b(bitmap, i11 != 3 ? i11 != 6 ? i11 != 8 ? 0 : 270 : 90 : CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA256);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void C(Context context, Bitmap bitmap, Uri uri, Bitmap.CompressFormat compressFormat, int i11) {
        OutputStream outputStream = null;
        try {
            outputStream = context.getContentResolver().openOutputStream(uri);
            bitmap.compress(compressFormat, i11, outputStream);
        } finally {
            c(outputStream);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Uri D(Context context, Bitmap bitmap, Uri uri) {
        boolean z11 = true;
        try {
            if (uri == null) {
                if (new eb.a().b()) {
                    uri = FileProvider.getUriForFile(context, context.getPackageName() + ".cropper.fileprovider", File.createTempFile("aic_state_store_temp", ".jpg", context.getCacheDir()));
                } else {
                    uri = Uri.fromFile(File.createTempFile("aic_state_store_temp", ".jpg", context.getCacheDir()));
                }
            } else if (new File(uri.getPath()).exists()) {
                z11 = false;
            }
            if (z11) {
                C(context, bitmap, uri, Bitmap.CompressFormat.JPEG, 95);
            }
            return uri;
        } catch (Exception e11) {
            Log.w("AIC", "Failed to write bitmap to temp file for image-cropper save instance state", e11);
            return null;
        }
    }

    private static int a(int i11, int i12) {
        if (f10973f == 0) {
            f10973f = o();
        }
        int i13 = 1;
        if (f10973f > 0) {
            while (true) {
                int i14 = i12 / i13;
                int i15 = f10973f;
                if (i14 <= i15 && i11 / i13 <= i15) {
                    break;
                }
                i13 *= 2;
            }
        }
        return i13;
    }

    private static int b(int i11, int i12, int i13, int i14) {
        int i15 = 1;
        if (i12 > i14 || i11 > i13) {
            while ((i12 / 2) / i15 > i14 && (i11 / 2) / i15 > i13) {
                i15 *= 2;
            }
        }
        return i15;
    }

    private static void c(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static a d(Context context, Uri uri, float[] fArr, int i11, int i12, int i13, boolean z11, int i14, int i15, int i16, int i17, boolean z12, boolean z13) {
        int i18 = 1;
        do {
            try {
                return e(context, uri, fArr, i11, i12, i13, z11, i14, i15, i16, i17, z12, z13, i18);
            } catch (OutOfMemoryError e11) {
                i18 *= 2;
                if (i18 > 16) {
                    throw new RuntimeException("Failed to handle OOM by sampling (" + i18 + "): " + uri + FileUploadRequest.LINE_BREAK + e11.getMessage(), e11);
                }
            }
        } while (i18 > 16);
        throw new RuntimeException("Failed to handle OOM by sampling (" + i18 + "): " + uri + FileUploadRequest.LINE_BREAK + e11.getMessage(), e11);
    }

    private static a e(Context context, Uri uri, float[] fArr, int i11, int i12, int i13, boolean z11, int i14, int i15, int i16, int i17, boolean z12, boolean z13, int i18) {
        Bitmap z14;
        Bitmap bitmap;
        Rect s11 = s(fArr, i12, i13, z11, i14, i15);
        int width = i16 > 0 ? i16 : s11.width();
        int height = i17 > 0 ? i17 : s11.height();
        Bitmap bitmap2 = null;
        int i19 = 1;
        try {
            a m11 = m(context, uri, s11, width, height, i18);
            bitmap2 = m11.f10975a;
            i19 = m11.f10976b;
        } catch (Exception unused) {
        }
        if (bitmap2 != null) {
            try {
                z14 = z(bitmap2, i11, z12, z13);
            } catch (OutOfMemoryError e11) {
                e = e11;
            }
            try {
                if (i11 % 90 != 0) {
                    z14 = i(z14, fArr, s11, i11, z11, i14, i15);
                }
                return new a(z14, i19);
            } catch (OutOfMemoryError e12) {
                e = e12;
                bitmap2 = bitmap;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                throw e;
            }
        }
        return f(context, uri, fArr, i11, z11, i14, i15, i18, s11, width, height, z12, z13);
    }

    private static a f(Context context, Uri uri, float[] fArr, int i11, boolean z11, int i12, int i13, int i14, Rect rect, int i15, int i16, boolean z12, boolean z13) {
        Bitmap bitmap = null;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            int b11 = b(rect.width(), rect.height(), i15, i16) * i14;
            options.inSampleSize = b11;
            Bitmap j11 = j(context.getContentResolver(), uri, options);
            if (j11 != null) {
                try {
                    int length = fArr.length;
                    float[] fArr2 = new float[length];
                    System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                    for (int i17 = 0; i17 < length; i17++) {
                        fArr2[i17] = fArr2[i17] / options.inSampleSize;
                    }
                    bitmap = h(j11, fArr2, i11, z11, i12, i13, 1.0f, z12, z13);
                    if (bitmap != j11) {
                        j11.recycle();
                    }
                } catch (Throwable th2) {
                    j11.recycle();
                    throw th2;
                }
            }
            return new a(bitmap, b11);
        } catch (Exception e11) {
            throw new RuntimeException("Failed to load sampled bitmap: " + uri + FileUploadRequest.LINE_BREAK + e11.getMessage(), e11);
        } catch (OutOfMemoryError e12) {
            if (0 != 0) {
                bitmap.recycle();
            }
            throw e12;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static a g(Bitmap bitmap, float[] fArr, int i11, boolean z11, int i12, int i13, boolean z12, boolean z13) {
        int i14 = 1;
        do {
            try {
                return new a(h(bitmap, fArr, i11, z11, i12, i13, 1.0f / i14, z12, z13), i14);
            } catch (OutOfMemoryError e11) {
                i14 *= 2;
                if (i14 > 8) {
                    throw e11;
                }
            }
        } while (i14 > 8);
        throw e11;
    }

    private static Bitmap h(Bitmap bitmap, float[] fArr, int i11, boolean z11, int i12, int i13, float f11, boolean z12, boolean z13) {
        float f12 = f11;
        Rect s11 = s(fArr, bitmap.getWidth(), bitmap.getHeight(), z11, i12, i13);
        Matrix matrix = new Matrix();
        matrix.setRotate(i11, bitmap.getWidth() / 2, bitmap.getHeight() / 2);
        float f13 = z12 ? -f12 : f12;
        if (z13) {
            f12 = -f12;
        }
        matrix.postScale(f13, f12);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, s11.left, s11.top, s11.width(), s11.height(), matrix, true);
        if (createBitmap == bitmap) {
            createBitmap = bitmap.copy(bitmap.getConfig(), false);
        }
        return i11 % 90 != 0 ? i(createBitmap, fArr, s11, i11, z11, i12, i13) : createBitmap;
    }

    private static Bitmap i(Bitmap bitmap, float[] fArr, Rect rect, int i11, boolean z11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        if (i11 % 90 != 0) {
            double radians = Math.toRadians(i11);
            int i17 = (i11 < 90 || (i11 > 180 && i11 < 270)) ? rect.left : rect.right;
            int i18 = 0;
            int i19 = 0;
            while (true) {
                if (i19 >= fArr.length) {
                    i14 = 0;
                    i15 = 0;
                    i16 = 0;
                    break;
                } else if (fArr[i19] >= i17 - 1 && fArr[i19] <= i17 + 1) {
                    int i21 = i19 + 1;
                    i18 = (int) Math.abs(Math.sin(radians) * (rect.bottom - fArr[i21]));
                    i15 = (int) Math.abs(Math.cos(radians) * (fArr[i21] - rect.top));
                    i16 = (int) Math.abs((fArr[i21] - rect.top) / Math.sin(radians));
                    i14 = (int) Math.abs((rect.bottom - fArr[i21]) / Math.cos(radians));
                    break;
                } else {
                    i19 += 2;
                }
            }
            rect.set(i18, i15, i16 + i18, i14 + i15);
            if (z11) {
                n(rect, i12, i13);
            }
            Bitmap createBitmap = Bitmap.createBitmap(bitmap, rect.left, rect.top, rect.width(), rect.height());
            if (bitmap != createBitmap) {
                bitmap.recycle();
            }
            return createBitmap;
        }
        return bitmap;
    }

    private static Bitmap j(ContentResolver contentResolver, Uri uri, BitmapFactory.Options options) {
        do {
            InputStream inputStream = null;
            try {
                try {
                    inputStream = contentResolver.openInputStream(uri);
                    return BitmapFactory.decodeStream(inputStream, f10968a, options);
                } catch (OutOfMemoryError unused) {
                    options.inSampleSize *= 2;
                    c(inputStream);
                    if (options.inSampleSize > 512) {
                        throw new RuntimeException("Failed to decode image: " + uri);
                    }
                }
            } finally {
                c(inputStream);
            }
        } while (options.inSampleSize > 512);
        throw new RuntimeException("Failed to decode image: " + uri);
    }

    private static BitmapFactory.Options k(ContentResolver contentResolver, Uri uri) {
        InputStream inputStream;
        try {
            inputStream = contentResolver.openInputStream(uri);
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
        }
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeStream(inputStream, f10968a, options);
            options.inJustDecodeBounds = false;
            c(inputStream);
            return options;
        } catch (Throwable th3) {
            th = th3;
            c(inputStream);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static a l(Context context, Uri uri, int i11, int i12) {
        try {
            ContentResolver contentResolver = context.getContentResolver();
            BitmapFactory.Options k11 = k(contentResolver, uri);
            int i13 = k11.outWidth;
            if (i13 == -1 && k11.outHeight == -1) {
                throw new RuntimeException("File is not a picture");
            }
            k11.inSampleSize = Math.max(b(i13, k11.outHeight, i11, i12), a(k11.outWidth, k11.outHeight));
            return new a(j(contentResolver, uri, k11), k11.inSampleSize);
        } catch (Exception e11) {
            throw new RuntimeException("Failed to load sampled bitmap: " + uri + FileUploadRequest.LINE_BREAK + e11.getMessage(), e11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.canhub.cropper.c.a m(android.content.Context r4, android.net.Uri r5, android.graphics.Rect r6, int r7, int r8, int r9) {
        /*
            r0 = 0
            android.graphics.BitmapFactory$Options r1 = new android.graphics.BitmapFactory$Options     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5c
            r1.<init>()     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5c
            int r2 = r6.width()     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5c
            int r3 = r6.height()     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5c
            int r7 = b(r2, r3, r7, r8)     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5c
            int r9 = r9 * r7
            r1.inSampleSize = r9     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5c
            android.content.ContentResolver r4 = r4.getContentResolver()     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5c
            java.io.InputStream r4 = r4.openInputStream(r5)     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5c
            r7 = 0
            android.graphics.BitmapRegionDecoder r7 = android.graphics.BitmapRegionDecoder.newInstance(r4, r7)     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L55
        L22:
            com.canhub.cropper.c$a r8 = new com.canhub.cropper.c$a     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L36 java.lang.OutOfMemoryError -> L38
            android.graphics.Bitmap r9 = r7.decodeRegion(r6, r1)     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L36 java.lang.OutOfMemoryError -> L38
            int r2 = r1.inSampleSize     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L36 java.lang.OutOfMemoryError -> L38
            r8.<init>(r9, r2)     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L36 java.lang.OutOfMemoryError -> L38
            c(r4)
            r7.recycle()
            return r8
        L34:
            r5 = move-exception
            goto L53
        L36:
            r6 = move-exception
            goto L57
        L38:
            int r8 = r1.inSampleSize     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L36
            int r8 = r8 * 2
            r1.inSampleSize = r8     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L36
            r9 = 512(0x200, float:7.175E-43)
            if (r8 <= r9) goto L22
            c(r4)
            if (r7 == 0) goto L4a
            r7.recycle()
        L4a:
            com.canhub.cropper.c$a r4 = new com.canhub.cropper.c$a
            r5 = 1
            r4.<init>(r0, r5)
            return r4
        L51:
            r5 = move-exception
            r7 = r0
        L53:
            r0 = r4
            goto L82
        L55:
            r6 = move-exception
            r7 = r0
        L57:
            r0 = r4
            goto L5e
        L59:
            r5 = move-exception
            r7 = r0
            goto L82
        L5c:
            r6 = move-exception
            r7 = r0
        L5e:
            java.lang.RuntimeException r4 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L81
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L81
            r8.<init>()     // Catch: java.lang.Throwable -> L81
            java.lang.String r9 = "Failed to load sampled bitmap: "
            r8.append(r9)     // Catch: java.lang.Throwable -> L81
            r8.append(r5)     // Catch: java.lang.Throwable -> L81
            java.lang.String r5 = "\r\n"
            r8.append(r5)     // Catch: java.lang.Throwable -> L81
            java.lang.String r5 = r6.getMessage()     // Catch: java.lang.Throwable -> L81
            r8.append(r5)     // Catch: java.lang.Throwable -> L81
            java.lang.String r5 = r8.toString()     // Catch: java.lang.Throwable -> L81
            r4.<init>(r5, r6)     // Catch: java.lang.Throwable -> L81
            throw r4     // Catch: java.lang.Throwable -> L81
        L81:
            r5 = move-exception
        L82:
            c(r0)
            if (r7 == 0) goto L8a
            r7.recycle()
        L8a:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.canhub.cropper.c.m(android.content.Context, android.net.Uri, android.graphics.Rect, int, int, int):com.canhub.cropper.c$a");
    }

    private static void n(Rect rect, int i11, int i12) {
        if (i11 != i12 || rect.width() == rect.height()) {
            return;
        }
        if (rect.height() > rect.width()) {
            rect.bottom -= rect.height() - rect.width();
        } else {
            rect.right -= rect.width() - rect.height();
        }
    }

    private static int o() {
        try {
            EGL10 egl10 = (EGL10) EGLContext.getEGL();
            EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            egl10.eglInitialize(eglGetDisplay, new int[2]);
            int[] iArr = new int[1];
            egl10.eglGetConfigs(eglGetDisplay, null, 0, iArr);
            EGLConfig[] eGLConfigArr = new EGLConfig[iArr[0]];
            egl10.eglGetConfigs(eglGetDisplay, eGLConfigArr, iArr[0], iArr);
            int[] iArr2 = new int[1];
            int i11 = 0;
            for (int i12 = 0; i12 < iArr[0]; i12++) {
                egl10.eglGetConfigAttrib(eglGetDisplay, eGLConfigArr[i12], 12332, iArr2);
                if (i11 < iArr2[0]) {
                    i11 = iArr2[0];
                }
            }
            egl10.eglTerminate(eglGetDisplay);
            return Math.max(i11, 2048);
        } catch (Exception unused) {
            return 2048;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float p(float[] fArr) {
        return Math.max(Math.max(Math.max(fArr[1], fArr[3]), fArr[5]), fArr[7]);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float q(float[] fArr) {
        return (v(fArr) + u(fArr)) / 2.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float r(float[] fArr) {
        return (p(fArr) + w(fArr)) / 2.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Rect s(float[] fArr, int i11, int i12, boolean z11, int i13, int i14) {
        Rect rect = new Rect(Math.round(Math.max((float) BitmapDescriptorFactory.HUE_RED, u(fArr))), Math.round(Math.max((float) BitmapDescriptorFactory.HUE_RED, w(fArr))), Math.round(Math.min(i11, v(fArr))), Math.round(Math.min(i12, p(fArr))));
        if (z11) {
            n(rect, i13, i14);
        }
        return rect;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float t(float[] fArr) {
        return p(fArr) - w(fArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float u(float[] fArr) {
        return Math.min(Math.min(Math.min(fArr[0], fArr[2]), fArr[4]), fArr[6]);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float v(float[] fArr) {
        return Math.max(Math.max(Math.max(fArr[0], fArr[2]), fArr[4]), fArr[6]);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float w(float[] fArr) {
        return Math.min(Math.min(Math.min(fArr[1], fArr[3]), fArr[5]), fArr[7]);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float x(float[] fArr) {
        return v(fArr) - u(fArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Bitmap y(Bitmap bitmap, int i11, int i12, CropImageView.j jVar) {
        if (i11 > 0 && i12 > 0) {
            try {
                CropImageView.j jVar2 = CropImageView.j.RESIZE_FIT;
                if (jVar == jVar2 || jVar == CropImageView.j.RESIZE_INSIDE || jVar == CropImageView.j.RESIZE_EXACT) {
                    Bitmap bitmap2 = null;
                    if (jVar == CropImageView.j.RESIZE_EXACT) {
                        bitmap2 = Bitmap.createScaledBitmap(bitmap, i11, i12, false);
                    } else {
                        float width = bitmap.getWidth();
                        float height = bitmap.getHeight();
                        float max = Math.max(width / i11, height / i12);
                        if (max > 1.0f || jVar == jVar2) {
                            bitmap2 = Bitmap.createScaledBitmap(bitmap, (int) (width / max), (int) (height / max), false);
                        }
                    }
                    if (bitmap2 != null) {
                        if (bitmap2 != bitmap) {
                            bitmap.recycle();
                        }
                        return bitmap2;
                    }
                }
            } catch (Exception e11) {
                Log.w("AIC", "Failed to resize cropped image, return bitmap before resize", e11);
            }
        }
        return bitmap;
    }

    private static Bitmap z(Bitmap bitmap, int i11, boolean z11, boolean z12) {
        if (i11 > 0 || z11 || z12) {
            Matrix matrix = new Matrix();
            matrix.setRotate(i11);
            matrix.postScale(z11 ? -1.0f : 1.0f, z12 ? -1.0f : 1.0f);
            Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, false);
            if (createBitmap != bitmap) {
                bitmap.recycle();
            }
            return createBitmap;
        }
        return bitmap;
    }
}