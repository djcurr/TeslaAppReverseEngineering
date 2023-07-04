package bg;

import android.app.Activity;
import android.view.View;
import com.facebook.react.bridge.NativeModuleCallExceptionHandler;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import yf.g;

/* loaded from: classes3.dex */
public interface d extends NativeModuleCallExceptionHandler {
    void a(boolean z11);

    String b();

    View c(String str);

    void d();

    boolean e();

    void f(boolean z11);

    g g(String str);

    Activity getCurrentActivity();

    void h();

    void i(boolean z11);

    String j();

    void k(View view);

    void l();

    void m();

    void n(String str, ReadableArray readableArray, int i11);

    void o(ReactContext reactContext);

    void p();

    void q(boolean z11);

    hg.a r();

    void s(String str, b bVar);

    void t(String str, c cVar);

    boolean u();

    void v();

    void w(ReactContext reactContext);

    void x(e eVar);
}