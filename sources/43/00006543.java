package d5;

import android.text.TextUtils;
import androidx.work.c0;
import androidx.work.q;
import androidx.work.t;
import androidx.work.z;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public class g extends z {

    /* renamed from: j  reason: collision with root package name */
    private static final String f23628j = q.f("WorkContinuationImpl");

    /* renamed from: a  reason: collision with root package name */
    private final i f23629a;

    /* renamed from: b  reason: collision with root package name */
    private final String f23630b;

    /* renamed from: c  reason: collision with root package name */
    private final androidx.work.h f23631c;

    /* renamed from: d  reason: collision with root package name */
    private final List<? extends c0> f23632d;

    /* renamed from: e  reason: collision with root package name */
    private final List<String> f23633e;

    /* renamed from: f  reason: collision with root package name */
    private final List<String> f23634f;

    /* renamed from: g  reason: collision with root package name */
    private final List<g> f23635g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f23636h;

    /* renamed from: i  reason: collision with root package name */
    private t f23637i;

    public g(i iVar, List<? extends c0> list) {
        this(iVar, null, androidx.work.h.KEEP, list, null);
    }

    private static boolean i(g gVar, Set<String> set) {
        set.addAll(gVar.c());
        Set<String> l11 = l(gVar);
        for (String str : set) {
            if (l11.contains(str)) {
                return true;
            }
        }
        List<g> e11 = gVar.e();
        if (e11 != null && !e11.isEmpty()) {
            for (g gVar2 : e11) {
                if (i(gVar2, set)) {
                    return true;
                }
            }
        }
        set.removeAll(gVar.c());
        return false;
    }

    public static Set<String> l(g gVar) {
        HashSet hashSet = new HashSet();
        List<g> e11 = gVar.e();
        if (e11 != null && !e11.isEmpty()) {
            for (g gVar2 : e11) {
                hashSet.addAll(gVar2.c());
            }
        }
        return hashSet;
    }

    @Override // androidx.work.z
    public t a() {
        if (!this.f23636h) {
            l5.b bVar = new l5.b(this);
            this.f23629a.w().b(bVar);
            this.f23637i = bVar.d();
        } else {
            q.c().h(f23628j, String.format("Already enqueued work ids (%s)", TextUtils.join(", ", this.f23633e)), new Throwable[0]);
        }
        return this.f23637i;
    }

    public androidx.work.h b() {
        return this.f23631c;
    }

    public List<String> c() {
        return this.f23633e;
    }

    public String d() {
        return this.f23630b;
    }

    public List<g> e() {
        return this.f23635g;
    }

    public List<? extends c0> f() {
        return this.f23632d;
    }

    public i g() {
        return this.f23629a;
    }

    public boolean h() {
        return i(this, new HashSet());
    }

    public boolean j() {
        return this.f23636h;
    }

    public void k() {
        this.f23636h = true;
    }

    public g(i iVar, String str, androidx.work.h hVar, List<? extends c0> list) {
        this(iVar, str, hVar, list, null);
    }

    public g(i iVar, String str, androidx.work.h hVar, List<? extends c0> list, List<g> list2) {
        this.f23629a = iVar;
        this.f23630b = str;
        this.f23631c = hVar;
        this.f23632d = list;
        this.f23635g = list2;
        this.f23633e = new ArrayList(list.size());
        this.f23634f = new ArrayList();
        if (list2 != null) {
            for (g gVar : list2) {
                this.f23634f.addAll(gVar.f23634f);
            }
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            String b11 = list.get(i11).b();
            this.f23633e.add(b11);
            this.f23634f.add(b11);
        }
    }
}