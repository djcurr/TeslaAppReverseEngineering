package ww;

import ezvcard.io.CannotParseException;

/* loaded from: classes5.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private final Integer f56424a;

    /* renamed from: b  reason: collision with root package name */
    private final Integer f56425b;

    /* renamed from: c  reason: collision with root package name */
    private final String f56426c;

    /* renamed from: d  reason: collision with root package name */
    private final String f56427d;

    /* renamed from: ww.b$b  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C1282b {

        /* renamed from: a  reason: collision with root package name */
        private Integer f56428a;

        /* renamed from: b  reason: collision with root package name */
        private Integer f56429b;

        /* renamed from: c  reason: collision with root package name */
        private String f56430c;

        /* renamed from: d  reason: collision with root package name */
        private String f56431d;

        public C1282b(ww.a aVar) {
            b(aVar.b());
            e(aVar.c());
        }

        public b a() {
            return new b(this.f56428a, this.f56430c, this.f56429b, this.f56431d);
        }

        public C1282b b(Integer num) {
            this.f56428a = num;
            return this;
        }

        public C1282b c(int i11, Object... objArr) {
            this.f56429b = Integer.valueOf(i11);
            this.f56431d = ezvcard.a.INSTANCE.getParseMessage(i11, objArr);
            return this;
        }

        public C1282b d(CannotParseException cannotParseException) {
            return c(cannotParseException.b().intValue(), cannotParseException.a());
        }

        public C1282b e(String str) {
            this.f56430c = str;
            return this;
        }
    }

    public String toString() {
        int i11;
        String str = this.f56427d;
        if (this.f56424a != null) {
            str = "(" + this.f56424a + ") " + str;
        }
        Integer num = this.f56425b;
        if (num == null && this.f56426c == null) {
            return str;
        }
        if (num != null || this.f56426c == null) {
            i11 = (num == null || this.f56426c != null) ? 36 : 37;
        } else {
            i11 = 35;
        }
        return ezvcard.a.INSTANCE.getParseMessage(i11, num, this.f56426c, str);
    }

    private b(Integer num, String str, Integer num2, String str2) {
        this.f56425b = num;
        this.f56426c = str;
        this.f56424a = num2;
        this.f56427d = str2;
    }
}