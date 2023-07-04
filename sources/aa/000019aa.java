package com.facebook.react.uimanager;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.util.Arrays;
import java.util.HashSet;

/* loaded from: classes3.dex */
public class g1 {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f12309a = {8, 4, 5, 1, 3, 0, 2};

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f12310b = {8, 7, 6, 4, 5, 1, 3, 0, 2};

    /* renamed from: c  reason: collision with root package name */
    private static final HashSet<String> f12311c = new HashSet<>(Arrays.asList("alignSelf", "alignItems", "collapsable", "flex", "flexBasis", "flexDirection", "flexGrow", "flexShrink", "flexWrap", "justifyContent", "alignContent", "display", "position", "right", "top", "bottom", "left", "start", "end", Snapshot.WIDTH, Snapshot.HEIGHT, "minWidth", "maxWidth", "minHeight", "maxHeight", "margin", "marginVertical", "marginHorizontal", "marginLeft", "marginRight", "marginTop", "marginBottom", "marginStart", "marginEnd", "padding", "paddingVertical", "paddingHorizontal", "paddingLeft", "paddingRight", "paddingTop", "paddingBottom", "paddingStart", "paddingEnd"));

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static boolean a(ReadableMap readableMap, String str) {
        char c11;
        char c12;
        ReadableType type;
        if (f12311c.contains(str)) {
            return true;
        }
        if ("pointerEvents".equals(str)) {
            String string = readableMap.getString(str);
            return "auto".equals(string) || "box-none".equals(string);
        }
        str.hashCode();
        switch (str.hashCode()) {
            case -1989576717:
                if (str.equals("borderRightColor")) {
                    c11 = 0;
                    break;
                }
                c11 = 65535;
                break;
            case -1971292586:
                if (str.equals("borderRightWidth")) {
                    c11 = 1;
                    break;
                }
                c11 = 65535;
                break;
            case -1470826662:
                if (str.equals("borderTopColor")) {
                    c12 = 2;
                    c11 = c12;
                    break;
                }
                c11 = 65535;
                break;
            case -1452542531:
                if (str.equals("borderTopWidth")) {
                    c12 = 3;
                    c11 = c12;
                    break;
                }
                c11 = 65535;
                break;
            case -1308858324:
                if (str.equals("borderBottomColor")) {
                    c12 = 4;
                    c11 = c12;
                    break;
                }
                c11 = 65535;
                break;
            case -1290574193:
                if (str.equals("borderBottomWidth")) {
                    c12 = 5;
                    c11 = c12;
                    break;
                }
                c11 = 65535;
                break;
            case -1267206133:
                if (str.equals("opacity")) {
                    c12 = 6;
                    c11 = c12;
                    break;
                }
                c11 = 65535;
                break;
            case -242276144:
                if (str.equals("borderLeftColor")) {
                    c12 = 7;
                    c11 = c12;
                    break;
                }
                c11 = 65535;
                break;
            case -223992013:
                if (str.equals("borderLeftWidth")) {
                    c12 = '\b';
                    c11 = c12;
                    break;
                }
                c11 = 65535;
                break;
            case 529642498:
                if (str.equals("overflow")) {
                    c12 = '\t';
                    c11 = c12;
                    break;
                }
                c11 = 65535;
                break;
            case 741115130:
                if (str.equals("borderWidth")) {
                    c12 = '\n';
                    c11 = c12;
                    break;
                }
                c11 = 65535;
                break;
            case 1349188574:
                if (str.equals("borderRadius")) {
                    c12 = 11;
                    c11 = c12;
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
                return !readableMap.isNull("borderRightColor") && readableMap.getInt("borderRightColor") == 0;
            case 1:
                return readableMap.isNull("borderRightWidth") || readableMap.getDouble("borderRightWidth") == 0.0d;
            case 2:
                return !readableMap.isNull("borderTopColor") && readableMap.getInt("borderTopColor") == 0;
            case 3:
                return readableMap.isNull("borderTopWidth") || readableMap.getDouble("borderTopWidth") == 0.0d;
            case 4:
                return !readableMap.isNull("borderBottomColor") && readableMap.getInt("borderBottomColor") == 0;
            case 5:
                return readableMap.isNull("borderBottomWidth") || readableMap.getDouble("borderBottomWidth") == 0.0d;
            case 6:
                return readableMap.isNull("opacity") || readableMap.getDouble("opacity") == 1.0d;
            case 7:
                return !readableMap.isNull("borderLeftColor") && readableMap.getInt("borderLeftColor") == 0;
            case '\b':
                return readableMap.isNull("borderLeftWidth") || readableMap.getDouble("borderLeftWidth") == 0.0d;
            case '\t':
                return readableMap.isNull("overflow") || "visible".equals(readableMap.getString("overflow"));
            case '\n':
                return readableMap.isNull("borderWidth") || readableMap.getDouble("borderWidth") == 0.0d;
            case 11:
                if (!readableMap.hasKey("backgroundColor") || (((type = readableMap.getType("backgroundColor")) != ReadableType.Number || readableMap.getInt("backgroundColor") == 0) && type == ReadableType.Null)) {
                    return !readableMap.hasKey("borderWidth") || readableMap.isNull("borderWidth") || readableMap.getDouble("borderWidth") == 0.0d;
                }
                return false;
            default:
                return false;
        }
    }
}