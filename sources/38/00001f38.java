package com.google.android.gms.common.server.response;

import java.io.BufferedReader;

/* loaded from: classes3.dex */
final class zac implements zai {
    @Override // com.google.android.gms.common.server.response.zai
    public final /* synthetic */ Object zaa(FastParser fastParser, BufferedReader bufferedReader) {
        float zak;
        zak = fastParser.zak(bufferedReader);
        return Float.valueOf(zak);
    }
}