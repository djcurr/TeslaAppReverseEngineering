package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

/* loaded from: classes5.dex */
public class i {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f35020a;

    /* loaded from: classes5.dex */
    public interface a {
        int getNumber();
    }

    /* loaded from: classes5.dex */
    public interface b<T extends a> {
        T findValueByNumber(int i11);
    }

    static {
        byte[] bArr = new byte[0];
        f35020a = bArr;
        ByteBuffer.wrap(bArr);
    }

    public static boolean a(byte[] bArr) {
        return v.e(bArr);
    }

    public static String b(byte[] bArr) {
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e11) {
            throw new RuntimeException("UTF-8 not supported?", e11);
        }
    }
}