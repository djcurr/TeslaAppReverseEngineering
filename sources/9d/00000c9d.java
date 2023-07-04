package bk;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final String f7723a;

    private c(int i11, int i12, String str) {
        this.f7723a = str;
    }

    public static c a(ak.v vVar) {
        String str;
        vVar.P(2);
        int C = vVar.C();
        int i11 = C >> 1;
        int C2 = ((vVar.C() >> 3) & 31) | ((C & 1) << 5);
        if (i11 == 4 || i11 == 5 || i11 == 7) {
            str = "dvhe";
        } else if (i11 == 8) {
            str = "hev1";
        } else if (i11 != 9) {
            return null;
        } else {
            str = "avc3";
        }
        String str2 = C2 < 10 ? ".0" : ".";
        StringBuilder sb2 = new StringBuilder(str.length() + 24 + str2.length());
        sb2.append(str);
        sb2.append(".0");
        sb2.append(i11);
        sb2.append(str2);
        sb2.append(C2);
        return new c(i11, C2, sb2.toString());
    }
}