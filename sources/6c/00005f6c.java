package com.tesla.TeslaV4.reactnative.module;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import kotlin.Metadata;
import pu.e;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007R\u001d\u0010\r\u001a\u00020\b8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/tesla/TeslaV4/reactnative/module/ProfileBackupNativeModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "", "getName", "Lcom/facebook/react/bridge/Promise;", "result", "Lvz/b0;", "rewrapVault", "Lpu/e;", "profileBackupService$delegate", "Lvz/k;", "getProfileBackupService", "()Lpu/e;", "profileBackupService", "Lcom/facebook/react/bridge/ReactApplicationContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "app_prodGlobalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class ProfileBackupNativeModule extends ReactContextBaseJavaModule {
    private final vz.k profileBackupService$delegate;

    /* loaded from: classes6.dex */
    static final class a extends kotlin.jvm.internal.u implements h00.a<pu.e> {
        a() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: a */
        public final pu.e invoke() {
            e.a aVar = pu.e.f46921e;
            Context applicationContext = ProfileBackupNativeModule.this.getReactApplicationContext().getApplicationContext();
            kotlin.jvm.internal.s.f(applicationContext, "reactApplicationContext.applicationContext");
            return aVar.a(applicationContext);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileBackupNativeModule(ReactApplicationContext context) {
        super(context);
        vz.k a11;
        kotlin.jvm.internal.s.g(context, "context");
        a11 = vz.m.a(new a());
        this.profileBackupService$delegate = a11;
    }

    private final pu.e getProfileBackupService() {
        return (pu.e) this.profileBackupService$delegate.getValue();
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "ProfileBackupModule";
    }

    @ReactMethod
    public final void rewrapVault(Promise result) {
        kotlin.jvm.internal.s.g(result, "result");
        getProfileBackupService().f();
    }
}