package l6;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes.dex */
public class i implements k6.a {

    /* renamed from: a  reason: collision with root package name */
    private int f37005a;

    /* renamed from: b  reason: collision with root package name */
    private int f37006b;

    /* renamed from: c  reason: collision with root package name */
    private int f37007c;

    /* renamed from: d  reason: collision with root package name */
    private int f37008d;

    /* renamed from: e  reason: collision with root package name */
    private int f37009e;

    /* renamed from: f  reason: collision with root package name */
    private int f37010f;

    /* renamed from: g  reason: collision with root package name */
    private TimeZone f37011g;

    /* renamed from: h  reason: collision with root package name */
    private int f37012h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f37013i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f37014j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f37015k;

    public i() {
        this.f37005a = 0;
        this.f37006b = 0;
        this.f37007c = 0;
        this.f37008d = 0;
        this.f37009e = 0;
        this.f37010f = 0;
        this.f37011g = null;
        this.f37013i = false;
        this.f37014j = false;
        this.f37015k = false;
    }

    public i(Calendar calendar) {
        this.f37005a = 0;
        this.f37006b = 0;
        this.f37007c = 0;
        this.f37008d = 0;
        this.f37009e = 0;
        this.f37010f = 0;
        this.f37011g = null;
        this.f37013i = false;
        this.f37014j = false;
        this.f37015k = false;
        Date time = calendar.getTime();
        TimeZone timeZone = calendar.getTimeZone();
        GregorianCalendar gregorianCalendar = (GregorianCalendar) Calendar.getInstance(Locale.US);
        gregorianCalendar.setGregorianChange(new Date(Long.MIN_VALUE));
        gregorianCalendar.setTimeZone(timeZone);
        gregorianCalendar.setTime(time);
        this.f37005a = gregorianCalendar.get(1);
        this.f37006b = gregorianCalendar.get(2) + 1;
        this.f37007c = gregorianCalendar.get(5);
        this.f37008d = gregorianCalendar.get(11);
        this.f37009e = gregorianCalendar.get(12);
        this.f37010f = gregorianCalendar.get(13);
        this.f37012h = gregorianCalendar.get(14) * 1000000;
        this.f37011g = gregorianCalendar.getTimeZone();
        this.f37015k = true;
        this.f37014j = true;
        this.f37013i = true;
    }

    @Override // k6.a
    public Calendar C() {
        GregorianCalendar gregorianCalendar = (GregorianCalendar) Calendar.getInstance(Locale.US);
        gregorianCalendar.setGregorianChange(new Date(Long.MIN_VALUE));
        if (this.f37015k) {
            gregorianCalendar.setTimeZone(this.f37011g);
        }
        gregorianCalendar.set(1, this.f37005a);
        gregorianCalendar.set(2, this.f37006b - 1);
        gregorianCalendar.set(5, this.f37007c);
        gregorianCalendar.set(11, this.f37008d);
        gregorianCalendar.set(12, this.f37009e);
        gregorianCalendar.set(13, this.f37010f);
        gregorianCalendar.set(14, this.f37012h / 1000000);
        return gregorianCalendar;
    }

    @Override // k6.a
    public void G0(int i11) {
        this.f37008d = Math.min(Math.abs(i11), 23);
        this.f37014j = true;
    }

    @Override // k6.a
    public void I0(int i11) {
        this.f37009e = Math.min(Math.abs(i11), 59);
        this.f37014j = true;
    }

    @Override // k6.a
    public int J0() {
        return this.f37012h;
    }

    @Override // k6.a
    public void L(int i11) {
        this.f37012h = i11;
        this.f37014j = true;
    }

    @Override // k6.a
    public boolean P0() {
        return this.f37015k;
    }

    @Override // k6.a
    public void Q0(int i11) {
        this.f37005a = Math.min(Math.abs(i11), 9999);
        this.f37013i = true;
    }

    @Override // k6.a
    public void S0(int i11) {
        if (i11 < 1) {
            this.f37007c = 1;
        } else if (i11 > 31) {
            this.f37007c = 31;
        } else {
            this.f37007c = i11;
        }
        this.f37013i = true;
    }

    @Override // k6.a
    public int X0() {
        return this.f37007c;
    }

    public String a() {
        return c.c(this);
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        k6.a aVar = (k6.a) obj;
        long timeInMillis = C().getTimeInMillis() - aVar.C().getTimeInMillis();
        if (timeInMillis == 0) {
            timeInMillis = this.f37012h - aVar.J0();
        }
        return (int) Math.signum((float) timeInMillis);
    }

    @Override // k6.a
    public int getMonth() {
        return this.f37006b;
    }

    @Override // k6.a
    public TimeZone getTimeZone() {
        return this.f37011g;
    }

    @Override // k6.a
    public int getYear() {
        return this.f37005a;
    }

    @Override // k6.a
    public boolean hasTime() {
        return this.f37014j;
    }

    @Override // k6.a
    public int j() {
        return this.f37010f;
    }

    @Override // k6.a
    public int m() {
        return this.f37009e;
    }

    @Override // k6.a
    public void n0(int i11) {
        if (i11 < 1) {
            this.f37006b = 1;
        } else if (i11 > 12) {
            this.f37006b = 12;
        } else {
            this.f37006b = i11;
        }
        this.f37013i = true;
    }

    @Override // k6.a
    public int p() {
        return this.f37008d;
    }

    @Override // k6.a
    public void setTimeZone(TimeZone timeZone) {
        this.f37011g = timeZone;
        this.f37014j = true;
        this.f37015k = true;
    }

    @Override // k6.a
    public boolean t0() {
        return this.f37013i;
    }

    public String toString() {
        return a();
    }

    @Override // k6.a
    public void z1(int i11) {
        this.f37010f = Math.min(Math.abs(i11), 59);
        this.f37014j = true;
    }
}