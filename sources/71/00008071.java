package kotlinx.serialization.json.internal;

import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class JsonEncodingException extends JsonException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonEncodingException(String message) {
        super(message);
        s.g(message, "message");
    }
}