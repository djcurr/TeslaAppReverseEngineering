package expo.modules.kotlin.exception;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lexpo/modules/kotlin/exception/NullArgumentException;", "Lexpo/modules/kotlin/exception/CodedException;", "<init>", "()V", "expo-modules-core_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public final class NullArgumentException extends CodedException {
    public NullArgumentException() {
        super("Cannot assigned null to not nullable type.");
    }
}