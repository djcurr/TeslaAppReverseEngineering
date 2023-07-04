package expo.modules.kotlin.callbacks;

import android.content.Context;
import android.view.View;
import com.adyen.checkout.components.status.model.StatusResponse;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import expo.modules.adapters.react.NativeModulesProxy;
import expo.modules.kotlin.events.EventEmitter;
import expo.modules.kotlin.modules.Module;
import expo.modules.kotlin.types.JSTypeConverter;
import expo.modules.kotlin.types.JSTypeConverterHelperKt;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import n00.p;
import vz.b0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001f\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\"\u0010\u0011\u001a\u00020\u00108\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u001b"}, d2 = {"Lexpo/modules/kotlin/callbacks/ViewCallback;", "T", "Lexpo/modules/kotlin/callbacks/Callback;", "arg", "Lcom/facebook/react/bridge/WritableMap;", "convertEventBody", "(Ljava/lang/Object;)Lcom/facebook/react/bridge/WritableMap;", "Lvz/b0;", "invoke", "(Ljava/lang/Object;)V", "", "name", "Ljava/lang/String;", "Landroid/view/View;", "view", "Landroid/view/View;", "Lexpo/modules/kotlin/modules/Module;", "module", "Lexpo/modules/kotlin/modules/Module;", "getModule$expo_modules_core_release", "()Lexpo/modules/kotlin/modules/Module;", "setModule$expo_modules_core_release", "(Lexpo/modules/kotlin/modules/Module;)V", "Ln00/p;", "type", "<init>", "(Ljava/lang/String;Ln00/p;Landroid/view/View;)V", "expo-modules-core_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public final class ViewCallback<T> implements Callback<T> {
    public Module module;
    private final String name;
    private final p type;
    private final View view;

    public ViewCallback(String name, p type, View view) {
        s.g(name, "name");
        s.g(type, "type");
        s.g(view, "view");
        this.name = name;
        this.type = type;
        this.view = view;
    }

    private final WritableMap convertEventBody(T t11) {
        Object convertToJSValue$default = JSTypeConverter.convertToJSValue$default(JSTypeConverter.INSTANCE, t11, null, 2, null);
        boolean z11 = true;
        if (!(convertToJSValue$default instanceof b0) && convertToJSValue$default != null) {
            z11 = false;
        }
        if (z11) {
            return null;
        }
        if (convertToJSValue$default instanceof WritableMap) {
            return (WritableMap) convertToJSValue$default;
        }
        WritableMap createMap = JSTypeConverter.DefaultContainerProvider.INSTANCE.createMap();
        JSTypeConverterHelperKt.putGeneric(createMap, StatusResponse.PAYLOAD, convertToJSValue$default);
        return createMap;
    }

    public final Module getModule$expo_modules_core_release() {
        Module module = this.module;
        if (module != null) {
            return module;
        }
        s.x("module");
        return null;
    }

    @Override // expo.modules.kotlin.callbacks.Callback
    public void invoke(T t11) {
        EventEmitter callbackInvoker$expo_modules_core_release;
        Context context = this.view.getContext();
        Objects.requireNonNull(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        CatalystInstance catalystInstance = ((ReactContext) context).getCatalystInstance();
        NativeModule nativeModule = catalystInstance == null ? null : catalystInstance.getNativeModule("NativeUnimoduleProxy");
        NativeModulesProxy nativeModulesProxy = nativeModule instanceof NativeModulesProxy ? (NativeModulesProxy) nativeModule : null;
        if (nativeModulesProxy == null || (callbackInvoker$expo_modules_core_release = nativeModulesProxy.getKotlinInteropModuleRegistry().getAppContext$expo_modules_core_release().getCallbackInvoker$expo_modules_core_release()) == null) {
            return;
        }
        callbackInvoker$expo_modules_core_release.emit(this.view.getId(), this.name, convertEventBody(t11));
    }

    public final void setModule$expo_modules_core_release(Module module) {
        s.g(module, "<set-?>");
        this.module = module;
    }
}