package expo.modules;

import android.app.Application;
import com.facebook.react.devsupport.b;
import com.facebook.react.u;
import com.facebook.react.y;
import ezvcard.property.Kind;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import u20.h;
import u20.k;
import u20.p;
import wz.e0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\bH\u0016¨\u0006\u0010"}, d2 = {"Lexpo/modules/ReactNativeHostWrapper;", "Lexpo/modules/ReactNativeHostWrapperBase;", "Lcom/facebook/react/devsupport/b;", "getDevSupportManagerFactory", "Lcom/facebook/react/y$a;", "getReactPackageTurboModuleManagerDelegateBuilder", "", "getShouldRequireActivity", "Lyf/h;", "getSurfaceDelegateFactory", "Landroid/app/Application;", Kind.APPLICATION, "Lcom/facebook/react/u;", "host", "<init>", "(Landroid/app/Application;Lcom/facebook/react/u;)V", "expo_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class ReactNativeHostWrapper extends ReactNativeHostWrapperBase {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReactNativeHostWrapper(Application application, u host) {
        super(application, host);
        s.g(application, "application");
        s.g(host, "host");
    }

    @Override // com.facebook.react.u
    protected b getDevSupportManagerFactory() {
        h S;
        h C;
        S = e0.S(getReactNativeHostHandlers$expo_release());
        C = p.C(S, ReactNativeHostWrapper$getDevSupportManagerFactory$1.INSTANCE);
        b bVar = (b) k.u(C);
        return bVar == null ? (b) invokeDelegateMethod$expo_release("getDevSupportManagerFactory") : bVar;
    }

    @Override // com.facebook.react.u
    protected y.a getReactPackageTurboModuleManagerDelegateBuilder() {
        return (y.a) invokeDelegateMethod$expo_release("getReactPackageTurboModuleManagerDelegateBuilder");
    }

    @Override // com.facebook.react.u
    public boolean getShouldRequireActivity() {
        return getHost().getShouldRequireActivity();
    }

    @Override // com.facebook.react.u
    public yf.h getSurfaceDelegateFactory() {
        yf.h surfaceDelegateFactory = getHost().getSurfaceDelegateFactory();
        s.f(surfaceDelegateFactory, "host.surfaceDelegateFactory");
        return surfaceDelegateFactory;
    }
}