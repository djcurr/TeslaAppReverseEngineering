package ji;

import android.net.Uri;
import com.google.android.exoplayer2.extractor.Extractor;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import ti.a0;
import ti.h0;

/* loaded from: classes3.dex */
public final class f implements l {

    /* renamed from: l  reason: collision with root package name */
    private static final int[] f33728l = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 14};

    /* renamed from: m  reason: collision with root package name */
    private static final Constructor<? extends h> f33729m;

    /* renamed from: a  reason: collision with root package name */
    private boolean f33730a;

    /* renamed from: b  reason: collision with root package name */
    private int f33731b;

    /* renamed from: c  reason: collision with root package name */
    private int f33732c;

    /* renamed from: d  reason: collision with root package name */
    private int f33733d;

    /* renamed from: e  reason: collision with root package name */
    private int f33734e;

    /* renamed from: f  reason: collision with root package name */
    private int f33735f;

    /* renamed from: g  reason: collision with root package name */
    private int f33736g;

    /* renamed from: h  reason: collision with root package name */
    private int f33737h;

    /* renamed from: j  reason: collision with root package name */
    private int f33739j;

    /* renamed from: i  reason: collision with root package name */
    private int f33738i = 1;

    /* renamed from: k  reason: collision with root package name */
    private int f33740k = 112800;

    static {
        Constructor<? extends h> constructor = null;
        try {
            if (Boolean.TRUE.equals(Class.forName("com.google.android.exoplayer2.ext.flac.FlacLibrary").getMethod("isAvailable", new Class[0]).invoke(null, new Object[0]))) {
                constructor = Class.forName("com.google.android.exoplayer2.ext.flac.FlacExtractor").asSubclass(h.class).getConstructor(Integer.TYPE);
            }
        } catch (ClassNotFoundException unused) {
        } catch (Exception e11) {
            throw new RuntimeException("Error instantiating FLAC extension", e11);
        }
        f33729m = constructor;
    }

    private void c(int i11, List<h> list) {
        switch (i11) {
            case 0:
                list.add(new ti.b());
                return;
            case 1:
                list.add(new ti.e());
                return;
            case 2:
                list.add(new ti.h(this.f33731b | (this.f33730a ? 1 : 0)));
                return;
            case 3:
                list.add(new ki.b(this.f33732c | (this.f33730a ? 1 : 0)));
                return;
            case 4:
                Constructor<? extends h> constructor = f33729m;
                if (constructor != null) {
                    try {
                        list.add(constructor.newInstance(Integer.valueOf(this.f33733d)));
                        return;
                    } catch (Exception e11) {
                        throw new IllegalStateException("Unexpected error creating FLAC extractor", e11);
                    }
                }
                list.add(new li.d(this.f33733d));
                return;
            case 5:
                list.add(new com.google.android.exoplayer2.extractor.flv.b());
                return;
            case 6:
                list.add(new oi.e(this.f33734e));
                return;
            case 7:
                list.add(new pi.f(this.f33737h | (this.f33730a ? 1 : 0)));
                return;
            case 8:
                list.add(new qi.g(this.f33736g));
                list.add(new qi.k(this.f33735f));
                return;
            case 9:
                list.add(new ri.d());
                return;
            case 10:
                list.add(new a0());
                return;
            case 11:
                list.add(new h0(this.f33738i, this.f33739j, this.f33740k));
                return;
            case 12:
                list.add(new ui.b());
                return;
            case 13:
            default:
                return;
            case 14:
                list.add(new ni.a());
                return;
        }
    }

    @Override // ji.l
    public synchronized Extractor[] a(Uri uri, Map<String, List<String>> map) {
        ArrayList arrayList;
        int[] iArr;
        arrayList = new ArrayList(14);
        int b11 = ak.h.b(map);
        if (b11 != -1) {
            c(b11, arrayList);
        }
        int c11 = ak.h.c(uri);
        if (c11 != -1 && c11 != b11) {
            c(c11, arrayList);
        }
        for (int i11 : f33728l) {
            if (i11 != b11 && i11 != c11) {
                c(i11, arrayList);
            }
        }
        return (h[]) arrayList.toArray(new h[arrayList.size()]);
    }

    @Override // ji.l
    public synchronized h[] b() {
        return a(Uri.EMPTY, new HashMap());
    }
}