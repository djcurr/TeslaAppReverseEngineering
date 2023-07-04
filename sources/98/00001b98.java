package com.google.android.exoplayer2.extractor.flv;

import ak.v;
import com.google.android.exoplayer2.ParserException;
import ji.x;

/* loaded from: classes3.dex */
abstract class TagPayloadReader {

    /* renamed from: a  reason: collision with root package name */
    protected final x f13379a;

    /* loaded from: classes3.dex */
    public static final class UnsupportedFormatException extends ParserException {
        public UnsupportedFormatException(String str) {
            super(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public TagPayloadReader(x xVar) {
        this.f13379a = xVar;
    }

    public final boolean a(v vVar, long j11) {
        return b(vVar) && c(vVar, j11);
    }

    protected abstract boolean b(v vVar);

    protected abstract boolean c(v vVar, long j11);
}