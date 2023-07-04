package d2;

import android.view.MotionEvent;
import java.util.List;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a  reason: collision with root package name */
    private final List<x> f23425a;

    /* renamed from: b  reason: collision with root package name */
    private final MotionEvent f23426b;

    public w(long j11, List<x> pointers, MotionEvent motionEvent) {
        kotlin.jvm.internal.s.g(pointers, "pointers");
        kotlin.jvm.internal.s.g(motionEvent, "motionEvent");
        this.f23425a = pointers;
        this.f23426b = motionEvent;
    }

    public final MotionEvent a() {
        return this.f23426b;
    }

    public final List<x> b() {
        return this.f23425a;
    }
}