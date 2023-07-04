package com.facebook.react.uimanager.layoutanimation;

/* loaded from: classes3.dex */
enum b {
    OPACITY,
    SCALE_X,
    SCALE_Y,
    SCALE_XY;

    public static b fromString(String str) {
        str.hashCode();
        char c11 = 65535;
        switch (str.hashCode()) {
            case -1267206133:
                if (str.equals("opacity")) {
                    c11 = 0;
                    break;
                }
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    c11 = 1;
                    break;
                }
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    c11 = 2;
                    break;
                }
                break;
            case 1910893003:
                if (str.equals("scaleXY")) {
                    c11 = 3;
                    break;
                }
                break;
        }
        switch (c11) {
            case 0:
                return OPACITY;
            case 1:
                return SCALE_X;
            case 2:
                return SCALE_Y;
            case 3:
                return SCALE_XY;
            default:
                throw new IllegalArgumentException("Unsupported animated property: " + str);
        }
    }
}