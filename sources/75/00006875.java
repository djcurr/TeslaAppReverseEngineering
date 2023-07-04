package expo.modules.application;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.RemoteException;
import android.provider.Settings;
import android.util.Log;
import com.facebook.react.bridge.BaseJavaModule;
import com.stripe.android.financialconnections.di.NamedConstantsKt;
import expo.modules.core.ExportedModule;
import expo.modules.core.ModuleRegistry;
import expo.modules.core.Promise;
import expo.modules.core.interfaces.ActivityProvider;
import expo.modules.core.interfaces.ExpoMethod;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import z9.a;
import z9.c;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001e2\u00020\u00012\u00020\u0002:\u0001\u001eB\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0016\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\n0\tH\u0016J\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0007J\u0010\u0010\u000f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0007J\u0010\u0010\u0010\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0007R\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Lexpo/modules/application/ApplicationModule;", "Lexpo/modules/core/ExportedModule;", "Lexpo/modules/core/interfaces/RegistryLifecycleListener;", "", "getName", "Lexpo/modules/core/ModuleRegistry;", "moduleRegistry", "Lvz/b0;", "onCreate", "", "", "getConstants", "Lexpo/modules/core/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "getInstallationTimeAsync", "getLastUpdateTimeAsync", "getInstallReferrerAsync", "Landroid/content/Context;", "mContext", "Landroid/content/Context;", "mModuleRegistry", "Lexpo/modules/core/ModuleRegistry;", "Lexpo/modules/core/interfaces/ActivityProvider;", "mActivityProvider", "Lexpo/modules/core/interfaces/ActivityProvider;", "Landroid/app/Activity;", "mActivity", "Landroid/app/Activity;", "<init>", "(Landroid/content/Context;)V", "Companion", "expo-application_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class ApplicationModule extends ExportedModule {
    public static final Companion Companion = new Companion(null);
    private Activity mActivity;
    private ActivityProvider mActivityProvider;
    private final Context mContext;
    private ModuleRegistry mModuleRegistry;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¨\u0006\b"}, d2 = {"Lexpo/modules/application/ApplicationModule$Companion;", "", "Landroid/content/pm/PackageInfo;", "info", "", "getLongVersionCode", "<init>", "()V", "expo-application_release"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final long getLongVersionCode(PackageInfo packageInfo) {
            if (Build.VERSION.SDK_INT >= 28) {
                return packageInfo.getLongVersionCode();
            }
            return packageInfo.versionCode;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApplicationModule(Context mContext) {
        super(mContext);
        s.g(mContext, "mContext");
        this.mContext = mContext;
    }

    @Override // expo.modules.core.ExportedModule
    public Map<String, Object> getConstants() {
        String str;
        HashMap hashMap = new HashMap();
        String obj = this.mContext.getApplicationInfo().loadLabel(this.mContext.getPackageManager()).toString();
        String packageName = this.mContext.getPackageName();
        hashMap.put("applicationName", obj);
        hashMap.put(NamedConstantsKt.APPLICATION_ID, packageName);
        try {
            PackageInfo pInfo = this.mContext.getPackageManager().getPackageInfo(packageName, 0);
            hashMap.put("nativeApplicationVersion", pInfo.versionName);
            Companion companion = Companion;
            s.f(pInfo, "pInfo");
            hashMap.put("nativeBuildVersion", String.valueOf((int) companion.getLongVersionCode(pInfo)));
        } catch (PackageManager.NameNotFoundException e11) {
            str = ApplicationModuleKt.TAG;
            Log.e(str, "Exception: ", e11);
        }
        hashMap.put("androidId", Settings.Secure.getString(this.mContext.getContentResolver(), "android_id"));
        return hashMap;
    }

    @ExpoMethod
    public final void getInstallReferrerAsync(final Promise promise) {
        s.g(promise, "promise");
        final StringBuilder sb2 = new StringBuilder();
        final a a11 = a.c(this.mContext).a();
        a11.d(new c() { // from class: expo.modules.application.ApplicationModule$getInstallReferrerAsync$1
            @Override // z9.c
            public void onInstallReferrerServiceDisconnected() {
                promise.reject("ERR_APPLICATION_INSTALL_REFERRER_SERVICE_DISCONNECTED", "Connection to install referrer service was lost.");
            }

            @Override // z9.c
            public void onInstallReferrerSetupFinished(int i11) {
                String str;
                if (i11 == 0) {
                    try {
                        sb2.append(a.this.b().a());
                    } catch (RemoteException e11) {
                        str = ApplicationModuleKt.TAG;
                        Log.e(str, "Exception: ", e11);
                        promise.reject("ERR_APPLICATION_INSTALL_REFERRER_REMOTE_EXCEPTION", "RemoteException getting install referrer information. This may happen if the process hosting the remote object is no longer available.", e11);
                    }
                    promise.resolve(sb2.toString());
                } else if (i11 == 1) {
                    promise.reject("ERR_APPLICATION_INSTALL_REFERRER_CONNECTION", "Could not establish a connection to Google Play");
                } else if (i11 != 2) {
                    Promise promise2 = promise;
                    promise2.reject("ERR_APPLICATION_INSTALL_REFERRER", "General error retrieving the install referrer: response code " + i11);
                } else {
                    promise.reject("ERR_APPLICATION_INSTALL_REFERRER_UNAVAILABLE", "The current Play Store app doesn't provide the installation referrer API, or the Play Store may not be installed.");
                }
                a.this.a();
            }
        });
    }

    @ExpoMethod
    public final void getInstallationTimeAsync(Promise promise) {
        String str;
        s.g(promise, "promise");
        try {
            promise.resolve(Double.valueOf(this.mContext.getPackageManager().getPackageInfo(this.mContext.getPackageName(), 0).firstInstallTime));
        } catch (PackageManager.NameNotFoundException e11) {
            str = ApplicationModuleKt.TAG;
            Log.e(str, "Exception: ", e11);
            promise.reject("ERR_APPLICATION_PACKAGE_NAME_NOT_FOUND", "Unable to get install time of this application. Could not get package info or package name.", e11);
        }
    }

    @ExpoMethod
    public final void getLastUpdateTimeAsync(Promise promise) {
        String str;
        s.g(promise, "promise");
        try {
            promise.resolve(Double.valueOf(this.mContext.getPackageManager().getPackageInfo(this.mContext.getPackageName(), 0).lastUpdateTime));
        } catch (PackageManager.NameNotFoundException e11) {
            str = ApplicationModuleKt.TAG;
            Log.e(str, "Exception: ", e11);
            promise.reject("ERR_APPLICATION_PACKAGE_NAME_NOT_FOUND", "Unable to get last update time of this application. Could not get package info or package name.", e11);
        }
    }

    @Override // expo.modules.core.ExportedModule
    public String getName() {
        return "ExpoApplication";
    }

    @Override // expo.modules.core.interfaces.RegistryLifecycleListener
    public void onCreate(ModuleRegistry moduleRegistry) {
        s.g(moduleRegistry, "moduleRegistry");
        this.mModuleRegistry = moduleRegistry;
        ActivityProvider activityProvider = (ActivityProvider) moduleRegistry.getModule(ActivityProvider.class);
        this.mActivityProvider = activityProvider;
        this.mActivity = activityProvider == null ? null : activityProvider.getCurrentActivity();
    }
}