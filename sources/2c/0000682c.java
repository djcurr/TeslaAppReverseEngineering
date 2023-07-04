package expo.modules;

import android.app.Application;
import android.content.res.Configuration;
import expo.modules.core.interfaces.ApplicationLifecycleListener;
import expo.modules.core.interfaces.Package;
import ezvcard.property.Kind;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import wz.b0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0003J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0007R\u001e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lexpo/modules/ApplicationLifecycleDispatcher;", "", "Landroid/app/Application;", Kind.APPLICATION, "", "Lexpo/modules/core/interfaces/ApplicationLifecycleListener;", "getCachedListeners", "Lvz/b0;", "onApplicationCreate", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "listeners", "Ljava/util/List;", "<init>", "()V", "expo_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class ApplicationLifecycleDispatcher {
    public static final ApplicationLifecycleDispatcher INSTANCE = new ApplicationLifecycleDispatcher();
    private static List<? extends ApplicationLifecycleListener> listeners;

    private ApplicationLifecycleDispatcher() {
    }

    private final List<ApplicationLifecycleListener> getCachedListeners(Application application) {
        List list = listeners;
        if (list == null) {
            List<Package> packageList = ExpoModulesPackage.Companion.getPackageList();
            ArrayList arrayList = new ArrayList();
            for (Package r22 : packageList) {
                List<? extends ApplicationLifecycleListener> createApplicationLifecycleListeners = r22.createApplicationLifecycleListeners(application);
                s.f(createApplicationLifecycleListeners, "it.createApplicationLife…cleListeners(application)");
                b0.z(arrayList, createApplicationLifecycleListeners);
            }
            listeners = arrayList;
            return arrayList;
        }
        return list;
    }

    public static final void onApplicationCreate(Application application) {
        s.g(application, "application");
        for (ApplicationLifecycleListener applicationLifecycleListener : INSTANCE.getCachedListeners(application)) {
            applicationLifecycleListener.onCreate(application);
        }
    }

    public static final void onConfigurationChanged(Application application, Configuration newConfig) {
        s.g(application, "application");
        s.g(newConfig, "newConfig");
        for (ApplicationLifecycleListener applicationLifecycleListener : INSTANCE.getCachedListeners(application)) {
            applicationLifecycleListener.onConfigurationChanged(newConfig);
        }
    }
}