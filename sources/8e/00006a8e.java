package expo.modules.kotlin.exception;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import n00.p;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lexpo/modules/kotlin/exception/IncompatibleArgTypeException;", "Lexpo/modules/kotlin/exception/CodedException;", "Ln00/p;", "argumentType", "desiredType", "", "cause", "<init>", "(Ln00/p;Ln00/p;Ljava/lang/Throwable;)V", "expo-modules-core_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public final class IncompatibleArgTypeException extends CodedException {
    public /* synthetic */ IncompatibleArgTypeException(p pVar, p pVar2, Throwable th2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(pVar, pVar2, (i11 & 4) != 0 ? null : th2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IncompatibleArgTypeException(p argumentType, p desiredType, Throwable th2) {
        super("Argument type '" + argumentType + "' is not compatible with expected type '" + desiredType + "'.", th2);
        s.g(argumentType, "argumentType");
        s.g(desiredType, "desiredType");
    }
}