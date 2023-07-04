package expo.modules.core;

import android.content.Context;
import expo.modules.core.interfaces.InternalModule;
import expo.modules.core.interfaces.Package;
import expo.modules.core.interfaces.SingletonModule;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes5.dex */
public class ModuleRegistryProvider {
    private List<Package> mPackages;

    public ModuleRegistryProvider(List<Package> list) {
        this.mPackages = list;
    }

    public Collection<ExportedModule> createExportedModules(Context context) {
        ArrayList arrayList = new ArrayList();
        for (Package r22 : getPackages()) {
            arrayList.addAll(r22.createExportedModules(context));
        }
        return arrayList;
    }

    public Collection<InternalModule> createInternalModules(Context context) {
        ArrayList arrayList = new ArrayList();
        for (Package r22 : getPackages()) {
            arrayList.addAll(r22.createInternalModules(context));
        }
        return arrayList;
    }

    public Collection<SingletonModule> createSingletonModules(Context context) {
        ArrayList arrayList = new ArrayList();
        for (Package r22 : getPackages()) {
            arrayList.addAll(r22.createSingletonModules(context));
        }
        return arrayList;
    }

    public Collection<ViewManager> createViewManagers(Context context) {
        ArrayList arrayList = new ArrayList();
        for (Package r22 : getPackages()) {
            arrayList.addAll(r22.createViewManagers(context));
        }
        return arrayList;
    }

    public ModuleRegistry get(Context context) {
        return new ModuleRegistry(createInternalModules(context), createExportedModules(context), createViewManagers(context), createSingletonModules(context));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public List<Package> getPackages() {
        return this.mPackages;
    }
}