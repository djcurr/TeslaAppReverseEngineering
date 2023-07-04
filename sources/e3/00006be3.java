package expo.modules.webbrowser;

import android.content.Intent;
import expo.modules.core.interfaces.InternalModule;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public interface CustomTabsActivitiesHelper extends InternalModule {
    boolean canResolveIntent(Intent intent);

    ArrayList<String> getCustomTabsResolvingActivities();

    ArrayList<String> getCustomTabsResolvingServices();

    String getDefaultCustomTabsResolvingActivity();

    String getPreferredCustomTabsResolvingActivity(List<String> list);

    void startCustomTabs(Intent intent);
}