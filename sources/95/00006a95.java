package expo.modules.kotlin.exception;

import kotlin.Metadata;
import kotlin.jvm.internal.s;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lexpo/modules/kotlin/exception/ValidationException;", "Lexpo/modules/kotlin/exception/CodedException;", "", "message", "<init>", "(Ljava/lang/String;)V", "expo-modules-core_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public final class ValidationException extends CodedException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ValidationException(String message) {
        super(message);
        s.g(message, "message");
    }
}