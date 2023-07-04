package l5;

import androidx.work.a0;
import androidx.work.impl.WorkDatabase;
import androidx.work.t;
import java.util.LinkedList;
import java.util.UUID;
import k5.q;

/* loaded from: classes.dex */
public abstract class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final d5.c f36591a = new d5.c();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l5.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0698a extends a {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d5.i f36592b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ UUID f36593c;

        C0698a(d5.i iVar, UUID uuid) {
            this.f36592b = iVar;
            this.f36593c = uuid;
        }

        @Override // l5.a
        void g() {
            WorkDatabase v11 = this.f36592b.v();
            v11.beginTransaction();
            try {
                a(this.f36592b, this.f36593c.toString());
                v11.setTransactionSuccessful();
                v11.endTransaction();
                f(this.f36592b);
            } catch (Throwable th2) {
                v11.endTransaction();
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b extends a {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d5.i f36594b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f36595c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f36596d;

        b(d5.i iVar, String str, boolean z11) {
            this.f36594b = iVar;
            this.f36595c = str;
            this.f36596d = z11;
        }

        @Override // l5.a
        void g() {
            WorkDatabase v11 = this.f36594b.v();
            v11.beginTransaction();
            try {
                for (String str : v11.l().e(this.f36595c)) {
                    a(this.f36594b, str);
                }
                v11.setTransactionSuccessful();
                v11.endTransaction();
                if (this.f36596d) {
                    f(this.f36594b);
                }
            } catch (Throwable th2) {
                v11.endTransaction();
                throw th2;
            }
        }
    }

    public static a b(UUID uuid, d5.i iVar) {
        return new C0698a(iVar, uuid);
    }

    public static a c(String str, d5.i iVar, boolean z11) {
        return new b(iVar, str, z11);
    }

    private void e(WorkDatabase workDatabase, String str) {
        q l11 = workDatabase.l();
        k5.b d11 = workDatabase.d();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            a0.a f11 = l11.f(str2);
            if (f11 != a0.a.SUCCEEDED && f11 != a0.a.FAILED) {
                l11.b(a0.a.CANCELLED, str2);
            }
            linkedList.addAll(d11.a(str2));
        }
    }

    void a(d5.i iVar, String str) {
        e(iVar.v(), str);
        iVar.t().l(str);
        for (d5.e eVar : iVar.u()) {
            eVar.a(str);
        }
    }

    public t d() {
        return this.f36591a;
    }

    void f(d5.i iVar) {
        d5.f.b(iVar.p(), iVar.v(), iVar.u());
    }

    abstract void g();

    @Override // java.lang.Runnable
    public void run() {
        try {
            g();
            this.f36591a.a(t.f6703a);
        } catch (Throwable th2) {
            this.f36591a.a(new t.b.a(th2));
        }
    }
}