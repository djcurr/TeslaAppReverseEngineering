package ch.qos.logback.core.rolling.helper;

import java.io.File;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
abstract class PathPart {
    String part;

    /* JADX INFO: Access modifiers changed from: package-private */
    public PathPart(String str) {
        this.part = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract List<File> listFiles(FileProvider fileProvider);

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<File> listFiles(FileProvider fileProvider, String str) {
        File[] listFiles = fileProvider.listFiles(new File(str).getAbsoluteFile(), null);
        if (listFiles == null) {
            listFiles = new File[0];
        }
        return Arrays.asList(listFiles);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean matches(File file);
}