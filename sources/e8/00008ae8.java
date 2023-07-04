package net.time4j.calendar.service;

import net.time4j.engine.q;
import net.time4j.engine.u;

/* loaded from: classes5.dex */
public class f<T extends q<T>> extends d<Integer, T> {
    private static final long serialVersionUID = -4975173343610190782L;

    /* renamed from: c  reason: collision with root package name */
    private final transient int f40938c;

    /* renamed from: d  reason: collision with root package name */
    private final transient int f40939d;

    /* renamed from: e  reason: collision with root package name */
    private final transient u<T> f40940e;

    /* renamed from: f  reason: collision with root package name */
    private final transient u<T> f40941f;

    public f(String str, Class<T> cls, int i11, int i12, char c11) {
        super(str, cls, c11, str.startsWith("DAY_OF_"));
        this.f40938c = i11;
        this.f40939d = i12;
    }

    @Override // net.time4j.engine.p
    public Class<Integer> getType() {
        return Integer.class;
    }

    @Override // net.time4j.engine.p
    /* renamed from: p */
    public Integer getDefaultMaximum() {
        return Integer.valueOf(this.f40939d);
    }

    @Override // net.time4j.engine.p
    /* renamed from: q */
    public Integer getDefaultMinimum() {
        return Integer.valueOf(this.f40938c);
    }

    public f(String str, Class<T> cls, int i11, int i12, char c11, u<T> uVar, u<T> uVar2) {
        super(str, cls, c11, false);
        this.f40938c = i11;
        this.f40939d = i12;
        this.f40940e = uVar;
        this.f40941f = uVar2;
    }
}