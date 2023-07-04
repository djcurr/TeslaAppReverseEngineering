package y10;

import ch.qos.logback.classic.spi.CallerData;
import java.util.Arrays;
import k20.k0;

/* loaded from: classes5.dex */
public final class e extends o<Character> {
    public e(char c11) {
        super(Character.valueOf(c11));
    }

    private final String c(char c11) {
        return c11 == '\b' ? "\\b" : c11 == '\t' ? "\\t" : c11 == '\n' ? "\\n" : c11 == '\f' ? "\\f" : c11 == '\r' ? "\\r" : e(c11) ? String.valueOf(c11) : CallerData.NA;
    }

    private final boolean e(char c11) {
        byte type = (byte) Character.getType(c11);
        return (type == 0 || type == 13 || type == 14 || type == 15 || type == 16 || type == 18 || type == 19) ? false : true;
    }

    @Override // y10.g
    /* renamed from: d */
    public k0 a(w00.x module) {
        kotlin.jvm.internal.s.g(module, "module");
        k0 u11 = module.l().u();
        kotlin.jvm.internal.s.f(u11, "module.builtIns.charType");
        return u11;
    }

    @Override // y10.g
    public String toString() {
        String format = String.format("\\u%04X ('%s')", Arrays.copyOf(new Object[]{Integer.valueOf(b().charValue()), c(b().charValue())}, 2));
        kotlin.jvm.internal.s.f(format, "java.lang.String.format(this, *args)");
        return format;
    }
}