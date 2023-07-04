package jq;

import com.nimbusds.jose.shaded.json.parser.ParseException;

/* loaded from: classes2.dex */
abstract class c extends b {

    /* renamed from: x  reason: collision with root package name */
    protected int f33929x;

    public c(int i11) {
        super(i11);
    }

    @Override // jq.b
    protected void j(boolean[] zArr) {
        int i11 = this.f33914f;
        s(zArr);
        v(i11, this.f33914f);
    }

    @Override // jq.b
    protected Object l(boolean[] zArr) {
        int i11 = this.f33914f;
        f();
        r();
        char c11 = this.f33909a;
        if (c11 != '.' && c11 != 'E' && c11 != 'e') {
            t();
            char c12 = this.f33909a;
            if (c12 >= 0 && c12 < '~' && !zArr[c12] && c12 != 26) {
                s(zArr);
                v(i11, this.f33914f);
                if (this.f33917i) {
                    return this.f33913e;
                }
                throw new ParseException(this.f33914f, 1, this.f33913e);
            }
            v(i11, this.f33914f);
            return e(this.f33913e);
        }
        if (c11 == '.') {
            f();
            r();
        }
        char c13 = this.f33909a;
        if (c13 != 'E' && c13 != 'e') {
            t();
            char c14 = this.f33909a;
            if (c14 >= 0 && c14 < '~' && !zArr[c14] && c14 != 26) {
                s(zArr);
                v(i11, this.f33914f);
                if (this.f33917i) {
                    return this.f33913e;
                }
                throw new ParseException(this.f33914f, 1, this.f33913e);
            }
            v(i11, this.f33914f);
            return c();
        }
        this.f33911c.a('E');
        f();
        char c15 = this.f33909a;
        if (c15 != '+' && c15 != '-' && (c15 < '0' || c15 > '9')) {
            s(zArr);
            v(i11, this.f33914f);
            if (this.f33917i) {
                if (!this.f33915g) {
                    b();
                }
                return this.f33913e;
            }
            throw new ParseException(this.f33914f, 1, this.f33913e);
        }
        this.f33911c.a(c15);
        f();
        r();
        t();
        char c16 = this.f33909a;
        if (c16 >= 0 && c16 < '~' && !zArr[c16] && c16 != 26) {
            s(zArr);
            v(i11, this.f33914f);
            if (this.f33917i) {
                return this.f33913e;
            }
            throw new ParseException(this.f33914f, 1, this.f33913e);
        }
        v(i11, this.f33914f);
        return c();
    }

    @Override // jq.b
    protected void o() {
        if (!this.f33918j && this.f33909a == '\'') {
            if (this.f33917i) {
                j(b.f33904s);
                return;
            }
            throw new ParseException(this.f33914f, 0, Character.valueOf(this.f33909a));
        }
        int w11 = w(this.f33909a, this.f33914f + 1);
        if (w11 != -1) {
            u(this.f33914f + 1, w11);
            if (this.f33913e.indexOf(92) == -1) {
                a();
                this.f33914f = w11;
                f();
                return;
            }
            this.f33911c.b();
            p();
            return;
        }
        throw new ParseException(this.f33929x, 3, null);
    }

    protected abstract void u(int i11, int i12);

    protected abstract void v(int i11, int i12);

    protected abstract int w(char c11, int i11);
}