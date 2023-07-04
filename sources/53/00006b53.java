package expo.modules.kotlin.views;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import ch.qos.logback.core.CoreConstants;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import expo.modules.adapters.react.NativeModulesProxy;
import expo.modules.core.ViewManager;
import expo.modules.kotlin.defaultmodules.ErrorManagerModule;
import expo.modules.kotlin.exception.CodedException;
import h00.l;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import vz.b0;
import wz.e0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001Bo\u0012\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040(\u0012\u000e\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0011\u0012\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014\u0012\u0016\b\u0002\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b\u0018\u00010(\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b.\u0010/J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0007\u001a\u00020\u0006J\u0016\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0004J\u0016\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eR\u001e\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\"\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00150#8\u0006@\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R'\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b\u0018\u00010(8\u0006@\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,¨\u00060"}, d2 = {"Lexpo/modules/kotlin/views/ViewManagerDefinition;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/view/View;", "createView", "Lexpo/modules/core/ViewManager$ViewManagerType;", "getViewManagerType", "Lcom/facebook/react/bridge/ReadableMap;", "propsToSet", "onView", "Lvz/b0;", "setProps", "view", "Lexpo/modules/kotlin/exception/CodedException;", "exception", "handleException", "Ljava/lang/Class;", "viewType", "Ljava/lang/Class;", "", "", "Lexpo/modules/kotlin/views/AnyViewProp;", "props", "Ljava/util/Map;", "Lexpo/modules/kotlin/views/CallbacksDefinition;", "callbacksDefinition", "Lexpo/modules/kotlin/views/CallbacksDefinition;", "getCallbacksDefinition", "()Lexpo/modules/kotlin/views/CallbacksDefinition;", "Lexpo/modules/kotlin/views/ViewGroupDefinition;", "viewGroupDefinition", "Lexpo/modules/kotlin/views/ViewGroupDefinition;", "getViewGroupDefinition", "()Lexpo/modules/kotlin/views/ViewGroupDefinition;", "", "propsNames", "Ljava/util/List;", "getPropsNames", "()Ljava/util/List;", "Lkotlin/Function1;", "onViewDestroys", "Lh00/l;", "getOnViewDestroys", "()Lh00/l;", "viewFactory", "<init>", "(Lh00/l;Ljava/lang/Class;Ljava/util/Map;Lh00/l;Lexpo/modules/kotlin/views/CallbacksDefinition;Lexpo/modules/kotlin/views/ViewGroupDefinition;)V", "expo-modules-core_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public final class ViewManagerDefinition {
    private final CallbacksDefinition callbacksDefinition;
    private final l<View, b0> onViewDestroys;
    private final Map<String, AnyViewProp> props;
    private final List<String> propsNames;
    private final l<Context, View> viewFactory;
    private final ViewGroupDefinition viewGroupDefinition;
    private final Class<? extends View> viewType;

    /* JADX WARN: Multi-variable type inference failed */
    public ViewManagerDefinition(l<? super Context, ? extends View> viewFactory, Class<? extends View> viewType, Map<String, ? extends AnyViewProp> props, l<? super View, b0> lVar, CallbacksDefinition callbacksDefinition, ViewGroupDefinition viewGroupDefinition) {
        List<String> O0;
        s.g(viewFactory, "viewFactory");
        s.g(viewType, "viewType");
        s.g(props, "props");
        this.viewFactory = viewFactory;
        this.viewType = viewType;
        this.props = props;
        this.onViewDestroys = lVar;
        this.callbacksDefinition = callbacksDefinition;
        this.viewGroupDefinition = viewGroupDefinition;
        O0 = e0.O0(props.keySet());
        this.propsNames = O0;
    }

    public final View createView(Context context) {
        s.g(context, "context");
        return this.viewFactory.invoke(context);
    }

    public final CallbacksDefinition getCallbacksDefinition() {
        return this.callbacksDefinition;
    }

    public final l<View, b0> getOnViewDestroys() {
        return this.onViewDestroys;
    }

    public final List<String> getPropsNames() {
        return this.propsNames;
    }

    public final ViewGroupDefinition getViewGroupDefinition() {
        return this.viewGroupDefinition;
    }

    public final ViewManager.ViewManagerType getViewManagerType() {
        if (ViewGroup.class.isAssignableFrom(this.viewType)) {
            return ViewManager.ViewManagerType.GROUP;
        }
        return ViewManager.ViewManagerType.SIMPLE;
    }

    public final void handleException(View view, CodedException exception) {
        ErrorManagerModule errorManager$expo_modules_core_release;
        s.g(view, "view");
        s.g(exception, "exception");
        Context context = view.getContext();
        ReactContext reactContext = context instanceof ReactContext ? (ReactContext) context : null;
        if (reactContext == null) {
            return;
        }
        CatalystInstance catalystInstance = reactContext.getCatalystInstance();
        NativeModule nativeModule = catalystInstance == null ? null : catalystInstance.getNativeModule("NativeUnimoduleProxy");
        NativeModulesProxy nativeModulesProxy = nativeModule instanceof NativeModulesProxy ? nativeModule : null;
        if (nativeModulesProxy == null || (errorManager$expo_modules_core_release = nativeModulesProxy.getKotlinInteropModuleRegistry().getAppContext$expo_modules_core_release().getErrorManager$expo_modules_core_release()) == null) {
            return;
        }
        errorManager$expo_modules_core_release.reportExceptionToLogBox(exception);
    }

    public final void setProps(ReadableMap propsToSet, View onView) {
        s.g(propsToSet, "propsToSet");
        s.g(onView, "onView");
        ReadableMapKeySetIterator keySetIterator = propsToSet.keySetIterator();
        s.f(keySetIterator, "propsToSet.keySetIterator()");
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            AnyViewProp anyViewProp = this.props.get(nextKey);
            if (anyViewProp != null) {
                Dynamic dynamic = propsToSet.getDynamic(nextKey);
                s.f(dynamic, "propsToSet.getDynamic(key)");
                try {
                    anyViewProp.set(dynamic, onView);
                    b0 b0Var = b0.f54756a;
                    dynamic.recycle();
                }
            }
        }
    }

    public /* synthetic */ ViewManagerDefinition(l lVar, Class cls, Map map, l lVar2, CallbacksDefinition callbacksDefinition, ViewGroupDefinition viewGroupDefinition, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(lVar, cls, map, (i11 & 8) != 0 ? null : lVar2, (i11 & 16) != 0 ? null : callbacksDefinition, (i11 & 32) != 0 ? null : viewGroupDefinition);
    }
}