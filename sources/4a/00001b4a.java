package com.google.android.exoplayer2.audio;

import ak.k0;
import android.media.AudioTimestamp;
import android.media.AudioTrack;
import ch.qos.logback.core.spi.AbstractComponentTracker;

/* loaded from: classes3.dex */
final class b {

    /* renamed from: a  reason: collision with root package name */
    private final a f13104a;

    /* renamed from: b  reason: collision with root package name */
    private int f13105b;

    /* renamed from: c  reason: collision with root package name */
    private long f13106c;

    /* renamed from: d  reason: collision with root package name */
    private long f13107d;

    /* renamed from: e  reason: collision with root package name */
    private long f13108e;

    /* renamed from: f  reason: collision with root package name */
    private long f13109f;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final AudioTrack f13110a;

        /* renamed from: b  reason: collision with root package name */
        private final AudioTimestamp f13111b = new AudioTimestamp();

        /* renamed from: c  reason: collision with root package name */
        private long f13112c;

        /* renamed from: d  reason: collision with root package name */
        private long f13113d;

        /* renamed from: e  reason: collision with root package name */
        private long f13114e;

        public a(AudioTrack audioTrack) {
            this.f13110a = audioTrack;
        }

        public long a() {
            return this.f13114e;
        }

        public long b() {
            return this.f13111b.nanoTime / 1000;
        }

        public boolean c() {
            boolean timestamp = this.f13110a.getTimestamp(this.f13111b);
            if (timestamp) {
                long j11 = this.f13111b.framePosition;
                if (this.f13113d > j11) {
                    this.f13112c++;
                }
                this.f13113d = j11;
                this.f13114e = j11 + (this.f13112c << 32);
            }
            return timestamp;
        }
    }

    public b(AudioTrack audioTrack) {
        if (k0.f477a >= 19) {
            this.f13104a = new a(audioTrack);
            g();
            return;
        }
        this.f13104a = null;
        h(3);
    }

    private void h(int i11) {
        this.f13105b = i11;
        if (i11 == 0) {
            this.f13108e = 0L;
            this.f13109f = -1L;
            this.f13106c = System.nanoTime() / 1000;
            this.f13107d = AbstractComponentTracker.LINGERING_TIMEOUT;
        } else if (i11 == 1) {
            this.f13107d = AbstractComponentTracker.LINGERING_TIMEOUT;
        } else if (i11 == 2 || i11 == 3) {
            this.f13107d = 10000000L;
        } else if (i11 == 4) {
            this.f13107d = 500000L;
        } else {
            throw new IllegalStateException();
        }
    }

    public void a() {
        if (this.f13105b == 4) {
            g();
        }
    }

    public long b() {
        a aVar = this.f13104a;
        if (aVar != null) {
            return aVar.a();
        }
        return -1L;
    }

    public long c() {
        a aVar = this.f13104a;
        if (aVar != null) {
            return aVar.b();
        }
        return -9223372036854775807L;
    }

    public boolean d() {
        return this.f13105b == 2;
    }

    public boolean e(long j11) {
        a aVar = this.f13104a;
        if (aVar == null || j11 - this.f13108e < this.f13107d) {
            return false;
        }
        this.f13108e = j11;
        boolean c11 = aVar.c();
        int i11 = this.f13105b;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            throw new IllegalStateException();
                        }
                    } else if (c11) {
                        g();
                    }
                } else if (!c11) {
                    g();
                }
            } else if (c11) {
                if (this.f13104a.a() > this.f13109f) {
                    h(2);
                }
            } else {
                g();
            }
        } else if (c11) {
            if (this.f13104a.b() < this.f13106c) {
                return false;
            }
            this.f13109f = this.f13104a.a();
            h(1);
        } else if (j11 - this.f13106c > 500000) {
            h(3);
        }
        return c11;
    }

    public void f() {
        h(4);
    }

    public void g() {
        if (this.f13104a != null) {
            h(0);
        }
    }
}