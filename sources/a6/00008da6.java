package o30;

import android.media.MediaCodec;
import android.media.MediaFormat;
import java.io.File;
import java.util.ArrayList;

/* loaded from: classes5.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private pp.g f42205a = pp.g.f46818j;

    /* renamed from: b  reason: collision with root package name */
    private ArrayList<g> f42206b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    private File f42207c;

    public void a(int i11, long j11, MediaCodec.BufferInfo bufferInfo) {
        if (i11 < 0 || i11 >= this.f42206b.size()) {
            return;
        }
        this.f42206b.get(i11).a(j11, bufferInfo);
    }

    public int b(MediaFormat mediaFormat, boolean z11) {
        this.f42206b.add(new g(this.f42206b.size(), mediaFormat, z11));
        return this.f42206b.size() - 1;
    }

    public File c() {
        return this.f42207c;
    }

    public pp.g d() {
        return this.f42205a;
    }

    public ArrayList<g> e() {
        return this.f42206b;
    }

    public void f(File file) {
        this.f42207c = file;
    }

    public void g(int i11) {
        if (i11 == 0) {
            this.f42205a = pp.g.f46818j;
        } else if (i11 == 90) {
            this.f42205a = pp.g.f46819k;
        } else if (i11 == 180) {
            this.f42205a = pp.g.f46820l;
        } else if (i11 == 270) {
            this.f42205a = pp.g.f46821m;
        }
    }

    public void h(int i11, int i12) {
    }
}