package hu;

import java.io.ByteArrayOutputStream;
import kotlin.jvm.internal.s;
import kotlin.text.d;
import xt.l;

/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final ByteArrayOutputStream f29423a = new ByteArrayOutputStream();

    private final byte[] e(int i11) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(i11);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        s.f(byteArray, "ByteArrayOutputStream().…yteArray) }.toByteArray()");
        return byteArray;
    }

    public final void a(int i11, byte[] value) {
        s.g(value, "value");
        this.f29423a.write(i11);
        if (value.length <= 255) {
            this.f29423a.write(value.length);
            this.f29423a.write(value);
            return;
        }
        int length = value.length;
        throw new IllegalArgumentException("Tag " + i11 + " value has too many bytes " + length);
    }

    public final void b(l tag, int i11) {
        s.g(tag, "tag");
        a(tag.getValue(), e(i11));
    }

    public final void c(l tag, String value) {
        s.g(tag, "tag");
        s.g(value, "value");
        int value2 = tag.getValue();
        byte[] bytes = value.getBytes(d.f35187b);
        s.f(bytes, "(this as java.lang.String).getBytes(charset)");
        a(value2, bytes);
    }

    public final byte[] d() {
        ByteArrayOutputStream byteArrayOutputStream = this.f29423a;
        byteArrayOutputStream.write(255);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        s.f(byteArray, "data.apply {\n        // …55)\n      }.toByteArray()");
        return byteArray;
    }
}