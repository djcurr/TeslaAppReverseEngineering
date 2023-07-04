package expo.modules;

import android.app.Application;
import androidx.collection.a;
import com.facebook.react.bridge.JSIModule;
import com.facebook.react.bridge.JSIModulePackage;
import com.facebook.react.bridge.JSIModuleSpec;
import com.facebook.react.bridge.JavaScriptContextHolder;
import com.facebook.react.bridge.JavaScriptExecutorFactory;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.r;
import com.facebook.react.u;
import com.facebook.react.uimanager.s0;
import com.facebook.react.v;
import expo.modules.core.interfaces.Package;
import expo.modules.core.interfaces.ReactNativeHostHandler;
import ezvcard.property.Kind;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import u20.h;
import u20.k;
import u20.p;
import wz.b0;
import wz.e0;
import wz.w;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001:\u0001-B\u0017\u0012\u0006\u0010*\u001a\u00020)\u0012\u0006\u0010\u001a\u001a\u00020\u0001¢\u0006\u0004\b+\u0010,J\b\u0010\u0003\u001a\u00020\u0002H\u0014J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014J\b\u0010\t\u001a\u00020\bH\u0014J\n\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0014J\b\u0010\r\u001a\u00020\fH\u0014J\n\u0010\u000e\u001a\u0004\u0018\u00010\fH\u0014J\n\u0010\u000f\u001a\u0004\u0018\u00010\fH\u0014J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0014J\u001d\u0010\u0019\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00152\u0006\u0010\u0016\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001a\u001a\u00020\u00018\u0004@\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR*\u0010!\u001a\u0010\u0012\f\u0012\n  *\u0004\u0018\u00010\u001f0\u001f0\u001e8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\"\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020&0%8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006."}, d2 = {"Lexpo/modules/ReactNativeHostWrapperBase;", "Lcom/facebook/react/u;", "Lcom/facebook/react/r;", "createReactInstanceManager", "Lcom/facebook/react/devsupport/h;", "getRedBoxHandler", "Lcom/facebook/react/bridge/JavaScriptExecutorFactory;", "getJavaScriptExecutorFactory", "Lcom/facebook/react/uimanager/s0;", "getUIImplementationProvider", "Lcom/facebook/react/bridge/JSIModulePackage;", "getJSIModulePackage", "", "getJSMainModuleName", "getJSBundleFile", "getBundleAssetName", "", "getUseDeveloperSupport", "", "Lcom/facebook/react/v;", "getPackages", "T", "name", "invokeDelegateMethod$expo_release", "(Ljava/lang/String;)Ljava/lang/Object;", "invokeDelegateMethod", "host", "Lcom/facebook/react/u;", "getHost", "()Lcom/facebook/react/u;", "", "Lexpo/modules/core/interfaces/ReactNativeHostHandler;", "kotlin.jvm.PlatformType", "reactNativeHostHandlers", "Ljava/util/List;", "getReactNativeHostHandlers$expo_release", "()Ljava/util/List;", "Landroidx/collection/a;", "Ljava/lang/reflect/Method;", "methodMap", "Landroidx/collection/a;", "Landroid/app/Application;", Kind.APPLICATION, "<init>", "(Landroid/app/Application;Lcom/facebook/react/u;)V", "JSIModuleContainerPackage", "expo_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public class ReactNativeHostWrapperBase extends u {
    private final u host;
    private final a<String, Method> methodMap;
    private final List<ReactNativeHostHandler> reactNativeHostHandlers;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\f\u0010\rJ$\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lexpo/modules/ReactNativeHostWrapperBase$JSIModuleContainerPackage;", "Lcom/facebook/react/bridge/JSIModulePackage;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactApplicationContext", "Lcom/facebook/react/bridge/JavaScriptContextHolder;", "jsContext", "", "Lcom/facebook/react/bridge/JSIModuleSpec;", "Lcom/facebook/react/bridge/JSIModule;", "getJSIModules", "userJSIModulePackage", "Lcom/facebook/react/bridge/JSIModulePackage;", "<init>", "(Lexpo/modules/ReactNativeHostWrapperBase;Lcom/facebook/react/bridge/JSIModulePackage;)V", "expo_release"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes6.dex */
    public final class JSIModuleContainerPackage implements JSIModulePackage {
        final /* synthetic */ ReactNativeHostWrapperBase this$0;
        private final JSIModulePackage userJSIModulePackage;

        public JSIModuleContainerPackage(ReactNativeHostWrapperBase this$0, JSIModulePackage jSIModulePackage) {
            s.g(this$0, "this$0");
            this.this$0 = this$0;
            this.userJSIModulePackage = jSIModulePackage;
        }

        @Override // com.facebook.react.bridge.JSIModulePackage
        public List<JSIModuleSpec<JSIModule>> getJSIModules(ReactApplicationContext reactApplicationContext, JavaScriptContextHolder jsContext) {
            List<JSIModuleSpec<JSIModule>> i11;
            s.g(reactApplicationContext, "reactApplicationContext");
            s.g(jsContext, "jsContext");
            List<ReactNativeHostHandler> reactNativeHostHandlers$expo_release = this.this$0.getReactNativeHostHandlers$expo_release();
            ReactNativeHostWrapperBase reactNativeHostWrapperBase = this.this$0;
            for (ReactNativeHostHandler reactNativeHostHandler : reactNativeHostHandlers$expo_release) {
                reactNativeHostHandler.onRegisterJSIModules(reactApplicationContext, jsContext, reactNativeHostWrapperBase.getUseDeveloperSupport());
            }
            JSIModulePackage jSIModulePackage = this.userJSIModulePackage;
            if (jSIModulePackage != null) {
                jSIModulePackage.getJSIModules(reactApplicationContext, jsContext);
            }
            i11 = w.i();
            return i11;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReactNativeHostWrapperBase(Application application, u host) {
        super(application);
        s.g(application, "application");
        s.g(host, "host");
        this.host = host;
        List<Package> packageList = ExpoModulesPackage.Companion.getPackageList();
        ArrayList arrayList = new ArrayList();
        for (Package r12 : packageList) {
            List<? extends ReactNativeHostHandler> createReactNativeHostHandlers = r12.createReactNativeHostHandlers(application);
            s.f(createReactNativeHostHandlers, "it.createReactNativeHostHandlers(application)");
            b0.z(arrayList, createReactNativeHostHandlers);
        }
        this.reactNativeHostHandlers = arrayList;
        this.methodMap = new a<>();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.u
    public r createReactInstanceManager() {
        h S;
        h C;
        boolean useDeveloperSupport = getUseDeveloperSupport();
        for (ReactNativeHostHandler reactNativeHostHandler : this.reactNativeHostHandlers) {
            reactNativeHostHandler.onWillCreateReactInstanceManager(useDeveloperSupport);
        }
        S = e0.S(this.reactNativeHostHandlers);
        C = p.C(S, new ReactNativeHostWrapperBase$createReactInstanceManager$result$1(useDeveloperSupport));
        r result = (r) k.u(C);
        if (result == null) {
            result = super.createReactInstanceManager();
        }
        for (ReactNativeHostHandler reactNativeHostHandler2 : this.reactNativeHostHandlers) {
            reactNativeHostHandler2.onDidCreateReactInstanceManager(result, useDeveloperSupport);
        }
        s.f(result, "result");
        return result;
    }

    @Override // com.facebook.react.u
    protected String getBundleAssetName() {
        h S;
        h C;
        S = e0.S(this.reactNativeHostHandlers);
        C = p.C(S, new ReactNativeHostWrapperBase$getBundleAssetName$1(this));
        String str = (String) k.u(C);
        return str == null ? (String) invokeDelegateMethod$expo_release("getBundleAssetName") : str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final u getHost() {
        return this.host;
    }

    @Override // com.facebook.react.u
    protected String getJSBundleFile() {
        h S;
        h C;
        S = e0.S(this.reactNativeHostHandlers);
        C = p.C(S, new ReactNativeHostWrapperBase$getJSBundleFile$1(this));
        String str = (String) k.u(C);
        return str == null ? (String) invokeDelegateMethod$expo_release("getJSBundleFile") : str;
    }

    @Override // com.facebook.react.u
    protected JSIModulePackage getJSIModulePackage() {
        return new JSIModuleContainerPackage(this, (JSIModulePackage) invokeDelegateMethod$expo_release("getJSIModulePackage"));
    }

    @Override // com.facebook.react.u
    protected String getJSMainModuleName() {
        return (String) invokeDelegateMethod$expo_release("getJSMainModuleName");
    }

    @Override // com.facebook.react.u
    protected JavaScriptExecutorFactory getJavaScriptExecutorFactory() {
        h S;
        h C;
        S = e0.S(this.reactNativeHostHandlers);
        C = p.C(S, ReactNativeHostWrapperBase$getJavaScriptExecutorFactory$1.INSTANCE);
        JavaScriptExecutorFactory javaScriptExecutorFactory = (JavaScriptExecutorFactory) k.u(C);
        return javaScriptExecutorFactory == null ? (JavaScriptExecutorFactory) invokeDelegateMethod$expo_release("getJavaScriptExecutorFactory") : javaScriptExecutorFactory;
    }

    @Override // com.facebook.react.u
    protected List<v> getPackages() {
        return (List) invokeDelegateMethod$expo_release("getPackages");
    }

    public final List<ReactNativeHostHandler> getReactNativeHostHandlers$expo_release() {
        return this.reactNativeHostHandlers;
    }

    @Override // com.facebook.react.u
    protected com.facebook.react.devsupport.h getRedBoxHandler() {
        return (com.facebook.react.devsupport.h) invokeDelegateMethod$expo_release("getRedBoxHandler");
    }

    @Override // com.facebook.react.u
    protected s0 getUIImplementationProvider() {
        return (s0) invokeDelegateMethod$expo_release("getUIImplementationProvider");
    }

    @Override // com.facebook.react.u
    public boolean getUseDeveloperSupport() {
        h S;
        h C;
        S = e0.S(this.reactNativeHostHandlers);
        C = p.C(S, ReactNativeHostWrapperBase$getUseDeveloperSupport$1.INSTANCE);
        Boolean bool = (Boolean) k.u(C);
        return bool == null ? this.host.getUseDeveloperSupport() : bool.booleanValue();
    }

    public final <T> T invokeDelegateMethod$expo_release(String name) {
        s.g(name, "name");
        Method method = this.methodMap.get(name);
        if (method == null) {
            method = u.class.getDeclaredMethod(name, new Class[0]);
            method.setAccessible(true);
            this.methodMap.put(name, method);
        }
        s.e(method);
        return (T) method.invoke(this.host, new Object[0]);
    }
}