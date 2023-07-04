package qi;

import ak.v;
import java.nio.ByteBuffer;
import java.util.UUID;
import okhttp3.internal.http2.Http2Connection;

/* loaded from: classes3.dex */
public final class l {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final UUID f48280a;

        /* renamed from: b  reason: collision with root package name */
        private final int f48281b;

        /* renamed from: c  reason: collision with root package name */
        private final byte[] f48282c;

        public a(UUID uuid, int i11, byte[] bArr) {
            this.f48280a = uuid;
            this.f48281b = i11;
            this.f48282c = bArr;
        }
    }

    public static byte[] a(UUID uuid, byte[] bArr) {
        return b(uuid, null, bArr);
    }

    public static byte[] b(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length += (uuidArr.length * 16) + 4;
        }
        ByteBuffer allocate = ByteBuffer.allocate(length);
        allocate.putInt(length);
        allocate.putInt(1886614376);
        allocate.putInt(uuidArr != null ? Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE : 0);
        allocate.putLong(uuid.getMostSignificantBits());
        allocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            allocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                allocate.putLong(uuid2.getMostSignificantBits());
                allocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr != null && bArr.length != 0) {
            allocate.putInt(bArr.length);
            allocate.put(bArr);
        }
        return allocate.array();
    }

    public static boolean c(byte[] bArr) {
        return d(bArr) != null;
    }

    private static a d(byte[] bArr) {
        v vVar = new v(bArr);
        if (vVar.f() < 32) {
            return null;
        }
        vVar.O(0);
        if (vVar.m() == vVar.a() + 4 && vVar.m() == 1886614376) {
            int c11 = qi.a.c(vVar.m());
            if (c11 > 1) {
                StringBuilder sb2 = new StringBuilder(37);
                sb2.append("Unsupported pssh version: ");
                sb2.append(c11);
                ak.o.h("PsshAtomUtil", sb2.toString());
                return null;
            }
            UUID uuid = new UUID(vVar.v(), vVar.v());
            if (c11 == 1) {
                vVar.P(vVar.G() * 16);
            }
            int G = vVar.G();
            if (G != vVar.a()) {
                return null;
            }
            byte[] bArr2 = new byte[G];
            vVar.j(bArr2, 0, G);
            return new a(uuid, c11, bArr2);
        }
        return null;
    }

    public static byte[] e(byte[] bArr, UUID uuid) {
        a d11 = d(bArr);
        if (d11 == null) {
            return null;
        }
        if (uuid.equals(d11.f48280a)) {
            return d11.f48282c;
        }
        String valueOf = String.valueOf(uuid);
        String valueOf2 = String.valueOf(d11.f48280a);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 33 + valueOf2.length());
        sb2.append("UUID mismatch. Expected: ");
        sb2.append(valueOf);
        sb2.append(", got: ");
        sb2.append(valueOf2);
        sb2.append(".");
        ak.o.h("PsshAtomUtil", sb2.toString());
        return null;
    }

    public static UUID f(byte[] bArr) {
        a d11 = d(bArr);
        if (d11 == null) {
            return null;
        }
        return d11.f48280a;
    }

    public static int g(byte[] bArr) {
        a d11 = d(bArr);
        if (d11 == null) {
            return -1;
        }
        return d11.f48281b;
    }
}