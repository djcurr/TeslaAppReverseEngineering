package d2;

import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    private long f23312a;

    /* renamed from: b  reason: collision with root package name */
    private final SparseLongArray f23313b = new SparseLongArray();

    /* renamed from: c  reason: collision with root package name */
    private final SparseBooleanArray f23314c = new SparseBooleanArray();

    /* renamed from: d  reason: collision with root package name */
    private final List<x> f23315d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    private int f23316e = -1;

    /* renamed from: f  reason: collision with root package name */
    private int f23317f = -1;

    private final void a(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0 && actionMasked != 5) {
            if (actionMasked != 9) {
                return;
            }
            int pointerId = motionEvent.getPointerId(0);
            if (this.f23313b.indexOfKey(pointerId) < 0) {
                SparseLongArray sparseLongArray = this.f23313b;
                long j11 = this.f23312a;
                this.f23312a = 1 + j11;
                sparseLongArray.put(pointerId, j11);
                return;
            }
            return;
        }
        int actionIndex = motionEvent.getActionIndex();
        int pointerId2 = motionEvent.getPointerId(actionIndex);
        if (this.f23313b.indexOfKey(pointerId2) < 0) {
            SparseLongArray sparseLongArray2 = this.f23313b;
            long j12 = this.f23312a;
            this.f23312a = 1 + j12;
            sparseLongArray2.put(pointerId2, j12);
            if (motionEvent.getToolType(actionIndex) == 3) {
                this.f23314c.put(pointerId2, true);
            }
        }
    }

    private final void b(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() != 1) {
            return;
        }
        int toolType = motionEvent.getToolType(0);
        int source = motionEvent.getSource();
        if (toolType == this.f23316e && source == this.f23317f) {
            return;
        }
        this.f23316e = toolType;
        this.f23317f = source;
        this.f23314c.clear();
        this.f23313b.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final d2.x d(d2.f0 r25, android.view.MotionEvent r26, int r27, boolean r28) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d2.h.d(d2.f0, android.view.MotionEvent, int, boolean):d2.x");
    }

    private final long f(int i11) {
        long j11;
        int indexOfKey = this.f23313b.indexOfKey(i11);
        if (indexOfKey >= 0) {
            j11 = this.f23313b.valueAt(indexOfKey);
        } else {
            j11 = this.f23312a;
            this.f23312a = 1 + j11;
            this.f23313b.put(i11, j11);
        }
        return t.b(j11);
    }

    private final boolean g(MotionEvent motionEvent, int i11) {
        int pointerCount = motionEvent.getPointerCount();
        int i12 = 0;
        while (i12 < pointerCount) {
            int i13 = i12 + 1;
            if (motionEvent.getPointerId(i12) == i11) {
                return true;
            }
            i12 = i13;
        }
        return false;
    }

    private final void h(MotionEvent motionEvent) {
        int size;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 6) {
            int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
            if (!this.f23314c.get(pointerId, false)) {
                this.f23313b.delete(pointerId);
                this.f23314c.delete(pointerId);
            }
        }
        if (this.f23313b.size() <= motionEvent.getPointerCount() || (size = this.f23313b.size() - 1) < 0) {
            return;
        }
        while (true) {
            int i11 = size - 1;
            int keyAt = this.f23313b.keyAt(size);
            if (!g(motionEvent, keyAt)) {
                this.f23313b.removeAt(size);
                this.f23314c.delete(keyAt);
            }
            if (i11 < 0) {
                return;
            }
            size = i11;
        }
    }

    public final w c(MotionEvent motionEvent, f0 positionCalculator) {
        int i11;
        kotlin.jvm.internal.s.g(motionEvent, "motionEvent");
        kotlin.jvm.internal.s.g(positionCalculator, "positionCalculator");
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 3) {
            this.f23313b.clear();
            this.f23314c.clear();
            return null;
        }
        b(motionEvent);
        a(motionEvent);
        boolean z11 = actionMasked == 10 || actionMasked == 7 || actionMasked == 9;
        boolean z12 = actionMasked == 8;
        if (z11) {
            this.f23314c.put(motionEvent.getPointerId(motionEvent.getActionIndex()), true);
        }
        if (actionMasked != 1) {
            i11 = actionMasked != 6 ? -1 : motionEvent.getActionIndex();
        } else {
            i11 = 0;
        }
        this.f23315d.clear();
        int pointerCount = motionEvent.getPointerCount();
        int i12 = 0;
        while (i12 < pointerCount) {
            int i13 = i12 + 1;
            this.f23315d.add(d(positionCalculator, motionEvent, i12, (z11 || i12 == i11 || (z12 && motionEvent.getButtonState() == 0)) ? false : true));
            i12 = i13;
        }
        h(motionEvent);
        return new w(motionEvent.getEventTime(), this.f23315d, motionEvent);
    }

    public final void e(int i11) {
        this.f23314c.delete(i11);
        this.f23313b.delete(i11);
    }
}