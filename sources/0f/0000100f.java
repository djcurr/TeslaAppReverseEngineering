package cg;

import android.text.Spannable;
import android.view.View;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.RetryableMountingLayerException;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.mapbuffer.ReadableMapBuffer;
import com.facebook.react.fabric.events.EventEmitterWrapper;
import com.facebook.react.uimanager.RootViewManager;
import com.facebook.react.uimanager.d1;
import com.facebook.react.uimanager.n0;
import com.facebook.react.views.text.d0;
import com.facebook.react.views.text.t;
import com.facebook.yoga.n;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public class c {

    /* renamed from: i */
    public static final String f9084i = "c";

    /* renamed from: c */
    private d f9087c;

    /* renamed from: d */
    private d f9088d;

    /* renamed from: f */
    private final d1 f9090f;

    /* renamed from: g */
    private final b f9091g;

    /* renamed from: a */
    private final ConcurrentHashMap<Integer, d> f9085a = new ConcurrentHashMap<>();

    /* renamed from: b */
    private final CopyOnWriteArrayList<Integer> f9086b = new CopyOnWriteArrayList<>();

    /* renamed from: e */
    private final mg.a f9089e = new mg.a();

    /* renamed from: h */
    private final RootViewManager f9092h = new RootViewManager();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements t {
        a(c cVar) {
        }

        @Override // com.facebook.react.views.text.t
        public void a(Spannable spannable) {
        }
    }

    /* loaded from: classes3.dex */
    public interface b {
        void a(Queue<dg.d> queue);
    }

    public c(d1 d1Var, b bVar) {
        this.f9090f = d1Var;
        this.f9091g = bVar;
    }

    public void a(int i11, View view, n0 n0Var) {
        d e11 = e(i11, "attachView");
        if (e11.C()) {
            ReactSoftExceptionLogger.logSoftException(f9084i, new IllegalStateException("Trying to attach a view to a stopped surface"));
        } else {
            e11.n(view, n0Var);
        }
    }

    public void b() {
        this.f9089e.b();
    }

    public EventEmitterWrapper c(int i11, int i12) {
        d f11 = i11 == -1 ? f(i12) : d(i11);
        if (f11 == null) {
            return null;
        }
        return f11.u(i12);
    }

    public d d(int i11) {
        d dVar = this.f9088d;
        if (dVar != null && dVar.w() == i11) {
            return this.f9088d;
        }
        d dVar2 = this.f9087c;
        if (dVar2 != null && dVar2.w() == i11) {
            return this.f9087c;
        }
        d dVar3 = this.f9085a.get(Integer.valueOf(i11));
        this.f9088d = dVar3;
        return dVar3;
    }

    public d e(int i11, String str) {
        d d11 = d(i11);
        if (d11 != null) {
            return d11;
        }
        throw new RetryableMountingLayerException("Unable to find SurfaceMountingManager for surfaceId: [" + i11 + "]. Context: " + str);
    }

    public d f(int i11) {
        d dVar = this.f9087c;
        if (dVar != null && dVar.y(i11)) {
            return this.f9087c;
        }
        for (Map.Entry<Integer, d> entry : this.f9085a.entrySet()) {
            d value = entry.getValue();
            if (value != this.f9087c && value.y(i11)) {
                if (this.f9087c == null) {
                    this.f9087c = value;
                }
                return value;
            }
        }
        return null;
    }

    public d g(int i11) {
        d f11 = f(i11);
        if (f11 != null) {
            return f11;
        }
        throw new RetryableMountingLayerException("Unable to find SurfaceMountingManager for tag: [" + i11 + "]");
    }

    public boolean h(int i11) {
        return f(i11) != null;
    }

    public void i(String str) {
        this.f9090f.a(str);
    }

    public boolean j(int i11) {
        d d11 = d(i11);
        if (d11 == null || d11.C()) {
            return false;
        }
        return !d11.B();
    }

    public long k(ReactContext reactContext, String str, ReadableMap readableMap, ReadableMap readableMap2, ReadableMap readableMap3, float f11, n nVar, float f12, n nVar2, float[] fArr) {
        return this.f9090f.a(str).measure(reactContext, readableMap, readableMap2, readableMap3, f11, nVar, f12, nVar2, fArr);
    }

    public long l(ReactContext reactContext, String str, ReadableMapBuffer readableMapBuffer, ReadableMapBuffer readableMapBuffer2, float f11, n nVar, float f12, n nVar2, float[] fArr) {
        return d0.g(reactContext, readableMapBuffer, readableMapBuffer2, f11, nVar, f12, nVar2, new a(this), fArr);
    }

    @Deprecated
    public void m(int i11, int i12, int i13, ReadableArray readableArray) {
        UiThreadUtil.assertOnUiThread();
        e(i11, "receiveCommand:int").H(i12, i13, readableArray);
    }

    public void n(int i11, int i12, String str, ReadableArray readableArray) {
        UiThreadUtil.assertOnUiThread();
        e(i11, "receiveCommand:string").I(i12, str, readableArray);
    }

    public void o(int i11, int i12, int i13) {
        UiThreadUtil.assertOnUiThread();
        if (i11 == -1) {
            g(i12).K(i12, i13);
        } else {
            e(i11, "sendAccessibilityEvent").K(i12, i13);
        }
    }

    public d p(int i11, n0 n0Var, View view) {
        d dVar = new d(i11, this.f9089e, this.f9090f, this.f9092h, this.f9091g, n0Var);
        this.f9085a.putIfAbsent(Integer.valueOf(i11), dVar);
        if (this.f9085a.get(Integer.valueOf(i11)) != dVar) {
            String str = f9084i;
            ReactSoftExceptionLogger.logSoftException(str, new IllegalStateException("Called startSurface more than once for the SurfaceId [" + i11 + "]"));
        }
        this.f9087c = this.f9085a.get(Integer.valueOf(i11));
        if (view != null) {
            dVar.n(view, n0Var);
        }
        return dVar;
    }

    public void q(int i11) {
        d dVar = this.f9085a.get(Integer.valueOf(i11));
        if (dVar != null) {
            while (this.f9086b.size() >= 15) {
                Integer num = this.f9086b.get(0);
                this.f9085a.remove(Integer.valueOf(num.intValue()));
                this.f9086b.remove(num);
                nd.a.c(f9084i, "Removing stale SurfaceMountingManager: [%d]", Integer.valueOf(num.intValue()));
            }
            this.f9086b.add(Integer.valueOf(i11));
            dVar.M();
            if (dVar == this.f9087c) {
                this.f9087c = null;
                return;
            }
            return;
        }
        String str = f9084i;
        ReactSoftExceptionLogger.logSoftException(str, new IllegalStateException("Cannot call stopSurface on non-existent surface: [" + i11 + "]"));
    }

    public boolean r(int i11) {
        if (this.f9086b.contains(Integer.valueOf(i11))) {
            return true;
        }
        d d11 = d(i11);
        return d11 != null && d11.C();
    }

    public void s(int i11, ReadableMap readableMap) {
        UiThreadUtil.assertOnUiThread();
        if (readableMap == null) {
            return;
        }
        g(i11).R(i11, readableMap);
    }
}