package jj;

import java.util.Locale;

/* loaded from: classes3.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    private final String[] f33878a;

    /* renamed from: b  reason: collision with root package name */
    private final int[] f33879b;

    /* renamed from: c  reason: collision with root package name */
    private final String[] f33880c;

    /* renamed from: d  reason: collision with root package name */
    private final int f33881d;

    private m(String[] strArr, int[] iArr, String[] strArr2, int i11) {
        this.f33878a = strArr;
        this.f33879b = iArr;
        this.f33880c = strArr2;
        this.f33881d = i11;
    }

    public static m b(String str) {
        String[] strArr = new String[5];
        int[] iArr = new int[4];
        String[] strArr2 = new String[4];
        return new m(strArr, iArr, strArr2, c(str, strArr, iArr, strArr2));
    }

    private static int c(String str, String[] strArr, int[] iArr, String[] strArr2) {
        String str2;
        strArr[0] = "";
        int i11 = 0;
        int i12 = 0;
        while (i11 < str.length()) {
            int indexOf = str.indexOf("$", i11);
            char c11 = 65535;
            if (indexOf == -1) {
                String valueOf = String.valueOf(strArr[i12]);
                String valueOf2 = String.valueOf(str.substring(i11));
                strArr[i12] = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
                i11 = str.length();
            } else if (indexOf != i11) {
                String valueOf3 = String.valueOf(strArr[i12]);
                String valueOf4 = String.valueOf(str.substring(i11, indexOf));
                strArr[i12] = valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3);
                i11 = indexOf;
            } else if (str.startsWith("$$", i11)) {
                strArr[i12] = String.valueOf(strArr[i12]).concat("$");
                i11 += 2;
            } else {
                int i13 = i11 + 1;
                int indexOf2 = str.indexOf("$", i13);
                String substring = str.substring(i13, indexOf2);
                if (substring.equals("RepresentationID")) {
                    iArr[i12] = 1;
                } else {
                    int indexOf3 = substring.indexOf("%0");
                    if (indexOf3 != -1) {
                        str2 = substring.substring(indexOf3);
                        if (!str2.endsWith("d") && !str2.endsWith("x")) {
                            str2 = str2.concat("d");
                        }
                        substring = substring.substring(0, indexOf3);
                    } else {
                        str2 = "%01d";
                    }
                    substring.hashCode();
                    switch (substring.hashCode()) {
                        case -1950496919:
                            if (substring.equals("Number")) {
                                c11 = 0;
                                break;
                            }
                            break;
                        case 2606829:
                            if (substring.equals("Time")) {
                                c11 = 1;
                                break;
                            }
                            break;
                        case 38199441:
                            if (substring.equals("Bandwidth")) {
                                c11 = 2;
                                break;
                            }
                            break;
                    }
                    switch (c11) {
                        case 0:
                            iArr[i12] = 2;
                            break;
                        case 1:
                            iArr[i12] = 4;
                            break;
                        case 2:
                            iArr[i12] = 3;
                            break;
                        default:
                            throw new IllegalArgumentException(str.length() != 0 ? "Invalid template: ".concat(str) : new String("Invalid template: "));
                    }
                    strArr2[i12] = str2;
                }
                i12++;
                strArr[i12] = "";
                i11 = indexOf2 + 1;
            }
        }
        return i12;
    }

    public String a(String str, long j11, int i11, long j12) {
        StringBuilder sb2 = new StringBuilder();
        int i12 = 0;
        while (true) {
            int i13 = this.f33881d;
            if (i12 < i13) {
                sb2.append(this.f33878a[i12]);
                int[] iArr = this.f33879b;
                if (iArr[i12] == 1) {
                    sb2.append(str);
                } else if (iArr[i12] == 2) {
                    sb2.append(String.format(Locale.US, this.f33880c[i12], Long.valueOf(j11)));
                } else if (iArr[i12] == 3) {
                    sb2.append(String.format(Locale.US, this.f33880c[i12], Integer.valueOf(i11)));
                } else if (iArr[i12] == 4) {
                    sb2.append(String.format(Locale.US, this.f33880c[i12], Long.valueOf(j12)));
                }
                i12++;
            } else {
                sb2.append(this.f33878a[i13]);
                return sb2.toString();
            }
        }
    }
}