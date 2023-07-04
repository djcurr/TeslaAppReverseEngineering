package net.time4j.calendar.service;

import net.time4j.engine.o;
import net.time4j.engine.q;
import net.time4j.x0;
import net.time4j.z0;

/* loaded from: classes5.dex */
public class g<T extends q<T>> extends e<x0, T> {
    private static final long serialVersionUID = -84764920511581480L;

    /* renamed from: e  reason: collision with root package name */
    private final transient z0 f40942e;

    public g(Class<T> cls, z0 z0Var) {
        super("DAY_OF_WEEK", cls, x0.class, 'E');
        this.f40942e = z0Var;
    }

    @Override // net.time4j.calendar.service.e
    /* renamed from: C */
    public x0 s() {
        return this.f40942e.f().roll(6);
    }

    @Override // net.time4j.calendar.service.e
    /* renamed from: D */
    public x0 t() {
        return this.f40942e.f();
    }

    @Override // net.time4j.calendar.service.e
    /* renamed from: E */
    public int z(x0 x0Var) {
        return x0Var.getValue(this.f40942e);
    }

    @Override // net.time4j.engine.e, java.util.Comparator
    /* renamed from: c */
    public int compare(o oVar, o oVar2) {
        int value = ((x0) oVar.l(this)).getValue(this.f40942e);
        int value2 = ((x0) oVar2.l(this)).getValue(this.f40942e);
        if (value < value2) {
            return -1;
        }
        return value == value2 ? 0 : 1;
    }
}