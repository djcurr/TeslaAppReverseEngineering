package expo.modules.imageloader;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import be.c;
import ch.qos.logback.core.CoreConstants;
import com.bumptech.glide.j;
import com.facebook.imagepipeline.datasource.b;
import com.facebook.imagepipeline.request.a;
import expo.modules.core.interfaces.InternalModule;
import expo.modules.interfaces.imageloader.ImageLoaderInterface;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import kotlin.text.v;
import kotlin.text.w;
import wz.u;
import ya.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0014\u0010\b\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0007\u0018\u00010\u0006H\u0016J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0018\u0010\u000b\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\fH\u0016J\u0018\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0001\u0010\u0004\u001a\u00020\u0003H\u0016J\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\fH\u0016R\u0019\u0010\u0011\u001a\u00020\u00108\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lexpo/modules/imageloader/ImageLoaderModule;", "Lexpo/modules/core/interfaces/InternalModule;", "Lexpo/modules/interfaces/imageloader/ImageLoaderInterface;", "", "url", "normalizeAssetsUrl", "", "Ljava/lang/Class;", "getExportedInterfaces", "Ljava/util/concurrent/Future;", "Landroid/graphics/Bitmap;", "loadImageForDisplayFromURL", "Lexpo/modules/interfaces/imageloader/ImageLoaderInterface$ResultListener;", "resultListener", "Lvz/b0;", "loadImageForManipulationFromURL", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "expo-image-loader_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public final class ImageLoaderModule implements InternalModule, ImageLoaderInterface {
    private final Context context;

    public ImageLoaderModule(Context context) {
        s.g(context, "context");
        this.context = context;
    }

    private final String normalizeAssetsUrl(String str) {
        boolean H;
        List E0;
        H = v.H(str, "asset:///", false, 2, null);
        if (H) {
            E0 = w.E0(str, new String[]{"/"}, false, 0, 6, null);
            Object n02 = u.n0(E0);
            return "file:///android_asset/" + n02;
        }
        return str;
    }

    public final Context getContext() {
        return this.context;
    }

    @Override // expo.modules.core.interfaces.InternalModule
    public List<Class<?>> getExportedInterfaces() {
        List<Class<?>> d11;
        d11 = wz.v.d(ImageLoaderInterface.class);
        return d11;
    }

    @Override // expo.modules.interfaces.imageloader.ImageLoaderInterface
    public Future<Bitmap> loadImageForDisplayFromURL(String url) {
        s.g(url, "url");
        final SimpleSettableFuture simpleSettableFuture = new SimpleSettableFuture();
        loadImageForDisplayFromURL(url, new ImageLoaderInterface.ResultListener() { // from class: expo.modules.imageloader.ImageLoaderModule$loadImageForDisplayFromURL$1
            @Override // expo.modules.interfaces.imageloader.ImageLoaderInterface.ResultListener
            public void onFailure(Throwable th2) {
                simpleSettableFuture.setException(new ExecutionException(th2));
            }

            @Override // expo.modules.interfaces.imageloader.ImageLoaderInterface.ResultListener
            public void onSuccess(Bitmap bitmap) {
                s.g(bitmap, "bitmap");
                simpleSettableFuture.set(bitmap);
            }
        });
        return simpleSettableFuture;
    }

    @Override // expo.modules.interfaces.imageloader.ImageLoaderInterface
    public Future<Bitmap> loadImageForManipulationFromURL(String url) {
        s.g(url, "url");
        final SimpleSettableFuture simpleSettableFuture = new SimpleSettableFuture();
        loadImageForManipulationFromURL(url, new ImageLoaderInterface.ResultListener() { // from class: expo.modules.imageloader.ImageLoaderModule$loadImageForManipulationFromURL$1
            @Override // expo.modules.interfaces.imageloader.ImageLoaderInterface.ResultListener
            public void onFailure(Throwable th2) {
                simpleSettableFuture.setException(new ExecutionException(th2));
            }

            @Override // expo.modules.interfaces.imageloader.ImageLoaderInterface.ResultListener
            public void onSuccess(Bitmap bitmap) {
                s.g(bitmap, "bitmap");
                simpleSettableFuture.set(bitmap);
            }
        });
        return simpleSettableFuture;
    }

    @Override // expo.modules.interfaces.imageloader.ImageLoaderInterface
    public void loadImageForDisplayFromURL(String url, final ImageLoaderInterface.ResultListener resultListener) {
        s.g(url, "url");
        s.g(resultListener, "resultListener");
        c.a().d(a.b(url), this.context).d(new b() { // from class: expo.modules.imageloader.ImageLoaderModule$loadImageForDisplayFromURL$2
            @Override // com.facebook.datasource.b
            protected void onFailureImpl(com.facebook.datasource.c<qd.a<nf.c>> dataSource) {
                s.g(dataSource, "dataSource");
                ImageLoaderInterface.ResultListener.this.onFailure(dataSource.c());
            }

            @Override // com.facebook.imagepipeline.datasource.b
            protected void onNewResultImpl(Bitmap bitmap) {
                if (bitmap == null) {
                    ImageLoaderInterface.ResultListener.this.onFailure(new Exception("Loaded bitmap is null"));
                } else {
                    ImageLoaderInterface.ResultListener.this.onSuccess(bitmap);
                }
            }
        }, AsyncTask.THREAD_POOL_EXECUTOR);
    }

    @Override // expo.modules.interfaces.imageloader.ImageLoaderInterface
    public void loadImageForManipulationFromURL(String url, final ImageLoaderInterface.ResultListener resultListener) {
        s.g(url, "url");
        s.g(resultListener, "resultListener");
        com.bumptech.glide.c.C(this.context).asBitmap().diskCacheStrategy(ja.a.f33305a).skipMemoryCache(true).mo100load(normalizeAssetsUrl(url)).into((j) new i<Bitmap>() { // from class: expo.modules.imageloader.ImageLoaderModule$loadImageForManipulationFromURL$2
            @Override // ya.a, ya.k
            public void onLoadFailed(Drawable drawable) {
                ImageLoaderInterface.ResultListener.this.onFailure(new Exception("Loading bitmap failed"));
            }

            @Override // ya.k
            public /* bridge */ /* synthetic */ void onResourceReady(Object obj, za.b bVar) {
                onResourceReady((Bitmap) obj, (za.b<? super Bitmap>) bVar);
            }

            public void onResourceReady(Bitmap resource, za.b<? super Bitmap> bVar) {
                s.g(resource, "resource");
                ImageLoaderInterface.ResultListener.this.onSuccess(resource);
            }
        });
    }
}