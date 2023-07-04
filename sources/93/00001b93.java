package com.google.android.exoplayer2.drm;

import ak.k0;
import ak.o;
import ak.v;
import android.media.MediaDrm;
import android.media.UnsupportedSchemeException;
import android.text.TextUtils;
import com.google.android.exoplayer2.drm.e;
import com.google.android.exoplayer2.drm.j;
import hi.n;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes3.dex */
public final class k implements j {

    /* renamed from: d */
    public static final j.d f13369d = new j.d() { // from class: hi.p
        @Override // com.google.android.exoplayer2.drm.j.d
        public final com.google.android.exoplayer2.drm.j a(UUID uuid) {
            return com.google.android.exoplayer2.drm.k.m(uuid);
        }
    };

    /* renamed from: a */
    private final UUID f13370a;

    /* renamed from: b */
    private final MediaDrm f13371b;

    /* renamed from: c */
    private int f13372c;

    private k(UUID uuid) {
        ak.a.e(uuid);
        ak.a.b(!ci.b.f9154b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f13370a = uuid;
        MediaDrm mediaDrm = new MediaDrm(s(uuid));
        this.f13371b = mediaDrm;
        this.f13372c = 1;
        if (ci.b.f9156d.equals(uuid) && z()) {
            u(mediaDrm);
        }
    }

    public static k A(UUID uuid) {
        try {
            return new k(uuid);
        } catch (UnsupportedSchemeException e11) {
            throw new UnsupportedDrmException(1, e11);
        } catch (Exception e12) {
            throw new UnsupportedDrmException(2, e12);
        }
    }

    public static /* synthetic */ j m(UUID uuid) {
        return y(uuid);
    }

    public static /* synthetic */ void n(k kVar, j.c cVar, MediaDrm mediaDrm, byte[] bArr, int i11, int i12, byte[] bArr2) {
        kVar.x(cVar, mediaDrm, bArr, i11, i12, bArr2);
    }

    private static byte[] o(byte[] bArr) {
        v vVar = new v(bArr);
        int p11 = vVar.p();
        short r11 = vVar.r();
        short r12 = vVar.r();
        if (r11 == 1 && r12 == 1) {
            short r13 = vVar.r();
            Charset charset = com.google.common.base.f.f15921d;
            String A = vVar.A(r13, charset);
            if (A.contains("<LA_URL>")) {
                return bArr;
            }
            int indexOf = A.indexOf("</DATA>");
            if (indexOf == -1) {
                o.h("FrameworkMediaDrm", "Could not find the </DATA> tag. Skipping LA_URL workaround.");
            }
            String substring = A.substring(0, indexOf);
            String substring2 = A.substring(indexOf);
            StringBuilder sb2 = new StringBuilder(String.valueOf(substring).length() + 26 + String.valueOf(substring2).length());
            sb2.append(substring);
            sb2.append("<LA_URL>https://x</LA_URL>");
            sb2.append(substring2);
            String sb3 = sb2.toString();
            int i11 = p11 + 52;
            ByteBuffer allocate = ByteBuffer.allocate(i11);
            allocate.order(ByteOrder.LITTLE_ENDIAN);
            allocate.putInt(i11);
            allocate.putShort(r11);
            allocate.putShort(r12);
            allocate.putShort((short) (sb3.length() * 2));
            allocate.put(sb3.getBytes(charset));
            return allocate.array();
        }
        o.f("FrameworkMediaDrm", "Unexpected record count or type. Skipping LA_URL workaround.");
        return bArr;
    }

    private static byte[] p(UUID uuid, byte[] bArr) {
        return ci.b.f9155c.equals(uuid) ? a.a(bArr) : bArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0056, code lost:
        if ("AFTT".equals(r0) == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static byte[] q(java.util.UUID r3, byte[] r4) {
        /*
            java.util.UUID r0 = ci.b.f9157e
            boolean r1 = r0.equals(r3)
            if (r1 == 0) goto L18
            byte[] r1 = qi.l.e(r4, r3)
            if (r1 != 0) goto Lf
            goto L10
        Lf:
            r4 = r1
        L10:
            byte[] r4 = o(r4)
            byte[] r4 = qi.l.a(r0, r4)
        L18:
            int r1 = ak.k0.f477a
            r2 = 23
            if (r1 >= r2) goto L26
            java.util.UUID r1 = ci.b.f9156d
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L58
        L26:
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L5f
            java.lang.String r0 = ak.k0.f479c
            java.lang.String r1 = "Amazon"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L5f
            java.lang.String r0 = ak.k0.f480d
            java.lang.String r1 = "AFTB"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L58
            java.lang.String r1 = "AFTS"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L58
            java.lang.String r1 = "AFTM"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L58
            java.lang.String r1 = "AFTT"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L5f
        L58:
            byte[] r3 = qi.l.e(r4, r3)
            if (r3 == 0) goto L5f
            return r3
        L5f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.drm.k.q(java.util.UUID, byte[]):byte[]");
    }

    private static String r(UUID uuid, String str) {
        return (k0.f477a < 26 && ci.b.f9155c.equals(uuid) && ("video/mp4".equals(str) || "audio/mp4".equals(str))) ? "cenc" : str;
    }

    private static UUID s(UUID uuid) {
        return (k0.f477a >= 27 || !ci.b.f9155c.equals(uuid)) ? uuid : ci.b.f9154b;
    }

    private static void u(MediaDrm mediaDrm) {
        mediaDrm.setPropertyString("securityLevel", "L3");
    }

    private static e.b w(UUID uuid, List<e.b> list) {
        boolean z11;
        if (!ci.b.f9156d.equals(uuid)) {
            return list.get(0);
        }
        if (k0.f477a >= 28 && list.size() > 1) {
            e.b bVar = list.get(0);
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                e.b bVar2 = list.get(i12);
                byte[] bArr = (byte[]) ak.a.e(bVar2.f13356e);
                if (!k0.c(bVar2.f13355d, bVar.f13355d) || !k0.c(bVar2.f13354c, bVar.f13354c) || !qi.l.c(bArr)) {
                    z11 = false;
                    break;
                }
                i11 += bArr.length;
            }
            z11 = true;
            if (z11) {
                byte[] bArr2 = new byte[i11];
                int i13 = 0;
                for (int i14 = 0; i14 < list.size(); i14++) {
                    byte[] bArr3 = (byte[]) ak.a.e(list.get(i14).f13356e);
                    int length = bArr3.length;
                    System.arraycopy(bArr3, 0, bArr2, i13, length);
                    i13 += length;
                }
                return bVar.b(bArr2);
            }
        }
        for (int i15 = 0; i15 < list.size(); i15++) {
            e.b bVar3 = list.get(i15);
            int g11 = qi.l.g((byte[]) ak.a.e(bVar3.f13356e));
            int i16 = k0.f477a;
            if (i16 < 23 && g11 == 0) {
                return bVar3;
            }
            if (i16 >= 23 && g11 == 1) {
                return bVar3;
            }
        }
        return list.get(0);
    }

    public /* synthetic */ void x(j.c cVar, MediaDrm mediaDrm, byte[] bArr, int i11, int i12, byte[] bArr2) {
        cVar.a(this, bArr, i11, i12, bArr2);
    }

    public static /* synthetic */ j y(UUID uuid) {
        try {
            return A(uuid);
        } catch (UnsupportedDrmException unused) {
            String valueOf = String.valueOf(uuid);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 53);
            sb2.append("Failed to instantiate a FrameworkMediaDrm for uuid: ");
            sb2.append(valueOf);
            sb2.append(".");
            o.c("FrameworkMediaDrm", sb2.toString());
            return new h();
        }
    }

    private static boolean z() {
        return "ASUS_Z00AD".equals(k0.f480d);
    }

    @Override // com.google.android.exoplayer2.drm.j
    public Class<n> a() {
        return n.class;
    }

    @Override // com.google.android.exoplayer2.drm.j
    public synchronized void b() {
        ak.a.f(this.f13372c > 0);
        this.f13372c++;
    }

    @Override // com.google.android.exoplayer2.drm.j
    public Map<String, String> c(byte[] bArr) {
        return this.f13371b.queryKeyStatus(bArr);
    }

    @Override // com.google.android.exoplayer2.drm.j
    public j.e e() {
        MediaDrm.ProvisionRequest provisionRequest = this.f13371b.getProvisionRequest();
        return new j.e(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    @Override // com.google.android.exoplayer2.drm.j
    public byte[] f() {
        return this.f13371b.openSession();
    }

    @Override // com.google.android.exoplayer2.drm.j
    public void g(byte[] bArr, byte[] bArr2) {
        this.f13371b.restoreKeys(bArr, bArr2);
    }

    @Override // com.google.android.exoplayer2.drm.j
    public void h(final j.c cVar) {
        this.f13371b.setOnEventListener(cVar == null ? null : new MediaDrm.OnEventListener() { // from class: hi.o
            {
                com.google.android.exoplayer2.drm.k.this = this;
            }

            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i11, int i12, byte[] bArr2) {
                com.google.android.exoplayer2.drm.k.n(com.google.android.exoplayer2.drm.k.this, cVar, mediaDrm, bArr, i11, i12, bArr2);
            }
        });
    }

    @Override // com.google.android.exoplayer2.drm.j
    public void i(byte[] bArr) {
        this.f13371b.provideProvisionResponse(bArr);
    }

    @Override // com.google.android.exoplayer2.drm.j
    public void j(byte[] bArr) {
        this.f13371b.closeSession(bArr);
    }

    @Override // com.google.android.exoplayer2.drm.j
    public byte[] k(byte[] bArr, byte[] bArr2) {
        if (ci.b.f9155c.equals(this.f13370a)) {
            bArr2 = a.b(bArr2);
        }
        return this.f13371b.provideKeyResponse(bArr, bArr2);
    }

    @Override // com.google.android.exoplayer2.drm.j
    public j.b l(byte[] bArr, List<e.b> list, int i11, HashMap<String, String> hashMap) {
        byte[] bArr2;
        String str;
        e.b bVar = null;
        if (list != null) {
            bVar = w(this.f13370a, list);
            bArr2 = q(this.f13370a, (byte[]) ak.a.e(bVar.f13356e));
            str = r(this.f13370a, bVar.f13355d);
        } else {
            bArr2 = null;
            str = null;
        }
        MediaDrm.KeyRequest keyRequest = this.f13371b.getKeyRequest(bArr, bArr2, str, i11, hashMap);
        byte[] p11 = p(this.f13370a, keyRequest.getData());
        String defaultUrl = keyRequest.getDefaultUrl();
        if ("https://x".equals(defaultUrl)) {
            defaultUrl = "";
        }
        if (TextUtils.isEmpty(defaultUrl) && bVar != null && !TextUtils.isEmpty(bVar.f13354c)) {
            defaultUrl = bVar.f13354c;
        }
        return new j.b(p11, defaultUrl, k0.f477a >= 23 ? keyRequest.getRequestType() : Integer.MIN_VALUE);
    }

    @Override // com.google.android.exoplayer2.drm.j
    public synchronized void release() {
        int i11 = this.f13372c - 1;
        this.f13372c = i11;
        if (i11 == 0) {
            this.f13371b.release();
        }
    }

    @Override // com.google.android.exoplayer2.drm.j
    /* renamed from: t */
    public n d(byte[] bArr) {
        return new n(s(this.f13370a), bArr, k0.f477a < 21 && ci.b.f9156d.equals(this.f13370a) && "L3".equals(v("securityLevel")));
    }

    public String v(String str) {
        return this.f13371b.getPropertyString(str);
    }
}