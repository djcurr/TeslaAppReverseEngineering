package expo.modules.kotlin.exception;

import com.facebook.react.bridge.ReadableType;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import n00.p;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lexpo/modules/kotlin/exception/ArgumentCastException;", "Lexpo/modules/kotlin/exception/DecoratedException;", "Ln00/p;", "argDesiredType", "", "argIndex", "Lcom/facebook/react/bridge/ReadableType;", "providedType", "Lexpo/modules/kotlin/exception/CodedException;", "cause", "<init>", "(Ln00/p;ILcom/facebook/react/bridge/ReadableType;Lexpo/modules/kotlin/exception/CodedException;)V", "expo-modules-core_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public final class ArgumentCastException extends DecoratedException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArgumentCastException(p argDesiredType, int i11, ReadableType providedType, CodedException cause) {
        super("Argument at index '" + i11 + "' couldn't be casted to type '" + argDesiredType + "' (received '" + providedType + "').", cause);
        s.g(argDesiredType, "argDesiredType");
        s.g(providedType, "providedType");
        s.g(cause, "cause");
    }
}