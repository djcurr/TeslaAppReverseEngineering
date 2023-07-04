package expo.modules.adapters.react.apploader;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0007"}, d2 = {"Lexpo/modules/adapters/react/apploader/HeadlessAppLoaderListener;", "", "", "appScopeKey", "Lvz/b0;", "appLoaded", "appDestroyed", "expo-modules-core_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public interface HeadlessAppLoaderListener {
    void appDestroyed(String str);

    void appLoaded(String str);
}