package expo.modules.adapters.react.apploader;

import android.content.Context;
import android.os.Handler;
import ch.qos.logback.core.CoreConstants;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.o;
import com.facebook.react.q;
import com.facebook.react.r;
import expo.modules.adapters.react.apploader.RNHeadlessAppLoader;
import expo.modules.apploader.HeadlessAppLoader;
import expo.modules.core.interfaces.Consumer;
import expo.modules.core.interfaces.DoNotStrip;
import java.util.Map;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.s;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J4\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0016J\u0012\u0010\u000f\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\u0012\u0010\u0010\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011¨\u0006\u0014"}, d2 = {"Lexpo/modules/adapters/react/apploader/RNHeadlessAppLoader;", "Lexpo/modules/apploader/HeadlessAppLoader;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lexpo/modules/apploader/HeadlessAppLoader$Params;", "params", "Ljava/lang/Runnable;", "alreadyRunning", "Lexpo/modules/core/interfaces/Consumer;", "", "callback", "Lvz/b0;", "loadApp", "", "appScopeKey", "invalidateApp", "isRunning", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "expo-modules-core_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class RNHeadlessAppLoader implements HeadlessAppLoader {
    private final Context context;

    @DoNotStrip
    public RNHeadlessAppLoader(Context context) {
        s.g(context, "context");
        this.context = context;
    }

    public static /* synthetic */ void a(r rVar, String str) {
        m591invalidateApp$lambda1(rVar, str);
    }

    public static /* synthetic */ void b(HeadlessAppLoader.Params params, Consumer consumer, ReactContext reactContext) {
        m592loadApp$lambda0(params, consumer, reactContext);
    }

    /* renamed from: invalidateApp$lambda-1 */
    public static final void m591invalidateApp$lambda1(r appRecord, String str) {
        Map map;
        s.g(appRecord, "$appRecord");
        if (appRecord.C() == LifecycleState.BEFORE_CREATE) {
            appRecord.x();
        }
        HeadlessAppLoaderNotifier.INSTANCE.notifyAppDestroyed(str);
        map = RNHeadlessAppLoaderKt.appRecords;
        map.remove(str);
    }

    /* renamed from: loadApp$lambda-0 */
    public static final void m592loadApp$lambda0(HeadlessAppLoader.Params params, Consumer consumer, ReactContext reactContext) {
        HeadlessAppLoaderNotifier.INSTANCE.notifyAppLoaded(params.getAppScopeKey());
        if (consumer == null) {
            return;
        }
        consumer.apply(Boolean.TRUE);
    }

    @Override // expo.modules.apploader.HeadlessAppLoader
    public boolean invalidateApp(final String str) {
        Map map;
        Map map2;
        Map map3;
        map = RNHeadlessAppLoaderKt.appRecords;
        if (map.containsKey(str)) {
            map2 = RNHeadlessAppLoaderKt.appRecords;
            if (map2.get(str) != null) {
                map3 = RNHeadlessAppLoaderKt.appRecords;
                Object obj = map3.get(str);
                s.e(obj);
                final r rVar = (r) obj;
                new Handler(this.context.getMainLooper()).post(new Runnable() { // from class: uw.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        RNHeadlessAppLoader.a(r.this, str);
                    }
                });
                return true;
            }
        }
        return false;
    }

    @Override // expo.modules.apploader.HeadlessAppLoader
    public boolean isRunning(String str) {
        Map map;
        Map map2;
        map = RNHeadlessAppLoaderKt.appRecords;
        if (map.containsKey(str)) {
            map2 = RNHeadlessAppLoaderKt.appRecords;
            Object obj = map2.get(str);
            s.e(obj);
            if (((r) obj).G()) {
                return true;
            }
        }
        return false;
    }

    @Override // expo.modules.apploader.HeadlessAppLoader
    public void loadApp(Context context, final HeadlessAppLoader.Params params, Runnable runnable, final Consumer<Boolean> consumer) {
        Map map;
        Map map2;
        s.g(context, "context");
        if (params != null && params.getAppScopeKey() != null) {
            if (context.getApplicationContext() instanceof o) {
                Context applicationContext = context.getApplicationContext();
                Objects.requireNonNull(applicationContext, "null cannot be cast to non-null type com.facebook.react.ReactApplication");
                r reactInstanceManager = ((o) applicationContext).c().getReactInstanceManager();
                map = RNHeadlessAppLoaderKt.appRecords;
                if (map.containsKey(params.getAppScopeKey())) {
                    if (runnable == null) {
                        return;
                    }
                    runnable.run();
                    return;
                }
                reactInstanceManager.o(new q() { // from class: uw.a
                    @Override // com.facebook.react.q
                    public final void a(ReactContext reactContext) {
                        RNHeadlessAppLoader.b(HeadlessAppLoader.Params.this, consumer, reactContext);
                    }
                });
                map2 = RNHeadlessAppLoaderKt.appRecords;
                String appScopeKey = params.getAppScopeKey();
                s.f(appScopeKey, "params.appScopeKey");
                s.f(reactInstanceManager, "reactInstanceManager");
                map2.put(appScopeKey, reactInstanceManager);
                if (reactInstanceManager.G()) {
                    reactInstanceManager.c0();
                    return;
                } else {
                    reactInstanceManager.v();
                    return;
                }
            }
            throw new IllegalStateException("Your application must implement ReactApplication");
        }
        throw new IllegalArgumentException("Params must be set with appScopeKey!");
    }
}