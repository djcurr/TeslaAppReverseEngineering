package com.stripe.android.stripe3ds2.views;

import android.graphics.Bitmap;
import com.stripe.android.stripe3ds2.observability.ErrorReporter;
import com.stripe.android.stripe3ds2.utils.ImageCache;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class ImageRepository {
    private final ImageCache imageCache;
    private final ImageSupplier imageSupplier;
    private final zz.g workContext;

    /* loaded from: classes6.dex */
    public interface ImageSupplier {

        /* loaded from: classes6.dex */
        public static final class Default implements ImageSupplier {
            private final ErrorReporter errorReporter;
            private final zz.g workContext;

            public Default(ErrorReporter errorReporter, zz.g workContext) {
                s.g(errorReporter, "errorReporter");
                s.g(workContext, "workContext");
                this.errorReporter = errorReporter;
                this.workContext = workContext;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
            /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
            /* JADX WARN: Removed duplicated region for block: B:25:0x0061  */
            /* JADX WARN: Removed duplicated region for block: B:26:0x0063 A[Catch: all -> 0x006f, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x0032, blocks: (B:12:0x002e, B:23:0x005d, B:28:0x006a, B:27:0x0067, B:26:0x0063), top: B:49:0x002e }] */
            /* JADX WARN: Removed duplicated region for block: B:41:0x0089  */
            /* JADX WARN: Removed duplicated region for block: B:45:0x00b0  */
            /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
            @Override // com.stripe.android.stripe3ds2.views.ImageRepository.ImageSupplier
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public java.lang.Object getBitmap(java.lang.String r13, zz.d<? super android.graphics.Bitmap> r14) {
                /*
                    r12 = this;
                    boolean r0 = r14 instanceof com.stripe.android.stripe3ds2.views.ImageRepository$ImageSupplier$Default$getBitmap$1
                    if (r0 == 0) goto L13
                    r0 = r14
                    com.stripe.android.stripe3ds2.views.ImageRepository$ImageSupplier$Default$getBitmap$1 r0 = (com.stripe.android.stripe3ds2.views.ImageRepository$ImageSupplier$Default$getBitmap$1) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L18
                L13:
                    com.stripe.android.stripe3ds2.views.ImageRepository$ImageSupplier$Default$getBitmap$1 r0 = new com.stripe.android.stripe3ds2.views.ImageRepository$ImageSupplier$Default$getBitmap$1
                    r0.<init>(r12, r14)
                L18:
                    java.lang.Object r14 = r0.result
                    java.lang.Object r1 = a00.b.d()
                    int r2 = r0.label
                    r3 = 1
                    r4 = 0
                    if (r2 == 0) goto L3c
                    if (r2 != r3) goto L34
                    java.lang.Object r13 = r0.L$1
                    java.lang.String r13 = (java.lang.String) r13
                    java.lang.Object r0 = r0.L$0
                    com.stripe.android.stripe3ds2.views.ImageRepository$ImageSupplier$Default r0 = (com.stripe.android.stripe3ds2.views.ImageRepository.ImageSupplier.Default) r0
                    vz.r.b(r14)     // Catch: java.lang.Throwable -> L32
                    goto L5d
                L32:
                    r14 = move-exception
                    goto L78
                L34:
                    java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                    java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
                    r13.<init>(r14)
                    throw r13
                L3c:
                    vz.r.b(r14)
                    vz.q$a r14 = vz.q.f54772b     // Catch: java.lang.Throwable -> L76
                    com.stripe.android.stripe3ds2.transaction.StripeHttpClient r14 = new com.stripe.android.stripe3ds2.transaction.StripeHttpClient     // Catch: java.lang.Throwable -> L76
                    r7 = 0
                    com.stripe.android.stripe3ds2.observability.ErrorReporter r8 = r12.errorReporter     // Catch: java.lang.Throwable -> L76
                    zz.g r9 = r12.workContext     // Catch: java.lang.Throwable -> L76
                    r10 = 2
                    r11 = 0
                    r5 = r14
                    r6 = r13
                    r5.<init>(r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L76
                    r0.L$0 = r12     // Catch: java.lang.Throwable -> L76
                    r0.L$1 = r13     // Catch: java.lang.Throwable -> L76
                    r0.label = r3     // Catch: java.lang.Throwable -> L76
                    java.lang.Object r14 = r14.doGetRequest(r0)     // Catch: java.lang.Throwable -> L76
                    if (r14 != r1) goto L5c
                    return r1
                L5c:
                    r0 = r12
                L5d:
                    java.io.InputStream r14 = (java.io.InputStream) r14     // Catch: java.lang.Throwable -> L32
                    if (r14 != 0) goto L63
                    r1 = r4
                    goto L6a
                L63:
                    android.graphics.Bitmap r1 = android.graphics.BitmapFactory.decodeStream(r14)     // Catch: java.lang.Throwable -> L6f
                    e00.b.a(r14, r4)     // Catch: java.lang.Throwable -> L32
                L6a:
                    java.lang.Object r14 = vz.q.b(r1)     // Catch: java.lang.Throwable -> L32
                    goto L82
                L6f:
                    r1 = move-exception
                    throw r1     // Catch: java.lang.Throwable -> L71
                L71:
                    r2 = move-exception
                    e00.b.a(r14, r1)     // Catch: java.lang.Throwable -> L32
                    throw r2     // Catch: java.lang.Throwable -> L32
                L76:
                    r14 = move-exception
                    r0 = r12
                L78:
                    vz.q$a r1 = vz.q.f54772b
                    java.lang.Object r14 = vz.r.a(r14)
                    java.lang.Object r14 = vz.q.b(r14)
                L82:
                    java.lang.Throwable r1 = vz.q.e(r14)
                    if (r1 != 0) goto L89
                    goto La9
                L89:
                    com.stripe.android.stripe3ds2.observability.ErrorReporter r0 = r0.errorReporter
                    java.lang.RuntimeException r2 = new java.lang.RuntimeException
                    java.lang.StringBuilder r3 = new java.lang.StringBuilder
                    r3.<init>()
                    java.lang.String r5 = "Could not get bitmap from url: "
                    r3.append(r5)
                    r3.append(r13)
                    r13 = 46
                    r3.append(r13)
                    java.lang.String r13 = r3.toString()
                    r2.<init>(r13, r1)
                    r0.reportError(r2)
                La9:
                    boolean r13 = vz.q.g(r14)
                    if (r13 == 0) goto Lb0
                    goto Lb1
                Lb0:
                    r4 = r14
                Lb1:
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.stripe3ds2.views.ImageRepository.ImageSupplier.Default.getBitmap(java.lang.String, zz.d):java.lang.Object");
            }
        }

        Object getBitmap(String str, zz.d<? super Bitmap> dVar);
    }

    public ImageRepository(zz.g workContext, ImageCache imageCache, ImageSupplier imageSupplier) {
        s.g(workContext, "workContext");
        s.g(imageCache, "imageCache");
        s.g(imageSupplier, "imageSupplier");
        this.workContext = workContext;
        this.imageCache = imageCache;
        this.imageSupplier = imageSupplier;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cacheImage(String str, Bitmap bitmap) {
        if (bitmap != null) {
            this.imageCache.set(str, bitmap);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bitmap getLocalImage(String str) {
        return this.imageCache.get(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getRemoteImage(String str, zz.d<? super Bitmap> dVar) {
        return this.imageSupplier.getBitmap(str, dVar);
    }

    public final Object getImage$3ds2sdk_release(String str, zz.d<? super Bitmap> dVar) {
        return v20.i.g(this.workContext, new ImageRepository$getImage$2(str, this, null), dVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ImageRepository(ErrorReporter errorReporter, zz.g workContext) {
        this(workContext, ImageCache.Default.INSTANCE, new ImageSupplier.Default(errorReporter, workContext));
        s.g(errorReporter, "errorReporter");
        s.g(workContext, "workContext");
    }
}