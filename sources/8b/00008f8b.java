package okio;

/* loaded from: classes5.dex */
public final class b {
    public static final byte[] a(String asUtf8ToByteArray) {
        kotlin.jvm.internal.s.g(asUtf8ToByteArray, "$this$asUtf8ToByteArray");
        byte[] bytes = asUtf8ToByteArray.getBytes(kotlin.text.d.f35187b);
        kotlin.jvm.internal.s.f(bytes, "(this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    public static final String b(byte[] toUtf8String) {
        kotlin.jvm.internal.s.g(toUtf8String, "$this$toUtf8String");
        return new String(toUtf8String, kotlin.text.d.f35187b);
    }
}