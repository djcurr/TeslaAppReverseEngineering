package ya;

import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public abstract class c<T> implements k<T> {

    /* renamed from: a  reason: collision with root package name */
    private final int f59400a;

    /* renamed from: b  reason: collision with root package name */
    private final int f59401b;

    /* renamed from: c  reason: collision with root package name */
    private com.bumptech.glide.request.d f59402c;

    public c() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Override // ya.k
    public final com.bumptech.glide.request.d getRequest() {
        return this.f59402c;
    }

    @Override // ya.k
    public final void getSize(j jVar) {
        jVar.e(this.f59400a, this.f59401b);
    }

    @Override // va.m
    public void onDestroy() {
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
    public final void removeCallback(j jVar) {
    }

    @Override // ya.k
    public final void setRequest(com.bumptech.glide.request.d dVar) {
        this.f59402c = dVar;
    }

    public c(int i11, int i12) {
        if (bb.k.t(i11, i12)) {
            this.f59400a = i11;
            this.f59401b = i12;
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + i11 + " and height: " + i12);
    }
}