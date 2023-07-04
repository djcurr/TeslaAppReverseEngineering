package br;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import expo.modules.imagepicker.ImagePickerConstants;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public EnumC0155a f7901a = EnumC0155a.manual;

    /* renamed from: b  reason: collision with root package name */
    public int f7902b = 1280;

    /* renamed from: c  reason: collision with root package name */
    public int f7903c = 1280;

    /* renamed from: d  reason: collision with root package name */
    public float f7904d = 0.8f;

    /* renamed from: e  reason: collision with root package name */
    public b f7905e = b.uri;

    /* renamed from: f  reason: collision with root package name */
    public c f7906f = c.jpg;

    /* renamed from: g  reason: collision with root package name */
    public d f7907g = d.uri;

    /* renamed from: br.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public enum EnumC0155a {
        auto,
        manual
    }

    /* loaded from: classes2.dex */
    public enum b {
        base64,
        uri
    }

    /* loaded from: classes2.dex */
    public enum c {
        png,
        jpg
    }

    /* loaded from: classes2.dex */
    public enum d {
        base64,
        uri
    }

    public static a a(ReadableMap readableMap) {
        a aVar = new a();
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            nextKey.hashCode();
            char c11 = 65535;
            switch (nextKey.hashCode()) {
                case -1005512447:
                    if (nextKey.equals("output")) {
                        c11 = 0;
                        break;
                    }
                    break;
                case -906066005:
                    if (nextKey.equals("maxHeight")) {
                        c11 = 1;
                        break;
                    }
                    break;
                case 100358090:
                    if (nextKey.equals("input")) {
                        c11 = 2;
                        break;
                    }
                    break;
                case 291107303:
                    if (nextKey.equals("compressionMethod")) {
                        c11 = 3;
                        break;
                    }
                    break;
                case 400381634:
                    if (nextKey.equals("maxWidth")) {
                        c11 = 4;
                        break;
                    }
                    break;
                case 651215103:
                    if (nextKey.equals(ImagePickerConstants.OPTION_QUALITY)) {
                        c11 = 5;
                        break;
                    }
                    break;
                case 1418077701:
                    if (nextKey.equals("returnableOutputType")) {
                        c11 = 6;
                        break;
                    }
                    break;
            }
            switch (c11) {
                case 0:
                    aVar.f7906f = c.valueOf(readableMap.getString(nextKey));
                    break;
                case 1:
                    aVar.f7903c = readableMap.getInt(nextKey);
                    break;
                case 2:
                    aVar.f7905e = b.valueOf(readableMap.getString(nextKey));
                    break;
                case 3:
                    aVar.f7901a = EnumC0155a.valueOf(readableMap.getString(nextKey));
                    break;
                case 4:
                    aVar.f7902b = readableMap.getInt(nextKey);
                    break;
                case 5:
                    aVar.f7904d = (float) readableMap.getDouble(nextKey);
                    break;
                case 6:
                    aVar.f7907g = d.valueOf(readableMap.getString(nextKey));
                    break;
            }
        }
        return aVar;
    }
}