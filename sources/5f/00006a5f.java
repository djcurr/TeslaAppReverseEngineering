package expo.modules.kotlin;

import com.adyen.checkout.components.status.model.StatusResponse;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.ReadableArray;
import expo.modules.kotlin.events.BasicEventListener;
import expo.modules.kotlin.events.EventListener;
import expo.modules.kotlin.events.EventListenerWithPayload;
import expo.modules.kotlin.events.EventListenerWithSenderAndPayload;
import expo.modules.kotlin.events.EventName;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.exception.FunctionCallException;
import expo.modules.kotlin.exception.MethodNotFoundException;
import expo.modules.kotlin.exception.UnexpectedException;
import expo.modules.kotlin.functions.AnyFunction;
import expo.modules.kotlin.modules.Module;
import expo.modules.kotlin.modules.ModuleDefinitionData;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import vz.b0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b!\u0010\"J\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nJ#\u0010\f\u001a\u00020\b\"\u0004\b\u0000\u0010\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00028\u0000¢\u0006\u0004\b\f\u0010\u000fJ1\u0010\f\u001a\u00020\b\"\u0004\b\u0000\u0010\u0010\"\u0004\b\u0001\u0010\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u0001¢\u0006\u0004\b\f\u0010\u0012J\u0006\u0010\u0013\u001a\u00020\bR\u0019\u0010\u0015\u001a\u00020\u00148\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u001a\u001a\u00020\u00198\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010 \u001a\u00020\u00028F@\u0006¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006#"}, d2 = {"Lexpo/modules/kotlin/ModuleHolder;", "", "", "methodName", "Lcom/facebook/react/bridge/ReadableArray;", "args", "Lexpo/modules/kotlin/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "Lvz/b0;", "call", "Lexpo/modules/kotlin/events/EventName;", "eventName", "post", "Payload", StatusResponse.PAYLOAD, "(Lexpo/modules/kotlin/events/EventName;Ljava/lang/Object;)V", "Sender", "sender", "(Lexpo/modules/kotlin/events/EventName;Ljava/lang/Object;Ljava/lang/Object;)V", "cleanUp", "Lexpo/modules/kotlin/modules/Module;", "module", "Lexpo/modules/kotlin/modules/Module;", "getModule", "()Lexpo/modules/kotlin/modules/Module;", "Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "definition", "Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "getDefinition", "()Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "getName", "()Ljava/lang/String;", "name", "<init>", "(Lexpo/modules/kotlin/modules/Module;)V", "expo-modules-core_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public final class ModuleHolder {
    private final ModuleDefinitionData definition;
    private final Module module;

    public ModuleHolder(Module module) {
        s.g(module, "module");
        this.module = module;
        this.definition = module.definition();
    }

    public final void call(String methodName, ReadableArray args, Promise promise) {
        s.g(methodName, "methodName");
        s.g(args, "args");
        s.g(promise, "promise");
        try {
            AnyFunction anyFunction = getDefinition().getMethods().get(methodName);
            if (anyFunction != null) {
                anyFunction.call(this, args, promise);
                b0 b0Var = b0.f54756a;
                return;
            }
            throw new MethodNotFoundException();
        } catch (CodedException e11) {
            throw new FunctionCallException(methodName, getDefinition().getName(), e11);
        } catch (Throwable th2) {
            throw new FunctionCallException(methodName, getDefinition().getName(), new UnexpectedException(th2));
        }
    }

    public final void cleanUp() {
        this.module.cleanUp$expo_modules_core_release();
    }

    public final ModuleDefinitionData getDefinition() {
        return this.definition;
    }

    public final Module getModule() {
        return this.module;
    }

    public final String getName() {
        return this.definition.getName();
    }

    public final void post(EventName eventName) {
        s.g(eventName, "eventName");
        EventListener eventListener = this.definition.getEventListeners().get(eventName);
        if (eventListener == null) {
            return;
        }
        BasicEventListener basicEventListener = eventListener instanceof BasicEventListener ? (BasicEventListener) eventListener : null;
        if (basicEventListener == null) {
            return;
        }
        basicEventListener.call();
    }

    public final <Payload> void post(EventName eventName, Payload payload) {
        s.g(eventName, "eventName");
        EventListener eventListener = this.definition.getEventListeners().get(eventName);
        if (eventListener == null) {
            return;
        }
        EventListenerWithPayload eventListenerWithPayload = eventListener instanceof EventListenerWithPayload ? (EventListenerWithPayload) eventListener : null;
        if (eventListenerWithPayload == null) {
            return;
        }
        eventListenerWithPayload.call(payload);
    }

    public final <Sender, Payload> void post(EventName eventName, Sender sender, Payload payload) {
        s.g(eventName, "eventName");
        EventListener eventListener = this.definition.getEventListeners().get(eventName);
        if (eventListener == null) {
            return;
        }
        EventListenerWithSenderAndPayload eventListenerWithSenderAndPayload = eventListener instanceof EventListenerWithSenderAndPayload ? (EventListenerWithSenderAndPayload) eventListener : null;
        if (eventListenerWithSenderAndPayload == null) {
            return;
        }
        eventListenerWithSenderAndPayload.call(sender, payload);
    }
}