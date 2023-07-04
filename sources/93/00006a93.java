package expo.modules.kotlin.exception;

import kotlin.Metadata;
import kotlin.jvm.internal.s;
import n00.p;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lexpo/modules/kotlin/exception/RecordCastException;", "Lexpo/modules/kotlin/exception/DecoratedException;", "Ln00/p;", "recordType", "Lexpo/modules/kotlin/exception/CodedException;", "cause", "<init>", "(Ln00/p;Lexpo/modules/kotlin/exception/CodedException;)V", "expo-modules-core_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public final class RecordCastException extends DecoratedException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecordCastException(p recordType, CodedException cause) {
        super("Cannot create a record of the type: '" + recordType + "'.", cause);
        s.g(recordType, "recordType");
        s.g(cause, "cause");
    }
}