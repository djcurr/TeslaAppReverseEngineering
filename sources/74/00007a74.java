package ix;

import java.io.Serializable;
import java.util.Date;

/* loaded from: classes5.dex */
public final class p implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    private final int f32833a;

    /* renamed from: b  reason: collision with root package name */
    private final int f32834b;

    /* renamed from: c  reason: collision with root package name */
    private final int f32835c;

    /* renamed from: d  reason: collision with root package name */
    private final String f32836d;

    /* renamed from: e  reason: collision with root package name */
    private final String f32837e;

    /* renamed from: f  reason: collision with root package name */
    private final Boolean f32838f;

    /* renamed from: g  reason: collision with root package name */
    private final Date f32839g;

    /* renamed from: h  reason: collision with root package name */
    private final int f32840h;

    /* renamed from: i  reason: collision with root package name */
    private String f32841i;

    /* renamed from: j  reason: collision with root package name */
    private int f32842j;

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0050, code lost:
        r2 = r10.substring(r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p(java.lang.String r10, java.lang.Boolean r11, java.util.Date r12) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ix.p.<init>(java.lang.String, java.lang.Boolean, java.util.Date):void");
    }

    private int a() {
        return d(this.f32833a, this.f32834b, this.f32835c);
    }

    private String b() {
        String str;
        String str2 = this.f32837e;
        if (str2 != null) {
            return str2;
        }
        synchronized (this) {
            if (this.f32841i == null) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(this.f32833a);
                stringBuffer.append(".");
                stringBuffer.append(this.f32834b);
                stringBuffer.append(".");
                stringBuffer.append(this.f32835c);
                this.f32841i = stringBuffer.toString();
                if (this.f32836d != null) {
                    StringBuffer stringBuffer2 = new StringBuffer();
                    stringBuffer2.append(this.f32841i);
                    stringBuffer2.append("-");
                    stringBuffer2.append(this.f32836d);
                    this.f32841i = stringBuffer2.toString();
                }
            }
            str = this.f32841i;
        }
        return str;
    }

    public static int d(int i11, int i12, int i13) {
        return (i11 * 1000000) + (i12 * 1000) + i13;
    }

    private boolean e(char c11) {
        return c11 >= '0' && c11 <= '9';
    }

    public int c() {
        return this.f32840h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p.class == obj.getClass()) {
            p pVar = (p) obj;
            if (this.f32840h == pVar.f32840h && pVar.hashCode() == hashCode()) {
                Date date = this.f32839g;
                if (date == null) {
                    if (pVar.f32839g != null) {
                        return false;
                    }
                } else if (!date.equals(pVar.f32839g)) {
                    return false;
                }
                String str = this.f32836d;
                if (str == null) {
                    if (pVar.f32836d != null) {
                        return false;
                    }
                } else if (!str.equals(pVar.f32836d)) {
                    return false;
                }
                Boolean bool = this.f32838f;
                if (bool == null) {
                    if (pVar.f32838f != null) {
                        return false;
                    }
                } else if (!bool.equals(pVar.f32838f)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int i11;
        int i12 = this.f32842j;
        if (i12 != 0) {
            return i12;
        }
        synchronized (this) {
            if (this.f32842j == 0) {
                Date date = this.f32839g;
                int i13 = 0;
                int hashCode = ((date == null ? 0 : date.hashCode()) + 31) * 31;
                String str = this.f32836d;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                Boolean bool = this.f32838f;
                if (bool != null) {
                    i13 = bool.hashCode();
                }
                int i14 = ((hashCode2 + i13) * 31) + this.f32840h;
                if (i14 == 0) {
                    i14 = -1;
                }
                this.f32842j = i14;
            }
            i11 = this.f32842j;
        }
        return i11;
    }

    public String toString() {
        return b();
    }

    public p(int i11, int i12, int i13) {
        this(i11, i12, i13, null, null, null);
    }

    public p(int i11, int i12, int i13, String str, Boolean bool, Date date) {
        this.f32833a = i11;
        this.f32834b = i12;
        this.f32835c = i13;
        this.f32836d = str;
        this.f32838f = bool;
        this.f32839g = date;
        this.f32840h = a();
        this.f32837e = null;
    }
}