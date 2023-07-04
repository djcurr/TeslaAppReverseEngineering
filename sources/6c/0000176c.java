package com.facebook.react;

import com.facebook.react.bridge.ModuleHolder;
import com.facebook.react.bridge.ModuleSpec;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.uimanager.ViewManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import javax.inject.Provider;

/* loaded from: classes3.dex */
public abstract class a0 implements v {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements Iterable<ModuleHolder> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Iterator f11663a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ReactApplicationContext f11664b;

        /* renamed from: com.facebook.react.a0$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        class C0222a implements Iterator<ModuleHolder> {

            /* renamed from: a  reason: collision with root package name */
            Map.Entry<String, ReactModuleInfo> f11666a = null;

            C0222a() {
            }

            /* JADX WARN: Removed duplicated region for block: B:4:0x000a  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private void a() {
                /*
                    r3 = this;
                L0:
                    com.facebook.react.a0$a r0 = com.facebook.react.a0.a.this
                    java.util.Iterator r0 = r0.f11663a
                    boolean r0 = r0.hasNext()
                    if (r0 == 0) goto L28
                    com.facebook.react.a0$a r0 = com.facebook.react.a0.a.this
                    java.util.Iterator r0 = r0.f11663a
                    java.lang.Object r0 = r0.next()
                    java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                    java.lang.Object r1 = r0.getValue()
                    com.facebook.react.module.model.ReactModuleInfo r1 = (com.facebook.react.module.model.ReactModuleInfo) r1
                    boolean r2 = com.facebook.react.config.ReactFeatureFlags.useTurboModules
                    if (r2 == 0) goto L25
                    boolean r1 = r1.e()
                    if (r1 == 0) goto L25
                    goto L0
                L25:
                    r3.f11666a = r0
                    return
                L28:
                    r0 = 0
                    r3.f11666a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.a0.a.C0222a.a():void");
            }

            @Override // java.util.Iterator
            /* renamed from: b */
            public ModuleHolder next() {
                if (this.f11666a == null) {
                    a();
                }
                Map.Entry<String, ReactModuleInfo> entry = this.f11666a;
                if (entry != null) {
                    a();
                    a aVar = a.this;
                    return new ModuleHolder(entry.getValue(), new b(entry.getKey(), aVar.f11664b));
                }
                throw new NoSuchElementException("ModuleHolder not found");
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                if (this.f11666a == null) {
                    a();
                }
                return this.f11666a != null;
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException("Cannot remove native modules from the list");
            }
        }

        a(Iterator it2, ReactApplicationContext reactApplicationContext) {
            this.f11663a = it2;
            this.f11664b = reactApplicationContext;
        }

        @Override // java.lang.Iterable
        public Iterator<ModuleHolder> iterator() {
            return new C0222a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class b implements Provider<NativeModule> {

        /* renamed from: a  reason: collision with root package name */
        private final String f11668a;

        /* renamed from: b  reason: collision with root package name */
        private final ReactApplicationContext f11669b;

        public b(String str, ReactApplicationContext reactApplicationContext) {
            this.f11668a = str;
            this.f11669b = reactApplicationContext;
        }

        @Override // javax.inject.Provider
        /* renamed from: a */
        public NativeModule get() {
            return a0.this.getModule(this.f11668a, this.f11669b);
        }
    }

    @Override // com.facebook.react.v
    public List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        throw new UnsupportedOperationException("In case of TurboModules, createNativeModules is not supported. NativeModuleRegistry should instead use getModuleList or getModule method");
    }

    @Override // com.facebook.react.v
    public List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
        List<ModuleSpec> viewManagers = getViewManagers(reactApplicationContext);
        if (viewManagers != null && !viewManagers.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (ModuleSpec moduleSpec : viewManagers) {
                arrayList.add((ViewManager) moduleSpec.getProvider().get());
            }
            return arrayList;
        }
        return Collections.emptyList();
    }

    public abstract NativeModule getModule(String str, ReactApplicationContext reactApplicationContext);

    public Iterable<ModuleHolder> getNativeModuleIterator(ReactApplicationContext reactApplicationContext) {
        return new a(getReactModuleInfoProvider().getReactModuleInfos().entrySet().iterator(), reactApplicationContext);
    }

    public abstract gg.a getReactModuleInfoProvider();

    protected List<ModuleSpec> getViewManagers(ReactApplicationContext reactApplicationContext) {
        return Collections.emptyList();
    }
}