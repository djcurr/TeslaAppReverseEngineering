package com.facebook.hermes.intl;

import com.facebook.hermes.intl.a;
import java.text.RuleBasedCollator;

/* loaded from: classes3.dex */
public class k implements com.facebook.hermes.intl.a {

    /* renamed from: a  reason: collision with root package name */
    private RuleBasedCollator f11232a;

    /* renamed from: b  reason: collision with root package name */
    private g f11233b;

    /* loaded from: classes3.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f11234a;

        static {
            int[] iArr = new int[a.c.values().length];
            f11234a = iArr;
            try {
                iArr[a.c.BASE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11234a[a.c.ACCENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11234a[a.c.VARIANT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11234a[a.c.CASE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @Override // com.facebook.hermes.intl.a
    public int a(String str, String str2) {
        return this.f11232a.compare(str, str2);
    }

    @Override // com.facebook.hermes.intl.a
    public a.c b() {
        RuleBasedCollator ruleBasedCollator = this.f11232a;
        if (ruleBasedCollator == null) {
            return a.c.LOCALE;
        }
        int strength = ruleBasedCollator.getStrength();
        if (strength == 0) {
            return a.c.BASE;
        }
        if (strength == 1) {
            return a.c.ACCENT;
        }
        return a.c.VARIANT;
    }

    @Override // com.facebook.hermes.intl.a
    public com.facebook.hermes.intl.a c(ye.b<?> bVar) {
        g gVar = (g) bVar;
        this.f11233b = gVar;
        this.f11232a = (RuleBasedCollator) RuleBasedCollator.getInstance(gVar.h());
        return this;
    }

    @Override // com.facebook.hermes.intl.a
    public com.facebook.hermes.intl.a d(boolean z11) {
        return this;
    }

    @Override // com.facebook.hermes.intl.a
    public com.facebook.hermes.intl.a e(a.b bVar) {
        return this;
    }

    @Override // com.facebook.hermes.intl.a
    public com.facebook.hermes.intl.a f(boolean z11) {
        return this;
    }

    @Override // com.facebook.hermes.intl.a
    public com.facebook.hermes.intl.a g(a.c cVar) {
        int i11 = a.f11234a[cVar.ordinal()];
        if (i11 == 1) {
            this.f11232a.setStrength(0);
        } else if (i11 == 2) {
            this.f11232a.setStrength(1);
        } else if (i11 == 3) {
            this.f11232a.setStrength(2);
        } else if (i11 == 4) {
            this.f11232a.setStrength(0);
        }
        return this;
    }
}