package up;

import android.graphics.Paint;
import com.henninghall.date_picker.j;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes2.dex */
public abstract class g {

    /* renamed from: a  reason: collision with root package name */
    protected final j f53650a;

    /* renamed from: b  reason: collision with root package name */
    private Calendar f53651b;

    /* renamed from: c  reason: collision with root package name */
    private ArrayList<String> f53652c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    public com.henninghall.date_picker.pickers.a f53653d;

    /* renamed from: e  reason: collision with root package name */
    public SimpleDateFormat f53654e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f53655a;

        static {
            int[] iArr = new int[qp.b.values().length];
            f53655a = iArr;
            try {
                iArr[qp.b.date.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f53655a[qp.b.time.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f53655a[qp.b.datetime.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public g(com.henninghall.date_picker.pickers.a aVar, j jVar) {
        this.f53650a = jVar;
        this.f53653d = aVar;
        this.f53654e = new SimpleDateFormat(e(), jVar.u());
        aVar.setTextAlign(l());
        aVar.setWrapSelectorWheel(w());
    }

    private String[] c(ArrayList<String> arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator<String> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(t(it2.next()));
        }
        return (String[]) arrayList2.toArray(new String[0]);
    }

    private SimpleDateFormat d(Locale locale) {
        return new SimpleDateFormat(e(), locale);
    }

    private int g() {
        return this.f53653d.getValue();
    }

    private int h(Calendar calendar) {
        this.f53654e.setTimeZone(this.f53650a.D());
        return this.f53652c.indexOf(this.f53654e.format(calendar.getTime()));
    }

    private String k(Calendar calendar, Locale locale) {
        return d(locale).format(calendar.getTime());
    }

    private void p() {
        this.f53653d.setMinValue(0);
        this.f53653d.setMaxValue(0);
        ArrayList<String> o11 = o();
        this.f53652c = o11;
        this.f53653d.setDisplayedValues(c(o11));
        this.f53653d.setMaxValue(this.f53652c.size() - 1);
    }

    public void a(Calendar calendar) {
        this.f53653d.b(h(calendar));
    }

    public String b() {
        return t(n(g()));
    }

    public abstract String e();

    public int f() {
        qp.b z11 = this.f53650a.z();
        if (this.f53650a.f17498p.h()) {
            return 10;
        }
        return a.f53655a[z11.ordinal()] != 1 ? 5 : 15;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String i(Calendar calendar) {
        return k(calendar, this.f53650a.u());
    }

    public String j(int i11) {
        if (v()) {
            int size = this.f53652c.size();
            return n(((g() + size) - i11) % size);
        }
        return this.f53654e.format(this.f53651b.getTime());
    }

    public abstract Paint.Align l();

    public String m() {
        return !v() ? this.f53654e.format(this.f53651b.getTime()) : n(g());
    }

    public String n(int i11) {
        return this.f53652c.get(i11);
    }

    public abstract ArrayList<String> o();

    public void q() {
        this.f53654e = new SimpleDateFormat(e(), this.f53650a.u());
        if (v()) {
            p();
        }
    }

    public void r() {
        this.f53653d.setItemPaddingHorizontal(f());
    }

    public void s(Calendar calendar) {
        this.f53654e.setTimeZone(this.f53650a.D());
        this.f53651b = calendar;
        int h11 = h(calendar);
        if (h11 > -1) {
            if (this.f53653d.getValue() == 0) {
                this.f53653d.setValue(h11);
            } else {
                this.f53653d.b(h11);
            }
        }
    }

    public String t(String str) {
        return str;
    }

    public void u() {
        this.f53653d.setVisibility(v() ? 0 : 8);
    }

    public abstract boolean v();

    public abstract boolean w();
}