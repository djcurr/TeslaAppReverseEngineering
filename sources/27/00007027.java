package g6;

import a6.b;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import vz.b0;

/* loaded from: classes.dex */
public final class l implements ComponentCallbacks2, b.InterfaceC0011b {

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference<r5.f> f27799a;

    /* renamed from: b  reason: collision with root package name */
    private final a6.b f27800b;

    /* renamed from: c  reason: collision with root package name */
    private volatile boolean f27801c;

    /* renamed from: d  reason: collision with root package name */
    private final AtomicBoolean f27802d;

    /* renamed from: e  reason: collision with root package name */
    private final Context f27803e;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new a(null);
    }

    public l(r5.f imageLoader, Context context) {
        s.g(imageLoader, "imageLoader");
        s.g(context, "context");
        this.f27803e = context;
        this.f27799a = new WeakReference<>(imageLoader);
        a6.b a11 = a6.b.f279a.a(context, this, imageLoader.i());
        this.f27800b = a11;
        this.f27801c = a11.a();
        this.f27802d = new AtomicBoolean(false);
        context.registerComponentCallbacks(this);
    }

    @Override // a6.b.InterfaceC0011b
    public void a(boolean z11) {
        r5.f fVar = this.f27799a.get();
        if (fVar == null) {
            c();
            return;
        }
        this.f27801c = z11;
        k i11 = fVar.i();
        if (i11 == null || i11.getLevel() > 4) {
            return;
        }
        i11.a("NetworkObserver", 4, z11 ? "ONLINE" : "OFFLINE", null);
    }

    public final boolean b() {
        return this.f27801c;
    }

    public final void c() {
        if (this.f27802d.getAndSet(true)) {
            return;
        }
        this.f27803e.unregisterComponentCallbacks(this);
        this.f27800b.shutdown();
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        s.g(newConfig, "newConfig");
        if (this.f27799a.get() != null) {
            return;
        }
        c();
        b0 b0Var = b0.f54756a;
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        onTrimMemory(80);
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i11) {
        r5.f fVar = this.f27799a.get();
        if (fVar != null) {
            fVar.k(i11);
        } else {
            c();
        }
    }
}