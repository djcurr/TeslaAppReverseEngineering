package kj;

import ak.g0;
import ak.v;
import android.text.TextUtils;
import ci.i;
import com.google.android.exoplayer2.ParserException;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ji.u;
import ji.v;
import ji.x;

/* loaded from: classes3.dex */
public final class t implements ji.h {

    /* renamed from: g  reason: collision with root package name */
    private static final Pattern f34811g = Pattern.compile("LOCAL:([^,]+)");

    /* renamed from: h  reason: collision with root package name */
    private static final Pattern f34812h = Pattern.compile("MPEGTS:(-?\\d+)");

    /* renamed from: a  reason: collision with root package name */
    private final String f34813a;

    /* renamed from: b  reason: collision with root package name */
    private final g0 f34814b;

    /* renamed from: d  reason: collision with root package name */
    private ji.j f34816d;

    /* renamed from: f  reason: collision with root package name */
    private int f34818f;

    /* renamed from: c  reason: collision with root package name */
    private final v f34815c = new v();

    /* renamed from: e  reason: collision with root package name */
    private byte[] f34817e = new byte[1024];

    public t(String str, g0 g0Var) {
        this.f34813a = str;
        this.f34814b = g0Var;
    }

    private x c(long j11) {
        x f11 = this.f34816d.f(0, 3);
        f11.d(new i.b().e0("text/vtt").V(this.f34813a).i0(j11).E());
        this.f34816d.s();
        return f11;
    }

    private void f() {
        v vVar = new v(this.f34817e);
        wj.i.e(vVar);
        long j11 = 0;
        long j12 = 0;
        for (String o11 = vVar.o(); !TextUtils.isEmpty(o11); o11 = vVar.o()) {
            if (o11.startsWith("X-TIMESTAMP-MAP")) {
                Matcher matcher = f34811g.matcher(o11);
                if (!matcher.find()) {
                    throw new ParserException(o11.length() != 0 ? "X-TIMESTAMP-MAP doesn't contain local timestamp: ".concat(o11) : new String("X-TIMESTAMP-MAP doesn't contain local timestamp: "));
                }
                Matcher matcher2 = f34812h.matcher(o11);
                if (!matcher2.find()) {
                    throw new ParserException(o11.length() != 0 ? "X-TIMESTAMP-MAP doesn't contain media timestamp: ".concat(o11) : new String("X-TIMESTAMP-MAP doesn't contain media timestamp: "));
                }
                j12 = wj.i.d((String) ak.a.e(matcher.group(1)));
                j11 = g0.f(Long.parseLong((String) ak.a.e(matcher2.group(1))));
            }
        }
        Matcher a11 = wj.i.a(vVar);
        if (a11 == null) {
            c(0L);
            return;
        }
        long d11 = wj.i.d((String) ak.a.e(a11.group(1)));
        long b11 = this.f34814b.b(g0.j((j11 + d11) - j12));
        x c11 = c(b11 - d11);
        this.f34815c.M(this.f34817e, this.f34818f);
        c11.e(this.f34815c, this.f34818f);
        c11.f(b11, 1, this.f34818f, 0, null);
    }

    @Override // ji.h
    public void a(long j11, long j12) {
        throw new IllegalStateException();
    }

    @Override // ji.h
    public void b(ji.j jVar) {
        this.f34816d = jVar;
        jVar.p(new v.b(-9223372036854775807L));
    }

    @Override // ji.h
    public boolean d(ji.i iVar) {
        iVar.a(this.f34817e, 0, 6, false);
        this.f34815c.M(this.f34817e, 6);
        if (wj.i.b(this.f34815c)) {
            return true;
        }
        iVar.a(this.f34817e, 6, 3, false);
        this.f34815c.M(this.f34817e, 9);
        return wj.i.b(this.f34815c);
    }

    @Override // ji.h
    public int e(ji.i iVar, u uVar) {
        ak.a.e(this.f34816d);
        int length = (int) iVar.getLength();
        int i11 = this.f34818f;
        byte[] bArr = this.f34817e;
        if (i11 == bArr.length) {
            this.f34817e = Arrays.copyOf(bArr, ((length != -1 ? length : bArr.length) * 3) / 2);
        }
        byte[] bArr2 = this.f34817e;
        int i12 = this.f34818f;
        int read = iVar.read(bArr2, i12, bArr2.length - i12);
        if (read != -1) {
            int i13 = this.f34818f + read;
            this.f34818f = i13;
            if (length == -1 || i13 != length) {
                return 0;
            }
        }
        f();
        return -1;
    }

    @Override // ji.h
    public void release() {
    }
}