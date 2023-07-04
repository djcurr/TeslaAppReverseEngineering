package expo.modules.kotlin.functions;

import com.facebook.react.bridge.BaseJavaModule;
import expo.modules.kotlin.ModuleHolder;
import expo.modules.kotlin.Promise;
import expo.modules.kotlin.types.AnyType;
import h00.p;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import vz.b0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\"\u0010\u0012\u001a\u001e\u0012\u000e\u0012\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0\u0011¢\u0006\u0004\b\u0013\u0010\u0014J1\u0010\f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0010\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0010¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lexpo/modules/kotlin/functions/AsyncFunctionWithPromise;", "Lexpo/modules/kotlin/functions/AnyFunction;", "Lexpo/modules/kotlin/ModuleHolder;", "holder", "", "", "args", "Lexpo/modules/kotlin/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "Lvz/b0;", "callImplementation$expo_modules_core_release", "(Lexpo/modules/kotlin/ModuleHolder;[Ljava/lang/Object;Lexpo/modules/kotlin/Promise;)V", "callImplementation", "", "name", "Lexpo/modules/kotlin/types/AnyType;", "argsType", "Lkotlin/Function2;", "body", "<init>", "(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lh00/p;)V", "expo-modules-core_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public final class AsyncFunctionWithPromise extends AnyFunction {
    private final p<Object[], Promise, b0> body;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AsyncFunctionWithPromise(String name, AnyType[] argsType, p<? super Object[], ? super Promise, b0> body) {
        super(name, argsType);
        s.g(name, "name");
        s.g(argsType, "argsType");
        s.g(body, "body");
        this.body = body;
    }

    @Override // expo.modules.kotlin.functions.AnyFunction
    public void callImplementation$expo_modules_core_release(ModuleHolder holder, Object[] args, Promise promise) {
        s.g(holder, "holder");
        s.g(args, "args");
        s.g(promise, "promise");
        this.body.invoke(args, promise);
    }
}