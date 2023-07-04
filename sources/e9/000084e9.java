package lw;

import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactContext;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import lw.b;

/* loaded from: classes6.dex */
public class g implements b {

    /* renamed from: a  reason: collision with root package name */
    private ReactContext f37760a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f37761b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f37762c;

    /* renamed from: d  reason: collision with root package name */
    private final Set<b.a> f37763d = new CopyOnWriteArraySet();

    /* loaded from: classes6.dex */
    class a implements LifecycleEventListener {
        a() {
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostDestroy() {
            g.this.j();
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostPause() {
            g.this.j();
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostResume() {
            g.this.k();
        }
    }

    public g() {
        com.tesla.logging.g.g("ReactNativeNotifs");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void j() {
        if (this.f37761b) {
            this.f37761b = false;
            for (b.a aVar : this.f37763d) {
                aVar.b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void k() {
        if (!this.f37761b) {
            this.f37761b = true;
            for (b.a aVar : this.f37763d) {
                aVar.a();
            }
        }
    }

    @Override // lw.b
    public synchronized boolean a() {
        ReactContext reactContext = this.f37760a;
        if (reactContext == null) {
            return false;
        }
        return reactContext.hasActiveCatalystInstance();
    }

    @Override // lw.b
    public boolean b() {
        return this.f37762c;
    }

    @Override // lw.b
    public void c(b.a aVar) {
        this.f37763d.remove(aVar);
    }

    @Override // lw.b
    public ReactContext d() {
        ReactContext reactContext = this.f37760a;
        if (reactContext == null) {
            return null;
        }
        return reactContext;
    }

    @Override // lw.b
    public void e(b.a aVar) {
        this.f37763d.add(aVar);
    }

    @Override // lw.b
    public boolean f() {
        return this.f37761b;
    }

    public void i(ReactContext reactContext) {
        this.f37760a = reactContext;
        reactContext.addLifecycleEventListener(new a());
    }
}