package expo.modules.adapters.react;

import android.content.Context;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.v;
import expo.modules.core.ModuleRegistry;
import expo.modules.core.ModuleRegistryProvider;
import expo.modules.core.interfaces.Package;
import expo.modules.core.interfaces.SingletonModule;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes6.dex */
public class ReactModuleRegistryProvider extends ModuleRegistryProvider {
    private Collection<ViewManager> mReactViewManagers;
    private Collection<SingletonModule> mSingletonModules;
    private Collection<expo.modules.core.ViewManager> mViewManagers;

    public ReactModuleRegistryProvider(List<Package> list) {
        this(list, null);
    }

    private Collection<SingletonModule> getSingletonModules(Context context) {
        Collection<SingletonModule> collection = this.mSingletonModules;
        if (collection != null) {
            return collection;
        }
        ArrayList arrayList = new ArrayList();
        for (Package r22 : getPackages()) {
            arrayList.addAll(r22.createSingletonModules(context));
        }
        return arrayList;
    }

    @Override // expo.modules.core.ModuleRegistryProvider
    public ModuleRegistry get(Context context) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ReactPackagesProvider reactPackagesProvider = new ReactPackagesProvider();
        for (Package r42 : getPackages()) {
            arrayList.addAll(r42.createInternalModules(context));
            arrayList2.addAll(r42.createExportedModules(context));
            if (r42 instanceof v) {
                reactPackagesProvider.addPackage((v) r42);
            }
        }
        arrayList.add(reactPackagesProvider);
        return new ModuleRegistry(arrayList, arrayList2, getViewManagers(context), getSingletonModules(context));
    }

    public Collection<ViewManager> getReactViewManagers(ReactApplicationContext reactApplicationContext) {
        Collection<ViewManager> collection = this.mReactViewManagers;
        if (collection != null) {
            return collection;
        }
        this.mReactViewManagers = new HashSet();
        for (Package r12 : getPackages()) {
            if (r12 instanceof v) {
                this.mReactViewManagers.addAll(((v) r12).createViewManagers(reactApplicationContext));
            }
        }
        return this.mReactViewManagers;
    }

    public Collection<expo.modules.core.ViewManager> getViewManagers(Context context) {
        Collection<expo.modules.core.ViewManager> collection = this.mViewManagers;
        if (collection != null) {
            return collection;
        }
        HashSet hashSet = new HashSet();
        this.mViewManagers = hashSet;
        hashSet.addAll(createViewManagers(context));
        return this.mViewManagers;
    }

    public ReactModuleRegistryProvider(List<Package> list, List<SingletonModule> list2) {
        super(list);
        this.mSingletonModules = list2;
    }
}