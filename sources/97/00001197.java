package ch.qos.logback.core.rolling.helper;

import java.io.File;
import java.util.List;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
class RegexPathPart extends PathPart {
    private Pattern pattern;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RegexPathPart(String str) {
        super(str);
        this.pattern = Pattern.compile(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // ch.qos.logback.core.rolling.helper.PathPart
    public List<File> listFiles(FileProvider fileProvider) {
        return listFiles(fileProvider, ".");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // ch.qos.logback.core.rolling.helper.PathPart
    public boolean matches(File file) {
        return this.pattern.matcher(file.getName()).find();
    }
}