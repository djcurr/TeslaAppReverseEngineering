package kotlinx.serialization.json.internal;

import kotlin.jvm.internal.s;
import kotlinx.serialization.SerializationException;

/* loaded from: classes5.dex */
public class JsonException extends SerializationException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonException(String message) {
        super(message);
        s.g(message, "message");
    }
}