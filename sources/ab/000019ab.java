package com.facebook.react.uimanager;

import android.view.MotionEvent;
import android.view.ViewGroup;

/* loaded from: classes3.dex */
public class h {

    /* renamed from: e  reason: collision with root package name */
    private final ViewGroup f12316e;

    /* renamed from: a  reason: collision with root package name */
    private int f12312a = -1;

    /* renamed from: b  reason: collision with root package name */
    private final float[] f12313b = new float[2];

    /* renamed from: c  reason: collision with root package name */
    private boolean f12314c = false;

    /* renamed from: d  reason: collision with root package name */
    private long f12315d = Long.MIN_VALUE;

    /* renamed from: f  reason: collision with root package name */
    private final com.facebook.react.uimanager.events.k f12317f = new com.facebook.react.uimanager.events.k();

    public h(ViewGroup viewGroup) {
        this.f12316e = viewGroup;
    }

    private void a(MotionEvent motionEvent, com.facebook.react.uimanager.events.d dVar) {
        if (this.f12312a == -1) {
            nd.a.G("ReactNative", "Can't cancel already finished gesture. Is a child View trying to start a gesture from an UP/CANCEL event?");
            return;
        }
        wf.a.b(!this.f12314c, "Expected to not have already sent a cancel for this gesture");
        int f11 = t0.f(this.f12316e);
        int i11 = this.f12312a;
        com.facebook.react.uimanager.events.l lVar = com.facebook.react.uimanager.events.l.CANCEL;
        long j11 = this.f12315d;
        float[] fArr = this.f12313b;
        ((com.facebook.react.uimanager.events.d) wf.a.c(dVar)).g(com.facebook.react.uimanager.events.j.f(f11, i11, lVar, motionEvent, j11, fArr[0], fArr[1], this.f12317f));
    }

    private int b(MotionEvent motionEvent) {
        return o0.b(motionEvent.getX(), motionEvent.getY(), this.f12316e, this.f12313b, null);
    }

    public void c(MotionEvent motionEvent, com.facebook.react.uimanager.events.d dVar) {
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            if (this.f12312a != -1) {
                nd.a.j("ReactNative", "Got DOWN touch before receiving UP or CANCEL from last gesture");
            }
            this.f12314c = false;
            this.f12315d = motionEvent.getEventTime();
            this.f12312a = b(motionEvent);
            int f11 = t0.f(this.f12316e);
            int i11 = this.f12312a;
            com.facebook.react.uimanager.events.l lVar = com.facebook.react.uimanager.events.l.START;
            long j11 = this.f12315d;
            float[] fArr = this.f12313b;
            dVar.g(com.facebook.react.uimanager.events.j.f(f11, i11, lVar, motionEvent, j11, fArr[0], fArr[1], this.f12317f));
        } else if (this.f12314c) {
        } else {
            if (this.f12312a == -1) {
                nd.a.j("ReactNative", "Unexpected state: received touch event but didn't get starting ACTION_DOWN for this gesture before");
            } else if (action == 1) {
                b(motionEvent);
                int f12 = t0.f(this.f12316e);
                int i12 = this.f12312a;
                com.facebook.react.uimanager.events.l lVar2 = com.facebook.react.uimanager.events.l.END;
                long j12 = this.f12315d;
                float[] fArr2 = this.f12313b;
                dVar.g(com.facebook.react.uimanager.events.j.f(f12, i12, lVar2, motionEvent, j12, fArr2[0], fArr2[1], this.f12317f));
                this.f12312a = -1;
                this.f12315d = Long.MIN_VALUE;
            } else if (action == 2) {
                b(motionEvent);
                int f13 = t0.f(this.f12316e);
                int i13 = this.f12312a;
                com.facebook.react.uimanager.events.l lVar3 = com.facebook.react.uimanager.events.l.MOVE;
                long j13 = this.f12315d;
                float[] fArr3 = this.f12313b;
                dVar.g(com.facebook.react.uimanager.events.j.f(f13, i13, lVar3, motionEvent, j13, fArr3[0], fArr3[1], this.f12317f));
            } else if (action == 5) {
                int f14 = t0.f(this.f12316e);
                int i14 = this.f12312a;
                com.facebook.react.uimanager.events.l lVar4 = com.facebook.react.uimanager.events.l.START;
                long j14 = this.f12315d;
                float[] fArr4 = this.f12313b;
                dVar.g(com.facebook.react.uimanager.events.j.f(f14, i14, lVar4, motionEvent, j14, fArr4[0], fArr4[1], this.f12317f));
            } else if (action == 6) {
                int f15 = t0.f(this.f12316e);
                int i15 = this.f12312a;
                com.facebook.react.uimanager.events.l lVar5 = com.facebook.react.uimanager.events.l.END;
                long j15 = this.f12315d;
                float[] fArr5 = this.f12313b;
                dVar.g(com.facebook.react.uimanager.events.j.f(f15, i15, lVar5, motionEvent, j15, fArr5[0], fArr5[1], this.f12317f));
            } else if (action == 3) {
                if (this.f12317f.c(motionEvent.getDownTime())) {
                    a(motionEvent, dVar);
                } else {
                    nd.a.j("ReactNative", "Received an ACTION_CANCEL touch event for which we have no corresponding ACTION_DOWN");
                }
                this.f12312a = -1;
                this.f12315d = Long.MIN_VALUE;
            } else {
                nd.a.G("ReactNative", "Warning : touch event was ignored. Action=" + action + " Target=" + this.f12312a);
            }
        }
    }

    public void d(MotionEvent motionEvent, com.facebook.react.uimanager.events.d dVar) {
        if (this.f12314c) {
            return;
        }
        a(motionEvent, dVar);
        this.f12314c = true;
        this.f12312a = -1;
    }
}