package h30;

import kotlin.KotlinNothingValueException;
import kotlinx.serialization.json.internal.JsonDecodingException;
import kotlinx.serialization.json.internal.JsonEncodingException;

/* loaded from: classes5.dex */
public final class o {
    public static final JsonDecodingException a(Number value, String key, String output) {
        kotlin.jvm.internal.s.g(value, "value");
        kotlin.jvm.internal.s.g(key, "key");
        kotlin.jvm.internal.s.g(output, "output");
        return e(-1, k(value, key, output));
    }

    public static final JsonEncodingException b(Number value, String output) {
        kotlin.jvm.internal.s.g(value, "value");
        kotlin.jvm.internal.s.g(output, "output");
        return new JsonEncodingException("Unexpected special floating-point value " + value + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) i(output, 0, 1, null)));
    }

    public static final JsonEncodingException c(Number value, String key, String output) {
        kotlin.jvm.internal.s.g(value, "value");
        kotlin.jvm.internal.s.g(key, "key");
        kotlin.jvm.internal.s.g(output, "output");
        return new JsonEncodingException(k(value, key, output));
    }

    public static final JsonEncodingException d(e30.f keyDescriptor) {
        kotlin.jvm.internal.s.g(keyDescriptor, "keyDescriptor");
        return new JsonEncodingException("Value of type '" + keyDescriptor.h() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + keyDescriptor.getKind() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }

    public static final JsonDecodingException e(int i11, String message) {
        kotlin.jvm.internal.s.g(message, "message");
        if (i11 >= 0) {
            message = "Unexpected JSON token at offset " + i11 + ": " + message;
        }
        return new JsonDecodingException(message);
    }

    public static final JsonDecodingException f(int i11, String message, CharSequence input) {
        kotlin.jvm.internal.s.g(message, "message");
        kotlin.jvm.internal.s.g(input, "input");
        return e(i11, message + "\nJSON input: " + ((Object) h(input, i11)));
    }

    public static final JsonDecodingException g(String key, String input) {
        kotlin.jvm.internal.s.g(key, "key");
        kotlin.jvm.internal.s.g(input, "input");
        return e(-1, "Encountered unknown key '" + key + "'.\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.\nCurrent input: " + ((Object) i(input, 0, 1, null)));
    }

    private static final CharSequence h(CharSequence charSequence, int i11) {
        int d11;
        int i12;
        int length;
        if (charSequence.length() < 200) {
            return charSequence;
        }
        if (i11 == -1) {
            if (charSequence.length() - 60 <= 0) {
                return charSequence;
            }
            return "....." + charSequence.subSequence(length, charSequence.length()).toString();
        }
        int i13 = i11 - 30;
        int i14 = i11 + 30;
        String str = i13 <= 0 ? "" : ".....";
        String str2 = i14 >= charSequence.length() ? "" : ".....";
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        d11 = m00.l.d(i13, 0);
        i12 = m00.l.i(i14, charSequence.length());
        sb2.append(charSequence.subSequence(d11, i12).toString());
        sb2.append(str2);
        return sb2.toString();
    }

    static /* synthetic */ CharSequence i(CharSequence charSequence, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = -1;
        }
        return h(charSequence, i11);
    }

    public static final Void j(a aVar, Number result) {
        kotlin.jvm.internal.s.g(aVar, "<this>");
        kotlin.jvm.internal.s.g(result, "result");
        a.x(aVar, "Unexpected special floating-point value " + result + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2, null);
        throw new KotlinNothingValueException();
    }

    private static final String k(Number number, String str, String str2) {
        return "Unexpected special floating-point value " + number + " with key " + str + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) i(str2, 0, 1, null));
    }
}