package up;

import android.graphics.Paint;
import com.henninghall.date_picker.j;
import com.henninghall.date_picker.k;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class c extends g {

    /* renamed from: h  reason: collision with root package name */
    private static int f53646h = 150;

    /* renamed from: f  reason: collision with root package name */
    private String f53647f;

    /* renamed from: g  reason: collision with root package name */
    private HashMap<String, String> f53648g;

    public c(com.henninghall.date_picker.pickers.a aVar, j jVar) {
        super(aVar, jVar);
    }

    private Calendar A() {
        Calendar A;
        Calendar w11 = this.f53650a.w();
        Calendar x11 = this.f53650a.x();
        if (w11 != null) {
            return (Calendar) w11.clone();
        }
        if (x11 != null) {
            A = (Calendar) x11.clone();
            A.add(5, A.getActualMaximum(6) / 2);
        } else {
            A = this.f53650a.A();
            A.add(5, f53646h / 2);
        }
        return A;
    }

    private Calendar B() {
        Calendar w11 = this.f53650a.w();
        Calendar x11 = this.f53650a.x();
        if (x11 != null) {
            return (Calendar) x11.clone();
        }
        if (w11 != null) {
            Calendar calendar = (Calendar) w11.clone();
            calendar.add(5, (-calendar.getActualMaximum(6)) / 2);
            return calendar;
        }
        Calendar A = this.f53650a.A();
        A.add(5, (-f53646h) / 2);
        return A;
    }

    private String C(Calendar calendar) {
        return this.f53654e.format(calendar.getTime());
    }

    private String D(String str) {
        String j11 = k.j(this.f53650a.u());
        return Character.isUpperCase(str.charAt(0)) ? k.a(j11) : j11;
    }

    private String x(Calendar calendar) {
        return y().format(calendar.getTime());
    }

    private SimpleDateFormat y() {
        return new SimpleDateFormat(z(), this.f53650a.u());
    }

    private String z() {
        return com.henninghall.date_picker.f.d(this.f53650a.v());
    }

    @Override // up.g
    public String e() {
        return com.henninghall.date_picker.f.b(this.f53650a.u()).replace("EEEE", "EEE").replace("MMMM", "MMM");
    }

    @Override // up.g
    public Paint.Align l() {
        return Paint.Align.RIGHT;
    }

    @Override // up.g
    public ArrayList<String> o() {
        ArrayList<String> arrayList = new ArrayList<>();
        this.f53648g = new HashMap<>();
        Calendar B = B();
        Calendar A = A();
        while (!B.after(A)) {
            String C = C(B);
            arrayList.add(C);
            this.f53648g.put(C, x(B));
            if (k.g(B)) {
                this.f53647f = C;
            }
            B.add(5, 1);
        }
        return arrayList;
    }

    @Override // up.g
    public String t(String str) {
        if (str.equals(this.f53647f)) {
            return D(str);
        }
        return this.f53648g.get(str);
    }

    @Override // up.g
    public boolean v() {
        return this.f53650a.z() == qp.b.datetime;
    }

    @Override // up.g
    public boolean w() {
        return false;
    }
}