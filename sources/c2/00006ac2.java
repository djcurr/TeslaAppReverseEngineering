package expo.modules.kotlin.modules;

import android.os.Bundle;
import expo.modules.core.errors.ModuleDestroyedException;
import expo.modules.kotlin.AppContext;
import expo.modules.kotlin.events.EventEmitter;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import v20.o0;
import v20.p0;
import vz.k;
import vz.m;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b(\u0010\u000bJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\b\u0010\t\u001a\u00020\bH&J\u000f\u0010\f\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\n\u0010\u000bR*\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0004\b\u000e\u0010\u000f\u0012\u0004\b\u0014\u0010\u000b\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001f\u0010\u001a\u001a\u0004\u0018\u00010\u00158B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u001c\u001a\u00020\r8F@\u0006¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0011R.\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0000@\u0000X\u0081.¢\u0006\u0018\n\u0004\b\u001f\u0010\u0017\u0012\u0004\b$\u0010\u000b\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0013\u0010'\u001a\u00020\u001e8F@\u0006¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006)"}, d2 = {"Lexpo/modules/kotlin/modules/Module;", "", "", "name", "Landroid/os/Bundle;", "body", "Lvz/b0;", "sendEvent", "Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "definition", "cleanUp$expo_modules_core_release", "()V", "cleanUp", "Lexpo/modules/kotlin/AppContext;", "_appContext", "Lexpo/modules/kotlin/AppContext;", "get_appContext$expo_modules_core_release", "()Lexpo/modules/kotlin/AppContext;", "set_appContext$expo_modules_core_release", "(Lexpo/modules/kotlin/AppContext;)V", "get_appContext$expo_modules_core_release$annotations", "Lexpo/modules/kotlin/events/EventEmitter;", "moduleEventEmitter$delegate", "Lvz/k;", "getModuleEventEmitter", "()Lexpo/modules/kotlin/events/EventEmitter;", "moduleEventEmitter", "getAppContext", "appContext", "Lvz/k;", "Lv20/o0;", "coroutineScopeDelegate", "getCoroutineScopeDelegate", "()Lvz/k;", "setCoroutineScopeDelegate", "(Lvz/k;)V", "getCoroutineScopeDelegate$annotations", "getCoroutineScope", "()Lv20/o0;", "coroutineScope", "<init>", "expo-modules-core_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public abstract class Module {
    private AppContext _appContext;
    public k<? extends o0> coroutineScopeDelegate;
    private final k moduleEventEmitter$delegate;

    public Module() {
        k a11;
        a11 = m.a(new Module$moduleEventEmitter$2(this));
        this.moduleEventEmitter$delegate = a11;
    }

    public static /* synthetic */ void getCoroutineScopeDelegate$annotations() {
    }

    private final EventEmitter getModuleEventEmitter() {
        return (EventEmitter) this.moduleEventEmitter$delegate.getValue();
    }

    public static /* synthetic */ void get_appContext$expo_modules_core_release$annotations() {
    }

    public final void cleanUp$expo_modules_core_release() {
        if (getCoroutineScopeDelegate().isInitialized()) {
            p0.c(getCoroutineScope(), new ModuleDestroyedException(null, 1, null));
        }
    }

    public abstract ModuleDefinitionData definition();

    public final AppContext getAppContext() {
        AppContext appContext = this._appContext;
        if (appContext != null) {
            return appContext;
        }
        throw new IllegalArgumentException("The module wasn't created! You can't access the app context.".toString());
    }

    public final o0 getCoroutineScope() {
        return getCoroutineScopeDelegate().getValue();
    }

    public final k<o0> getCoroutineScopeDelegate() {
        k kVar = this.coroutineScopeDelegate;
        if (kVar != null) {
            return kVar;
        }
        s.x("coroutineScopeDelegate");
        return null;
    }

    public final AppContext get_appContext$expo_modules_core_release() {
        return this._appContext;
    }

    public final void sendEvent(String name, Bundle bundle) {
        s.g(name, "name");
        EventEmitter moduleEventEmitter = getModuleEventEmitter();
        if (moduleEventEmitter == null) {
            return;
        }
        moduleEventEmitter.emit(name, bundle);
    }

    public final void setCoroutineScopeDelegate(k<? extends o0> kVar) {
        s.g(kVar, "<set-?>");
        this.coroutineScopeDelegate = kVar;
    }

    public final void set_appContext$expo_modules_core_release(AppContext appContext) {
        this._appContext = appContext;
    }
}