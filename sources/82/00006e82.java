package fp;

import androidx.recyclerview.widget.l;
import ch.qos.logback.core.CoreConstants;
import com.google.zxing.FormatException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class s {

    /* renamed from: a  reason: collision with root package name */
    private final uo.a f26713a;

    /* renamed from: b  reason: collision with root package name */
    private final m f26714b = new m();

    /* renamed from: c  reason: collision with root package name */
    private final StringBuilder f26715c = new StringBuilder();

    /* JADX INFO: Access modifiers changed from: package-private */
    public s(uo.a aVar) {
        this.f26713a = aVar;
    }

    private n b(int i11) {
        char c11;
        int f11 = f(i11, 5);
        if (f11 == 15) {
            return new n(i11 + 5, CoreConstants.DOLLAR);
        }
        if (f11 >= 5 && f11 < 15) {
            return new n(i11 + 5, (char) ((f11 + 48) - 5));
        }
        int f12 = f(i11, 6);
        if (f12 >= 32 && f12 < 58) {
            return new n(i11 + 6, (char) (f12 + 33));
        }
        switch (f12) {
            case 58:
                c11 = '*';
                break;
            case 59:
                c11 = CoreConstants.COMMA_CHAR;
                break;
            case 60:
                c11 = CoreConstants.DASH_CHAR;
                break;
            case 61:
                c11 = CoreConstants.DOT;
                break;
            case 62:
                c11 = '/';
                break;
            default:
                throw new IllegalStateException("Decoding invalid alphanumeric value: ".concat(String.valueOf(f12)));
        }
        return new n(i11 + 6, c11);
    }

    private n d(int i11) {
        char c11;
        int f11 = f(i11, 5);
        if (f11 == 15) {
            return new n(i11 + 5, CoreConstants.DOLLAR);
        }
        if (f11 >= 5 && f11 < 15) {
            return new n(i11 + 5, (char) ((f11 + 48) - 5));
        }
        int f12 = f(i11, 7);
        if (f12 < 64 || f12 >= 90) {
            if (f12 >= 90 && f12 < 116) {
                return new n(i11 + 7, (char) (f12 + 7));
            }
            switch (f(i11, 8)) {
                case 232:
                    c11 = '!';
                    break;
                case 233:
                    c11 = CoreConstants.DOUBLE_QUOTE_CHAR;
                    break;
                case 234:
                    c11 = CoreConstants.PERCENT_CHAR;
                    break;
                case 235:
                    c11 = '&';
                    break;
                case 236:
                    c11 = CoreConstants.SINGLE_QUOTE_CHAR;
                    break;
                case 237:
                    c11 = CoreConstants.LEFT_PARENTHESIS_CHAR;
                    break;
                case 238:
                    c11 = CoreConstants.RIGHT_PARENTHESIS_CHAR;
                    break;
                case 239:
                    c11 = '*';
                    break;
                case 240:
                    c11 = '+';
                    break;
                case 241:
                    c11 = CoreConstants.COMMA_CHAR;
                    break;
                case 242:
                    c11 = CoreConstants.DASH_CHAR;
                    break;
                case 243:
                    c11 = CoreConstants.DOT;
                    break;
                case 244:
                    c11 = '/';
                    break;
                case 245:
                    c11 = CoreConstants.COLON_CHAR;
                    break;
                case 246:
                    c11 = ';';
                    break;
                case 247:
                    c11 = '<';
                    break;
                case 248:
                    c11 = '=';
                    break;
                case 249:
                    c11 = '>';
                    break;
                case l.f.DEFAULT_SWIPE_ANIMATION_DURATION /* 250 */:
                    c11 = '?';
                    break;
                case 251:
                    c11 = '_';
                    break;
                case 252:
                    c11 = ' ';
                    break;
                default:
                    throw FormatException.a();
            }
            return new n(i11 + 8, c11);
        }
        return new n(i11 + 7, (char) (f12 + 1));
    }

    private p e(int i11) {
        int i12 = i11 + 7;
        if (i12 > this.f26713a.g()) {
            int f11 = f(i11, 4);
            if (f11 == 0) {
                return new p(this.f26713a.g(), 10, 10);
            }
            return new p(this.f26713a.g(), f11 - 1, 10);
        }
        int f12 = f(i11, 7) - 8;
        return new p(i12, f12 / 11, f12 % 11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int g(uo.a aVar, int i11, int i12) {
        int i13 = 0;
        for (int i14 = 0; i14 < i12; i14++) {
            if (aVar.c(i11 + i14)) {
                i13 |= 1 << ((i12 - i14) - 1);
            }
        }
        return i13;
    }

    private boolean h(int i11) {
        int i12 = i11 + 3;
        if (i12 > this.f26713a.g()) {
            return false;
        }
        while (i11 < i12) {
            if (this.f26713a.c(i11)) {
                return false;
            }
            i11++;
        }
        return true;
    }

    private boolean i(int i11) {
        int i12;
        if (i11 + 1 > this.f26713a.g()) {
            return false;
        }
        for (int i13 = 0; i13 < 5 && (i12 = i13 + i11) < this.f26713a.g(); i13++) {
            if (i13 == 2) {
                if (!this.f26713a.c(i11 + 2)) {
                    return false;
                }
            } else if (this.f26713a.c(i12)) {
                return false;
            }
        }
        return true;
    }

    private boolean j(int i11) {
        int i12;
        if (i11 + 1 > this.f26713a.g()) {
            return false;
        }
        for (int i13 = 0; i13 < 4 && (i12 = i13 + i11) < this.f26713a.g(); i13++) {
            if (this.f26713a.c(i12)) {
                return false;
            }
        }
        return true;
    }

    private boolean k(int i11) {
        int f11;
        if (i11 + 5 > this.f26713a.g()) {
            return false;
        }
        int f12 = f(i11, 5);
        if (f12 < 5 || f12 >= 16) {
            return i11 + 6 <= this.f26713a.g() && (f11 = f(i11, 6)) >= 16 && f11 < 63;
        }
        return true;
    }

    private boolean l(int i11) {
        int f11;
        if (i11 + 5 > this.f26713a.g()) {
            return false;
        }
        int f12 = f(i11, 5);
        if (f12 < 5 || f12 >= 16) {
            if (i11 + 7 > this.f26713a.g()) {
                return false;
            }
            int f13 = f(i11, 7);
            if (f13 < 64 || f13 >= 116) {
                return i11 + 8 <= this.f26713a.g() && (f11 = f(i11, 8)) >= 232 && f11 < 253;
            }
            return true;
        }
        return true;
    }

    private boolean m(int i11) {
        if (i11 + 7 > this.f26713a.g()) {
            return i11 + 4 <= this.f26713a.g();
        }
        int i12 = i11;
        while (true) {
            int i13 = i11 + 3;
            if (i12 < i13) {
                if (this.f26713a.c(i12)) {
                    return true;
                }
                i12++;
            } else {
                return this.f26713a.c(i13);
            }
        }
    }

    private l n() {
        while (k(this.f26714b.a())) {
            n b11 = b(this.f26714b.a());
            this.f26714b.h(b11.a());
            if (b11.c()) {
                return new l(new o(this.f26714b.a(), this.f26715c.toString()), true);
            }
            this.f26715c.append(b11.b());
        }
        if (h(this.f26714b.a())) {
            this.f26714b.b(3);
            this.f26714b.g();
        } else if (i(this.f26714b.a())) {
            if (this.f26714b.a() + 5 < this.f26713a.g()) {
                this.f26714b.b(5);
            } else {
                this.f26714b.h(this.f26713a.g());
            }
            this.f26714b.f();
        }
        return new l(false);
    }

    private o o() {
        l q11;
        boolean b11;
        do {
            int a11 = this.f26714b.a();
            if (this.f26714b.c()) {
                q11 = n();
                b11 = q11.b();
            } else if (this.f26714b.d()) {
                q11 = p();
                b11 = q11.b();
            } else {
                q11 = q();
                b11 = q11.b();
            }
            if (!(a11 != this.f26714b.a()) && !b11) {
                break;
            }
        } while (!b11);
        return q11.a();
    }

    private l p() {
        while (l(this.f26714b.a())) {
            n d11 = d(this.f26714b.a());
            this.f26714b.h(d11.a());
            if (d11.c()) {
                return new l(new o(this.f26714b.a(), this.f26715c.toString()), true);
            }
            this.f26715c.append(d11.b());
        }
        if (h(this.f26714b.a())) {
            this.f26714b.b(3);
            this.f26714b.g();
        } else if (i(this.f26714b.a())) {
            if (this.f26714b.a() + 5 < this.f26713a.g()) {
                this.f26714b.b(5);
            } else {
                this.f26714b.h(this.f26713a.g());
            }
            this.f26714b.e();
        }
        return new l(false);
    }

    private l q() {
        o oVar;
        while (m(this.f26714b.a())) {
            p e11 = e(this.f26714b.a());
            this.f26714b.h(e11.a());
            if (e11.d()) {
                if (e11.e()) {
                    oVar = new o(this.f26714b.a(), this.f26715c.toString());
                } else {
                    oVar = new o(this.f26714b.a(), this.f26715c.toString(), e11.c());
                }
                return new l(oVar, true);
            }
            this.f26715c.append(e11.b());
            if (e11.e()) {
                return new l(new o(this.f26714b.a(), this.f26715c.toString()), true);
            }
            this.f26715c.append(e11.c());
        }
        if (j(this.f26714b.a())) {
            this.f26714b.e();
            this.f26714b.b(4);
        }
        return new l(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String a(StringBuilder sb2, int i11) {
        String str = null;
        while (true) {
            o c11 = c(i11, str);
            String a11 = r.a(c11.b());
            if (a11 != null) {
                sb2.append(a11);
            }
            String valueOf = c11.d() ? String.valueOf(c11.c()) : null;
            if (i11 != c11.a()) {
                i11 = c11.a();
                str = valueOf;
            } else {
                return sb2.toString();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public o c(int i11, String str) {
        this.f26715c.setLength(0);
        if (str != null) {
            this.f26715c.append(str);
        }
        this.f26714b.h(i11);
        o o11 = o();
        if (o11 != null && o11.d()) {
            return new o(this.f26714b.a(), this.f26715c.toString(), o11.c());
        }
        return new o(this.f26714b.a(), this.f26715c.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int f(int i11, int i12) {
        return g(this.f26713a, i11, i12);
    }
}