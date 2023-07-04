package jq;

import com.nimbusds.jose.shaded.json.parser.ParseException;
import hq.i;
import lq.e;
import lq.f;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class d extends c {

    /* renamed from: y  reason: collision with root package name */
    private String f33930y;

    public d(int i11) {
        super(i11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // jq.b
    public void f() {
        int i11 = this.f33914f + 1;
        this.f33914f = i11;
        if (i11 >= this.f33929x) {
            this.f33909a = (char) 26;
        } else {
            this.f33909a = this.f33930y.charAt(i11);
        }
    }

    @Override // jq.b
    protected void k() {
        int i11 = this.f33914f + 1;
        this.f33914f = i11;
        if (i11 < this.f33929x) {
            this.f33909a = this.f33930y.charAt(i11);
        } else {
            this.f33909a = (char) 26;
            throw new ParseException(this.f33914f - 1, 3, "EOF");
        }
    }

    @Override // jq.b
    protected void n() {
        int i11 = this.f33914f + 1;
        this.f33914f = i11;
        if (i11 >= this.f33929x) {
            this.f33909a = (char) 26;
        } else {
            this.f33909a = this.f33930y.charAt(i11);
        }
    }

    @Override // jq.c
    protected void u(int i11, int i12) {
        this.f33913e = this.f33930y.substring(i11, i12);
    }

    @Override // jq.c
    protected void v(int i11, int i12) {
        while (i11 < i12 - 1 && Character.isWhitespace(this.f33930y.charAt(i11))) {
            i11++;
        }
        while (true) {
            int i13 = i12 - 1;
            if (i13 <= i11 || !Character.isWhitespace(this.f33930y.charAt(i13))) {
                break;
            }
            i12--;
        }
        u(i11, i12);
    }

    @Override // jq.c
    protected int w(char c11, int i11) {
        return this.f33930y.indexOf(c11, i11);
    }

    public Object x(String str) {
        return y(str, i.f29397c.f37293b);
    }

    public <T> T y(String str, f<T> fVar) {
        e eVar = fVar.f37296a;
        this.f33930y = str;
        this.f33929x = str.length();
        return (T) d(fVar);
    }
}