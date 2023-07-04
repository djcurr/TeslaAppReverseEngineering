package com.facebook.hermes.intl;

import android.icu.text.RuleBasedCollator;
import com.facebook.hermes.intl.a;

/* loaded from: classes3.dex */
public class l implements com.facebook.hermes.intl.a {

    /* renamed from: a  reason: collision with root package name */
    private RuleBasedCollator f11235a = null;

    /* loaded from: classes3.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f11236a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f11237b;

        static {
            int[] iArr = new int[a.b.values().length];
            f11237b = iArr;
            try {
                iArr[a.b.UPPER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11237b[a.b.LOWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11237b[a.b.FALSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[a.c.values().length];
            f11236a = iArr2;
            try {
                iArr2[a.c.BASE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f11236a[a.c.ACCENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f11236a[a.c.CASE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f11236a[a.c.VARIANT.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    @Override // com.facebook.hermes.intl.a
    public int a(String str, String str2) {
        return this.f11235a.compare(str, str2);
    }

    @Override // com.facebook.hermes.intl.a
    public a.c b() {
        RuleBasedCollator ruleBasedCollator = this.f11235a;
        if (ruleBasedCollator == null) {
            return a.c.LOCALE;
        }
        int strength = ruleBasedCollator.getStrength();
        if (strength == 0) {
            return this.f11235a.isCaseLevel() ? a.c.CASE : a.c.BASE;
        } else if (strength == 1) {
            return a.c.ACCENT;
        } else {
            return a.c.VARIANT;
        }
    }

    @Override // com.facebook.hermes.intl.a
    public com.facebook.hermes.intl.a c(ye.b<?> bVar) {
        RuleBasedCollator ruleBasedCollator = (RuleBasedCollator) RuleBasedCollator.getInstance(((ye.f) bVar).h());
        this.f11235a = ruleBasedCollator;
        ruleBasedCollator.setDecomposition(17);
        return this;
    }

    @Override // com.facebook.hermes.intl.a
    public com.facebook.hermes.intl.a d(boolean z11) {
        if (z11) {
            this.f11235a.setAlternateHandlingShifted(true);
        }
        return this;
    }

    @Override // com.facebook.hermes.intl.a
    public com.facebook.hermes.intl.a e(a.b bVar) {
        int i11 = a.f11237b[bVar.ordinal()];
        if (i11 == 1) {
            this.f11235a.setUpperCaseFirst(true);
        } else if (i11 != 2) {
            this.f11235a.setCaseFirstDefault();
        } else {
            this.f11235a.setLowerCaseFirst(true);
        }
        return this;
    }

    @Override // com.facebook.hermes.intl.a
    public com.facebook.hermes.intl.a f(boolean z11) {
        if (z11) {
            this.f11235a.setNumericCollation(ye.d.e(Boolean.TRUE));
        }
        return this;
    }

    @Override // com.facebook.hermes.intl.a
    public com.facebook.hermes.intl.a g(a.c cVar) {
        int i11 = a.f11236a[cVar.ordinal()];
        if (i11 == 1) {
            this.f11235a.setStrength(0);
        } else if (i11 == 2) {
            this.f11235a.setStrength(1);
        } else if (i11 == 3) {
            this.f11235a.setStrength(0);
            this.f11235a.setCaseLevel(true);
        } else if (i11 == 4) {
            this.f11235a.setStrength(2);
        }
        return this;
    }
}