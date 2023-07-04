package c1;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.KotlinNothingValueException;

/* loaded from: classes.dex */
public final class i1 implements n1.a, Iterable<n1.b>, i00.a {

    /* renamed from: b */
    private int f8494b;

    /* renamed from: d */
    private int f8496d;

    /* renamed from: e */
    private int f8497e;

    /* renamed from: f */
    private boolean f8498f;

    /* renamed from: g */
    private int f8499g;

    /* renamed from: a */
    private int[] f8493a = new int[0];

    /* renamed from: c */
    private Object[] f8495c = new Object[0];

    /* renamed from: h */
    private ArrayList<d> f8500h = new ArrayList<>();

    public final int b(d anchor) {
        kotlin.jvm.internal.s.g(anchor, "anchor");
        if (!this.f8498f) {
            if (anchor.b()) {
                return anchor.a();
            }
            throw new IllegalArgumentException("Anchor refers to a group that was removed".toString());
        }
        k.r("Use active SlotWriter to determine anchor location instead".toString());
        throw new KotlinNothingValueException();
    }

    public final void c(h1 reader) {
        kotlin.jvm.internal.s.g(reader, "reader");
        if (reader.s() == this && this.f8497e > 0) {
            this.f8497e--;
            return;
        }
        throw new IllegalArgumentException("Unexpected reader close()".toString());
    }

    public final void e(k1 writer, int[] groups, int i11, Object[] slots, int i12, ArrayList<d> anchors) {
        kotlin.jvm.internal.s.g(writer, "writer");
        kotlin.jvm.internal.s.g(groups, "groups");
        kotlin.jvm.internal.s.g(slots, "slots");
        kotlin.jvm.internal.s.g(anchors, "anchors");
        if (writer.x() == this && this.f8498f) {
            this.f8498f = false;
            r(groups, i11, slots, i12, anchors);
            return;
        }
        throw new IllegalArgumentException("Unexpected writer close()".toString());
    }

    public final ArrayList<d> f() {
        return this.f8500h;
    }

    public final int[] h() {
        return this.f8493a;
    }

    public final int i() {
        return this.f8494b;
    }

    public boolean isEmpty() {
        return this.f8494b == 0;
    }

    @Override // java.lang.Iterable
    public Iterator<n1.b> iterator() {
        return new d0(this, 0, this.f8494b);
    }

    public final Object[] j() {
        return this.f8495c;
    }

    public final int k() {
        return this.f8496d;
    }

    public final int m() {
        return this.f8499g;
    }

    public final boolean n() {
        return this.f8498f;
    }

    public final h1 o() {
        if (!this.f8498f) {
            this.f8497e++;
            return new h1(this);
        }
        throw new IllegalStateException("Cannot read while a writer is pending".toString());
    }

    public final k1 p() {
        if (!this.f8498f) {
            if (this.f8497e <= 0) {
                this.f8498f = true;
                this.f8499g++;
                return new k1(this);
            }
            k.r("Cannot start a writer when a reader is pending".toString());
            throw new KotlinNothingValueException();
        }
        k.r("Cannot start a writer when another writer is pending".toString());
        throw new KotlinNothingValueException();
    }

    public final boolean q(d anchor) {
        int K;
        kotlin.jvm.internal.s.g(anchor, "anchor");
        if (anchor.b()) {
            K = j1.K(this.f8500h, anchor.a(), this.f8494b);
            if (K >= 0 && kotlin.jvm.internal.s.c(f().get(K), anchor)) {
                return true;
            }
        }
        return false;
    }

    public final void r(int[] groups, int i11, Object[] slots, int i12, ArrayList<d> anchors) {
        kotlin.jvm.internal.s.g(groups, "groups");
        kotlin.jvm.internal.s.g(slots, "slots");
        kotlin.jvm.internal.s.g(anchors, "anchors");
        this.f8493a = groups;
        this.f8494b = i11;
        this.f8495c = slots;
        this.f8496d = i12;
        this.f8500h = anchors;
    }
}