package com.google.android.exoplayer2.drm;

import android.os.Looper;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.drm.f;
import hi.q;

/* loaded from: classes3.dex */
public interface g {

    /* renamed from: a  reason: collision with root package name */
    public static final g f13362a = new a();

    /* loaded from: classes3.dex */
    class a implements g {
        a() {
        }

        @Override // com.google.android.exoplayer2.drm.g
        public DrmSession b(Looper looper, f.a aVar, ci.i iVar) {
            if (iVar.f9208o == null) {
                return null;
            }
            return new i(new DrmSession.DrmSessionException(new UnsupportedDrmException(1)));
        }

        @Override // com.google.android.exoplayer2.drm.g
        public Class<q> c(ci.i iVar) {
            if (iVar.f9208o != null) {
                return q.class;
            }
            return null;
        }
    }

    default void a() {
    }

    DrmSession b(Looper looper, f.a aVar, ci.i iVar);

    Class<? extends hi.m> c(ci.i iVar);

    default void release() {
    }
}