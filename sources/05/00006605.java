package dm;

import android.content.Context;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    private final File f24198a;

    /* renamed from: b  reason: collision with root package name */
    private final File f24199b;

    /* renamed from: c  reason: collision with root package name */
    private final File f24200c;

    /* renamed from: d  reason: collision with root package name */
    private final File f24201d;

    /* renamed from: e  reason: collision with root package name */
    private final File f24202e;

    public f(Context context) {
        File p11 = p(new File(context.getFilesDir(), ".com.google.firebase.crashlytics.files.v1"));
        this.f24198a = p11;
        this.f24199b = p(new File(p11, "open-sessions"));
        this.f24200c = p(new File(p11, "reports"));
        this.f24201d = p(new File(p11, "priority-reports"));
        this.f24202e = p(new File(p11, "native-reports"));
    }

    private File m(String str) {
        return q(new File(this.f24199b, str));
    }

    private static synchronized File p(File file) {
        synchronized (f.class) {
            if (file.exists()) {
                if (file.isDirectory()) {
                    return file;
                }
                wl.f f11 = wl.f.f();
                f11.b("Unexpected non-directory file: " + file + "; deleting file and creating new directory.");
                file.delete();
            }
            if (file.mkdirs()) {
                return file;
            }
            throw new IllegalStateException("Could not create Crashlytics-specific directory: " + file);
        }
    }

    private static File q(File file) {
        file.mkdirs();
        return file;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean r(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                r(file2);
            }
        }
        return file.delete();
    }

    private static <T> List<T> s(T[] tArr) {
        return tArr == null ? Collections.emptyList() : Arrays.asList(tArr);
    }

    public void a() {
        File[] fileArr = {new File(this.f24198a.getParent(), ".com.google.firebase.crashlytics"), new File(this.f24198a.getParent(), ".com.google.firebase.crashlytics-ndk")};
        for (int i11 = 0; i11 < 2; i11++) {
            File file = fileArr[i11];
            if (file.exists() && r(file)) {
                wl.f f11 = wl.f.f();
                f11.b("Deleted legacy Crashlytics files from " + file.getPath());
            }
        }
    }

    public boolean b(String str) {
        return r(new File(this.f24199b, str));
    }

    public List<String> c() {
        return s(this.f24199b.list());
    }

    public File d(String str) {
        return new File(this.f24198a, str);
    }

    public List<File> e(FilenameFilter filenameFilter) {
        return s(this.f24198a.listFiles(filenameFilter));
    }

    public File f(String str) {
        return new File(this.f24202e, str);
    }

    public List<File> g() {
        return s(this.f24202e.listFiles());
    }

    public File h(String str) {
        return q(new File(m(str), "native"));
    }

    public File i(String str) {
        return new File(this.f24201d, str);
    }

    public List<File> j() {
        return s(this.f24201d.listFiles());
    }

    public File k(String str) {
        return new File(this.f24200c, str);
    }

    public List<File> l() {
        return s(this.f24200c.listFiles());
    }

    public File n(String str, String str2) {
        return new File(m(str), str2);
    }

    public List<File> o(String str, FilenameFilter filenameFilter) {
        return s(m(str).listFiles(filenameFilter));
    }
}