package uu;

import java.security.SecureRandom;
import kotlin.jvm.internal.u;
import okio.i;
import vz.k;
import vz.m;
import zu.j;

/* loaded from: classes6.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final k f53672a;

    /* renamed from: b  reason: collision with root package name */
    private final k f53673b;

    /* renamed from: c  reason: collision with root package name */
    private final okio.i f53674c;

    /* loaded from: classes6.dex */
    static final class a extends u implements h00.a<byte[]> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f53675a = new a();

        a() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: a */
        public final byte[] invoke() {
            byte[] bArr = new byte[16];
            new SecureRandom().nextBytes(bArr);
            return bArr;
        }
    }

    /* loaded from: classes6.dex */
    static final class b extends u implements h00.a<String> {
        b() {
            super(0);
        }

        @Override // h00.a
        public final String invoke() {
            return j.e(e.this.c(), 0, 1, null);
        }
    }

    public e() {
        k a11;
        k a12;
        a11 = m.a(a.f53675a);
        this.f53672a = a11;
        a12 = m.a(new b());
        this.f53673b = a12;
        this.f53674c = i.a.h(okio.i.f42657e, c(), 0, 0, 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final byte[] c() {
        return (byte[]) this.f53672a.getValue();
    }

    public final okio.i b() {
        return this.f53674c;
    }

    public final String d() {
        return (String) this.f53673b.getValue();
    }
}