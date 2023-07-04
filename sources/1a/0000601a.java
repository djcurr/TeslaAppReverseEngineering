package com.tesla.data.oapi;

import kotlin.Metadata;
import kotlin.jvm.internal.s;

@com.squareup.moshi.g(generateAdapter = true)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tesla/data/oapi/TakeDriveNoteBody;", "", "", "note", "<init>", "(Ljava/lang/String;)V", "data_globalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class TakeDriveNoteBody {
    @ir.b(name = "note")

    /* renamed from: a  reason: collision with root package name */
    private final String f21703a;

    public TakeDriveNoteBody(String note) {
        s.g(note, "note");
        this.f21703a = note;
    }

    public final String a() {
        return this.f21703a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TakeDriveNoteBody) && s.c(this.f21703a, ((TakeDriveNoteBody) obj).f21703a);
    }

    public int hashCode() {
        return this.f21703a.hashCode();
    }

    public String toString() {
        String str = this.f21703a;
        return "TakeDriveNoteBody(note=" + str + ")";
    }
}