package ch.qos.logback.core.rolling.helper;

import java.io.File;
import java.util.List;

/* loaded from: classes.dex */
class LiteralPathPart extends PathPart {
    /* JADX INFO: Access modifiers changed from: package-private */
    public LiteralPathPart(String str) {
        super(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // ch.qos.logback.core.rolling.helper.PathPart
    public List<File> listFiles(FileProvider fileProvider) {
        return listFiles(fileProvider, this.part);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // ch.qos.logback.core.rolling.helper.PathPart
    public boolean matches(File file) {
        return file.getName().equals(this.part);
    }
}