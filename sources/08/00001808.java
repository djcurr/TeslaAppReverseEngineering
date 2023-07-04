package com.facebook.react.bridge;

import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import java.util.concurrent.atomic.AtomicInteger;
import javax.inject.Provider;
import xd.c;
import xf.a;

@a
/* loaded from: classes3.dex */
public class ModuleHolder {
    private static final AtomicInteger sInstanceKeyCounter = new AtomicInteger(1);
    private boolean mInitializable;
    private final int mInstanceKey = sInstanceKeyCounter.getAndIncrement();
    private boolean mIsCreating;
    private boolean mIsInitializing;
    private NativeModule mModule;
    private final String mName;
    private Provider<? extends NativeModule> mProvider;
    private final ReactModuleInfo mReactModuleInfo;

    public ModuleHolder(ReactModuleInfo reactModuleInfo, Provider<? extends NativeModule> provider) {
        this.mName = reactModuleInfo.f();
        this.mProvider = provider;
        this.mReactModuleInfo = reactModuleInfo;
        if (reactModuleInfo.g()) {
            this.mModule = create();
        }
    }

    private NativeModule create() {
        boolean z11 = true;
        SoftAssertions.assertCondition(this.mModule == null, "Creating an already created module.");
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_START, this.mName, this.mInstanceKey);
        zg.a.a(0L, "ModuleHolder.createModule").b("name", this.mName).c();
        c.a().a(yd.a.f59447c, "NativeModule init: %s", this.mName);
        try {
            NativeModule nativeModule = (NativeModule) ((Provider) wf.a.c(this.mProvider)).get();
            this.mProvider = null;
            synchronized (this) {
                this.mModule = nativeModule;
                if (!this.mInitializable || this.mIsInitializing) {
                    z11 = false;
                }
            }
            if (z11) {
                doInitialize(nativeModule);
            }
            return nativeModule;
        } finally {
        }
    }

    private void doInitialize(NativeModule nativeModule) {
        boolean z11;
        zg.a.a(0L, "ModuleHolder.initialize").b("name", this.mName).c();
        ReactMarker.logMarker(ReactMarkerConstants.INITIALIZE_MODULE_START, this.mName, this.mInstanceKey);
        try {
            synchronized (this) {
                z11 = true;
                if (!this.mInitializable || this.mIsInitializing) {
                    z11 = false;
                } else {
                    this.mIsInitializing = true;
                }
            }
            if (z11) {
                nativeModule.initialize();
                synchronized (this) {
                    this.mIsInitializing = false;
                }
            }
        } finally {
            ReactMarker.logMarker(ReactMarkerConstants.INITIALIZE_MODULE_END, this.mName, this.mInstanceKey);
            zg.a.b(0L).c();
        }
    }

    public synchronized void destroy() {
        NativeModule nativeModule = this.mModule;
        if (nativeModule != null) {
            nativeModule.invalidate();
        }
    }

    public boolean getCanOverrideExistingModule() {
        return this.mReactModuleInfo.a();
    }

    public String getClassName() {
        return this.mReactModuleInfo.b();
    }

    public boolean getHasConstants() {
        return this.mReactModuleInfo.c();
    }

    @a
    public NativeModule getModule() {
        NativeModule nativeModule;
        NativeModule nativeModule2;
        synchronized (this) {
            NativeModule nativeModule3 = this.mModule;
            if (nativeModule3 != null) {
                return nativeModule3;
            }
            boolean z11 = true;
            if (this.mIsCreating) {
                z11 = false;
            } else {
                this.mIsCreating = true;
            }
            if (z11) {
                NativeModule create = create();
                synchronized (this) {
                    this.mIsCreating = false;
                    notifyAll();
                }
                return create;
            }
            synchronized (this) {
                while (true) {
                    nativeModule = this.mModule;
                    if (nativeModule != null || !this.mIsCreating) {
                        break;
                    }
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                }
                nativeModule2 = (NativeModule) wf.a.c(nativeModule);
            }
            return nativeModule2;
        }
    }

    @a
    public String getName() {
        return this.mName;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized boolean hasInstance() {
        return this.mModule != null;
    }

    public boolean isCxxModule() {
        return this.mReactModuleInfo.d();
    }

    public boolean isTurboModule() {
        return this.mReactModuleInfo.e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void markInitializable() {
        boolean z11;
        NativeModule nativeModule;
        synchronized (this) {
            z11 = true;
            this.mInitializable = true;
            if (this.mModule != null) {
                wf.a.a(this.mIsInitializing ? false : true);
                nativeModule = this.mModule;
            } else {
                nativeModule = null;
                z11 = false;
            }
        }
        if (z11) {
            doInitialize(nativeModule);
        }
    }

    public ModuleHolder(NativeModule nativeModule) {
        String name = nativeModule.getName();
        this.mName = name;
        this.mReactModuleInfo = new ReactModuleInfo(nativeModule.getName(), nativeModule.getClass().getSimpleName(), nativeModule.canOverrideExistingModule(), true, true, CxxModuleWrapper.class.isAssignableFrom(nativeModule.getClass()), TurboModule.class.isAssignableFrom(nativeModule.getClass()));
        this.mModule = nativeModule;
        c.a().a(yd.a.f59447c, "NativeModule init: %s", name);
    }
}