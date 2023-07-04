package com.facebook.hermes.intl;

import android.icu.text.CompactDecimalFormat;
import android.icu.text.DecimalFormat;
import android.icu.text.DecimalFormatSymbols;
import android.icu.text.MeasureFormat;
import android.icu.text.NumberFormat;
import android.icu.text.NumberingSystem;
import android.icu.util.Currency;
import android.icu.util.Measure;
import android.icu.util.MeasureUnit;
import android.icu.util.ULocale;
import com.facebook.hermes.intl.c;
import ezvcard.property.Kind;
import java.text.AttributedCharacterIterator;
import java.text.Format;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public class p implements c {

    /* renamed from: a  reason: collision with root package name */
    private Format f11245a;

    /* renamed from: b  reason: collision with root package name */
    private android.icu.text.NumberFormat f11246b;

    /* renamed from: c  reason: collision with root package name */
    private ye.f f11247c;

    /* renamed from: d  reason: collision with root package name */
    private c.h f11248d;

    /* renamed from: e  reason: collision with root package name */
    private MeasureUnit f11249e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f11250a;

        static {
            int[] iArr = new int[c.g.values().length];
            f11250a = iArr;
            try {
                iArr[c.g.NEVER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11250a[c.g.ALWAYS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11250a[c.g.EXCEPTZERO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
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

    private void o(android.icu.text.NumberFormat numberFormat, ye.b<?> bVar, c.h hVar) {
        this.f11246b = numberFormat;
        this.f11245a = numberFormat;
        this.f11247c = (ye.f) bVar;
        this.f11248d = hVar;
        numberFormat.setRoundingMode(4);
    }

    private static MeasureUnit p(String str) {
        for (MeasureUnit measureUnit : MeasureUnit.getAvailable()) {
            if (!measureUnit.getSubtype().equals(str)) {
                String subtype = measureUnit.getSubtype();
                if (subtype.equals(measureUnit.getType() + "-" + str)) {
                }
            }
            return measureUnit;
        }
        throw new JSRangeErrorException("Unknown unit: " + str);
    }

    @Override // com.facebook.hermes.intl.c
    public AttributedCharacterIterator a(double d11) {
        try {
            try {
                Format format = this.f11245a;
                if ((format instanceof MeasureFormat) && this.f11249e != null) {
                    return format.formatToCharacterIterator(new Measure(Double.valueOf(d11), this.f11249e));
                }
                return format.formatToCharacterIterator(Double.valueOf(d11));
            } catch (NumberFormatException unused) {
                return android.icu.text.NumberFormat.getInstance(ULocale.getDefault()).formatToCharacterIterator(Double.valueOf(d11));
            } catch (Exception unused2) {
                return android.icu.text.NumberFormat.getInstance(ULocale.forLanguageTag("en")).formatToCharacterIterator(Double.valueOf(d11));
            }
        } catch (RuntimeException unused3) {
            return android.icu.text.NumberFormat.getInstance(ULocale.forLanguageTag("en")).formatToCharacterIterator(Double.valueOf(d11));
        }
    }

    @Override // com.facebook.hermes.intl.c
    public String b(double d11) {
        try {
            try {
                Format format = this.f11245a;
                if ((format instanceof MeasureFormat) && this.f11249e != null) {
                    return format.format(new Measure(Double.valueOf(d11), this.f11249e));
                }
                return format.format(Double.valueOf(d11));
            } catch (RuntimeException unused) {
                return android.icu.text.NumberFormat.getInstance(ULocale.forLanguageTag("en")).format(d11);
            }
        } catch (NumberFormatException unused2) {
            return android.icu.text.NumberFormat.getInstance(ULocale.getDefault()).format(d11);
        }
    }

    @Override // com.facebook.hermes.intl.c
    public String c(ye.b<?> bVar) {
        return NumberingSystem.getInstance((ULocale) bVar.h()).getName();
    }

    @Override // com.facebook.hermes.intl.c
    public String l(AttributedCharacterIterator.Attribute attribute, double d11) {
        return attribute == NumberFormat.Field.SIGN ? Double.compare(d11, 0.0d) >= 0 ? "plusSign" : "minusSign" : attribute == NumberFormat.Field.INTEGER ? Double.isNaN(d11) ? "nan" : Double.isInfinite(d11) ? "infinity" : "integer" : attribute == NumberFormat.Field.FRACTION ? "fraction" : attribute == NumberFormat.Field.EXPONENT ? "exponentInteger" : attribute == NumberFormat.Field.EXPONENT_SIGN ? "exponentMinusSign" : attribute == NumberFormat.Field.EXPONENT_SYMBOL ? "exponentSeparator" : attribute == NumberFormat.Field.DECIMAL_SEPARATOR ? "decimal" : attribute == NumberFormat.Field.GROUPING_SEPARATOR ? Kind.GROUP : attribute == NumberFormat.Field.PERCENT ? "percentSign" : attribute == NumberFormat.Field.PERMILLE ? "permilleSign" : attribute == NumberFormat.Field.CURRENCY ? "currency" : attribute.toString().equals("android.icu.text.NumberFormat$Field(compact)") ? "compact" : "literal";
    }

    @Override // com.facebook.hermes.intl.c
    /* renamed from: m */
    public p k(ye.b<?> bVar, String str, c.h hVar, c.d dVar, c.e eVar, c.b bVar2) {
        CompactDecimalFormat.CompactStyle compactStyle;
        if (!str.isEmpty()) {
            try {
                if (NumberingSystem.getInstanceByName(ye.d.h(str)) != null) {
                    ArrayList<String> arrayList = new ArrayList<>();
                    arrayList.add(ye.d.h(str));
                    bVar.f("nu", arrayList);
                } else {
                    throw new JSRangeErrorException("Invalid numbering system: " + str);
                }
            } catch (RuntimeException unused) {
                throw new JSRangeErrorException("Invalid numbering system: " + str);
            }
        }
        if (eVar == c.e.COMPACT && (hVar == c.h.DECIMAL || hVar == c.h.UNIT)) {
            if (bVar2 == c.b.SHORT) {
                compactStyle = CompactDecimalFormat.CompactStyle.SHORT;
            } else {
                compactStyle = CompactDecimalFormat.CompactStyle.LONG;
            }
            o(CompactDecimalFormat.getInstance((ULocale) bVar.h(), compactStyle), bVar, hVar);
        } else {
            android.icu.text.NumberFormat numberFormat = android.icu.text.NumberFormat.getInstance((ULocale) bVar.h(), hVar.getInitialNumberFormatStyle(eVar, dVar));
            if (eVar == c.e.ENGINEERING) {
                numberFormat.setMaximumIntegerDigits(3);
            }
            o(numberFormat, bVar, hVar);
        }
        return this;
    }

    @Override // com.facebook.hermes.intl.c
    /* renamed from: q */
    public p d(String str, c.EnumC0213c enumC0213c) {
        if (this.f11248d == c.h.CURRENCY) {
            Currency currency = Currency.getInstance(str);
            this.f11246b.setCurrency(currency);
            if (enumC0213c != c.EnumC0213c.CODE) {
                str = currency.getName(this.f11247c.h(), enumC0213c.getNameStyle(), (boolean[]) null);
            }
            android.icu.text.NumberFormat numberFormat = this.f11246b;
            if (numberFormat instanceof DecimalFormat) {
                DecimalFormat decimalFormat = (DecimalFormat) numberFormat;
                DecimalFormatSymbols decimalFormatSymbols = decimalFormat.getDecimalFormatSymbols();
                decimalFormatSymbols.setCurrencySymbol(str);
                decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
            }
        }
        return this;
    }

    @Override // com.facebook.hermes.intl.c
    /* renamed from: r */
    public p h(c.f fVar, int i11, int i12) {
        if (fVar == c.f.FRACTION_DIGITS) {
            if (i11 >= 0) {
                this.f11246b.setMinimumFractionDigits(i11);
            }
            if (i12 >= 0) {
                this.f11246b.setMaximumFractionDigits(i12);
            }
            android.icu.text.NumberFormat numberFormat = this.f11246b;
            if (numberFormat instanceof DecimalFormat) {
                ((DecimalFormat) numberFormat).setSignificantDigitsUsed(false);
            }
        }
        return this;
    }

    @Override // com.facebook.hermes.intl.c
    /* renamed from: s */
    public p g(boolean z11) {
        this.f11246b.setGroupingUsed(z11);
        return this;
    }

    @Override // com.facebook.hermes.intl.c
    /* renamed from: t */
    public p f(int i11) {
        if (i11 != -1) {
            this.f11246b.setMinimumIntegerDigits(i11);
        }
        return this;
    }

    @Override // com.facebook.hermes.intl.c
    /* renamed from: u */
    public p j(c.g gVar) {
        android.icu.text.NumberFormat numberFormat = this.f11246b;
        if (numberFormat instanceof DecimalFormat) {
            DecimalFormat decimalFormat = (DecimalFormat) numberFormat;
            DecimalFormatSymbols decimalFormatSymbols = decimalFormat.getDecimalFormatSymbols();
            int i11 = a.f11250a[gVar.ordinal()];
            if (i11 == 1) {
                decimalFormat.setPositivePrefix("");
                decimalFormat.setPositiveSuffix("");
                decimalFormat.setNegativePrefix("");
                decimalFormat.setNegativeSuffix("");
            } else if (i11 == 2 || i11 == 3) {
                if (!decimalFormat.getNegativePrefix().isEmpty()) {
                    decimalFormat.setPositivePrefix(new String(new char[]{decimalFormatSymbols.getPlusSign()}));
                }
                if (!decimalFormat.getNegativeSuffix().isEmpty()) {
                    decimalFormat.setPositiveSuffix(new String(new char[]{decimalFormatSymbols.getPlusSign()}));
                }
            }
        }
        return this;
    }

    @Override // com.facebook.hermes.intl.c
    /* renamed from: v */
    public p e(c.f fVar, int i11, int i12) {
        android.icu.text.NumberFormat numberFormat = this.f11246b;
        if ((numberFormat instanceof DecimalFormat) && fVar == c.f.SIGNIFICANT_DIGITS) {
            DecimalFormat decimalFormat = (DecimalFormat) numberFormat;
            if (i11 >= 0) {
                decimalFormat.setMinimumSignificantDigits(i11);
            }
            if (i12 >= 0) {
                if (i12 >= decimalFormat.getMinimumSignificantDigits()) {
                    decimalFormat.setMaximumSignificantDigits(i12);
                } else {
                    throw new JSRangeErrorException("maximumSignificantDigits should be at least equal to minimumSignificantDigits");
                }
            }
            decimalFormat.setSignificantDigitsUsed(true);
        }
        return this;
    }

    @Override // com.facebook.hermes.intl.c
    /* renamed from: w */
    public p i(String str, c.i iVar) {
        if (this.f11248d == c.h.UNIT) {
            this.f11249e = p(str);
            this.f11245a = MeasureFormat.getInstance(this.f11247c.h(), iVar.getFormatWidth(), this.f11246b);
        }
        return this;
    }
}