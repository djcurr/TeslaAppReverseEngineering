package mq;

import ch.qos.logback.core.CoreConstants;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
final class i {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Object obj) {
        Class<?> cls = obj.getClass();
        String replace = cls.getName().replace(CoreConstants.DOT, '/');
        if (c(replace)) {
            return;
        }
        ClassLoader classLoader = cls.getClassLoader();
        b(classLoader.getResourceAsStream(replace + ".class"));
    }

    static void b(InputStream inputStream) {
        if (inputStream != null) {
            try {
                DataInputStream dataInputStream = new DataInputStream(inputStream);
                dataInputStream.readInt();
                int readUnsignedShort = dataInputStream.readUnsignedShort();
                dataInputStream.close();
                if (readUnsignedShort != 65535) {
                    throw new IllegalStateException("ASM9_EXPERIMENTAL can only be used by classes compiled with --enable-preview");
                }
                return;
            } catch (IOException e11) {
                throw new IllegalStateException("I/O error, can't check class version", e11);
            }
        }
        throw new IllegalStateException("Bytecode not available, can't check class version");
    }

    static boolean c(String str) {
        if (str.startsWith("com/nimbusds/jose/shaded/ow2asm/")) {
            if (!str.contains("Test$")) {
                if (!Pattern.matches("com/nimbusds/jose/shaded/ow2asm/util/Trace(Annotation|Class|Field|Method|Module|RecordComponent|Signature)Visitor(\\$.*)?", str)) {
                    if (!Pattern.matches("com/nimbusds/jose/shaded/ow2asm/util/Check(Annotation|Class|Field|Method|Module|RecordComponent|Signature)Adapter(\\$.*)?", str)) {
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }
}