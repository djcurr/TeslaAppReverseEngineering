package dg;

import com.facebook.react.bridge.ReadableArray;

/* loaded from: classes3.dex */
public class b extends a {

    /* renamed from: b  reason: collision with root package name */
    private final int f23980b;

    /* renamed from: c  reason: collision with root package name */
    private final int f23981c;

    /* renamed from: d  reason: collision with root package name */
    private final int f23982d;

    /* renamed from: e  reason: collision with root package name */
    private final ReadableArray f23983e;

    public b(int i11, int i12, int i13, ReadableArray readableArray) {
        this.f23980b = i11;
        this.f23981c = i12;
        this.f23982d = i13;
        this.f23983e = readableArray;
    }

    @Override // dg.d
    public int a() {
        return this.f23980b;
    }

    @Override // dg.d
    public void b(cg.c cVar) {
        cVar.m(this.f23980b, this.f23981c, this.f23982d, this.f23983e);
    }

    public String toString() {
        return "DispatchIntCommandMountItem [" + this.f23981c + "] " + this.f23982d;
    }
}