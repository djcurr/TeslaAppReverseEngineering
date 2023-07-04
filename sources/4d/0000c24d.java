package ya;

import android.graphics.drawable.Drawable;
import va.m;

/* loaded from: classes.dex */
public interface k<R> extends m {
    com.bumptech.glide.request.d getRequest();

    void getSize(j jVar);

    void onLoadCleared(Drawable drawable);

    void onLoadFailed(Drawable drawable);

    void onLoadStarted(Drawable drawable);

    void onResourceReady(R r11, za.b<? super R> bVar);

    void removeCallback(j jVar);

    void setRequest(com.bumptech.glide.request.d dVar);
}