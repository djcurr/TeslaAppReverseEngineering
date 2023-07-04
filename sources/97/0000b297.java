package sp;

import android.view.View;
import com.henninghall.date_picker.j;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

/* loaded from: classes2.dex */
public class f implements e {

    /* renamed from: a  reason: collision with root package name */
    private final h f50497a;

    /* renamed from: b  reason: collision with root package name */
    private final j f50498b;

    /* renamed from: c  reason: collision with root package name */
    private final d f50499c;

    /* renamed from: d  reason: collision with root package name */
    private final View f50500d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(h hVar, j jVar, d dVar, View view) {
        this.f50497a = hVar;
        this.f50499c = dVar;
        this.f50498b = jVar;
        this.f50500d = view;
    }

    private boolean b() {
        SimpleDateFormat d11 = d();
        String r11 = this.f50497a.r();
        try {
            d11.setLenient(false);
            d11.parse(r11);
            return true;
        } catch (ParseException unused) {
            return false;
        }
    }

    private Calendar c() {
        SimpleDateFormat d11 = d();
        d11.setLenient(false);
        for (int i11 = 0; i11 < 10; i11++) {
            try {
                String s11 = this.f50497a.s(i11);
                Calendar calendar = Calendar.getInstance(this.f50498b.D());
                calendar.setTime(d11.parse(s11));
                return calendar;
            } catch (ParseException unused) {
            }
        }
        return null;
    }

    private SimpleDateFormat d() {
        TimeZone D = this.f50498b.D();
        SimpleDateFormat c11 = this.f50499c.c();
        c11.setTimeZone(D);
        return c11;
    }

    private Calendar e() {
        SimpleDateFormat d11 = d();
        String r11 = this.f50497a.r();
        Calendar calendar = Calendar.getInstance(this.f50498b.D());
        try {
            d11.setLenient(true);
            calendar.setTime(d11.parse(r11));
            return calendar;
        } catch (ParseException e11) {
            e11.printStackTrace();
            return null;
        }
    }

    @Override // sp.e
    public void a(up.g gVar) {
        if (this.f50497a.A()) {
            return;
        }
        if (!b()) {
            Calendar c11 = c();
            if (c11 != null) {
                this.f50499c.b(c11);
                return;
            }
            return;
        }
        Calendar e11 = e();
        if (e11 == null) {
            return;
        }
        Calendar x11 = this.f50498b.x();
        if (x11 != null && e11.before(x11)) {
            this.f50499c.b(x11);
            return;
        }
        Calendar w11 = this.f50498b.w();
        if (w11 != null && e11.after(w11)) {
            this.f50499c.b(w11);
            return;
        }
        String d11 = this.f50499c.d();
        this.f50499c.k(e11);
        com.henninghall.date_picker.c.b(e11, d11, this.f50500d);
    }
}