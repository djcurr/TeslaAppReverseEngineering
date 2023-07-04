package firebase.common;

import android.app.Activity;
import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000  2\u00020\u00012\u00020\u0002:\u0001!B\u0019\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u001e\u0010\u001fJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u0016\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0002\u0018\u00010\bH\u0016R\u0016\u0010\n\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u000f\u001a\u00020\f8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0013\u001a\u00020\u00108F@\u0006¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0017\u001a\u00020\u00148V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00188V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\""}, d2 = {"Lfirebase/common/ReactNativeFirebaseModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "", "Lvz/b0;", "initialize", "onCatalystInstanceDestroy", "", "getName", "", "getConstants", "moduleName", "Ljava/lang/String;", "Lcom/facebook/react/bridge/ReactContext;", "getContext", "()Lcom/facebook/react/bridge/ReactContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "Ljava/util/concurrent/ExecutorService;", "getExecutor", "()Ljava/util/concurrent/ExecutorService;", "executor", "Landroid/content/Context;", "getApplicationContext", "()Landroid/content/Context;", "applicationContext", "Landroid/app/Activity;", "getActivity", "()Landroid/app/Activity;", "activity", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/lang/String;)V", "Companion", "a", "app_prodGlobalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public class ReactNativeFirebaseModule extends ReactContextBaseJavaModule {
    public static final a Companion = new a(null);
    private static final Map<String, ExecutorService> executors = new HashMap();
    private final String moduleName;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(Promise promise, Exception exc) {
            s.g(promise, "promise");
            cx.a aVar = cx.a.f23164a;
            s.e(exc);
            promise.reject(exc, aVar.a(exc));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReactNativeFirebaseModule(ReactApplicationContext reactApplicationContext, String moduleName) {
        super(reactApplicationContext);
        s.g(moduleName, "moduleName");
        this.moduleName = moduleName;
    }

    public Activity getActivity() {
        return getCurrentActivity();
    }

    public Context getApplicationContext() {
        Context applicationContext = getReactApplicationContext().getApplicationContext();
        s.f(applicationContext, "reactApplicationContext.applicationContext");
        return applicationContext;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        return new HashMap();
    }

    public ReactContext getContext() {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        s.f(reactApplicationContext, "reactApplicationContext");
        return reactApplicationContext;
    }

    public final ExecutorService getExecutor() {
        Map<String, ExecutorService> map = executors;
        ExecutorService executorService = map.get(getName());
        if (executorService == null) {
            ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
            String name = getName();
            s.f(newSingleThreadExecutor, "newSingleThreadExecutor");
            map.put(name, newSingleThreadExecutor);
            return newSingleThreadExecutor;
        }
        return executorService;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        String str = this.moduleName;
        return "Firebase" + str;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        super.initialize();
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        Map<String, ExecutorService> map = executors;
        ExecutorService executorService = map.get(getName());
        if (executorService != null) {
            executorService.shutdownNow();
        }
        map.remove(getName());
    }
}