package v5;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import okio.e0;
import okio.l;
import vz.q;
import wz.p;

/* loaded from: classes.dex */
public final class a implements f {

    /* renamed from: c  reason: collision with root package name */
    private static final String[] f54055c;

    /* renamed from: a  reason: collision with root package name */
    private final Paint f54056a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f54057b;

    /* renamed from: v5.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C1213a {
        private C1213a() {
        }

        public /* synthetic */ C1213a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class b extends l {

        /* renamed from: a  reason: collision with root package name */
        private Exception f54058a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(e0 delegate) {
            super(delegate);
            s.g(delegate, "delegate");
        }

        public final Exception a() {
            return this.f54058a;
        }

        @Override // okio.l, okio.e0
        public long read(okio.f sink, long j11) {
            s.g(sink, "sink");
            try {
                return super.read(sink, j11);
            } catch (Exception e11) {
                this.f54058a = e11;
                throw e11;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class c extends InputStream {

        /* renamed from: a  reason: collision with root package name */
        private final InputStream f54059a;

        public c(InputStream delegate) {
            s.g(delegate, "delegate");
            this.f54059a = delegate;
        }

        @Override // java.io.InputStream
        public int available() {
            return 1073741824;
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f54059a.close();
        }

        @Override // java.io.InputStream
        public void mark(int i11) {
            this.f54059a.mark(i11);
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return this.f54059a.markSupported();
        }

        @Override // java.io.InputStream
        public int read() {
            return this.f54059a.read();
        }

        @Override // java.io.InputStream
        public void reset() {
            this.f54059a.reset();
        }

        @Override // java.io.InputStream
        public long skip(long j11) {
            return this.f54059a.skip(j11);
        }

        @Override // java.io.InputStream
        public int read(byte[] b11) {
            s.g(b11, "b");
            return this.f54059a.read(b11);
        }

        @Override // java.io.InputStream
        public int read(byte[] b11, int i11, int i12) {
            s.g(b11, "b");
            return this.f54059a.read(b11, i11, i12);
        }
    }

    static {
        new C1213a(null);
        f54055c = new String[]{"image/jpeg", "image/webp", "image/heic", "image/heif"};
    }

    public a(Context context) {
        s.g(context, "context");
        this.f54057b = context;
        this.f54056a = new Paint(3);
    }

    private final Bitmap d(t5.b bVar, Bitmap bitmap, Bitmap.Config config, boolean z11, int i11) {
        Bitmap c11;
        boolean z12 = i11 > 0;
        if (z11 || z12) {
            Matrix matrix = new Matrix();
            float width = bitmap.getWidth() / 2.0f;
            float height = bitmap.getHeight() / 2.0f;
            if (z11) {
                matrix.postScale(-1.0f, 1.0f, width, height);
            }
            if (z12) {
                matrix.postRotate(i11, width, height);
            }
            RectF rectF = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, bitmap.getWidth(), bitmap.getHeight());
            matrix.mapRect(rectF);
            float f11 = rectF.left;
            if (f11 != BitmapDescriptorFactory.HUE_RED || rectF.top != BitmapDescriptorFactory.HUE_RED) {
                matrix.postTranslate(-f11, -rectF.top);
            }
            if (i11 != 90 && i11 != 270) {
                c11 = bVar.c(bitmap.getWidth(), bitmap.getHeight(), config);
            } else {
                c11 = bVar.c(bitmap.getHeight(), bitmap.getWidth(), config);
            }
            new Canvas(c11).drawBitmap(bitmap, matrix, this.f54056a);
            bVar.b(bitmap);
            return c11;
        }
        return bitmap;
    }

    private final Bitmap.Config e(BitmapFactory.Options options, j jVar, boolean z11, int i11) {
        Bitmap.Config d11 = jVar.d();
        if (z11 || i11 > 0) {
            d11 = g6.a.e(d11);
        }
        if (jVar.b() && d11 == Bitmap.Config.ARGB_8888 && s.c(options.outMimeType, "image/jpeg")) {
            d11 = Bitmap.Config.RGB_565;
        }
        return (Build.VERSION.SDK_INT < 26 || options.outConfig != Bitmap.Config.RGBA_F16 || d11 == Bitmap.Config.HARDWARE) ? d11 : Bitmap.Config.RGBA_F16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(17:3|(1:5)(1:132)|6|(1:131)(1:10)|(1:12)(1:130)|(1:14)(1:129)|15|(1:19)|20|(1:22)(1:128)|23|(1:127)(2:27|(3:29|(1:31)|32)(8:101|(1:103)|104|(1:106)(1:126)|107|(2:109|(1:111)(1:112))|113|(3:115|(2:121|(1:123)(1:124))(1:119)|120)(1:125)))|33|(4:(3:(4:(3:35|36|(7:38|39|40|41|42|43|(1:(4:46|(1:54)(1:50)|51|52)(2:55|56))(3:57|58|59)))|42|43|(0)(0))|40|41)|91|92|93)|88|89|90) */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01fc, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01fd, code lost:
        r4 = false;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0211 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01eb  */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r4v35 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final v5.c f(t5.b r26, okio.e0 r27, c6.g r28, v5.j r29) {
        /*
            Method dump skipped, instructions count: 537
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v5.a.f(t5.b, okio.e0, c6.g, v5.j):v5.c");
    }

    private final boolean g(String str) {
        boolean D;
        if (str != null) {
            D = p.D(f54055c, str);
            if (D) {
                return true;
            }
        }
        return false;
    }

    @Override // v5.f
    public Object a(t5.b bVar, okio.h hVar, c6.g gVar, j jVar, zz.d<? super v5.c> dVar) {
        zz.d c11;
        Object d11;
        c11 = a00.c.c(dVar);
        v20.p pVar = new v20.p(c11, 1);
        pVar.y();
        try {
            i iVar = new i(pVar, hVar);
            v5.c f11 = f(bVar, iVar, gVar, jVar);
            q.a aVar = q.f54772b;
            pVar.resumeWith(q.b(f11));
            iVar.a();
            Object s11 = pVar.s();
            d11 = a00.d.d();
            if (s11 == d11) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
            return s11;
        } catch (Exception e11) {
            if (!(e11 instanceof InterruptedException) && !(e11 instanceof InterruptedIOException)) {
                throw e11;
            }
            Throwable initCause = new CancellationException("Blocking call was interrupted due to parent cancellation.").initCause(e11);
            s.f(initCause, "CancellationException(\"B…n.\").initCause(exception)");
            throw initCause;
        }
    }

    @Override // v5.f
    public boolean b(okio.h source, String str) {
        s.g(source, "source");
        return true;
    }
}