package dg;

import com.facebook.react.bridge.ReadableArray;

/* loaded from: classes3.dex */
public class c extends a {

    /* renamed from: b  reason: collision with root package name */
    private final int f23984b;

    /* renamed from: c  reason: collision with root package name */
    private final int f23985c;

    /* renamed from: d  reason: collision with root package name */
    private final String f23986d;

    /* renamed from: e  reason: collision with root package name */
    private final ReadableArray f23987e;

    public c(int i11, int i12, String str, ReadableArray readableArray) {
        this.f23984b = i11;
        this.f23985c = i12;
        this.f23986d = str;
        this.f23987e = readableArray;
    }

    @Override // dg.d
    public int a() {
        return this.f23984b;
    }

    @Override // dg.d
    public void b(cg.c cVar) {
        cVar.n(this.f23984b, this.f23985c, this.f23986d, this.f23987e);
    }

    public String toString() {
        return "DispatchStringCommandMountItem [" + this.f23985c + "] " + this.f23986d;
    }
}