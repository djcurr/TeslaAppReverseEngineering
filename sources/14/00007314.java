package hd;

import gd.a;
import gd.c;
import hd.d;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import md.k;
import rd.a;

/* loaded from: classes.dex */
public class e implements i, jd.a {

    /* renamed from: q  reason: collision with root package name */
    private static final Class<?> f29074q = e.class;

    /* renamed from: r  reason: collision with root package name */
    private static final long f29075r = TimeUnit.HOURS.toMillis(2);

    /* renamed from: s  reason: collision with root package name */
    private static final long f29076s = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: a  reason: collision with root package name */
    private final long f29077a;

    /* renamed from: b  reason: collision with root package name */
    private final long f29078b;

    /* renamed from: c  reason: collision with root package name */
    private final CountDownLatch f29079c;

    /* renamed from: d  reason: collision with root package name */
    private long f29080d;

    /* renamed from: e  reason: collision with root package name */
    private final gd.c f29081e;

    /* renamed from: f  reason: collision with root package name */
    final Set<String> f29082f;

    /* renamed from: g  reason: collision with root package name */
    private long f29083g;

    /* renamed from: h  reason: collision with root package name */
    private final rd.a f29084h;

    /* renamed from: i  reason: collision with root package name */
    private final d f29085i;

    /* renamed from: j  reason: collision with root package name */
    private final h f29086j;

    /* renamed from: k  reason: collision with root package name */
    private final gd.a f29087k;

    /* renamed from: l  reason: collision with root package name */
    private final boolean f29088l;

    /* renamed from: m  reason: collision with root package name */
    private final b f29089m;

    /* renamed from: n  reason: collision with root package name */
    private final td.a f29090n;

    /* renamed from: o  reason: collision with root package name */
    private final Object f29091o = new Object();

    /* renamed from: p  reason: collision with root package name */
    private boolean f29092p;

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (e.this.f29091o) {
                e.this.p();
            }
            e.this.f29092p = true;
            e.this.f29079c.countDown();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private boolean f29094a = false;

        /* renamed from: b  reason: collision with root package name */
        private long f29095b = -1;

        /* renamed from: c  reason: collision with root package name */
        private long f29096c = -1;

        b() {
        }

        public synchronized long a() {
            return this.f29096c;
        }

        public synchronized long b() {
            return this.f29095b;
        }

        public synchronized void c(long j11, long j12) {
            if (this.f29094a) {
                this.f29095b += j11;
                this.f29096c += j12;
            }
        }

        public synchronized boolean d() {
            return this.f29094a;
        }

        public synchronized void e() {
            this.f29094a = false;
            this.f29096c = -1L;
            this.f29095b = -1L;
        }

        public synchronized void f(long j11, long j12) {
            this.f29096c = j12;
            this.f29095b = j11;
            this.f29094a = true;
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final long f29097a;

        /* renamed from: b  reason: collision with root package name */
        public final long f29098b;

        /* renamed from: c  reason: collision with root package name */
        public final long f29099c;

        public c(long j11, long j12, long j13) {
            this.f29097a = j11;
            this.f29098b = j12;
            this.f29099c = j13;
        }
    }

    public e(d dVar, h hVar, c cVar, gd.c cVar2, gd.a aVar, jd.b bVar, Executor executor, boolean z11) {
        this.f29077a = cVar.f29098b;
        long j11 = cVar.f29099c;
        this.f29078b = j11;
        this.f29080d = j11;
        this.f29084h = rd.a.d();
        this.f29085i = dVar;
        this.f29086j = hVar;
        this.f29083g = -1L;
        this.f29081e = cVar2;
        this.f29087k = aVar;
        this.f29089m = new b();
        this.f29090n = td.c.a();
        this.f29088l = z11;
        this.f29082f = new HashSet();
        if (bVar != null) {
            bVar.a(this);
        }
        if (z11) {
            this.f29079c = new CountDownLatch(1);
            executor.execute(new a());
            return;
        }
        this.f29079c = new CountDownLatch(0);
    }

    private fd.a l(d.b bVar, gd.d dVar, String str) {
        fd.a g11;
        synchronized (this.f29091o) {
            g11 = bVar.g(dVar);
            this.f29082f.add(str);
            this.f29089m.c(g11.size(), 1L);
        }
        return g11;
    }

    private void m(long j11, c.a aVar) {
        try {
            Collection<d.a> n11 = n(this.f29085i.getEntries());
            long b11 = this.f29089m.b();
            long j12 = b11 - j11;
            int i11 = 0;
            long j13 = 0;
            for (d.a aVar2 : n11) {
                if (j13 > j12) {
                    break;
                }
                long d11 = this.f29085i.d(aVar2);
                this.f29082f.remove(aVar2.getId());
                if (d11 > 0) {
                    i11++;
                    j13 += d11;
                    j e11 = j.a().j(aVar2.getId()).g(aVar).i(d11).f(b11 - j13).e(j11);
                    this.f29081e.c(e11);
                    e11.b();
                }
            }
            this.f29089m.c(-j13, -i11);
            this.f29085i.b();
        } catch (IOException e12) {
            gd.a aVar3 = this.f29087k;
            a.EnumC0528a enumC0528a = a.EnumC0528a.EVICTION;
            Class<?> cls = f29074q;
            aVar3.a(enumC0528a, cls, "evictAboveSize: " + e12.getMessage(), e12);
            throw e12;
        }
    }

    private Collection<d.a> n(Collection<d.a> collection) {
        long now = this.f29090n.now() + f29075r;
        ArrayList arrayList = new ArrayList(collection.size());
        ArrayList arrayList2 = new ArrayList(collection.size());
        for (d.a aVar : collection) {
            if (aVar.getTimestamp() > now) {
                arrayList.add(aVar);
            } else {
                arrayList2.add(aVar);
            }
        }
        Collections.sort(arrayList2, this.f29086j.get());
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    private void o() {
        synchronized (this.f29091o) {
            boolean p11 = p();
            s();
            long b11 = this.f29089m.b();
            if (b11 > this.f29080d && !p11) {
                this.f29089m.e();
                p();
            }
            long j11 = this.f29080d;
            if (b11 > j11) {
                m((j11 * 9) / 10, c.a.CACHE_FULL);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean p() {
        long now = this.f29090n.now();
        if (this.f29089m.d()) {
            long j11 = this.f29083g;
            if (j11 != -1 && now - j11 <= f29076s) {
                return false;
            }
        }
        return q();
    }

    private boolean q() {
        Set<String> hashSet;
        long j11;
        long now = this.f29090n.now();
        long j12 = f29075r + now;
        if (this.f29088l && this.f29082f.isEmpty()) {
            hashSet = this.f29082f;
        } else {
            hashSet = this.f29088l ? new HashSet<>() : null;
        }
        try {
            long j13 = 0;
            long j14 = -1;
            int i11 = 0;
            boolean z11 = false;
            int i12 = 0;
            int i13 = 0;
            for (d.a aVar : this.f29085i.getEntries()) {
                i12++;
                j13 += aVar.a();
                if (aVar.getTimestamp() > j12) {
                    i13++;
                    i11 = (int) (i11 + aVar.a());
                    j11 = j12;
                    j14 = Math.max(aVar.getTimestamp() - now, j14);
                    z11 = true;
                } else {
                    j11 = j12;
                    if (this.f29088l) {
                        k.g(hashSet);
                        hashSet.add(aVar.getId());
                    }
                }
                j12 = j11;
            }
            if (z11) {
                this.f29087k.a(a.EnumC0528a.READ_INVALID_ENTRY, f29074q, "Future timestamp found in " + i13 + " files , with a total size of " + i11 + " bytes, and a maximum time delta of " + j14 + "ms", null);
            }
            long j15 = i12;
            if (this.f29089m.a() != j15 || this.f29089m.b() != j13) {
                if (this.f29088l && this.f29082f != hashSet) {
                    k.g(hashSet);
                    this.f29082f.clear();
                    this.f29082f.addAll(hashSet);
                }
                this.f29089m.f(j13, j15);
            }
            this.f29083g = now;
            return true;
        } catch (IOException e11) {
            this.f29087k.a(a.EnumC0528a.GENERIC_IO, f29074q, "calcFileCacheSize: " + e11.getMessage(), e11);
            return false;
        }
    }

    private d.b r(String str, gd.d dVar) {
        o();
        return this.f29085i.e(str, dVar);
    }

    private void s() {
        if (this.f29084h.f(this.f29085i.isExternal() ? a.EnumC1077a.EXTERNAL : a.EnumC1077a.INTERNAL, this.f29078b - this.f29089m.b())) {
            this.f29080d = this.f29077a;
        } else {
            this.f29080d = this.f29078b;
        }
    }

    @Override // hd.i
    public void a() {
        synchronized (this.f29091o) {
            try {
                this.f29085i.a();
                this.f29082f.clear();
                this.f29081e.f();
            } catch (IOException | NullPointerException e11) {
                gd.a aVar = this.f29087k;
                a.EnumC0528a enumC0528a = a.EnumC0528a.EVICTION;
                Class<?> cls = f29074q;
                aVar.a(enumC0528a, cls, "clearAll: " + e11.getMessage(), e11);
            }
            this.f29089m.e();
        }
    }

    @Override // hd.i
    public boolean b(gd.d dVar) {
        String str;
        IOException e11;
        String str2 = null;
        try {
            try {
                synchronized (this.f29091o) {
                    try {
                        List<String> b11 = gd.e.b(dVar);
                        int i11 = 0;
                        while (i11 < b11.size()) {
                            String str3 = b11.get(i11);
                            if (this.f29085i.c(str3, dVar)) {
                                this.f29082f.add(str3);
                                return true;
                            }
                            i11++;
                            str2 = str3;
                        }
                        return false;
                    } catch (Throwable th2) {
                        str = str2;
                        th = th2;
                        try {
                            throw th;
                        } catch (IOException e12) {
                            e11 = e12;
                            j h11 = j.a().d(dVar).j(str).h(e11);
                            this.f29081e.d(h11);
                            h11.b();
                            return false;
                        }
                    }
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException e13) {
            str = null;
            e11 = e13;
        }
    }

    @Override // hd.i
    public fd.a c(gd.d dVar, gd.j jVar) {
        String a11;
        j d11 = j.a().d(dVar);
        this.f29081e.b(d11);
        synchronized (this.f29091o) {
            a11 = gd.e.a(dVar);
        }
        d11.j(a11);
        try {
            try {
                d.b r11 = r(a11, dVar);
                try {
                    r11.f(jVar, dVar);
                    fd.a l11 = l(r11, dVar, a11);
                    d11.i(l11.size()).f(this.f29089m.b());
                    this.f29081e.e(d11);
                    return l11;
                } finally {
                    if (!r11.e()) {
                        nd.a.f(f29074q, "Failed to delete temp file");
                    }
                }
            } catch (IOException e11) {
                d11.h(e11);
                this.f29081e.a(d11);
                nd.a.g(f29074q, "Failed inserting a file into the cache", e11);
                throw e11;
            }
        } finally {
            d11.b();
        }
    }

    @Override // hd.i
    public fd.a d(gd.d dVar) {
        fd.a aVar;
        j d11 = j.a().d(dVar);
        try {
            synchronized (this.f29091o) {
                List<String> b11 = gd.e.b(dVar);
                String str = null;
                aVar = null;
                for (int i11 = 0; i11 < b11.size(); i11++) {
                    str = b11.get(i11);
                    d11.j(str);
                    aVar = this.f29085i.g(str, dVar);
                    if (aVar != null) {
                        break;
                    }
                }
                if (aVar == null) {
                    this.f29081e.h(d11);
                    this.f29082f.remove(str);
                } else {
                    k.g(str);
                    this.f29081e.g(d11);
                    this.f29082f.add(str);
                }
            }
            return aVar;
        } catch (IOException e11) {
            this.f29087k.a(a.EnumC0528a.GENERIC_IO, f29074q, "getResource", e11);
            d11.h(e11);
            this.f29081e.d(d11);
            return null;
        } finally {
            d11.b();
        }
    }

    @Override // hd.i
    public boolean e(gd.d dVar) {
        synchronized (this.f29091o) {
            List<String> b11 = gd.e.b(dVar);
            for (int i11 = 0; i11 < b11.size(); i11++) {
                if (this.f29082f.contains(b11.get(i11))) {
                    return true;
                }
            }
            return false;
        }
    }

    @Override // hd.i
    public boolean f(gd.d dVar) {
        synchronized (this.f29091o) {
            if (e(dVar)) {
                return true;
            }
            try {
                List<String> b11 = gd.e.b(dVar);
                for (int i11 = 0; i11 < b11.size(); i11++) {
                    String str = b11.get(i11);
                    if (this.f29085i.f(str, dVar)) {
                        this.f29082f.add(str);
                        return true;
                    }
                }
                return false;
            } catch (IOException unused) {
                return false;
            }
        }
    }

    @Override // hd.i
    public void g(gd.d dVar) {
        synchronized (this.f29091o) {
            try {
                List<String> b11 = gd.e.b(dVar);
                for (int i11 = 0; i11 < b11.size(); i11++) {
                    String str = b11.get(i11);
                    this.f29085i.remove(str);
                    this.f29082f.remove(str);
                }
            } catch (IOException e11) {
                gd.a aVar = this.f29087k;
                a.EnumC0528a enumC0528a = a.EnumC0528a.DELETE_FILE;
                Class<?> cls = f29074q;
                aVar.a(enumC0528a, cls, "delete: " + e11.getMessage(), e11);
            }
        }
    }
}