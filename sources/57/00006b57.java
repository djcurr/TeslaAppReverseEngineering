package expo.modules.kotlin.views;

import android.content.Context;
import android.util.Log;
import android.view.View;
import ch.qos.logback.core.CoreConstants;
import com.facebook.react.bridge.ReadableMap;
import expo.modules.kotlin.ModuleHolder;
import expo.modules.kotlin.callbacks.ViewCallbackDelegate;
import g00.a;
import h00.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import n00.d;
import n00.o;
import o00.b;
import vz.b0;
import vz.v;
import wz.s0;
import wz.x;
import yf.c;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b#\u0010\u0017J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006J\u0016\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tJ\u0017\u0010\f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000eR\"\u0010\u0012\u001a\u00020\u00118\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001b\u001a\u00020\u00188B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001c8@@\u0000X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\"\u001a\u00020\u000f8F@\u0006¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006$"}, d2 = {"Lexpo/modules/kotlin/views/ViewManagerWrapperDelegate;", "", "Landroid/view/View;", "view", "Lvz/b0;", "configureView", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "createView", "Lcom/facebook/react/bridge/ReadableMap;", "proxiedProperties", "setProxiedProperties", "onDestroy", "(Landroid/view/View;)Lvz/b0;", "", "", "getExportedCustomDirectEventTypeConstants", "Lexpo/modules/kotlin/ModuleHolder;", "moduleHolder", "Lexpo/modules/kotlin/ModuleHolder;", "getModuleHolder$expo_modules_core_release", "()Lexpo/modules/kotlin/ModuleHolder;", "setModuleHolder$expo_modules_core_release", "(Lexpo/modules/kotlin/ModuleHolder;)V", "Lexpo/modules/kotlin/views/ViewManagerDefinition;", "getDefinition", "()Lexpo/modules/kotlin/views/ViewManagerDefinition;", "definition", "Lexpo/modules/kotlin/views/ViewGroupDefinition;", "getViewGroupDefinition$expo_modules_core_release", "()Lexpo/modules/kotlin/views/ViewGroupDefinition;", "viewGroupDefinition", "getName", "()Ljava/lang/String;", "name", "<init>", "expo-modules-core_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public final class ViewManagerWrapperDelegate {
    private ModuleHolder moduleHolder;

    public ViewManagerWrapperDelegate(ModuleHolder moduleHolder) {
        s.g(moduleHolder, "moduleHolder");
        this.moduleHolder = moduleHolder;
    }

    private final void configureView(View view) {
        int t11;
        Map t12;
        CallbacksDefinition callbacksDefinition = getDefinition().getCallbacksDefinition();
        String[] names = callbacksDefinition == null ? null : callbacksDefinition.getNames();
        if (names == null) {
            return;
        }
        d e11 = a.e(view.getClass());
        Collection<o> b11 = b.b(e11);
        t11 = x.t(b11, 10);
        ArrayList arrayList = new ArrayList(t11);
        for (o oVar : b11) {
            arrayList.add(v.a(oVar.getName(), oVar));
        }
        t12 = s0.t(arrayList);
        int i11 = 0;
        int length = names.length;
        while (i11 < length) {
            String str = names[i11];
            i11++;
            Object obj = t12.get(str);
            if (obj == null) {
                String o11 = e11.o();
                Log.w("ExpoModuleCore", "Property `" + str + "` does not exist in " + o11 + ".");
            } else {
                o oVar2 = (o) obj;
                p00.a.a(oVar2, true);
                Object p11 = oVar2.p(view);
                if (p11 == null) {
                    String o12 = e11.o();
                    Log.w("ExpoModulesCore", "Property delegate for `" + str + "` in " + o12 + " does not exist.");
                } else {
                    ViewCallbackDelegate viewCallbackDelegate = p11 instanceof ViewCallbackDelegate ? (ViewCallbackDelegate) p11 : null;
                    if (viewCallbackDelegate == null) {
                        Log.w("ExpoModulesCore", "Property delegate for `" + str + "` cannot be cased to `ViewCallbackDelegate`.");
                    } else {
                        viewCallbackDelegate.setValidated$expo_modules_core_release(true);
                    }
                }
            }
        }
    }

    private final ViewManagerDefinition getDefinition() {
        ViewManagerDefinition viewManagerDefinition = this.moduleHolder.getDefinition().getViewManagerDefinition();
        if (viewManagerDefinition != null) {
            return viewManagerDefinition;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public final View createView(Context context) {
        s.g(context, "context");
        View createView = getDefinition().createView(context);
        configureView(createView);
        return createView;
    }

    public final Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        String[] names;
        c.b a11 = c.a();
        CallbacksDefinition callbacksDefinition = getDefinition().getCallbacksDefinition();
        if (callbacksDefinition != null && (names = callbacksDefinition.getNames()) != null) {
            int i11 = 0;
            int length = names.length;
            while (i11 < length) {
                String str = names[i11];
                i11++;
                a11.b(str, c.d("registrationName", str));
            }
        }
        return a11.a();
    }

    public final ModuleHolder getModuleHolder$expo_modules_core_release() {
        return this.moduleHolder;
    }

    public final String getName() {
        return this.moduleHolder.getName();
    }

    public final ViewGroupDefinition getViewGroupDefinition$expo_modules_core_release() {
        return getDefinition().getViewGroupDefinition();
    }

    public final b0 onDestroy(View view) {
        s.g(view, "view");
        l<View, b0> onViewDestroys = getDefinition().getOnViewDestroys();
        if (onViewDestroys == null) {
            return null;
        }
        onViewDestroys.invoke(view);
        return b0.f54756a;
    }

    public final void setModuleHolder$expo_modules_core_release(ModuleHolder moduleHolder) {
        s.g(moduleHolder, "<set-?>");
        this.moduleHolder = moduleHolder;
    }

    public final void setProxiedProperties(View view, ReadableMap proxiedProperties) {
        s.g(view, "view");
        s.g(proxiedProperties, "proxiedProperties");
        getDefinition().setProps(proxiedProperties, view);
    }
}