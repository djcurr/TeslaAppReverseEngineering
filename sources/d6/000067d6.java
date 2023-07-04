package eh;

import android.content.Context;
import android.util.Log;
import com.getkeepsafe.relinker.MissingLibraryException;
import eh.b;
import fh.i;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* loaded from: classes3.dex */
public class c {

    /* renamed from: a */
    protected final Set<String> f25095a;

    /* renamed from: b */
    protected final b.InterfaceC0486b f25096b;

    /* renamed from: c */
    protected final b.a f25097c;

    /* renamed from: d */
    protected boolean f25098d;

    /* renamed from: e */
    protected boolean f25099e;

    /* renamed from: f */
    protected b.d f25100f;

    /* loaded from: classes3.dex */
    public class a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Context f25101a;

        /* renamed from: b */
        final /* synthetic */ String f25102b;

        /* renamed from: c */
        final /* synthetic */ String f25103c;

        /* renamed from: d */
        final /* synthetic */ b.c f25104d;

        a(Context context, String str, String str2, b.c cVar) {
            c.this = r1;
            this.f25101a = context;
            this.f25102b = str;
            this.f25103c = str2;
            this.f25104d = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                c.this.g(this.f25101a, this.f25102b, this.f25103c);
                this.f25104d.a();
            } catch (MissingLibraryException e11) {
                this.f25104d.b(e11);
            } catch (UnsatisfiedLinkError e12) {
                this.f25104d.b(e12);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class b implements FilenameFilter {

        /* renamed from: a */
        final /* synthetic */ String f25106a;

        b(c cVar, String str) {
            this.f25106a = str;
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return str.startsWith(this.f25106a);
        }
    }

    public c() {
        this(new d(), new eh.a());
    }

    public void g(Context context, String str, String str2) {
        i iVar;
        if (this.f25095a.contains(str) && !this.f25098d) {
            i("%s already loaded previously!", str);
            return;
        }
        try {
            this.f25096b.a(str);
            this.f25095a.add(str);
            i("%s (%s) was loaded normally!", str, str2);
        } catch (UnsatisfiedLinkError e11) {
            i("Loading the library normally failed: %s", Log.getStackTraceString(e11));
            i("%s (%s) was not loaded normally, re-linking...", str, str2);
            File d11 = d(context, str, str2);
            if (!d11.exists() || this.f25098d) {
                if (this.f25098d) {
                    i("Forcing a re-link of %s (%s)...", str, str2);
                }
                b(context, str, str2);
                this.f25097c.a(context, this.f25096b.d(), this.f25096b.b(str), d11, this);
            }
            try {
                if (this.f25099e) {
                    i iVar2 = null;
                    try {
                        iVar = new i(d11);
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    try {
                        List<String> j11 = iVar.j();
                        iVar.close();
                        for (String str3 : j11) {
                            e(context, this.f25096b.c(str3));
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        iVar2 = iVar;
                        iVar2.close();
                        throw th;
                    }
                }
            } catch (IOException unused) {
            }
            this.f25096b.e(d11.getAbsolutePath());
            this.f25095a.add(str);
            i("%s (%s) was re-linked!", str, str2);
        }
    }

    protected void b(Context context, String str, String str2) {
        File c11 = c(context);
        File d11 = d(context, str, str2);
        File[] listFiles = c11.listFiles(new b(this, this.f25096b.b(str)));
        if (listFiles == null) {
            return;
        }
        for (File file : listFiles) {
            if (this.f25098d || !file.getAbsolutePath().equals(d11.getAbsolutePath())) {
                file.delete();
            }
        }
    }

    protected File c(Context context) {
        return context.getDir("lib", 0);
    }

    protected File d(Context context, String str, String str2) {
        String b11 = this.f25096b.b(str);
        if (e.a(str2)) {
            return new File(c(context), b11);
        }
        File c11 = c(context);
        return new File(c11, b11 + "." + str2);
    }

    public void e(Context context, String str) {
        f(context, str, null, null);
    }

    public void f(Context context, String str, String str2, b.c cVar) {
        if (context != null) {
            if (!e.a(str)) {
                i("Beginning load of %s...", str);
                if (cVar == null) {
                    g(context, str, str2);
                    return;
                } else {
                    new Thread(new a(context, str, str2, cVar)).start();
                    return;
                }
            }
            throw new IllegalArgumentException("Given library is either null or empty");
        }
        throw new IllegalArgumentException("Given context is null");
    }

    public void h(String str) {
        b.d dVar = this.f25100f;
        if (dVar != null) {
            dVar.log(str);
        }
    }

    public void i(String str, Object... objArr) {
        h(String.format(Locale.US, str, objArr));
    }

    protected c(b.InterfaceC0486b interfaceC0486b, b.a aVar) {
        this.f25095a = new HashSet();
        if (interfaceC0486b == null) {
            throw new IllegalArgumentException("Cannot pass null library loader");
        }
        if (aVar != null) {
            this.f25096b = interfaceC0486b;
            this.f25097c = aVar;
            return;
        }
        throw new IllegalArgumentException("Cannot pass null library installer");
    }
}