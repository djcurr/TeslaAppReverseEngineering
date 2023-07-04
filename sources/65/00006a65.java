package expo.modules.kotlin;

import android.app.Activity;
import android.content.Intent;
import com.adyen.checkout.components.status.model.StatusResponse;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.LifecycleEventListener;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.s;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0012¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J*\u0010\u000e\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\u0012\u0010\u0010\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\fH\u0016R$\u0010\u0014\u001a\u0010\u0012\f\u0012\n \u0013*\u0004\u0018\u00010\u00120\u00120\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lexpo/modules/kotlin/ReactLifecycleDelegate;", "Lcom/facebook/react/bridge/LifecycleEventListener;", "Lcom/facebook/react/bridge/ActivityEventListener;", "Lvz/b0;", "onHostResume", "onHostPause", "onHostDestroy", "Landroid/app/Activity;", "activity", "", "requestCode", StatusResponse.RESULT_CODE, "Landroid/content/Intent;", MessageExtension.FIELD_DATA, "onActivityResult", "intent", "onNewIntent", "Ljava/lang/ref/WeakReference;", "Lexpo/modules/kotlin/AppContext;", "kotlin.jvm.PlatformType", "appContextHolder", "Ljava/lang/ref/WeakReference;", "appContext", "<init>", "(Lexpo/modules/kotlin/AppContext;)V", "expo-modules-core_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public final class ReactLifecycleDelegate implements LifecycleEventListener, ActivityEventListener {
    private final WeakReference<AppContext> appContextHolder;

    public ReactLifecycleDelegate(AppContext appContext) {
        s.g(appContext, "appContext");
        this.appContextHolder = new WeakReference<>(appContext);
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onActivityResult(Activity activity, int i11, int i12, Intent intent) {
        s.g(activity, "activity");
        AppContext appContext = this.appContextHolder.get();
        if (appContext == null) {
            return;
        }
        appContext.onActivityResult(activity, i11, i12, intent);
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        AppContext appContext = this.appContextHolder.get();
        if (appContext == null) {
            return;
        }
        appContext.onHostDestroy();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        AppContext appContext = this.appContextHolder.get();
        if (appContext == null) {
            return;
        }
        appContext.onHostPause();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        AppContext appContext = this.appContextHolder.get();
        if (appContext == null) {
            return;
        }
        appContext.onHostResume();
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onNewIntent(Intent intent) {
        AppContext appContext = this.appContextHolder.get();
        if (appContext == null) {
            return;
        }
        appContext.onNewIntent(intent);
    }
}