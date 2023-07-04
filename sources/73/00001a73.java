package com.facebook.react.views.text;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.text.TextUtils;
import com.facebook.react.bridge.ReadableArray;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public class u {
    public static Typeface a(Typeface typeface, int i11, int i12, String str, AssetManager assetManager) {
        f0 f0Var = new f0(i11, i12);
        if (str == null) {
            if (typeface == null) {
                typeface = Typeface.DEFAULT;
            }
            return f0Var.a(typeface);
        }
        return j.b().d(str, f0Var, assetManager);
    }

    public static int b(String str) {
        if (str != null) {
            if ("italic".equals(str)) {
                return 2;
            }
            return "normal".equals(str) ? 0 : -1;
        }
        return -1;
    }

    public static String c(ReadableArray readableArray) {
        if (readableArray == null || readableArray.size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < readableArray.size(); i11++) {
            String string = readableArray.getString(i11);
            if (string != null) {
                char c11 = 65535;
                switch (string.hashCode()) {
                    case -1195362251:
                        if (string.equals("proportional-nums")) {
                            c11 = 0;
                            break;
                        }
                        break;
                    case -1061392823:
                        if (string.equals("lining-nums")) {
                            c11 = 1;
                            break;
                        }
                        break;
                    case -771984547:
                        if (string.equals("tabular-nums")) {
                            c11 = 2;
                            break;
                        }
                        break;
                    case -659678800:
                        if (string.equals("oldstyle-nums")) {
                            c11 = 3;
                            break;
                        }
                        break;
                    case 1183323111:
                        if (string.equals("small-caps")) {
                            c11 = 4;
                            break;
                        }
                        break;
                }
                switch (c11) {
                    case 0:
                        arrayList.add("'pnum'");
                        continue;
                    case 1:
                        arrayList.add("'lnum'");
                        continue;
                    case 2:
                        arrayList.add("'tnum'");
                        continue;
                    case 3:
                        arrayList.add("'onum'");
                        continue;
                    case 4:
                        arrayList.add("'smcp'");
                        continue;
                }
            }
        }
        return TextUtils.join(", ", arrayList);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int d(String str) {
        char c11;
        if (str != null) {
            switch (str.hashCode()) {
                case -1039745817:
                    if (str.equals("normal")) {
                        c11 = 0;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 48625:
                    if (str.equals("100")) {
                        c11 = 1;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 49586:
                    if (str.equals("200")) {
                        c11 = 2;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 50547:
                    if (str.equals("300")) {
                        c11 = 3;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 51508:
                    if (str.equals("400")) {
                        c11 = 4;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 52469:
                    if (str.equals("500")) {
                        c11 = 5;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 53430:
                    if (str.equals("600")) {
                        c11 = 6;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 54391:
                    if (str.equals("700")) {
                        c11 = 7;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 55352:
                    if (str.equals("800")) {
                        c11 = '\b';
                        break;
                    }
                    c11 = 65535;
                    break;
                case 56313:
                    if (str.equals("900")) {
                        c11 = '\t';
                        break;
                    }
                    c11 = 65535;
                    break;
                case 3029637:
                    if (str.equals("bold")) {
                        c11 = '\n';
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
                case 4:
                    return 400;
                case 1:
                    return 100;
                case 2:
                    return 200;
                case 3:
                    return 300;
                case 5:
                    return 500;
                case 6:
                    return 600;
                case 7:
                case '\n':
                    return 700;
                case '\b':
                    return 800;
                case '\t':
                    return 900;
            }
        }
        return -1;
    }
}