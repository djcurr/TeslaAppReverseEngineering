package expo.modules.webbrowser;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import androidx.browser.customtabs.d;
import expo.modules.core.ModuleRegistry;
import expo.modules.core.errors.CurrentActivityNotFoundException;
import expo.modules.core.interfaces.ActivityProvider;
import expo.modules.core.interfaces.Function;
import expo.modules.webbrowser.error.PackageManagerNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

/* loaded from: classes5.dex */
class InternalCustomTabsActivitiesHelper implements CustomTabsActivitiesHelper {
    private static final String DUMMY_URL = "https://expo.io";
    private ModuleRegistry mModuleRegistry;

    public static /* synthetic */ String a(ResolveInfo resolveInfo) {
        return lambda$getCustomTabsResolvingServices$1(resolveInfo);
    }

    public static /* synthetic */ String b(ResolveInfo resolveInfo) {
        return lambda$getCustomTabsResolvingActivities$0(resolveInfo);
    }

    private Intent createDefaultCustomTabsIntent() {
        Intent intent = new d.a().b().f2065a;
        intent.setData(Uri.parse(DUMMY_URL));
        return intent;
    }

    private Intent createDefaultCustomTabsServiceIntent() {
        Intent intent = new Intent();
        intent.setAction("android.support.customtabs.action.CustomTabsService");
        return intent;
    }

    private Activity getCurrentActivity() {
        ActivityProvider activityProvider = (ActivityProvider) this.mModuleRegistry.getModule(ActivityProvider.class);
        if (activityProvider != null && activityProvider.getCurrentActivity() != null) {
            return activityProvider.getCurrentActivity();
        }
        throw new CurrentActivityNotFoundException();
    }

    private PackageManager getPackageManager() {
        PackageManager packageManager = getCurrentActivity().getPackageManager();
        if (packageManager != null) {
            return packageManager;
        }
        throw new PackageManagerNotFoundException();
    }

    private List<ResolveInfo> getResolvingActivities(Intent intent) {
        return getPackageManager().queryIntentActivities(intent, 0);
    }

    public static /* synthetic */ String lambda$getCustomTabsResolvingActivities$0(ResolveInfo resolveInfo) {
        return resolveInfo.activityInfo.packageName;
    }

    public static /* synthetic */ String lambda$getCustomTabsResolvingServices$1(ResolveInfo resolveInfo) {
        return resolveInfo.serviceInfo.packageName;
    }

    public static <T, R> ArrayList<R> mapCollectionToDistinctArrayList(Collection<? extends T> collection, Function<T, R> function) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (T t11 : collection) {
            linkedHashSet.add(function.apply(t11));
        }
        return new ArrayList<>(linkedHashSet);
    }

    @Override // expo.modules.webbrowser.CustomTabsActivitiesHelper
    public boolean canResolveIntent(Intent intent) {
        return getResolvingActivities(intent).size() > 0;
    }

    @Override // expo.modules.webbrowser.CustomTabsActivitiesHelper
    public ArrayList<String> getCustomTabsResolvingActivities() {
        return mapCollectionToDistinctArrayList(getResolvingActivities(createDefaultCustomTabsIntent()), new Function() { // from class: expo.modules.webbrowser.b
            @Override // expo.modules.core.interfaces.Function
            public final Object apply(Object obj) {
                return InternalCustomTabsActivitiesHelper.b((ResolveInfo) obj);
            }
        });
    }

    @Override // expo.modules.webbrowser.CustomTabsActivitiesHelper
    public ArrayList<String> getCustomTabsResolvingServices() {
        return mapCollectionToDistinctArrayList(getPackageManager().queryIntentServices(createDefaultCustomTabsServiceIntent(), 0), new Function() { // from class: expo.modules.webbrowser.a
            @Override // expo.modules.core.interfaces.Function
            public final Object apply(Object obj) {
                return InternalCustomTabsActivitiesHelper.a((ResolveInfo) obj);
            }
        });
    }

    @Override // expo.modules.webbrowser.CustomTabsActivitiesHelper
    public String getDefaultCustomTabsResolvingActivity() {
        ResolveInfo resolveActivity = getPackageManager().resolveActivity(createDefaultCustomTabsIntent(), 0);
        if (resolveActivity == null) {
            return null;
        }
        return resolveActivity.activityInfo.packageName;
    }

    @Override // expo.modules.core.interfaces.InternalModule
    public List<? extends Class> getExportedInterfaces() {
        return Collections.singletonList(CustomTabsActivitiesHelper.class);
    }

    @Override // expo.modules.webbrowser.CustomTabsActivitiesHelper
    public String getPreferredCustomTabsResolvingActivity(List<String> list) {
        if (list == null) {
            list = getCustomTabsResolvingActivities();
        }
        return androidx.browser.customtabs.c.c(getCurrentActivity(), list);
    }

    @Override // expo.modules.core.interfaces.RegistryLifecycleListener
    public void onCreate(ModuleRegistry moduleRegistry) {
        this.mModuleRegistry = moduleRegistry;
    }

    @Override // expo.modules.core.interfaces.RegistryLifecycleListener
    public void onDestroy() {
    }

    @Override // expo.modules.webbrowser.CustomTabsActivitiesHelper
    public void startCustomTabs(Intent intent) {
        getCurrentActivity().startActivity(intent);
    }
}