package e00;

import ch.qos.logback.core.CoreConstants;
import java.io.File;
import kotlin.jvm.internal.s;
import kotlin.text.w;

/* loaded from: classes5.dex */
public class j extends i {
    public static boolean l(File file) {
        s.g(file, "<this>");
        while (true) {
            boolean z11 = true;
            for (File file2 : i.k(file)) {
                if (file2.delete() || !file2.exists()) {
                    if (z11) {
                        break;
                    }
                }
                z11 = false;
            }
            return z11;
        }
    }

    public static String m(File file) {
        String Q0;
        s.g(file, "<this>");
        String name = file.getName();
        s.f(name, "name");
        Q0 = w.Q0(name, CoreConstants.DOT, "");
        return Q0;
    }

    public static String n(File file) {
        String b12;
        s.g(file, "<this>");
        String name = file.getName();
        s.f(name, "name");
        b12 = w.b1(name, ".", null, 2, null);
        return b12;
    }
}