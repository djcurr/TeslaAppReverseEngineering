package expo.modules.kotlin.functions;

import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableType;
import expo.modules.kotlin.ModuleHolder;
import expo.modules.kotlin.Promise;
import expo.modules.kotlin.ReadableArrayIterator;
import expo.modules.kotlin.ReadableArrayIteratorKt;
import expo.modules.kotlin.exception.ArgumentCastException;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.exception.InvalidArgsNumberException;
import expo.modules.kotlin.exception.UnexpectedException;
import expo.modules.kotlin.types.AnyType;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import vz.b0;
import wz.k0;
import wz.p;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0004¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010\u0005\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001e\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tJ1\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00072\u0010\u0010\u0003\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u00042\u0006\u0010\n\u001a\u00020\tH ¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0012\u001a\u00020\u00118\u0004@\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0013\u0010\u001c\u001a\u00020\u00198F@\u0006¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Lexpo/modules/kotlin/functions/AnyFunction;", "", "Lcom/facebook/react/bridge/ReadableArray;", "args", "", "convertArgs", "(Lcom/facebook/react/bridge/ReadableArray;)[Ljava/lang/Object;", "Lexpo/modules/kotlin/ModuleHolder;", "module", "Lexpo/modules/kotlin/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "Lvz/b0;", "call", "holder", "callImplementation$expo_modules_core_release", "(Lexpo/modules/kotlin/ModuleHolder;[Ljava/lang/Object;Lexpo/modules/kotlin/Promise;)V", "callImplementation", "", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Lexpo/modules/kotlin/types/AnyType;", "desiredArgsTypes", "[Lexpo/modules/kotlin/types/AnyType;", "", "getArgsCount", "()I", "argsCount", "<init>", "(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;)V", "expo-modules-core_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public abstract class AnyFunction {
    private final AnyType[] desiredArgsTypes;
    private final String name;

    public AnyFunction(String name, AnyType[] desiredArgsTypes) {
        s.g(name, "name");
        s.g(desiredArgsTypes, "desiredArgsTypes");
        this.name = name;
        this.desiredArgsTypes = desiredArgsTypes;
    }

    private final Object[] convertArgs(ReadableArray readableArray) {
        Iterable<k0> F0;
        int length = this.desiredArgsTypes.length;
        Object[] objArr = new Object[length];
        for (int i11 = 0; i11 < length; i11++) {
            objArr[i11] = null;
        }
        ReadableArrayIterator it2 = ReadableArrayIteratorKt.iterator(readableArray);
        F0 = p.F0(this.desiredArgsTypes);
        for (k0 k0Var : F0) {
            int a11 = k0Var.a();
            AnyType anyType = (AnyType) k0Var.b();
            Dynamic next = it2.next();
            try {
                try {
                    objArr[a11] = anyType.convert(next);
                    b0 b0Var = b0.f54756a;
                } catch (CodedException e11) {
                    n00.p kType = anyType.getKType();
                    ReadableType type = next.getType();
                    s.f(type, "type");
                    throw new ArgumentCastException(kType, a11, type, e11);
                } catch (Throwable th2) {
                    UnexpectedException unexpectedException = new UnexpectedException(th2);
                    n00.p kType2 = anyType.getKType();
                    ReadableType type2 = next.getType();
                    s.f(type2, "type");
                    throw new ArgumentCastException(kType2, a11, type2, unexpectedException);
                }
            } finally {
                next.recycle();
            }
        }
        return objArr;
    }

    public final void call(ModuleHolder module, ReadableArray args, Promise promise) {
        s.g(module, "module");
        s.g(args, "args");
        s.g(promise, "promise");
        if (this.desiredArgsTypes.length == args.size()) {
            callImplementation$expo_modules_core_release(module, convertArgs(args), promise);
            return;
        }
        throw new InvalidArgsNumberException(args.size(), this.desiredArgsTypes.length);
    }

    public abstract void callImplementation$expo_modules_core_release(ModuleHolder moduleHolder, Object[] objArr, Promise promise);

    public final int getArgsCount() {
        return this.desiredArgsTypes.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String getName() {
        return this.name;
    }
}