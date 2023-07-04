package com.bumptech.glide.request;

import com.bumptech.glide.load.engine.GlideException;

/* loaded from: classes.dex */
public interface g<R> {
    boolean onLoadFailed(GlideException glideException, Object obj, ya.k<R> kVar, boolean z11);

    boolean onResourceReady(R r11, Object obj, ya.k<R> kVar, com.bumptech.glide.load.a aVar, boolean z11);
}