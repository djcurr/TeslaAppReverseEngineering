package expo.modules.webbrowser;

import android.net.Uri;
import expo.modules.core.interfaces.InternalModule;

/* loaded from: classes5.dex */
public interface CustomTabsConnectionHelper extends InternalModule {
    boolean coolDown(String str);

    void mayInitWithUrl(String str, Uri uri);

    void warmUp(String str);
}