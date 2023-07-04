package g6;

import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.view.View;
import android.widget.ImageView;
import b6.h;
import java.io.Closeable;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s;
import okhttp3.Call;
import okhttp3.Headers;
import okhttp3.Request;
import wz.u;
import z5.t;
import z5.v;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private static final Headers f27794a = new Headers.Builder().build();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a implements Call.Factory {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ vz.k f27795a;

        a(vz.k kVar) {
            this.f27795a = kVar;
        }

        @Override // okhttp3.Call.Factory
        public final Call newCall(Request request) {
            return ((Call.Factory) this.f27795a.getValue()).newCall(request);
        }
    }

    public static final void a(Closeable closeQuietly) {
        s.g(closeQuietly, "$this$closeQuietly");
        try {
            closeQuietly.close();
        } catch (RuntimeException e11) {
            throw e11;
        } catch (Exception unused) {
        }
    }

    public static final String b(v5.b emoji) {
        s.g(emoji, "$this$emoji");
        int i11 = d.f27792a[emoji.ordinal()];
        if (i11 == 1 || i11 == 2) {
            return "🧠";
        }
        if (i11 != 3) {
            if (i11 == 4) {
                return "☁️ ";
            }
            throw new NoWhenBranchMatchedException();
        }
        return "💾";
    }

    public static final String c(Uri firstPathSegment) {
        s.g(firstPathSegment, "$this$firstPathSegment");
        List<String> pathSegments = firstPathSegment.getPathSegments();
        s.f(pathSegments, "pathSegments");
        return (String) u.d0(pathSegments);
    }

    public static final int d(Drawable height) {
        Bitmap bitmap;
        s.g(height, "$this$height");
        BitmapDrawable bitmapDrawable = (BitmapDrawable) (!(height instanceof BitmapDrawable) ? null : height);
        return (bitmapDrawable == null || (bitmap = bitmapDrawable.getBitmap()) == null) ? height.getIntrinsicHeight() : bitmap.getHeight();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0014 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String e(android.webkit.MimeTypeMap r3, java.lang.String r4) {
        /*
            java.lang.String r0 = "$this$getMimeTypeFromUrl"
            kotlin.jvm.internal.s.g(r3, r0)
            if (r4 == 0) goto L10
            boolean r0 = kotlin.text.m.w(r4)
            if (r0 == 0) goto Le
            goto L10
        Le:
            r0 = 0
            goto L11
        L10:
            r0 = 1
        L11:
            r1 = 0
            if (r0 == 0) goto L15
            return r1
        L15:
            r0 = 35
            r2 = 2
            java.lang.String r4 = kotlin.text.m.a1(r4, r0, r1, r2, r1)
            r0 = 63
            java.lang.String r4 = kotlin.text.m.a1(r4, r0, r1, r2, r1)
            r0 = 47
            java.lang.String r4 = kotlin.text.m.S0(r4, r0, r1, r2, r1)
            r0 = 46
            java.lang.String r1 = ""
            java.lang.String r4 = kotlin.text.m.Q0(r4, r0, r1)
            java.lang.String r3 = r3.getMimeTypeFromExtension(r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: g6.e.e(android.webkit.MimeTypeMap, java.lang.String):java.lang.String");
    }

    public static final int f(Configuration nightMode) {
        s.g(nightMode, "$this$nightMode");
        return nightMode.uiMode & 48;
    }

    public static final v g(View requestManager) {
        s.g(requestManager, "$this$requestManager");
        int i11 = s5.a.f50286a;
        Object tag = requestManager.getTag(i11);
        Object obj = null;
        if (!(tag instanceof v)) {
            tag = null;
        }
        View.OnAttachStateChangeListener onAttachStateChangeListener = (v) tag;
        if (onAttachStateChangeListener == null) {
            synchronized (requestManager) {
                Object tag2 = requestManager.getTag(i11);
                if (tag2 instanceof v) {
                    obj = tag2;
                }
                v vVar = (v) obj;
                if (vVar != null) {
                    onAttachStateChangeListener = vVar;
                } else {
                    onAttachStateChangeListener = new v();
                    requestManager.addOnAttachStateChangeListener(onAttachStateChangeListener);
                    requestManager.setTag(i11, onAttachStateChangeListener);
                }
            }
        }
        return onAttachStateChangeListener;
    }

    public static final c6.f h(ImageView scale) {
        int i11;
        s.g(scale, "$this$scale");
        ImageView.ScaleType scaleType = scale.getScaleType();
        if (scaleType == null || ((i11 = d.f27793b[scaleType.ordinal()]) != 1 && i11 != 2 && i11 != 3 && i11 != 4)) {
            return c6.f.FILL;
        }
        return c6.f.FIT;
    }

    public static final int i(Drawable width) {
        Bitmap bitmap;
        s.g(width, "$this$width");
        BitmapDrawable bitmapDrawable = (BitmapDrawable) (!(width instanceof BitmapDrawable) ? null : width);
        return (bitmapDrawable == null || (bitmap = bitmapDrawable.getBitmap()) == null) ? width.getIntrinsicWidth() : bitmap.getWidth();
    }

    public static final boolean j() {
        return s.c(Looper.myLooper(), Looper.getMainLooper());
    }

    public static final boolean k(Drawable isVector) {
        s.g(isVector, "$this$isVector");
        return (isVector instanceof androidx.vectordrawable.graphics.drawable.i) || (Build.VERSION.SDK_INT > 21 && (isVector instanceof VectorDrawable));
    }

    public static final Call.Factory l(h00.a<? extends Call.Factory> initializer) {
        vz.k a11;
        s.g(initializer, "initializer");
        a11 = vz.m.a(initializer);
        return new a(a11);
    }

    public static final b6.j m(b6.j jVar) {
        return jVar != null ? jVar : b6.j.f7499b;
    }

    public static final Headers n(Headers headers) {
        return headers != null ? headers : f27794a;
    }

    public static final void o(t metadata, h.a aVar) {
        View view;
        v g11;
        s.g(metadata, "$this$metadata");
        d6.b d11 = metadata.d();
        if (!(d11 instanceof d6.c)) {
            d11 = null;
        }
        d6.c cVar = (d6.c) d11;
        if (cVar == null || (view = cVar.getView()) == null || (g11 = g(view)) == null) {
            return;
        }
        g11.g(aVar);
    }
}