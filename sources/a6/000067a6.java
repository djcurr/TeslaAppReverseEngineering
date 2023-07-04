package e8;

import android.util.Pair;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipInputStream;
import v7.k;

/* loaded from: classes.dex */
public class h {

    /* renamed from: a */
    private final g f24964a;

    /* renamed from: b */
    private final f f24965b;

    public h(g gVar, f fVar) {
        this.f24964a = gVar;
        this.f24965b = fVar;
    }

    private v7.d a(String str, String str2) {
        Pair<c, InputStream> a11;
        k<v7.d> i11;
        if (str2 == null || (a11 = this.f24964a.a(str)) == null) {
            return null;
        }
        c cVar = (c) a11.first;
        InputStream inputStream = (InputStream) a11.second;
        if (cVar == c.ZIP) {
            i11 = v7.e.s(new ZipInputStream(inputStream), str);
        } else {
            i11 = v7.e.i(inputStream, str);
        }
        if (i11.b() != null) {
            return i11.b();
        }
        return null;
    }

    private k<v7.d> b(String str, String str2) {
        h8.d.a("Fetching " + str);
        Closeable closeable = null;
        try {
            try {
                d a11 = this.f24965b.a(str);
                if (a11.isSuccessful()) {
                    k<v7.d> d11 = d(str, a11.Y(), a11.U(), str2);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Completed fetch from network. Success: ");
                    sb2.append(d11.b() != null);
                    h8.d.a(sb2.toString());
                    try {
                        a11.close();
                    } catch (IOException e11) {
                        h8.d.d("LottieFetchResult close failed ", e11);
                    }
                    return d11;
                }
                k<v7.d> kVar = new k<>(new IllegalArgumentException(a11.Y0()));
                try {
                    a11.close();
                } catch (IOException e12) {
                    h8.d.d("LottieFetchResult close failed ", e12);
                }
                return kVar;
            } catch (Exception e13) {
                k<v7.d> kVar2 = new k<>(e13);
                if (0 != 0) {
                    try {
                        closeable.close();
                    } catch (IOException e14) {
                        h8.d.d("LottieFetchResult close failed ", e14);
                    }
                }
                return kVar2;
            }
        } catch (Throwable th2) {
            if (0 != 0) {
                try {
                    closeable.close();
                } catch (IOException e15) {
                    h8.d.d("LottieFetchResult close failed ", e15);
                }
            }
            throw th2;
        }
    }

    private k<v7.d> d(String str, InputStream inputStream, String str2, String str3) {
        c cVar;
        k<v7.d> f11;
        if (str2 == null) {
            str2 = "application/json";
        }
        if (!str2.contains("application/zip") && !str2.contains("application/x-zip") && !str2.contains("application/x-zip-compressed") && !str.split("\\?")[0].endsWith(".lottie")) {
            h8.d.a("Received json response.");
            cVar = c.JSON;
            f11 = e(str, inputStream, str3);
        } else {
            h8.d.a("Handling zip response.");
            cVar = c.ZIP;
            f11 = f(str, inputStream, str3);
        }
        if (str3 != null && f11.b() != null) {
            this.f24964a.e(str, cVar);
        }
        return f11;
    }

    private k<v7.d> e(String str, InputStream inputStream, String str2) {
        if (str2 == null) {
            return v7.e.i(inputStream, null);
        }
        return v7.e.i(new FileInputStream(this.f24964a.f(str, inputStream, c.JSON).getAbsolutePath()), str);
    }

    private k<v7.d> f(String str, InputStream inputStream, String str2) {
        if (str2 == null) {
            return v7.e.s(new ZipInputStream(inputStream), null);
        }
        return v7.e.s(new ZipInputStream(new FileInputStream(this.f24964a.f(str, inputStream, c.ZIP))), str);
    }

    public k<v7.d> c(String str, String str2) {
        v7.d a11 = a(str, str2);
        if (a11 != null) {
            return new k<>(a11);
        }
        h8.d.a("Animation for " + str + " not found in cache. Fetching from network.");
        return b(str, str2);
    }
}