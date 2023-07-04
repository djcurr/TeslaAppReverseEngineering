package expo.modules.interfaces.imageloader;

import android.graphics.Bitmap;
import java.util.concurrent.Future;

/* loaded from: classes5.dex */
public interface ImageLoaderInterface {

    /* loaded from: classes5.dex */
    public interface ResultListener {
        void onFailure(Throwable th2);

        void onSuccess(Bitmap bitmap);
    }

    Future<Bitmap> loadImageForDisplayFromURL(String str);

    void loadImageForDisplayFromURL(String str, ResultListener resultListener);

    Future<Bitmap> loadImageForManipulationFromURL(String str);

    void loadImageForManipulationFromURL(String str, ResultListener resultListener);
}