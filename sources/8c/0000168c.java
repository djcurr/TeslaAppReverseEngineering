package com.facebook.hermes.intl;

import com.facebook.hermes.intl.b;
import j$.util.DesugarTimeZone;
import java.text.AttributedCharacterIterator;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes3.dex */
public class m implements b {

    /* renamed from: a  reason: collision with root package name */
    private DateFormat f11238a = null;

    /* loaded from: classes3.dex */
    private static class a {
        public static String a(String str) {
            StringBuilder sb2 = new StringBuilder();
            boolean z11 = false;
            for (int i11 = 0; i11 < str.length(); i11++) {
                char charAt = str.charAt(i11);
                if (charAt == '\'') {
                    z11 = !z11;
                } else if (!z11 && ((charAt >= 'A' && charAt <= 'Z') || (charAt >= 'a' && charAt <= 'z'))) {
                    sb2.append(str.charAt(i11));
                }
            }
            return sb2.toString();
        }
    }

    @Override // com.facebook.hermes.intl.b
    public AttributedCharacterIterator a(double d11) {
        return this.f11238a.formatToCharacterIterator(Double.valueOf(d11));
    }

    @Override // com.facebook.hermes.intl.b
    public String b(double d11) {
        return this.f11238a.format(new Date((long) d11));
    }

    @Override // com.facebook.hermes.intl.b
    public String c(ye.b<?> bVar) {
        return "latn";
    }

    @Override // com.facebook.hermes.intl.b
    public String d(ye.b<?> bVar) {
        return DateFormat.getDateInstance(3, (Locale) bVar.h()).getCalendar().toString();
    }

    @Override // com.facebook.hermes.intl.b
    public b.f e(ye.b<?> bVar) {
        b.f fVar;
        try {
            String a11 = a.a(((SimpleDateFormat) DateFormat.getTimeInstance(0, (Locale) bVar.h())).toPattern());
            if (a11.contains(String.valueOf('h'))) {
                fVar = b.f.H12;
            } else if (a11.contains(String.valueOf('K'))) {
                fVar = b.f.H11;
            } else if (a11.contains(String.valueOf('H'))) {
                fVar = b.f.H23;
            } else {
                fVar = b.f.H24;
            }
            return fVar;
        } catch (ClassCastException unused) {
            return b.f.H24;
        }
    }

    @Override // com.facebook.hermes.intl.b
    public void f(ye.b<?> bVar, String str, String str2, b.d dVar, b.k kVar, b.c cVar, b.l lVar, b.h hVar, b.EnumC0212b enumC0212b, b.e eVar, b.g gVar, b.i iVar, b.j jVar, b.f fVar, Object obj) {
        if (!str.isEmpty()) {
            ArrayList<String> arrayList = new ArrayList<>();
            arrayList.add(ye.d.h(str));
            bVar.f("ca", arrayList);
        }
        if (!str2.isEmpty()) {
            ArrayList<String> arrayList2 = new ArrayList<>();
            arrayList2.add(ye.d.h(str2));
            bVar.f("nu", arrayList2);
        }
        boolean z11 = true;
        boolean z12 = (lVar == null && hVar == null && enumC0212b == null) ? false : true;
        if (eVar == null && gVar == null && iVar == null) {
            z11 = false;
        }
        if (z12 && z11) {
            this.f11238a = DateFormat.getDateTimeInstance(0, 0, (Locale) bVar.h());
        } else if (z12) {
            this.f11238a = DateFormat.getDateInstance(0, (Locale) bVar.h());
        } else if (z11) {
            this.f11238a = DateFormat.getTimeInstance(0, (Locale) bVar.h());
        }
        if (ye.d.n(obj) || ye.d.j(obj)) {
            return;
        }
        this.f11238a.setTimeZone(DesugarTimeZone.getTimeZone(ye.d.h(obj)));
    }

    @Override // com.facebook.hermes.intl.b
    public String g(AttributedCharacterIterator.Attribute attribute, String str) {
        if (attribute == DateFormat.Field.DAY_OF_WEEK) {
            return "weekday";
        }
        if (attribute == DateFormat.Field.ERA) {
            return "era";
        }
        if (attribute != DateFormat.Field.YEAR) {
            return attribute == DateFormat.Field.MONTH ? "month" : attribute == DateFormat.Field.DAY_OF_MONTH ? "day" : (attribute == DateFormat.Field.HOUR0 || attribute == DateFormat.Field.HOUR1 || attribute == DateFormat.Field.HOUR_OF_DAY0 || attribute == DateFormat.Field.HOUR_OF_DAY1) ? "hour" : attribute == DateFormat.Field.MINUTE ? "minute" : attribute == DateFormat.Field.SECOND ? "second" : attribute == DateFormat.Field.TIME_ZONE ? "timeZoneName" : attribute == DateFormat.Field.AM_PM ? "dayPeriod" : attribute.toString().equals("android.icu.text.DateFormat$Field(related year)") ? "relatedYear" : "literal";
        }
        try {
            Double.parseDouble(str);
            return "year";
        } catch (NumberFormatException unused) {
            return "yearName";
        }
    }

    @Override // com.facebook.hermes.intl.b
    public String h(ye.b<?> bVar) {
        return Calendar.getInstance((Locale) bVar.h()).getTimeZone().getID();
    }
}