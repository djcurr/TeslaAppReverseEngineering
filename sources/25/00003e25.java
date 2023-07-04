package com.henninghall.date_picker;

import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: a */
    private final j f17466a;

    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f17467a;

        /* renamed from: b */
        static final /* synthetic */ int[] f17468b;

        static {
            int[] iArr = new int[qp.c.values().length];
            f17468b = iArr;
            try {
                iArr[qp.c.nativeAndroid.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17468b[qp.c.iosClone.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[qp.b.values().length];
            f17467a = iArr2;
            try {
                iArr2[qp.b.datetime.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17467a[qp.b.time.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17467a[qp.b.date.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public b(j jVar) {
        this.f17466a = jVar;
    }

    private ArrayList<qp.d> c() {
        String replaceAll = f.c(this.f17466a.u()).replaceAll("\\('(.+?)'\\)", "\\${$1}").replaceAll("'.+?'", "").replaceAll("\\$\\{(.+?)\\}", "('$1')");
        ArrayList arrayList = new ArrayList(Arrays.asList(qp.d.values()));
        ArrayList<qp.d> arrayList2 = new ArrayList<>();
        qp.d dVar = qp.d.DAY;
        arrayList.remove(dVar);
        arrayList2.add(dVar);
        for (char c11 : replaceAll.toCharArray()) {
            try {
                qp.d i11 = k.i(c11);
                if (arrayList.contains(i11)) {
                    arrayList.remove(i11);
                    arrayList2.add(i11);
                }
            } catch (Exception unused) {
            }
        }
        qp.d dVar2 = qp.d.AM_PM;
        if (arrayList.contains(dVar2)) {
            arrayList.remove(dVar2);
            arrayList2.add(dVar2);
        }
        if (!arrayList.isEmpty()) {
            Log.e("RNDatePicker", arrayList.size() + " wheel types cannot be ordered. Wheel type 0: " + arrayList.get(0));
        }
        return arrayList2;
    }

    public String a() {
        Calendar t11 = this.f17466a.t();
        return t11 != null ? k.b(t11) : this.f17466a.s();
    }

    public ArrayList<qp.d> b() {
        ArrayList<qp.d> c11 = c();
        ArrayList<qp.d> f11 = f();
        ArrayList<qp.d> arrayList = new ArrayList<>();
        Iterator<qp.d> it2 = c11.iterator();
        while (it2.hasNext()) {
            qp.d next = it2.next();
            if (f11.contains(next)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public int d() {
        int i11 = a.f17468b[this.f17466a.E().ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                return i.ios_clone;
            }
            return i.ios_clone;
        }
        return i.native_picker;
    }

    public int e() {
        int intValue = this.f17466a.q().intValue() / 35;
        return intValue % 2 == 0 ? intValue + 1 : intValue;
    }

    public ArrayList<qp.d> f() {
        ArrayList<qp.d> arrayList = new ArrayList<>();
        qp.b z11 = this.f17466a.z();
        int i11 = a.f17467a[z11.ordinal()];
        if (i11 == 1) {
            arrayList.add(qp.d.DAY);
            arrayList.add(qp.d.HOUR);
            arrayList.add(qp.d.MINUTE);
        } else if (i11 == 2) {
            arrayList.add(qp.d.HOUR);
            arrayList.add(qp.d.MINUTE);
        } else if (i11 == 3) {
            arrayList.add(qp.d.YEAR);
            arrayList.add(qp.d.MONTH);
            arrayList.add(qp.d.DATE);
        }
        if ((z11 == qp.b.time || z11 == qp.b.datetime) && this.f17466a.f17498p.i()) {
            arrayList.add(qp.d.AM_PM);
        }
        return arrayList;
    }

    public boolean g() {
        return this.f17466a.E() == qp.c.nativeAndroid;
    }

    public boolean h() {
        return this.f17466a.z() == qp.b.time && !i();
    }

    public boolean i() {
        return this.f17466a.r() == qp.a.locale ? f.i(this.f17466a.u()) : k.c();
    }
}