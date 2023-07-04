package com.facebook.react;

import com.facebook.react.bridge.ModuleHolder;
import com.facebook.react.bridge.NativeModuleRegistry;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    private final ReactApplicationContext f11842a;

    /* renamed from: b  reason: collision with root package name */
    private final r f11843b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, ModuleHolder> f11844c = new HashMap();

    public f(ReactApplicationContext reactApplicationContext, r rVar) {
        this.f11842a = reactApplicationContext;
        this.f11843b = rVar;
    }

    public NativeModuleRegistry a() {
        return new NativeModuleRegistry(this.f11842a, this.f11844c);
    }

    public void b(v vVar) {
        Iterable<ModuleHolder> a11;
        if (vVar instanceof d) {
            a11 = ((d) vVar).a(this.f11842a);
        } else if (vVar instanceof a0) {
            a11 = ((a0) vVar).getNativeModuleIterator(this.f11842a);
        } else {
            a11 = w.a(vVar, this.f11842a, this.f11843b);
        }
        for (ModuleHolder moduleHolder : a11) {
            String name = moduleHolder.getName();
            if (this.f11844c.containsKey(name)) {
                ModuleHolder moduleHolder2 = this.f11844c.get(name);
                if (moduleHolder.getCanOverrideExistingModule()) {
                    this.f11844c.remove(moduleHolder2);
                } else {
                    throw new IllegalStateException("Native module " + name + " tried to override " + moduleHolder2.getClassName() + ". Check the getPackages() method in MainApplication.java, it might be that module is being created twice. If this was your intention, set canOverrideExistingModule=true. This error may also be present if the package is present only once in getPackages() but is also automatically added later during build time by autolinking. Try removing the existing entry and rebuild.");
                }
            }
            this.f11844c.put(name, moduleHolder);
        }
    }
}