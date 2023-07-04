package rg;

import ch.qos.logback.core.joran.action.Action;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private static final Pattern f49564a = Pattern.compile("\\b((?:seg-\\d+(?:_\\d+)?|\\d+)\\.js)");

    public static String a(String str, ReadableArray readableArray) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(", stack:\n");
        for (int i11 = 0; i11 < readableArray.size(); i11++) {
            ReadableMap map = readableArray.getMap(i11);
            sb2.append(map.getString("methodName"));
            sb2.append("@");
            sb2.append(b(map));
            if (map.hasKey("lineNumber") && !map.isNull("lineNumber") && map.getType("lineNumber") == ReadableType.Number) {
                sb2.append(map.getInt("lineNumber"));
            } else {
                sb2.append(-1);
            }
            if (map.hasKey("column") && !map.isNull("column") && map.getType("column") == ReadableType.Number) {
                sb2.append(":");
                sb2.append(map.getInt("column"));
            }
            sb2.append("\n");
        }
        return sb2.toString();
    }

    private static String b(ReadableMap readableMap) {
        String string;
        if (!readableMap.hasKey(Action.FILE_ATTRIBUTE) || readableMap.isNull(Action.FILE_ATTRIBUTE) || readableMap.getType(Action.FILE_ATTRIBUTE) != ReadableType.String || (string = readableMap.getString(Action.FILE_ATTRIBUTE)) == null) {
            return "";
        }
        Matcher matcher = f49564a.matcher(string);
        if (matcher.find()) {
            return matcher.group(1) + ":";
        }
        return "";
    }
}