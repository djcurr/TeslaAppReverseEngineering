package ya;

import android.graphics.drawable.Drawable;

@Deprecated
/* loaded from: classes.dex */
public abstract class a<Z> implements k<Z> {
    private com.bumptech.glide.request.d request;

    @Override // ya.k
    public com.bumptech.glide.request.d getRequest() {
        return this.request;
    }

    @Override // va.m
    public void onDestroy() {
    }

    @Override // ya.k
    public void onLoadCleared(Drawable drawable) {
    }

    @Override // ya.k
    public void onLoadFailed(Drawable drawable) {
    }

    @Override // ya.k
    public void onLoadStarted(Drawable drawable) {
    }

    @Override // va.m
    public void onStart() {
    }

    @Override // va.m
    public void onStop() {
    }

    @Override // ya.k
    public void setRequest(com.bumptech.glide.request.d dVar) {
        this.request = dVar;
    }
}