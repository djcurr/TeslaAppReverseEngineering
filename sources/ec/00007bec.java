package jj;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes3.dex */
public class b implements ej.a<b> {

    /* renamed from: a  reason: collision with root package name */
    public final long f33801a;

    /* renamed from: b  reason: collision with root package name */
    public final long f33802b;

    /* renamed from: c  reason: collision with root package name */
    public final long f33803c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f33804d;

    /* renamed from: e  reason: collision with root package name */
    public final long f33805e;

    /* renamed from: f  reason: collision with root package name */
    public final long f33806f;

    /* renamed from: g  reason: collision with root package name */
    public final long f33807g;

    /* renamed from: h  reason: collision with root package name */
    public final long f33808h;

    /* renamed from: i  reason: collision with root package name */
    public final n f33809i;

    /* renamed from: j  reason: collision with root package name */
    public final k f33810j;

    /* renamed from: k  reason: collision with root package name */
    public final Uri f33811k;

    /* renamed from: l  reason: collision with root package name */
    public final g f33812l;

    /* renamed from: m  reason: collision with root package name */
    private final List<f> f33813m;

    public b(long j11, long j12, long j13, boolean z11, long j14, long j15, long j16, long j17, g gVar, n nVar, k kVar, Uri uri, List<f> list) {
        this.f33801a = j11;
        this.f33802b = j12;
        this.f33803c = j13;
        this.f33804d = z11;
        this.f33805e = j14;
        this.f33806f = j15;
        this.f33807g = j16;
        this.f33808h = j17;
        this.f33812l = gVar;
        this.f33809i = nVar;
        this.f33811k = uri;
        this.f33810j = kVar;
        this.f33813m = list == null ? Collections.emptyList() : list;
    }

    private static ArrayList<a> c(List<a> list, LinkedList<ej.c> linkedList) {
        ej.c poll = linkedList.poll();
        int i11 = poll.f25187a;
        ArrayList<a> arrayList = new ArrayList<>();
        do {
            int i12 = poll.f25188b;
            a aVar = list.get(i12);
            List<i> list2 = aVar.f33797c;
            ArrayList arrayList2 = new ArrayList();
            do {
                arrayList2.add(list2.get(poll.f25189c));
                poll = linkedList.poll();
                if (poll.f25187a != i11) {
                    break;
                }
            } while (poll.f25188b == i12);
            arrayList.add(new a(aVar.f33795a, aVar.f33796b, arrayList2, aVar.f33798d, aVar.f33799e, aVar.f33800f));
        } while (poll.f25187a == i11);
        linkedList.addFirst(poll);
        return arrayList;
    }

    @Override // ej.a
    /* renamed from: b */
    public final b a(List<ej.c> list) {
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new ej.c(-1, -1, -1));
        ArrayList arrayList = new ArrayList();
        long j11 = 0;
        int i11 = 0;
        while (true) {
            if (i11 >= e()) {
                break;
            }
            if (((ej.c) linkedList.peek()).f25187a != i11) {
                long f11 = f(i11);
                if (f11 != -9223372036854775807L) {
                    j11 += f11;
                }
            } else {
                f d11 = d(i11);
                arrayList.add(new f(d11.f33833a, d11.f33834b - j11, c(d11.f33835c, linkedList), d11.f33836d));
            }
            i11++;
        }
        long j12 = this.f33802b;
        return new b(this.f33801a, j12 != -9223372036854775807L ? j12 - j11 : -9223372036854775807L, this.f33803c, this.f33804d, this.f33805e, this.f33806f, this.f33807g, this.f33808h, this.f33812l, this.f33809i, this.f33810j, this.f33811k, arrayList);
    }

    public final f d(int i11) {
        return this.f33813m.get(i11);
    }

    public final int e() {
        return this.f33813m.size();
    }

    public final long f(int i11) {
        if (i11 == this.f33813m.size() - 1) {
            long j11 = this.f33802b;
            if (j11 == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return j11 - this.f33813m.get(i11).f33834b;
        }
        return this.f33813m.get(i11 + 1).f33834b - this.f33813m.get(i11).f33834b;
    }

    public final long g(int i11) {
        return ci.b.c(f(i11));
    }
}