package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.e;
import androidx.work.q;
import java.util.ArrayList;
import java.util.List;
import k5.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class c {

    /* renamed from: e  reason: collision with root package name */
    private static final String f6581e = q.f("ConstraintsCmdHandler");

    /* renamed from: a  reason: collision with root package name */
    private final Context f6582a;

    /* renamed from: b  reason: collision with root package name */
    private final int f6583b;

    /* renamed from: c  reason: collision with root package name */
    private final e f6584c;

    /* renamed from: d  reason: collision with root package name */
    private final g5.d f6585d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(Context context, int i11, e eVar) {
        this.f6582a = context;
        this.f6583b = i11;
        this.f6584c = eVar;
        this.f6585d = new g5.d(context, eVar.f(), null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        List<p> d11 = this.f6584c.g().v().l().d();
        ConstraintProxy.a(this.f6582a, d11);
        this.f6585d.d(d11);
        ArrayList<p> arrayList = new ArrayList(d11.size());
        long currentTimeMillis = System.currentTimeMillis();
        for (p pVar : d11) {
            String str = pVar.f34405a;
            if (currentTimeMillis >= pVar.a() && (!pVar.b() || this.f6585d.c(str))) {
                arrayList.add(pVar);
            }
        }
        for (p pVar2 : arrayList) {
            String str2 = pVar2.f34405a;
            Intent b11 = b.b(this.f6582a, str2);
            q.c().a(f6581e, String.format("Creating a delay_met command for workSpec with id (%s)", str2), new Throwable[0]);
            e eVar = this.f6584c;
            eVar.k(new e.b(eVar, b11, this.f6583b));
        }
        this.f6585d.e();
    }
}