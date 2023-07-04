package io.realm.internal;

import io.realm.CompactOnLaunchCallback;
import io.realm.g0;
import io.realm.internal.OsSharedRealm;
import io.realm.log.RealmLog;
import java.io.File;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public class OsRealmConfig implements h {

    /* renamed from: h  reason: collision with root package name */
    private static final long f31855h = nativeGetFinalizerPtr();

    /* renamed from: a  reason: collision with root package name */
    private final g0 f31856a;

    /* renamed from: b  reason: collision with root package name */
    private final URI f31857b;

    /* renamed from: c  reason: collision with root package name */
    private final long f31858c;

    /* renamed from: d  reason: collision with root package name */
    private final g f31859d;

    /* renamed from: e  reason: collision with root package name */
    private final CompactOnLaunchCallback f31860e;

    /* renamed from: f  reason: collision with root package name */
    private final OsSharedRealm.MigrationCallback f31861f;

    /* renamed from: g  reason: collision with root package name */
    private final OsSharedRealm.InitializationCallback f31862g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f31863a;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            f31863a = iArr;
            try {
                iArr[Proxy.Type.HTTP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* loaded from: classes5.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private g0 f31864a;

        /* renamed from: b  reason: collision with root package name */
        private OsSchemaInfo f31865b = null;

        /* renamed from: c  reason: collision with root package name */
        private OsSharedRealm.MigrationCallback f31866c = null;

        /* renamed from: d  reason: collision with root package name */
        private OsSharedRealm.InitializationCallback f31867d = null;

        /* renamed from: e  reason: collision with root package name */
        private boolean f31868e = false;

        /* renamed from: f  reason: collision with root package name */
        private String f31869f = "";

        public b(g0 g0Var) {
            this.f31864a = g0Var;
        }

        public b a(boolean z11) {
            this.f31868e = z11;
            return this;
        }

        public OsRealmConfig b() {
            return new OsRealmConfig(this.f31864a, this.f31869f, this.f31868e, this.f31865b, this.f31866c, this.f31867d, null);
        }

        public b c(File file) {
            this.f31869f = file.getAbsolutePath();
            return this;
        }

        public b d(OsSharedRealm.InitializationCallback initializationCallback) {
            this.f31867d = initializationCallback;
            return this;
        }

        public b e(OsSharedRealm.MigrationCallback migrationCallback) {
            this.f31866c = migrationCallback;
            return this;
        }

        public b f(OsSchemaInfo osSchemaInfo) {
            this.f31865b = osSchemaInfo;
            return this;
        }
    }

    /* loaded from: classes5.dex */
    public enum c {
        FULL(0),
        MEM_ONLY(1);
        
        final int value;

        c(int i11) {
            this.value = i11;
        }
    }

    /* loaded from: classes5.dex */
    public enum d {
        SCHEMA_MODE_AUTOMATIC((byte) 0),
        SCHEMA_MODE_IMMUTABLE((byte) 1),
        SCHEMA_MODE_READONLY((byte) 2),
        SCHEMA_MODE_RESET_FILE((byte) 3),
        SCHEMA_MODE_ADDITIVE_DISCOVERED((byte) 4),
        SCHEMA_MODE_MANUAL((byte) 6);
        
        final byte value;

        d(byte b11) {
            this.value = b11;
        }

        public byte getNativeValue() {
            return this.value;
        }
    }

    /* synthetic */ OsRealmConfig(g0 g0Var, String str, boolean z11, OsSchemaInfo osSchemaInfo, OsSharedRealm.MigrationCallback migrationCallback, OsSharedRealm.InitializationCallback initializationCallback, a aVar) {
        this(g0Var, str, z11, osSchemaInfo, migrationCallback, initializationCallback);
    }

    private static native long nativeCreate(String str, String str2, boolean z11, long j11);

    private static native String nativeCreateAndSetSyncConfig(long j11, long j12, String str, String str2, String str3, String str4, String str5, String str6, byte b11, String str7, String str8, String[] strArr, byte b12, String str9, Object obj);

    private static native void nativeEnableChangeNotification(long j11, boolean z11);

    private static native long nativeGetFinalizerPtr();

    private static native void nativeSetCompactOnLaunchCallback(long j11, CompactOnLaunchCallback compactOnLaunchCallback);

    private static native void nativeSetEncryptionKey(long j11, byte[] bArr);

    private static native void nativeSetInMemory(long j11, boolean z11);

    private native void nativeSetInitializationCallback(long j11, OsSharedRealm.InitializationCallback initializationCallback);

    private native void nativeSetSchemaConfig(long j11, byte b11, long j12, long j13, OsSharedRealm.MigrationCallback migrationCallback);

    private static native void nativeSetSyncConfigProxySettings(long j11, byte b11, String str, int i11);

    private static native void nativeSetSyncConfigSslSettings(long j11, boolean z11, String str);

    /* JADX INFO: Access modifiers changed from: package-private */
    public g a() {
        return this.f31859d;
    }

    public g0 b() {
        return this.f31856a;
    }

    public URI c() {
        return this.f31857b;
    }

    @Override // io.realm.internal.h
    public long getNativeFinalizerPtr() {
        return f31855h;
    }

    @Override // io.realm.internal.h
    public long getNativePtr() {
        return this.f31858c;
    }

    private OsRealmConfig(g0 g0Var, String str, boolean z11, OsSchemaInfo osSchemaInfo, OsSharedRealm.MigrationCallback migrationCallback, OsSharedRealm.InitializationCallback initializationCallback) {
        String str2;
        URI uri;
        this.f31859d = new g();
        this.f31856a = g0Var;
        this.f31858c = nativeCreate(g0Var.k(), str, true, g0Var.h());
        g.f31933c.a(this);
        Object[] c11 = i.d().c(g0Var);
        String str3 = (String) c11[0];
        String str4 = (String) c11[1];
        String str5 = (String) c11[2];
        String str6 = (String) c11[3];
        String str7 = (String) c11[4];
        String str8 = (String) c11[5];
        Byte b11 = (Byte) c11[6];
        String str9 = (String) c11[7];
        String str10 = (String) c11[8];
        Map map = (Map) c11[9];
        Byte b12 = (Byte) c11[10];
        String str11 = (String) c11[11];
        Object obj = c11[12];
        Long l11 = (Long) c11[13];
        String[] strArr = new String[map != null ? map.size() * 2 : 0];
        if (map != null) {
            int i11 = 0;
            for (Map.Entry entry : map.entrySet()) {
                strArr[i11] = (String) entry.getKey();
                strArr[i11 + 1] = (String) entry.getValue();
                i11 += 2;
            }
        }
        byte[] f11 = g0Var.f();
        if (f11 != null) {
            nativeSetEncryptionKey(this.f31858c, f11);
        }
        nativeSetInMemory(this.f31858c, g0Var.e() == c.MEM_ONLY);
        nativeEnableChangeNotification(this.f31858c, z11);
        d dVar = d.SCHEMA_MODE_MANUAL;
        if (g0Var.s()) {
            dVar = d.SCHEMA_MODE_IMMUTABLE;
        } else if (g0Var.r()) {
            dVar = d.SCHEMA_MODE_READONLY;
        } else if (str4 != null) {
            dVar = d.SCHEMA_MODE_ADDITIVE_DISCOVERED;
        } else if (g0Var.v()) {
            dVar = d.SCHEMA_MODE_RESET_FILE;
        }
        long o11 = g0Var.o();
        long nativePtr = osSchemaInfo == null ? 0L : osSchemaInfo.getNativePtr();
        this.f31861f = migrationCallback;
        nativeSetSchemaConfig(this.f31858c, dVar.getNativeValue(), o11, nativePtr, migrationCallback);
        CompactOnLaunchCallback d11 = g0Var.d();
        this.f31860e = d11;
        if (d11 != null) {
            nativeSetCompactOnLaunchCallback(this.f31858c, d11);
        }
        this.f31862g = initializationCallback;
        if (initializationCallback != null) {
            nativeSetInitializationCallback(this.f31858c, initializationCallback);
        }
        URI uri2 = null;
        if (str4 != null) {
            String nativeCreateAndSetSyncConfig = nativeCreateAndSetSyncConfig(l11.longValue(), this.f31858c, str4, str5, str3, str6, str7, str8, b11.byteValue(), str9, str10, strArr, b12.byteValue(), str11, obj);
            try {
                nativeCreateAndSetSyncConfig = str5 + str9.substring(1);
                uri = new URI(nativeCreateAndSetSyncConfig);
                str2 = nativeCreateAndSetSyncConfig;
            } catch (URISyntaxException e11) {
                RealmLog.b(e11, "Cannot create a URI from the Realm URL address", new Object[0]);
                str2 = nativeCreateAndSetSyncConfig;
                uri = null;
            }
            ProxySelector proxySelector = ProxySelector.getDefault();
            if (uri != null && proxySelector != null) {
                try {
                    uri2 = new URI(str2.replaceFirst("ws", "http"));
                } catch (URISyntaxException e12) {
                    RealmLog.b(e12, "Cannot create a URI from the Realm URL address", new Object[0]);
                }
                List<Proxy> select = proxySelector.select(uri2);
                if (select != null && !select.isEmpty()) {
                    Proxy proxy = select.get(0);
                    if (proxy.type() != Proxy.Type.DIRECT) {
                        byte b13 = a.f31863a[proxy.type().ordinal()] == 1 ? (byte) 0 : (byte) -1;
                        if (proxy.type() == Proxy.Type.HTTP) {
                            SocketAddress address = proxy.address();
                            if (address instanceof InetSocketAddress) {
                                InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                                nativeSetSyncConfigProxySettings(this.f31858c, b13, inetSocketAddress.getHostString(), inetSocketAddress.getPort());
                            } else {
                                RealmLog.a("Unsupported proxy socket address type: " + address.getClass().getName(), new Object[0]);
                            }
                        } else {
                            RealmLog.a("SOCKS proxies are not supported.", new Object[0]);
                        }
                    }
                }
            }
            uri2 = uri;
        }
        this.f31857b = uri2;
    }
}