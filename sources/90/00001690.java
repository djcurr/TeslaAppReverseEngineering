package com.facebook.hermes.intl;

import android.os.Build;
import com.facebook.hermes.intl.c;
import java.math.RoundingMode;
import java.text.AttributedCharacterIterator;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.Format;
import java.util.Currency;
import java.util.Locale;

/* loaded from: classes3.dex */
public class o implements c {

    /* renamed from: a  reason: collision with root package name */
    private Format f11240a;

    /* renamed from: b  reason: collision with root package name */
    private DecimalFormat f11241b;

    /* renamed from: c  reason: collision with root package name */
    private g f11242c;

    /* renamed from: d  reason: collision with root package name */
    private c.h f11243d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f11244a;

        static {
            int[] iArr = new int[c.EnumC0213c.values().length];
            f11244a = iArr;
            try {
                iArr[c.EnumC0213c.NAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11244a[c.EnumC0213c.CODE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11244a[c.EnumC0213c.SYMBOL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11244a[c.EnumC0213c.NARROWSYMBOL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static int n(String str) {
        try {
            return Currency.getInstance(str).getDefaultFractionDigits();
        } catch (IllegalArgumentException unused) {
            throw new JSRangeErrorException("Invalid currency code !");
        }
    }

    private void o(DecimalFormat decimalFormat, ye.b<?> bVar, c.h hVar) {
        this.f11241b = decimalFormat;
        this.f11240a = decimalFormat;
        this.f11242c = (g) bVar;
        this.f11243d = hVar;
    }

    @Override // com.facebook.hermes.intl.c
    public AttributedCharacterIterator a(double d11) {
        return this.f11240a.formatToCharacterIterator(Double.valueOf(d11));
    }

    @Override // com.facebook.hermes.intl.c
    public String b(double d11) {
        return this.f11240a.format(Double.valueOf(d11));
    }

    @Override // com.facebook.hermes.intl.c
    public String c(ye.b<?> bVar) {
        return "latn";
    }

    @Override // com.facebook.hermes.intl.c
    public String l(AttributedCharacterIterator.Attribute attribute, double d11) {
        return "literal";
    }

    @Override // com.facebook.hermes.intl.c
    /* renamed from: m */
    public o k(ye.b<?> bVar, String str, c.h hVar, c.d dVar, c.e eVar, c.b bVar2) {
        java.text.NumberFormat numberFormat = java.text.NumberFormat.getInstance((Locale) bVar.h());
        numberFormat.setRoundingMode(RoundingMode.HALF_UP);
        o((DecimalFormat) numberFormat, bVar, hVar);
        return this;
    }

    @Override // com.facebook.hermes.intl.c
    /* renamed from: p */
    public o d(String str, c.EnumC0213c enumC0213c) {
        if (this.f11243d == c.h.CURRENCY) {
            Currency currency = Currency.getInstance(str);
            this.f11241b.setCurrency(currency);
            int i11 = a.f11244a[enumC0213c.ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    str = currency.getSymbol(this.f11242c.h());
                }
            } else if (Build.VERSION.SDK_INT >= 19) {
                str = currency.getDisplayName(this.f11242c.h());
            } else {
                str = currency.getSymbol(this.f11242c.h());
            }
            DecimalFormatSymbols decimalFormatSymbols = this.f11241b.getDecimalFormatSymbols();
            decimalFormatSymbols.setCurrencySymbol(str);
            this.f11241b.setDecimalFormatSymbols(decimalFormatSymbols);
            this.f11241b.getDecimalFormatSymbols().setCurrencySymbol(str);
        }
        return this;
    }

    @Override // com.facebook.hermes.intl.c
    /* renamed from: q */
    public o h(c.f fVar, int i11, int i12) {
        if (fVar == c.f.FRACTION_DIGITS) {
            if (i11 >= 0) {
                this.f11241b.setMinimumFractionDigits(i11);
            }
            if (i12 >= 0) {
                this.f11241b.setMaximumFractionDigits(i12);
            }
        }
        return this;
    }

    @Override // com.facebook.hermes.intl.c
    /* renamed from: r */
    public o g(boolean z11) {
        this.f11241b.setGroupingUsed(z11);
        return this;
    }

    @Override // com.facebook.hermes.intl.c
    /* renamed from: s */
    public o f(int i11) {
        if (i11 != -1) {
            this.f11241b.setMinimumIntegerDigits(i11);
        }
        return this;
    }

    @Override // com.facebook.hermes.intl.c
    /* renamed from: t */
    public o j(c.g gVar) {
        if (gVar == c.g.NEVER) {
            this.f11241b.setPositivePrefix("");
            this.f11241b.setPositiveSuffix("");
            this.f11241b.setNegativePrefix("");
            this.f11241b.setNegativeSuffix("");
        }
        return this;
    }

    @Override // com.facebook.hermes.intl.c
    /* renamed from: u */
    public o e(c.f fVar, int i11, int i12) {
        return this;
    }

    @Override // com.facebook.hermes.intl.c
    /* renamed from: v */
    public o i(String str, c.i iVar) {
        return this;
    }
}