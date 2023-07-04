package expo.modules.adapters.react;

import com.facebook.react.v;
import expo.modules.core.interfaces.InternalModule;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* loaded from: classes6.dex */
public class ReactPackagesProvider implements InternalModule {
    private Collection<v> mReactPackages = new ArrayList();

    public void addPackage(v vVar) {
        this.mReactPackages.add(vVar);
    }

    @Override // expo.modules.core.interfaces.InternalModule
    public List<? extends Class> getExportedInterfaces() {
        return Collections.singletonList(ReactPackagesProvider.class);
    }

    public Collection<v> getReactPackages() {
        return this.mReactPackages;
    }
}