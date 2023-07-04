package expo.modules.webbrowser;

import android.content.Context;
import expo.modules.core.BasePackage;
import expo.modules.core.ExportedModule;
import expo.modules.core.interfaces.InternalModule;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes5.dex */
public class WebBrowserPackage extends BasePackage {
    @Override // expo.modules.core.BasePackage, expo.modules.core.interfaces.Package
    public List<ExportedModule> createExportedModules(Context context) {
        return Collections.singletonList(new WebBrowserModule(context));
    }

    @Override // expo.modules.core.BasePackage, expo.modules.core.interfaces.Package
    public List<InternalModule> createInternalModules(Context context) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new InternalCustomTabsActivitiesHelper());
        arrayList.add(new InternalCustomTabsConnectionHelper(context));
        return arrayList;
    }
}