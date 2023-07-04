package ji;

import ak.k0;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import wi.a;

/* loaded from: classes3.dex */
public final class r {

    /* renamed from: c  reason: collision with root package name */
    private static final Pattern f33762c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: a  reason: collision with root package name */
    public int f33763a = -1;

    /* renamed from: b  reason: collision with root package name */
    public int f33764b = -1;

    private boolean b(String str) {
        Matcher matcher = f33762c.matcher(str);
        if (matcher.find()) {
            try {
                int parseInt = Integer.parseInt((String) k0.j(matcher.group(1)), 16);
                int parseInt2 = Integer.parseInt((String) k0.j(matcher.group(2)), 16);
                if (parseInt > 0 || parseInt2 > 0) {
                    this.f33763a = parseInt;
                    this.f33764b = parseInt2;
                    return true;
                }
                return false;
            } catch (NumberFormatException unused) {
                return false;
            }
        }
        return false;
    }

    public boolean a() {
        return (this.f33763a == -1 || this.f33764b == -1) ? false : true;
    }

    public boolean c(wi.a aVar) {
        for (int i11 = 0; i11 < aVar.d(); i11++) {
            a.b c11 = aVar.c(i11);
            if (c11 instanceof bj.e) {
                bj.e eVar = (bj.e) c11;
                if ("iTunSMPB".equals(eVar.f7685c) && b(eVar.f7686d)) {
                    return true;
                }
            } else if (c11 instanceof bj.j) {
                bj.j jVar = (bj.j) c11;
                if ("com.apple.iTunes".equals(jVar.f7698b) && "iTunSMPB".equals(jVar.f7699c) && b(jVar.f7700d)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    public boolean d(int i11) {
        int i12 = i11 >> 12;
        int i13 = i11 & 4095;
        if (i12 > 0 || i13 > 0) {
            this.f33763a = i12;
            this.f33764b = i13;
            return true;
        }
        return false;
    }
}