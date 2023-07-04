package atd.a;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.widget.ImageView;
import atd.a.i;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class h extends atd.a.a {

    /* renamed from: d  reason: collision with root package name */
    public static final h f6745d = new h();

    /* renamed from: e  reason: collision with root package name */
    private static final Executor f6746e = Executors.newFixedThreadPool(2);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Uri f6747a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ WeakReference f6748b;

        /* renamed from: atd.a.h$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class RunnableC0121a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ ImageView f6750a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Bitmap f6751b;

            RunnableC0121a(a aVar, ImageView imageView, Bitmap bitmap) {
                this.f6750a = imageView;
                this.f6751b = bitmap;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f6750a.setImageBitmap(this.f6751b);
            }
        }

        a(Uri uri, WeakReference weakReference) {
            this.f6747a = uri;
            this.f6748b = weakReference;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                byte[] a11 = h.this.a(new i.a().a(this.f6747a.toString()).b().a()).a();
                ImageView imageView = (ImageView) this.f6748b.get();
                if (imageView == null || !imageView.getTag().equals(this.f6747a)) {
                    return;
                }
                imageView.post(new RunnableC0121a(this, imageView, BitmapFactory.decodeByteArray(a11, 0, a11.length)));
            } catch (IOException unused) {
            }
        }
    }

    private h() {
    }

    public void a(ImageView imageView, atd.d.g gVar) {
        if (imageView == null || gVar == null) {
            return;
        }
        int i11 = Resources.getSystem().getDisplayMetrics().densityDpi;
        if (i11 > 320) {
            a(imageView, gVar.a(), gVar.b(), gVar.c());
        } else if (i11 > 240) {
            a(imageView, gVar.b(), gVar.c(), gVar.a());
        } else {
            a(imageView, gVar.c(), gVar.b(), gVar.a());
        }
    }

    @Override // atd.a.a
    protected int b() {
        return atd.a.a.f6733c;
    }

    @Override // atd.a.a
    protected int a() {
        return atd.a.a.f6732b;
    }

    private void a(ImageView imageView, Uri... uriArr) {
        for (Uri uri : uriArr) {
            if (uri != null) {
                a(new WeakReference<>(imageView), uri);
                return;
            }
        }
    }

    private void a(WeakReference<ImageView> weakReference, Uri uri) {
        try {
            weakReference.get().setTag(uri);
            f6746e.execute(new a(uri, weakReference));
        } catch (NullPointerException unused) {
        }
    }
}