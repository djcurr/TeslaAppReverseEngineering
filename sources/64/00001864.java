package com.facebook.react;

import com.facebook.react.bridge.ModuleHolder;
import com.facebook.react.bridge.ModuleSpec;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.uimanager.ViewManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class d implements v {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements Iterable<ModuleHolder> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List f11827a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Map f11828b;

        /* renamed from: com.facebook.react.d$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        class C0227a implements Iterator<ModuleHolder> {

            /* renamed from: a  reason: collision with root package name */
            int f11829a = 0;

            C0227a() {
            }

            @Override // java.util.Iterator
            /* renamed from: a */
            public ModuleHolder next() {
                List list = a.this.f11827a;
                int i11 = this.f11829a;
                this.f11829a = i11 + 1;
                ModuleSpec moduleSpec = (ModuleSpec) list.get(i11);
                String name = moduleSpec.getName();
                ReactModuleInfo reactModuleInfo = (ReactModuleInfo) a.this.f11828b.get(name);
                if (reactModuleInfo == null) {
                    ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_START, name);
                    try {
                        NativeModule nativeModule = moduleSpec.getProvider().get();
                        ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_END);
                        return new ModuleHolder(nativeModule);
                    } catch (Throwable th2) {
                        ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_END);
                        throw th2;
                    }
                }
                return new ModuleHolder(reactModuleInfo, moduleSpec.getProvider());
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f11829a < a.this.f11827a.size();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException("Cannot remove native modules from the list");
            }
        }

        a(d dVar, List list, Map map) {
            this.f11827a = list;
            this.f11828b = map;
        }

        @Override // java.lang.Iterable
        public Iterator<ModuleHolder> iterator() {
            return new C0227a();
        }
    }

    public Iterable<ModuleHolder> a(ReactApplicationContext reactApplicationContext) {
        return new a(this, b(reactApplicationContext), c().getReactModuleInfos());
    }

    protected abstract List<ModuleSpec> b(ReactApplicationContext reactApplicationContext);

    public abstract gg.a c();

    @Override // com.facebook.react.v
    public final List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        ArrayList arrayList = new ArrayList();
        for (ModuleSpec moduleSpec : b(reactApplicationContext)) {
            zg.a.a(0L, "createNativeModule").b("module", moduleSpec.getType()).c();
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_START, moduleSpec.getName());
            try {
                NativeModule nativeModule = moduleSpec.getProvider().get();
                ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_END);
                zg.a.b(0L).c();
                arrayList.add(nativeModule);
            } catch (Throwable th2) {
                ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_END);
                zg.a.b(0L).c();
                throw th2;
            }
        }
        return arrayList;
    }

    @Override // com.facebook.react.v
    public List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
        List<ModuleSpec> d11 = d(reactApplicationContext);
        if (d11 != null && !d11.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (ModuleSpec moduleSpec : d11) {
                arrayList.add((ViewManager) moduleSpec.getProvider().get());
            }
            return arrayList;
        }
        return Collections.emptyList();
    }

    public List<ModuleSpec> d(ReactApplicationContext reactApplicationContext) {
        return Collections.emptyList();
    }
}