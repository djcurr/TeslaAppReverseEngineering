package uo;

import java.util.List;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f53620a;

    /* renamed from: b  reason: collision with root package name */
    private int f53621b;

    /* renamed from: c  reason: collision with root package name */
    private final String f53622c;

    /* renamed from: d  reason: collision with root package name */
    private final List<byte[]> f53623d;

    /* renamed from: e  reason: collision with root package name */
    private final String f53624e;

    /* renamed from: f  reason: collision with root package name */
    private Object f53625f;

    /* renamed from: g  reason: collision with root package name */
    private final int f53626g;

    /* renamed from: h  reason: collision with root package name */
    private final int f53627h;

    public e(byte[] bArr, String str, List<byte[]> list, String str2) {
        this(bArr, str, list, str2, -1, -1);
    }

    public List<byte[]> a() {
        return this.f53623d;
    }

    public String b() {
        return this.f53624e;
    }

    public int c() {
        return this.f53621b;
    }

    public Object d() {
        return this.f53625f;
    }

    public byte[] e() {
        return this.f53620a;
    }

    public int f() {
        return this.f53626g;
    }

    public int g() {
        return this.f53627h;
    }

    public String h() {
        return this.f53622c;
    }

    public boolean i() {
        return this.f53626g >= 0 && this.f53627h >= 0;
    }

    public void j(Integer num) {
    }

    public void k(Integer num) {
    }

    public void l(int i11) {
        this.f53621b = i11;
    }

    public void m(Object obj) {
        this.f53625f = obj;
    }

    public e(byte[] bArr, String str, List<byte[]> list, String str2, int i11, int i12) {
        this.f53620a = bArr;
        this.f53621b = bArr == null ? 0 : bArr.length * 8;
        this.f53622c = str;
        this.f53623d = list;
        this.f53624e = str2;
        this.f53626g = i12;
        this.f53627h = i11;
    }
}