package ld;

import java.io.File;

/* loaded from: classes.dex */
public class a {
    public static boolean a(File file) {
        File[] listFiles = file.listFiles();
        boolean z11 = true;
        if (listFiles != null) {
            for (File file2 : listFiles) {
                z11 &= b(file2);
            }
        }
        return z11;
    }

    public static boolean b(File file) {
        if (file.isDirectory()) {
            a(file);
        }
        return file.delete();
    }

    public static void c(File file, b bVar) {
        bVar.c(file);
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    c(file2, bVar);
                } else {
                    bVar.b(file2);
                }
            }
        }
        bVar.a(file);
    }
}