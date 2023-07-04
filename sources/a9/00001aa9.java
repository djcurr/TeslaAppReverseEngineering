package com.facebook.react;

import com.facebook.react.bridge.ModuleHolder;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public class w {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements Iterable<ModuleHolder> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List f12833a;

        /* renamed from: com.facebook.react.w$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        class C0239a implements Iterator<ModuleHolder> {

            /* renamed from: a  reason: collision with root package name */
            int f12834a = 0;

            C0239a() {
            }

            @Override // java.util.Iterator
            /* renamed from: a */
            public ModuleHolder next() {
                List list = a.this.f12833a;
                int i11 = this.f12834a;
                this.f12834a = i11 + 1;
                return new ModuleHolder((NativeModule) list.get(i11));
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f12834a < a.this.f12833a.size();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException("Cannot remove methods ");
            }
        }

        a(List list) {
            this.f12833a = list;
        }

        @Override // java.lang.Iterable
        public Iterator<ModuleHolder> iterator() {
            return new C0239a();
        }
    }

    public static Iterable<ModuleHolder> a(v vVar, ReactApplicationContext reactApplicationContext, r rVar) {
        List<NativeModule> createNativeModules;
        nd.a.b("ReactNative", vVar.getClass().getSimpleName() + " is not a LazyReactPackage, falling back to old version.");
        if (vVar instanceof t) {
            createNativeModules = ((t) vVar).a(reactApplicationContext, rVar);
        } else {
            createNativeModules = vVar.createNativeModules(reactApplicationContext);
        }
        return new a(createNativeModules);
    }
}