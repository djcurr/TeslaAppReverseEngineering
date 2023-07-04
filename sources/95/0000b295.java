package sp;

import android.view.View;
import com.henninghall.date_picker.j;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import tp.i;

/* loaded from: classes2.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private final j f50492a;

    /* renamed from: b  reason: collision with root package name */
    private final View f50493b;

    /* renamed from: c  reason: collision with root package name */
    private h f50494c;

    /* renamed from: d  reason: collision with root package name */
    private b f50495d;

    /* renamed from: e  reason: collision with root package name */
    private g f50496e = new g();

    public d(j jVar, View view) {
        this.f50492a = jVar;
        this.f50493b = view;
        this.f50494c = new h(jVar, view);
        a();
    }

    private void a() {
        this.f50494c.j(new tp.a(new f(this.f50494c, this.f50492a, this, this.f50493b)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(Calendar calendar) {
        this.f50494c.k(new tp.e(calendar));
        this.f50494c.l(new tp.b(calendar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public SimpleDateFormat c() {
        return new SimpleDateFormat(this.f50494c.u(), this.f50492a.u());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String d() {
        return this.f50494c.t();
    }

    public void e(int i11, int i12) {
        this.f50496e.a(this.f50494c.y(this.f50492a.f17498p.b().get(i11)), i12);
    }

    public void f() {
        this.f50494c.j(new tp.e(this.f50492a.A()));
    }

    public void g() {
        this.f50494c.j(new tp.d());
    }

    public void h() {
        this.f50494c.B();
    }

    public void i() {
        if (this.f50492a.f17498p.g()) {
            return;
        }
        b bVar = new b(this.f50492a, this.f50493b);
        this.f50495d = bVar;
        bVar.a();
    }

    public void j() {
        this.f50494c.C();
    }

    public void k(Calendar calendar) {
        this.f50492a.F(calendar);
    }

    public void l() {
        this.f50494c.j(new tp.h(this.f50492a.C()));
    }

    public void m() {
        this.f50494c.D();
    }

    public void n() {
        this.f50494c.l(new tp.c());
    }

    public void o() {
        this.f50494c.j(new i());
    }
}