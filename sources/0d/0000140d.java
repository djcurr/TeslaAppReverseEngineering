package com.alipay.android.phone.mrpc.core;

import android.text.format.Time;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static final Pattern f10086a = Pattern.compile("([0-9]{1,2})[- ]([A-Za-z]{3,9})[- ]([0-9]{2,4})[ ]([0-9]{1,2}:[0-9][0-9]:[0-9][0-9])");

    /* renamed from: b  reason: collision with root package name */
    public static final Pattern f10087b = Pattern.compile("[ ]([A-Za-z]{3,9})[ ]+([0-9]{1,2})[ ]([0-9]{1,2}:[0-9][0-9]:[0-9][0-9])[ ]([0-9]{2,4})");

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f10088a;

        /* renamed from: b  reason: collision with root package name */
        public int f10089b;

        /* renamed from: c  reason: collision with root package name */
        public int f10090c;

        public a(int i11, int i12, int i13) {
            this.f10088a = i11;
            this.f10089b = i12;
            this.f10090c = i13;
        }
    }

    public static long a(String str) {
        int c11;
        int d11;
        int i11;
        a aVar;
        int i12;
        int i13;
        int i14;
        Matcher matcher = f10086a.matcher(str);
        if (matcher.find()) {
            i11 = b(matcher.group(1));
            c11 = c(matcher.group(2));
            d11 = d(matcher.group(3));
            aVar = e(matcher.group(4));
        } else {
            Matcher matcher2 = f10087b.matcher(str);
            if (!matcher2.find()) {
                throw new IllegalArgumentException();
            }
            c11 = c(matcher2.group(1));
            int b11 = b(matcher2.group(2));
            a e11 = e(matcher2.group(3));
            d11 = d(matcher2.group(4));
            i11 = b11;
            aVar = e11;
        }
        if (d11 >= 2038) {
            i13 = 0;
            i14 = 2038;
            i12 = 1;
        } else {
            i12 = i11;
            i13 = c11;
            i14 = d11;
        }
        Time time = new Time("UTC");
        time.set(aVar.f10090c, aVar.f10089b, aVar.f10088a, i12, i13, i14);
        return time.toMillis(false);
    }

    public static int b(String str) {
        return str.length() == 2 ? ((str.charAt(0) - '0') * 10) + (str.charAt(1) - '0') : str.charAt(0) - '0';
    }

    public static int c(String str) {
        int lowerCase = ((Character.toLowerCase(str.charAt(0)) + Character.toLowerCase(str.charAt(1))) + Character.toLowerCase(str.charAt(2))) - 291;
        if (lowerCase != 9) {
            if (lowerCase != 10) {
                if (lowerCase != 22) {
                    if (lowerCase != 26) {
                        if (lowerCase != 29) {
                            if (lowerCase != 32) {
                                if (lowerCase != 40) {
                                    if (lowerCase != 42) {
                                        if (lowerCase != 48) {
                                            switch (lowerCase) {
                                                case 35:
                                                    return 9;
                                                case 36:
                                                    return 4;
                                                case 37:
                                                    return 8;
                                                default:
                                                    throw new IllegalArgumentException();
                                            }
                                        }
                                        return 10;
                                    }
                                    return 5;
                                }
                                return 6;
                            }
                            return 3;
                        }
                        return 2;
                    }
                    return 7;
                }
                return 0;
            }
            return 1;
        }
        return 11;
    }

    public static int d(String str) {
        if (str.length() == 2) {
            int charAt = ((str.charAt(0) - '0') * 10) + (str.charAt(1) - '0');
            return charAt >= 70 ? charAt + 1900 : charAt + 2000;
        } else if (str.length() == 3) {
            return ((str.charAt(0) - '0') * 100) + ((str.charAt(1) - '0') * 10) + (str.charAt(2) - '0') + 1900;
        } else {
            if (str.length() == 4) {
                return ((str.charAt(0) - '0') * 1000) + ((str.charAt(1) - '0') * 100) + ((str.charAt(2) - '0') * 10) + (str.charAt(3) - '0');
            }
            return 1970;
        }
    }

    public static a e(String str) {
        int i11;
        int i12;
        int i13;
        int charAt = str.charAt(0) - '0';
        if (str.charAt(1) != ':') {
            i11 = 2;
            charAt = (charAt * 10) + (str.charAt(1) - '0');
        } else {
            i11 = 1;
        }
        int i14 = i11 + 1 + 1 + 1 + 1;
        return new a(charAt, ((str.charAt(i12) - '0') * 10) + (str.charAt(i13) - '0'), ((str.charAt(i14) - '0') * 10) + (str.charAt(i14 + 1) - '0'));
    }
}