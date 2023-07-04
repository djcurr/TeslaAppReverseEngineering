package expo.modules.webbrowser;

import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import androidx.browser.customtabs.f;
import expo.modules.core.interfaces.Consumer;
import expo.modules.core.interfaces.LifecycleEventListener;
import java.util.Collections;
import java.util.List;

/* loaded from: classes5.dex */
public class InternalCustomTabsConnectionHelper extends androidx.browser.customtabs.e implements LifecycleEventListener, CustomTabsConnectionHelper {
    private Context mContext;
    private String mPackageName;
    private DeferredClientActionsQueue<androidx.browser.customtabs.c> clientActions = new DeferredClientActionsQueue<>();
    private DeferredClientActionsQueue<f> sessionActions = new DeferredClientActionsQueue<>();

    public InternalCustomTabsConnectionHelper(Context context) {
        this.mContext = context;
    }

    public static /* synthetic */ void a(InternalCustomTabsConnectionHelper internalCustomTabsConnectionHelper, androidx.browser.customtabs.c cVar) {
        internalCustomTabsConnectionHelper.lambda$ensureSession$2(cVar);
    }

    public static /* synthetic */ void b(Uri uri, f fVar) {
        fVar.c(uri, null, null);
    }

    public static /* synthetic */ void c(androidx.browser.customtabs.c cVar) {
        cVar.g(0L);
    }

    private void clearConnection() {
        this.mPackageName = null;
        this.clientActions.clear();
        this.sessionActions.clear();
    }

    private boolean connectionStarted(String str) {
        return str.equals(this.mPackageName);
    }

    private void ensureConnection(String str) {
        String str2 = this.mPackageName;
        if (str2 != null && !str2.equals(str)) {
            clearConnection();
        }
        if (connectionStarted(str)) {
            return;
        }
        androidx.browser.customtabs.c.a(getContext(), str, this);
        this.mPackageName = str;
    }

    private void ensureSession() {
        if (this.sessionActions.hasClient()) {
            return;
        }
        this.clientActions.executeOrQueueAction(new Consumer() { // from class: expo.modules.webbrowser.d
            {
                InternalCustomTabsConnectionHelper.this = this;
            }

            @Override // expo.modules.core.interfaces.Consumer
            public final void apply(Object obj) {
                InternalCustomTabsConnectionHelper.a(InternalCustomTabsConnectionHelper.this, (androidx.browser.customtabs.c) obj);
            }
        });
    }

    private Context getContext() {
        return this.mContext;
    }

    public /* synthetic */ void lambda$ensureSession$2(androidx.browser.customtabs.c cVar) {
        this.sessionActions.setClient(cVar.e(null));
    }

    private void unbindService() {
        getContext().unbindService(this);
        clearConnection();
    }

    @Override // expo.modules.webbrowser.CustomTabsConnectionHelper
    public boolean coolDown(String str) {
        if (str.equals(this.mPackageName)) {
            unbindService();
            return true;
        }
        return false;
    }

    @Override // expo.modules.core.interfaces.InternalModule
    public List<? extends Class> getExportedInterfaces() {
        return Collections.singletonList(CustomTabsConnectionHelper.class);
    }

    @Override // expo.modules.webbrowser.CustomTabsConnectionHelper
    public void mayInitWithUrl(String str, final Uri uri) {
        this.sessionActions.executeOrQueueAction(new Consumer() { // from class: expo.modules.webbrowser.c
            @Override // expo.modules.core.interfaces.Consumer
            public final void apply(Object obj) {
                InternalCustomTabsConnectionHelper.b(uri, (f) obj);
            }
        });
        ensureConnection(str);
        ensureSession();
    }

    @Override // android.content.ServiceConnection
    public void onBindingDied(ComponentName componentName) {
        if (componentName.getPackageName().equals(this.mPackageName)) {
            clearConnection();
        }
    }

    @Override // androidx.browser.customtabs.e
    public void onCustomTabsServiceConnected(ComponentName componentName, androidx.browser.customtabs.c cVar) {
        if (componentName.getPackageName().equals(this.mPackageName)) {
            this.clientActions.setClient(cVar);
        }
    }

    @Override // expo.modules.core.interfaces.LifecycleEventListener
    public void onHostDestroy() {
        unbindService();
    }

    @Override // expo.modules.core.interfaces.LifecycleEventListener
    public void onHostPause() {
    }

    @Override // expo.modules.core.interfaces.LifecycleEventListener
    public void onHostResume() {
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        if (componentName.getPackageName().equals(this.mPackageName)) {
            clearConnection();
        }
    }

    @Override // expo.modules.webbrowser.CustomTabsConnectionHelper
    public void warmUp(String str) {
        this.clientActions.executeOrQueueAction(new Consumer() { // from class: expo.modules.webbrowser.e
            @Override // expo.modules.core.interfaces.Consumer
            public final void apply(Object obj) {
                InternalCustomTabsConnectionHelper.c((androidx.browser.customtabs.c) obj);
            }
        });
        ensureConnection(str);
    }
}