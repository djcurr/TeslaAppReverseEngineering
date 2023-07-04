package com.facebook.hermes.intl;

import android.icu.text.DateFormat;
import android.icu.text.NumberingSystem;
import android.icu.text.SimpleDateFormat;
import android.icu.util.Calendar;
import android.icu.util.TimeZone;
import android.icu.util.ULocale;
import com.facebook.hermes.intl.b;
import java.text.AttributedCharacterIterator;
import java.util.ArrayList;
import java.util.Date;

/* loaded from: classes3.dex */
public class n implements b {

    /* renamed from: a  reason: collision with root package name */
    private DateFormat f11239a = null;

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

    private static String i(b.k kVar, b.c cVar, b.l lVar, b.h hVar, b.EnumC0212b enumC0212b, b.e eVar, b.g gVar, b.i iVar, b.j jVar, boolean z11) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(kVar.getSkeleonSymbol());
        sb2.append(cVar.getSkeleonSymbol());
        sb2.append(lVar.getSkeleonSymbol());
        sb2.append(hVar.getSkeleonSymbol());
        sb2.append(enumC0212b.getSkeleonSymbol());
        if (z11) {
            sb2.append(eVar.getSkeleonSymbol12());
        } else {
            sb2.append(eVar.getSkeleonSymbol24());
        }
        sb2.append(gVar.getSkeleonSymbol());
        sb2.append(iVar.getSkeleonSymbol());
        sb2.append(jVar.getSkeleonSymbol());
        return sb2.toString();
    }

    @Override // com.facebook.hermes.intl.b
    public AttributedCharacterIterator a(double d11) {
        return this.f11239a.formatToCharacterIterator(Double.valueOf(d11));
    }

    @Override // com.facebook.hermes.intl.b
    public String b(double d11) {
        return this.f11239a.format(new Date((long) d11));
    }

    @Override // com.facebook.hermes.intl.b
    public String c(ye.b<?> bVar) {
        return NumberingSystem.getInstance((ULocale) bVar.h()).getName();
    }

    @Override // com.facebook.hermes.intl.b
    public String d(ye.b<?> bVar) {
        return ye.g.d(DateFormat.getDateInstance(3, (ULocale) bVar.h()).getCalendar().getType());
    }

    @Override // com.facebook.hermes.intl.b
    public b.f e(ye.b<?> bVar) {
        b.f fVar;
        try {
            String a11 = a.a(((SimpleDateFormat) DateFormat.getTimeInstance(0, (ULocale) bVar.h())).toPattern());
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
        String i11 = i(kVar, cVar, lVar, hVar, enumC0212b, eVar, gVar, iVar, jVar, fVar == b.f.H11 || fVar == b.f.H12);
        Calendar calendar = null;
        if (!str.isEmpty()) {
            ArrayList<String> arrayList = new ArrayList<>();
            arrayList.add(ye.d.h(str));
            ye.b<?> d11 = bVar.d();
            d11.f("ca", arrayList);
            calendar = Calendar.getInstance((ULocale) d11.h());
        }
        if (!str2.isEmpty()) {
            try {
                if (NumberingSystem.getInstanceByName(ye.d.h(str2)) != null) {
                    ArrayList<String> arrayList2 = new ArrayList<>();
                    arrayList2.add(ye.d.h(str2));
                    bVar.f("nu", arrayList2);
                } else {
                    throw new JSRangeErrorException("Invalid numbering system: " + str2);
                }
            } catch (RuntimeException unused) {
                throw new JSRangeErrorException("Invalid numbering system: " + str2);
            }
        }
        if (calendar != null) {
            this.f11239a = DateFormat.getPatternInstance(calendar, i11, (ULocale) bVar.h());
        } else {
            this.f11239a = DateFormat.getPatternInstance(i11, (ULocale) bVar.h());
        }
        if (ye.d.n(obj) || ye.d.j(obj)) {
            return;
        }
        this.f11239a.setTimeZone(TimeZone.getTimeZone(ye.d.h(obj)));
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
        return Calendar.getInstance((ULocale) bVar.h()).getTimeZone().getID();
    }
}