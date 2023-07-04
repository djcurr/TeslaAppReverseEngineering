package sj;

import ak.k0;
import android.text.TextUtils;
import org.spongycastle.i18n.TextBundle;

/* loaded from: classes3.dex */
final class b {

    /* renamed from: a  reason: collision with root package name */
    public final int f50420a;

    /* renamed from: b  reason: collision with root package name */
    public final int f50421b;

    /* renamed from: c  reason: collision with root package name */
    public final int f50422c;

    /* renamed from: d  reason: collision with root package name */
    public final int f50423d;

    /* renamed from: e  reason: collision with root package name */
    public final int f50424e;

    private b(int i11, int i12, int i13, int i14, int i15) {
        this.f50420a = i11;
        this.f50421b = i12;
        this.f50422c = i13;
        this.f50423d = i14;
        this.f50424e = i15;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static b a(String str) {
        char c11;
        ak.a.a(str.startsWith("Format:"));
        String[] split = TextUtils.split(str.substring(7), ",");
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        int i14 = -1;
        for (int i15 = 0; i15 < split.length; i15++) {
            String R0 = k0.R0(split[i15].trim());
            R0.hashCode();
            switch (R0.hashCode()) {
                case 100571:
                    if (R0.equals("end")) {
                        c11 = 0;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 3556653:
                    if (R0.equals(TextBundle.TEXT_ENTRY)) {
                        c11 = 1;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 109757538:
                    if (R0.equals("start")) {
                        c11 = 2;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 109780401:
                    if (R0.equals("style")) {
                        c11 = 3;
                        break;
                    }
                    c11 = 65535;
                    break;
                default:
                    c11 = 65535;
                    break;
            }
            switch (c11) {
                case 0:
                    i12 = i15;
                    break;
                case 1:
                    i14 = i15;
                    break;
                case 2:
                    i11 = i15;
                    break;
                case 3:
                    i13 = i15;
                    break;
            }
        }
        if (i11 == -1 || i12 == -1) {
            return null;
        }
        return new b(i11, i12, i13, i14, split.length);
    }
}