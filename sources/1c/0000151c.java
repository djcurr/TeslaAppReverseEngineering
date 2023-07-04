package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import java.io.InputStream;

/* loaded from: classes.dex */
public class m extends b<InputStream> {
    public m(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @Override // com.bumptech.glide.load.data.d
    public Class<InputStream> a() {
        return InputStream.class;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bumptech.glide.load.data.b
    /* renamed from: f */
    public void b(InputStream inputStream) {
        inputStream.close();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bumptech.glide.load.data.b
    /* renamed from: g */
    public InputStream e(AssetManager assetManager, String str) {
        return assetManager.open(str);
    }
}