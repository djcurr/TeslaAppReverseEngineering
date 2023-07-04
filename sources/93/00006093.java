package com.tesla.domain.model.adapter;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.squareup.moshi.h;
import ir.d;
import kotlin.Metadata;
import kotlin.jvm.internal.s;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/tesla/domain/model/adapter/ForceToIntAdapter;", "", "", IntegerTokenConverter.CONVERTER_KEY, "toJson", "(Ljava/lang/Integer;)Ljava/lang/Integer;", "Lcom/squareup/moshi/h;", "reader", "fromJson", "(Lcom/squareup/moshi/h;)Ljava/lang/Integer;", "<init>", "()V", "domain_globalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class ForceToIntAdapter {

    /* loaded from: classes6.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f21855a;

        static {
            int[] iArr = new int[h.c.values().length];
            iArr[h.c.NUMBER.ordinal()] = 1;
            iArr[h.c.BOOLEAN.ordinal()] = 2;
            f21855a = iArr;
        }
    }

    @ir.a
    @ForceToInt
    public final Integer fromJson(h reader) {
        s.g(reader, "reader");
        h.c t02 = reader.t0();
        int i11 = t02 == null ? -1 : a.f21855a[t02.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                reader.R0();
                return null;
            }
            return Integer.valueOf(reader.D() ? 1 : 0);
        }
        return Integer.valueOf(reader.L());
    }

    @d
    public final Integer toJson(@ForceToInt Integer num) {
        return num;
    }
}