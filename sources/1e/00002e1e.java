package com.google.android.gms.maps.model;

/* loaded from: classes3.dex */
public interface TileProvider {
    public static final Tile NO_TILE = new Tile(-1, -1, null);

    Tile getTile(int i11, int i12, int i13);
}