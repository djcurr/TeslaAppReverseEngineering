package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class InvalidModuleException extends IllegalStateException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvalidModuleException(String message) {
        super(message);
        s.g(message, "message");
    }
}