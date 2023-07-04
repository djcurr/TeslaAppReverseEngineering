package h30;

import ch.qos.logback.core.CoreConstants;

/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f28839a;

    /* renamed from: b  reason: collision with root package name */
    public static final char[] f28840b;

    /* renamed from: c  reason: collision with root package name */
    public static final byte[] f28841c;

    static {
        f fVar = new f();
        f28839a = fVar;
        f28840b = new char[117];
        f28841c = new byte[126];
        fVar.f();
        fVar.e();
    }

    private f() {
    }

    private final void a(char c11, char c12) {
        b(c11, c12);
    }

    private final void b(int i11, char c11) {
        if (c11 != 'u') {
            f28840b[c11] = (char) i11;
        }
    }

    private final void c(char c11, byte b11) {
        d(c11, b11);
    }

    private final void d(int i11, byte b11) {
        f28841c[i11] = b11;
    }

    private final void e() {
        for (int i11 = 0; i11 < 33; i11++) {
            d(i11, Byte.MAX_VALUE);
        }
        d(9, (byte) 3);
        d(10, (byte) 3);
        d(13, (byte) 3);
        d(32, (byte) 3);
        c(CoreConstants.COMMA_CHAR, (byte) 4);
        c(CoreConstants.COLON_CHAR, (byte) 5);
        c(CoreConstants.CURLY_LEFT, (byte) 6);
        c(CoreConstants.CURLY_RIGHT, (byte) 7);
        c('[', (byte) 8);
        c(']', (byte) 9);
        c(CoreConstants.DOUBLE_QUOTE_CHAR, (byte) 1);
        c(CoreConstants.ESCAPE_CHAR, (byte) 2);
    }

    private final void f() {
        for (int i11 = 0; i11 < 32; i11++) {
            b(i11, 'u');
        }
        b(8, 'b');
        b(9, 't');
        b(10, 'n');
        b(12, 'f');
        b(13, 'r');
        a('/', '/');
        a(CoreConstants.DOUBLE_QUOTE_CHAR, CoreConstants.DOUBLE_QUOTE_CHAR);
        a(CoreConstants.ESCAPE_CHAR, CoreConstants.ESCAPE_CHAR);
    }
}