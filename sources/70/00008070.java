package kotlinx.serialization.json.internal;

import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class JsonDecodingException extends JsonException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonDecodingException(String message) {
        super(message);
        s.g(message, "message");
    }
}