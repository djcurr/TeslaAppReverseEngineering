package kotlin.reflect.jvm.internal.impl.protobuf;

/* loaded from: classes5.dex */
public class UninitializedMessageException extends RuntimeException {
    public UninitializedMessageException(o oVar) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public InvalidProtocolBufferException a() {
        return new InvalidProtocolBufferException(getMessage());
    }
}