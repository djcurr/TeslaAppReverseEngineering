package fd;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import md.k;

/* loaded from: classes.dex */
public class b implements a {

    /* renamed from: a  reason: collision with root package name */
    private final File f26203a;

    private b(File file) {
        this.f26203a = (File) k.g(file);
    }

    public static b b(File file) {
        return new b(file);
    }

    public static b c(File file) {
        if (file != null) {
            return new b(file);
        }
        return null;
    }

    @Override // fd.a
    public InputStream a() {
        return new FileInputStream(this.f26203a);
    }

    public File d() {
        return this.f26203a;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof b)) {
            return false;
        }
        return this.f26203a.equals(((b) obj).f26203a);
    }

    public int hashCode() {
        return this.f26203a.hashCode();
    }

    @Override // fd.a
    public long size() {
        return this.f26203a.length();
    }
}