package e00;

import java.io.File;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class c {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String b(File file, File file2, String str) {
        StringBuilder sb2 = new StringBuilder(file.toString());
        if (file2 != null) {
            sb2.append(" -> " + file2);
        }
        if (str != null) {
            sb2.append(": " + str);
        }
        String sb3 = sb2.toString();
        s.f(sb3, "sb.toString()");
        return sb3;
    }
}