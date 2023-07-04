package e00;

import java.io.File;
import kotlin.jvm.internal.s;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class i extends h {
    public static final e j(File file, kotlin.io.a direction) {
        s.g(file, "<this>");
        s.g(direction, "direction");
        return new e(file, direction);
    }

    public static final e k(File file) {
        s.g(file, "<this>");
        return j(file, kotlin.io.a.BOTTOM_UP);
    }
}