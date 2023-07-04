package com.bumptech.glide.load.engine;

import java.io.File;
import la.a;

/* loaded from: classes.dex */
class e<DataType> implements a.b {

    /* renamed from: a  reason: collision with root package name */
    private final ha.a<DataType> f10564a;

    /* renamed from: b  reason: collision with root package name */
    private final DataType f10565b;

    /* renamed from: c  reason: collision with root package name */
    private final ha.e f10566c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(ha.a<DataType> aVar, DataType datatype, ha.e eVar) {
        this.f10564a = aVar;
        this.f10565b = datatype;
        this.f10566c = eVar;
    }

    @Override // la.a.b
    public boolean a(File file) {
        return this.f10564a.a(this.f10565b, file, this.f10566c);
    }
}