package io.realm.internal.objectstore;

import io.realm.internal.OsSharedRealm;
import io.realm.internal.Table;
import io.realm.internal.UncheckedRow;
import java.io.Closeable;
import java.util.Set;

/* loaded from: classes5.dex */
public class OsObjectBuilder implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    private final Table f31953a;

    /* renamed from: b  reason: collision with root package name */
    private final long f31954b;

    /* renamed from: c  reason: collision with root package name */
    private final long f31955c;

    /* renamed from: d  reason: collision with root package name */
    private final long f31956d;

    /* renamed from: e  reason: collision with root package name */
    private final io.realm.internal.g f31957e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f31958f;

    /* loaded from: classes5.dex */
    class a {
        a() {
        }
    }

    /* loaded from: classes5.dex */
    class a0 {
        a0() {
        }
    }

    /* loaded from: classes5.dex */
    class b {
        b() {
        }
    }

    /* loaded from: classes5.dex */
    class b0 {
        b0() {
        }
    }

    /* loaded from: classes5.dex */
    class c {
        c() {
        }
    }

    /* loaded from: classes5.dex */
    class c0 {
        c0() {
        }
    }

    /* loaded from: classes5.dex */
    class d {
        d() {
        }
    }

    /* loaded from: classes5.dex */
    class d0 {
        d0() {
        }
    }

    /* loaded from: classes5.dex */
    class e {
        e() {
        }
    }

    /* loaded from: classes5.dex */
    class e0 {
        e0() {
        }
    }

    /* loaded from: classes5.dex */
    class f {
        f() {
        }
    }

    /* loaded from: classes5.dex */
    class f0 {
        f0() {
        }
    }

    /* loaded from: classes5.dex */
    class g {
        g() {
        }
    }

    /* loaded from: classes5.dex */
    class g0 {
        g0() {
        }
    }

    /* loaded from: classes5.dex */
    class h {
        h() {
        }
    }

    /* loaded from: classes5.dex */
    class h0 {
        h0() {
        }
    }

    /* loaded from: classes5.dex */
    class i {
        i() {
        }
    }

    /* loaded from: classes5.dex */
    class i0 {
        i0() {
        }
    }

    /* loaded from: classes5.dex */
    class j {
        j() {
        }
    }

    /* loaded from: classes5.dex */
    class j0 {
        j0() {
        }
    }

    /* loaded from: classes5.dex */
    class k {
        k() {
        }
    }

    /* loaded from: classes5.dex */
    class k0 {
        k0() {
        }
    }

    /* loaded from: classes5.dex */
    class l {
        l() {
        }
    }

    /* loaded from: classes5.dex */
    class l0 {
        l0() {
            new io.realm.c0();
        }
    }

    /* loaded from: classes5.dex */
    class m {
        m() {
        }
    }

    /* loaded from: classes5.dex */
    class m0 {
        m0() {
        }
    }

    /* loaded from: classes5.dex */
    class n {
        n() {
        }
    }

    /* loaded from: classes5.dex */
    class n0 {
        n0() {
        }
    }

    /* loaded from: classes5.dex */
    class o {
        o() {
        }
    }

    /* loaded from: classes5.dex */
    class o0 {
        o0() {
        }
    }

    /* loaded from: classes5.dex */
    class p {
        p() {
        }
    }

    /* loaded from: classes5.dex */
    class p0 {
        p0() {
        }
    }

    /* loaded from: classes5.dex */
    class q {
        q() {
        }
    }

    /* loaded from: classes5.dex */
    class q0 {
        q0() {
        }
    }

    /* loaded from: classes5.dex */
    class r {
        r() {
        }
    }

    /* loaded from: classes5.dex */
    class r0 {
        r0() {
        }
    }

    /* loaded from: classes5.dex */
    class s {
        s() {
        }
    }

    /* loaded from: classes5.dex */
    class t {
        t() {
        }
    }

    /* loaded from: classes5.dex */
    class u {
        u() {
            new io.realm.c0();
        }
    }

    /* loaded from: classes5.dex */
    class v {
        v() {
        }
    }

    /* loaded from: classes5.dex */
    class w {
        w() {
            new io.realm.c0();
        }
    }

    /* loaded from: classes5.dex */
    class x {
        x() {
        }
    }

    /* loaded from: classes5.dex */
    class y {
        y() {
        }
    }

    /* loaded from: classes5.dex */
    class z {
        z() {
        }
    }

    static {
        new k();
        new v();
        new g0();
        new m0();
        new n0();
        new o0();
        new p0();
        new q0();
        new r0();
        new a();
        new b();
        new c();
        new d();
        new e();
        new f();
        new g();
        new h();
        new i();
        new j();
        new l();
        new m();
        new n();
        new o();
        new p();
        new q();
        new r();
        new s();
        new t();
        new u();
        new w();
        new x();
        new y();
        new z();
        new a0();
        new b0();
        new c0();
        new d0();
        new e0();
        new f0();
        new h0();
        new i0();
        new j0();
        new k0();
        new l0();
    }

    public OsObjectBuilder(Table table, Set<io.realm.o> set) {
        OsSharedRealm p11 = table.p();
        this.f31954b = p11.getNativePtr();
        this.f31953a = table;
        table.l();
        this.f31956d = table.getNativePtr();
        this.f31955c = nativeCreateBuilder();
        this.f31957e = p11.context;
        this.f31958f = set.contains(io.realm.o.CHECK_SAME_VALUES_BEFORE_SET);
    }

    private static native void nativeAddBinaryDictionaryEntry(long j11, String str, byte[] bArr);

    private static native void nativeAddBoolean(long j11, long j12, boolean z11);

    private static native void nativeAddBooleanDictionaryEntry(long j11, String str, boolean z11);

    private static native void nativeAddBooleanListItem(long j11, boolean z11);

    private static native void nativeAddBooleanSetItem(long j11, boolean z11);

    private static native void nativeAddByteArray(long j11, long j12, byte[] bArr);

    private static native void nativeAddByteArrayListItem(long j11, byte[] bArr);

    private static native void nativeAddByteArraySetItem(long j11, byte[] bArr);

    private static native void nativeAddDate(long j11, long j12, long j13);

    private static native void nativeAddDateDictionaryEntry(long j11, String str, long j12);

    private static native void nativeAddDateListItem(long j11, long j12);

    private static native void nativeAddDateSetItem(long j11, long j12);

    private static native void nativeAddDecimal128(long j11, long j12, long j13, long j14);

    private static native void nativeAddDecimal128DictionaryEntry(long j11, String str, long j12, long j13);

    private static native void nativeAddDecimal128ListItem(long j11, long j12, long j13);

    private static native void nativeAddDecimal128SetItem(long j11, long j12, long j13);

    private static native void nativeAddDouble(long j11, long j12, double d11);

    private static native void nativeAddDoubleDictionaryEntry(long j11, String str, double d11);

    private static native void nativeAddDoubleListItem(long j11, double d11);

    private static native void nativeAddDoubleSetItem(long j11, double d11);

    private static native void nativeAddFloat(long j11, long j12, float f11);

    private static native void nativeAddFloatDictionaryEntry(long j11, String str, float f11);

    private static native void nativeAddFloatListItem(long j11, float f11);

    private static native void nativeAddFloatSetItem(long j11, float f11);

    private static native void nativeAddInteger(long j11, long j12, long j13);

    private static native void nativeAddIntegerDictionaryEntry(long j11, String str, long j12);

    private static native void nativeAddIntegerListItem(long j11, long j12);

    private static native void nativeAddIntegerSetItem(long j11, long j12);

    private static native void nativeAddNull(long j11, long j12);

    private static native void nativeAddNullDictionaryEntry(long j11, String str);

    private static native void nativeAddNullListItem(long j11);

    private static native void nativeAddNullSetItem(long j11);

    private static native void nativeAddObject(long j11, long j12, long j13);

    private static native void nativeAddObjectDictionaryEntry(long j11, String str, long j12);

    private static native void nativeAddObjectId(long j11, long j12, String str);

    private static native void nativeAddObjectIdDictionaryEntry(long j11, String str, String str2);

    private static native void nativeAddObjectIdListItem(long j11, String str);

    private static native void nativeAddObjectIdSetItem(long j11, String str);

    private static native void nativeAddObjectList(long j11, long j12, long[] jArr);

    private static native void nativeAddObjectListItem(long j11, long j12);

    private static native void nativeAddRealmAny(long j11, long j12, long j13);

    public static native void nativeAddRealmAnyDictionaryEntry(long j11, String str, long j12);

    public static native void nativeAddRealmAnyListItem(long j11, long j12);

    private static native void nativeAddString(long j11, long j12, String str);

    private static native void nativeAddStringDictionaryEntry(long j11, String str, String str2);

    private static native void nativeAddStringListItem(long j11, String str);

    private static native void nativeAddStringSetItem(long j11, String str);

    private static native void nativeAddUUID(long j11, long j12, String str);

    private static native void nativeAddUUIDDictionaryEntry(long j11, String str, String str2);

    private static native void nativeAddUUIDListItem(long j11, String str);

    private static native void nativeAddUUIDSetItem(long j11, String str);

    private static native long nativeCreateBuilder();

    private static native long nativeCreateOrUpdateTopLevelObject(long j11, long j12, long j13, boolean z11, boolean z12);

    private static native void nativeDestroyBuilder(long j11);

    private static native long nativeStartDictionary();

    private static native long nativeStartList(long j11);

    private static native long nativeStartSet(long j11);

    private static native void nativeStopDictionary(long j11, long j12, long j13);

    private static native void nativeStopList(long j11, long j12, long j13);

    private static native void nativeStopSet(long j11, long j12, long j13);

    private static native long nativeUpdateEmbeddedObject(long j11, long j12, long j13, long j14, boolean z11);

    public void a(long j11, byte[] bArr) {
        if (bArr == null) {
            nativeAddNull(this.f31955c, j11);
        } else {
            nativeAddByteArray(this.f31955c, j11, bArr);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        nativeDestroyBuilder(this.f31955c);
    }

    public void g(long j11, String str) {
        if (str == null) {
            nativeAddNull(this.f31955c, j11);
        } else {
            nativeAddString(this.f31955c, j11, str);
        }
    }

    public UncheckedRow j() {
        try {
            return new UncheckedRow(this.f31957e, this.f31953a, nativeCreateOrUpdateTopLevelObject(this.f31954b, this.f31956d, this.f31955c, false, false));
        } finally {
            close();
        }
    }

    public void l() {
        try {
            nativeCreateOrUpdateTopLevelObject(this.f31954b, this.f31956d, this.f31955c, true, this.f31958f);
        } finally {
            close();
        }
    }
}