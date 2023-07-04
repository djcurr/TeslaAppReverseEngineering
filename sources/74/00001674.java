package com.facebook.hermes.intl;

import android.icu.text.MeasureFormat;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.stripe.android.model.PaymentMethodOptionsParams;
import expo.modules.interfaces.permissions.PermissionsResponse;
import java.text.AttributedCharacterIterator;

/* loaded from: classes3.dex */
public interface c {

    /* loaded from: classes3.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f11191a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f11192b;

        /* renamed from: c  reason: collision with root package name */
        static final /* synthetic */ int[] f11193c;

        /* renamed from: d  reason: collision with root package name */
        static final /* synthetic */ int[] f11194d;

        /* renamed from: e  reason: collision with root package name */
        static final /* synthetic */ int[] f11195e;

        /* renamed from: f  reason: collision with root package name */
        static final /* synthetic */ int[] f11196f;

        /* renamed from: g  reason: collision with root package name */
        static final /* synthetic */ int[] f11197g;

        static {
            int[] iArr = new int[d.values().length];
            f11197g = iArr;
            try {
                iArr[d.ACCOUNTING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11197g[d.STANDARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[EnumC0213c.values().length];
            f11196f = iArr2;
            try {
                iArr2[EnumC0213c.SYMBOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11196f[EnumC0213c.NARROWSYMBOL.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f11196f[EnumC0213c.CODE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f11196f[EnumC0213c.NAME.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[i.values().length];
            f11195e = iArr3;
            try {
                iArr3[i.SHORT.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f11195e[i.NARROW.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f11195e[i.LONG.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            int[] iArr4 = new int[g.values().length];
            f11194d = iArr4;
            try {
                iArr4[g.AUTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f11194d[g.ALWAYS.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f11194d[g.NEVER.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f11194d[g.EXCEPTZERO.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            int[] iArr5 = new int[b.values().length];
            f11193c = iArr5;
            try {
                iArr5[b.SHORT.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f11193c[b.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            int[] iArr6 = new int[e.values().length];
            f11192b = iArr6;
            try {
                iArr6[e.STANDARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f11192b[e.SCIENTIFIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f11192b[e.ENGINEERING.ordinal()] = 3;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f11192b[e.COMPACT.ordinal()] = 4;
            } catch (NoSuchFieldError unused19) {
            }
            int[] iArr7 = new int[h.values().length];
            f11191a = iArr7;
            try {
                iArr7[h.DECIMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f11191a[h.PERCENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f11191a[h.CURRENCY.ordinal()] = 3;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f11191a[h.UNIT.ordinal()] = 4;
            } catch (NoSuchFieldError unused23) {
            }
        }
    }

    /* loaded from: classes3.dex */
    public enum b {
        SHORT,
        LONG;

        @Override // java.lang.Enum
        public String toString() {
            int i11 = a.f11193c[ordinal()];
            if (i11 != 1) {
                if (i11 == 2) {
                    return "long";
                }
                throw new IllegalArgumentException();
            }
            return "short";
        }
    }

    /* renamed from: com.facebook.hermes.intl.c$c  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public enum EnumC0213c {
        SYMBOL,
        NARROWSYMBOL,
        CODE,
        NAME;

        public int getNameStyle() {
            return a.f11196f[ordinal()] != 4 ? 0 : 1;
        }

        @Override // java.lang.Enum
        public String toString() {
            int i11 = a.f11196f[ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 == 4) {
                            return "name";
                        }
                        throw new IllegalArgumentException();
                    }
                    return PaymentMethodOptionsParams.Blik.PARAM_CODE;
                }
                return "narrowSymbol";
            }
            return "symbol";
        }
    }

    /* loaded from: classes3.dex */
    public enum d {
        STANDARD,
        ACCOUNTING;

        @Override // java.lang.Enum
        public String toString() {
            int i11 = a.f11197g[ordinal()];
            if (i11 != 1) {
                if (i11 == 2) {
                    return "standard";
                }
                throw new IllegalArgumentException();
            }
            return PlaceTypes.ACCOUNTING;
        }
    }

    /* loaded from: classes3.dex */
    public enum e {
        STANDARD,
        SCIENTIFIC,
        ENGINEERING,
        COMPACT;

        @Override // java.lang.Enum
        public String toString() {
            int i11 = a.f11192b[ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 == 4) {
                            return "compact";
                        }
                        throw new IllegalArgumentException();
                    }
                    return "engineering";
                }
                return "scientific";
            }
            return "standard";
        }
    }

    /* loaded from: classes3.dex */
    public enum f {
        SIGNIFICANT_DIGITS,
        FRACTION_DIGITS,
        COMPACT_ROUNDING
    }

    /* loaded from: classes3.dex */
    public enum g {
        AUTO,
        ALWAYS,
        NEVER,
        EXCEPTZERO;

        @Override // java.lang.Enum
        public String toString() {
            int i11 = a.f11194d[ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 == 4) {
                            return "exceptZero";
                        }
                        throw new IllegalArgumentException();
                    }
                    return PermissionsResponse.PERMISSION_EXPIRES_NEVER;
                }
                return PermissionsResponse.SCOPE_ALWAYS;
            }
            return "auto";
        }
    }

    /* loaded from: classes3.dex */
    public enum h {
        DECIMAL,
        PERCENT,
        CURRENCY,
        UNIT;

        public int getInitialNumberFormatStyle(e eVar, d dVar) {
            int i11 = a.f11191a[ordinal()];
            if (i11 != 2) {
                if (i11 != 3) {
                    return (eVar == e.SCIENTIFIC || eVar == e.ENGINEERING) ? 3 : 0;
                } else if (dVar == d.ACCOUNTING) {
                    return 7;
                } else {
                    if (dVar == d.STANDARD) {
                        return 1;
                    }
                    throw new JSRangeErrorException("Unrecognized formatting style requested.");
                }
            }
            return 2;
        }

        @Override // java.lang.Enum
        public String toString() {
            int i11 = a.f11191a[ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 == 4) {
                            return "unit";
                        }
                        throw new IllegalArgumentException();
                    }
                    return "currency";
                }
                return "percent";
            }
            return "decimal";
        }
    }

    /* loaded from: classes3.dex */
    public enum i {
        SHORT,
        NARROW,
        LONG;

        public MeasureFormat.FormatWidth getFormatWidth() {
            int i11 = a.f11195e[ordinal()];
            if (i11 != 2) {
                if (i11 != 3) {
                    return MeasureFormat.FormatWidth.SHORT;
                }
                return MeasureFormat.FormatWidth.WIDE;
            }
            return MeasureFormat.FormatWidth.NARROW;
        }

        @Override // java.lang.Enum
        public String toString() {
            int i11 = a.f11195e[ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        return "long";
                    }
                    throw new IllegalArgumentException();
                }
                return "narrow";
            }
            return "short";
        }
    }

    AttributedCharacterIterator a(double d11);

    String b(double d11);

    String c(ye.b<?> bVar);

    c d(String str, EnumC0213c enumC0213c);

    c e(f fVar, int i11, int i12);

    c f(int i11);

    c g(boolean z11);

    c h(f fVar, int i11, int i12);

    c i(String str, i iVar);

    c j(g gVar);

    c k(ye.b<?> bVar, String str, h hVar, d dVar, e eVar, b bVar2);

    String l(AttributedCharacterIterator.Attribute attribute, double d11);
}