package com.facebook.soloader;

import android.os.StrictMode;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public class d extends q {

    /* renamed from: a */
    protected final File f12895a;

    /* renamed from: b */
    protected final int f12896b;

    /* renamed from: c */
    protected final List<String> f12897c;

    public d(File file, int i11) {
        this(file, i11, new String[0]);
    }

    private void g(String str, f fVar, int i11, StrictMode.ThreadPolicy threadPolicy) {
        String[] e11 = e(str, fVar);
        Log.d("SoLoader", "Loading lib dependencies: " + Arrays.toString(e11));
        for (String str2 : e11) {
            if (!str2.startsWith("/")) {
                SoLoader.r(str2, i11 | 1, threadPolicy);
            }
        }
    }

    @Override // com.facebook.soloader.q
    public int a(String str, int i11, StrictMode.ThreadPolicy threadPolicy) {
        return h(str, i11, this.f12895a, threadPolicy);
    }

    @Override // com.facebook.soloader.q
    public File c(String str) {
        return f(str);
    }

    protected f d(File file) {
        return new g(file);
    }

    protected String[] e(String str, f fVar) {
        boolean z11 = SoLoader.f12866a;
        if (z11) {
            Api18TraceUtils.a("SoLoader.getElfDependencies[", str, "]");
        }
        try {
            String[] a11 = n.a(str, fVar);
            if (z11) {
                Api18TraceUtils.b();
            }
            return a11;
        } catch (Throwable th2) {
            if (SoLoader.f12866a) {
                Api18TraceUtils.b();
            }
            throw th2;
        }
    }

    protected File f(String str) {
        File file = new File(this.f12895a, str);
        if (file.exists()) {
            return file;
        }
        return null;
    }

    public int h(String str, int i11, File file, StrictMode.ThreadPolicy threadPolicy) {
        if (SoLoader.f12867b != null) {
            if (this.f12897c.contains(str)) {
                Log.d("SoLoader", str + " is on the denyList, skip loading from " + file.getCanonicalPath());
                return 0;
            }
            File f11 = f(str);
            if (f11 == null) {
                Log.d("SoLoader", str + " not found on " + file.getCanonicalPath());
                return 0;
            }
            Log.d("SoLoader", str + " found on " + file.getCanonicalPath());
            if ((i11 & 1) != 0 && (this.f12896b & 2) != 0) {
                Log.d("SoLoader", str + " loaded implicitly");
                return 2;
            }
            f fVar = null;
            boolean z11 = (this.f12896b & 1) != 0;
            boolean equals = f11.getName().equals(str);
            if (z11 || !equals) {
                try {
                    fVar = d(f11);
                } catch (Throwable th2) {
                    if (fVar != null) {
                        fVar.close();
                    }
                    throw th2;
                }
            }
            if (z11) {
                g(str, fVar, i11, threadPolicy);
            } else {
                Log.d("SoLoader", "Not resolving dependencies for " + str);
            }
            try {
                if (equals) {
                    SoLoader.f12867b.a(f11.getAbsolutePath(), i11);
                } else {
                    SoLoader.f12867b.b(f11.getAbsolutePath(), fVar, i11);
                }
                if (fVar != null) {
                    fVar.close();
                }
                return 1;
            } catch (UnsatisfiedLinkError e11) {
                if (e11.getMessage().contains("bad ELF magic")) {
                    Log.d("SoLoader", "Corrupted lib file detected");
                    if (fVar != null) {
                        fVar.close();
                    }
                    return 3;
                }
                throw e11;
            }
        }
        throw new IllegalStateException("SoLoader.init() not yet called");
    }

    @Override // com.facebook.soloader.q
    public String toString() {
        String name;
        try {
            name = String.valueOf(this.f12895a.getCanonicalPath());
        } catch (IOException unused) {
            name = this.f12895a.getName();
        }
        return getClass().getName() + "[root = " + name + " flags = " + this.f12896b + ']';
    }

    public d(File file, int i11, String[] strArr) {
        this.f12895a = file;
        this.f12896b = i11;
        this.f12897c = Arrays.asList(strArr);
    }
}