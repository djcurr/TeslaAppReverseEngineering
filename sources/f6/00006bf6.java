package expo.modules.webbrowser;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.browser.customtabs.d;
import expo.modules.core.ExportedModule;
import expo.modules.core.ModuleRegistry;
import expo.modules.core.Promise;
import expo.modules.core.arguments.ReadableArguments;
import expo.modules.core.errors.CurrentActivityNotFoundException;
import expo.modules.core.interfaces.ExpoMethod;
import expo.modules.webbrowser.error.NoPreferredPackageFound;
import expo.modules.webbrowser.error.PackageManagerNotFoundException;
import java.util.ArrayList;

/* loaded from: classes5.dex */
public class WebBrowserModule extends ExportedModule {
    private static final String BROWSER_PACKAGES_KEY = "browserPackages";
    private static final String BROWSER_PACKAGE_KEY = "browserPackage";
    private static final String CREATE_TASK = "createTask";
    private static final String DEFAULT_BROWSER_PACKAGE = "defaultBrowserPackage";
    private static final String DEFAULT_SHARE_MENU_ITEM = "enableDefaultShareMenuItem";
    private static final String ENABLE_BAR_COLLAPSING_KEY = "enableBarCollapsing";
    private static final String ERROR_CODE = "EXWebBrowser";
    private static final String NO_PREFERRED_PACKAGE_MSG = "Cannot determine preferred package without satisfying it.";
    private static final String PREFERRED_BROWSER_PACKAGE = "preferredBrowserPackage";
    private static final String SECONDARY_TOOLBAR_COLOR_KEY = "secondaryToolbarColor";
    private static final String SERVICE_PACKAGES_KEY = "servicePackages";
    private static final String SERVICE_PACKAGE_KEY = "servicePackage";
    private static final String SHOW_IN_RECENTS = "showInRecents";
    private static final String SHOW_TITLE_KEY = "showTitle";
    private static final String TAG = "ExpoWebBrowser";
    private static final String TOOLBAR_COLOR_KEY = "toolbarColor";
    private CustomTabsConnectionHelper mConnectionHelper;
    private CustomTabsActivitiesHelper mCustomTabsResolver;

    public WebBrowserModule(Context context) {
        super(context);
    }

    private Intent createCustomTabsIntent(ReadableArguments readableArguments) {
        d.a aVar = new d.a();
        String string = readableArguments.getString(TOOLBAR_COLOR_KEY);
        String string2 = readableArguments.getString(SECONDARY_TOOLBAR_COLOR_KEY);
        String string3 = readableArguments.getString(BROWSER_PACKAGE_KEY);
        try {
            if (!TextUtils.isEmpty(string)) {
                aVar.k(Color.parseColor(string));
            }
            if (!TextUtils.isEmpty(string2)) {
                aVar.f(Color.parseColor(string2));
            }
        } catch (IllegalArgumentException unused) {
        }
        aVar.i(readableArguments.getBoolean(SHOW_TITLE_KEY, false));
        if (readableArguments.containsKey(DEFAULT_SHARE_MENU_ITEM) && readableArguments.getBoolean(DEFAULT_SHARE_MENU_ITEM)) {
            aVar.a();
        }
        Intent intent = aVar.b().f2065a;
        intent.putExtra("android.support.customtabs.extra.ENABLE_URLBAR_HIDING", readableArguments.getBoolean(ENABLE_BAR_COLLAPSING_KEY, false));
        if (!TextUtils.isEmpty(string3)) {
            intent.setPackage(string3);
        }
        if (readableArguments.getBoolean(CREATE_TASK, true)) {
            intent.addFlags(268435456);
            if (!readableArguments.getBoolean(SHOW_IN_RECENTS, false)) {
                intent.addFlags(8388608);
                intent.addFlags(1073741824);
            }
        }
        return intent;
    }

    private String givenOrPreferredPackageName(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                str = this.mCustomTabsResolver.getPreferredCustomTabsResolvingActivity(null);
            }
            if (TextUtils.isEmpty(str)) {
                throw new NoPreferredPackageFound(NO_PREFERRED_PACKAGE_MSG);
            }
            return str;
        } catch (CurrentActivityNotFoundException | PackageManagerNotFoundException unused) {
            throw new NoPreferredPackageFound(NO_PREFERRED_PACKAGE_MSG);
        }
    }

    @ExpoMethod
    public void coolDownAsync(String str, Promise promise) {
        try {
            String givenOrPreferredPackageName = givenOrPreferredPackageName(str);
            if (this.mConnectionHelper.coolDown(givenOrPreferredPackageName)) {
                Bundle bundle = new Bundle();
                bundle.putString(SERVICE_PACKAGE_KEY, givenOrPreferredPackageName);
                promise.resolve(bundle);
            } else {
                promise.resolve(new Bundle());
            }
        } catch (NoPreferredPackageFound e11) {
            promise.reject(e11);
        }
    }

    @ExpoMethod
    public void getCustomTabsSupportingBrowsersAsync(Promise promise) {
        try {
            ArrayList<String> customTabsResolvingActivities = this.mCustomTabsResolver.getCustomTabsResolvingActivities();
            ArrayList<String> customTabsResolvingServices = this.mCustomTabsResolver.getCustomTabsResolvingServices();
            String preferredCustomTabsResolvingActivity = this.mCustomTabsResolver.getPreferredCustomTabsResolvingActivity(customTabsResolvingActivities);
            String defaultCustomTabsResolvingActivity = this.mCustomTabsResolver.getDefaultCustomTabsResolvingActivity();
            if (!customTabsResolvingActivities.contains(defaultCustomTabsResolvingActivity)) {
                defaultCustomTabsResolvingActivity = null;
            }
            Bundle bundle = new Bundle();
            bundle.putStringArrayList(BROWSER_PACKAGES_KEY, customTabsResolvingActivities);
            bundle.putStringArrayList(SERVICE_PACKAGES_KEY, customTabsResolvingServices);
            bundle.putString(PREFERRED_BROWSER_PACKAGE, preferredCustomTabsResolvingActivity);
            bundle.putString(DEFAULT_BROWSER_PACKAGE, defaultCustomTabsResolvingActivity);
            promise.resolve(bundle);
        } catch (CurrentActivityNotFoundException | PackageManagerNotFoundException e11) {
            promise.reject(e11);
        }
    }

    @Override // expo.modules.core.ExportedModule
    public String getName() {
        return TAG;
    }

    @ExpoMethod
    public void mayInitWithUrlAsync(String str, String str2, Promise promise) {
        try {
            String givenOrPreferredPackageName = givenOrPreferredPackageName(str2);
            this.mConnectionHelper.mayInitWithUrl(givenOrPreferredPackageName, Uri.parse(str));
            Bundle bundle = new Bundle();
            bundle.putString(SERVICE_PACKAGE_KEY, givenOrPreferredPackageName);
            promise.resolve(bundle);
        } catch (NoPreferredPackageFound e11) {
            promise.reject(e11);
        }
    }

    @Override // expo.modules.core.interfaces.RegistryLifecycleListener
    public void onCreate(ModuleRegistry moduleRegistry) {
        this.mCustomTabsResolver = (CustomTabsActivitiesHelper) moduleRegistry.getModule(CustomTabsActivitiesHelper.class);
        this.mConnectionHelper = (CustomTabsConnectionHelper) moduleRegistry.getModule(CustomTabsConnectionHelper.class);
    }

    @ExpoMethod
    public void openBrowserAsync(String str, ReadableArguments readableArguments, Promise promise) {
        Intent createCustomTabsIntent = createCustomTabsIntent(readableArguments);
        createCustomTabsIntent.setData(Uri.parse(str));
        try {
            if (this.mCustomTabsResolver.canResolveIntent(createCustomTabsIntent)) {
                this.mCustomTabsResolver.startCustomTabs(createCustomTabsIntent);
                Bundle bundle = new Bundle();
                bundle.putString("type", "opened");
                promise.resolve(bundle);
            } else {
                promise.reject(ERROR_CODE, "No matching activity!");
            }
        } catch (CurrentActivityNotFoundException | PackageManagerNotFoundException e11) {
            promise.reject(e11);
        }
    }

    @ExpoMethod
    public void warmUpAsync(String str, Promise promise) {
        try {
            String givenOrPreferredPackageName = givenOrPreferredPackageName(str);
            this.mConnectionHelper.warmUp(givenOrPreferredPackageName);
            Bundle bundle = new Bundle();
            bundle.putString(SERVICE_PACKAGE_KEY, givenOrPreferredPackageName);
            promise.resolve(bundle);
        } catch (NoPreferredPackageFound e11) {
            promise.reject(e11);
        }
    }
}