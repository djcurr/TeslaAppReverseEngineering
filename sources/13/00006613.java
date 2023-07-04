package dr;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import expo.modules.constants.ExponentInstallationId;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public String f24234a;

    /* renamed from: b  reason: collision with root package name */
    public ReadableMap f24235b;

    /* renamed from: c  reason: collision with root package name */
    public String f24236c;

    public static a a(ReadableMap readableMap) {
        a aVar = new a();
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            nextKey.hashCode();
            char c11 = 65535;
            switch (nextKey.hashCode()) {
                case -1077554975:
                    if (nextKey.equals("method")) {
                        c11 = 0;
                        break;
                    }
                    break;
                case 116079:
                    if (nextKey.equals("url")) {
                        c11 = 1;
                        break;
                    }
                    break;
                case 3601339:
                    if (nextKey.equals(ExponentInstallationId.LEGACY_UUID_KEY)) {
                        c11 = 2;
                        break;
                    }
                    break;
                case 795307910:
                    if (nextKey.equals("headers")) {
                        c11 = 3;
                        break;
                    }
                    break;
            }
            switch (c11) {
                case 0:
                    readableMap.getString(nextKey);
                    break;
                case 1:
                    aVar.f24236c = readableMap.getString(nextKey);
                    break;
                case 2:
                    aVar.f24234a = readableMap.getString(nextKey);
                    break;
                case 3:
                    aVar.f24235b = readableMap.getMap(nextKey);
                    break;
            }
        }
        return aVar;
    }
}