package ya;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* loaded from: classes.dex */
public final class h<Z> extends c<Z> {

    /* renamed from: e  reason: collision with root package name */
    private static final Handler f59416e = new Handler(Looper.getMainLooper(), new a());

    /* renamed from: d  reason: collision with root package name */
    private final com.bumptech.glide.k f59417d;

    /* loaded from: classes.dex */
    class a implements Handler.Callback {
        a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what == 1) {
                ((h) message.obj).a();
                return true;
            }
            return false;
        }
    }

    private h(com.bumptech.glide.k kVar, int i11, int i12) {
        super(i11, i12);
        this.f59417d = kVar;
    }

    public static <Z> h<Z> b(com.bumptech.glide.k kVar, int i11, int i12) {
        return new h<>(kVar, i11, i12);
    }

    void a() {
        this.f59417d.clear(this);
    }

    @Override // ya.k
    public void onLoadCleared(Drawable drawable) {
    }

    @Override // ya.k
    public void onResourceReady(Z z11, za.b<? super Z> bVar) {
        f59416e.obtainMessage(1, this).sendToTarget();
    }
}