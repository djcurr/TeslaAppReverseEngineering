package k9;

import android.content.Context;
import android.net.NetworkInfo;
import android.text.TextUtils;
import expo.modules.interfaces.permissions.PermissionsResponse;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.CookieManager;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final CookieManager f34499a = new CookieManager();

    /* renamed from: k9.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0642a {

        /* renamed from: a  reason: collision with root package name */
        public final String f34500a;

        /* renamed from: b  reason: collision with root package name */
        public final byte[] f34501b;

        /* renamed from: c  reason: collision with root package name */
        public final Map<String, String> f34502c;

        public C0642a(String str, Map<String, String> map, byte[] bArr) {
            this.f34500a = str;
            this.f34501b = bArr;
            this.f34502c = map;
        }

        public String toString() {
            return String.format("<UrlConnectionConfigure url=%s headers=%s>", this.f34500a, this.f34502c);
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final Map<String, List<String>> f34503a;

        /* renamed from: b  reason: collision with root package name */
        public final byte[] f34504b;

        public b(Map<String, List<String>> map, String str, byte[] bArr) {
            this.f34503a = map;
            this.f34504b = bArr;
        }
    }

    public static String a(Context context) {
        try {
            NetworkInfo a11 = u9.b.a(null, context);
            if (a11 != null && a11.isAvailable()) {
                return a11.getType() == 1 ? "wifi" : a11.getExtraInfo().toLowerCase();
            }
        } catch (Exception unused) {
        }
        return PermissionsResponse.SCOPE_NONE;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01a9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01ae A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01b3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static k9.a.b b(android.content.Context r11, k9.a.C0642a r12) {
        /*
            Method dump skipped, instructions count: 456
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k9.a.b(android.content.Context, k9.a$a):k9.a$b");
    }

    public static byte[] c(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr, 0, 1024);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                byteArrayOutputStream.flush();
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    public static Proxy d(Context context) {
        String a11 = a(context);
        if (a11 == null || a11.contains("wap")) {
            try {
                String property = System.getProperty("https.proxyHost");
                String property2 = System.getProperty("https.proxyPort");
                if (TextUtils.isEmpty(property)) {
                    return null;
                }
                return new Proxy(Proxy.Type.HTTP, new InetSocketAddress(property, Integer.parseInt(property2)));
            } catch (Throwable unused) {
                return null;
            }
        }
        return null;
    }
}